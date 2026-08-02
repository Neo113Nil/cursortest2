package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogBannerVideoDto.kt */
/* loaded from: classes14.dex */
public final class CatalogBannerVideoDto implements Parcelable {
    public static final Parcelable.Creator<CatalogBannerVideoDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<BaseLinkButtonDto> buttons;

    @pmi0("id")
    private final int id;

    @pmi0("image_mode")
    private final ImageModeDto imageMode;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("subtext")
    private final String subtext;

    @pmi0("tag")
    private final String tag;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogBannerVideoDto.kt */
    public static final class ImageModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageModeDto[] $VALUES;

        @pmi0("avatar")
        public static final ImageModeDto AVATAR;

        @pmi0("cover")
        public static final ImageModeDto COVER;
        public static final Parcelable.Creator<ImageModeDto> CREATOR;

        @pmi0("icon")
        public static final ImageModeDto ICON;

        @pmi0("image")
        public static final ImageModeDto IMAGE;

        @pmi0("none")
        public static final ImageModeDto NONE;

        @pmi0("rounded_small_image")
        public static final ImageModeDto ROUNDED_SMALL_IMAGE;

        @pmi0("small_image")
        public static final ImageModeDto SMALL_IMAGE;
        private final String value;

        /* compiled from: CatalogBannerVideoDto.kt */
        public static final class a implements Parcelable.Creator<ImageModeDto> {
            @Override // android.os.Parcelable.Creator
            public final ImageModeDto createFromParcel(Parcel parcel) {
                return ImageModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ImageModeDto[] newArray(int i) {
                return new ImageModeDto[i];
            }
        }

        static {
            ImageModeDto imageModeDto = new ImageModeDto("NONE", 0, "none");
            NONE = imageModeDto;
            ImageModeDto imageModeDto2 = new ImageModeDto("COVER", 1, "cover");
            COVER = imageModeDto2;
            ImageModeDto imageModeDto3 = new ImageModeDto("IMAGE", 2, "image");
            IMAGE = imageModeDto3;
            ImageModeDto imageModeDto4 = new ImageModeDto("SMALL_IMAGE", 3, "small_image");
            SMALL_IMAGE = imageModeDto4;
            ImageModeDto imageModeDto5 = new ImageModeDto("ROUNDED_SMALL_IMAGE", 4, "rounded_small_image");
            ROUNDED_SMALL_IMAGE = imageModeDto5;
            ImageModeDto imageModeDto6 = new ImageModeDto("AVATAR", 5, "avatar");
            AVATAR = imageModeDto6;
            ImageModeDto imageModeDto7 = new ImageModeDto(NativeAdContent.ViewTag.AD_ICON, 6, "icon");
            ICON = imageModeDto7;
            ImageModeDto[] imageModeDtoArr = {imageModeDto, imageModeDto2, imageModeDto3, imageModeDto4, imageModeDto5, imageModeDto6, imageModeDto7};
            $VALUES = imageModeDtoArr;
            $ENTRIES = new asp(imageModeDtoArr);
            CREATOR = new a();
        }

        private ImageModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ImageModeDto valueOf(String str) {
            return (ImageModeDto) Enum.valueOf(ImageModeDto.class, str);
        }

        public static ImageModeDto[] values() {
            return (ImageModeDto[]) $VALUES.clone();
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

    /* compiled from: CatalogBannerVideoDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBannerVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBannerVideoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(CatalogBannerVideoDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(CatalogBannerVideoDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new CatalogBannerVideoDto(readInt, arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ImageModeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBannerVideoDto[] newArray(int i) {
            return new CatalogBannerVideoDto[i];
        }
    }

    public CatalogBannerVideoDto(int i, List<BaseLinkButtonDto> list, List<BaseImageDto> list2, String str, String str2, String str3, String str4, String str5, ImageModeDto imageModeDto) {
        this.id = i;
        this.buttons = list;
        this.images = list2;
        this.text = str;
        this.title = str2;
        this.tag = str3;
        this.subtext = str4;
        this.trackCode = str5;
        this.imageMode = imageModeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBannerVideoDto)) {
            return false;
        }
        CatalogBannerVideoDto catalogBannerVideoDto = (CatalogBannerVideoDto) obj;
        return this.id == catalogBannerVideoDto.id && epx.f(this.buttons, catalogBannerVideoDto.buttons) && epx.f(this.images, catalogBannerVideoDto.images) && epx.f(this.text, catalogBannerVideoDto.text) && epx.f(this.title, catalogBannerVideoDto.title) && epx.f(this.tag, catalogBannerVideoDto.tag) && epx.f(this.subtext, catalogBannerVideoDto.subtext) && epx.f(this.trackCode, catalogBannerVideoDto.trackCode) && this.imageMode == catalogBannerVideoDto.imageMode;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        List<BaseLinkButtonDto> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.images;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.text;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtext;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trackCode;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ImageModeDto imageModeDto = this.imageMode;
        return hashCode8 + (imageModeDto != null ? imageModeDto.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogBannerVideoDto(id=" + this.id + ", buttons=" + this.buttons + ", images=" + this.images + ", text=" + this.text + ", title=" + this.title + ", tag=" + this.tag + ", subtext=" + this.subtext + ", trackCode=" + this.trackCode + ", imageMode=" + this.imageMode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        List<BaseLinkButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseImageDto> list2 = this.images;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.tag);
        parcel.writeString(this.subtext);
        parcel.writeString(this.trackCode);
        ImageModeDto imageModeDto = this.imageMode;
        if (imageModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageModeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CatalogBannerVideoDto(int i, List list, List list2, String str, String str2, String str3, String str4, String str5, ImageModeDto imageModeDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : imageModeDto);
    }
}
