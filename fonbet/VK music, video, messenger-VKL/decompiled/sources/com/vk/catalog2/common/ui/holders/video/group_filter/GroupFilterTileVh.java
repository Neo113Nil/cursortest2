package com.vk.catalog2.common.ui.holders.video.group_filter;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.BaseGroupVh;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.avatar.badge.d;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.group.Group;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.b5a;
import xsna.bo3;
import xsna.buz;
import xsna.cer;
import xsna.cfp0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.eko;
import xsna.eph;
import xsna.epx;
import xsna.f4m;
import xsna.f870;
import xsna.frg;
import xsna.gd4;
import xsna.hbh0;
import xsna.jjc;
import xsna.l6u;
import xsna.ndu0;
import xsna.oq;
import xsna.q3a;
import xsna.tlo0;
import xsna.u4e;
import xsna.zrp;

/* compiled from: GroupFilterTileVh.kt */
/* loaded from: classes16.dex */
public final class GroupFilterTileVh extends BaseGroupVh implements View.OnClickListener {
    public final Size h;
    public final boolean i;
    public final boolean j;
    public Group k;
    public UIBlockGroupFilter l;
    public VkTile m;
    public final boolean n;
    public final a o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupFilterTileVh.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Normal;

        static {
            Size size = new Size("Normal", 0);
            Normal = size;
            Size[] sizeArr = {size};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupFilterTileVh(SearchStatInfoProvider searchStatInfoProvider, q3a q3aVar, b5a b5aVar) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
        Size size = Size.Normal;
        this.h = size;
        this.i = true;
        this.j = true;
        VideoFeatures videoFeatures = VideoFeatures.LIVE_BADGE_IN_SUBS;
        videoFeatures.getClass();
        this.n = b.A.a(videoFeatures);
        this.o = new a(this);
    }

    public static boolean p(UIBlockList uIBlockList, UIBlockGroupFilter uIBlockGroupFilter) {
        ArrayList<UIBlock> arrayList = uIBlockList.y;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (UIBlock uIBlock : arrayList) {
            if ((uIBlock instanceof UIBlockList) && epx.f(uIBlockGroupFilter.B, uIBlock.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (!(uIBlock instanceof UIBlockGroupFilter)) {
            this.l = null;
            VkTile vkTile = this.m;
            if (vkTile != null) {
                vkTile.setAlpha(1.0f);
            }
            super.N6(uIBlock);
            q(uIBlock);
            return;
        }
        UIBlockGroupFilter uIBlockGroupFilter = (UIBlockGroupFilter) uIBlock;
        UIBlockGroup uIBlockGroup = uIBlockGroupFilter.y;
        this.l = uIBlockGroupFilter;
        VkTile vkTile2 = this.m;
        if (vkTile2 != null) {
            vkTile2.setAlpha(uIBlockGroupFilter.C ? 0.15f : 1.0f);
        }
        super.N6(uIBlockGroup);
        q(uIBlockGroup);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkTile vkTile = new VkTile(layoutInflater.getContext(), null, 6);
        vkTile.setDecorator(this.o);
        vkTile.setClipToPadding(false);
        jjc.g(vkTile, new l6u(this, 3));
        f4m.t(e3m.a(R.dimen.vk_ui_spacing_size2_xs, vkTile.getContext()), vkTile);
        f4m.v(e3m.a(R.dimen.vk_ui_spacing_size_xl, vkTile.getContext()), vkTile);
        int a = e3m.a(R.dimen.vk_ui_spacing_size_s, vkTile.getContext());
        f4m.l(a, a, vkTile);
        this.m = vkTile;
        return vkTile;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockGroupFilter uIBlockGroupFilter = this.l;
        if (uIBlockGroupFilter == null) {
            h(view.getContext(), this.k, null, null, null);
            return;
        }
        n(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
        b5a b5aVar = this.b;
        if (b5aVar != null) {
            b5aVar.a(new cfp0(uIBlockGroupFilter, null));
        }
        q3a q3aVar = this.c;
        if (q3aVar != null) {
            q3aVar.b(new buz(12, new eph(uIBlockGroupFilter, this), new bo3(uIBlockGroupFilter, this)), false);
        }
        if (q3aVar != null) {
            q3aVar.b(new buz(12, new frg(uIBlockGroupFilter, this), new gd4(uIBlockGroupFilter, 4)), false);
        }
        CatalogFilterData catalogFilterData = uIBlockGroupFilter.z;
        if (catalogFilterData.e) {
            catalogFilterData = uIBlockGroupFilter.A;
        }
        if (q3aVar != null) {
            q3aVar.b(new cer(8, catalogFilterData.b, this.n ? "video_subscriptions" : null, new u4e(uIBlockGroupFilter, 26), false), false);
        }
    }

    public final void q(UIBlock uIBlock) {
        Drawable d;
        if (uIBlock instanceof UIBlockGroup) {
            Group group = ((UIBlockGroup) uIBlock).y;
            VerifyInfo verifyInfo = group.y;
            VkTile vkTile = this.m;
            if (vkTile == null) {
                return;
            }
            this.k = group;
            vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, group.d), 1, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            d = VerifyInfoHelper.a.d(vkTile.getContext(), this.i, verifyInfo, (r14 & 8) != 0 ? false : false, (r14 & 16) != 0, (r14 & 32) != 0 ? false : this.j);
            d bVar = (g() && this.n) ? new com.vk.core.view.components.avatar.badge.b(null, true, null, null, 27) : d != null ? new com.vk.core.view.components.avatar.badge.a(d, false, VkAvatarBadge.Alignment.BottomRight, (String) null, 24) : null;
            vkTile.setVisualContent(new VkTile.f.a(new c.d(f870.s(group, hbh0.b(cn70.b(60), vkTile.getContext())), new eko(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)))), new android.util.Size(cn70.b(60), cn70.b(60)), g() ? new ndu0() : null, bVar != null ? Collections.singletonList(bVar) : EmptyList.b, 0, 36));
            StringBuilder sb = new StringBuilder();
            sb.append(group.d);
            sb.append(" ");
            Context context = e43.a;
            sb.append(VerifyInfoHelper.c(context != null ? context : null, verifyInfo));
            vkTile.setContentDescription(sb.toString());
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
