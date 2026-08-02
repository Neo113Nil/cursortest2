package com.vk.libvideo.impl.di;

import com.vk.ads.adchoice.api.di.AdChoiceComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.api.di.VideoAdvertisementsComponent;
import com.vk.stat.scheme.CommonVideoAdsStat$CommonFields;
import java.util.EnumMap;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.avj0;
import xsna.b7m;
import xsna.e7m;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.ksq0;
import xsna.lyr0;
import xsna.md0;
import xsna.nd0;
import xsna.nwy;
import xsna.q0s0;
import xsna.qcy;
import xsna.sqf0;
import xsna.wc0;
import xsna.xc0;

/* compiled from: VideoAdvertisementsComponentImpl.kt */
/* loaded from: classes14.dex */
public final class VideoAdvertisementsComponentImpl implements VideoAdvertisementsComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final AdChoiceComponent a;
    public final LinksBridgeComponent b;
    public final nwy c = new nwy(new sqf0(10));
    public final nwy d = new nwy(new q0s0(0));
    public final nwy e = new nwy(new avj0(this, 16));
    public final ewy f = new ewy(new ksq0(this, 1));

    /* compiled from: VideoAdvertisementsComponentImpl.kt */
    public static final class a implements b7m<VideoAdvertisementsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VideoAdvertisementsComponentImpl((AdChoiceComponent) e7mVar.a(fpf0.a(AdChoiceComponent.class)), (LinksBridgeComponent) e7mVar.a(fpf0.a(LinksBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoAdvertisementsComponentImpl.class, "videoBridge", "getVideoBridge()Lcom/vk/bridges/VideoBridge;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, VideoAdvertisementsComponentImpl.class, "statsObjects", "getStatsObjects()Ljava/util/EnumMap;", hpf0Var), ep.a(0, VideoAdvertisementsComponentImpl.class, "adRepository", "getAdRepository()Lcom/vk/libvideo/api/ad/VideoAdvertisementsRepository;", hpf0Var), ep.a(0, VideoAdvertisementsComponentImpl.class, "adBannerRepository", "getAdBannerRepository()Lcom/vk/libvideo/api/ad/VideoAdBannerRepository;", hpf0Var)};
    }

    public VideoAdvertisementsComponentImpl(AdChoiceComponent adChoiceComponent, LinksBridgeComponent linksBridgeComponent) {
        this.a = adChoiceComponent;
        this.b = linksBridgeComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.api.di.VideoAdvertisementsComponent
    public final wc0 Z3(VideoAdvertisementsComponent.AdType adType) {
        qcy<Object> qcyVar = g[1];
        EnumMap enumMap = (EnumMap) this.d.c();
        Object obj = enumMap.get(adType);
        Object obj2 = obj;
        if (obj == null) {
            xc0 xc0Var = new xc0();
            xc0Var.a = new CommonVideoAdsStat$CommonFields("", 0, "", null, null, 24, null);
            enumMap.put((EnumMap) adType, (VideoAdvertisementsComponent.AdType) xc0Var);
            obj2 = xc0Var;
        }
        return (wc0) obj2;
    }

    @Override // com.vk.libvideo.api.di.VideoAdvertisementsComponent
    public final md0 a8() {
        return new nd0(this.b.p().e());
    }

    @Override // com.vk.libvideo.api.di.VideoAdvertisementsComponent
    public final VideoAdvertisementsRepository pc() {
        qcy<Object> qcyVar = g[2];
        return (VideoAdvertisementsRepository) this.e.c();
    }

    @Override // com.vk.libvideo.api.di.VideoAdvertisementsComponent
    public final lyr0 t4() {
        qcy<Object> qcyVar = g[3];
        return (lyr0) this.f.c();
    }
}
