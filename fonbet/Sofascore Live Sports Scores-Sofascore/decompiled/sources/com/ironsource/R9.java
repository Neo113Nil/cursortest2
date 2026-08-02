package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class R9 extends HandlerThread {

    @Nullable
    private Handler a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R9(@NotNull String str) {
        super(str);
        str.getClass();
    }

    public final void a(@NotNull Runnable runnable) {
        runnable.getClass();
        a(this, runnable, 0L, 2, null);
    }

    public final void b(@NotNull Runnable runnable) {
        runnable.getClass();
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public static /* synthetic */ void a(R9 r9, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        r9.a(runnable, j);
    }

    public final void a(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        Handler handler = this.a;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    public final void a() {
        this.a = new Handler(getLooper());
    }
}
