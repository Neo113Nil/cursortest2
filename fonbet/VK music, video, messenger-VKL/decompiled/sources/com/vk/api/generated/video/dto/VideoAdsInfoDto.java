package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.X3;
import com.vk.api.generated.ads.dto.AdsChoicesDto;
import com.vk.api.generated.ads.dto.AdsSkadDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoAdsInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoAdsInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoAdsInfoDto> CREATOR = new a();

    @pmi0("ad_choices")
    private final AdsChoicesDto adChoices;

    @pmi0("ad_marker")
    private final String adMarker;

    @pmi0("advertiser_info_url")
    private final String advertiserInfoUrl;

    @pmi0("age_restrictions")
    private final String ageRestrictions;

    @pmi0("disclaimer")
    private final String disclaimer;

    @pmi0("has_cta_button")
    private final Boolean hasCtaButton;

    @pmi0("is_app")
    private final Boolean isApp;

    @pmi0("owner_title")
    private final String ownerTitle;

    @pmi0("pattern")
    private final PatternDto pattern;

    @pmi0("photo_icon")
    private final List<BaseImageDto> photoIcon;

    @pmi0("skad")
    private final AdsSkadDto skad;

    @pmi0("target_owner_id")
    private final UserId targetOwnerId;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAdsInfoDto.kt */
    public static final class PatternDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PatternDto[] $VALUES;
        public static final Parcelable.Creator<PatternDto> CREATOR;

        @pmi0("other")
        public static final PatternDto OTHER;

        @pmi0(X3.i.D)
        public static final PatternDto PORTRAIT;
        private final String value;

        /* compiled from: VideoAdsInfoDto.kt */
        public static final class a implements Parcelable.Creator<PatternDto> {
            @Override // android.os.Parcelable.Creator
            public final PatternDto createFromParcel(Parcel parcel) {
                return PatternDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PatternDto[] newArray(int i) {
                return new PatternDto[i];
            }
        }

        static {
            PatternDto patternDto = new PatternDto("PORTRAIT", 0, X3.i.D);
            PORTRAIT = patternDto;
            PatternDto patternDto2 = new PatternDto(NativeAdContent.ViewTag.OTHER, 1, "other");
            OTHER = patternDto2;
            PatternDto[] patternDtoArr = {patternDto, patternDto2};
            $VALUES = patternDtoArr;
            $ENTRIES = new asp(patternDtoArr);
            CREATOR = new a();
        }

        private PatternDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static PatternDto valueOf(String str) {
            return (PatternDto) Enum.valueOf(PatternDto.class, str);
        }

        public static PatternDto[] values() {
            return (PatternDto[]) $VALUES.clone();
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
    /* compiled from: VideoAdsInfoDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("ads_mail_promoted_short_video")
        public static final TypeDto ADS_MAIL_PROMOTED_SHORT_VIDEO;

        @pmi0("ads_mail_short_video")
        public static final TypeDto ADS_MAIL_SHORT_VIDEO;

        @pmi0("ads_mail_short_video_known_owner")
        public static final TypeDto ADS_MAIL_SHORT_VIDEO_KNOWN_OWNER;

        @pmi0("ads_vk_short_video")
        public static final TypeDto ADS_VK_SHORT_VIDEO;
        public static final Parcelable.Creator<TypeDto> CREATOR;
        private final String value;

        /* compiled from: VideoAdsInfoDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("ADS_VK_SHORT_VIDEO", 0, "ads_vk_short_video");
            ADS_VK_SHORT_VIDEO = typeDto;
            TypeDto typeDto2 = new TypeDto("ADS_MAIL_SHORT_VIDEO", 1, "ads_mail_short_video");
            ADS_MAIL_SHORT_VIDEO = typeDto2;
            TypeDto typeDto3 = new TypeDto("ADS_MAIL_SHORT_VIDEO_KNOWN_OWNER", 2, "ads_mail_short_video_known_owner");
            ADS_MAIL_SHORT_VIDEO_KNOWN_OWNER = typeDto3;
            TypeDto typeDto4 = new TypeDto("ADS_MAIL_PROMOTED_SHORT_VIDEO", 3, "ads_mail_promoted_short_video");
            ADS_MAIL_PROMOTED_SHORT_VIDEO = typeDto4;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: VideoAdsInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoAdsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAdsInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            Boolean valueOf2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            AdsSkadDto createFromParcel2 = parcel.readInt() == 0 ? null : AdsSkadDto.CREATOR.createFromParcel(parcel);
            PatternDto createFromParcel3 = parcel.readInt() == 0 ? null : PatternDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            UserId userId = (UserId) parcel.readParcelable(VideoAdsInfoDto.class.getClassLoader());
            AdsChoicesDto createFromParcel4 = parcel.readInt() == 0 ? null : AdsChoicesDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoAdsInfoDto(readString, readString2, readString3, readString4, createFromParcel, valueOf, readString5, readString6, createFromParcel2, createFromParcel3, arrayList, userId, createFromParcel4, valueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAdsInfoDto[] newArray(int i) {
            return new VideoAdsInfoDto[i];
        }
    }

    public VideoAdsInfoDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final AdsChoicesDto d() {
        return this.adChoices;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.adMarker;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdsInfoDto)) {
            return false;
        }
        VideoAdsInfoDto videoAdsInfoDto = (VideoAdsInfoDto) obj;
        return epx.f(this.title, videoAdsInfoDto.title) && epx.f(this.ownerTitle, videoAdsInfoDto.ownerTitle) && epx.f(this.disclaimer, videoAdsInfoDto.disclaimer) && epx.f(this.ageRestrictions, videoAdsInfoDto.ageRestrictions) && this.type == videoAdsInfoDto.type && epx.f(this.isApp, videoAdsInfoDto.isApp) && epx.f(this.advertiserInfoUrl, videoAdsInfoDto.advertiserInfoUrl) && epx.f(this.adMarker, videoAdsInfoDto.adMarker) && epx.f(this.skad, videoAdsInfoDto.skad) && this.pattern == videoAdsInfoDto.pattern && epx.f(this.photoIcon, videoAdsInfoDto.photoIcon) && epx.f(this.targetOwnerId, videoAdsInfoDto.targetOwnerId) && epx.f(this.adChoices, videoAdsInfoDto.adChoices) && epx.f(this.hasCtaButton, videoAdsInfoDto.hasCtaButton);
    }

    public final String f() {
        return this.advertiserInfoUrl;
    }

    public final String g() {
        return this.ageRestrictions;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ownerTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disclaimer;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ageRestrictions;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode5 = (hashCode4 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        Boolean bool = this.isApp;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.advertiserInfoUrl;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.adMarker;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AdsSkadDto adsSkadDto = this.skad;
        int hashCode9 = (hashCode8 + (adsSkadDto == null ? 0 : adsSkadDto.hashCode())) * 31;
        PatternDto patternDto = this.pattern;
        int hashCode10 = (hashCode9 + (patternDto == null ? 0 : patternDto.hashCode())) * 31;
        List<BaseImageDto> list = this.photoIcon;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        UserId userId = this.targetOwnerId;
        int hashCode12 = (hashCode11 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        AdsChoicesDto adsChoicesDto = this.adChoices;
        int hashCode13 = (hashCode12 + (adsChoicesDto == null ? 0 : adsChoicesDto.hashCode())) * 31;
        Boolean bool2 = this.hasCtaButton;
        return hashCode13 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String i() {
        return this.disclaimer;
    }

    public final Boolean j() {
        return this.hasCtaButton;
    }

    public final String k() {
        return this.ownerTitle;
    }

    public final PatternDto l() {
        return this.pattern;
    }

    public final List<BaseImageDto> n() {
        return this.photoIcon;
    }

    public final UserId o() {
        return this.targetOwnerId;
    }

    public final TypeDto p() {
        return this.type;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAdsInfoDto(title=");
        sb.append(this.title);
        sb.append(", ownerTitle=");
        sb.append(this.ownerTitle);
        sb.append(", disclaimer=");
        sb.append(this.disclaimer);
        sb.append(", ageRestrictions=");
        sb.append(this.ageRestrictions);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", isApp=");
        sb.append(this.isApp);
        sb.append(", advertiserInfoUrl=");
        sb.append(this.advertiserInfoUrl);
        sb.append(", adMarker=");
        sb.append(this.adMarker);
        sb.append(", skad=");
        sb.append(this.skad);
        sb.append(", pattern=");
        sb.append(this.pattern);
        sb.append(", photoIcon=");
        sb.append(this.photoIcon);
        sb.append(", targetOwnerId=");
        sb.append(this.targetOwnerId);
        sb.append(", adChoices=");
        sb.append(this.adChoices);
        sb.append(", hasCtaButton=");
        return tn.a(sb, this.hasCtaButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.ownerTitle);
        parcel.writeString(this.disclaimer);
        parcel.writeString(this.ageRestrictions);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isApp;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.advertiserInfoUrl);
        parcel.writeString(this.adMarker);
        AdsSkadDto adsSkadDto = this.skad;
        if (adsSkadDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsSkadDto.writeToParcel(parcel, i);
        }
        PatternDto patternDto = this.pattern;
        if (patternDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            patternDto.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list = this.photoIcon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.targetOwnerId, i);
        AdsChoicesDto adsChoicesDto = this.adChoices;
        if (adsChoicesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsChoicesDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.hasCtaButton;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public VideoAdsInfoDto(String str, String str2, String str3, String str4, TypeDto typeDto, Boolean bool, String str5, String str6, AdsSkadDto adsSkadDto, PatternDto patternDto, List<BaseImageDto> list, UserId userId, AdsChoicesDto adsChoicesDto, Boolean bool2) {
        this.title = str;
        this.ownerTitle = str2;
        this.disclaimer = str3;
        this.ageRestrictions = str4;
        this.type = typeDto;
        this.isApp = bool;
        this.advertiserInfoUrl = str5;
        this.adMarker = str6;
        this.skad = adsSkadDto;
        this.pattern = patternDto;
        this.photoIcon = list;
        this.targetOwnerId = userId;
        this.adChoices = adsChoicesDto;
        this.hasCtaButton = bool2;
    }

    public /* synthetic */ VideoAdsInfoDto(String str, String str2, String str3, String str4, TypeDto typeDto, Boolean bool, String str5, String str6, AdsSkadDto adsSkadDto, PatternDto patternDto, List list, UserId userId, AdsChoicesDto adsChoicesDto, Boolean bool2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : typeDto, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : adsSkadDto, (i & 512) != 0 ? null : patternDto, (i & 1024) != 0 ? null : list, (i & 2048) != 0 ? null : userId, (i & 4096) != 0 ? null : adsChoicesDto, (i & 8192) != 0 ? null : bool2);
    }
}
