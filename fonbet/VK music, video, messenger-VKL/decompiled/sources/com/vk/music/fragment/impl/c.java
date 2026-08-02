package com.vk.music.fragment.impl;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.fragment.impl.EditPlaylistFragment;
import com.vk.music.fragment.impl.MusicArtistCatalogFragment;
import xsna.e3m;
import xsna.wk40;
import xsna.xk40;
import xsna.yk40;
import xsna.zk40;

/* compiled from: MusicFragmentLauncherImpl.kt */
/* loaded from: classes.dex */
public final class c implements wk40 {
    public final xk40 a;

    public c(zk40 zk40Var) {
        this.a = zk40Var;
    }

    @Override // xsna.wk40
    public final void a(Context context, String str) {
        yk40 builder = this.a.builder();
        builder.F(str);
        builder.B(context);
    }

    @Override // xsna.wk40
    public final void b(Context context, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        Activity h = e3m.h(context);
        if (h != null) {
            MusicArtistCatalogFragment.a aVar = new MusicArtistCatalogFragment.a(str);
            aVar.C(str2);
            aVar.D(searchStatsLoggingInfo);
            aVar.B(str3);
            aVar.k(h);
        }
    }

    @Override // xsna.wk40
    public final void c(Context context, Playlist playlist) {
        EditPlaylistFragment.a aVar = new EditPlaylistFragment.a();
        aVar.y(playlist);
        aVar.k(context);
    }

    @Override // xsna.wk40
    public final void e(Context context, UserId userId, String str) {
        EditPlaylistFragment.a aVar = new EditPlaylistFragment.a();
        aVar.A(MusicPlaybackLaunchContext.Fb(str));
        aVar.z(userId);
        aVar.k(context);
    }

    @Override // xsna.wk40
    public final void f(Context context, UserId userId, String str, String str2, boolean z) {
        yk40 builder = this.a.builder();
        builder.C(userId);
        if (str == null) {
            str = "";
        }
        builder.E(str);
        builder.b(str2, z);
        builder.B(context);
    }
}
