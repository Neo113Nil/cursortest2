package com.vk.catalog2.common.ui.mvp.holder.container;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.asu0;
import xsna.bn3;
import xsna.c2u;
import xsna.fpf0;
import xsna.iah0;
import xsna.pgn;
import xsna.q3a;
import xsna.qcy;
import xsna.u4a;
import xsna.wv4;

/* compiled from: HorizontalScrollableListVh.kt */
/* loaded from: classes16.dex */
public final class HorizontalScrollableListVh extends HorizontalNonScrollableListVh {
    public static final /* synthetic */ qcy<Object>[] m;
    public HorizontalScrollView j;
    public final q3a k;
    public final pgn l;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(HorizontalScrollableListVh.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        m = new qcy[]{mutablePropertyReference1Impl};
    }

    public HorizontalScrollableListVh(com.vk.catalog2.common.ui.mvp.configuration.a aVar, u4a u4aVar, int i, Integer num, int i2) {
        super(aVar, u4aVar, (i2 & 4) != 0 ? 0 : i, num, iah0.a(16));
        this.k = u4aVar.b.e;
        this.l = new pgn();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalNonScrollableListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        qcy<Object> qcyVar = m[0];
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.l.b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalNonScrollableListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ArrayList<UIBlock> arrayList;
        super.N6(uIBlock);
        UIBlockButtons uIBlockButtons = this.g;
        if (uIBlockButtons == null || (arrayList = uIBlockButtons.y) == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof UIBlockActionFilter) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((UIBlockActionFilter) it.next()).z.e) {
                break;
            } else {
                i++;
            }
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup == null) {
            viewGroup = null;
        }
        View childAt = viewGroup.getChildAt(i);
        if (childAt == null) {
            return;
        }
        childAt.post(new wv4(10, this, childAt));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalNonScrollableListVh
    public final void b(LinearLayout.LayoutParams layoutParams) {
        layoutParams.width = -2;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalNonScrollableListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(layoutInflater.getContext());
        this.j = horizontalScrollView;
        horizontalScrollView.setLayoutParams(k5.getLayoutParams());
        HorizontalScrollView horizontalScrollView2 = this.j;
        if (horizontalScrollView2 == null) {
            horizontalScrollView2 = null;
        }
        horizontalScrollView2.setHorizontalScrollBarEnabled(false);
        k5.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        HorizontalScrollView horizontalScrollView3 = this.j;
        if (horizontalScrollView3 == null) {
            horizontalScrollView3 = null;
        }
        horizontalScrollView3.addView(k5);
        io.reactivex.rxjava3.disposables.c subscribe = this.k.a().a0(asu0.a.d()).subscribe(new bn3(new c2u(this, 2), 29));
        qcy<Object> qcyVar = m[0];
        this.l.b(subscribe);
        HorizontalScrollView horizontalScrollView4 = this.j;
        if (horizontalScrollView4 == null) {
            return null;
        }
        return horizontalScrollView4;
    }
}
