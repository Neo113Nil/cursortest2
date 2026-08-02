package com.vk.catalog2.common.ui.holders.friend;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfilesList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.dto.user.UserProfile;
import com.vk.movika.sdk.base.utils.b;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.arm0;
import xsna.c5g;
import xsna.hbh0;
import xsna.j5g;
import xsna.js5;
import xsna.rv4;
import xsna.tlo0;
import xsna.tq;
import xsna.v9b;

/* compiled from: FriendsRequestsIncomingVh.kt */
/* loaded from: classes16.dex */
public final class FriendsRequestsIncomingVh implements CatalogViewHolder {
    public VkCell b;

    /* compiled from: FriendsRequestsIncomingVh.kt */
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

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkCounter.CounterAppearance.Appearance appearance;
        VkCounter.Mode mode;
        UIBlockProfilesList uIBlockProfilesList = uIBlock instanceof UIBlockProfilesList ? (UIBlockProfilesList) uIBlock : null;
        if (uIBlockProfilesList == null) {
            return;
        }
        List<UserProfile> list = uIBlockProfilesList.z;
        CatalogBadge catalogBadge = uIBlockProfilesList.A;
        if (catalogBadge == null) {
            catalogBadge = new CatalogBadge(String.valueOf(list.size()), X3.i.Y);
        }
        String str = catalogBadge.c;
        int hashCode = str.hashCode();
        if (hashCode == -1726194350) {
            if (str.equals(X3.i.T)) {
                appearance = VkCounter.CounterAppearance.Appearance.Neutral;
                mode = VkCounter.Mode.Primary;
            }
            appearance = VkCounter.CounterAppearance.Appearance.Neutral;
            mode = VkCounter.Mode.Primary;
        } else if (hashCode != -804936122) {
            if (hashCode == -314765822 && str.equals("primary")) {
                appearance = VkCounter.CounterAppearance.Appearance.Accent;
                mode = VkCounter.Mode.Primary;
            }
            appearance = VkCounter.CounterAppearance.Appearance.Neutral;
            mode = VkCounter.Mode.Primary;
        } else {
            if (str.equals("prominent")) {
                appearance = VkCounter.CounterAppearance.Appearance.AccentRed;
                mode = VkCounter.Mode.Primary;
            }
            appearance = VkCounter.CounterAppearance.Appearance.Neutral;
            mode = VkCounter.Mode.Primary;
        }
        Integer m = arm0.m(10, catalogBadge.b);
        int intValue = m != null ? m.intValue() : 1;
        VkCell.Right.d a2 = VkCell.Right.c.a(VkCell.Right.Companion, intValue > 1 ? new VkCell.Right.a.d(intValue, appearance, mode) : null, null, null, null, 30);
        VkCell vkCell = this.b;
        if (vkCell == null) {
            vkCell = null;
        }
        vkCell.setRight(a2);
        VkCell vkCell2 = this.b;
        if (vkCell2 == null) {
            vkCell2 = null;
        }
        vkCell2.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.friends_catalog_requests), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
        VkCell.Left.a aVar = VkCell.Left.Companion;
        List H0 = j5g.H0(list, 3);
        ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            String str2 = ((UserProfile) it.next()).g;
            VkCell vkCell3 = this.b;
            if (vkCell3 == null) {
                vkCell3 = null;
            }
            String a3 = js5.a(hbh0.b(56, vkCell3.getContext()), str2);
            if (a3 == null) {
                a3 = "";
            }
            arrayList.add(a3);
        }
        VkCell.Left.b a4 = VkCell.Left.a.a(aVar, new VkCell.Left.Main.e(new a(arrayList), new Size(-2, -2)));
        VkCell vkCell4 = this.b;
        if (vkCell4 == null) {
            vkCell4 = null;
        }
        vkCell4.setLeft(a4);
        VkCell vkCell5 = this.b;
        (vkCell5 != null ? vkCell5 : null).setOnClickListener(new v9b(this, 3));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_friends_old_requests, viewGroup, false);
        VkCell vkCell = (VkCell) inflate;
        this.b = vkCell;
        if (vkCell == null) {
            vkCell = null;
        }
        vkCell.c(new b(26), new rv4((byte) 0, 2));
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

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
