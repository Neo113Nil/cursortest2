package com.vk.newsfeed.impl.postmodal.reactions.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nh0;
import xsna.nwy;
import xsna.qcy;
import xsna.tst;

/* compiled from: ModalPostReactionsComponent.kt */
/* loaded from: classes4.dex */
public final class ModalPostReactionsComponentImpl implements ModalPostReactionsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new nh0(23));

    /* compiled from: ModalPostReactionsComponent.kt */
    public static final class a implements b7m<ModalPostReactionsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ModalPostReactionsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ModalPostReactionsComponentImpl.class, "getModalPostReactionsInfoUseCase", "getGetModalPostReactionsInfoUseCase()Lcom/vk/newsfeed/impl/postmodal/reactions/domain/GetModalPostReactionsInfoUseCase;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.impl.postmodal.reactions.di.ModalPostReactionsComponent
    public final tst wd() {
        qcy<Object> qcyVar = b[0];
        return (tst) this.a.c();
    }
}
