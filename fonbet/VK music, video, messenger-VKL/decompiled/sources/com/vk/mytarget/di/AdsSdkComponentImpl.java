package com.vk.mytarget.di;

import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.mytarget.AdsSdkComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.ca;
import xsna.d2;
import xsna.e7m;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.k11;
import xsna.msy;
import xsna.mv0;
import xsna.n11;
import xsna.nwy;
import xsna.px0;
import xsna.qcy;
import xsna.r5g0;
import xsna.w40;

/* compiled from: AdsSdkComponentImpl.kt */
/* loaded from: classes3.dex */
public final class AdsSdkComponentImpl implements AdsSdkComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final nwy a;
    public final ewy b = new ewy(new ca(this, 2));
    public final nwy c = new nwy(new px0(this, 1));
    public final nwy d = new nwy(new d2(2));

    /* compiled from: AdsSdkComponentImpl.kt */
    public static final class a implements b7m<AdsSdkComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new AdsSdkComponentImpl(msy.a(LazyThreadSafetyMode.NONE, new k11(e7mVar, 0)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AdsSdkComponentImpl.class, "adPixelStatsComponent", "getAdPixelStatsComponent()Lcom/vk/ads/stats/api/di/AdPixelStatsComponent;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, AdsSdkComponentImpl.class, "adsSdkRouter", "getAdsSdkRouter()Lcom/vk/mytarget/AdsSdkRouter;", hpf0Var), ep.a(0, AdsSdkComponentImpl.class, "adsChoicesAnalytics", "getAdsChoicesAnalytics()Lcom/vk/mytarget/AdsChoicesAnalytics;", hpf0Var), ep.a(0, AdsSdkComponentImpl.class, "reportRepository", "getReportRepository()Lcom/vk/mytarget/ReportRepository;", hpf0Var)};
    }

    public AdsSdkComponentImpl(Lazy<? extends AdPixelStatsComponent> lazy) {
        this.a = new nwy(new w40(lazy, 2));
    }

    @Override // com.vk.mytarget.AdsSdkComponent
    public final r5g0 A1() {
        qcy<Object> qcyVar = e[3];
        return (r5g0) this.d.c();
    }

    @Override // com.vk.mytarget.AdsSdkComponent
    public final n11 P5() {
        qcy<Object> qcyVar = e[1];
        return (n11) this.b.c();
    }

    @Override // com.vk.mytarget.AdsSdkComponent
    public final mv0 yd() {
        qcy<Object> qcyVar = e[2];
        return (mv0) this.c.c();
    }
}
