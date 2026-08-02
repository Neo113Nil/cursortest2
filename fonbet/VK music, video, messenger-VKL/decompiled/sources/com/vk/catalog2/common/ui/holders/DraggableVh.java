package com.vk.catalog2.common.ui.holders;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.DraggableVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.c98;
import xsna.cho;
import xsna.dnt0;
import xsna.enj;
import xsna.ent0;
import xsna.g380;
import xsna.iho;
import xsna.lca;
import xsna.ozf0;
import xsna.vf1;

/* compiled from: DraggableVh.kt */
/* loaded from: classes16.dex */
public final class DraggableVh implements CatalogViewHolder, View.OnClickListener, cho, ent0, g380 {
    public final CatalogViewHolder b;
    public final Integer c;
    public ImageView d;
    public ImageView e;
    public View f;
    public View g;
    public UIBlock h;
    public boolean i;
    public vf1 j;
    public lca k;
    public Drawable l;
    public Drawable m;

    @SuppressLint({"ClickableViewAccessibility"})
    public final iho n;
    public boolean o;

    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.iho] */
    public DraggableVh(CatalogViewHolder catalogViewHolder, int i) {
        Integer valueOf = (i & 2) != 0 ? null : Integer.valueOf(R.layout.catalog_draggable_music_vertical_list_layout);
        this.b = catalogViewHolder;
        this.c = valueOf;
        this.n = new View.OnTouchListener() { // from class: xsna.iho
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                vf1 vf1Var;
                if (motionEvent.getActionMasked() != 0 || (vf1Var = DraggableVh.this.j) == null) {
                    return false;
                }
                vf1Var.invoke();
                return false;
            }
        };
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.L();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.h = uIBlock;
        this.b.N6(uIBlock);
        a();
    }

    public final void a() {
        UIBlock uIBlock = this.h;
        if (uIBlock == null) {
            return;
        }
        ozf0 ozf0Var = new ozf0(uIBlock.Fb(), uIBlock.Fb(), uIBlock.Gb(), uIBlock.Gb(), 1);
        lca lcaVar = this.k;
        if (lcaVar == null) {
            lcaVar = null;
        }
        boolean contains = lcaVar.l.contains(ozf0Var);
        this.o = contains;
        ImageView imageView = this.d;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(contains ? this.l : this.m);
        ImageView imageView2 = this.d;
        ImageView imageView3 = imageView2 == null ? null : imageView2;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView3.setContentDescription(imageView2.getContext().getString(this.o ? R.string.accessibility_restore : R.string.accessibility_remove));
        View view = this.f;
        if (view == null) {
            view = null;
        }
        bwt0.a0(view, !this.o);
        ImageView imageView4 = this.e;
        bwt0.a0(imageView4 != null ? imageView4 : null, !this.o);
    }

    @Override // xsna.cho
    public final void d(boolean z) {
        UIBlock uIBlock = this.h;
        if (uIBlock == null || !uIBlock.Nb()) {
            return;
        }
        this.i = z;
        ImageView imageView = this.e;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.p0(imageView, z);
        ImageView imageView2 = this.d;
        if (imageView2 == null) {
            imageView2 = null;
        }
        bwt0.p0(imageView2, z);
        CatalogViewHolder catalogViewHolder = this.b;
        cho choVar = catalogViewHolder instanceof cho ? (cho) catalogViewHolder : null;
        if (choVar != null) {
            choVar.d(z);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer num = this.c;
        View inflate = layoutInflater.inflate(num != null ? num.intValue() : R.layout.catalog_draggable_vertical_list_layout, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        if (this.l == null) {
            this.l = enj.e(R.drawable.vk_icon_add_24, R.attr.vk_ui_icon_secondary, layoutInflater.getContext());
        }
        if (this.m == null) {
            this.m = enj.e(R.drawable.vk_icon_cancel_24, R.attr.vk_ui_icon_secondary, layoutInflater.getContext());
        }
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.iv_move);
        imageView.setOnTouchListener(this.n);
        this.e = imageView;
        ImageView imageView2 = (ImageView) viewGroup2.findViewById(R.id.iv_close);
        imageView2.setOnClickListener(new c98(this, 1));
        this.d = imageView2;
        View k5 = this.b.k5(layoutInflater, viewGroup2, bundle);
        k5.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.hho
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DraggableVh.this.i;
            }
        });
        this.f = k5;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.content_container);
        View view = this.f;
        if (view == null) {
            view = null;
        }
        viewGroup3.addView(view);
        this.g = inflate;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlock uIBlock = this.h;
        if (uIBlock == null) {
            return;
        }
        ozf0 ozf0Var = new ozf0(uIBlock.Fb(), uIBlock.Fb(), uIBlock.Gb(), uIBlock.Gb(), 1);
        lca lcaVar = this.k;
        if (lcaVar == null) {
            lcaVar = null;
        }
        if (lcaVar.l.contains(ozf0Var)) {
            lca lcaVar2 = this.k;
            (lcaVar2 != null ? lcaVar2 : null).l.remove(ozf0Var);
        } else {
            lca lcaVar3 = this.k;
            (lcaVar3 != null ? lcaVar3 : null).l.add(ozf0Var);
        }
        a();
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        CatalogViewHolder catalogViewHolder = this.b;
        g380 g380Var = catalogViewHolder instanceof g380 ? (g380) catalogViewHolder : null;
        if (g380Var != null) {
            g380Var.onConfigurationChanged(configuration);
        }
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        CatalogViewHolder catalogViewHolder = this.b;
        ent0 ent0Var = catalogViewHolder instanceof ent0 ? (ent0) catalogViewHolder : null;
        if (ent0Var != null) {
            return ent0Var.q3();
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        this.h = uIBlock;
        this.b.yh(i, uIBlock);
        a();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return this.b.ze(rect);
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
