package com.vk.profile.core.tabs.ui.music;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.profile.core.tabs.ui.music.a;
import xsna.zak0;

/* compiled from: ProfileContentAudioAdapter.kt */
/* loaded from: classes5.dex */
public final class b extends e.a {
    public final /* synthetic */ a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, f fVar) {
        MusicTrack f;
        ((zak0) this.b.g).setValue(new a.c(playState == PlayState.PLAYING, (fVar == null || (f = fVar.f()) == null) ? null : Integer.valueOf(f.b)));
    }
}
