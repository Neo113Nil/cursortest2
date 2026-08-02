package io.sentry.android.core;

import android.util.Log;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;

/* loaded from: classes3.dex */
public final class B implements ILogger {

    /* renamed from: a, reason: collision with root package name */
    public final String f50672a;

    public B() {
        this("Sentry");
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
        Log.wtf(this.f50672a, str, th2);
    }

    @Override // io.sentry.ILogger
    public void c(EnumC4788n3 enumC4788n3, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(enumC4788n3), this.f50672a, str);
        } else {
            Log.println(e(enumC4788n3), this.f50672a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC4788n3 enumC4788n3) {
        return true;
    }

    public final int e(EnumC4788n3 enumC4788n3) {
        return 7;
    }

    public B(String str) {
        this.f50672a = str;
    }
}
