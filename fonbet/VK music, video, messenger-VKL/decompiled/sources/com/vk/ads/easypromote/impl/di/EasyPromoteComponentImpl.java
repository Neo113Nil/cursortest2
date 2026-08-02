package com.vk.ads.easypromote.impl.di;

import com.vk.ads.easypromote.api.di.EasyPromoteComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a44;
import xsna.b7m;
import xsna.de4;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.hwo;
import xsna.iwo;
import xsna.kwo;
import xsna.lwo;
import xsna.nwy;
import xsna.qcy;

/* compiled from: EasyPromoteComponentImpl.kt */
/* loaded from: classes14.dex */
public final class EasyPromoteComponentImpl implements EasyPromoteComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(EasyPromoteComponentImpl.class, "router", "getRouter()Lcom/vk/ads/easypromote/impl/router/EasyPromoteRouterImpl;", 0), fp.c(0, EasyPromoteComponentImpl.class, "settingsRepository", "getSettingsRepository()Lcom/vk/ads/easypromote/impl/domain/model/EasyPromoteSettingsRepositoryImpl;", fpf0.a)};
    public final nwy a = new nwy(new a44(15));
    public final nwy b = new nwy(new de4(14));

    /* compiled from: EasyPromoteComponentImpl.kt */
    public static final class a implements b7m<EasyPromoteComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new EasyPromoteComponentImpl();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.ads.easypromote.api.di.EasyPromoteComponent
    public final kwo X() {
        qcy<Object> qcyVar = c[1];
        return (lwo) this.b.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.ads.easypromote.api.di.EasyPromoteComponent
    public final hwo a() {
        qcy<Object> qcyVar = c[0];
        return (iwo) this.a.c();
    }
}
