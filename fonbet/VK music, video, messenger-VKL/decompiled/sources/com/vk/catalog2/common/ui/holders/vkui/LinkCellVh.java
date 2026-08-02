package com.vk.catalog2.common.ui.holders.vkui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.style.LinkListViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.VerifyInfo;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.b5a;
import xsna.c98;
import xsna.cqm0;
import xsna.eko;
import xsna.gzs;
import xsna.izs;
import xsna.k1u0;
import xsna.k7a;
import xsna.msy;
import xsna.nh0;
import xsna.oq;
import xsna.ozl;
import xsna.tlo0;
import xsna.zrp;

/* compiled from: LinkCellVh.kt */
/* loaded from: classes16.dex */
public class LinkCellVh extends LinkBaseVh<VkCell> implements View.OnClickListener {
    public final ImageSize m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final Object q;
    public VkCell r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinkCellVh.kt */
    public static final class ImageSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageSize[] $VALUES;

        @ozl
        public static final ImageSize ExtraSmall;
        public static final ImageSize Large;
        public static final ImageSize Medium;
        public static final ImageSize Small;

        /* compiled from: LinkCellVh.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ImageSize.values().length];
                try {
                    iArr[ImageSize.ExtraSmall.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ImageSize.Small.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ImageSize.Medium.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ImageSize.Large.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            ImageSize imageSize = new ImageSize("ExtraSmall", 0);
            ExtraSmall = imageSize;
            ImageSize imageSize2 = new ImageSize("Small", 1);
            Small = imageSize2;
            ImageSize imageSize3 = new ImageSize("Medium", 2);
            Medium = imageSize3;
            ImageSize imageSize4 = new ImageSize("Large", 3);
            Large = imageSize4;
            ImageSize[] imageSizeArr = {imageSize, imageSize2, imageSize3, imageSize4};
            $VALUES = imageSizeArr;
            $ENTRIES = new asp(imageSizeArr);
        }

        public ImageSize() {
            throw null;
        }

        public static ImageSize valueOf(String str) {
            return (ImageSize) Enum.valueOf(ImageSize.class, str);
        }

        public static ImageSize[] values() {
            return (ImageSize[]) $VALUES.clone();
        }

        public final VkCell.Left.Main.Size h() {
            int i = a.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return VkCell.Left.Main.Size.ExtraSmall;
            }
            if (i == 2) {
                return VkCell.Left.Main.Size.Small;
            }
            if (i == 3) {
                return VkCell.Left.Main.Size.Medium;
            }
            if (i == 4) {
                return VkCell.Left.Main.Size.Large;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: LinkCellVh.kt */
    public static final class a implements VkCell.f {
        public static final a a = new a();
    }

    /* compiled from: LinkCellVh.kt */
    public static final class c implements VkCell.e {
        public final VKImageView a;

        public c(VKImageView vKImageView) {
            this.a = vKImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new b(this.a);
        }
    }

    /* compiled from: LinkCellVh.kt */
    public static final class e implements VkCell.e {
        public final VkImage a;

        static {
            int i = VkImage.k;
        }

        public e(VkImage vkImage) {
            this.a = vkImage;
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new d(this.a);
        }
    }

