package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stickers.dto.StickersImageConfigContextDto;
import com.vk.api.generated.stickers.dto.StickersStickerPopupDto;
import com.vk.api.generated.stickers.dto.StickersStickerRenderDto;
import com.vk.api.generated.stickers.dto.StickersStickerVmojiDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseStickerDto.kt */
/* loaded from: classes14.dex */
public final class BaseStickerDto implements Parcelable {
    public static final Parcelable.Creator<BaseStickerDto> CREATOR = new a();

    @pmi0("animation_url")
    private final String animationUrl;

    @pmi0("animations")
    private final List<BaseStickerAnimationDto> animations;

    @pmi0("image_config_context")
    private final StickersImageConfigContextDto imageConfigContext;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("images_with_background")
    private final List<BaseImageDto> imagesWithBackground;

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("is_allowed")
    private final Boolean isAllowed;

    @pmi0("pack_url")
    private final String packUrl;

    @pmi0("popup")
    private final StickersStickerPopupDto popup;

    @pmi0("product_id")
    private final Integer productId;

    @pmi0("render")
    private final StickersStickerRenderDto render;

    @pmi0("sticker_id")
    private final Integer stickerId;

    @pmi0("vmoji")
    private final StickersStickerVmojiDto vmoji;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseStickerDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;

        @pmi0("base_sticker_new")
        public static final InnerTypeDto BASE_STICKER_NEW;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;
        private final String value;

        /* compiled from: BaseStickerDto.kt */
        public static final class a implements Parcelable.Creator<InnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto createFromParcel(Parcel parcel) {
                return InnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto[] newArray(int i) {
                return new InnerTypeDto[i];
            }
        }

        static {
            InnerTypeDto innerTypeDto = new InnerTypeDto("BASE_STICKER_NEW", 0, "base_sticker_new");
            BASE_STICKER_NEW = innerTypeDto;
            InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
            $VALUES = innerTypeDtoArr;
            $ENTRIES = new asp(innerTypeDtoArr);
            CREATOR = new a();
        }

        private InnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InnerTypeDto valueOf(String str) {
            return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
        }

