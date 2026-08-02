package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.e;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.player.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.c5g;
import xsna.cn70;
import xsna.e43;
import xsna.f4m;
import xsna.fpf0;
import xsna.i4e;
import xsna.j5g;
import xsna.pgn;
import xsna.pp3;
import xsna.qcy;
import xsna.u4a;

/* compiled from: ClipsMusicSelectorCatalogFullHeightListVh.kt */
/* loaded from: classes16.dex */
public final class ClipsMusicSelectorCatalogFullHeightListVh implements CatalogViewHolder {
    public static final /* synthetic */ qcy<Object>[] k;
    public final u4a b;
    public UIBlock c;
    public LayoutInflater d;
    public FullHeightList e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public final pgn i = new pgn();
    public final b j = new b();

    /* compiled from: ClipsMusicSelectorCatalogFullHeightListVh.kt */
    public static final class FullHeightList extends LinearLayout {
        public ClipsMusicSelectorCatalogFullHeightListVh b;
        public String c;

        public FullHeightList(Context context) {
            this(context, null, 0, 14, 0);
        }

        public final String getSectionId() {
            return this.c;
        }

        public final ClipsMusicSelectorCatalogFullHeightListVh getViewHolder() {
            return this.b;
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        }

        public final void setSectionId(String str) {
            this.c = str;
        }

        public final void setViewHolder(ClipsMusicSelectorCatalogFullHeightListVh clipsMusicSelectorCatalogFullHeightListVh) {
            this.b = clipsMusicSelectorCatalogFullHeightListVh;
        }

        public FullHeightList(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0, 12, 0);
        }

        public FullHeightList(Context context, AttributeSet attributeSet, int i) {
            this(context, attributeSet, i, 8, 0);
        }

        public /* synthetic */ FullHeightList(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
            this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
        }

