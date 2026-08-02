package com.vk.dialogssearch.impl.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.dialogssearch.api.di.ChannelSearchListComponent;
import com.vk.im.engine.di.ImCmdRxExecutorComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.h9;
import xsna.obb;
import xsna.qcy;

/* compiled from: ChannelSearchListComponentImpl.kt */
/* loaded from: classes18.dex */
public final class ChannelSearchListComponentImpl implements ChannelSearchListComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final ImCmdRxExecutorComponent a;
    public final ewy b = new ewy(new h9(this, 13));

    /* compiled from: ChannelSearchListComponentImpl.kt */
    public static final class a implements b7m<ChannelSearchListComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ChannelSearchListComponentImpl((ImCmdRxExecutorComponent) e7mVar.a(fpf0.a(ImCmdRxExecutorComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ChannelSearchListComponentImpl.class, "channelSearchListInteractor", "getChannelSearchListInteractor()Lcom/vk/dialogssearch/api/ChannelSearchListInteractor;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public ChannelSearchListComponentImpl(ImCmdRxExecutorComponent imCmdRxExecutorComponent) {
        this.a = imCmdRxExecutorComponent;
    }

    @Override // com.vk.dialogssearch.api.di.ChannelSearchListComponent
    public final obb Pe() {
        qcy<Object> qcyVar = c[0];
        return (obb) this.b.c();
    }
}
