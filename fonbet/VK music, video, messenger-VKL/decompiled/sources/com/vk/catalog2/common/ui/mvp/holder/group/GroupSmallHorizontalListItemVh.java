package com.vk.catalog2.common.ui.mvp.holder.group;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.BaseGroupVh;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;
import defpackage.q0;
import xsna.b5a;
import xsna.baf0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dha;
import xsna.dhr0;
import xsna.e43;
import xsna.eo1;
import xsna.f4m;
import xsna.imu;
import xsna.jjc;
import xsna.krv0;
import xsna.m33;
import xsna.m3a;
import xsna.ndu0;
import xsna.omf;
import xsna.oq;
import xsna.q3a;
import xsna.qb6;
import xsna.qoy;
import xsna.sng;
import xsna.t1e;
import xsna.tlo0;

/* compiled from: GroupSmallHorizontalListItemVh.kt */
/* loaded from: classes16.dex */
public final class GroupSmallHorizontalListItemVh extends BaseGroupVh {
    public final boolean h;
    public final m3a i;
    public final dha j;
    public VkTile k;
    public final imu l;

    /* compiled from: GroupSmallHorizontalListItemVh.kt */
    public static final class a implements VkTile.g {
        public final boolean a;
        public final FrameLayout b;
        public final VkAvatar c;
        public final VkImageSimple d;

        public a(Context context, boolean z) {
            this.a = z;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(View.generateViewId());
            frameLayout.setClipToPadding(false);
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setPlaceholderImage(new ColorDrawable(krv0.m(R.attr.vk_ui_background_secondary, context)));
            vkAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            frameLayout.addView(vkAvatar);
            this.c = vkAvatar;
            int b = cn70.b(24);
            VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
            vkImageSimple.setElevation(cn70.a() * 2.0f);
            vkImageSimple.setTranslationX(cn70.a() * 2.0f);
            vkImageSimple.setTranslationY(cn70.a() * 2.0f);
            vkImageSimple.setVisibility(8);
            vkImageSimple.setLayoutParams(new FrameLayout.LayoutParams(b, b, 8388693));
            frameLayout.post(new eo1(4, frameLayout, vkImageSimple));
            this.d = vkImageSimple;
            this.b = frameLayout;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.view.components.tile.VkTile.g
        public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
            Context context;
            if (hVar instanceof b) {
                boolean z = this.a;
                Object[] objArr = z && ((b) hVar).d;
                int b = cn70.b(56);
                int b2 = z ? cn70.b(2) + b : b;
                FrameLayout frameLayout = this.b;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = b;
                marginLayoutParams.height = b2;
                int b3 = cn70.b(4);
                int b4 = cn70.b(4);
                int i = marginLayoutParams.topMargin;
                int i2 = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(b3);
                marginLayoutParams.topMargin = i;
                marginLayoutParams.setMarginEnd(b4);
                marginLayoutParams.bottomMargin = i2;
                frameLayout.setLayoutParams(marginLayoutParams);
                Drawable drawable = null;
                drawable = null;
                drawable = null;
                drawable = null;
                VkAvatar vkAvatar = this.c;
                if (vkAvatar != null) {
                    if (z) {
                        f4m.v(cn70.b(2), vkAvatar);
                    }
                    vkAvatar.S0();
                    if (objArr == true) {
                        vkAvatar.W0(new ndu0(), true);
                        vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.b(null, true, null, null, 27));
                    } else {
                        vkAvatar.W0(null, false);
                    }
                    bwt0.S(vkAvatar, new t1e(hVar, 29));
                }
                b bVar = (b) hVar;
                Group group = bVar.b;
                boolean z2 = group.W;
                VkImageSimple vkImageSimple = this.d;
                if (z2 && !group.y.b && vkImageSimple != null && (context = vkImageSimple.getContext()) != null) {
                    baf0 baf0Var = new baf0(m33.a(R.drawable.vk_icon_verified_20, context), dhr0.t.c(R.attr.vk_ui_icon_secondary));
                    Drawable a = m33.a(R.drawable.bg_white_circle, context);
                    Context context2 = e43.a;
                    LayerDrawable layerDrawable = new LayerDrawable(new baf0[]{new baf0(a, (context2 != null ? context2 : null).getColor(dhr0.M() ? R.color.vk_gray_800 : R.color.vk_white)), baf0Var});
                    int b5 = cn70.b(18);
                    layerDrawable.setLayerGravity(0, 17);
                    layerDrawable.setLayerGravity(1, 17);
                    layerDrawable.setLayerSize(0, b5, b5);
                    layerDrawable.setLayerSize(1, b5, b5);
                    layerDrawable.setLayerInset(1, cn70.b(6), cn70.b(4), cn70.b(2), cn70.b(4));
                    drawable = layerDrawable;
                }
                if (drawable == null) {
                    VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                    drawable = VerifyInfoHelper.a.d(frameLayout.getContext(), true, bVar.b.y, (r14 & 8) != 0 ? false : false, (r14 & 16) != 0, (r14 & 32) != 0 ? false : bVar.c);
                }
                if (vkImageSimple != null) {
                    bwt0.p0(vkImageSimple, (drawable == null || objArr == true) ? false : true);
                }
                if (drawable == null) {
                    if (vkImageSimple != null) {
                        f4m.j(vkImageSimple);
                    }
                } else {
                    if (vkImageSimple != null) {
                        vkImageSimple.setImageDrawable(drawable);
                    }
                    if (vkImageSimple != null) {
                        vkImageSimple.setVisibility(0);
                    }
                }
            }
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final View getView() {
            return this.b;
        }
    }

