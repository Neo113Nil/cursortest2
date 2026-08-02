package com.vk.im.chat.restriction.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.chat.restriction.api.ChatWriteRestrictionFeatureComponent;
import com.vk.im.engine.di.ImCmdCoroutinesExecutorScopedComponent;
import com.vk.im.engine.di.ImCommonCommandsFactoryComponent;
import defpackage.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.kly;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.v2y0;

/* compiled from: ChatWriteRestrictionFeatureComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ChatWriteRestrictionFeatureComponentImpl implements ChatWriteRestrictionFeatureComponent, DiScopedComponent<acw> {
    public static final /* synthetic */ qcy<Object>[] d;
    public final ImCommonCommandsFactoryComponent a;
    public final ImCmdCoroutinesExecutorScopedComponent b;
    public final nwy c = new nwy(new i(this, 17));

    /* compiled from: ChatWriteRestrictionFeatureComponentImpl.kt */
    public static final class a implements c8m<ChatWriteRestrictionFeatureComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ChatWriteRestrictionFeatureComponentImpl((ImCommonCommandsFactoryComponent) g8mVar.c(fpf0.a(ImCommonCommandsFactoryComponent.class)), (ImCmdCoroutinesExecutorScopedComponent) g8mVar.a(fpf0.a(ImCmdCoroutinesExecutorScopedComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ChatWriteRestrictionFeatureComponentImpl.class, "interactor", "getInteractor()Lcom/vk/im/chat/restriction/impl/domain/WriteRestrictionInteractor;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public ChatWriteRestrictionFeatureComponentImpl(ImCommonCommandsFactoryComponent imCommonCommandsFactoryComponent, ImCmdCoroutinesExecutorScopedComponent imCmdCoroutinesExecutorScopedComponent) {
        this.a = imCommonCommandsFactoryComponent;
        this.b = imCmdCoroutinesExecutorScopedComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.im.chat.restriction.api.ChatWriteRestrictionFeatureComponent
    public final kly G8() {
        qcy<Object> qcyVar = d[0];
        return new kly((v2y0) this.c.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.im.chat.restriction.api.ChatWriteRestrictionFeatureComponent
    public final v2y0 ha() {
        qcy<Object> qcyVar = d[0];
        return (v2y0) this.c.c();
    }
}
