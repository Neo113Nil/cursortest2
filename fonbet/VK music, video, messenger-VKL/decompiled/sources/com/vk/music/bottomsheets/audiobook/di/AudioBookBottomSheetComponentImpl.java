package com.vk.music.bottomsheets.audiobook.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.music.bottomsheets.di.AudioBookBottomSheetComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.ch4;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.t5;

/* compiled from: AudioBookBottomSheetComponentImpl.kt */
/* loaded from: classes3.dex */
public final class AudioBookBottomSheetComponentImpl implements AudioBookBottomSheetComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final AuthBridgeComponent a;
    public final OfflineAudioComponent b;
    public final BridgeComponent c;
    public final nwy d = new nwy(new t5(this, 6));

    /* compiled from: AudioBookBottomSheetComponentImpl.kt */
    public static final class a implements b7m<AudioBookBottomSheetComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new AudioBookBottomSheetComponentImpl((AuthBridgeComponent) e7mVar.a(fpf0.a(AuthBridgeComponent.class)), (OfflineAudioComponent) e7mVar.a(fpf0.a(OfflineAudioComponent.class)), (BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AudioBookBottomSheetComponentImpl.class, "audioBookInteractor", "getAudioBookInteractor()Lcom/vk/music/bottomsheets/domain/AudioBookInteractor;", 0);
        fpf0.a.getClass();
        e = new qcy[]{propertyReference1Impl};
    }

    public AudioBookBottomSheetComponentImpl(AuthBridgeComponent authBridgeComponent, OfflineAudioComponent offlineAudioComponent, BridgeComponent bridgeComponent) {
        this.a = authBridgeComponent;
        this.b = offlineAudioComponent;
        this.c = bridgeComponent;
    }

    @Override // com.vk.music.bottomsheets.di.AudioBookBottomSheetComponent
    public final ch4 Ie() {
        qcy<Object> qcyVar = e[0];
        return (ch4) this.d.c();
    }
}
