package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.d3;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements io.sentry.x0 {

    /* renamed from: g, reason: collision with root package name */
    public final ILogger f15630g;

    /* renamed from: a, reason: collision with root package name */
    public long f15624a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f15625b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f15626c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f15627d = 1;

    /* renamed from: e, reason: collision with root package name */
    public double f15628e = 1.0E9d / 1;

    /* renamed from: f, reason: collision with root package name */
    public final File f15629f = new File("/proc/self/stat");

    /* renamed from: h, reason: collision with root package name */
    public boolean f15631h = false;

    /* renamed from: i, reason: collision with root package name */
    public final Pattern f15632i = Pattern.compile("[\n\t\r ]");

    public i(ILogger iLogger) {
        y4.a.C(iLogger, "Logger is required.");
        this.f15630g = iLogger;
    }

    @Override // io.sentry.x0
    public final void a(d3 d3Var) {
        if (this.f15631h) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = elapsedRealtimeNanos - this.f15624a;
            this.f15624a = elapsedRealtimeNanos;
            long b10 = b();
            long j6 = b10 - this.f15625b;
            this.f15625b = b10;
            d3Var.f16302a = Double.valueOf(((j6 / j) / this.f15627d) * 100.0d);
        }
    }

    public final long b() {
        String str;
        ILogger iLogger = this.f15630g;
        try {
            str = io.sentry.config.a.w(this.f15629f);
        } catch (IOException e7) {
            this.f15631h = false;
            iLogger.e(b5.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e7);
            str = null;
        }
        if (str != null) {
            String[] split = this.f15632i.split(str.trim());
            try {
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[14]);
                return (long) ((parseLong + parseLong2 + Long.parseLong(split[15]) + Long.parseLong(split[16])) * this.f15628e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e9) {
                iLogger.e(b5.ERROR, "Error parsing /proc/self/stat file.", e9);
            }
        }
        return 0L;
    }

    @Override // io.sentry.x0
    public final void c() {
        this.f15631h = true;
        this.f15626c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f15627d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f15628e = 1.0E9d / this.f15626c;
        this.f15625b = b();
    }
}
