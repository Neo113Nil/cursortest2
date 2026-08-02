package com.vk.catalog2.common.ui.mvp.sticker;

import androidx.recyclerview.widget.m;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xsna.c5g;
import xsna.d9l0;
import xsna.f870;
import xsna.if7;
import xsna.j5g;
import xsna.tba;
import xsna.u4a;

/* compiled from: StickersVerticalListVh.kt */
/* loaded from: classes16.dex */
public final class StickersVerticalListVh extends VerticalListVh {
    public final f870 G;

    public StickersVerticalListVh(d9l0 d9l0Var, c.h hVar, tba tbaVar, u4a u4aVar) {
        super(d9l0Var, hVar, tbaVar, u4aVar, null, false, 0, null, 992);
        this.G = new f870(16);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public final void N5(UIBlock uIBlock) {
        super.N5(v(uIBlock));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(v(uIBlock));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public final void dj(m.d dVar, List<? extends UIBlock> list, List<? extends UIBlock> list2, UIBlockList uIBlockList) {
        this.G.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            UIBlock uIBlock = (UIBlock) next;
            if ((uIBlock instanceof UIBlockList) && uIBlock.d == CatalogViewType.LIST_STICKERS_PREVIEW) {
                z = linkedHashSet.add(uIBlock.b);
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() != list2.size()) {
            super.dj(m.a(new if7(list, arrayList), true), list, arrayList, new UIBlockList(uIBlockList, arrayList));
        } else {
            super.dj(dVar, list, list2, uIBlockList);
        }
    }

    public final UIBlock v(UIBlock uIBlock) {
        if (!(uIBlock instanceof UIBlockList)) {
            return uIBlock;
        }
        UIBlockList uIBlockList = (UIBlockList) uIBlock;
        ArrayList arrayList = uIBlockList.y;
        ListDataSet.ArrayListImpl<UIBlock> arrayListImpl = this.h.d;
        this.G.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator<UIBlock> it = arrayListImpl.iterator();
        while (it.hasNext()) {
            UIBlock next = it.next();
            if (next instanceof UIBlockList) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((UIBlockList) next2).d == CatalogViewType.LIST_STICKERS_PREVIEW) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((UIBlockList) it3.next()).b);
        }
        Set S0 = j5g.S0(arrayList4);
        if (!S0.isEmpty()) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : arrayList) {
                UIBlock uIBlock2 = (UIBlock) obj;
                if (!(uIBlock2 instanceof UIBlockList) || uIBlock2.d != CatalogViewType.LIST_STICKERS_PREVIEW || !S0.contains(uIBlock2.b)) {
                    arrayList5.add(obj);
                }
            }
            arrayList = arrayList5;
        }
        return arrayList.size() != uIBlockList.y.size() ? new UIBlockList(uIBlockList, arrayList) : uIBlock;
    }
}
