package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f51768a;

    public h(Looper looper) {
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f51768a = new Handler(looper);
    }

    public final Handler a() {
        return this.f51768a;
    }

    public final boolean b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return this.f51768a.post(runnable);
    }

    public final boolean c(Runnable runnable, long j10) {
        Handler handler = this.f51768a;
        if (runnable == null) {
            return false;
        }
        return handler.postDelayed(runnable, j10);
    }

    public final void d(Runnable runnable) {
        Handler handler = this.f51768a;
        if (runnable == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ h(Looper looper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(looper);
        if ((i10 & 1) != 0) {
            looper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper(...)");
        }
    }
}