    public /* synthetic */ LinkCellVh(b5a b5aVar, ImageSize imageSize, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider, LinkBaseVh.a aVar, int i) {
        this(b5aVar, imageSize, k7aVar, searchStatInfoProvider, (i & 32) != 0, (i & 128) != 0, (i & 512) != 0 ? null : aVar, (i & 1024) == 0, (i & 8192) == 0);
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        VkCell vkCell;
        Context context;
        VkCell vkCell2;
        VerifyInfo verifyInfo;
        Drawable d2;
        VkCell.Middle.b a2;
        VkCell vkCell3;
        VkCell vkCell4;
        UIBlockLink uIBlockLink = uIBlock instanceof UIBlockLink ? (UIBlockLink) uIBlock : null;
        if (uIBlockLink == null || (vkCell = this.r) == null || (context = vkCell.getContext()) == null) {
            return;
        }
        CatalogLink catalogLink = uIBlockLink.y;
        if (!catalogLink.f.b.isEmpty() && (vkCell4 = this.r) != null) {
            vkCell4.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(a.a, this.m.h())));
        }
        VkCell vkCell5 = this.r;
        if (vkCell5 != null) {
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            String a3 = cqm0.a(catalogLink.c);
            VkCell.Middle.e eVar = a3 != null ? new VkCell.Middle.e(oq.d(tlo0.Companion, a3), this.n, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 58) : null;
            String a4 = cqm0.a(catalogLink.d);
            vkCell5.setMiddle(VkCell.Middle.a.a(aVar, eVar, a4 != null ? new VkCell.Middle.d(oq.d(tlo0.Companion, a4), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, null, 12));
        }
        if (!(uIBlock.l instanceof LinkListViewStyle)) {
            CatalogBadge catalogBadge = catalogLink.h;
            if (this.o && catalogBadge != null && (vkCell2 = this.r) != null) {
                vkCell2.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.d(Integer.parseInt(catalogBadge.b), (VkCounter.CounterAppearance.Appearance) null, 6), null, null, null, 30));
            }
        } else if (this.p && (vkCell3 = this.r) != null) {
            vkCell3.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
        }
        Meta meta = catalogLink.g;
        if (meta != null && (verifyInfo = meta.b) != null) {
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            d2 = VerifyInfoHelper.a.d(context, false, verifyInfo, (r14 & 8) != 0 ? false : this.g, (r14 & 16) != 0, (r14 & 32) != 0 ? false : false);
            VkCell vkCell6 = this.r;
            if (vkCell6 == null || (a2 = vkCell6.getMiddle()) == null) {
                a2 = VkCell.Middle.a.a(VkCell.Middle.Companion, null, null, null, 15);
            }
            VkCell.Middle.e eVar2 = a2.a;
            VkCell.Middle.e.b.C0817b c0817b = d2 != null ? new VkCell.Middle.e.b.C0817b(new eko(d2), (k1u0) null, (tlo0.f) null, (Size) null, 14) : null;
            VkCell vkCell7 = this.r;
            if (vkCell7 != null) {
                vkCell7.setMiddle(VkCell.Middle.b.a(a2, eVar2 != null ? VkCell.Middle.e.a(eVar2, c0817b) : null));
            }
        }
        super.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh
    public final int a(Context context) {
        return this.m.h().k(context);
    }

    @Override // com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh
    public final VkCell b() {
        return this.r;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_ds_link_cell, viewGroup, false);
        VkCell vkCell = inflate instanceof VkCell ? (VkCell) inflate : null;
        this.r = vkCell;
        if (vkCell != null) {
            vkCell.setOnClickListener(new c98(this, 1));
        }
        if (((Boolean) this.q.getValue()).booleanValue()) {
            VkImage vkImage = new VkImage(layoutInflater.getContext(), null, 6, 0);
            VkCell vkCell2 = this.r;
            if (vkCell2 != null) {
                vkCell2.setLeftMainPictureController(new e(vkImage));
            }
            this.k = vkImage;
            return inflate;
        }
        VKImageView vKImageView = new VKImageView(layoutInflater.getContext(), null, 6, 0);
        VkCell vkCell3 = this.r;
        if (vkCell3 != null) {
            vkCell3.setLeftMainPictureController(new c(vKImageView));
        }
        this.j = vKImageView;
        return inflate;
    }

    public LinkCellVh(b5a b5aVar, ImageSize imageSize, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider, boolean z, boolean z2, LinkBaseVh.a aVar, boolean z3, boolean z4) {
        super(b5aVar, k7aVar, searchStatInfoProvider, z, z2, false, aVar);
        this.m = imageSize;
        this.n = 1;
        this.o = z3;
        this.p = z4;
        this.q = msy.a(LazyThreadSafetyMode.NONE, new nh0(19));
    }

    /* compiled from: LinkCellVh.kt */
    public static final class b implements VkCell.d {
        public final VKImageView a;

        public b(VKImageView vKImageView) {
            this.a = vKImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }

    /* compiled from: LinkCellVh.kt */
    public static final class d implements VkCell.d {
        public final VkImage a;

        static {
            int i = VkImage.k;
        }

        public d(VkImage vkImage) {
            this.a = vkImage;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }
}
