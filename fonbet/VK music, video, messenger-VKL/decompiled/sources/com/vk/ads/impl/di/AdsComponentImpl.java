package com.vk.ads.impl.di;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.api.di.AdsComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.subscription.api.di.SubscriptionComponent;
import defpackage.i;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a0r0;
import xsna.a0y;
import xsna.b7m;
import xsna.bpn0;
import xsna.dlv;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hg30;
import xsna.hpf0;
import xsna.jg30;
import xsna.lg30;
import xsna.msy;
import xsna.ng30;
import xsna.nwy;
import xsna.qcy;
import xsna.qv0;
import xsna.rdi;
import xsna.rg30;
import xsna.tg30;
import xsna.tyy;
import xsna.uv0;
import xsna.vi0;
import xsna.vv0;
import xsna.vzt0;
import xsna.wv0;
import xsna.wvn;
import xsna.xt0;
import xsna.xv0;
import xsna.xy0;

/* compiled from: AdsComponentImpl.kt */
/* loaded from: classes14.dex */
public final class AdsComponentImpl implements AdsComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new uv0(0));
    public final nwy b = new nwy(new vv0(0));
    public final nwy c = new nwy(new i(this, 4));
    public final nwy d = new nwy(new wv0(0));
    public final nwy e = new nwy(new xv0(0));
    public final nwy f = new nwy(new vi0(1));

    /* compiled from: AdsComponentImpl.kt */
    public static final class a implements b7m<AdsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new AdsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AdsComponentImpl.class, "adsAnalytics", "getAdsAnalytics()Lcom/vk/ads/api/analytics/AdsAnalytics;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, AdsComponentImpl.class, "mrcStatsTracker", "getMrcStatsTracker()Lcom/vk/ads/api/mrc/MrcStatsTracker;", hpf0Var), ep.a(0, AdsComponentImpl.class, "mrcRepository", "getMrcRepository()Lcom/vk/ads/api/mrc/MrcRepository;", hpf0Var), ep.a(0, AdsComponentImpl.class, "dominantColorRepository", "getDominantColorRepository()Lcom/vk/ads/api/DominantColorRepository;", hpf0Var), ep.a(0, AdsComponentImpl.class, "leadFormRepository", "getLeadFormRepository()Lcom/vk/ads/api/leadform/LeadFormRepository;", hpf0Var)};
    }

    public final xt0 Df() {
        qcy<Object> qcyVar = g[0];
        return (xt0) this.b.c();
    }

    @Override // com.vk.ads.api.di.AdsComponent
    public final rdi Ve() {
        return new rdi();
    }

    @Override // com.vk.ads.api.di.AdsComponent
    public final a0y Y0() {
        return new a0y();
    }

    @Override // com.vk.ads.api.di.AdsComponent
    public final tyy ea() {
        qcy<Object> qcyVar = g[4];
        return (tyy) this.f.c();
    }

    @Override // com.vk.ads.api.di.AdsComponent
    public final a0r0 ec(SubscriptionComponent subscriptionComponent) {
        return new a0r0(subscriptionComponent);
    }

    @Override // com.vk.ads.api.di.AdsComponent
    public final qv0 gf() {
        return new qv0(Df());
    }

    @Override // com.vk.ads.api.di.AdsComponent
    public final wvn h9() {
        qcy<Object> qcyVar = g[3];
        return (wvn) this.e.c();
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.ads.api.di.AdsComponent
    public final jg30 j2(RecyclerView recyclerView, String str, dlv dlvVar) {
        if (!str.equals("news")) {
            return null;
        }
        ((vzt0) this.a.getValue()).getClass();
        qcy<Object>[] qcyVarArr = g;
        qcy<Object> qcyVar = qcyVarArr[2];
        nwy nwyVar = this.d;
        jg30 jg30Var = new jg30(recyclerView, null, (lg30) nwyVar.c(), dlvVar);
        xt0 Df = Df();
        qcy<Object> qcyVar2 = qcyVarArr[2];
        hg30 hg30Var = new hg30(Df, (lg30) nwyVar.c());
        tg30 tg30Var = new tg30(hg30Var, Df());
        int scrollState = recyclerView.getScrollState();
        bpn0 bpn0Var = jg30Var.h;
        if (scrollState == 0) {
            jg30Var.d.add(tg30Var);
        } else {
            ((List) bpn0Var.getValue()).add(new xy0(14, jg30Var, tg30Var));
        }
        rg30 rg30Var = new rg30(hg30Var);
        if (recyclerView.getScrollState() == 0) {
            jg30Var.d.add(rg30Var);
            return jg30Var;
        }
        ((List) bpn0Var.getValue()).add(new xy0(14, jg30Var, rg30Var));
        return jg30Var;
    }

    @Override // com.vk.ads.api.di.AdsComponent
    public final ng30 j6() {
        qcy<Object> qcyVar = g[1];
        return (ng30) this.c.c();
    }
}
