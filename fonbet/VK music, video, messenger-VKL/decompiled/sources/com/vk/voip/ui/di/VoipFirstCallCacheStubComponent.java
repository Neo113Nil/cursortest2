package com.vk.voip.ui.di;

import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.fow0;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.vxl0;

/* compiled from: VoipFirstCallCacheStubComponent.kt */
/* loaded from: classes7.dex */
public final class VoipFirstCallCacheStubComponent implements VoipFirstCallCacheComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new vxl0(9));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipFirstCallCacheStubComponent.class, "voipFirstCallCache", "getVoipFirstCallCache()Lcom/vk/voip/ui/cancall/VoipFirstCallCache;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.voip.ui.di.VoipFirstCallCacheComponent
    public final fow0 x8() {
        qcy<Object> qcyVar = b[0];
        return (fow0) this.a.c();
    }
}
