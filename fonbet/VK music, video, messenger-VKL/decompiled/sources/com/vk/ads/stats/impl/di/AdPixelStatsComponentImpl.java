package com.vk.ads.stats.impl.di;

import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.hqa0;
import xsna.nwy;
import xsna.ob0;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: AdPixelStatsComponentImpl.kt */
/* loaded from: classes14.dex */
public final class AdPixelStatsComponentImpl implements AdPixelStatsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new ob0(1));

    /* compiled from: AdPixelStatsComponentImpl.kt */
    public static final class a implements c8m<AdPixelStatsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AdPixelStatsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AdPixelStatsComponentImpl.class, "pixelStatsTracker", "getPixelStatsTracker()Lcom/vk/ads/stats/api/PixelStatsTracker;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.ads.stats.api.di.AdPixelStatsComponent
    public final hqa0 Ed() {
        qcy<Object> qcyVar = b[0];
        return (hqa0) this.a.c();
    }
}
