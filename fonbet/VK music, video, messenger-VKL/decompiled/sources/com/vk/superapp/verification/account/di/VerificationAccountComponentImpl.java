package com.vk.superapp.verification.account.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.ltb0;
import xsna.nyv0;
import xsna.qcy;

/* compiled from: VerificationAccountComponentImpl.kt */
/* loaded from: classes6.dex */
public final class VerificationAccountComponentImpl implements VerificationAccountComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new ltb0(9));

    /* compiled from: VerificationAccountComponentImpl.kt */
    public static final class a implements b7m<VerificationAccountComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VerificationAccountComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VerificationAccountComponentImpl.class, "vkVerificationAccountFragmentFactory", "getVkVerificationAccountFragmentFactory()Lcom/vk/superapp/verification/account/VkVerificationAccountFragmentFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.verification.account.di.VerificationAccountComponent
    public final nyv0 Cc() {
        qcy<Object> qcyVar = b[0];
        return (nyv0) this.a.c();
    }
}