        public FullHeightList(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }
    }

    /* compiled from: ClipsMusicSelectorCatalogFullHeightListVh.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            ClipsMusicSelectorCatalogFullHeightListVh clipsMusicSelectorCatalogFullHeightListVh = ClipsMusicSelectorCatalogFullHeightListVh.this;
            clipsMusicSelectorCatalogFullHeightListVh.b.b.i.P0(clipsMusicSelectorCatalogFullHeightListVh.j, true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ClipsMusicSelectorCatalogFullHeightListVh clipsMusicSelectorCatalogFullHeightListVh = ClipsMusicSelectorCatalogFullHeightListVh.this;
            clipsMusicSelectorCatalogFullHeightListVh.b.b.i.n0(clipsMusicSelectorCatalogFullHeightListVh.j);
        }
    }

    /* compiled from: ClipsMusicSelectorCatalogFullHeightListVh.kt */
    public static final class b implements e {
        public final /* synthetic */ e.a b = new e.a();

        public b() {
        }

        @Override // com.vk.music.player.e
        public final void B1() {
            this.b.getClass();
        }

        @Override // com.vk.music.player.e
        public final void K1() {
            this.b.getClass();
        }

        @Override // com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            ClipsMusicSelectorCatalogFullHeightListVh clipsMusicSelectorCatalogFullHeightListVh = ClipsMusicSelectorCatalogFullHeightListVh.this;
            UIBlock uIBlock = clipsMusicSelectorCatalogFullHeightListVh.c;
            if (uIBlock != null) {
                clipsMusicSelectorCatalogFullHeightListVh.N6(uIBlock);
            }
        }

        @Override // com.vk.music.player.e
        public final void W3(f fVar) {
            this.b.getClass();
        }

        @Override // com.vk.music.player.e
        public final void n3() {
            this.b.getClass();
        }

        @Override // com.vk.music.player.e
        public final void o2(f fVar) {
            this.b.getClass();
        }

        @Override // com.vk.music.player.e
        public final void onError(@Nullable String str) {
            this.b.getClass();
        }

        @Override // com.vk.music.player.e
        public final boolean t3(VkPlayerException vkPlayerException) {
            this.b.getClass();
            return false;
        }

        @Override // com.vk.music.player.e
        public final void x0() {
            this.b.getClass();
        }

        @Override // com.vk.music.player.e
        public final void y4(List<PlayerTrack> list) {
            this.b.getClass();
        }

        @Override // com.vk.music.player.e
        public final void z3() {
            this.b.getClass();
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ClipsMusicSelectorCatalogFullHeightListVh.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        k = new qcy[]{mutablePropertyReference1Impl};
    }

    public ClipsMusicSelectorCatalogFullHeightListVh(u4a u4aVar, UIBlock uIBlock) {
        this.b = u4aVar;
        this.c = uIBlock;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        FullHeightList fullHeightList = this.e;
        if (fullHeightList != null) {
            fullHeightList.setViewHolder(null);
        }
        FullHeightList fullHeightList2 = this.e;
        if (fullHeightList2 != null) {
            fullHeightList2.removeAllViews();
        }
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((CatalogViewHolder) it.next()).L();
            }
        }
        qcy<Object> qcyVar = k[0];
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.i.b;
        if (cVar != null) {
            cVar.dispose();
        }
        this.e = null;
        this.h = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ArrayList arrayList;
        CatalogViewHolder catalogViewHolder;
        if (!(uIBlock instanceof UIBlockList)) {
            return;
        }
        this.c = uIBlock;
        FullHeightList fullHeightList = this.e;
        if (fullHeightList != null) {
            fullHeightList.setSectionId(uIBlock.b);
        }
        LayoutInflater layoutInflater = this.d;
        if (layoutInflater == null) {
            return;
        }
        UIBlockList uIBlockList = (UIBlockList) uIBlock;
        Iterator<T> it = uIBlockList.y.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                if (z) {
                    FullHeightList fullHeightList2 = this.e;
                    if (fullHeightList2 != null) {
                        fullHeightList2.removeAllViews();
                    }
                    ArrayList arrayList2 = this.h;
                    if (arrayList2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((CatalogViewHolder) it2.next()).L();
                        }
                    }
                    ArrayList<UIBlock> arrayList3 = uIBlockList.y;
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                    for (UIBlock uIBlock2 : arrayList3) {
                        u4a u4aVar = this.b;
                        CatalogViewHolder w = u4aVar.b.s.w(uIBlock2.e, uIBlock2.d, uIBlock2.l, uIBlock2, u4aVar);
                        FullHeightList fullHeightList3 = this.e;
                        if (fullHeightList3 != null) {
                            fullHeightList3.addView(w.k5(layoutInflater, fullHeightList3, null));
                        }
                        w.N6(uIBlock2);
                        arrayList4.add(w);
                    }
                    this.h = arrayList4;
                    ArrayList<UIBlock> arrayList5 = uIBlockList.y;
                    ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                    Iterator<T> it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(((UIBlock) it3.next()).e);
                    }
                    this.f = arrayList6;
                    ArrayList<UIBlock> arrayList7 = uIBlockList.y;
                    ArrayList arrayList8 = new ArrayList(c5g.u(arrayList7, 10));
                    Iterator<T> it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(((UIBlock) it4.next()).d);
                    }
                    this.g = arrayList8;
                } else {
                    int i2 = 0;
                    for (Object obj : uIBlockList.y) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        UIBlock uIBlock3 = (UIBlock) obj;
                        if (!(uIBlock3 instanceof UIBlockHeader) && (arrayList = this.h) != null && (catalogViewHolder = (CatalogViewHolder) arrayList.get(i2)) != null) {
                            catalogViewHolder.N6(uIBlock3);
                        }
                        i2 = i3;
                    }
                }
                if (uIBlock.e == CatalogDataType.DATA_TYPE_FAVORITES) {
                    FullHeightList fullHeightList4 = this.e;
                    if (fullHeightList4 != null) {
                        f4m.y(cn70.b(10), fullHeightList4);
                        return;
                    }
                    return;
                }
                FullHeightList fullHeightList5 = this.e;
                if (fullHeightList5 != null) {
                    f4m.y(0, fullHeightList5);
                    return;
                }
                return;
            }
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            UIBlock uIBlock4 = (UIBlock) next;
            ArrayList arrayList9 = this.f;
            CatalogDataType catalogDataType = arrayList9 != null ? (CatalogDataType) j5g.b0(i, arrayList9) : null;
            ArrayList arrayList10 = this.g;
            CatalogViewType catalogViewType = arrayList10 != null ? (CatalogViewType) j5g.b0(i, arrayList10) : null;
            if (catalogDataType != uIBlock4.e || catalogViewType != uIBlock4.d) {
                z = true;
            }
            i = i4;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.d = layoutInflater;
        io.reactivex.rxjava3.disposables.c subscribe = this.b.b.e.a().subscribe(new pp3(new i4e(this, 3), 10));
        qcy<Object> qcyVar = k[0];
        this.i.b(subscribe);
        FullHeightList fullHeightList = this.e;
        if (fullHeightList == null) {
            FullHeightList fullHeightList2 = new FullHeightList(layoutInflater.getContext(), null, 0, 14, 0);
            fullHeightList2.setOrientation(1);
            fullHeightList2.setViewHolder(this);
            this.e = fullHeightList2;
            fullHeightList = fullHeightList2;
        }
        fullHeightList.addOnAttachStateChangeListener(new a());
        this.f = null;
        this.g = null;
        UIBlock uIBlock = this.c;
        if (uIBlock != null) {
            N6(uIBlock);
        }
        return fullHeightList;
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
