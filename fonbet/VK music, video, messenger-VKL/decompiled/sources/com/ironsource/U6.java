package com.ironsource;

import android.os.Handler;

/* loaded from: classes13.dex */
final class U6 implements InterfaceC4374ig {
    private final Handler a;

    public U6(Handler handler) {
        this.a = handler;
    }

    @Override // com.ironsource.InterfaceC4374ig
    public void a(Runnable runnable) {
        this.a.post(runnable);
    }

    @Override // com.ironsource.InterfaceC4374ig
    public boolean a() {
        return Thread.currentThread() == this.a.getLooper().getThread();
    }
}
