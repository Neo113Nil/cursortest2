package com.vk.sharing.im_engine_impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImCmdDirectExecutorComponent;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverScopedComponent;
import com.vk.sharing.api.di.SharingScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.c8m;
import xsna.d14;
import xsna.dcj0;
import xsna.ejf0;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.nwy;
import xsna.o6;
import xsna.pwj0;
import xsna.qcy;
import xsna.vqe0;
import xsna.w2a0;
import xsna.xbj0;
import xsna.yqd0;

/* compiled from: SharingImEngineScopedComponentImpl.kt */
/* loaded from: classes5.dex */
public final class SharingImEngineScopedComponentImpl implements SharingScopedComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final AuthBridgeComponent a;
    public final ImConfigurationScopedComponent b;
    public final ImRxEventObserverScopedComponent c;
    public final ImCmdRxExecutorScopedComponent d;
    public final ImCmdDirectExecutorComponent e;
    public final ewy f;

    /* compiled from: SharingImEngineScopedComponentImpl.kt */
    public static final class a implements c8m<SharingScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SharingImEngineScopedComponentImpl((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)), (ImConfigurationScopedComponent) g8mVar.a(fpf0.a(ImConfigurationScopedComponent.class)), (ImRxEventObserverScopedComponent) g8mVar.a(fpf0.a(ImRxEventObserverScopedComponent.class)), (ImCmdRxExecutorScopedComponent) g8mVar.a(fpf0.a(ImCmdRxExecutorScopedComponent.class)), (ImCmdDirectExecutorComponent) g8mVar.a(fpf0.a(ImCmdDirectExecutorComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SharingImEngineScopedComponentImpl.class, "attachments", "getAttachments()Lcom/vk/sharing/api/Attachments;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, SharingImEngineScopedComponentImpl.class, "actions", "getActions()Lcom/vk/sharing/api/Actions;", hpf0Var), ep.a(0, SharingImEngineScopedComponentImpl.class, "sharing", "getSharing()Lcom/vk/sharing/api/Sharing;", hpf0Var), ep.a(0, SharingImEngineScopedComponentImpl.class, "picking", "getPicking()Lcom/vk/sharing/api/Picking;", hpf0Var), ep.a(0, SharingImEngineScopedComponentImpl.class, "repository", "getRepository()Lcom/vk/sharing/api/data/SharingRepository;", hpf0Var), ep.a(0, SharingImEngineScopedComponentImpl.class, "router", "getRouter()Lcom/vk/sharing/api/navigation/SharingRouter;", hpf0Var), ep.a(0, SharingImEngineScopedComponentImpl.class, "dialogEntriesMapper", "getDialogEntriesMapper()Lcom/vk/sharing/api/DialogEntriesMapper;", hpf0Var)};
    }

    public SharingImEngineScopedComponentImpl(AuthBridgeComponent authBridgeComponent, ImConfigurationScopedComponent imConfigurationScopedComponent, ImRxEventObserverScopedComponent imRxEventObserverScopedComponent, ImCmdRxExecutorScopedComponent imCmdRxExecutorScopedComponent, ImCmdDirectExecutorComponent imCmdDirectExecutorComponent) {
        this.a = authBridgeComponent;
        this.b = imConfigurationScopedComponent;
        this.c = imRxEventObserverScopedComponent;
        this.d = imCmdRxExecutorScopedComponent;
        this.e = imCmdDirectExecutorComponent;
        new nwy(new vqe0(2));
        new nwy(new o6(27));
        new nwy(new ejf0(this, 4));
        new nwy(new d14(25));
        this.f = new ewy(new yqd0(this, 7));
        new ewy(new w2a0(7));
        new ewy(new xbj0(0));
    }

    @Override // com.vk.sharing.api.di.SharingScopedComponent
    public final dcj0 c() {
        qcy<Object> qcyVar = g[4];
        return (dcj0) this.f.c();
    }
}
