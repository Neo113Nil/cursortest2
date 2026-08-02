package com.vk.libvideo.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.AutoPlayDelegateComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a2f;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.lu2;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: AutoPlayDelegateComponentImpl.kt */
/* loaded from: classes.dex */
public final class AutoPlayDelegateComponentImpl implements AutoPlayDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new lu2(3));

    /* compiled from: AutoPlayDelegateComponentImpl.kt */
    public static final class a implements c8m<AutoPlayDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AutoPlayDelegateComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AutoPlayDelegateComponentImpl.class, "clipsRouterFactory", "getClipsRouterFactory()Lcom/vk/libvideo/api/autoplay/ClipsRouterFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.libvideo.api.di.AutoPlayDelegateComponent
    public final a2f Y9() {
        qcy<Object> qcyVar = b[0];
        return (a2f) this.a.c();
    }
}
