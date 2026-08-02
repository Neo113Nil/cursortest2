package com.vk.vmoji.character.model;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseStickerAnimationDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.stickers.dto.StickersImageSetDto;
import com.vk.api.generated.stickers.dto.StickersOrderPriceDto;
import com.vk.api.generated.stickers.dto.StickersPackBadgeDto;
import com.vk.api.generated.stickers.dto.StickersPackPreviewDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.vmoji.character.model.ImageListModel;
import com.vk.vmoji.character.model.VmojiBadge;
import com.vk.vmoji.character.model.VmojiPrice;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;
import xsna.c6w0;
import xsna.drm0;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;
import xsna.urd0;

/* compiled from: VmojiStickerPackPreviewModel.kt */
/* loaded from: classes7.dex */
public final class VmojiStickerPackPreviewModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiStickerPackPreviewModel> CREATOR = new b();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final VmojiBadge h;
    public final VmojiPrice i;
    public final BaseUrlImageModel j;
    public final List<StickerModel> k;

    /* compiled from: VmojiStickerPackPreviewModel.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0146  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static VmojiStickerPackPreviewModel a(StickersPackPreviewDto stickersPackPreviewDto) {
            VmojiPrice price;
            VmojiPrice priceWithDiscount;
            List<BaseStickerDto> l;
            ArrayList arrayList;
            StickersPackBadgeDto e;
            String e2;
            VmojiBadge vmojiBadge;
            StickersImageSetDto j;
            BaseUrlImageModel baseUrlImageModel;
            int i;
            StickerAnimationModel stickerAnimationModel;
            StickersOrderPriceDto k = stickersPackPreviewDto.k();
            int d = k != null ? k.d() : 0;
            StickersOrderPriceDto k2 = stickersPackPreviewDto.k();
            Integer f = k2 != null ? k2.f() : null;
            if (epx.f(stickersPackPreviewDto.u(), Boolean.TRUE)) {
                price = new VmojiPrice.Added(d);
            } else if (d == 0) {
                price = new VmojiPrice.Free(d);
            } else {
                if (f != null && f.intValue() != d) {
                    priceWithDiscount = new VmojiPrice.PriceWithDiscount(d, f.intValue());
                    l = stickersPackPreviewDto.l();
                    if (l != null || l.isEmpty()) {
                        arrayList = null;
                    } else {
                        List<BaseStickerDto> l2 = stickersPackPreviewDto.l();
                        ArrayList arrayList2 = new ArrayList(c5g.u(l2, 10));
                        for (BaseStickerDto baseStickerDto : l2) {
                            Integer l3 = baseStickerDto.l();
                            Integer j2 = baseStickerDto.j();
                            Serializer.c<ImageListModel> cVar = ImageListModel.CREATOR;
                            ImageListModel a = ImageListModel.a.a(baseStickerDto.f());
                            ImageListModel a2 = ImageListModel.a.a(baseStickerDto.g());
                            Serializer.c<StickerAnimationModel> cVar2 = StickerAnimationModel.CREATOR;
                            List<BaseStickerAnimationDto> d2 = baseStickerDto.d();
                            List<BaseStickerAnimationDto> list = d2;
                            if (list != null && !list.isEmpty()) {
                                String str = null;
                                String str2 = null;
                                for (BaseStickerAnimationDto baseStickerAnimationDto : d2) {
                                    if (baseStickerAnimationDto.d() == BaseStickerAnimationDto.TypeDto.LIGHT) {
                                        str = baseStickerAnimationDto.getUrl();
                                    } else if (baseStickerAnimationDto.d() == BaseStickerAnimationDto.TypeDto.DARK) {
                                        str2 = baseStickerAnimationDto.getUrl();
                                    }
                                }
                                if (str == null || drm0.N(str)) {
                                    str = str2;
                                }
                                if (str != null && !drm0.N(str)) {
                                    stickerAnimationModel = new StickerAnimationModel(str, str2);
                                    arrayList2.add(new StickerModel(l3, j2, a, a2, stickerAnimationModel, baseStickerDto.o()));
                                }
                            }
                            stickerAnimationModel = null;
                            arrayList2.add(new StickerModel(l3, j2, a, a2, stickerAnimationModel, baseStickerDto.o()));
                        }
                        arrayList = arrayList2;
                    }
                    int id = stickersPackPreviewDto.getId();
                    String title = stickersPackPreviewDto.getTitle();
                    String description = stickersPackPreviewDto.getDescription();
                    String d3 = stickersPackPreviewDto.d();
                    Boolean o = stickersPackPreviewDto.o();
                    Boolean bool = Boolean.TRUE;
                    boolean f2 = epx.f(o, bool);
                    boolean f3 = epx.f(stickersPackPreviewDto.n(), bool);
                    e = stickersPackPreviewDto.e();
                    e2 = e == null ? e.e() : null;
                    if (e2 != null && !drm0.N(e2)) {
                        StickersPackBadgeDto.SubtypeDto d4 = e.d();
                        i = d4 != null ? -1 : c6w0.$EnumSwitchMapping$0[d4.ordinal()];
                        if (i != -1) {
                            vmojiBadge = i != 1 ? i != 2 ? new VmojiBadge.Unknown(e2) : new VmojiBadge.Discount(e2) : new VmojiBadge.New(e2);
                            Serializer.c<BaseUrlImageModel> cVar3 = BaseUrlImageModel.CREATOR;
                            j = stickersPackPreviewDto.j();
                            if (j == null) {
                                baseUrlImageModel = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                List<BaseImageDto> e3 = j.e();
                                if (e3 != null) {
                                    for (BaseImageDto baseImageDto : e3) {
                                        String id2 = baseImageDto.getId();
                                        StickersImageSetDto stickersImageSetDto = j;
                                        if (id2 == null || !drm0.D(id2, "square", false)) {
                                            String id3 = baseImageDto.getId();
                                            if (id3 != null) {
                                                if (drm0.D(id3, "wide", false)) {
                                                    arrayList4.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                                                }
                                                j = stickersImageSetDto;
                                            }
                                        } else {
                                            arrayList3.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                                        }
                                        j = stickersImageSetDto;
                                    }
                                }
                                baseUrlImageModel = new BaseUrlImageModel(j.d(), new Image(arrayList3), new Image(arrayList4));
                            }
                            return new VmojiStickerPackPreviewModel(id, title, description, d3, f2, f3, vmojiBadge, priceWithDiscount, baseUrlImageModel, arrayList);
                        }
                    }
                    vmojiBadge = null;
                    Serializer.c<BaseUrlImageModel> cVar32 = BaseUrlImageModel.CREATOR;
                    j = stickersPackPreviewDto.j();
                    if (j == null) {
                    }
                    return new VmojiStickerPackPreviewModel(id, title, description, d3, f2, f3, vmojiBadge, priceWithDiscount, baseUrlImageModel, arrayList);
                }
                price = new VmojiPrice.Price(d);
            }
            priceWithDiscount = price;
            l = stickersPackPreviewDto.l();
            if (l != null) {
            }
            arrayList = null;
            int id4 = stickersPackPreviewDto.getId();
            String title2 = stickersPackPreviewDto.getTitle();
            String description2 = stickersPackPreviewDto.getDescription();
            String d32 = stickersPackPreviewDto.d();
            Boolean o2 = stickersPackPreviewDto.o();
            Boolean bool2 = Boolean.TRUE;
            boolean f22 = epx.f(o2, bool2);
            boolean f32 = epx.f(stickersPackPreviewDto.n(), bool2);
            e = stickersPackPreviewDto.e();
            if (e == null) {
            }
            if (e2 != null) {
                StickersPackBadgeDto.SubtypeDto d42 = e.d();
                if (d42 != null) {
                }
                if (i != -1) {
                }
            }
            vmojiBadge = null;
            Serializer.c<BaseUrlImageModel> cVar322 = BaseUrlImageModel.CREATOR;
            j = stickersPackPreviewDto.j();
            if (j == null) {
            }
            return new VmojiStickerPackPreviewModel(id4, title2, description2, d32, f22, f32, vmojiBadge, priceWithDiscount, baseUrlImageModel, arrayList);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VmojiStickerPackPreviewModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiStickerPackPreviewModel a(Serializer serializer) {
            return new VmojiStickerPackPreviewModel(serializer.u(), serializer.H(), serializer.H(), serializer.H(), serializer.m(), serializer.m(), (VmojiBadge) serializer.A(VmojiBadge.class.getClassLoader()), (VmojiPrice) serializer.A(VmojiPrice.class.getClassLoader()), (BaseUrlImageModel) serializer.A(BaseUrlImageModel.class.getClassLoader()), serializer.B(StickerModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiStickerPackPreviewModel[i];
        }
    }

    public VmojiStickerPackPreviewModel(int i, String str, String str2, String str3, boolean z, boolean z2, VmojiBadge vmojiBadge, VmojiPrice vmojiPrice, BaseUrlImageModel baseUrlImageModel, List<StickerModel> list) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = vmojiBadge;
        this.i = vmojiPrice;
        this.j = baseUrlImageModel;
        this.k = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.e0(this.h);
        serializer.e0(this.i);
        serializer.e0(this.j);
        serializer.f0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiStickerPackPreviewModel)) {
            return false;
        }
        VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel = (VmojiStickerPackPreviewModel) obj;
        return this.b == vmojiStickerPackPreviewModel.b && epx.f(this.c, vmojiStickerPackPreviewModel.c) && epx.f(this.d, vmojiStickerPackPreviewModel.d) && epx.f(this.e, vmojiStickerPackPreviewModel.e) && this.f == vmojiStickerPackPreviewModel.f && this.g == vmojiStickerPackPreviewModel.g && epx.f(this.h, vmojiStickerPackPreviewModel.h) && epx.f(this.i, vmojiStickerPackPreviewModel.i) && epx.f(this.j, vmojiStickerPackPreviewModel.j) && epx.f(this.k, vmojiStickerPackPreviewModel.k);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int b2 = qoy.b(qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g);
        VmojiBadge vmojiBadge = this.h;
        int hashCode2 = (this.i.hashCode() + ((b2 + (vmojiBadge == null ? 0 : vmojiBadge.hashCode())) * 31)) * 31;
        BaseUrlImageModel baseUrlImageModel = this.j;
        int hashCode3 = (hashCode2 + (baseUrlImageModel == null ? 0 : baseUrlImageModel.hashCode())) * 31;
        List<StickerModel> list = this.k;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiStickerPackPreviewModel(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", author=");
        sb.append(this.e);
        sb.append(", isAnimated=");
        sb.append(this.f);
        sb.append(", isActive=");
        sb.append(this.g);
        sb.append(", badge=");
        sb.append(this.h);
        sb.append(", price=");
        sb.append(this.i);
        sb.append(", icon=");
        sb.append(this.j);
        sb.append(", stickers=");
        return ms9.a(')', sb, this.k);
    }
}
