package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import defpackage.ot8;
import defpackage.rq3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$4 extends ot8 implements Function2<VolumeSettingsChange, rq3<? super Unit>, Object> {
    public AndroidFullscreenWebViewAdPlayer$show$4(Object obj) {
        super(2, 0, AndroidFullscreenWebViewAdPlayer.class, obj, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(VolumeSettingsChange volumeSettingsChange, rq3<? super Unit> rq3Var) {
        Object handleVolumeSettingsChange;
        handleVolumeSettingsChange = ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, rq3Var);
        return handleVolumeSettingsChange;
    }
}
