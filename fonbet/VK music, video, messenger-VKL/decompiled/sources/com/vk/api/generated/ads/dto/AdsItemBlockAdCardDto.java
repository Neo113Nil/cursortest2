package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.D1;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AdsItemBlockAdCardDto.kt */
/* loaded from: classes14.dex */
public final class AdsItemBlockAdCardDto implements Parcelable {
    public static final Parcelable.Creator<AdsItemBlockAdCardDto> CREATOR = new a();

    @pmi0("android_app")
    private final AdsItemBlockAdAppDto androidApp;

    @pmi0("button")
    private final String button;

    @pmi0("button_open")
    private final String buttonOpen;

    @pmi0("card_id")
    private final String cardId;

    @pmi0("description")
    private final String description;

    @pmi0("discount")
    private final String discount;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("followers")
    private final String followers;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("ios_app")
    private final AdsItemBlockAdAppIosDto iosApp;

    @pmi0("link_cta")
    private final String linkCta;

    @pmi0("link_cta_target")
    private final LinkCtaTargetDto linkCtaTarget;

    @pmi0("link_cta_type")
    private final LinkCtaTypeDto linkCtaType;

    @pmi0(CampaignEx.JSON_KEY_LINK_TYPE)
    private final LinkTypeDto linkType;

    @pmi0("link_url")
    private final String linkUrl;

    @pmi0("link_url_target")
    private final LinkUrlTargetDto linkUrlTarget;

    @pmi0("links")
    private final AdsItemBlockAdBannerBaseLinksDto links;

    @pmi0("old_price")
    private final String oldPrice;

    @pmi0("photo_main")
    private final List<AdsItemBlockAdPhotoMainDto> photoMain;

    @pmi0("price")
    private final String price;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("site_description")
    private final String siteDescription;

    @pmi0("statistics")
    private final List<AdsItemBlockAdStatPixelDto> statistics;

    @pmi0("title")
    private final String title;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("wphone_app")
    private final AdsItemBlockAdAppDto wphoneApp;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemBlockAdCardDto.kt */
    public static final class LinkCtaTargetDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkCtaTargetDto[] $VALUES;
        public static final Parcelable.Creator<LinkCtaTargetDto> CREATOR;

        @pmi0(D1.e)
        public static final LinkCtaTargetDto EXTERNAL;

        @pmi0("internal")
        public static final LinkCtaTargetDto INTERNAL;

        @pmi0("internal_hidden")
        public static final LinkCtaTargetDto INTERNAL_HIDDEN;
        private final String value;

        /* compiled from: AdsItemBlockAdCardDto.kt */
        public static final class a implements Parcelable.Creator<LinkCtaTargetDto> {
            @Override // android.os.Parcelable.Creator
            public final LinkCtaTargetDto createFromParcel(Parcel parcel) {
                return LinkCtaTargetDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LinkCtaTargetDto[] newArray(int i) {
                return new LinkCtaTargetDto[i];
            }
        }

        static {
            LinkCtaTargetDto linkCtaTargetDto = new LinkCtaTargetDto("INTERNAL", 0, "internal");
            INTERNAL = linkCtaTargetDto;
            LinkCtaTargetDto linkCtaTargetDto2 = new LinkCtaTargetDto("EXTERNAL", 1, D1.e);
            EXTERNAL = linkCtaTargetDto2;
            LinkCtaTargetDto linkCtaTargetDto3 = new LinkCtaTargetDto("INTERNAL_HIDDEN", 2, "internal_hidden");
            INTERNAL_HIDDEN = linkCtaTargetDto3;
            LinkCtaTargetDto[] linkCtaTargetDtoArr = {linkCtaTargetDto, linkCtaTargetDto2, linkCtaTargetDto3};
            $VALUES = linkCtaTargetDtoArr;
            $ENTRIES = new asp(linkCtaTargetDtoArr);
            CREATOR = new a();
        }

