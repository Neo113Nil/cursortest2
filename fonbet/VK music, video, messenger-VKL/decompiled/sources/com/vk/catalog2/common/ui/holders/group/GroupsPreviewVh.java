package com.vk.catalog2.common.ui.holders.group;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPreview;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c98;
import xsna.com;
import xsna.d69;
import xsna.epx;
import xsna.gzs;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.k1u0;
import xsna.maz;
import xsna.ms9;
import xsna.oq;
import xsna.tlo0;

/* compiled from: GroupsPreviewVh.kt */
/* loaded from: classes16.dex */
public final class GroupsPreviewVh implements CatalogViewHolder, View.OnClickListener {
    public final maz b;
    public VkCell c;
    public UIBlockPreview d;

    /* compiled from: GroupsPreviewVh.kt */
    public static final class a implements VkCell.f {
        public final List<String> a;

        public a(List<String> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UserStackViewParams(imageUrls="), this.a);
        }
    }

    public GroupsPreviewVh(maz mazVar) {
        this.b = mazVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkCell.Right.b bVar;
        UIBlockPreview uIBlockPreview = uIBlock instanceof UIBlockPreview ? (UIBlockPreview) uIBlock : null;
        if (uIBlockPreview == null) {
            return;
        }
        VkCell vkCell = this.c;
        if (vkCell == null) {
            vkCell = null;
        }
        VkCell.Left.a aVar = VkCell.Left.Companion;
        List<String> list = uIBlockPreview.y;
        List H0 = list != null ? j5g.H0(list, 2) : null;
        if (H0 == null) {
            H0 = EmptyList.b;
        }
        float f = 48;
        vkCell.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.e(new a(H0), new Size(iah0.a(f), iah0.a(f)))));
        VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
        tlo0.a aVar3 = tlo0.Companion;
        String str = uIBlockPreview.z;
        if (str == null) {
            str = "";
        }
        tlo0.h d = oq.d(aVar3, str);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Middle.e eVar = new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
        String str2 = uIBlockPreview.A;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar2, eVar, new VkCell.Middle.d(new tlo0.h(str2 != null ? str2 : ""), (gzs) null, 2, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
        VkCell.Right.c cVar = VkCell.Right.Companion;
        VkCell.Right.b bVar2 = new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7);
        List<UIBlockAction> list2 = uIBlockPreview.B;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((UIBlockAction) it.next()) instanceof UIBlockActionOpenUrl) {
                    bVar = bVar2;
                    break;
                }
            }
        }
        bVar = null;
        vkCell.setRight(VkCell.Right.c.a(cVar, null, null, null, bVar, 23));
        this.d = uIBlockPreview;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_groups_preview_item, viewGroup, false);
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.root);
        vkCell.c(new com(8), new d69((byte) 0, 2));
        vkCell.setOnClickListener(new c98(this, 1));
        this.c = vkCell;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActionOpenUrl actionOpenUrl;
        String str;
        UIBlockPreview uIBlockPreview = this.d;
        if (uIBlockPreview == null) {
            return;
        }
        List<UIBlockAction> list = uIBlockPreview.B;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof UIBlockActionOpenUrl) {
                arrayList.add(obj);
            }
        }
        UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) j5g.a0(arrayList);
        if (uIBlockActionOpenUrl == null || (actionOpenUrl = uIBlockActionOpenUrl.A) == null || (str = actionOpenUrl.c) == null) {
            return;
        }
        maz.c(this.b, view.getContext(), str, LaunchContext.A, null, null, 24);
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
