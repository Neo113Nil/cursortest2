package com.vk.ads.optional.impl.di;

import com.vk.ads.externalsdkstat.api.di.AdsSdkStatTrackerComponent;
import com.vk.ads.optional.api.di.OptionalAdsFeatureComponent;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.googleump.api.di.GoogleUMPComponent;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.d5;
import xsna.fpf0;
import xsna.g8m;
import xsna.lt80;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: OptionalAdsFeatureComponentImpl.kt */
/* loaded from: classes14.dex */
public final class OptionalAdsFeatureComponentImpl implements OptionalAdsFeatureComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final ExecutorService a;
    public final GoogleUMPComponent b;
    public final AuthBridgeComponent c;
    public final nwy d;

    /* compiled from: OptionalAdsFeatureComponentImpl.kt */
    public static final class a implements c8m<OptionalAdsFeatureComponent, pwj0> {
        public final ExecutorService a;

        public a(ExecutorService executorService) {
            this.a = executorService;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new OptionalAdsFeatureComponentImpl(this.a, (GoogleUMPComponent) g8mVar.a(fpf0.a(GoogleUMPComponent.class)), (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)), (AdsSdkStatTrackerComponent) g8mVar.a(fpf0.a(AdsSdkStatTrackerComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(OptionalAdsFeatureComponentImpl.class, "optionalAdsFeature", "getOptionalAdsFeature()Lcom/vk/ads/optional/api/OptionalAdsFeature;", 0);
        fpf0.a.getClass();
        e = new qcy[]{propertyReference1Impl};
    }

    public OptionalAdsFeatureComponentImpl(ExecutorService executorService, GoogleUMPComponent googleUMPComponent, AuthBridgeComponent authBridgeComponent, AdsSdkStatTrackerComponent adsSdkStatTrackerComponent) {
        this.a = executorService;
        this.b = googleUMPComponent;
        this.c = authBridgeComponent;
        this.d = new nwy(new d5(16, adsSdkStatTrackerComponent, this));
    }

    @Override // com.vk.ads.optional.api.di.OptionalAdsFeatureComponent
    public final lt80 Q8() {
        qcy<Object> qcyVar = e[0];
        return (lt80) this.d.c();
    }
}
