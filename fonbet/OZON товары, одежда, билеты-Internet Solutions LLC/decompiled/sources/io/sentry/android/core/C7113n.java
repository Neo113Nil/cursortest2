package io.sentry.android.core;

import android.util.Log;
import io.sentry.I2;
import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7113n implements ILogger {

    /* renamed from: io.sentry.android.core.n$a */
    /* loaded from: classes10.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67290a;

        static {
            int[] iArr = new int[I2.values().length];
            f67290a = iArr;
            try {
                iArr[I2.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67290a[I2.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67290a[I2.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67290a[I2.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67290a[I2.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // io.sentry.ILogger
    public final void a(@NotNull I2 i22, @NotNull String str, Throwable th2) {
        int i11 = a.f67290a[i22.ordinal()];
        if (i11 == 1) {
            Log.i("Sentry", str, th2);
            return;
        }
        if (i11 == 2) {
            Log.w("Sentry", str, th2);
            return;
        }
        if (i11 == 3) {
            Log.e("Sentry", str, th2);
        } else if (i11 != 4) {
            Log.d("Sentry", str, th2);
        } else {
            Log.wtf("Sentry", str, th2);
        }
    }

    @Override // io.sentry.ILogger
    public final void b(@NotNull I2 i22, Throwable th2, @NotNull String str, Object... objArr) {
        if (objArr.length == 0) {
            a(i22, str, th2);
        } else {
            a(i22, String.format(str, objArr), th2);
        }
    }

    @Override // io.sentry.ILogger
    public final void c(@NotNull I2 i22, @NotNull String str, Object... objArr) {
        int i11 = 5;
        if (objArr.length == 0) {
            int i12 = a.f67290a[i22.ordinal()];
            if (i12 == 1) {
                i11 = 4;
            } else if (i12 != 2) {
                i11 = i12 != 4 ? 3 : 7;
            }
            Log.println(i11, "Sentry", str);
            return;
        }
        int i13 = a.f67290a[i22.ordinal()];
        if (i13 == 1) {
            i11 = 4;
        } else if (i13 != 2) {
            i11 = i13 != 4 ? 3 : 7;
        }
        Log.println(i11, "Sentry", String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public final boolean d(I2 i22) {
        return true;
    }
}