        private LinkCtaTargetDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LinkCtaTargetDto valueOf(String str) {
            return (LinkCtaTargetDto) Enum.valueOf(LinkCtaTargetDto.class, str);
        }

        public static LinkCtaTargetDto[] values() {
            return (LinkCtaTargetDto[]) $VALUES.clone();
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
    /* compiled from: AdsItemBlockAdCardDto.kt */
    public static final class LinkCtaTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkCtaTypeDto[] $VALUES;
        public static final Parcelable.Creator<LinkCtaTypeDto> CREATOR;

        @pmi0("join_group_and_open_url")
        public static final LinkCtaTypeDto JOIN_GROUP_AND_OPEN_URL;

        @pmi0("open_url")
        public static final LinkCtaTypeDto OPEN_URL;

        @pmi0("send_message")
        public static final LinkCtaTypeDto SEND_MESSAGE;

        @pmi0("user_subscribe_and_open_url")
        public static final LinkCtaTypeDto USER_SUBSCRIBE_AND_OPEN_URL;
        private final String value;

        /* compiled from: AdsItemBlockAdCardDto.kt */
        public static final class a implements Parcelable.Creator<LinkCtaTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final LinkCtaTypeDto createFromParcel(Parcel parcel) {
                return LinkCtaTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LinkCtaTypeDto[] newArray(int i) {
                return new LinkCtaTypeDto[i];
            }
        }

        static {
            LinkCtaTypeDto linkCtaTypeDto = new LinkCtaTypeDto("OPEN_URL", 0, "open_url");
            OPEN_URL = linkCtaTypeDto;
            LinkCtaTypeDto linkCtaTypeDto2 = new LinkCtaTypeDto("JOIN_GROUP_AND_OPEN_URL", 1, "join_group_and_open_url");
            JOIN_GROUP_AND_OPEN_URL = linkCtaTypeDto2;
            LinkCtaTypeDto linkCtaTypeDto3 = new LinkCtaTypeDto("USER_SUBSCRIBE_AND_OPEN_URL", 2, "user_subscribe_and_open_url");
            USER_SUBSCRIBE_AND_OPEN_URL = linkCtaTypeDto3;
            LinkCtaTypeDto linkCtaTypeDto4 = new LinkCtaTypeDto("SEND_MESSAGE", 3, "send_message");
            SEND_MESSAGE = linkCtaTypeDto4;
            LinkCtaTypeDto[] linkCtaTypeDtoArr = {linkCtaTypeDto, linkCtaTypeDto2, linkCtaTypeDto3, linkCtaTypeDto4};
            $VALUES = linkCtaTypeDtoArr;
            $ENTRIES = new asp(linkCtaTypeDtoArr);
            CREATOR = new a();
        }

        private LinkCtaTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LinkCtaTypeDto valueOf(String str) {
            return (LinkCtaTypeDto) Enum.valueOf(LinkCtaTypeDto.class, str);
        }

        public static LinkCtaTypeDto[] values() {
            return (LinkCtaTypeDto[]) $VALUES.clone();
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
    /* compiled from: AdsItemBlockAdCardDto.kt */
    public static final class LinkTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkTypeDto[] $VALUES;
        public static final Parcelable.Creator<LinkTypeDto> CREATOR;

        @pmi0("join_group_and_open_url")
        public static final LinkTypeDto JOIN_GROUP_AND_OPEN_URL;

        @pmi0("open_url")
        public static final LinkTypeDto OPEN_URL;

        @pmi0("send_message")
        public static final LinkTypeDto SEND_MESSAGE;

        @pmi0("user_subscribe_and_open_url")
        public static final LinkTypeDto USER_SUBSCRIBE_AND_OPEN_URL;
        private final String value;

        /* compiled from: AdsItemBlockAdCardDto.kt */
        public static final class a implements Parcelable.Creator<LinkTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final LinkTypeDto createFromParcel(Parcel parcel) {
                return LinkTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LinkTypeDto[] newArray(int i) {
                return new LinkTypeDto[i];
            }
        }

        static {
            LinkTypeDto linkTypeDto = new LinkTypeDto("OPEN_URL", 0, "open_url");
            OPEN_URL = linkTypeDto;
            LinkTypeDto linkTypeDto2 = new LinkTypeDto("JOIN_GROUP_AND_OPEN_URL", 1, "join_group_and_open_url");
            JOIN_GROUP_AND_OPEN_URL = linkTypeDto2;
            LinkTypeDto linkTypeDto3 = new LinkTypeDto("USER_SUBSCRIBE_AND_OPEN_URL", 2, "user_subscribe_and_open_url");
            USER_SUBSCRIBE_AND_OPEN_URL = linkTypeDto3;
            LinkTypeDto linkTypeDto4 = new LinkTypeDto("SEND_MESSAGE", 3, "send_message");
            SEND_MESSAGE = linkTypeDto4;
            LinkTypeDto[] linkTypeDtoArr = {linkTypeDto, linkTypeDto2, linkTypeDto3, linkTypeDto4};
            $VALUES = linkTypeDtoArr;
            $ENTRIES = new asp(linkTypeDtoArr);
            CREATOR = new a();
        }

        private LinkTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LinkTypeDto valueOf(String str) {
            return (LinkTypeDto) Enum.valueOf(LinkTypeDto.class, str);
        }

        public static LinkTypeDto[] values() {
            return (LinkTypeDto[]) $VALUES.clone();
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
    /* compiled from: AdsItemBlockAdCardDto.kt */
    public static final class LinkUrlTargetDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkUrlTargetDto[] $VALUES;
        public static final Parcelable.Creator<LinkUrlTargetDto> CREATOR;

        @pmi0(D1.e)
        public static final LinkUrlTargetDto EXTERNAL;

        @pmi0("internal")
        public static final LinkUrlTargetDto INTERNAL;

        @pmi0("internal_hidden")
        public static final LinkUrlTargetDto INTERNAL_HIDDEN;
        private final String value;

        /* compiled from: AdsItemBlockAdCardDto.kt */
        public static final class a implements Parcelable.Creator<LinkUrlTargetDto> {
            @Override // android.os.Parcelable.Creator
            public final LinkUrlTargetDto createFromParcel(Parcel parcel) {
                return LinkUrlTargetDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LinkUrlTargetDto[] newArray(int i) {
                return new LinkUrlTargetDto[i];
            }
        }

        static {
            LinkUrlTargetDto linkUrlTargetDto = new LinkUrlTargetDto("INTERNAL", 0, "internal");
            INTERNAL = linkUrlTargetDto;
            LinkUrlTargetDto linkUrlTargetDto2 = new LinkUrlTargetDto("EXTERNAL", 1, D1.e);
            EXTERNAL = linkUrlTargetDto2;
            LinkUrlTargetDto linkUrlTargetDto3 = new LinkUrlTargetDto("INTERNAL_HIDDEN", 2, "internal_hidden");
            INTERNAL_HIDDEN = linkUrlTargetDto3;
            LinkUrlTargetDto[] linkUrlTargetDtoArr = {linkUrlTargetDto, linkUrlTargetDto2, linkUrlTargetDto3};
            $VALUES = linkUrlTargetDtoArr;
            $ENTRIES = new asp(linkUrlTargetDtoArr);
            CREATOR = new a();
        }

        private LinkUrlTargetDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LinkUrlTargetDto valueOf(String str) {
            return (LinkUrlTargetDto) Enum.valueOf(LinkUrlTargetDto.class, str);
        }

        public static LinkUrlTargetDto[] values() {
            return (LinkUrlTargetDto[]) $VALUES.clone();
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

    /* compiled from: AdsItemBlockAdCardDto.kt */
    public static final class a implements Parcelable.Creator<AdsItemBlockAdCardDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdCardDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Float f;
            String str;
            Object createFromParcel;
            LinkUrlTargetDto linkUrlTargetDto;
            Object createFromParcel2;
            LinkTypeDto linkTypeDto;
            Object createFromParcel3;
            LinkCtaTargetDto linkCtaTargetDto;
            Object createFromParcel4;
            UserId userId;
            Object createFromParcel5;
            AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto;
            Object createFromParcel6;
            AdsItemBlockAdAppDto adsItemBlockAdAppDto;
            Object createFromParcel7;
            AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto;
            Object createFromParcel8;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AdsItemBlockAdCardDto.class, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            String readString5 = parcel.readString();
            int i2 = 0;
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                f = null;
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i2 != readInt2) {
                    i2 = en.a(AdsItemBlockAdPhotoMainDto.CREATOR, parcel, arrayList2, i2, 1);
                }
                f = null;
            }
            String readString7 = parcel.readString();
            Float valueOf = parcel.readInt() == 0 ? f : Float.valueOf(parcel.readFloat());
            String readString8 = parcel.readString();
            Object obj = f;
            Float f2 = valueOf;
            String readString9 = parcel.readString();
            ArrayList arrayList4 = arrayList2;
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = readString;
                createFromParcel = obj;
            } else {
                str = readString;
                createFromParcel = LinkUrlTargetDto.CREATOR.createFromParcel(parcel);
            }
            LinkUrlTargetDto linkUrlTargetDto2 = (LinkUrlTargetDto) createFromParcel;
            if (parcel.readInt() == 0) {
                linkUrlTargetDto = linkUrlTargetDto2;
                createFromParcel2 = obj;
            } else {
                linkUrlTargetDto = linkUrlTargetDto2;
                createFromParcel2 = LinkTypeDto.CREATOR.createFromParcel(parcel);
            }
            LinkTypeDto linkTypeDto2 = (LinkTypeDto) createFromParcel2;
            if (parcel.readInt() == 0) {
                linkTypeDto = linkTypeDto2;
                createFromParcel3 = obj;
            } else {
                linkTypeDto = linkTypeDto2;
                createFromParcel3 = LinkCtaTargetDto.CREATOR.createFromParcel(parcel);
            }
            LinkCtaTargetDto linkCtaTargetDto2 = (LinkCtaTargetDto) createFromParcel3;
            if (parcel.readInt() == 0) {
                linkCtaTargetDto = linkCtaTargetDto2;
                createFromParcel4 = obj;
            } else {
                linkCtaTargetDto = linkCtaTargetDto2;
                createFromParcel4 = LinkCtaTypeDto.CREATOR.createFromParcel(parcel);
            }
            LinkCtaTypeDto linkCtaTypeDto = (LinkCtaTypeDto) createFromParcel4;
            UserId userId2 = (UserId) parcel.readParcelable(AdsItemBlockAdCardDto.class.getClassLoader());
            UserId userId3 = (UserId) parcel.readParcelable(AdsItemBlockAdCardDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                userId = userId3;
                createFromParcel5 = obj;
            } else {
                userId = userId3;
                createFromParcel5 = AdsItemBlockAdBannerBaseLinksDto.CREATOR.createFromParcel(parcel);
            }
            AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto2 = (AdsItemBlockAdBannerBaseLinksDto) createFromParcel5;
            if (parcel.readInt() == 0) {
                adsItemBlockAdBannerBaseLinksDto = adsItemBlockAdBannerBaseLinksDto2;
                createFromParcel6 = obj;
            } else {
                adsItemBlockAdBannerBaseLinksDto = adsItemBlockAdBannerBaseLinksDto2;
                createFromParcel6 = AdsItemBlockAdAppDto.CREATOR.createFromParcel(parcel);
            }
            AdsItemBlockAdAppDto adsItemBlockAdAppDto2 = (AdsItemBlockAdAppDto) createFromParcel6;
            if (parcel.readInt() == 0) {
                adsItemBlockAdAppDto = adsItemBlockAdAppDto2;
                createFromParcel7 = obj;
            } else {
                adsItemBlockAdAppDto = adsItemBlockAdAppDto2;
                createFromParcel7 = AdsItemBlockAdAppIosDto.CREATOR.createFromParcel(parcel);
            }
            AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto2 = (AdsItemBlockAdAppIosDto) createFromParcel7;
            if (parcel.readInt() == 0) {
                createFromParcel8 = obj;
                adsItemBlockAdAppIosDto = adsItemBlockAdAppIosDto2;
            } else {
                adsItemBlockAdAppIosDto = adsItemBlockAdAppIosDto2;
                createFromParcel8 = AdsItemBlockAdAppDto.CREATOR.createFromParcel(parcel);
            }
            return new AdsItemBlockAdCardDto(str, readString2, readString3, readString4, arrayList, readString5, readString6, arrayList4, readString7, f2, readString8, readString9, readString10, readString11, readString12, readString13, linkUrlTargetDto, linkTypeDto, linkCtaTargetDto, linkCtaTypeDto, userId2, userId, adsItemBlockAdBannerBaseLinksDto, adsItemBlockAdAppDto, adsItemBlockAdAppIosDto, (AdsItemBlockAdAppDto) createFromParcel8);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdCardDto[] newArray(int i) {
            return new AdsItemBlockAdCardDto[i];
        }
    }

    public AdsItemBlockAdCardDto(String str, String str2, String str3, String str4, List<AdsItemBlockAdStatPixelDto> list, String str5, String str6, List<AdsItemBlockAdPhotoMainDto> list2, String str7, Float f, String str8, String str9, String str10, String str11, String str12, String str13, LinkUrlTargetDto linkUrlTargetDto, LinkTypeDto linkTypeDto, LinkCtaTargetDto linkCtaTargetDto, LinkCtaTypeDto linkCtaTypeDto, UserId userId, UserId userId2, AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto, AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto2) {
        this.cardId = str;
        this.price = str2;
        this.oldPrice = str3;
        this.discount = str4;
        this.statistics = list;
        this.title = str5;
        this.description = str6;
        this.photoMain = list2;
        this.followers = str7;
        this.rating = f;
        this.domain = str8;
        this.siteDescription = str9;
        this.button = str10;
        this.buttonOpen = str11;
        this.linkUrl = str12;
        this.linkCta = str13;
        this.linkUrlTarget = linkUrlTargetDto;
        this.linkType = linkTypeDto;
        this.linkCtaTarget = linkCtaTargetDto;
        this.linkCtaType = linkCtaTypeDto;
        this.groupId = userId;
        this.userId = userId2;
        this.links = adsItemBlockAdBannerBaseLinksDto;
        this.androidApp = adsItemBlockAdAppDto;
        this.iosApp = adsItemBlockAdAppIosDto;
        this.wphoneApp = adsItemBlockAdAppDto2;
    }

    public final Float B() {
        return this.rating;
    }

    public final String C() {
        return this.siteDescription;
    }

    public final List<AdsItemBlockAdStatPixelDto> D() {
        return this.statistics;
    }

    public final AdsItemBlockAdAppDto d() {
        return this.androidApp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdCardDto)) {
            return false;
        }
        AdsItemBlockAdCardDto adsItemBlockAdCardDto = (AdsItemBlockAdCardDto) obj;
        return epx.f(this.cardId, adsItemBlockAdCardDto.cardId) && epx.f(this.price, adsItemBlockAdCardDto.price) && epx.f(this.oldPrice, adsItemBlockAdCardDto.oldPrice) && epx.f(this.discount, adsItemBlockAdCardDto.discount) && epx.f(this.statistics, adsItemBlockAdCardDto.statistics) && epx.f(this.title, adsItemBlockAdCardDto.title) && epx.f(this.description, adsItemBlockAdCardDto.description) && epx.f(this.photoMain, adsItemBlockAdCardDto.photoMain) && epx.f(this.followers, adsItemBlockAdCardDto.followers) && epx.f(this.rating, adsItemBlockAdCardDto.rating) && epx.f(this.domain, adsItemBlockAdCardDto.domain) && epx.f(this.siteDescription, adsItemBlockAdCardDto.siteDescription) && epx.f(this.button, adsItemBlockAdCardDto.button) && epx.f(this.buttonOpen, adsItemBlockAdCardDto.buttonOpen) && epx.f(this.linkUrl, adsItemBlockAdCardDto.linkUrl) && epx.f(this.linkCta, adsItemBlockAdCardDto.linkCta) && this.linkUrlTarget == adsItemBlockAdCardDto.linkUrlTarget && this.linkType == adsItemBlockAdCardDto.linkType && this.linkCtaTarget == adsItemBlockAdCardDto.linkCtaTarget && this.linkCtaType == adsItemBlockAdCardDto.linkCtaType && epx.f(this.groupId, adsItemBlockAdCardDto.groupId) && epx.f(this.userId, adsItemBlockAdCardDto.userId) && epx.f(this.links, adsItemBlockAdCardDto.links) && epx.f(this.androidApp, adsItemBlockAdCardDto.androidApp) && epx.f(this.iosApp, adsItemBlockAdCardDto.iosApp) && epx.f(this.wphoneApp, adsItemBlockAdCardDto.wphoneApp);
    }

