package com.vk.metrics.performance.appstart;

import com.vk.metrics.performance.appstart.IdleStateHandler;
import xsna.p45;

/* compiled from: IdleStateHandler.kt */
/* loaded from: classes.dex */
public final class d implements IdleStateHandler.AppStartListener {
    public final /* synthetic */ p45 a;

    public d(p45 p45Var) {
        this.a = p45Var;
    }

    @Override // com.vk.metrics.performance.appstart.IdleStateHandler.AppStartListener
    public final void a(IdleStateHandler.AppStartListener.StartType startType) {
        this.a.invoke(startType);
    }
}
