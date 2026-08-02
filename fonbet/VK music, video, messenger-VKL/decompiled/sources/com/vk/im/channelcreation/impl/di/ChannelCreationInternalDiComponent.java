package com.vk.im.channelcreation.impl.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import defpackage.r;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ac;
import xsna.asu0;
import xsna.b7m;
import xsna.e7m;
import xsna.ep;
import xsna.ewy;
import xsna.f5;
import xsna.fp;
import xsna.fpf0;
import xsna.g5;
import xsna.hpf0;
import xsna.i70;
import xsna.j70;
import xsna.nwy;
import xsna.pr0;
import xsna.qcy;

/* compiled from: ChannelCreationInternalDiComponent.kt */
/* loaded from: classes2.dex */
public final class ChannelCreationInternalDiComponent implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] j;
    public final ImBridgeComponent a;
    public final BridgeComponent b;
    public final ewy c = new ewy(new ac(this, 12));
    public final ewy d = new ewy(new f5(this, 12));
    public final ewy e = new ewy(new g5(this, 9));
    public final ewy f = new ewy(new i70(this, 13));
    public final nwy g = new nwy(new j70(this, 12));
    public final nwy h = new nwy(new r(this, 18));
    public final ewy i = new ewy(new pr0(4));

    /* compiled from: ChannelCreationInternalDiComponent.kt */
    public static final class a implements b7m<ChannelCreationInternalDiComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ChannelCreationInternalDiComponent((ImBridgeComponent) e7mVar.a(fpf0.a(ImBridgeComponent.class)), (BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ChannelCreationInternalDiComponent.class, "createChannelUseCase", "getCreateChannelUseCase()Lcom/vk/im/channelcreation/impl/domain/CreateChannelUseCase;", 0);
        hpf0 hpf0Var = fpf0.a;
        j = new qcy[]{propertyReference1Impl, fp.c(0, ChannelCreationInternalDiComponent.class, "editChannelUseCase", "getEditChannelUseCase()Lcom/vk/im/channelcreation/impl/domain/EditChannelUseCase;", hpf0Var), ep.a(0, ChannelCreationInternalDiComponent.class, "requestChannelUseCase", "getRequestChannelUseCase()Lcom/vk/im/channelcreation/impl/domain/RequestChannelUseCase;", hpf0Var), ep.a(0, ChannelCreationInternalDiComponent.class, "deleteChannelUseCase", "getDeleteChannelUseCase()Lcom/vk/im/channelcreation/impl/domain/DeleteChannelUseCase;", hpf0Var), ep.a(0, ChannelCreationInternalDiComponent.class, "authBridge", "getAuthBridge()Lcom/vk/bridges/AuthBridge;", hpf0Var), ep.a(0, ChannelCreationInternalDiComponent.class, "imBridge", "getImBridge()Lcom/vk/im/ui/bridges/ImBridge;", hpf0Var), ep.a(0, ChannelCreationInternalDiComponent.class, "executors", "getExecutors()Lcom/vk/core/concurrent/VkExecutors;", hpf0Var)};
    }

    public ChannelCreationInternalDiComponent(ImBridgeComponent imBridgeComponent, BridgeComponent bridgeComponent) {
        this.a = imBridgeComponent;
        this.b = bridgeComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final asu0 Df() {
        qcy<Object> qcyVar = j[6];
        return (asu0) this.i.c();
    }
}
