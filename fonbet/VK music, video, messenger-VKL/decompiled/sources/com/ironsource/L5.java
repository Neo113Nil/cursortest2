package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;

/* loaded from: classes13.dex */
final class L5 implements InterfaceC4374ig {
    @Override // com.ironsource.InterfaceC4374ig
    public void a(Runnable runnable) {
        IronSourceThreadManager.INSTANCE.getLevelPlayThread().submit(runnable);
    }

    @Override // com.ironsource.InterfaceC4374ig
    public boolean a() {
        return IronSourceThreadManager.INSTANCE.getLevelPlayThread().a();
    }
}
