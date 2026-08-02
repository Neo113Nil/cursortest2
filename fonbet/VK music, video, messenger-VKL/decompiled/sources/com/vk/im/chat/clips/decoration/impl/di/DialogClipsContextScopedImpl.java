package com.vk.im.chat.clips.decoration.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.chat.clips.decoration.api.di.DialogClipsContextScopedComponent;
import com.vk.im.engine.di.ImCmdDirectExecutorScopedComponent;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.ImExperimentsScopedComponent;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.c8m;
import xsna.ecm;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qbm;
import xsna.qcy;

/* compiled from: DialogClipsContextScopedImpl.kt */
/* loaded from: classes2.dex */
public final class DialogClipsContextScopedImpl implements DialogClipsContextScopedComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final ImExperimentsScopedComponent a;
    public final ImConfigurationScopedComponent b;
    public final ImRxEventObserverScopedComponent c;
    public final ImCmdRxExecutorScopedComponent d;
    public final ImCmdDirectExecutorScopedComponent e;
    public final nwy f = new nwy(new ecm(this, 0));

    /* compiled from: DialogClipsContextScopedImpl.kt */
    public static final class a implements c8m<DialogClipsContextScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DialogClipsContextScopedImpl((ImExperimentsScopedComponent) g8mVar.a(fpf0.a(ImExperimentsScopedComponent.class)), (ImConfigurationScopedComponent) g8mVar.a(fpf0.a(ImConfigurationScopedComponent.class)), (ImRxEventObserverScopedComponent) g8mVar.a(fpf0.a(ImRxEventObserverScopedComponent.class)), (ImCmdRxExecutorScopedComponent) g8mVar.a(fpf0.a(ImCmdRxExecutorScopedComponent.class)), (ImCmdDirectExecutorScopedComponent) g8mVar.a(fpf0.a(ImCmdDirectExecutorScopedComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DialogClipsContextScopedImpl.class, "dialogClipsContextRepository", "getDialogClipsContextRepository()Lcom/vk/im/chat/clips/decoration/api/di/DialogClipsContextRepository;", 0);
        fpf0.a.getClass();
        g = new qcy[]{propertyReference1Impl};
    }

    public DialogClipsContextScopedImpl(ImExperimentsScopedComponent imExperimentsScopedComponent, ImConfigurationScopedComponent imConfigurationScopedComponent, ImRxEventObserverScopedComponent imRxEventObserverScopedComponent, ImCmdRxExecutorScopedComponent imCmdRxExecutorScopedComponent, ImCmdDirectExecutorScopedComponent imCmdDirectExecutorScopedComponent) {
        this.a = imExperimentsScopedComponent;
        this.b = imConfigurationScopedComponent;
        this.c = imRxEventObserverScopedComponent;
        this.d = imCmdRxExecutorScopedComponent;
        this.e = imCmdDirectExecutorScopedComponent;
    }

    @Override // com.vk.im.chat.clips.decoration.api.di.DialogClipsContextScopedComponent
    public final qbm z() {
        qcy<Object> qcyVar = g[0];
        return (qbm) this.f.c();
    }
}
