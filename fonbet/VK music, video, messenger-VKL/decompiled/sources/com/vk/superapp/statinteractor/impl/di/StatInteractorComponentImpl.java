package com.vk.superapp.statinteractor.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.statinteractor.api.di.StatInteractorComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.ihg;
import xsna.mxi0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: StatInteractorComponentImpl.kt */
/* loaded from: classes11.dex */
public final class StatInteractorComponentImpl implements StatInteractorComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new ihg(9));

    /* compiled from: StatInteractorComponentImpl.kt */
    public static final class a implements c8m<StatInteractorComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StatInteractorComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StatInteractorComponentImpl.class, "statInteractor", "getStatInteractor()Lcom/vk/superapp/statinteractor/api/domain/interactor/SessionStatInteractor;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.statinteractor.api.di.StatInteractorComponent
    public final mxi0 ie() {
        qcy<Object> qcyVar = b[0];
        return (mxi0) this.a.c();
    }
}
