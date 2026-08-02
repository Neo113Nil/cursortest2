package com.vk.im.ui.di;

import com.vk.im.ui.max.MaxRedirectHandler;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.fpf0;
import xsna.ig;
import xsna.nwy;
import xsna.qcy;

/* compiled from: MaxUtilityStubComponent.kt */
/* loaded from: classes2.dex */
public final class MaxUtilityStubComponent implements MaxUtilityComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new ig(16));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MaxUtilityStubComponent.class, "redirectHandler", "getRedirectHandler()Lcom/vk/im/ui/max/MaxRedirectHandler;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.ui.di.MaxUtilityComponent
    public final MaxRedirectHandler j7() {
        qcy<Object> qcyVar = b[0];
        return (MaxRedirectHandler) this.a.c();
    }

    /* compiled from: MaxUtilityStubComponent.kt */
    public static final class a implements MaxRedirectHandler {
        @Override // com.vk.im.ui.max.MaxRedirectHandler
        public final boolean b() {
            return false;
        }

        @Override // com.vk.im.ui.max.MaxRedirectHandler
        public final boolean c() {
            return false;
        }

        @Override // com.vk.im.ui.max.MaxRedirectHandler
        public final void a(MaxRedirectHandler.Entrypoint entrypoint) {
        }
    }
}
