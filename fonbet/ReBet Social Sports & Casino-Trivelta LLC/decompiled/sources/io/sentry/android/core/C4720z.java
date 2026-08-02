package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C4860w1;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4662a0;
import io.sentry.util.AbstractC4851i;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* renamed from: io.sentry.android.core.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4720z implements InterfaceC4662a0 {

    /* renamed from: h, reason: collision with root package name */
    public final ILogger f51382h;

    /* renamed from: a, reason: collision with root package name */
    public long f51375a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f51376b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f51377c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f51378d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final long f51379e = 1000000000;

    /* renamed from: f, reason: collision with root package name */
    public double f51380f = 1.0E9d / 1;

    /* renamed from: g, reason: collision with root package name */
    public final File f51381g = new File("/proc/self/stat");

    /* renamed from: i, reason: collision with root package name */
    public boolean f51383i = false;

    /* renamed from: j, reason: collision with root package name */
    public final Pattern f51384j = Pattern.compile("[\n\t\r ]");

    public C4720z(ILogger iLogger) {
        this.f51382h = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    @Override // io.sentry.InterfaceC4662a0
    public void c() {
        this.f51383i = true;
        this.f51377c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f51378d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f51380f = 1.0E9d / this.f51377c;
        this.f51376b = e();
    }

    @Override // io.sentry.InterfaceC4662a0
    public void d(C4860w1 c4860w1) {
        if (this.f51383i) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j10 = elapsedRealtimeNanos - this.f51375a;
            this.f51375a = elapsedRealtimeNanos;
            long e10 = e();
            long j11 = e10 - this.f51376b;
            this.f51376b = e10;
            c4860w1.e(Double.valueOf(((j11 / j10) / this.f51378d) * 100.0d));
        }
    }

    public final long e() {
        String str;
        try {
            str = AbstractC4851i.c(this.f51381g);
        } catch (IOException e10) {
            this.f51383i = false;
            this.f51382h.b(EnumC4788n3.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e10);
            str = null;
        }
        if (str != null) {
            String[] split = this.f51384j.split(str.trim());
            try {
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[14]);
                return (long) ((parseLong + parseLong2 + Long.parseLong(split[15]) + Long.parseLong(split[16])) * this.f51380f);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e11) {
                this.f51382h.b(EnumC4788n3.ERROR, "Error parsing /proc/self/stat file.", e11);
            }
        }
        return 0L;
    }
}
