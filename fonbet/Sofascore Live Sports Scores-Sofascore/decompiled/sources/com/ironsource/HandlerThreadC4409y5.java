package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.y5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class HandlerThreadC4409y5 extends HandlerThread {

    @Nullable
    private Handler a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC4409y5(@NotNull String str) {
        super(str);
        str.getClass();
    }

    public final void a() {
        this.a = new Handler(getLooper());
    }

    public final void a(@NotNull Runnable runnable) {
        runnable.getClass();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
