package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* loaded from: classes14.dex */
public /* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$4 extends FunctionReferenceImpl implements wzs<VolumeSettingsChange, spj<? super s3q0>, Object> {
    public AndroidFullscreenWebViewAdPlayer$show$4(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // xsna.wzs
    public final Object invoke(VolumeSettingsChange volumeSettingsChange, spj<? super s3q0> spjVar) {
        Object handleVolumeSettingsChange;
        handleVolumeSettingsChange = ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, spjVar);
        return handleVolumeSettingsChange;
    }
}
