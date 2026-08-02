package com.vk.protect.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a8e0;
import xsna.ac8;
import xsna.bpn0;
import xsna.c8m;
import xsna.e8e0;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g58;
import xsna.g8m;
import xsna.gia;
import xsna.hia;
import xsna.hpf0;
import xsna.i8e0;
import xsna.j8e0;
import xsna.n03;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.r03;
import xsna.ub8;
import xsna.v7e0;

/* compiled from: ProtectAppComponentImpl.kt */
/* loaded from: classes.dex */
public final class ProtectAppComponentImpl implements ProtectAppComponent {
    public static final /* synthetic */ qcy<Object>[] i;
    public final AppContextDiComponent a;
    public final bpn0 b;
    public final nwy c = new nwy(new ub8(this, 4));
    public final nwy d = new nwy(new n03(this, 4));
    public final nwy e = new nwy(new g58(6));
    public final ewy f = new ewy(new gia(this, 2));
    public final ewy g = new ewy(new hia(this, 3));
    public final ewy h = new ewy(new r03(8));

    /* compiled from: ProtectAppComponentImpl.kt */
    public static final class a implements c8m<ProtectAppComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ProtectAppComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)), new bpn0(new ac8(g8mVar, 2)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ProtectAppComponentImpl.class, "hintsManager", "getHintsManager()Lkotlin/Lazy;", 0);
        hpf0 hpf0Var = fpf0.a;
        i = new qcy[]{propertyReference1Impl, fp.c(0, ProtectAppComponentImpl.class, "protectHintRepositoryImpl", "getProtectHintRepositoryImpl()Lcom/vk/protect/data/ProtectUserInfoRepositoryImpl;", hpf0Var), ep.a(0, ProtectAppComponentImpl.class, "protectApi", "getProtectApi()Lcom/vk/protect/api/ProtectApi;", hpf0Var), ep.a(0, ProtectAppComponentImpl.class, "protectHintContractRouter", "getProtectHintContractRouter()Lcom/vk/protect/presentation/hints/ProtectHintContract$Router;", hpf0Var), ep.a(0, ProtectAppComponentImpl.class, "protectHintDialogFactory", "getProtectHintDialogFactory()Lcom/vk/protect/presentation/hints/ProtectHintDialogFactory;", hpf0Var), ep.a(0, ProtectAppComponentImpl.class, "protectHintAnalytics", "getProtectHintAnalytics()Lcom/vk/protect/presentation/hints/ProtectHintAnalytics;", hpf0Var)};
    }

    public ProtectAppComponentImpl(AppContextDiComponent appContextDiComponent, bpn0 bpn0Var) {
        this.a = appContextDiComponent;
        this.b = bpn0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.protect.di.ProtectAppComponent
    public final j8e0 I9() {
        qcy<Object> qcyVar = i[1];
        return (i8e0) this.d.c();
    }

    @Override // com.vk.protect.di.ProtectAppComponent
    public final a8e0 N6() {
        qcy<Object> qcyVar = i[3];
        return (a8e0) this.f.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.protect.di.ProtectAppComponent
    public final e8e0 u8() {
        qcy<Object> qcyVar = i[1];
        return (i8e0) this.d.c();
    }

    @Override // com.vk.protect.di.ProtectAppComponent
    public final v7e0 vb() {
        qcy<Object> qcyVar = i[2];
        return (v7e0) this.e.c();
    }
}
