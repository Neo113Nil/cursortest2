package com.vk.catalog2.feature.music.holders.curator;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicCurator;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh;
import com.vk.dto.music.Curator;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import xsna.b5a;
import xsna.b7a;
import xsna.c750;
import xsna.dcn;
import xsna.g0;
import xsna.g380;
import xsna.ikv0;
import xsna.pkv0;
import xsna.u2b0;

/* compiled from: CuratorInfoVh.kt */
/* loaded from: classes16.dex */
public final class CuratorInfoVh extends MusicPageInfoBlockVh implements g380 {
    public final c750 r;
    public final b7a s;
    public dcn t;

    public /* synthetic */ CuratorInfoVh(u2b0 u2b0Var, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, c750 c750Var, b7a b7aVar) {
        this(u2b0Var, b5aVar, searchStatInfoProvider, c750Var, b7aVar, null);
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Curator curator;
        super.N6(uIBlock);
        UIBlockMusicCurator uIBlockMusicCurator = uIBlock instanceof UIBlockMusicCurator ? (UIBlockMusicCurator) uIBlock : null;
        if (uIBlockMusicCurator == null || (curator = uIBlockMusicCurator.z) == null) {
            return;
        }
        TextView textView = this.g;
        if (textView == null) {
            textView = null;
        }
        textView.setText(R.string.music_curators_community);
        TextView textView2 = this.g;
        TextView textView3 = textView2 != null ? textView2 : null;
        String str = curator.c;
        textView3.setVisibility((str == null || str.length() <= 0) ? 4 : 0);
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final q<Integer> a(UIBlockMusicPage uIBlockMusicPage) {
        Curator curator;
        UIBlockMusicCurator uIBlockMusicCurator = uIBlockMusicPage instanceof UIBlockMusicCurator ? (UIBlockMusicCurator) uIBlockMusicPage : null;
        if (uIBlockMusicCurator == null || (curator = uIBlockMusicCurator.z) == null) {
            return null;
        }
        return this.r.c(curator);
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final int d() {
        return R.string.music_unfollow_curator;
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final void g(Context context) {
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_notification_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.music_curator_just_followed), Integer.MAX_VALUE), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.e = 7000L;
        pkv0.g(aVar, 0L);
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final void h() {
        View view = this.h;
        if (view == null) {
            view = null;
        }
        view.postDelayed(new g0(this, 9), 300L);
    }

    @Override // com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh
    public final q<Integer> j(UIBlockMusicPage uIBlockMusicPage) {
        Curator curator;
        UIBlockMusicCurator uIBlockMusicCurator = uIBlockMusicPage instanceof UIBlockMusicCurator ? (UIBlockMusicCurator) uIBlockMusicPage : null;
        if (uIBlockMusicCurator == null || (curator = uIBlockMusicCurator.z) == null) {
            return null;
        }
        return this.r.f(curator);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        dcn dcnVar = this.t;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
    }

    public CuratorInfoVh(u2b0 u2b0Var, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, c750 c750Var, b7a b7aVar, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        super(u2b0Var, b5aVar, searchStatInfoProvider, musicPlaybackLaunchContext);
        this.r = c750Var;
        this.s = b7aVar;
    }
}
