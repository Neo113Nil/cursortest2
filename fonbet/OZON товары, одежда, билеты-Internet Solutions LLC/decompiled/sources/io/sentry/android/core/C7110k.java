package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C7143f1;
import io.sentry.I2;
import io.sentry.ILogger;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7110k implements io.sentry.S {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ILogger f67279g;

    /* renamed from: a, reason: collision with root package name */
    private long f67273a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f67274b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f67275c = 1;

    /* renamed from: d, reason: collision with root package name */
    private long f67276d = 1;

    /* renamed from: e, reason: collision with root package name */
    private double f67277e = 1.0E9d / 1;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final File f67278f = new File("/proc/self/stat");

    /* renamed from: h, reason: collision with root package name */
    private boolean f67280h = false;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Pattern f67281i = Pattern.compile("[\n\t\r ]");

    public C7110k(@NotNull ILogger iLogger) {
        io.sentry.util.p.b(iLogger, "Logger is required.");
        this.f67279g = iLogger;
    }

    private long e() {
        String str;
        ILogger iLogger = this.f67279g;
        try {
            str = io.sentry.util.g.c(this.f67278f);
        } catch (IOException e11) {
            this.f67280h = false;
            iLogger.a(I2.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e11);
            str = null;
        }
        if (str != null) {
            String[] split = this.f67281i.split(str.trim());
            try {
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[14]);
                return (long) ((parseLong + parseLong2 + Long.parseLong(split[15]) + Long.parseLong(split[16])) * this.f67277e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e12) {
                iLogger.a(I2.ERROR, "Error parsing /proc/self/stat file.", e12);
            }
        }
        return 0L;
    }

    @Override // io.sentry.S
    public final void c() {
        this.f67280h = true;
        this.f67275c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f67276d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f67277e = 1.0E9d / this.f67275c;
        this.f67274b = e();
    }

    @Override // io.sentry.S
    public final void d(@NotNull C7143f1 c7143f1) {
        if (this.f67280h) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j11 = elapsedRealtimeNanos - this.f67273a;
            this.f67273a = elapsedRealtimeNanos;
            long e11 = e();
            long j12 = e11 - this.f67274b;
            this.f67274b = e11;
            c7143f1.e(Double.valueOf(((j12 / j11) / this.f67276d) * 100.0d));
        }
    }
}
