package com.vk.catalog2.common.ui.holders.apps;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockApp;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.vkui.LinkCellVh;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.games.CatalogMiniAppItem;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.b5a;
import xsna.bwt0;
import xsna.cfp0;
import xsna.cn70;
import xsna.cqm0;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.k1u0;
import xsna.k63;
import xsna.k7a;
import xsna.l63;
import xsna.l7m;
import xsna.msy;
import xsna.oq;
import xsna.p0v0;
import xsna.tlo0;
import xsna.tq;
import xsna.zd3;
import xsna.zjt;

/* compiled from: AppLinkVh.kt */
/* loaded from: classes16.dex */
public final class AppLinkVh extends LinkCellVh implements View.OnClickListener {
    public final int s;
    public final int t;
    public UIBlockApp u;
    public final Object v;
    public final Object w;

    /* compiled from: AppLinkVh.kt */
    public static final class a implements VkCell.f {
        public final Photo a;

        public a(Photo photo) {
            this.a = photo;
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
            return tq.c(new StringBuilder("AppIconViewParams(icon="), this.a, ')');
        }
    }

    /* compiled from: AppLinkVh.kt */
    public final class b implements VkCell.e {
        public b() {
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new c(AppLinkVh.this, context);
        }
    }

    /* compiled from: AppLinkVh.kt */
    public final class c implements VkCell.d {
        public final zjt<? extends p0v0> a;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        public c(AppLinkVh appLinkVh, Context context) {
            VKImageView vKImageView;
            k7a k7aVar = appLinkVh.c;
            if (((Boolean) appLinkVh.w.getValue()).booleanValue()) {
                VkImage vkImage = new VkImage(context, null, 6, 0);
                float a = cn70.a() * 10.0f;
                bwt0.d(vkImage, a, (r4 & 2) != 0, (r4 & 4) != 0);
                UIBlockApp uIBlockApp = appLinkVh.u;
                CatalogDataType catalogDataType = uIBlockApp != null ? uIBlockApp.e : null;
                CatalogViewType catalogViewType = uIBlockApp != null ? uIBlockApp.d : null;
                vKImageView = vkImage;
                vKImageView = vkImage;
                if (catalogDataType != null && catalogViewType != null) {
                    appLinkVh.c.a(vkImage, ContentType.MINIAPP, catalogDataType, catalogViewType, a);
                    k7aVar.getClass();
                    vkImage.setPlaceholderImage(k7aVar.f(vkImage.getContext(), catalogDataType, catalogViewType, a));
                    vKImageView = vkImage;
                }
            } else {
                VKImageView vKImageView2 = new VKImageView(context, null, 6, 0);
                float a2 = cn70.a() * 10.0f;
                bwt0.d(vKImageView2, a2, (r4 & 2) != 0, (r4 & 4) != 0);
                UIBlockApp uIBlockApp2 = appLinkVh.u;
                CatalogDataType catalogDataType2 = uIBlockApp2 != null ? uIBlockApp2.e : null;
                CatalogViewType catalogViewType2 = uIBlockApp2 != null ? uIBlockApp2.d : null;
                if (catalogDataType2 != null && catalogViewType2 != null) {
                    appLinkVh.c.b(vKImageView2, ContentType.MINIAPP, catalogDataType2, catalogViewType2, a2);
                    k7aVar.d(vKImageView2, catalogDataType2, catalogViewType2, a2);
                }
                vKImageView = vKImageView2;
            }
            this.a = vKImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            a aVar = fVar instanceof a ? (a) fVar : null;
            if (aVar != null) {
                Photo photo = aVar.a;
                zjt<? extends p0v0> zjtVar = this.a;
                zjtVar.s0(photo.Fb(zjtVar.getResources().getDimensionPixelSize(R.dimen.catalog_app_list_content_item_width), false).d.d);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    public AppLinkVh(b5a b5aVar, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider, l7m l7mVar) {
        super(b5aVar, LinkCellVh.ImageSize.Medium, k7aVar, searchStatInfoProvider, true, false, null, false, true);
        this.s = 1;
        this.t = 1;
        k63 k63Var = new k63(l7mVar, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.v = msy.a(lazyThreadSafetyMode, k63Var);
        this.w = msy.a(lazyThreadSafetyMode, new l63(0));
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkCellVh, com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkCell vkCell;
        UIBlockApp uIBlockApp = uIBlock instanceof UIBlockApp ? (UIBlockApp) uIBlock : null;
        if (uIBlockApp == null) {
            return;
        }
        this.u = uIBlockApp;
        ApiApplication apiApplication = uIBlockApp.y;
        VkCell vkCell2 = this.r;
        if (vkCell2 != null) {
            vkCell2.setLeftMainPictureController(new b());
        }
        CatalogMiniAppItem catalogMiniAppItem = uIBlockApp.z;
        String str = (catalogMiniAppItem != null ? catalogMiniAppItem.d : null) == CatalogMiniAppItem.AppType.GAME ? apiApplication.h : apiApplication.g;
        Photo photo = apiApplication.d;
        if (photo != null && (vkCell = this.r) != null) {
            vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new a(photo), VkCell.Left.Main.Size.Medium)));
        }
        VkCell vkCell3 = this.r;
        if (vkCell3 != null) {
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            String a2 = cqm0.a(apiApplication.c);
            VkCell.Middle.e eVar = a2 != null ? new VkCell.Middle.e(oq.d(tlo0.Companion, a2), this.s, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 58) : null;
            String a3 = cqm0.a(str);
            vkCell3.setMiddle(VkCell.Middle.a.a(aVar, eVar, a3 != null ? new VkCell.Middle.d(oq.d(tlo0.Companion, a3), (gzs) null, this.t, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50) : null, null, 12));
        }
        VkCell vkCell4 = this.r;
        if (vkCell4 != null) {
            vkCell4.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
        }
        super.N6(uIBlock);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        UIBlockApp uIBlockApp = this.u;
        ApiApplication apiApplication = uIBlockApp != null ? uIBlockApp.y : null;
        if (uIBlockApp == null || apiApplication == null) {
            return;
        }
        this.b.a(new cfp0(uIBlockApp, null));
        zd3.g((zd3) this.v.getValue(), view.getContext(), apiApplication, null, apiApplication.B, 4);
    }
}
