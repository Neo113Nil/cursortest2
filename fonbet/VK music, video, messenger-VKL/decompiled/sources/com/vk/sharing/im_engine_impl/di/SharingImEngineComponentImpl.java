package com.vk.sharing.im_engine_impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImCmdDirectExecutorComponent;
import com.vk.im.engine.di.ImCmdRxExecutorComponent;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverComponent;
import com.vk.sharing.api.di.SharingComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a84;
import xsna.b6f0;
import xsna.bbj0;
import xsna.bja0;
import xsna.c8m;
import xsna.d70;
import xsna.daz;
import xsna.dcj0;
import xsna.ep;
import xsna.ewy;
import xsna.fcj0;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hdm;
import xsna.hpf0;
import xsna.jo60;
import xsna.ko60;
import xsna.l9;
import xsna.ml7;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.u210;

/* compiled from: SharingImEngineComponentImpl.kt */
/* loaded from: classes5.dex */
public final class SharingImEngineComponentImpl implements SharingComponent {
    public static final /* synthetic */ qcy<Object>[] m;
    public final AuthBridgeComponent a;
    public final ImConfigurationComponent b;
    public final ImRxEventObserverComponent c;
    public final ImCmdRxExecutorComponent d;
    public final ImCmdDirectExecutorComponent e;
    public final nwy f = new nwy(new daz(18));
    public final nwy g = new nwy(new jo60(8));
    public final nwy h = new nwy(new b6f0(this, 6));
    public final nwy i = new nwy(new ml7(27));
    public final ewy j = new ewy(new u210(this, 26));
    public final ewy k = new ewy(new ko60(5));
    public final ewy l = new ewy(new l9(29));

    /* compiled from: SharingImEngineComponentImpl.kt */
    public static final class a implements c8m<SharingComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SharingImEngineComponentImpl((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)), (ImConfigurationComponent) g8mVar.a(fpf0.a(ImConfigurationComponent.class)), (ImRxEventObserverComponent) g8mVar.a(fpf0.a(ImRxEventObserverComponent.class)), (ImCmdRxExecutorComponent) g8mVar.a(fpf0.a(ImCmdRxExecutorComponent.class)), (ImCmdDirectExecutorComponent) g8mVar.a(fpf0.a(ImCmdDirectExecutorComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SharingImEngineComponentImpl.class, "attachments", "getAttachments()Lcom/vk/sharing/api/Attachments;", 0);
        hpf0 hpf0Var = fpf0.a;
        m = new qcy[]{propertyReference1Impl, fp.c(0, SharingImEngineComponentImpl.class, "actions", "getActions()Lcom/vk/sharing/api/Actions;", hpf0Var), ep.a(0, SharingImEngineComponentImpl.class, "sharing", "getSharing()Lcom/vk/sharing/api/Sharing;", hpf0Var), ep.a(0, SharingImEngineComponentImpl.class, "picking", "getPicking()Lcom/vk/sharing/api/Picking;", hpf0Var), ep.a(0, SharingImEngineComponentImpl.class, "repository", "getRepository()Lcom/vk/sharing/api/data/SharingRepository;", hpf0Var), ep.a(0, SharingImEngineComponentImpl.class, "router", "getRouter()Lcom/vk/sharing/api/navigation/SharingRouter;", hpf0Var), ep.a(0, SharingImEngineComponentImpl.class, "dialogEntriesMapper", "getDialogEntriesMapper()Lcom/vk/sharing/api/DialogEntriesMapper;", hpf0Var)};
    }

    public SharingImEngineComponentImpl(AuthBridgeComponent authBridgeComponent, ImConfigurationComponent imConfigurationComponent, ImRxEventObserverComponent imRxEventObserverComponent, ImCmdRxExecutorComponent imCmdRxExecutorComponent, ImCmdDirectExecutorComponent imCmdDirectExecutorComponent) {
        this.a = authBridgeComponent;
        this.b = imConfigurationComponent;
        this.c = imRxEventObserverComponent;
        this.d = imCmdRxExecutorComponent;
        this.e = imCmdDirectExecutorComponent;
    }

    @Override // com.vk.sharing.api.di.SharingComponent
    public final bbj0 F2() {
        qcy<Object> qcyVar = m[2];
        return (bbj0) this.h.c();
    }

    @Override // com.vk.sharing.api.di.SharingComponent
    public final bja0 P8() {
        qcy<Object> qcyVar = m[3];
        return (bja0) this.i.c();
    }

    @Override // com.vk.sharing.api.di.SharingComponent
    public final fcj0 a() {
        qcy<Object> qcyVar = m[5];
        return (fcj0) this.k.c();
    }

    @Override // com.vk.sharing.api.di.SharingComponent
    public final dcj0 c() {
        qcy<Object> qcyVar = m[4];
        return (dcj0) this.j.c();
    }

    @Override // com.vk.sharing.api.di.SharingComponent
    public final hdm jc() {
        qcy<Object> qcyVar = m[6];
        return (hdm) this.l.c();
    }

    @Override // com.vk.sharing.api.di.SharingComponent
    public final a84 u() {
        qcy<Object> qcyVar = m[0];
        return (a84) this.f.c();
    }

    @Override // com.vk.sharing.api.di.SharingComponent
    public final d70 v() {
        qcy<Object> qcyVar = m[1];
        return (d70) this.g.c();
    }
}