        public static InnerTypeDto[] values() {
            return (InnerTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: BaseStickerDto.kt */
    public static final class a implements Parcelable.Creator<BaseStickerDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseStickerDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf;
            InnerTypeDto createFromParcel = InnerTypeDto.CREATOR.createFromParcel(parcel);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(BaseStickerDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(BaseStickerDto.class, parcel, arrayList2, i2, 1);
                }
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(BaseStickerAnimationDto.CREATOR, parcel, arrayList3, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BaseStickerDto(createFromParcel, valueOf2, valueOf3, arrayList, arrayList2, readString, arrayList3, valueOf, parcel.readInt() == 0 ? null : StickersStickerRenderDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StickersStickerVmojiDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StickersImageConfigContextDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StickersStickerPopupDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseStickerDto[] newArray(int i) {
            return new BaseStickerDto[i];
        }
    }

    public BaseStickerDto(InnerTypeDto innerTypeDto, Integer num, Integer num2, List<BaseImageDto> list, List<BaseImageDto> list2, String str, List<BaseStickerAnimationDto> list3, Boolean bool, StickersStickerRenderDto stickersStickerRenderDto, StickersStickerVmojiDto stickersStickerVmojiDto, StickersImageConfigContextDto stickersImageConfigContextDto, StickersStickerPopupDto stickersStickerPopupDto, String str2) {
        this.innerType = innerTypeDto;
        this.stickerId = num;
        this.productId = num2;
        this.images = list;
        this.imagesWithBackground = list2;
        this.animationUrl = str;
        this.animations = list3;
        this.isAllowed = bool;
        this.render = stickersStickerRenderDto;
        this.vmoji = stickersStickerVmojiDto;
        this.imageConfigContext = stickersImageConfigContextDto;
        this.popup = stickersStickerPopupDto;
        this.packUrl = str2;
    }

    public final List<BaseStickerAnimationDto> d() {
        return this.animations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StickersImageConfigContextDto e() {
        return this.imageConfigContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseStickerDto)) {
            return false;
        }
        BaseStickerDto baseStickerDto = (BaseStickerDto) obj;
        return this.innerType == baseStickerDto.innerType && epx.f(this.stickerId, baseStickerDto.stickerId) && epx.f(this.productId, baseStickerDto.productId) && epx.f(this.images, baseStickerDto.images) && epx.f(this.imagesWithBackground, baseStickerDto.imagesWithBackground) && epx.f(this.animationUrl, baseStickerDto.animationUrl) && epx.f(this.animations, baseStickerDto.animations) && epx.f(this.isAllowed, baseStickerDto.isAllowed) && epx.f(this.render, baseStickerDto.render) && epx.f(this.vmoji, baseStickerDto.vmoji) && epx.f(this.imageConfigContext, baseStickerDto.imageConfigContext) && epx.f(this.popup, baseStickerDto.popup) && epx.f(this.packUrl, baseStickerDto.packUrl);
    }

    public final List<BaseImageDto> f() {
        return this.images;
    }

    public final List<BaseImageDto> g() {
        return this.imagesWithBackground;
    }

    public final int hashCode() {
        int hashCode = this.innerType.hashCode() * 31;
        Integer num = this.stickerId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.productId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.imagesWithBackground;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.animationUrl;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseStickerAnimationDto> list3 = this.animations;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.isAllowed;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        StickersStickerRenderDto stickersStickerRenderDto = this.render;
        int hashCode9 = (hashCode8 + (stickersStickerRenderDto == null ? 0 : stickersStickerRenderDto.hashCode())) * 31;
        StickersStickerVmojiDto stickersStickerVmojiDto = this.vmoji;
        int hashCode10 = (hashCode9 + (stickersStickerVmojiDto == null ? 0 : stickersStickerVmojiDto.hashCode())) * 31;
        StickersImageConfigContextDto stickersImageConfigContextDto = this.imageConfigContext;
        int hashCode11 = (hashCode10 + (stickersImageConfigContextDto == null ? 0 : stickersImageConfigContextDto.hashCode())) * 31;
        StickersStickerPopupDto stickersStickerPopupDto = this.popup;
        int hashCode12 = (hashCode11 + (stickersStickerPopupDto == null ? 0 : stickersStickerPopupDto.hashCode())) * 31;
        String str2 = this.packUrl;
        return hashCode12 + (str2 != null ? str2.hashCode() : 0);
    }

    public final StickersStickerPopupDto i() {
        return this.popup;
    }

    public final Integer j() {
        return this.productId;
    }

    public final StickersStickerRenderDto k() {
        return this.render;
    }

    public final Integer l() {
        return this.stickerId;
    }

    public final StickersStickerVmojiDto n() {
        return this.vmoji;
    }

    public final Boolean o() {
        return this.isAllowed;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseStickerDto(innerType=");
        sb.append(this.innerType);
        sb.append(", stickerId=");
        sb.append(this.stickerId);
        sb.append(", productId=");
        sb.append(this.productId);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", imagesWithBackground=");
        sb.append(this.imagesWithBackground);
        sb.append(", animationUrl=");
        sb.append(this.animationUrl);
        sb.append(", animations=");
        sb.append(this.animations);
        sb.append(", isAllowed=");
        sb.append(this.isAllowed);
        sb.append(", render=");
        sb.append(this.render);
        sb.append(", vmoji=");
        sb.append(this.vmoji);
        sb.append(", imageConfigContext=");
        sb.append(this.imageConfigContext);
        sb.append(", popup=");
        sb.append(this.popup);
        sb.append(", packUrl=");
        return ho8.a(sb, this.packUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.innerType.writeToParcel(parcel, i);
        Integer num = this.stickerId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.productId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseImageDto> list2 = this.imagesWithBackground;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.animationUrl);
        List<BaseStickerAnimationDto> list3 = this.animations;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((BaseStickerAnimationDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isAllowed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        StickersStickerRenderDto stickersStickerRenderDto = this.render;
        if (stickersStickerRenderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersStickerRenderDto.writeToParcel(parcel, i);
        }
        StickersStickerVmojiDto stickersStickerVmojiDto = this.vmoji;
        if (stickersStickerVmojiDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersStickerVmojiDto.writeToParcel(parcel, i);
        }
        StickersImageConfigContextDto stickersImageConfigContextDto = this.imageConfigContext;
        if (stickersImageConfigContextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersImageConfigContextDto.writeToParcel(parcel, i);
        }
        StickersStickerPopupDto stickersStickerPopupDto = this.popup;
        if (stickersStickerPopupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersStickerPopupDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.packUrl);
    }

    public /* synthetic */ BaseStickerDto(InnerTypeDto innerTypeDto, Integer num, Integer num2, List list, List list2, String str, List list3, Boolean bool, StickersStickerRenderDto stickersStickerRenderDto, StickersStickerVmojiDto stickersStickerVmojiDto, StickersImageConfigContextDto stickersImageConfigContextDto, StickersStickerPopupDto stickersStickerPopupDto, String str2, int i, zcl zclVar) {
        this(innerTypeDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : stickersStickerRenderDto, (i & 512) != 0 ? null : stickersStickerVmojiDto, (i & 1024) != 0 ? null : stickersImageConfigContextDto, (i & 2048) != 0 ? null : stickersStickerPopupDto, (i & 4096) != 0 ? null : str2);
    }
}
