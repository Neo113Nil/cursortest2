package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.MetaBox;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.base.dto.BaseImageDto;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogCatalogLinkDto.kt */
/* loaded from: classes14.dex */
public final class CatalogCatalogLinkDto implements Parcelable {
    public static final Parcelable.Creator<CatalogCatalogLinkDto> CREATOR = new a();

    @pmi0("analytic_name")
    private final String analyticName;

    @pmi0("animation_url")
    private final String animationUrl;

    @pmi0(L2.g)
    private final CatalogBackgroundDto background;

    @pmi0("badge")
    private final CatalogBadgeDto badge;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("image_style")
    private final ImageStyleDto imageStyle;

    @pmi0("images")
    private final List<List<BaseImageDto>> images;

    @pmi0("is_nft")
    private final Boolean isNft;

    @pmi0("is_removable")
    private final Boolean isRemovable;

    @pmi0(MetaBox.TYPE)
    private final CatalogCatalogLinkMetaDto meta;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogCatalogLinkDto.kt */
    public static final class ImageStyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageStyleDto[] $VALUES;
        public static final Parcelable.Creator<ImageStyleDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final ImageStyleDto DEFAULT;

        @pmi0("horizontal_list")
        public static final ImageStyleDto HORIZONTAL_LIST;

        @pmi0("placeholder_icon")
        public static final ImageStyleDto PLACEHOLDER_ICON;

        @pmi0("rectangle_right_side")
        public static final ImageStyleDto RECTANGLE_RIGHT_SIDE;

        @pmi0("rectangle_stacked_rotated")
        public static final ImageStyleDto RECTANGLE_STACKED_ROTATED;

        @pmi0("round_stacked_rotated")
        public static final ImageStyleDto ROUND_STACKED_ROTATED;

        @pmi0("triple_rotated_right")
        public static final ImageStyleDto TRIPLE_ROTATED_RIGHT;
        private final String value;

        /* compiled from: CatalogCatalogLinkDto.kt */
        public static final class a implements Parcelable.Creator<ImageStyleDto> {
            @Override // android.os.Parcelable.Creator
            public final ImageStyleDto createFromParcel(Parcel parcel) {
                return ImageStyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ImageStyleDto[] newArray(int i) {
                return new ImageStyleDto[i];
            }
        }

        static {
            ImageStyleDto imageStyleDto = new ImageStyleDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = imageStyleDto;
            ImageStyleDto imageStyleDto2 = new ImageStyleDto("HORIZONTAL_LIST", 1, "horizontal_list");
            HORIZONTAL_LIST = imageStyleDto2;
            ImageStyleDto imageStyleDto3 = new ImageStyleDto("PLACEHOLDER_ICON", 2, "placeholder_icon");
            PLACEHOLDER_ICON = imageStyleDto3;
            ImageStyleDto imageStyleDto4 = new ImageStyleDto("ROUND_STACKED_ROTATED", 3, "round_stacked_rotated");
            ROUND_STACKED_ROTATED = imageStyleDto4;
            ImageStyleDto imageStyleDto5 = new ImageStyleDto("RECTANGLE_RIGHT_SIDE", 4, "rectangle_right_side");
            RECTANGLE_RIGHT_SIDE = imageStyleDto5;
            ImageStyleDto imageStyleDto6 = new ImageStyleDto("RECTANGLE_STACKED_ROTATED", 5, "rectangle_stacked_rotated");
            RECTANGLE_STACKED_ROTATED = imageStyleDto6;
            ImageStyleDto imageStyleDto7 = new ImageStyleDto("TRIPLE_ROTATED_RIGHT", 6, "triple_rotated_right");
            TRIPLE_ROTATED_RIGHT = imageStyleDto7;
            ImageStyleDto[] imageStyleDtoArr = {imageStyleDto, imageStyleDto2, imageStyleDto3, imageStyleDto4, imageStyleDto5, imageStyleDto6, imageStyleDto7};
            $VALUES = imageStyleDtoArr;
            $ENTRIES = new asp(imageStyleDtoArr);
            CREATOR = new a();
        }

        private ImageStyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ImageStyleDto valueOf(String str) {
            return (ImageStyleDto) Enum.valueOf(ImageStyleDto.class, str);
        }

