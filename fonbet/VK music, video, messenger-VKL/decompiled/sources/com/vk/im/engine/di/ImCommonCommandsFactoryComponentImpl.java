package com.vk.im.engine.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.mjg;
import xsna.nwy;
import xsna.qcy;
import xsna.uv0;

/* compiled from: ImCommonCommandsFactoryComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImCommonCommandsFactoryComponentImpl implements ImCommonCommandsFactoryComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new uv0(17));

    /* compiled from: ImCommonCommandsFactoryComponentImpl.kt */
    public static final class a implements b7m<ImCommonCommandsFactoryComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ImCommonCommandsFactoryComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImCommonCommandsFactoryComponentImpl.class, "commonEngineCommandsFactory", "getCommonEngineCommandsFactory()Lcom/vk/im/engine/external/CommonEngineCommandsFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.im.engine.di.ImCommonCommandsFactoryComponent
    public final mjg w7() {
        qcy<Object> qcyVar = b[0];
        return (mjg) this.a.c();
    }
}
