package com.vk.music.playlist;

import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.mixed.k;
import io.reactivex.rxjava3.internal.operators.observable.l2;
import xsna.abo;
import xsna.cww;
import xsna.eml;
import xsna.lz;
import xsna.q520;

/* compiled from: ModernPlaylistModelFromCache.kt */
/* loaded from: classes3.dex */
public final class g extends ModernPlaylistModel {
    public final eml i;

    public g(Playlist playlist, String str, eml emlVar, abo aboVar) {
        super(str, emlVar, aboVar, playlist.b, playlist.c, playlist.x, playlist, 896);
        this.i = emlVar;
    }

    @Override // com.vk.music.playlist.ModernPlaylistModel
    public final q F(MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        l2 r0 = this.i.e(this.h.c, this.h.b).r0(io.reactivex.rxjava3.schedulers.a.b());
        lz lzVar = new lz(new cww(this, 11), 22);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return r0.E(lzVar, lVar, kVar, kVar).U(new k(new q520(1), 25)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
