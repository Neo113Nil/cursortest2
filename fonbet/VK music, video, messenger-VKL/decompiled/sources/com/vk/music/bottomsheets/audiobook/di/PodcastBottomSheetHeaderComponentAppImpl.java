package com.vk.music.bottomsheets.audiobook.di;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.dto.common.id.UserId;
import com.vk.music.bottomsheets.di.PodcastBottomSheetHeaderComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.o0r0;

/* compiled from: PodcastBottomSheetHeaderComponentAppImpl.kt */
/* loaded from: classes3.dex */
public final class PodcastBottomSheetHeaderComponentAppImpl implements PodcastBottomSheetHeaderComponent {
    public final BridgeComponent a;

    /* compiled from: PodcastBottomSheetHeaderComponentAppImpl.kt */
    public static final class a implements b7m<PodcastBottomSheetHeaderComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new PodcastBottomSheetHeaderComponentAppImpl((BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)));
        }
    }

    public PodcastBottomSheetHeaderComponentAppImpl(BridgeComponent bridgeComponent) {
        this.a = bridgeComponent;
    }

    @Override // com.vk.music.bottomsheets.di.PodcastBottomSheetHeaderComponent
    public final void R3(long j, Context context) {
        this.a.F().m(context, new UserId(j), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }
}
