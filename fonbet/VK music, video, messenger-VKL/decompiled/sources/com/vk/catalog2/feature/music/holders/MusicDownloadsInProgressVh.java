package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.afs;
import xsna.asu0;
import xsna.c5g;
import xsna.lq40;
import xsna.mi40;
import xsna.msy;
import xsna.oc40;
import xsna.pa;
import xsna.q3a;
import xsna.u3u;
import xsna.u6k;
import xsna.w4u;

/* compiled from: MusicDownloadsInProgressVh.kt */
/* loaded from: classes16.dex */
public final class MusicDownloadsInProgressVh implements CatalogViewHolder {
    public final lq40 b;
    public final oc40 c;
    public final q3a d;
    public UIBlockList e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new w4u(this, 16));
    public final b g = new b();

    public MusicDownloadsInProgressVh(q3a q3aVar, oc40 oc40Var, lq40 lq40Var) {
        this.b = lq40Var;
        this.c = oc40Var;
        this.d = q3aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.g.e();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockList) {
            UIBlockList uIBlockList = (UIBlockList) uIBlock;
            this.e = uIBlockList;
            if (a().getItemCount() == 0) {
                mi40 a = a();
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (UIBlock uIBlock2 : arrayList) {
                    Playlist playlist = null;
                    UIBlockMusicPlaylist uIBlockMusicPlaylist = uIBlock2 instanceof UIBlockMusicPlaylist ? (UIBlockMusicPlaylist) uIBlock2 : null;
                    if (uIBlockMusicPlaylist != null) {
                        playlist = uIBlockMusicPlaylist.z;
                    }
                    arrayList2.add(playlist);
                }
                a.setItems(arrayList2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final mi40 a() {
        return (mi40) this.f.getValue();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j1 U = this.b.w().U(new pa(new u6k(this, 26), 28));
        asu0 asu0Var = asu0.a;
        this.g.b(U.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new afs(new u3u(this, 11), 7)));
        View inflate = layoutInflater.inflate(R.layout.catalog2_podcast_category, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.podcast_category_recycler);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new DownloadsLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(a());
        recyclerView.setHasFixedSize(true);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
