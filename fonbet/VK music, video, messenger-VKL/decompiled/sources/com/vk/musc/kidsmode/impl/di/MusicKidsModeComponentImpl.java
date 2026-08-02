package com.vk.musc.kidsmode.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.movika.sdk.base.logic.interactor.l;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.lk;
import xsna.lo10;
import xsna.miy;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.wf40;
import xsna.xl40;

/* compiled from: MusicKidsModeComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MusicKidsModeComponentImpl implements MusicKidsModeComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final AuthBridgeComponent a;
    public final MultiAccountComponent b;
    public final nwy c = new nwy(new wf40(this, 1));
    public final nwy d = new nwy(new lo10(this, 4));
    public final nwy e;

    /* compiled from: MusicKidsModeComponentImpl.kt */
    public static final class a implements c8m<MusicKidsModeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MusicKidsModeComponentImpl((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)), (MultiAccountComponent) g8mVar.a(fpf0.a(MultiAccountComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicKidsModeComponentImpl.class, "kidsModeRepository", "getKidsModeRepository()Lcom/vk/musc/kidsmode/impl/MusicKidsModeRepository;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, MusicKidsModeComponentImpl.class, "manager", "getManager()Lcom/vk/musc/kidsmode/api/MusicKidsModeManager;", hpf0Var), ep.a(0, MusicKidsModeComponentImpl.class, "router", "getRouter()Lcom/vk/musc/kidsmode/api/MusicKidsModeRouter;", hpf0Var), ep.a(0, MusicKidsModeComponentImpl.class, "kidsModeRestrictionRenderer", "getKidsModeRestrictionRenderer()Lcom/vk/musc/kidsmode/impl/KidsModeRestrictionRendererImpl;", hpf0Var)};
    }

    public MusicKidsModeComponentImpl(AuthBridgeComponent authBridgeComponent, MultiAccountComponent multiAccountComponent) {
        this.a = authBridgeComponent;
        this.b = multiAccountComponent;
        new nwy(new lk(27));
        this.e = new nwy(new l(27));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.musc.kidsmode.api.di.MusicKidsModeComponent
    public final KidsModeRestrictionRenderer T9() {
        qcy<Object> qcyVar = f[3];
        return (miy) this.e.c();
    }

    @Override // com.vk.musc.kidsmode.api.di.MusicKidsModeComponent
    public final xl40 n() {
        qcy<Object> qcyVar = f[1];
        return (xl40) this.d.c();
    }
}
