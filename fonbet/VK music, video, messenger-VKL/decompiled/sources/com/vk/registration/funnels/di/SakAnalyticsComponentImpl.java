package com.vk.registration.funnels.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.analytics.MaxMessengerAnalytics;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b55;
import xsna.c8m;
import xsna.d2a0;
import xsna.ej80;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.jbw;
import xsna.l67;
import xsna.mb8;
import xsna.nb8;
import xsna.nbp;
import xsna.p5m;
import xsna.pwj0;
import xsna.qcy;
import xsna.tdk;

/* compiled from: SakAnalyticsComponentImpl.kt */
/* loaded from: classes.dex */
public final class SakAnalyticsComponentImpl implements SakAnalyticsComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final ewy a = new ewy(new l67(9));
    public final ewy b = new ewy(new jbw(8));
    public final ewy c = new ewy(new mb8(8));
    public final ewy d;
    public final ewy e;

    /* compiled from: SakAnalyticsComponentImpl.kt */
    public static final class a implements c8m<SakAnalyticsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SakAnalyticsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SakAnalyticsComponentImpl.class, "onePassPromoAnalytics", "getOnePassPromoAnalytics()Lcom/vk/superapp/analytics/OnePassPromoAnalytics;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, SakAnalyticsComponentImpl.class, "maxMessengerAnalytics", "getMaxMessengerAnalytics()Lcom/vk/superapp/analytics/MaxMessengerAnalytics;", hpf0Var), ep.a(0, SakAnalyticsComponentImpl.class, "credentialsAnalytics", "getCredentialsAnalytics()Lcom/vk/superapp/analytics/CredentialsAnalytics;", hpf0Var), ep.a(0, SakAnalyticsComponentImpl.class, "mailAuthFlowAnalytics", "getMailAuthFlowAnalytics()Lcom/vk/superapp/analytics/MailAuthFlowAnalytics;", hpf0Var), ep.a(0, SakAnalyticsComponentImpl.class, "phoneActualizationAnalytics", "getPhoneActualizationAnalytics()Lcom/vk/superapp/analytics/PhoneActualizationAnalytics;", hpf0Var), ep.a(0, SakAnalyticsComponentImpl.class, "emailActualizationAnalytics", "getEmailActualizationAnalytics()Lcom/vk/superapp/analytics/EmailActualizationAnalytics;", hpf0Var)};
    }

    public SakAnalyticsComponentImpl() {
        new ewy(new nb8(14));
        this.d = new ewy(new p5m(6));
        this.e = new ewy(new b55(6));
    }

    @Override // com.vk.superapp.analytics.di.SakAnalyticsComponent
    public final tdk Oe() {
        qcy<Object> qcyVar = f[2];
        return (tdk) this.c.c();
    }

    @Override // com.vk.superapp.analytics.di.SakAnalyticsComponent
    public final MaxMessengerAnalytics Q9() {
        qcy<Object> qcyVar = f[1];
        return (MaxMessengerAnalytics) this.b.c();
    }

    @Override // com.vk.superapp.analytics.di.SakAnalyticsComponent
    public final ej80 Qc() {
        qcy<Object> qcyVar = f[0];
        return (ej80) this.a.c();
    }

    @Override // com.vk.superapp.analytics.di.SakAnalyticsComponent
    public final d2a0 kd() {
        qcy<Object> qcyVar = f[4];
        return (d2a0) this.d.c();
    }

    @Override // com.vk.superapp.analytics.di.SakAnalyticsComponent
    public final nbp y5() {
        qcy<Object> qcyVar = f[5];
        return (nbp) this.e.c();
    }
}
