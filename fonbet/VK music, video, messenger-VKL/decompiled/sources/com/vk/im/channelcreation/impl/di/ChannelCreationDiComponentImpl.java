package com.vk.im.channelcreation.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.im.channelcreation.api.ChannelCreationDiComponent;
import com.vk.im.channelcreation.impl.f;
import com.vk.movika.sdk.base.model.props.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: ChannelCreationDiComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ChannelCreationDiComponentImpl implements ChannelCreationDiComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new d(10));

    /* compiled from: ChannelCreationDiComponentImpl.kt */
    public static final class a implements b7m<ChannelCreationDiComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ChannelCreationDiComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ChannelCreationDiComponentImpl.class, "channelCreationRouter", "getChannelCreationRouter()Lcom/vk/im/channelcreation/impl/ChannelCreationRouterImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.im.channelcreation.api.ChannelCreationDiComponent
    public final com.vk.im.channelcreation.api.a f1() {
        qcy<Object> qcyVar = b[0];
        return (f) this.a.c();
    }
}
