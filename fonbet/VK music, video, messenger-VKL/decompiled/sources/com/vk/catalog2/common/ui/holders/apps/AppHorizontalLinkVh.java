package com.vk.catalog2.common.ui.holders.apps;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockApp;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.vkui.LinkHorizontalListItemVh;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.tile.VkTile;
import com.vk.core.view.components.tile.VkTileImageView;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.b5a;
import xsna.bwt0;
import xsna.c53;
import xsna.cfp0;
import xsna.cn70;
import xsna.epx;
import xsna.h7m;
import xsna.hbh0;
import xsna.k7a;
import xsna.l7m;
import xsna.msy;
import xsna.nd1;
import xsna.oq;
import xsna.p0v0;
import xsna.tlo0;
import xsna.tq;
import xsna.zd3;
import xsna.zjt;

/* compiled from: AppHorizontalLinkVh.kt */
/* loaded from: classes16.dex */
public final class AppHorizontalLinkVh extends LinkHorizontalListItemVh implements View.OnClickListener {
    public final c s;
    public final int t;
    public UIBlockApp u;
    public final Object v;
    public final Object w;

    /* compiled from: AppHorizontalLinkVh.kt */
    public static final class a implements VkTileImageView.c {
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

    /* compiled from: AppHorizontalLinkVh.kt */
    public final class b implements VkTileImageView.b {
        public final zjt<? extends p0v0> a;
        public final /* synthetic */ AppHorizontalLinkVh b;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        public b(AppHorizontalLinkVh appHorizontalLinkVh, Context context) {
            VKImageView vKImageView;
            k7a k7aVar = appHorizontalLinkVh.c;
            this.b = appHorizontalLinkVh;
            if (((Boolean) appHorizontalLinkVh.w.getValue()).booleanValue()) {
                VkImage vkImage = new VkImage(context, null, 6, 0);
                float a = cn70.a() * 10.0f;
                bwt0.d(vkImage, a, (r4 & 2) != 0, (r4 & 4) != 0);
                vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                UIBlockApp uIBlockApp = appHorizontalLinkVh.u;
                CatalogDataType catalogDataType = uIBlockApp != null ? uIBlockApp.e : null;
                CatalogViewType catalogViewType = uIBlockApp != null ? uIBlockApp.d : null;
                vKImageView = vkImage;
                vKImageView = vkImage;
                if (catalogDataType != null && catalogViewType != null) {
                    appHorizontalLinkVh.c.a(vkImage, ContentType.MINIAPP, catalogDataType, catalogViewType, a);
                    k7aVar.getClass();
                    vkImage.setPlaceholderImage(k7aVar.f(vkImage.getContext(), catalogDataType, catalogViewType, a));
                    vKImageView = vkImage;
                }
            } else {
                VKImageView vKImageView2 = new VKImageView(context, null, 6, 0);
                float a2 = cn70.a() * 10.0f;
                bwt0.d(vKImageView2, a2, (r4 & 2) != 0, (r4 & 4) != 0);
                vKImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                UIBlockApp uIBlockApp2 = appHorizontalLinkVh.u;
                CatalogDataType catalogDataType2 = uIBlockApp2 != null ? uIBlockApp2.e : null;
                CatalogViewType catalogViewType2 = uIBlockApp2 != null ? uIBlockApp2.d : null;
                if (catalogDataType2 != null && catalogViewType2 != null) {
                    appHorizontalLinkVh.c.b(vKImageView2, ContentType.MINIAPP, catalogDataType2, catalogViewType2, a2);
                    k7aVar.d(vKImageView2, catalogDataType2, catalogViewType2, a2);
                }
                vKImageView = vKImageView2;
            }
            this.a = vKImageView;
        }

        @Override // com.vk.core.view.components.tile.VkTileImageView.b
        public final void a(VkTileImageView.c cVar) {
            a aVar = cVar instanceof a ? (a) cVar : null;
            if (aVar != null) {
                Photo photo = aVar.a;
                zjt<? extends p0v0> zjtVar = this.a;
                zjtVar.s0(photo.Fb(zjtVar.getResources().getDimensionPixelSize(this.b.s.b()), false).d.d);
            }
        }

        @Override // com.vk.core.view.components.tile.VkTileImageView.b
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: AppHorizontalLinkVh.kt */
    public interface c {

