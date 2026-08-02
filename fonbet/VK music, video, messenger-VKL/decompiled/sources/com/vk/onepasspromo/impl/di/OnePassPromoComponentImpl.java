package com.vk.onepasspromo.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.onepasspromo.api.OnePassPromoComponent;
import xsna.b7m;
import xsna.e7m;

/* compiled from: OnePassPromoComponentImpl.kt */
/* loaded from: classes4.dex */
public final class OnePassPromoComponentImpl implements OnePassPromoComponent {

    /* compiled from: OnePassPromoComponentImpl.kt */
    public static final class a implements b7m<OnePassPromoComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new OnePassPromoComponentImpl();
        }
    }

    @Override // com.vk.onepasspromo.api.OnePassPromoComponent
    public final void D2() {
        com.vk.onepasspromo.impl.a.c = true;
    }
}
