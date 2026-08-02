package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsBannerDto.kt */
/* loaded from: classes14.dex */
public final class GroupsBannerDto implements Parcelable {
    public static final Parcelable.Creator<GroupsBannerDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0(X3.i.F0)
    private final String advertiser;

    @pmi0("allow_hide")
    private final boolean allowHide;

    @pmi0("background_images")
    private final List<BaseImageDto> backgroundImages;

    @pmi0("banner_id")
    private final String bannerId;

    @pmi0("button_title")
    private final String buttonTitle;

    @pmi0("description")
    private final String description;

    @pmi0("erid")
    private final String erid;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("icon_position")
    private final IconPositionDto iconPosition;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("theme")
    private final ThemeDto theme;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsBannerDto.kt */
    public static final class IconPositionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconPositionDto[] $VALUES;
        public static final Parcelable.Creator<IconPositionDto> CREATOR;

        @pmi0(TtmlNode.LEFT)
        public static final IconPositionDto LEFT;

        @pmi0(TtmlNode.RIGHT)
        public static final IconPositionDto RIGHT;
        private final String value;

        /* compiled from: GroupsBannerDto.kt */
        public static final class a implements Parcelable.Creator<IconPositionDto> {
            @Override // android.os.Parcelable.Creator
            public final IconPositionDto createFromParcel(Parcel parcel) {
                return IconPositionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconPositionDto[] newArray(int i) {
                return new IconPositionDto[i];
            }
        }

        static {
            IconPositionDto iconPositionDto = new IconPositionDto("LEFT", 0, TtmlNode.LEFT);
            LEFT = iconPositionDto;
            IconPositionDto iconPositionDto2 = new IconPositionDto("RIGHT", 1, TtmlNode.RIGHT);
            RIGHT = iconPositionDto2;
            IconPositionDto[] iconPositionDtoArr = {iconPositionDto, iconPositionDto2};
            $VALUES = iconPositionDtoArr;
            $ENTRIES = new asp(iconPositionDtoArr);
            CREATOR = new a();
        }

        private IconPositionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IconPositionDto valueOf(String str) {
            return (IconPositionDto) Enum.valueOf(IconPositionDto.class, str);
        }

