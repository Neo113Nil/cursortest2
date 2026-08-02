package com.vk.music.fragment.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.vk.dto.common.id.UserId;
import com.vk.music.common.MusicPlaybackLaunchContext;
import xsna.g250;
import xsna.o25;
import xsna.oz50;

/* loaded from: classes3.dex */
public final class PlaylistsFragment extends DelegatingFragment {
    public static final /* synthetic */ int O = 0;

    public static class a extends oz50 {
    }

    @Override // com.vk.music.fragment.impl.DelegatingFragment
    @NonNull
    public final b eo() {
        Bundle arguments = getArguments();
        boolean containsKey = arguments.containsKey("catalogBlockId");
        boolean a2 = o25.a().a(new UserId(arguments.getLong("ownerId", o25.a().c().b)));
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = getArguments().containsKey("refer") ? (MusicPlaybackLaunchContext) getArguments().getParcelable("refer") : MusicPlaybackLaunchContext.d;
        g250.a aVar = new g250.a(this, musicPlaybackLaunchContext);
        aVar.b = a2 && !containsKey;
        aVar.g = a2 && !containsKey;
        aVar.c = arguments.getBoolean("select");
        aVar.d = containsKey;
        aVar.h = arguments.getLong("screenOpenedFromPlaylistPid", -1L);
        aVar.f = arguments.getString("nextFromToken");
        aVar.e = arguments.getString("title", "");
        aVar.i = arguments.getParcelableArrayList("attachedMusicTracks");
        return new b(new d(this, musicPlaybackLaunchContext), new g250(aVar));
    }
}