        public static ImageStyleDto[] values() {
            return (ImageStyleDto[]) $VALUES.clone();
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

    /* compiled from: CatalogCatalogLinkDto.kt */
    public static final class a implements Parcelable.Creator<CatalogCatalogLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogLinkDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(CatalogCatalogLinkDto.class, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt3);
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = bo.b(CatalogCatalogLinkDto.class, parcel, arrayList5, i3, 1);
                    }
                    arrayList4.add(arrayList5);
                }
                arrayList2 = arrayList4;
            }
            ImageStyleDto createFromParcel = parcel.readInt() == 0 ? null : ImageStyleDto.CREATOR.createFromParcel(parcel);
            CatalogCatalogLinkMetaDto createFromParcel2 = parcel.readInt() == 0 ? null : CatalogCatalogLinkMetaDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CatalogCatalogLinkDto(readString, arrayList, arrayList2, createFromParcel, createFromParcel2, readString2, readString3, readString4, valueOf2, valueOf, parcel.readInt() == 0 ? null : CatalogBadgeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? CatalogBackgroundDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogLinkDto[] newArray(int i) {
            return new CatalogCatalogLinkDto[i];
        }
    }

    public CatalogCatalogLinkDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final String d() {
        return this.analyticName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.animationUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCatalogLinkDto)) {
            return false;
        }
        CatalogCatalogLinkDto catalogCatalogLinkDto = (CatalogCatalogLinkDto) obj;
        return epx.f(this.id, catalogCatalogLinkDto.id) && epx.f(this.image, catalogCatalogLinkDto.image) && epx.f(this.images, catalogCatalogLinkDto.images) && this.imageStyle == catalogCatalogLinkDto.imageStyle && epx.f(this.meta, catalogCatalogLinkDto.meta) && epx.f(this.subtitle, catalogCatalogLinkDto.subtitle) && epx.f(this.title, catalogCatalogLinkDto.title) && epx.f(this.url, catalogCatalogLinkDto.url) && epx.f(this.isNft, catalogCatalogLinkDto.isNft) && epx.f(this.isRemovable, catalogCatalogLinkDto.isRemovable) && epx.f(this.badge, catalogCatalogLinkDto.badge) && epx.f(this.animationUrl, catalogCatalogLinkDto.animationUrl) && epx.f(this.background, catalogCatalogLinkDto.background) && epx.f(this.analyticName, catalogCatalogLinkDto.analyticName);
    }

    public final CatalogBackgroundDto f() {
        return this.background;
    }

    public final CatalogBadgeDto g() {
        return this.badge;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BaseImageDto> list = this.image;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<List<BaseImageDto>> list2 = this.images;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ImageStyleDto imageStyleDto = this.imageStyle;
        int hashCode4 = (hashCode3 + (imageStyleDto == null ? 0 : imageStyleDto.hashCode())) * 31;
        CatalogCatalogLinkMetaDto catalogCatalogLinkMetaDto = this.meta;
        int hashCode5 = (hashCode4 + (catalogCatalogLinkMetaDto == null ? 0 : catalogCatalogLinkMetaDto.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isNft;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRemovable;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CatalogBadgeDto catalogBadgeDto = this.badge;
        int hashCode11 = (hashCode10 + (catalogBadgeDto == null ? 0 : catalogBadgeDto.hashCode())) * 31;
        String str5 = this.animationUrl;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CatalogBackgroundDto catalogBackgroundDto = this.background;
        int hashCode13 = (hashCode12 + (catalogBackgroundDto == null ? 0 : catalogBackgroundDto.hashCode())) * 31;
        String str6 = this.analyticName;
        return hashCode13 + (str6 != null ? str6.hashCode() : 0);
    }

    public final List<BaseImageDto> i() {
        return this.image;
    }

    public final ImageStyleDto j() {
        return this.imageStyle;
    }

    public final List<List<BaseImageDto>> k() {
        return this.images;
    }

    public final CatalogCatalogLinkMetaDto l() {
        return this.meta;
    }

    public final String n() {
        return this.subtitle;
    }

    public final Boolean o() {
        return this.isNft;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogCatalogLinkDto(id=");
        sb.append(this.id);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", imageStyle=");
        sb.append(this.imageStyle);
        sb.append(", meta=");
        sb.append(this.meta);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", isNft=");
        sb.append(this.isNft);
        sb.append(", isRemovable=");
        sb.append(this.isRemovable);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", animationUrl=");
        sb.append(this.animationUrl);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", analyticName=");
        return ho8.a(sb, this.analyticName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<List<BaseImageDto>> list2 = this.images;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f2.next());
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
            }
        }
        ImageStyleDto imageStyleDto = this.imageStyle;
        if (imageStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageStyleDto.writeToParcel(parcel, i);
        }
        CatalogCatalogLinkMetaDto catalogCatalogLinkMetaDto = this.meta;
        if (catalogCatalogLinkMetaDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogCatalogLinkMetaDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.subtitle);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        Boolean bool = this.isNft;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isRemovable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        CatalogBadgeDto catalogBadgeDto = this.badge;
        if (catalogBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBadgeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.animationUrl);
        CatalogBackgroundDto catalogBackgroundDto = this.background;
        if (catalogBackgroundDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBackgroundDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.analyticName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogCatalogLinkDto(String str, List<BaseImageDto> list, List<? extends List<BaseImageDto>> list2, ImageStyleDto imageStyleDto, CatalogCatalogLinkMetaDto catalogCatalogLinkMetaDto, String str2, String str3, String str4, Boolean bool, Boolean bool2, CatalogBadgeDto catalogBadgeDto, String str5, CatalogBackgroundDto catalogBackgroundDto, String str6) {
        this.id = str;
        this.image = list;
        this.images = list2;
        this.imageStyle = imageStyleDto;
        this.meta = catalogCatalogLinkMetaDto;
        this.subtitle = str2;
        this.title = str3;
        this.url = str4;
        this.isNft = bool;
        this.isRemovable = bool2;
        this.badge = catalogBadgeDto;
        this.animationUrl = str5;
        this.background = catalogBackgroundDto;
        this.analyticName = str6;
    }

    public /* synthetic */ CatalogCatalogLinkDto(String str, List list, List list2, ImageStyleDto imageStyleDto, CatalogCatalogLinkMetaDto catalogCatalogLinkMetaDto, String str2, String str3, String str4, Boolean bool, Boolean bool2, CatalogBadgeDto catalogBadgeDto, String str5, CatalogBackgroundDto catalogBackgroundDto, String str6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : imageStyleDto, (i & 16) != 0 ? null : catalogCatalogLinkMetaDto, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : catalogBadgeDto, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : catalogBackgroundDto, (i & 8192) != 0 ? null : str6);
    }
}
