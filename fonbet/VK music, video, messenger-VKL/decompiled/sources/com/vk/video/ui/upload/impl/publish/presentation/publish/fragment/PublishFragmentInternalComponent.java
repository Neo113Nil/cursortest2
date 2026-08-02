package com.vk.video.ui.upload.impl.publish.presentation.publish.fragment;

import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.content.privacy.di.ContentPrivacyComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.movika.sdk.base.logic.interactor.m;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.video.channel.common.di.VideoChannelComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b1z;
import xsna.cce0;
import xsna.ek;
import xsna.ep;
import xsna.f540;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.jz70;
import xsna.ko00;
import xsna.lo10;
import xsna.nwy;
import xsna.om60;
import xsna.pm60;
import xsna.qcy;
import xsna.vo50;
import xsna.vt30;
import xsna.wt30;
import xsna.x550;

/* compiled from: PublishFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class PublishFragmentInternalComponent implements DiScopedComponent<cce0> {
    public static final a v;
    public static final /* synthetic */ qcy<Object>[] w;
    public final cce0 a;
    public final ClipsUploadUiVkComponent b;
    public final AppContextDiComponent c;
    public final BridgeComponent d;
    public final VideoChannelComponent e;
    public final ClipsConfigAuthorsComponent f;
    public final VkOnboardingComponent g;
    public final ContentPrivacyComponent h;
    public final nwy i = new nwy(new lo10(this, 26));
    public final nwy j = new nwy(new f540(this, 19));
    public final nwy k = new nwy(new x550(this, 21));
    public final nwy l = new nwy(new b1z(this, 20));
    public final nwy m = new nwy(new jz70(this, 14));
    public final nwy n = new nwy(new ek(25));
    public final nwy o = new nwy(new vo50(11));
    public final nwy p = new nwy(new vt30(this, 25));
    public final nwy q = new nwy(new om60(7));
    public final nwy r = new nwy(new pm60(6));
    public final nwy s = new nwy(new ko00(this, 29));
    public final nwy t = new nwy(new wt30(this, 11));
    public final nwy u = new nwy(new m(24));

    /* compiled from: PublishFragmentInternalComponent.kt */
    public static final class a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PublishFragmentInternalComponent.class, "videoFeaturesRepository", "getVideoFeaturesRepository()Lcom/vk/libvideo/api/features/VideoFeaturesRepository;", 0);
        hpf0 hpf0Var = fpf0.a;
        w = new qcy[]{propertyReference1Impl, fp.c(0, PublishFragmentInternalComponent.class, "privacyInteractor", "getPrivacyInteractor()Lcom/vk/content/privacy/di/ContentPrivacyInteractor;", hpf0Var), ep.a(0, PublishFragmentInternalComponent.class, "clipsBridge", "getClipsBridge()Lcom/vk/bridges/ClipsBridge;", hpf0Var), ep.a(0, PublishFragmentInternalComponent.class, "imagePicker", "getImagePicker()Lcom/vk/bridges/NavigationBridge$ImagePicker;", hpf0Var), ep.a(0, PublishFragmentInternalComponent.class, "viewStateMapper", "getViewStateMapper()Lcom/vk/video/ui/upload/impl/publish/presentation/publish/feature/store/PublishViewStateMapper;", hpf0Var), ep.a(0, PublishFragmentInternalComponent.class, "videoBridge", "getVideoBridge()Lcom/vk/bridges/VideoBridge;", hpf0Var), ep.a(0, PublishFragmentInternalComponent.class, "privacyRulesRepository", "getPrivacyRulesRepository()Lcom/vk/privacyui/PrivacyRulesRepository;", hpf0Var), ep.a(0, PublishFragmentInternalComponent.class, "publishFileStorage", "getPublishFileStorage()Lcom/vk/video/ui/upload/impl/publish/domain/repository/PublishFileStorage;", hpf0Var), ep.a(0, PublishFragmentInternalComponent.class, "publishNetworkApi", "getPublishNetworkApi()Lcom/vk/video/ui/upload/impl/publish/domain/repository/PublishNetworkApi;", hpf0Var), ep.a(0, PublishFragmentInternalComponent.class, "publishRepository", "getPublishRepository()Lcom/vk/video/ui/upload/impl/publish/domain/repository/PublishRepository;", hpf0Var), ep.a(0, PublishFragmentInternalComponent.class, "albumsInteractor", "getAlbumsInteractor()Lcom/vk/video/ui/upload/impl/publish/domain/interactor/AlbumsInteractor;", hpf0Var), ep.a(0, PublishFragmentInternalComponent.class, "publishInteractor", "getPublishInteractor()Lcom/vk/video/ui/upload/impl/publish/domain/interactor/PublishInteractor;", hpf0Var), ep.a(0, PublishFragmentInternalComponent.class, "networkManager", "getNetworkManager()Lcom/vk/core/utils/newtork/NetworkManager;", hpf0Var)};
        v = new a();
    }

    public PublishFragmentInternalComponent(cce0 cce0Var, ClipsUploadUiVkComponent clipsUploadUiVkComponent, AppContextDiComponent appContextDiComponent, BridgeComponent bridgeComponent, VideoChannelComponent videoChannelComponent, ClipsConfigAuthorsComponent clipsConfigAuthorsComponent, VkOnboardingComponent vkOnboardingComponent, ContentPrivacyComponent contentPrivacyComponent) {
        this.a = cce0Var;
        this.b = clipsUploadUiVkComponent;
        this.c = appContextDiComponent;
        this.d = bridgeComponent;
        this.e = videoChannelComponent;
        this.f = clipsConfigAuthorsComponent;
        this.g = vkOnboardingComponent;
        this.h = contentPrivacyComponent;
    }
}
