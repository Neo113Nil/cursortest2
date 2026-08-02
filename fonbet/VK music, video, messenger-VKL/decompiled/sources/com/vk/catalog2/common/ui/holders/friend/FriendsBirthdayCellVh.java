package com.vk.catalog2.common.ui.holders.friend;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfilesList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ams;
import xsna.c5g;
import xsna.c98;
import xsna.cks;
import xsna.gzs;
import xsna.iah0;
import xsna.j5g;
import xsna.nhi;
import xsna.oq;
import xsna.rd1;
import xsna.tlo0;

/* compiled from: FriendsBirthdayCellVh.kt */
/* loaded from: classes16.dex */
public final class FriendsBirthdayCellVh implements CatalogViewHolder, View.OnClickListener {
    public final cks b;
    public VkCell c;
    public UIBlockProfilesList d;

    /* compiled from: FriendsBirthdayCellVh.kt */
    public static final class a implements VkCell.f {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("UserStackViewParams(imageUrls="), this.a);
        }
    }

    public FriendsBirthdayCellVh(cks cksVar) {
        this.b = cksVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        cks cksVar;
        String str;
        UIBlockProfilesList uIBlockProfilesList = this.d;
        if (uIBlockProfilesList == null || (cksVar = this.b) == null || (str = uIBlockProfilesList.B) == null) {
            return;
        }
        cksVar.a(str, uIBlockProfilesList.b);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String quantityString;
        String string;
        String str;
        UIBlockProfilesList uIBlockProfilesList = uIBlock instanceof UIBlockProfilesList ? (UIBlockProfilesList) uIBlock : null;
        if (uIBlockProfilesList == null) {
            return;
        }
        List<CatalogUserMeta> list = uIBlockProfilesList.y;
        List<UserProfile> list2 = uIBlockProfilesList.z;
        if (list2.isEmpty()) {
            return;
        }
        List H0 = j5g.H0(list2, 2);
        ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            arrayList.add(((UserProfile) it.next()).h);
        }
        VkCell vkCell = this.c;
        if (vkCell == null) {
            vkCell = null;
        }
        float f = 56;
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new a(arrayList), new Size(iah0.a(f), iah0.a(f)))));
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.a aVar2 = tlo0.Companion;
        int size = list2.size();
        if (size < 2) {
            quantityString = "";
        } else if (size == 2) {
            VkCell vkCell2 = this.c;
            if (vkCell2 == null) {
                vkCell2 = null;
            }
            quantityString = vkCell2.getContext().getString(R.string.friends_catalog_and, list2.get(0).e, list2.get(1).e);
        } else {
            VkCell vkCell3 = this.c;
            if (vkCell3 == null) {
                vkCell3 = null;
            }
            int i = size - 2;
            quantityString = vkCell3.getContext().getResources().getQuantityString(R.plurals.friends_catalog_birthday_more_people, i, list2.get(0).e, list2.get(1).e, Integer.valueOf(i));
        }
        tlo0.h d = oq.d(aVar2, quantityString);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Middle.e eVar = new VkCell.Middle.e(d, 2, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
        if (list.isEmpty() || !list.get(0).Ab()) {
            VkCell vkCell4 = this.c;
            if (vkCell4 == null) {
                vkCell4 = null;
            }
            string = vkCell4.getContext().getString(R.string.friends_catalog_tomorrow);
        } else {
            VkCell vkCell5 = this.c;
            if (vkCell5 == null) {
                vkCell5 = null;
            }
            string = vkCell5.getContext().getString(R.string.friends_catalog_today);
        }
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, new VkCell.Middle.d(new tlo0.h(string), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
        vkCell.setRight((VkCell.Right.d) null);
        cks cksVar = this.b;
        if (cksVar != null && (str = uIBlockProfilesList.B) != null) {
            cksVar.d(str, uIBlockProfilesList.b);
        }
        this.d = uIBlockProfilesList;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkCell vkCell = new VkCell(layoutInflater.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.c(new rd1(21), new nhi(3));
        vkCell.setOnClickListener(new c98(this, 1));
        this.c = vkCell;
        return vkCell;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ams.a().h(view.getContext());
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
