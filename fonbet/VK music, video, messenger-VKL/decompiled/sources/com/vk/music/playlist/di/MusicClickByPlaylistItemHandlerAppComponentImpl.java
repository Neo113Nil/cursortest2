package com.vk.music.playlist.di;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.dto.common.id.UserId;
import com.vk.music.playlist.api.di.MusicClickByPlaylistItemHandlerComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.o0r0;

/* compiled from: MusicClickByPlaylistItemHandlerAppComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MusicClickByPlaylistItemHandlerAppComponentImpl implements MusicClickByPlaylistItemHandlerComponent {
    public final BridgeComponent a;

    /* compiled from: MusicClickByPlaylistItemHandlerAppComponentImpl.kt */
    public static final class a implements b7m<MusicClickByPlaylistItemHandlerComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MusicClickByPlaylistItemHandlerAppComponentImpl((BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)));
        }
    }

    public MusicClickByPlaylistItemHandlerAppComponentImpl(BridgeComponent bridgeComponent) {
        this.a = bridgeComponent;
    }

    @Override // com.vk.music.playlist.api.di.MusicClickByPlaylistItemHandlerComponent
    public final void o8(Context context, UserId userId) {
        this.a.F().m(context, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }
}
