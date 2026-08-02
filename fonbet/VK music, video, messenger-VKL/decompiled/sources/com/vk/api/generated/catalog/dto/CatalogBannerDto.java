package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import io.appmetrica.analytics.impl.L2;
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

/* compiled from: CatalogBannerDto.kt */
/* loaded from: classes14.dex */
public final class CatalogBannerDto implements Parcelable {
    public static final Parcelable.Creator<CatalogBannerDto> CREATOR = new a();

    @pmi0(L2.g)
    private final CatalogBackgroundDto background;

    @pmi0("buttons")
    private final List<BaseLinkButtonDto> buttons;

    @pmi0("click_action")
    private final BaseLinkButtonDto clickAction;

    @pmi0("foreground_image")
    private final List<BaseImageDto> foregroundImage;

    @pmi0("id")
    private final int id;

    @pmi0("image_mode")
    private final ImageModeDto imageMode;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("subtext")
    private final String subtext;

    @pmi0("tag")
    private final String tag;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    @pmi0("title_icon")
    private final CatalogTitleIconDto titleIcon;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogBannerDto.kt */
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

        /* compiled from: CatalogBannerDto.kt */
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogBannerDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("cover_bottom_right")
        public static final StyleDto COVER_BOTTOM_RIGHT;

        @pmi0("cover_middle_left")
        public static final StyleDto COVER_MIDDLE_LEFT;

        @pmi0("cover_middle_middle")
        public static final StyleDto COVER_MIDDLE_MIDDLE;

        @pmi0("cover_middle_right")
        public static final StyleDto COVER_MIDDLE_RIGHT;

        @pmi0("cover_top_right")
        public static final StyleDto COVER_TOP_RIGHT;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("cropped_cover_middle_right")
        public static final StyleDto CROPPED_COVER_MIDDLE_RIGHT;

        @pmi0("no_cover")
        public static final StyleDto NO_COVER;
        private final String value;

        /* compiled from: CatalogBannerDto.kt */
        public static final class a implements Parcelable.Creator<StyleDto> {
            @Override // android.os.Parcelable.Creator
            public final StyleDto createFromParcel(Parcel parcel) {
                return StyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StyleDto[] newArray(int i) {
                return new StyleDto[i];
            }
        }

        static {
            StyleDto styleDto = new StyleDto("COVER_MIDDLE_RIGHT", 0, "cover_middle_right");
            COVER_MIDDLE_RIGHT = styleDto;
            StyleDto styleDto2 = new StyleDto("COVER_MIDDLE_LEFT", 1, "cover_middle_left");
            COVER_MIDDLE_LEFT = styleDto2;
            StyleDto styleDto3 = new StyleDto("COVER_MIDDLE_MIDDLE", 2, "cover_middle_middle");
            COVER_MIDDLE_MIDDLE = styleDto3;
            StyleDto styleDto4 = new StyleDto("CROPPED_COVER_MIDDLE_RIGHT", 3, "cropped_cover_middle_right");
            CROPPED_COVER_MIDDLE_RIGHT = styleDto4;
            StyleDto styleDto5 = new StyleDto("COVER_BOTTOM_RIGHT", 4, "cover_bottom_right");
            COVER_BOTTOM_RIGHT = styleDto5;
            StyleDto styleDto6 = new StyleDto("COVER_TOP_RIGHT", 5, "cover_top_right");
            COVER_TOP_RIGHT = styleDto6;
            StyleDto styleDto7 = new StyleDto("NO_COVER", 6, "no_cover");
            NO_COVER = styleDto7;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3, styleDto4, styleDto5, styleDto6, styleDto7};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
            CREATOR = new a();
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
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

