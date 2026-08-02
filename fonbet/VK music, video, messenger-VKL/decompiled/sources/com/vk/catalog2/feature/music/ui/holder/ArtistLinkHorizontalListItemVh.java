package com.vk.catalog2.feature.music.ui.holder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.tile.VkTile;
import com.vk.core.view.components.tile.VkTileImageView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.b5a;
import xsna.c98;
import xsna.cn70;
import xsna.eko;
import xsna.k7a;
import xsna.msy;
import xsna.oq;
import xsna.tlo0;
import xsna.zq3;
import xsna.zrp;

/* compiled from: ArtistLinkHorizontalListItemVh.kt */
/* loaded from: classes16.dex */
public final class ArtistLinkHorizontalListItemVh extends LinkBaseVh<VkTile> {
    public static final int s = cn70.b(168);
    public final Size m;
    public final boolean n;
    public final int o;
    public VkTile p;
    public final Object q;
    public final com.vk.catalog2.feature.music.ui.holder.a r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ArtistLinkHorizontalListItemVh.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Large;

        static {
            Size size = new Size("Large", 0);
            Large = size;
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

    /* compiled from: ArtistLinkHorizontalListItemVh.kt */
    public final class a implements VkTile.g {
        public final VkTileImageView a;

        public a(Context context, VkTileImageView.b bVar) {
            VkTileImageView vkTileImageView = new VkTileImageView(context);
            vkTileImageView.setImageController(bVar);
            this.a = vkTileImageView;
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.i(constraintLayout);
            VkTileImageView vkTileImageView = this.a;
            int id = vkTileImageView.getId();
            Context context = vkTileImageView.getContext();
            ArtistLinkHorizontalListItemVh artistLinkHorizontalListItemVh = ArtistLinkHorizontalListItemVh.this;
            bVar.p(id, artistLinkHorizontalListItemVh.a(context));
            bVar.n(vkTileImageView.getId(), artistLinkHorizontalListItemVh.a(vkTileImageView.getContext()));
            bVar.C(vkTileImageView.getId(), "1:1");
            bVar.b(constraintLayout);
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: ArtistLinkHorizontalListItemVh.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.values().length];
            try {
                iArr[Size.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ArtistLinkHorizontalListItemVh(b5a b5aVar, Size size, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(b5aVar, k7aVar, searchStatInfoProvider, true, true, false, null);
        this.m = size;
        this.n = true;
        this.o = 1;
        this.q = msy.a(LazyThreadSafetyMode.NONE, new zq3(0));
        this.r = new com.vk.catalog2.feature.music.ui.holder.a(this);
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkTile vkTile;
        Drawable d2;
        UIBlockLink uIBlockLink = uIBlock instanceof UIBlockLink ? (UIBlockLink) uIBlock : null;
        if (uIBlockLink == null || (vkTile = this.p) == null) {
            return;
        }
        Context context = vkTile.getContext();
        CatalogLink catalogLink = uIBlockLink.y;
        vkTile.setDecorator(this.r);
        vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, catalogLink.c), this.o, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
        vkTile.setSubtitle(null);
        ViewGroup.LayoutParams layoutParams = vkTile.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (d.$EnumSwitchMapping$0[this.m.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        layoutParams.width = s;
        vkTile.setLayoutParams(layoutParams);
        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
        Meta meta = catalogLink.g;
        d2 = VerifyInfoHelper.a.d(context, this.n, meta != null ? meta.b : null, (r14 & 8) != 0 ? false : this.g, (r14 & 16) != 0, (r14 & 32) != 0 ? false : false);
        vkTile.setVisualContentParams(new VkTileImageView.a(null, null, d2 != null ? new VkTileImageView.Badge(new eko(d2), -cn70.b(2)) : null, 2));
        super.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh
    public final int a(Context context) {
        if (d.$EnumSwitchMapping$0[this.m.ordinal()] == 1) {
            return cn70.b(156);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh
    public final VkTile b() {
        return this.p;
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_ds_link_horizontal_list_item, viewGroup, false);
        VkTile vkTile = inflate instanceof VkTile ? (VkTile) inflate : null;
        this.p = vkTile;
        if (vkTile != null) {
            vkTile.setOnClickListener(new c98(this, 1));
        }
        VkTile vkTile2 = this.p;
        if (vkTile2 != null) {
            vkTile2.setTextAlignment(VkTile.TextAlignment.Center);
        }
        if (((Boolean) this.q.getValue()).booleanValue()) {
            VkImage vkImage = new VkImage(layoutInflater.getContext(), null, 6, 0);
            VkTile vkTile3 = this.p;
            if (vkTile3 != null) {
                vkTile3.setVisualContentController(new a(inflate.getContext(), new c(vkImage)));
            }
            this.k = vkImage;
            return inflate;
        }
        VKImageView vKImageView = new VKImageView(layoutInflater.getContext(), null, 6, 0);
        VkTile vkTile4 = this.p;
        if (vkTile4 != null) {
            vkTile4.setVisualContentController(new a(inflate.getContext(), new b(vKImageView)));
        }
        this.j = vKImageView;
        return inflate;
    }

    /* compiled from: ArtistLinkHorizontalListItemVh.kt */
    public static final class b implements VkTileImageView.b {
        public final VKImageView a;

        public b(VKImageView vKImageView) {
            this.a = vKImageView;
        }

        @Override // com.vk.core.view.components.tile.VkTileImageView.b
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.tile.VkTileImageView.b
        public final void a(VkTileImageView.c cVar) {
        }
    }

    /* compiled from: ArtistLinkHorizontalListItemVh.kt */
    public static final class c implements VkTileImageView.b {
        public final VkImage a;

        public c(VkImage vkImage) {
            this.a = vkImage;
        }

        @Override // com.vk.core.view.components.tile.VkTileImageView.b
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.tile.VkTileImageView.b
        public final void a(VkTileImageView.c cVar) {
        }
    }
}
