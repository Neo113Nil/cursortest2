package com.vk.music.di;

import com.vk.music.player.api.PlayerBottomSheetStateHolder;
import com.vk.music.player.api.di.PlayerUIComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aq0;
import xsna.aqi;
import xsna.c550;
import xsna.e5b0;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.jvg;
import xsna.mb3;
import xsna.nwy;
import xsna.ox4;
import xsna.p2k0;
import xsna.q57;
import xsna.qcy;
import xsna.qww;
import xsna.s3a;
import xsna.s4b0;
import xsna.xu2;
import xsna.zza0;

/* compiled from: DefaultPlayerUIComponentImpl.kt */
/* loaded from: classes.dex */
public class DefaultPlayerUIComponentImpl implements PlayerUIComponent {
    public static final /* synthetic */ qcy<Object>[] h;
    public final nwy a = new nwy(new q57(3));
    public final nwy b = new nwy(new xu2(6));
    public final nwy c;
    public final nwy d;
    public final nwy e;
    public final nwy f;
    public final nwy g;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DefaultPlayerUIComponentImpl.class, "playerConfig", "getPlayerConfig()Lcom/vk/music/player/api/PlayerConfig;", 0);
        hpf0 hpf0Var = fpf0.a;
        h = new qcy[]{propertyReference1Impl, fp.c(0, DefaultPlayerUIComponentImpl.class, "musicScreenController", "getMusicScreenController()Lcom/vk/music/player/informer/MusicScreenController;", hpf0Var), ep.a(0, DefaultPlayerUIComponentImpl.class, "playerWidgetController", "getPlayerWidgetController()Lcom/vk/music/player/api/PlayerWidgetController;", hpf0Var), ep.a(0, DefaultPlayerUIComponentImpl.class, "slotIdController", "getSlotIdController()Lcom/vk/music/player/advertising/SlotIdController;", hpf0Var), ep.a(0, DefaultPlayerUIComponentImpl.class, "playerBottomSheetStateHolder", "getPlayerBottomSheetStateHolder()Lcom/vk/music/player/api/PlayerBottomSheetStateHolder;", hpf0Var), ep.a(0, DefaultPlayerUIComponentImpl.class, "statusBarStateController", "getStatusBarStateController()Lcom/vk/music/player/api/PlayerStatusBarStateController;", hpf0Var), ep.a(0, DefaultPlayerUIComponentImpl.class, "informerController", "getInformerController()Lcom/vk/music/player/informer/InformerController;", hpf0Var), ep.a(0, DefaultPlayerUIComponentImpl.class, "uiMeasuringSessionMeta", "getUiMeasuringSessionMeta()Lcom/vk/music/player/ui/PlayerUiMeasuringSessionMeta;", hpf0Var)};
    }

    public DefaultPlayerUIComponentImpl() {
        new nwy(new mb3(5));
        this.c = new nwy(new ox4(2));
        this.d = new nwy(new jvg(2));
        this.e = new nwy(new s3a(1));
        this.f = new nwy(new aq0(1));
        this.g = new nwy(new aqi(1));
    }

    @Override // com.vk.music.player.api.di.PlayerUIComponent
    public final PlayerBottomSheetStateHolder J9() {
        qcy<Object> qcyVar = h[4];
        return (PlayerBottomSheetStateHolder) this.d.c();
    }

    @Override // com.vk.music.player.api.di.PlayerUIComponent
    public c550 Ne() {
        qcy<Object> qcyVar = h[1];
        return (c550) this.b.c();
    }

    @Override // com.vk.music.player.api.di.PlayerUIComponent
    public final qww O6() {
        qcy<Object> qcyVar = h[6];
        return (qww) this.f.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.music.player.api.di.PlayerUIComponent
    public zza0 Ra() {
        qcy<Object> qcyVar = h[0];
        return (zza0) this.a.c();
    }

    @Override // com.vk.music.player.api.di.PlayerUIComponent
    public final s4b0 a3() {
        qcy<Object> qcyVar = h[5];
        return (s4b0) this.e.c();
    }

    @Override // com.vk.music.player.api.di.PlayerUIComponent
    public final p2k0 ub() {
        qcy<Object> qcyVar = h[3];
        return (p2k0) this.c.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.music.player.api.di.PlayerUIComponent
    public final e5b0 w4() {
        qcy<Object> qcyVar = h[7];
        return (e5b0) this.g.c();
    }
}