    /* compiled from: GroupSmallHorizontalListItemVh.kt */
    public static final class b implements VkTile.h {
        public final omf a;
        public final Group b;
        public final boolean c;
        public final boolean d;

        public b(omf omfVar, Group group, boolean z, boolean z2) {
            this.a = omfVar;
            this.b = group;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisualContentParams(avatarUrl=");
            sb.append(this.a);
            sb.append(", group=");
            sb.append(this.b);
            sb.append(", trustMarkEnabled=");
            sb.append(this.c);
            sb.append(", hasLiveBadge=");
            return q0.a(sb, this.d, ')');
        }
    }

    public GroupSmallHorizontalListItemVh(m3a m3aVar, sng sngVar, b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
        this.h = true;
        this.i = m3aVar;
        this.j = sngVar;
        this.l = new imu();
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        if (uIBlock instanceof UIBlockGroup) {
            Group group = ((UIBlockGroup) uIBlock).y;
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            VerifyInfo verifyInfo = group.y;
            VkTile vkTile = this.k;
            if (vkTile == null) {
                vkTile = null;
            }
            String c = VerifyInfoHelper.c(vkTile.getContext(), verifyInfo);
            VkTile vkTile2 = this.k;
            if (vkTile2 == null) {
                vkTile2 = null;
            }
            vkTile2.setTitle(new VkTile.e(oq.d(tlo0.Companion, group.d), 2, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
            VkTile vkTile3 = this.k;
            if (vkTile3 == null) {
                vkTile3 = null;
            }
            vkTile3.setVisualContentParams(new b(new omf(group, 23), group, this.h, g()));
            VkTile vkTile4 = this.k;
            if (vkTile4 == null) {
                vkTile4 = null;
            }
            jjc.g(vkTile4, new qb6(14, this, group));
            VkTile vkTile5 = this.k;
            (vkTile5 != null ? vkTile5 : null).setContentDescription(group.d + '\n' + c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkTile vkTile = new VkTile(layoutInflater.getContext(), null, 6);
        this.k = vkTile;
        vkTile.setTextAlignment(VkTile.TextAlignment.Center);
        vkTile.setDecorator(this.l);
        vkTile.setClipToPadding(false);
        vkTile.setVisualContentController(new a(vkTile.getContext(), ((Boolean) this.f.getValue()).booleanValue()));
        return vkTile;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
