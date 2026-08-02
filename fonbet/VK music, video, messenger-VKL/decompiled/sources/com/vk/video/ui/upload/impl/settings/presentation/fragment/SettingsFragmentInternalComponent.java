package com.vk.video.ui.upload.impl.settings.presentation.fragment;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.video.ui.smartcrop.api.di.SmartCropComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.da50;
import xsna.ep;
import xsna.f1t0;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.nwy;
import xsna.ofc0;
import xsna.qbe0;
import xsna.qcy;
import xsna.r1j0;
import xsna.tju;
import xsna.vex;
import xsna.xk70;
import xsna.zqf0;

/* compiled from: SettingsFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class SettingsFragmentInternalComponent implements DiScopedComponent<r1j0> {
    public static final a j;
    public static final /* synthetic */ qcy<Object>[] k;
    public final r1j0 a;
    public final BridgeComponent b;
    public final VkOnboardingComponent c;
    public final SmartCropComponent d;
    public final nwy e = new nwy(new ofc0(this, 7));
    public final nwy f = new nwy(new xk70(9));
    public final nwy g;
    public final nwy h;
    public final nwy i;

    /* compiled from: SettingsFragmentInternalComponent.kt */
    public static final class a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SettingsFragmentInternalComponent.class, "settingsInteractor", "getSettingsInteractor()Lcom/vk/video/ui/upload/impl/settings/domain/interactor/SettingsInteractor;", 0);
        hpf0 hpf0Var = fpf0.a;
        k = new qcy[]{propertyReference1Impl, fp.c(0, SettingsFragmentInternalComponent.class, "networkManager", "getNetworkManager()Lcom/vk/core/utils/newtork/NetworkManager;", hpf0Var), ep.a(0, SettingsFragmentInternalComponent.class, "uploadBridge", "getUploadBridge()Lcom/vk/bridges/UploadBridge;", hpf0Var), ep.a(0, SettingsFragmentInternalComponent.class, "videoBridge", "getVideoBridge()Lcom/vk/bridges/VideoBridge;", hpf0Var), ep.a(0, SettingsFragmentInternalComponent.class, "smartCropRouter", "getSmartCropRouter()Lcom/vk/video/ui/smartcrop/api/router/SmartCropRouter;", hpf0Var), ep.a(0, SettingsFragmentInternalComponent.class, "ordMiniAppHandler", "getOrdMiniAppHandler()Lcom/vk/libvideo/VideoOrdMiniAppHandlerImpl;", hpf0Var), ep.a(0, SettingsFragmentInternalComponent.class, "viewStateMapper", "getViewStateMapper()Lcom/vk/video/ui/upload/impl/settings/presentation/feature/store/SettingsViewStateMapper;", hpf0Var)};
        j = new a();
    }

    public SettingsFragmentInternalComponent(r1j0 r1j0Var, BridgeComponent bridgeComponent, VkOnboardingComponent vkOnboardingComponent, SmartCropComponent smartCropComponent) {
        this.a = r1j0Var;
        this.b = bridgeComponent;
        this.c = vkOnboardingComponent;
        this.d = smartCropComponent;
        new nwy(new tju(this, 28));
        new nwy(new zqf0(3));
        this.g = new nwy(new vex(this, 29));
        this.h = new nwy(new qbe0(7));
        this.i = new nwy(new da50(this, 20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f1t0 Df() {
        qcy<Object> qcyVar = k[5];
        return (f1t0) this.h.c();
    }
}
