package com.vk.video.ui.smartcrop.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.video.ui.smartcrop.api.di.SmartCropComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.f5k0;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.rjg0;

/* compiled from: SmartCropComponentImpl.kt */
/* loaded from: classes7.dex */
public final class SmartCropComponentImpl implements SmartCropComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new rjg0(2));

    /* compiled from: SmartCropComponentImpl.kt */
    public static final class a implements c8m<SmartCropComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SmartCropComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SmartCropComponentImpl.class, "router", "getRouter()Lcom/vk/video/ui/smartcrop/api/router/SmartCropRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.video.ui.smartcrop.api.di.SmartCropComponent
    public final f5k0 a() {
        qcy<Object> qcyVar = b[0];
        return (f5k0) this.a.c();
    }
}
