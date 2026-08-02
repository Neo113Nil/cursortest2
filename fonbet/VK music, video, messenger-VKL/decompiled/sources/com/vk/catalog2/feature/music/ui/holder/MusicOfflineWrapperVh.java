package com.vk.catalog2.feature.music.ui.holder;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.newtork.b;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.d;
import java.util.Set;
import xsna.b140;
import xsna.bwt0;
import xsna.j5g;
import xsna.k840;
import xsna.m5y;
import xsna.meh;
import xsna.rl3;

/* compiled from: MusicOfflineWrapperVh.kt */
/* loaded from: classes16.dex */
public final class MusicOfflineWrapperVh implements CatalogViewHolder {
    public static final Set<String> f = rl3.y0(new String[]{"offline_music_replacement_artist", "offline_music_replacement_default", "offline_music_replacement_name", "offline_music_replacement_new_first", "offline_music_replacement_date_new", "offline_music_replacement_date_old"});
    public final CatalogViewHolder b;
    public c c;
    public View d;
    public boolean e;

    public MusicOfflineWrapperVh(CatalogViewHolder catalogViewHolder) {
        this.b = catalogViewHolder;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.L();
        c cVar = this.c;
        if (cVar != null) {
            cVar.dispose();
        }
        this.c = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.b.N6(uIBlock);
        this.e = j5g.P(f, uIBlock.f);
        b.a.getClass();
        a(b.d());
    }

    public final void a(boolean z) {
        if (this.e) {
            View view = this.d;
            if (view != null) {
                view.setAlpha(z ? 1.0f : 0.64f);
            }
            View view2 = this.d;
            if (view2 != null) {
                bwt0.j(view2, new meh(this, z, 1));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean c = k840.a.i.c();
        CatalogViewHolder catalogViewHolder = this.b;
        if (c) {
            return catalogViewHolder.k5(layoutInflater, viewGroup, bundle);
        }
        b bVar = b.a;
        bVar.getClass();
        d<com.vk.core.utils.newtork.d> dVar = b.d;
        dVar.getClass();
        this.c = new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new m5y(new b140(this, 1), 5));
        this.d = catalogViewHolder.k5(layoutInflater, viewGroup, bundle);
        bVar.getClass();
        a(b.d());
        return this.d;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.b.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        this.b.yh(i, uIBlock);
        this.e = j5g.P(f, uIBlock.f);
        b.a.getClass();
        a(b.d());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return this.b.ze(rect);
    }
}