        /* compiled from: AppHorizontalLinkVh.kt */
        public static final class a implements c {
            public final int a;
            public final LinkHorizontalListItemVh.Size b;

            public a() {
                LinkHorizontalListItemVh.Size size = LinkHorizontalListItemVh.Size.Large;
                this.a = R.dimen.catalog_app_slider_content_item_width;
                this.b = size;
            }

            @Override // com.vk.catalog2.common.ui.holders.apps.AppHorizontalLinkVh.c
            public final LinkHorizontalListItemVh.Size a() {
                return this.b;
            }

            @Override // com.vk.catalog2.common.ui.holders.apps.AppHorizontalLinkVh.c
            public final int b() {
                return this.a;
            }
        }

        /* compiled from: AppHorizontalLinkVh.kt */
        public static final class b implements c {
            public final int a;
            public final LinkHorizontalListItemVh.Size b;

            public b() {
                LinkHorizontalListItemVh.Size size = LinkHorizontalListItemVh.Size.Medium;
                this.a = R.dimen.catalog_game_slider_content_item_width;
                this.b = size;
            }

            @Override // com.vk.catalog2.common.ui.holders.apps.AppHorizontalLinkVh.c
            public final LinkHorizontalListItemVh.Size a() {
                return this.b;
            }

            @Override // com.vk.catalog2.common.ui.holders.apps.AppHorizontalLinkVh.c
            public final int b() {
                return this.a;
            }
        }

        /* compiled from: AppHorizontalLinkVh.kt */
        /* renamed from: com.vk.catalog2.common.ui.holders.apps.AppHorizontalLinkVh$c$c, reason: collision with other inner class name */
        public static final class C0483c implements c {
            public final int a;
            public final LinkHorizontalListItemVh.Size b;

            public C0483c() {
                LinkHorizontalListItemVh.Size size = LinkHorizontalListItemVh.Size.Small;
                this.a = R.dimen.catalog_app_small_slider_content_item_width;
                this.b = size;
            }

            @Override // com.vk.catalog2.common.ui.holders.apps.AppHorizontalLinkVh.c
            public final LinkHorizontalListItemVh.Size a() {
                return this.b;
            }

            @Override // com.vk.catalog2.common.ui.holders.apps.AppHorizontalLinkVh.c
            public final int b() {
                return this.a;
            }
        }

        LinkHorizontalListItemVh.Size a();

        int b();
    }

    public /* synthetic */ AppHorizontalLinkVh(c cVar, b5a b5aVar, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider, l7m l7mVar) {
        this(cVar, 1, b5aVar, k7aVar, searchStatInfoProvider, l7mVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkHorizontalListItemVh, com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkTile vkTile;
        Size size;
        UIBlockApp uIBlockApp = uIBlock instanceof UIBlockApp ? (UIBlockApp) uIBlock : null;
        if (uIBlockApp == null || (vkTile = this.r) == null) {
            return;
        }
        this.u = uIBlockApp;
        ApiApplication apiApplication = uIBlockApp.y;
        vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, apiApplication.c), this.t, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
        Photo photo = apiApplication.d;
        if (photo != null) {
            a aVar = new a(photo);
            LinkHorizontalListItemVh.Size a2 = this.s.a();
            Context context = vkTile.getContext();
            a2.getClass();
            int i = LinkHorizontalListItemVh.Size.a.$EnumSwitchMapping$0[a2.ordinal()];
            if (i == 1) {
                size = new Size(hbh0.b(56, context), hbh0.b(56, context));
            } else if (i == 2) {
                size = new Size(hbh0.b(88, context), hbh0.b(88, context));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                size = new Size(hbh0.b(128, context), hbh0.b(128, context));
            }
            vkTile.setVisualContentParams(new VkTileImageView.a(size, aVar, null, 4));
        }
        vkTile.setVisualContentController(new com.vk.core.view.components.tile.c(new b(this, vkTile.getContext()), vkTile.getContext()));
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

    public AppHorizontalLinkVh(c cVar, int i, b5a b5aVar, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider, h7m h7mVar) {
        super(b5aVar, cVar.a(), k7aVar, searchStatInfoProvider, false, i, false, false, 4096);
        this.s = cVar;
        this.t = i;
        c53 c53Var = new c53(h7mVar, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.v = msy.a(lazyThreadSafetyMode, c53Var);
        this.w = msy.a(lazyThreadSafetyMode, new nd1(1));
    }
}
