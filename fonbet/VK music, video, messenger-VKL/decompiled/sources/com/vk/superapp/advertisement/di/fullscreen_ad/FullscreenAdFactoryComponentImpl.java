package com.vk.superapp.advertisement.di.fullscreen_ad;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.advertisement.api.di.fullscreen_ad.FullscreenAdFactoryComponent;
import com.vk.superapp.advertisement.api.di.fullscreen_ad.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.mg;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: FullscreenAdFactoryComponentImpl.kt */
/* loaded from: classes6.dex */
public final class FullscreenAdFactoryComponentImpl implements FullscreenAdFactoryComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new mg(13));

    /* compiled from: FullscreenAdFactoryComponentImpl.kt */
    public static final class a implements c8m<FullscreenAdFactoryComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new FullscreenAdFactoryComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FullscreenAdFactoryComponentImpl.class, "fullscreenAdFactoryProvider", "getFullscreenAdFactoryProvider()Lcom/vk/superapp/advertisement/api/di/fullscreen_ad/FullscreenAdFactoryProvider;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.superapp.advertisement.api.di.fullscreen_ad.FullscreenAdFactoryComponent
    public final b g8() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }
}