    public final String f() {
        return this.buttonOpen;
    }

    public final String g() {
        return this.cardId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.cardId.hashCode() * 31;
        String str = this.price;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.oldPrice;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discount;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AdsItemBlockAdStatPixelDto> list = this.statistics;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.title;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<AdsItemBlockAdPhotoMainDto> list2 = this.photoMain;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.followers;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f = this.rating;
        int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        String str7 = this.domain;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.siteDescription;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.button;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.buttonOpen;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.linkUrl;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.linkCta;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        int hashCode17 = (hashCode16 + (linkUrlTargetDto == null ? 0 : linkUrlTargetDto.hashCode())) * 31;
        LinkTypeDto linkTypeDto = this.linkType;
        int hashCode18 = (hashCode17 + (linkTypeDto == null ? 0 : linkTypeDto.hashCode())) * 31;
        LinkCtaTargetDto linkCtaTargetDto = this.linkCtaTarget;
        int hashCode19 = (hashCode18 + (linkCtaTargetDto == null ? 0 : linkCtaTargetDto.hashCode())) * 31;
        LinkCtaTypeDto linkCtaTypeDto = this.linkCtaType;
        int hashCode20 = (hashCode19 + (linkCtaTypeDto == null ? 0 : linkCtaTypeDto.hashCode())) * 31;
        UserId userId = this.groupId;
        int hashCode21 = (hashCode20 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.userId;
        int hashCode22 = (hashCode21 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto = this.links;
        int hashCode23 = (hashCode22 + (adsItemBlockAdBannerBaseLinksDto == null ? 0 : adsItemBlockAdBannerBaseLinksDto.hashCode())) * 31;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto = this.androidApp;
        int hashCode24 = (hashCode23 + (adsItemBlockAdAppDto == null ? 0 : adsItemBlockAdAppDto.hashCode())) * 31;
        AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto = this.iosApp;
        int hashCode25 = (hashCode24 + (adsItemBlockAdAppIosDto == null ? 0 : adsItemBlockAdAppIosDto.hashCode())) * 31;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto2 = this.wphoneApp;
        return hashCode25 + (adsItemBlockAdAppDto2 != null ? adsItemBlockAdAppDto2.hashCode() : 0);
    }

    public final String i() {
        return this.discount;
    }

    public final String j() {
        return this.followers;
    }

    public final String k() {
        return this.linkCta;
    }

    public final String l() {
        return this.linkUrl;
    }

    public final LinkUrlTargetDto n() {
        return this.linkUrlTarget;
    }

    public final String o() {
        return this.oldPrice;
    }

    public final List<AdsItemBlockAdPhotoMainDto> p() {
        return this.photoMain;
    }

    public final String toString() {
        return "AdsItemBlockAdCardDto(cardId=" + this.cardId + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", discount=" + this.discount + ", statistics=" + this.statistics + ", title=" + this.title + ", description=" + this.description + ", photoMain=" + this.photoMain + ", followers=" + this.followers + ", rating=" + this.rating + ", domain=" + this.domain + ", siteDescription=" + this.siteDescription + ", button=" + this.button + ", buttonOpen=" + this.buttonOpen + ", linkUrl=" + this.linkUrl + ", linkCta=" + this.linkCta + ", linkUrlTarget=" + this.linkUrlTarget + ", linkType=" + this.linkType + ", linkCtaTarget=" + this.linkCtaTarget + ", linkCtaType=" + this.linkCtaType + ", groupId=" + this.groupId + ", userId=" + this.userId + ", links=" + this.links + ", androidApp=" + this.androidApp + ", iosApp=" + this.iosApp + ", wphoneApp=" + this.wphoneApp + ')';
    }

    public final String u() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardId);
        parcel.writeString(this.price);
        parcel.writeString(this.oldPrice);
        parcel.writeString(this.discount);
        List<AdsItemBlockAdStatPixelDto> list = this.statistics;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        List<AdsItemBlockAdPhotoMainDto> list2 = this.photoMain;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((AdsItemBlockAdPhotoMainDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.followers);
        Float f3 = this.rating;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
        }
        parcel.writeString(this.domain);
        parcel.writeString(this.siteDescription);
        parcel.writeString(this.button);
        parcel.writeString(this.buttonOpen);
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.linkCta);
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        if (linkUrlTargetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkUrlTargetDto.writeToParcel(parcel, i);
        }
        LinkTypeDto linkTypeDto = this.linkType;
        if (linkTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkTypeDto.writeToParcel(parcel, i);
        }
        LinkCtaTargetDto linkCtaTargetDto = this.linkCtaTarget;
        if (linkCtaTargetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkCtaTargetDto.writeToParcel(parcel, i);
        }
        LinkCtaTypeDto linkCtaTypeDto = this.linkCtaType;
        if (linkCtaTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkCtaTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.groupId, i);
        parcel.writeParcelable(this.userId, i);
        AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto = this.links;
        if (adsItemBlockAdBannerBaseLinksDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsItemBlockAdBannerBaseLinksDto.writeToParcel(parcel, i);
        }
        AdsItemBlockAdAppDto adsItemBlockAdAppDto = this.androidApp;
        if (adsItemBlockAdAppDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsItemBlockAdAppDto.writeToParcel(parcel, i);
        }
        AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto = this.iosApp;
        if (adsItemBlockAdAppIosDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsItemBlockAdAppIosDto.writeToParcel(parcel, i);
        }
        AdsItemBlockAdAppDto adsItemBlockAdAppDto2 = this.wphoneApp;
        if (adsItemBlockAdAppDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsItemBlockAdAppDto2.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AdsItemBlockAdCardDto(String str, String str2, String str3, String str4, List list, String str5, String str6, List list2, String str7, Float f, String str8, String str9, String str10, String str11, String str12, String str13, LinkUrlTargetDto linkUrlTargetDto, LinkTypeDto linkTypeDto, LinkCtaTargetDto linkCtaTargetDto, LinkCtaTypeDto linkCtaTypeDto, UserId userId, UserId userId2, AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto, AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : f, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : str12, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? null : linkUrlTargetDto, (i & 131072) != 0 ? null : linkTypeDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : linkCtaTargetDto, (i & 524288) != 0 ? null : linkCtaTypeDto, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : userId, (i & 2097152) != 0 ? null : userId2, (i & 4194304) != 0 ? null : adsItemBlockAdBannerBaseLinksDto, (i & 8388608) != 0 ? null : adsItemBlockAdAppDto, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : adsItemBlockAdAppIosDto, (i & 33554432) != 0 ? null : adsItemBlockAdAppDto2);
    }
}
