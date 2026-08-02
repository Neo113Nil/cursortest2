package com.vk.im.chat.clips.decoration.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.chat.clips.decoration.api.di.DialogClipsContextComponent;
import com.vk.im.engine.di.ImCmdDirectExecutorComponent;
import com.vk.im.engine.di.ImCmdRxExecutorComponent;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.hbl;
import xsna.nwy;
import xsna.pwj0;
import xsna.qbm;
import xsna.qcy;

/* compiled from: DialogClipsContextImpl.kt */
/* loaded from: classes.dex */
public final class DialogClipsContextImpl implements DialogClipsContextComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final ImExperimentsComponent a;
    public final ImConfigurationComponent b;
    public final ImRxEventObserverComponent c;
    public final ImCmdRxExecutorComponent d;
    public final ImCmdDirectExecutorComponent e;
    public final nwy f = new nwy(new hbl(this, 1));

    /* compiled from: DialogClipsContextImpl.kt */
    public static final class a implements c8m<DialogClipsContextComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DialogClipsContextImpl((ImExperimentsComponent) g8mVar.a(fpf0.a(ImExperimentsComponent.class)), (ImConfigurationComponent) g8mVar.a(fpf0.a(ImConfigurationComponent.class)), (ImRxEventObserverComponent) g8mVar.a(fpf0.a(ImRxEventObserverComponent.class)), (ImCmdRxExecutorComponent) g8mVar.a(fpf0.a(ImCmdRxExecutorComponent.class)), (ImCmdDirectExecutorComponent) g8mVar.a(fpf0.a(ImCmdDirectExecutorComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DialogClipsContextImpl.class, "dialogClipsContextRepository", "getDialogClipsContextRepository()Lcom/vk/im/chat/clips/decoration/api/di/DialogClipsContextRepository;", 0);
        fpf0.a.getClass();
        g = new qcy[]{propertyReference1Impl};
    }

    public DialogClipsContextImpl(ImExperimentsComponent imExperimentsComponent, ImConfigurationComponent imConfigurationComponent, ImRxEventObserverComponent imRxEventObserverComponent, ImCmdRxExecutorComponent imCmdRxExecutorComponent, ImCmdDirectExecutorComponent imCmdDirectExecutorComponent) {
        this.a = imExperimentsComponent;
        this.b = imConfigurationComponent;
        this.c = imRxEventObserverComponent;
        this.d = imCmdRxExecutorComponent;
        this.e = imCmdDirectExecutorComponent;
    }

    @Override // com.vk.im.chat.clips.decoration.api.di.DialogClipsContextComponent
    public final qbm z() {
        qcy<Object> qcyVar = g[0];
        return (qbm) this.f.c();
    }
}