    /* compiled from: CatalogBannerDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBannerDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(CatalogBannerDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(CatalogBannerDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = bo.b(CatalogBannerDto.class, parcel, arrayList3, i2, 1);
                }
                arrayList2 = arrayList3;
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList4 = null;
            String readString3 = parcel.readString();
            ArrayList arrayList5 = arrayList;
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            ImageModeDto createFromParcel = parcel.readInt() == 0 ? null : ImageModeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt4);
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = bo.b(CatalogBannerDto.class, parcel, arrayList6, i3, 1);
                }
                arrayList4 = arrayList6;
            }
            return new CatalogBannerDto(readInt, baseLinkButtonDto, arrayList5, arrayList2, readString, readString2, readString3, readString4, readString5, createFromParcel, arrayList4, parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CatalogTitleIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CatalogBackgroundDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBannerDto[] newArray(int i) {
            return new CatalogBannerDto[i];
        }
    }

    public CatalogBannerDto(int i, BaseLinkButtonDto baseLinkButtonDto, List<BaseLinkButtonDto> list, List<BaseImageDto> list2, String str, String str2, String str3, String str4, String str5, ImageModeDto imageModeDto, List<BaseImageDto> list3, StyleDto styleDto, CatalogTitleIconDto catalogTitleIconDto, CatalogBackgroundDto catalogBackgroundDto) {
        this.id = i;
        this.clickAction = baseLinkButtonDto;
        this.buttons = list;
        this.images = list2;
        this.text = str;
        this.title = str2;
        this.tag = str3;
        this.subtext = str4;
        this.trackCode = str5;
        this.imageMode = imageModeDto;
        this.foregroundImage = list3;
        this.style = styleDto;
        this.titleIcon = catalogTitleIconDto;
        this.background = catalogBackgroundDto;
    }

    public final List<BaseLinkButtonDto> d() {
        return this.buttons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseLinkButtonDto e() {
        return this.clickAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBannerDto)) {
            return false;
        }
        CatalogBannerDto catalogBannerDto = (CatalogBannerDto) obj;
        return this.id == catalogBannerDto.id && epx.f(this.clickAction, catalogBannerDto.clickAction) && epx.f(this.buttons, catalogBannerDto.buttons) && epx.f(this.images, catalogBannerDto.images) && epx.f(this.text, catalogBannerDto.text) && epx.f(this.title, catalogBannerDto.title) && epx.f(this.tag, catalogBannerDto.tag) && epx.f(this.subtext, catalogBannerDto.subtext) && epx.f(this.trackCode, catalogBannerDto.trackCode) && this.imageMode == catalogBannerDto.imageMode && epx.f(this.foregroundImage, catalogBannerDto.foregroundImage) && this.style == catalogBannerDto.style && epx.f(this.titleIcon, catalogBannerDto.titleIcon) && epx.f(this.background, catalogBannerDto.background);
    }

    public final List<BaseImageDto> f() {
        return this.foregroundImage;
    }

    public final ImageModeDto g() {
        return this.imageMode;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.clickAction;
        int hashCode2 = (hashCode + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        List<BaseLinkButtonDto> list = this.buttons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.images;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.text;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtext;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trackCode;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ImageModeDto imageModeDto = this.imageMode;
        int hashCode10 = (hashCode9 + (imageModeDto == null ? 0 : imageModeDto.hashCode())) * 31;
        List<BaseImageDto> list3 = this.foregroundImage;
        int hashCode11 = (hashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        StyleDto styleDto = this.style;
        int hashCode12 = (hashCode11 + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        CatalogTitleIconDto catalogTitleIconDto = this.titleIcon;
        int hashCode13 = (hashCode12 + (catalogTitleIconDto == null ? 0 : catalogTitleIconDto.hashCode())) * 31;
        CatalogBackgroundDto catalogBackgroundDto = this.background;
        return hashCode13 + (catalogBackgroundDto != null ? catalogBackgroundDto.hashCode() : 0);
    }

    public final List<BaseImageDto> i() {
        return this.images;
    }

    public final StyleDto j() {
        return this.style;
    }

    public final String k() {
        return this.subtext;
    }

    public final String l() {
        return this.text;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "CatalogBannerDto(id=" + this.id + ", clickAction=" + this.clickAction + ", buttons=" + this.buttons + ", images=" + this.images + ", text=" + this.text + ", title=" + this.title + ", tag=" + this.tag + ", subtext=" + this.subtext + ", trackCode=" + this.trackCode + ", imageMode=" + this.imageMode + ", foregroundImage=" + this.foregroundImage + ", style=" + this.style + ", titleIcon=" + this.titleIcon + ", background=" + this.background + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.clickAction, i);
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
        List<BaseImageDto> list3 = this.foregroundImage;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        CatalogTitleIconDto catalogTitleIconDto = this.titleIcon;
        if (catalogTitleIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogTitleIconDto.writeToParcel(parcel, i);
        }
        CatalogBackgroundDto catalogBackgroundDto = this.background;
        if (catalogBackgroundDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBackgroundDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CatalogBannerDto(int i, BaseLinkButtonDto baseLinkButtonDto, List list, List list2, String str, String str2, String str3, String str4, String str5, ImageModeDto imageModeDto, List list3, StyleDto styleDto, CatalogTitleIconDto catalogTitleIconDto, CatalogBackgroundDto catalogBackgroundDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : baseLinkButtonDto, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : imageModeDto, (i2 & 1024) != 0 ? null : list3, (i2 & 2048) != 0 ? null : styleDto, (i2 & 4096) != 0 ? null : catalogTitleIconDto, (i2 & 8192) != 0 ? null : catalogBackgroundDto);
    }
}
