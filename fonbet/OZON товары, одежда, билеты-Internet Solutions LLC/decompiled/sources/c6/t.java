package c6;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f56588e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f56589f;

    /* renamed from: g, reason: collision with root package name */
    private static final File f56590g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile t f56591h;

    /* renamed from: b, reason: collision with root package name */
    private int f56593b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f56594c = true;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f56595d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final int f56592a = 20000;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f56588e = i11 < 29;
        f56589f = i11 >= 28;
        f56590g = new File("/proc/self/fd");
    }

    t() {
    }

    public static t a() {
        if (f56591h == null) {
            synchronized (t.class) {
                try {
                    if (f56591h == null) {
                        f56591h = new t();
                    }
                } finally {
                }
            }
        }
        return f56591h;
    }

    private int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return CounterView.COUNTER_MAX_DEFAULT;
                }
            }
        }
        return this.f56592a;
    }

    public final boolean c(int i11, int i12, boolean z11, boolean z12) {
        boolean z13;
        if (z11) {
            if (f56589f) {
                if (!f56588e || this.f56595d.get()) {
                    if (z12) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i11 >= 0 && i12 >= 0) {
                        synchronized (this) {
                            try {
                                int i13 = this.f56593b + 1;
                                this.f56593b = i13;
                                if (i13 >= 50) {
                                    this.f56593b = 0;
                                    int length = f56590g.list().length;
                                    long b11 = b();
                                    boolean z14 = ((long) length) < b11;
                                    this.f56594c = z14;
                                    if (!z14 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + b11);
                                    }
                                }
                                z13 = this.f56594c;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (z13) {
                            return true;
                        }
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                            return false;
                        }
                    } else if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
                    }
                } else if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }

    public final void d() {
        p6.l.a();
        this.f56595d.set(true);
    }
}
