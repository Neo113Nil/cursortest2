package com.vk.catalog2.common.ui.holders.vkui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
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
import xsna.x84;
import xsna.zrp;

/* compiled from: LinkHorizontalListItemVh.kt */
/* loaded from: classes16.dex */
public class LinkHorizontalListItemVh extends LinkBaseVh<VkTile> {
    public final Size m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final Object q;
    public VkTile r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinkHorizontalListItemVh.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Large;
        public static final Size Medium;
        public static final Size Small;

        /* compiled from: LinkHorizontalListItemVh.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[Size.Small.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Size.Medium.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Size.Large.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            Size size = new Size("Small", 0);
            Small = size;
            Size size2 = new Size("Medium", 1);
            Medium = size2;
            Size size3 = new Size("Large", 2);
            Large = size3;
            Size[] sizeArr = {size, size2, size3};
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

    /* compiled from: LinkHorizontalListItemVh.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.values().length];
            try {
                iArr[Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkHorizontalListItemVh(b5a b5aVar, Size size, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider, boolean z, int i, boolean z2, boolean z3, int i2) {
        super(b5aVar, k7aVar, searchStatInfoProvider, true, r5, r6, null);
        int i3 = (i2 & 64) != 0 ? 1 : i;
        boolean z4 = (i2 & 128) != 0;
        boolean z5 = (i2 & 256) != 0 ? false : z2;
        boolean z6 = (i2 & 2048) != 0 ? false : z3;
        this.m = size;
        this.n = z;
        this.o = i3;
        this.p = z6;
        this.q = msy.a(LazyThreadSafetyMode.NONE, new x84(17));
    }

    public static int g(Size size) {
        int i = c.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return cn70.b(60);
        }
        if (i == 2) {
            return cn70.b(88);
        }
        if (i == 3) {
            return cn70.b(128);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        VkTile vkTile;
        Drawable d;
        UIBlockLink uIBlockLink = uIBlock instanceof UIBlockLink ? (UIBlockLink) uIBlock : null;
        if (uIBlockLink == null || (vkTile = this.r) == null) {
            return;
        }
        Context context = vkTile.getContext();
        CatalogLink catalogLink = uIBlockLink.y;
        vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, catalogLink.c), this.o, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
        vkTile.setSubtitle(null);
        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
        Meta meta = catalogLink.g;
        d = VerifyInfoHelper.a.d(context, this.n, meta != null ? meta.b : null, (r14 & 8) != 0 ? false : this.g, (r14 & 16) != 0, (r14 & 32) != 0 ? false : this.p);
        VkTileImageView.Badge badge = d != null ? new VkTileImageView.Badge(new eko(d), -cn70.b(2)) : null;
        Size size = this.m;
        vkTile.setVisualContentParams(new VkTileImageView.a(new android.util.Size(g(size), g(size)), null, badge, 2));
        super.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh
    public final int a(Context context) {
        return g(this.m);
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh
    public final VkTile b() {
        return this.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh
    public final void d(boolean z) {
        super.d(z);
        VkTile vkTile = this.r;
        if (vkTile != null) {
            vkTile.setVisualContentType(z ? VkTile.VisualContentType.Avatar : VkTile.VisualContentType.Other);
        }
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkTile.TextAlignment textAlignment;
        View inflate = layoutInflater.inflate(R.layout.catalog_ds_link_horizontal_list_item, viewGroup, false);
        VkTile vkTile = inflate instanceof VkTile ? (VkTile) inflate : null;
        this.r = vkTile;
        if (vkTile != null) {
            vkTile.setOnClickListener(new c98(this, 1));
        }
        VkTile vkTile2 = this.r;
        if (vkTile2 != null) {
            int i = c.$EnumSwitchMapping$0[this.m.ordinal()];
            if (i == 1 || i == 2) {
                textAlignment = VkTile.TextAlignment.Center;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textAlignment = VkTile.TextAlignment.Start;
            }
            vkTile2.setTextAlignment(textAlignment);
        }
        if (((Boolean) this.q.getValue()).booleanValue()) {
            VkImage vkImage = new VkImage(layoutInflater.getContext(), null, 6, 0);
            VkTile vkTile3 = this.r;
            if (vkTile3 != null) {
                vkTile3.setVisualContentController(new com.vk.core.view.components.tile.c(new b(vkImage), inflate.getContext()));
            }
            this.k = vkImage;
            return inflate;
        }
        VKImageView vKImageView = new VKImageView(layoutInflater.getContext(), null, 6, 0);
        VkTile vkTile4 = this.r;
        if (vkTile4 != null) {
            vkTile4.setVisualContentController(new com.vk.core.view.components.tile.c(new a(vKImageView), inflate.getContext()));
        }
        this.j = vKImageView;
        return inflate;
    }

    /* compiled from: LinkHorizontalListItemVh.kt */
    public static final class a implements VkTileImageView.b {
        public final VKImageView a;

        public a(VKImageView vKImageView) {
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

    /* compiled from: LinkHorizontalListItemVh.kt */
    public static final class b implements VkTileImageView.b {
        public final VkImage a;

        public b(VkImage vkImage) {
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