        public static IconPositionDto[] values() {
            return (IconPositionDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsBannerDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("online_booking_modal")
        public static final StyleDto ONLINE_BOOKING_MODAL;

        @pmi0("online_booking_section")
        public static final StyleDto ONLINE_BOOKING_SECTION;

        @pmi0("soccom_default_banner")
        public static final StyleDto SOCCOM_DEFAULT_BANNER;
        private final String value;

        /* compiled from: GroupsBannerDto.kt */
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
            StyleDto styleDto = new StyleDto("ONLINE_BOOKING_SECTION", 0, "online_booking_section");
            ONLINE_BOOKING_SECTION = styleDto;
            StyleDto styleDto2 = new StyleDto("ONLINE_BOOKING_MODAL", 1, "online_booking_modal");
            ONLINE_BOOKING_MODAL = styleDto2;
            StyleDto styleDto3 = new StyleDto("SOCCOM_DEFAULT_BANNER", 2, "soccom_default_banner");
            SOCCOM_DEFAULT_BANNER = styleDto3;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsBannerDto.kt */
    public static final class ThemeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ThemeDto[] $VALUES;
        public static final Parcelable.Creator<ThemeDto> CREATOR;

        @pmi0("dark")
        public static final ThemeDto DARK;

        @pmi0(BuildConfig.FLAVOR)
        public static final ThemeDto DEFAULT;

        @pmi0("light")
        public static final ThemeDto LIGHT;
        private final String value;

        /* compiled from: GroupsBannerDto.kt */
        public static final class a implements Parcelable.Creator<ThemeDto> {
            @Override // android.os.Parcelable.Creator
            public final ThemeDto createFromParcel(Parcel parcel) {
                return ThemeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ThemeDto[] newArray(int i) {
                return new ThemeDto[i];
            }
        }

        static {
            ThemeDto themeDto = new ThemeDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = themeDto;
            ThemeDto themeDto2 = new ThemeDto("LIGHT", 1, "light");
            LIGHT = themeDto2;
            ThemeDto themeDto3 = new ThemeDto("DARK", 2, "dark");
            DARK = themeDto3;
            ThemeDto[] themeDtoArr = {themeDto, themeDto2, themeDto3};
            $VALUES = themeDtoArr;
            $ENTRIES = new asp(themeDtoArr);
            CREATOR = new a();
        }

        private ThemeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ThemeDto valueOf(String str) {
            return (ThemeDto) Enum.valueOf(ThemeDto.class, str);
        }

        public static ThemeDto[] values() {
            return (ThemeDto[]) $VALUES.clone();
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

    /* compiled from: GroupsBannerDto.kt */
    public static final class a implements Parcelable.Creator<GroupsBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsBannerDto createFromParcel(Parcel parcel) {
            boolean z;
            BaseLinkButtonActionDto baseLinkButtonActionDto;
            boolean z2;
            ArrayList arrayList;
            String str;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(BaseImageDto.CREATOR, parcel, arrayList2, i, 1);
            }
            String readString2 = parcel.readString();
            BaseLinkButtonActionDto createFromParcel = BaseLinkButtonActionDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = false;
                baseLinkButtonActionDto = createFromParcel;
                z2 = true;
            } else {
                z = false;
                baseLinkButtonActionDto = createFromParcel;
                z2 = false;
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            StyleDto createFromParcel2 = parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (true) {
                    str = readString;
                    if (i2 == readInt2) {
                        break;
                    }
                    i2 = en.a(BaseImageDto.CREATOR, parcel, arrayList, i2, 1);
                    readString = str;
                }
            } else {
                arrayList = null;
                str = readString;
            }
            return new GroupsBannerDto(str, arrayList2, readString2, baseLinkButtonActionDto, z2, readString3, readString4, readString5, readString6, readString7, createFromParcel2, arrayList, parcel.readInt() == 0 ? null : ThemeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconPositionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsBannerDto[] newArray(int i) {
            return new GroupsBannerDto[i];
        }
    }

    public GroupsBannerDto(String str, List<BaseImageDto> list, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto, boolean z, String str3, String str4, String str5, String str6, String str7, StyleDto styleDto, List<BaseImageDto> list2, ThemeDto themeDto, IconPositionDto iconPositionDto) {
        this.description = str;
        this.icon = list;
        this.title = str2;
        this.action = baseLinkButtonActionDto;
        this.allowHide = z;
        this.buttonTitle = str3;
        this.bannerId = str4;
        this.trackCode = str5;
        this.advertiser = str6;
        this.erid = str7;
        this.style = styleDto;
        this.backgroundImages = list2;
        this.theme = themeDto;
        this.iconPosition = iconPositionDto;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.advertiser;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsBannerDto)) {
            return false;
        }
        GroupsBannerDto groupsBannerDto = (GroupsBannerDto) obj;
        return epx.f(this.description, groupsBannerDto.description) && epx.f(this.icon, groupsBannerDto.icon) && epx.f(this.title, groupsBannerDto.title) && epx.f(this.action, groupsBannerDto.action) && this.allowHide == groupsBannerDto.allowHide && epx.f(this.buttonTitle, groupsBannerDto.buttonTitle) && epx.f(this.bannerId, groupsBannerDto.bannerId) && epx.f(this.trackCode, groupsBannerDto.trackCode) && epx.f(this.advertiser, groupsBannerDto.advertiser) && epx.f(this.erid, groupsBannerDto.erid) && this.style == groupsBannerDto.style && epx.f(this.backgroundImages, groupsBannerDto.backgroundImages) && this.theme == groupsBannerDto.theme && this.iconPosition == groupsBannerDto.iconPosition;
    }

    public final boolean f() {
        return this.allowHide;
    }

    public final List<BaseImageDto> g() {
        return this.backgroundImages;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int b = qoy.b((this.action.hashCode() + urd0.a(fw3.a(this.description.hashCode() * 31, 31, this.icon), 31, this.title)) * 31, 31, this.allowHide);
        String str = this.buttonTitle;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bannerId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.advertiser;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.erid;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        StyleDto styleDto = this.style;
        int hashCode6 = (hashCode5 + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        List<BaseImageDto> list = this.backgroundImages;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        ThemeDto themeDto = this.theme;
        int hashCode8 = (hashCode7 + (themeDto == null ? 0 : themeDto.hashCode())) * 31;
        IconPositionDto iconPositionDto = this.iconPosition;
        return hashCode8 + (iconPositionDto != null ? iconPositionDto.hashCode() : 0);
    }

    public final String i() {
        return this.bannerId;
    }

    public final String j() {
        return this.buttonTitle;
    }

    public final String k() {
        return this.erid;
    }

    public final List<BaseImageDto> l() {
        return this.icon;
    }

    public final IconPositionDto n() {
        return this.iconPosition;
    }

    public final ThemeDto o() {
        return this.theme;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "GroupsBannerDto(description=" + this.description + ", icon=" + this.icon + ", title=" + this.title + ", action=" + this.action + ", allowHide=" + this.allowHide + ", buttonTitle=" + this.buttonTitle + ", bannerId=" + this.bannerId + ", trackCode=" + this.trackCode + ", advertiser=" + this.advertiser + ", erid=" + this.erid + ", style=" + this.style + ", backgroundImages=" + this.backgroundImages + ", theme=" + this.theme + ", iconPosition=" + this.iconPosition + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        Iterator a2 = ao.a(parcel, this.icon);
        while (a2.hasNext()) {
            ((BaseImageDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        this.action.writeToParcel(parcel, i);
        parcel.writeInt(this.allowHide ? 1 : 0);
        parcel.writeString(this.buttonTitle);
        parcel.writeString(this.bannerId);
        parcel.writeString(this.trackCode);
        parcel.writeString(this.advertiser);
        parcel.writeString(this.erid);
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list = this.backgroundImages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        ThemeDto themeDto = this.theme;
        if (themeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeDto.writeToParcel(parcel, i);
        }
        IconPositionDto iconPositionDto = this.iconPosition;
        if (iconPositionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconPositionDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsBannerDto(String str, List list, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto, boolean z, String str3, String str4, String str5, String str6, String str7, StyleDto styleDto, List list2, ThemeDto themeDto, IconPositionDto iconPositionDto, int i, zcl zclVar) {
        this(str, list, str2, baseLinkButtonActionDto, z, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : styleDto, (i & 2048) != 0 ? null : list2, (i & 4096) != 0 ? null : themeDto, (i & 8192) != 0 ? null : iconPositionDto);
    }
}
