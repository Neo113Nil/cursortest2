package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSaveAsPlaylistFromBlock;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import xsna.a8v;
import xsna.bk30;
import xsna.hg1;
import xsna.k840;
import xsna.l730;
import xsna.m20;
import xsna.o7;
import xsna.pyz;
import xsna.rsg0;
import xsna.tts;
import xsna.x2y;
import xsna.yr00;

/* compiled from: MusicActionSaveAsPlaylistButtonVh.kt */
/* loaded from: classes16.dex */
public final class MusicActionSaveAsPlaylistButtonVh extends MusicActionButtonVh {
    public final int g;
    public final int h;
    public Playlist i;
    public final b j;

    public MusicActionSaveAsPlaylistButtonVh(int i, int i2) {
        super(i, i2, R.string.music_add_playist_like_copy_label);
        this.g = i;
        this.h = R.string.music_add_playist_like_copy_label;
        this.j = new b();
    }

    @Override // com.vk.catalog2.feature.music.holders.MusicActionButtonVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.j.dispose();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        String str;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        Playlist playlist = this.i;
        b bVar = this.j;
        if (playlist != null) {
            k840.c.b(playlist, "PlaylistBottomSheetModel");
            bVar.b(hg1.m(ModernPlaylistModel.y(playlist), context, 0L, false, 62).subscribe(new tts(new x2y(this, 13), 14)));
            return;
        }
        UIBlock uIBlock = this.f;
        UIBlockActionSaveAsPlaylistFromBlock uIBlockActionSaveAsPlaylistFromBlock = uIBlock instanceof UIBlockActionSaveAsPlaylistFromBlock ? (UIBlockActionSaveAsPlaylistFromBlock) uIBlock : null;
        if (uIBlockActionSaveAsPlaylistFromBlock == null || (str = uIBlockActionSaveAsPlaylistFromBlock.z) == null) {
            return;
        }
        bVar.b(hg1.m(rsg0.y0(new l730(500, str, MusicPlaybackLaunchContext.n.t(), false), null, null, 3).L(new o7(new yr00(this, context), 23), false), context, 0L, false, 62).subscribe(new m20(new bk30(this, 1), 29), new a8v(new pyz(7), 6)));
    }
}
