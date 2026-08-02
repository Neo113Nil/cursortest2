package com.vk.catalog2.feature.news.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.news.model.UIBlockFeed;
import com.vk.core.ui.tracking.UiTrackingScreen;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.c5a;
import xsna.c5f;
import xsna.cui;
import xsna.dha;
import xsna.dnt0;
import xsna.ent0;
import xsna.f8q;
import xsna.gzs;
import xsna.hc1;
import xsna.iym;
import xsna.k5h;
import xsna.lym;
import xsna.mwh0;
import xsna.owh0;
import xsna.qi6;
import xsna.s3q0;
import xsna.y1c0;

/* compiled from: FeedVh.kt */
/* loaded from: classes16.dex */
public final class FeedVh implements CatalogViewHolder, ent0, c5a {
    public final int b;
    public final y1c0 c;
    public final dha d;
    public qi6<?> e;
    public hc1 f;

    public FeedVh(int i, y1c0 y1c0Var, dha dhaVar) {
        this.b = i;
        this.c = y1c0Var;
        this.d = dhaVar;
    }

    @Override // xsna.c5a
    public final void K0(gzs<s3q0> gzsVar) {
        this.f = (hc1) gzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockFeed uIBlockFeed = uIBlock instanceof UIBlockFeed ? (UIBlockFeed) uIBlock : null;
        if (uIBlockFeed == null) {
            return;
        }
        qi6<?> qi6Var = this.e;
        if (qi6Var != 0) {
            mwh0 mwh0Var = new mwh0(qi6Var.itemView.getContext(), new k5h(this, 14));
            qi6Var.M6(mwh0Var);
            qi6Var.O6(mwh0Var);
            owh0 owh0Var = new owh0(qi6Var.itemView.getContext(), new c5f(this, 17));
            qi6Var.A = owh0Var;
            if (qi6Var instanceof cui) {
                ((cui) qi6Var).q5(qi6Var.l6(), owh0Var);
            }
            qi6Var.a6(uIBlockFeed.y);
            if (qi6Var instanceof iym) {
                iym iymVar = (iym) qi6Var;
                lym lymVar = iymVar.Q;
                if (iymVar.C == 0) {
                    lymVar.setSeparatorVisibility(false);
                } else {
                    lymVar.setSeparatorVisibility(true);
                }
            }
        }
        UsableRecyclerView.j jVar = this.e;
        f8q f8qVar = jVar instanceof f8q ? (f8q) jVar : null;
        if (f8qVar != null) {
            f8qVar.K0(this.f);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qi6<?> a = this.c.a(this.b, viewGroup);
        this.e = a;
        return a.itemView;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        UsableRecyclerView.j jVar = this.e;
        ent0 ent0Var = jVar instanceof ent0 ? (ent0) jVar : null;
        if (ent0Var != null) {
            return ent0Var.q3();
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
