package com.vk.unitylevelplay.impl.di;

import com.vk.ads.externalsdkstat.api.di.AdsSdkStatTrackerComponent;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.googleump.api.di.GoogleUMPComponent;
import com.vk.unitylevelplay.api.di.UnityLevelPlayAdsSdkComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.d4q0;
import xsna.fpf0;
import xsna.g8m;
import xsna.kad;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: UnityLevelPlayAdsSdkComponentImpl.kt */
/* loaded from: classes6.dex */
public final class UnityLevelPlayAdsSdkComponentImpl implements UnityLevelPlayAdsSdkComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: UnityLevelPlayAdsSdkComponentImpl.kt */
    public static final class a implements c8m<UnityLevelPlayAdsSdkComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new UnityLevelPlayAdsSdkComponentImpl((GoogleUMPComponent) g8mVar.a(fpf0.a(GoogleUMPComponent.class)), (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)), (AdsSdkStatTrackerComponent) g8mVar.a(fpf0.a(AdsSdkStatTrackerComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(UnityLevelPlayAdsSdkComponentImpl.class, "unityLevelPlayFeature", "getUnityLevelPlayFeature()Lcom/vk/unitylevelplay/api/UnityLevelPlayFeature;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public UnityLevelPlayAdsSdkComponentImpl(GoogleUMPComponent googleUMPComponent, AuthBridgeComponent authBridgeComponent, AdsSdkStatTrackerComponent adsSdkStatTrackerComponent) {
        this.a = new nwy(new kad(adsSdkStatTrackerComponent, googleUMPComponent, authBridgeComponent, 3));
    }

    @Override // com.vk.unitylevelplay.api.di.UnityLevelPlayAdsSdkComponent
    public final d4q0 T7() {
        qcy<Object> qcyVar = b[0];
        return (d4q0) this.a.c();
    }
}
