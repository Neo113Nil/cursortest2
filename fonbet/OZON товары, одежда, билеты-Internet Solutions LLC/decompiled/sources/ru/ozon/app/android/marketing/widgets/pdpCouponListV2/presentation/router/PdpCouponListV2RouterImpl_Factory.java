package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.router;

import GZ.g;
import Jb.e;
import Pc.a;

/* loaded from: classes12.dex */
public final class PdpCouponListV2RouterImpl_Factory implements e<PdpCouponListV2RouterImpl> {
    private final a<g> screenRouterProvider;

    public PdpCouponListV2RouterImpl_Factory(a<g> aVar) {
        this.screenRouterProvider = aVar;
    }

    public static PdpCouponListV2RouterImpl_Factory create(a<g> aVar) {
        return new PdpCouponListV2RouterImpl_Factory(aVar);
    }

    public static PdpCouponListV2RouterImpl newInstance(g gVar) {
        return new PdpCouponListV2RouterImpl(gVar);
    }

    @Override // Pc.a
    public PdpCouponListV2RouterImpl get() {
        return newInstance(this.screenRouterProvider.get());
    }
}
