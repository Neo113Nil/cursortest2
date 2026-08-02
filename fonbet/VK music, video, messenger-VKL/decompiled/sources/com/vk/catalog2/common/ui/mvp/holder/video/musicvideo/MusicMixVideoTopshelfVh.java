package com.vk.catalog2.common.ui.mvp.holder.video.musicvideo;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockMusicMixTopshelf;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeTopshelfAction;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.dam;
import xsna.dnt0;
import xsna.ent0;
import xsna.g2u0;
import xsna.g470;
import xsna.glt0;
import xsna.iid0;
import xsna.mo40;
import xsna.nnt0;
import xsna.u4a;
import xsna.xh5;
import xsna.yg5;

/* compiled from: MusicMixVideoTopshelfVh.kt */
/* loaded from: classes16.dex */
public final class MusicMixVideoTopshelfVh implements CatalogViewHolder, View.OnClickListener, ent0 {
    public final u4a b;
    public g470 c;
    public ViewPager2 d;
    public mo40 e;
    public final LinkedHashMap f = new LinkedHashMap();
    public final b g = new b();
    public ViewGroup h;
    public glt0 i;

    /* compiled from: MusicMixVideoTopshelfVh.kt */
    public final class a extends ViewPager2.g {
        public int d;
        public boolean e;

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
            if (i == 1) {
                this.e = true;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            iid0 iid0Var = new iid0();
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsVideoStat$TypeTopshelfAction(i > this.d ? MobileOfficialAppsVideoStat$TypeTopshelfAction.EventType.TOPSHELF_NEXT_CARD_SHOW : MobileOfficialAppsVideoStat$TypeTopshelfAction.EventType.TOPSHELF_PREV_CARD_SHOW, this.e ? MobileOfficialAppsVideoStat$TypeTopshelfAction.EventSubtype.MANUAL : MobileOfficialAppsVideoStat$TypeTopshelfAction.EventSubtype.AUTO, ""), 3);
            iid0Var.f = c;
            iid0Var.g = b;
            iid0Var.q();
            this.d = i;
            this.e = false;
        }
    }

    public MusicMixVideoTopshelfVh(u4a u4aVar) {
        this.b = u4aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        glt0 glt0Var = this.i;
        if (glt0Var != null) {
            glt0Var.b();
        }
        ViewPager2 viewPager2 = this.d;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager2.setAdapter(null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        mo40 mo40Var;
        ViewGroup viewGroup = this.h;
        Activity c = viewGroup != null ? g2u0.c(viewGroup) : null;
        FragmentActivity fragmentActivity = c instanceof FragmentActivity ? (FragmentActivity) c : null;
        if (fragmentActivity != null) {
            mo40 mo40Var2 = new mo40(fragmentActivity, this.b.b.c, this.f);
            this.e = mo40Var2;
            ViewPager2 viewPager2 = this.d;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            viewPager2.setAdapter(mo40Var2);
        }
        if ((uIBlock instanceof UIBlockMusicMixTopshelf ? (UIBlockMusicMixTopshelf) uIBlock : null) == null || (mo40Var = this.e) == null) {
            return;
        }
        mo40Var.n = (UIBlockMusicMixTopshelf) uIBlock;
        mo40Var.notifyDataSetChanged();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        float f;
        g470 g470Var = new g470(layoutInflater.getContext());
        g470Var.setId(R.id.video_topshelf_root);
        g470Var.setContentDescription("video_topshelf_root");
        this.c = g470Var;
        this.h = viewGroup;
        ViewPager2 viewPager2 = new ViewPager2(layoutInflater.getContext());
        this.d = viewPager2;
        viewPager2.setLayoutParams(new ConstraintLayout.b(-1, -1));
        a aVar = new a();
        aVar.d = -1;
        viewPager2.b(aVar);
        viewPager2.setOffscreenPageLimit(-1);
        ViewPager2 viewPager22 = this.d;
        if (viewPager22 == null) {
            viewPager22 = null;
        }
        View childAt = viewPager22.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        this.i = recyclerView != null ? new glt0(recyclerView, new dam(20)) : null;
        g470Var.addView(viewPager2);
        g470 g470Var2 = this.c;
        if (g470Var2 == null) {
            g470Var2 = null;
        }
        int i = g470Var2.getContext().getResources().getDisplayMetrics().widthPixels;
        boolean z = this.b.b.c;
        if (z) {
            g470 g470Var3 = this.c;
            if (g470Var3 == null) {
                g470Var3 = null;
            }
            f = g470Var3.getResources().getDimension(R.dimen.video_topshelf_tablet_height);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            f = i / 0.89285713f;
        }
        int i2 = (int) f;
        g470 g470Var4 = this.c;
        (g470Var4 != null ? g470Var4 : null).setLayoutParams(new GridLayoutManager.b(-1, i2));
        return g470Var;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.g;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    /* compiled from: MusicMixVideoTopshelfVh.kt */
    public final class b implements nnt0 {
        public boolean b;

        public b() {
        }

        @Override // xsna.dnt0
        public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
            return null;
        }

        @Override // xsna.dnt0
        public final boolean getVideoFocused() {
            return this.b;
        }

        @Override // xsna.nnt0
        public final xh5 i() {
            MusicMixVideoTopshelfVh musicMixVideoTopshelfVh = MusicMixVideoTopshelfVh.this;
            LinkedHashMap linkedHashMap = musicMixVideoTopshelfVh.f;
            ViewPager2 viewPager2 = musicMixVideoTopshelfVh.d;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            xh5 xh5Var = (xh5) linkedHashMap.get(Integer.valueOf(viewPager2.getCurrentItem()));
            yg5 yg5Var = xh5Var != null ? xh5Var.a : null;
            ViewPager2 viewPager22 = musicMixVideoTopshelfVh.d;
            if (viewPager22 == null) {
                viewPager22 = null;
            }
            xh5 xh5Var2 = (xh5) linkedHashMap.get(Integer.valueOf(viewPager22.getCurrentItem()));
            VideoTextureView c = xh5Var2 != null ? xh5Var2.c() : null;
            if (yg5Var == null || c == null) {
                return null;
            }
            return new xh5(yg5Var, yg5Var.getConfig(), c, null, null);
        }

        @Override // xsna.nnt0
        public final void onPause() {
            glt0 glt0Var = MusicMixVideoTopshelfVh.this.i;
            if (glt0Var != null) {
                glt0Var.b();
            }
        }

        @Override // xsna.dnt0
        public final void setVideoFocused(boolean z) {
            this.b = z;
        }

        @Override // xsna.nnt0
        public final void onResume() {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
