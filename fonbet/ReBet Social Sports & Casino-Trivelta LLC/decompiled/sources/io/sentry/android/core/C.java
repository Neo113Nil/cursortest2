package io.sentry.android.core;

import android.util.Log;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;

/* loaded from: classes3.dex */
public final class C implements ILogger {

    /* renamed from: a, reason: collision with root package name */
    public final String f50675a;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$SentryLevel;

        static {
            int[] iArr = new int[EnumC4788n3.values().length];
            $SwitchMap$io$sentry$SentryLevel = iArr;
            try {
                iArr[EnumC4788n3.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[EnumC4788n3.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[EnumC4788n3.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[EnumC4788n3.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[EnumC4788n3.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C() {
        this("Sentry");
    }

    private int e(EnumC4788n3 enumC4788n3) {
        int i10 = a.$SwitchMap$io$sentry$SentryLevel[enumC4788n3.ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 != 2) {
            return i10 != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override // io.sentry.ILogger
    public void a(EnumC4788n3 enumC4788n3, Throwable th2, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            b(enumC4788n3, str, th2);
        } else {
            b(enumC4788n3, String.format(str, objArr), th2);
        }
    }

    @Override // io.sentry.ILogger
    public void b(EnumC4788n3 enumC4788n3, String str, Throwable th2) {
        int i10 = a.$SwitchMap$io$sentry$SentryLevel[enumC4788n3.ordinal()];
        if (i10 == 1) {
            Log.i(this.f50675a, str, th2);
            return;
        }
        if (i10 == 2) {
            Log.w(this.f50675a, str, th2);
        } else if (i10 == 3) {
            Log.e(this.f50675a, str, th2);
        } else {
            if (i10 != 4) {
                return;
            }
            Log.wtf(this.f50675a, str, th2);
        }
    }

    @Override // io.sentry.ILogger
    public void c(EnumC4788n3 enumC4788n3, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(enumC4788n3), this.f50675a, str);
        } else {
            Log.println(e(enumC4788n3), this.f50675a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC4788n3 enumC4788n3) {
        return true;
    }

    public C(String str) {
        this.f50675a = str;
    }
}
