package com.vk.catalog2.common.dto.ui;

import android.os.Parcel;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.TitleIcon;
import com.vk.catalog2.common.dto.api.banner.BannerLocalImage;
import com.vk.catalog2.common.dto.api.banner.BannerStyle;
import com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.qjg;
import xsna.zcl;

/* compiled from: UIBlockPlaceholder.kt */
/* loaded from: classes16.dex */
public final class UIBlockPlaceholder extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockPlaceholder> CREATOR = new a();
    public final String A;
    public final Image B;
    public final String C;
    public final String D;
    public final String E;
    public final UIBlockAction F;
    public final ArrayList<UIBlockAction> G;
    public final CatalogBannerImageMode H;
    public final String I;
    public final Image J;
    public final BannerStyle K;
    public final TitleIcon L;
    public final BannerLocalImage M;
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockPlaceholder> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockPlaceholder a(Serializer serializer) {
            return new UIBlockPlaceholder(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockPlaceholder[i];
        }
    }

    public /* synthetic */ UIBlockPlaceholder(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List list, Set set, UIBlockHint uIBlockHint, String str3, String str4, Image image, String str5, String str6, String str7, UIBlockAction uIBlockAction, List list2, CatalogBannerImageMode catalogBannerImageMode, String str8, String str9, Image image2, BannerStyle bannerStyle, TitleIcon titleIcon, CatalogViewStyle catalogViewStyle, CatalogLaunchOrigin catalogLaunchOrigin, String str10, BannerLocalImage bannerLocalImage, int i, zcl zclVar) {
        this(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, str4, image, str5, str6, str7, uIBlockAction, list2, catalogBannerImageMode, str8, str9, image2, bannerStyle, titleIcon, catalogViewStyle, catalogLaunchOrigin, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str10, (i & 33554432) != 0 ? null : bannerLocalImage);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.A);
        serializer.i0(this.B);
        serializer.j0(this.C);
        serializer.j0(this.D);
        serializer.i0(this.F);
        serializer.W(this.G);
        CatalogBannerImageMode catalogBannerImageMode = this.H;
        serializer.j0(catalogBannerImageMode != null ? catalogBannerImageMode.name() : null);
        serializer.j0(this.z);
        serializer.j0(this.y);
        serializer.j0(this.E);
        serializer.j0(this.I);
        serializer.i0(this.J);
        BannerStyle bannerStyle = this.K;
        serializer.j0(bannerStyle != null ? bannerStyle.h() : null);
        serializer.i0(this.L);
        serializer.i0(this.M);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Pb, reason: merged with bridge method [inline-methods] */
    public final UIBlockPlaceholder zb() {
        Image image;
        Image image2;
        TitleIcon titleIcon;
        Parcel obtain;
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        Image image3 = this.B;
        if (image3 != null) {
            obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                Serializer.g gVar = new Serializer.g(obtain);
                gVar.i0(image3);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G = gVar.G(Image.class.getClassLoader());
                obtain.recycle();
                image = (Image) G;
            } finally {
            }
        } else {
            image = null;
        }
        UIBlockAction uIBlockAction = this.F;
        UIBlockAction zb2 = uIBlockAction != null ? uIBlockAction.zb() : null;
        ArrayList arrayList = new ArrayList();
        Iterator<UIBlockAction> it2 = this.G.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().zb());
        }
        Image image4 = this.J;
        if (image4 != null) {
            obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                Serializer.g gVar2 = new Serializer.g(obtain);
                gVar2.i0(image4);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G2 = gVar2.G(Image.class.getClassLoader());
                obtain.recycle();
                image2 = (Image) G2;
            } finally {
            }
        } else {
            image2 = null;
        }
        TitleIcon titleIcon2 = this.L;
        if (titleIcon2 != null) {
            obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
                Serializer.g gVar3 = new Serializer.g(obtain);
                gVar3.i0(titleIcon2);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G3 = gVar3.G(TitleIcon.class.getClassLoader());
                obtain.recycle();
                titleIcon = (TitleIcon) G3;
            } finally {
            }
        } else {
            titleIcon = null;
        }
        CatalogViewStyle catalogViewStyle = this.l;
        CatalogViewStyle copy = catalogViewStyle != null ? catalogViewStyle.copy() : null;
        BannerLocalImage bannerLocalImage = this.M;
        return new UIBlockPlaceholder(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, this.z, this.A, image, this.C, this.D, this.E, zb2, arrayList, this.H, this.y, this.I, image2, this.K, titleIcon, copy, this.p, this.q, bannerLocalImage != null ? new BannerLocalImage(bannerLocalImage.b, bannerLocalImage.c, bannerLocalImage.d) : null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockPlaceholder) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) obj;
        return epx.f(this.z, uIBlockPlaceholder.z) && epx.f(this.A, uIBlockPlaceholder.A) && epx.f(this.B, uIBlockPlaceholder.B) && epx.f(this.C, uIBlockPlaceholder.C) && epx.f(this.D, uIBlockPlaceholder.D) && epx.f(this.E, uIBlockPlaceholder.E) && epx.f(this.F, uIBlockPlaceholder.F) && epx.f(this.G, uIBlockPlaceholder.G) && this.H == uIBlockPlaceholder.H && epx.f(this.y, uIBlockPlaceholder.y) && epx.f(this.I, uIBlockPlaceholder.I) && epx.f(this.J, uIBlockPlaceholder.J) && this.K == uIBlockPlaceholder.K && epx.f(this.L, uIBlockPlaceholder.L) && epx.f(this.M, uIBlockPlaceholder.M);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.z, this.A, this.B, this.C, this.D, this.F, this.G, this.H, this.y, this.E, this.I, this.J, this.K, this.L, this.M);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.A, '>');
    }

    public UIBlockPlaceholder(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, String str4, Image image, String str5, String str6, String str7, UIBlockAction uIBlockAction, List<? extends UIBlockAction> list2, CatalogBannerImageMode catalogBannerImageMode, String str8, String str9, Image image2, BannerStyle bannerStyle, TitleIcon titleIcon, CatalogViewStyle catalogViewStyle, CatalogLaunchOrigin catalogLaunchOrigin, String str10, BannerLocalImage bannerLocalImage) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, null, null, null, catalogLaunchOrigin, str10, 7424, null);
        this.z = str3;
        this.A = str4;
        this.B = image;
        this.C = str5;
        this.D = str6;
        this.E = str7;
        this.F = uIBlockAction;
        this.G = new ArrayList<>(list2);
        this.H = catalogBannerImageMode;
        this.y = str8;
        this.I = str9;
        this.J = image2;
        this.K = bannerStyle;
        this.L = titleIcon;
        this.M = bannerLocalImage;
    }

    public UIBlockPlaceholder(Serializer serializer) {
        super(serializer);
        CatalogBannerImageMode catalogBannerImageMode;
        String H = serializer.H();
        this.A = H == null ? "" : H;
        this.B = (Image) serializer.G(Image.class.getClassLoader());
        this.C = serializer.H();
        this.D = serializer.H();
        this.F = (UIBlockAction) serializer.G(UIBlockAction.class.getClassLoader());
        ArrayList<UIBlockAction> k = serializer.k(UIBlockAction.class);
        this.G = k == null ? new ArrayList<>() : k;
        String H2 = serializer.H();
        if (H2 != null) {
            CatalogBannerImageMode.Companion.getClass();
            catalogBannerImageMode = CatalogBannerImageMode.a.a(H2);
        } else {
            catalogBannerImageMode = null;
        }
        this.H = catalogBannerImageMode;
        String H3 = serializer.H();
        this.z = H3 == null ? this.b : H3;
        this.y = serializer.H();
        this.E = serializer.H();
        this.I = serializer.H();
        this.J = (Image) serializer.G(Image.class.getClassLoader());
        BannerStyle.a aVar = BannerStyle.Companion;
        String H4 = serializer.H();
        aVar.getClass();
        this.K = BannerStyle.a.a(H4);
        this.L = (TitleIcon) serializer.G(TitleIcon.class.getClassLoader());
        this.M = (BannerLocalImage) serializer.G(BannerLocalImage.class.getClassLoader());
    }
}
