package com.vk.music.fragment.impl;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.model.di.AudioModelsComponent;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.gv5;
import xsna.ies;
import xsna.m2g;
import xsna.mn6;
import xsna.mzp0;
import xsna.o25;
import xsna.oz50;
import xsna.qsk0;
import xsna.rzp0;

/* loaded from: classes3.dex */
public final class EditPlaylistFragment extends DelegatingFragment implements ies {
    public static final /* synthetic */ int P = 0;
    public final bpn0 O = new bpn0(new m2g(this, 15));

    public static class a extends oz50 {
        public a() {
            super(EditPlaylistFragment.class, null, null);
        }

        public final void A(MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.j.putParcelable("EditPlaylistFragment.arg.refer", musicPlaybackLaunchContext);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair b = rzp0.b(UiMeasuringScreen.MUSIC_PLAYLIST_EDIT, null, true, false, null, null, qsk0.a);
            ((mzp0) b.j()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, (UUID) b.i());
            }
        }

        public final void y(@Nullable Playlist playlist) {
            if (playlist != null) {
                Set<Integer> set = Playlist.P;
                this.j.putParcelable("EditPlaylistFragment.arg.playlist", Playlist.zb(playlist, null, null, EmptyList.b, null, -8388609, 255));
            }
        }

        public final void z(UserId userId) {
            this.j.putParcelable("EditPlaylistFragment.arg.ownerId", userId);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        return getView() instanceof gv5 ? ((gv5) getView()).a0() : false;
    }

    @Override // com.vk.music.fragment.impl.DelegatingFragment
    @NonNull
    public final b eo() {
        UserId userId = (UserId) getArguments().getParcelable("EditPlaylistFragment.arg.ownerId");
        if (userId == null) {
            userId = o25.a().c();
        }
        mzp0 mzp0Var = this.J;
        return new b(new mn6(this, mzp0Var), new com.vk.music.fragment.impl.model.a((Playlist) getArguments().getParcelable("EditPlaylistFragment.arg.playlist"), getArguments().getParcelableArrayList("EditPlaylistFragment.arg.musicTracks"), (MusicPlaybackLaunchContext) getArguments().getParcelable("EditPlaylistFragment.arg.refer"), mzp0Var, ((AudioModelsComponent) this.O.getValue()).r(), userId, getArguments().getLong("EditPlaylistFragment.arg.dialogId", 0L), getArguments().getString("EditPlaylistFragment.arg.dialogTitle", "")));
    }
}
