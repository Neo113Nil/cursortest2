package com.vk.voip.ui.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fow0;
import xsna.fpf0;
import xsna.g8m;
import xsna.kb3;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: VoipFirstCallCacheImplComponent.kt */
/* loaded from: classes11.dex */
public final class VoipFirstCallCacheImplComponent implements VoipFirstCallCacheComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new kb3(17));

    /* compiled from: VoipFirstCallCacheImplComponent.kt */
    public static final class a implements c8m<VoipFirstCallCacheComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VoipFirstCallCacheImplComponent();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipFirstCallCacheImplComponent.class, "voipFirstCallCache", "getVoipFirstCallCache()Lcom/vk/voip/ui/cancall/VoipFirstCallCache;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.voip.ui.di.VoipFirstCallCacheComponent
    public final fow0 x8() {
        qcy<Object> qcyVar = b[0];
        return (fow0) this.a.c();
    }
}
