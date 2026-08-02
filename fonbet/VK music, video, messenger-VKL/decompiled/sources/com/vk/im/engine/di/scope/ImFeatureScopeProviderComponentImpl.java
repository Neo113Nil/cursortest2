package com.vk.im.engine.di.scope;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fn4;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.y3w;

/* compiled from: ImFeatureScopeProviderComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImFeatureScopeProviderComponentImpl implements ImFeatureScopeProviderComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new fn4(18));

    /* compiled from: ImFeatureScopeProviderComponentImpl.kt */
    public static final class a implements c8m<ImFeatureScopeProviderComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImFeatureScopeProviderComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImFeatureScopeProviderComponentImpl.class, IronSourceConstants.EVENTS_PROVIDER, "getProvider()Lcom/vk/im/engine/di/scope/ImFeatureScopeProvider;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent
    public final y3w getProvider() {
        qcy<Object> qcyVar = b[0];
        return (y3w) this.a.c();
    }
}
