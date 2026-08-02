package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.D1;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.leadForms.dto.LeadFormsLeadFormDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.wall.dto.WallWallpostFullDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AdsItemBlockAdItemDto.kt */
/* loaded from: classes14.dex */
public final class AdsItemBlockAdItemDto implements Parcelable {
    public static final Parcelable.Creator<AdsItemBlockAdItemDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("ad_data")
    private final String adData;

    @pmi0("ad_data_impression")
    private final String adDataImpression;

    @pmi0("age_restriction")
    private final String ageRestriction;

    @pmi0("android_app")
    private final AdsItemBlockAdAppDto androidApp;

    @pmi0("away_params")
    private final Object awayParams;

    @pmi0("button")
    private final String button;

    @pmi0("button_open")
    private final String buttonOpen;

    @pmi0("cards")
    private final List<AdsItemBlockAdCardDto> cards;

    @pmi0("click_area")
    private final Integer clickArea;

    @pmi0("compact_attachments_before_cut")
    private final Float compactAttachmentsBeforeCut;

    @pmi0("description")
    private final String description;

    @pmi0("disclaimer")
    private final String disclaimer;

    @pmi0("disclaimer_img")
    private final AdsItemBlockDisclaimerImgDto disclaimerImg;

    @pmi0("disclaimer_type")
    private final DisclaimerTypeDto disclaimerType;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("feedback")
    private final NewsfeedItemWallpostFeedbackDto feedback;

    @pmi0("followers")
    private final String followers;

    @pmi0("format")
    private final FormatDto format;

    @pmi0("genre")
    private final String genre;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("header_catch_up_link")
    private final AdsCatchUpLinkDto headerCatchUpLink;

    @pmi0("html5_app")
    private final AdsHtml5GameDto html5App;

    @pmi0("ios_app")
    private final AdsItemBlockAdAppIosDto iosApp;

    @pmi0("is_description_clickable")
    private final Boolean isDescriptionClickable;

    @pmi0("lead_form")
    private final LeadFormsLeadFormDto leadForm;

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

    @pmi0("photo_icon")
    private final List<AdsItemBlockAdPhotoBaseDto> photoIcon;

    @pmi0("photo_main")
    private final List<AdsItemBlockAdPhotoMainDto> photoMain;

    @pmi0("post")
    private final WallWallpostFullDto post;

    @pmi0("post_ads_info")
    private final AdsItemBlockAdPostAdsInfoDto postAdsInfo;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("sdk_source")
    private final String sdkSource;

    @pmi0("short_attach_count")
    private final Float shortAttachCount;

    @pmi0("short_text_rate")
    private final Float shortTextRate;

    @pmi0("site_description")
    private final String siteDescription;

    @pmi0("skad")
    private final AdsSkadDto skad;

    @pmi0("statistics")
    private final List<AdsItemBlockAdStatPixelDto> statistics;

    @pmi0("time_to_live")
    private final Integer timeToLive;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("video")
    private final VideoVideoFullDto video;

    @pmi0("wphone_app")
    private final AdsItemBlockAdAppDto wphoneApp;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemBlockAdItemDto.kt */
    public static final class DisclaimerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DisclaimerTypeDto[] $VALUES;
        public static final Parcelable.Creator<DisclaimerTypeDto> CREATOR;

        @pmi0(X3.i.k)
        public static final DisclaimerTypeDto CREDITS;

        @pmi0("finance")
        public static final DisclaimerTypeDto FINANCE;

        @pmi0("medical")
        public static final DisclaimerTypeDto MEDICAL;

        @pmi0("specialist")
        public static final DisclaimerTypeDto SPECIALIST;

        @pmi0("supplements")
        public static final DisclaimerTypeDto SUPPLEMENTS;
        private final String value;

        /* compiled from: AdsItemBlockAdItemDto.kt */
        public static final class a implements Parcelable.Creator<DisclaimerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final DisclaimerTypeDto createFromParcel(Parcel parcel) {
                return DisclaimerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DisclaimerTypeDto[] newArray(int i) {
                return new DisclaimerTypeDto[i];
            }
        }

        static {
            DisclaimerTypeDto disclaimerTypeDto = new DisclaimerTypeDto("MEDICAL", 0, "medical");
            MEDICAL = disclaimerTypeDto;
            DisclaimerTypeDto disclaimerTypeDto2 = new DisclaimerTypeDto("SUPPLEMENTS", 1, "supplements");
            SUPPLEMENTS = disclaimerTypeDto2;
            DisclaimerTypeDto disclaimerTypeDto3 = new DisclaimerTypeDto("SPECIALIST", 2, "specialist");
            SPECIALIST = disclaimerTypeDto3;
            DisclaimerTypeDto disclaimerTypeDto4 = new DisclaimerTypeDto("CREDITS", 3, X3.i.k);
            CREDITS = disclaimerTypeDto4;
            DisclaimerTypeDto disclaimerTypeDto5 = new DisclaimerTypeDto("FINANCE", 4, "finance");
            FINANCE = disclaimerTypeDto5;
            DisclaimerTypeDto[] disclaimerTypeDtoArr = {disclaimerTypeDto, disclaimerTypeDto2, disclaimerTypeDto3, disclaimerTypeDto4, disclaimerTypeDto5};
            $VALUES = disclaimerTypeDtoArr;
            $ENTRIES = new asp(disclaimerTypeDtoArr);
            CREATOR = new a();
        }

        private DisclaimerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static DisclaimerTypeDto valueOf(String str) {
            return (DisclaimerTypeDto) Enum.valueOf(DisclaimerTypeDto.class, str);
        }

        public static DisclaimerTypeDto[] values() {
            return (DisclaimerTypeDto[]) $VALUES.clone();
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
    /* compiled from: AdsItemBlockAdItemDto.kt */
    public static final class FormatDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FormatDto[] $VALUES;

        @pmi0("bls")
        public static final FormatDto BLS;

        @pmi0("carousel")
        public static final FormatDto CAROUSEL;

        @pmi0("clip")
        public static final FormatDto CLIP;

        @pmi0("collage")
        public static final FormatDto COLLAGE;
        public static final Parcelable.Creator<FormatDto> CREATOR;

        @pmi0("post")
        public static final FormatDto POST;

        @pmi0("post_vk")
        public static final FormatDto POST_VK;

        @pmi0("static")
        public static final FormatDto STATIC;

        @pmi0("video")
        public static final FormatDto VIDEO;

        @pmi0("vk_clip")
        public static final FormatDto VK_CLIP;
        private final String value;

        /* compiled from: AdsItemBlockAdItemDto.kt */
        public static final class a implements Parcelable.Creator<FormatDto> {
            @Override // android.os.Parcelable.Creator
            public final FormatDto createFromParcel(Parcel parcel) {
                return FormatDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FormatDto[] newArray(int i) {
                return new FormatDto[i];
            }
        }

        static {
            FormatDto formatDto = new FormatDto("STATIC", 0, "static");
            STATIC = formatDto;
            FormatDto formatDto2 = new FormatDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
            VIDEO = formatDto2;
            FormatDto formatDto3 = new FormatDto("CAROUSEL", 2, "carousel");
            CAROUSEL = formatDto3;
            FormatDto formatDto4 = new FormatDto("POST", 3, "post");
            POST = formatDto4;
            FormatDto formatDto5 = new FormatDto("POST_VK", 4, "post_vk");
            POST_VK = formatDto5;
            FormatDto formatDto6 = new FormatDto("CLIP", 5, "clip");
            CLIP = formatDto6;
            FormatDto formatDto7 = new FormatDto("VK_CLIP", 6, "vk_clip");
            VK_CLIP = formatDto7;
            FormatDto formatDto8 = new FormatDto("COLLAGE", 7, "collage");
            COLLAGE = formatDto8;
            FormatDto formatDto9 = new FormatDto("BLS", 8, "bls");
            BLS = formatDto9;
            FormatDto[] formatDtoArr = {formatDto, formatDto2, formatDto3, formatDto4, formatDto5, formatDto6, formatDto7, formatDto8, formatDto9};
            $VALUES = formatDtoArr;
            $ENTRIES = new asp(formatDtoArr);
            CREATOR = new a();
        }

        private FormatDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static FormatDto valueOf(String str) {
            return (FormatDto) Enum.valueOf(FormatDto.class, str);
        }

        public static FormatDto[] values() {
            return (FormatDto[]) $VALUES.clone();
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
    /* compiled from: AdsItemBlockAdItemDto.kt */
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

        /* compiled from: AdsItemBlockAdItemDto.kt */
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
    /* compiled from: AdsItemBlockAdItemDto.kt */
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

        /* compiled from: AdsItemBlockAdItemDto.kt */
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
    /* compiled from: AdsItemBlockAdItemDto.kt */
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

        /* compiled from: AdsItemBlockAdItemDto.kt */
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
    /* compiled from: AdsItemBlockAdItemDto.kt */
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

        /* compiled from: AdsItemBlockAdItemDto.kt */
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
    /* compiled from: AdsItemBlockAdItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final TypeDto APP;

        @pmi0("app_slider")
        public static final TypeDto APP_SLIDER;

        @pmi0("app_video")
        public static final TypeDto APP_VIDEO;

        @pmi0("clip")
        public static final TypeDto CLIP;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("fake")
        public static final TypeDto FAKE;

        @pmi0("html5_ad")
        public static final TypeDto HTML5_AD;

        @pmi0("mob_sdk")
        public static final TypeDto MOB_SDK;

        @pmi0("post")
        public static final TypeDto POST;

        @pmi0("site")
        public static final TypeDto SITE;

        @pmi0("site_slider")
        public static final TypeDto SITE_SLIDER;

        @pmi0("site_video")
        public static final TypeDto SITE_VIDEO;

        @pmi0("web_sdk")
        public static final TypeDto WEB_SDK;
        private final String value;

        /* compiled from: AdsItemBlockAdItemDto.kt */
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
            TypeDto typeDto = new TypeDto("CLIP", 0, "clip");
            CLIP = typeDto;
            TypeDto typeDto2 = new TypeDto("POST", 1, "post");
            POST = typeDto2;
            TypeDto typeDto3 = new TypeDto("APP", 2, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            APP = typeDto3;
            TypeDto typeDto4 = new TypeDto("SITE", 3, "site");
            SITE = typeDto4;
            TypeDto typeDto5 = new TypeDto("SITE_SLIDER", 4, "site_slider");
            SITE_SLIDER = typeDto5;
            TypeDto typeDto6 = new TypeDto("SITE_VIDEO", 5, "site_video");
            SITE_VIDEO = typeDto6;
            TypeDto typeDto7 = new TypeDto("APP_SLIDER", 6, "app_slider");
            APP_SLIDER = typeDto7;
            TypeDto typeDto8 = new TypeDto("APP_VIDEO", 7, "app_video");
            APP_VIDEO = typeDto8;
            TypeDto typeDto9 = new TypeDto("HTML5_AD", 8, "html5_ad");
            HTML5_AD = typeDto9;
            TypeDto typeDto10 = new TypeDto("MOB_SDK", 9, "mob_sdk");
            MOB_SDK = typeDto10;
            TypeDto typeDto11 = new TypeDto("WEB_SDK", 10, "web_sdk");
            WEB_SDK = typeDto11;
            TypeDto typeDto12 = new TypeDto("FAKE", 11, "fake");
            FAKE = typeDto12;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12};
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

    /* compiled from: AdsItemBlockAdItemDto.kt */
    public static final class a implements Parcelable.Creator<AdsItemBlockAdItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdItemDto createFromParcel(Parcel parcel) {
            TypeDto typeDto;
            ArrayList arrayList;
            ArrayList arrayList2;
            Integer num;
            VideoVideoFullDto videoVideoFullDto;
            WallWallpostFullDto createFromParcel;
            Boolean valueOf;
            AdsCatchUpLinkDto adsCatchUpLinkDto;
            AdsHtml5GameDto adsHtml5GameDto;
            ArrayList arrayList3;
            BaseLinkButtonActionDto baseLinkButtonActionDto;
            Object obj;
            LeadFormsLeadFormDto createFromParcel2;
            LeadFormsLeadFormDto leadFormsLeadFormDto;
            AdsItemBlockAdPostAdsInfoDto createFromParcel3;
            AdsItemBlockAdPostAdsInfoDto adsItemBlockAdPostAdsInfoDto;
            TypeDto typeDto2;
            Float f;
            ArrayList arrayList4;
            Class cls;
            LinkTypeDto createFromParcel4;
            LinkTypeDto linkTypeDto;
            LinkCtaTargetDto createFromParcel5;
            TypeDto createFromParcel6 = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            FormatDto createFromParcel7 = parcel.readInt() == 0 ? null : FormatDto.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            DisclaimerTypeDto createFromParcel8 = parcel.readInt() == 0 ? null : DisclaimerTypeDto.CREATOR.createFromParcel(parcel);
            AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto = (AdsItemBlockDisclaimerImgDto) parcel.readParcelable(AdsItemBlockAdItemDto.class.getClassLoader());
            String readString6 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                typeDto = createFromParcel6;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt);
                typeDto = createFromParcel6;
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AdsItemBlockAdItemDto.class, parcel, arrayList5, i, 1);
                }
                arrayList = arrayList5;
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                num = valueOf3;
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                num = valueOf3;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(AdsItemBlockAdPhotoBaseDto.CREATOR, parcel, arrayList2, i2, 1);
                    readInt2 = readInt2;
                    readString = readString;
                }
            }
            String str = readString;
            VideoVideoFullDto videoVideoFullDto2 = (VideoVideoFullDto) parcel.readParcelable(AdsItemBlockAdItemDto.class.getClassLoader());
            AdsHtml5GameDto createFromParcel9 = parcel.readInt() == 0 ? null : AdsHtml5GameDto.CREATOR.createFromParcel(parcel);
            BaseLinkButtonActionDto baseLinkButtonActionDto2 = (BaseLinkButtonActionDto) parcel.readParcelable(AdsItemBlockAdItemDto.class.getClassLoader());
            ArrayList arrayList6 = arrayList2;
            Integer num2 = num;
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                videoVideoFullDto = videoVideoFullDto2;
                createFromParcel = null;
            } else {
                videoVideoFullDto = videoVideoFullDto2;
                createFromParcel = WallWallpostFullDto.CREATOR.createFromParcel(parcel);
            }
            WallWallpostFullDto wallWallpostFullDto = createFromParcel;
            AdsSkadDto adsSkadDto = (AdsSkadDto) parcel.readParcelable(AdsItemBlockAdItemDto.class.getClassLoader());
            Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            AdsCatchUpLinkDto adsCatchUpLinkDto2 = (AdsCatchUpLinkDto) parcel.readParcelable(AdsItemBlockAdItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                adsCatchUpLinkDto = adsCatchUpLinkDto2;
                adsHtml5GameDto = createFromParcel9;
                baseLinkButtonActionDto = baseLinkButtonActionDto2;
                arrayList3 = null;
            } else {
                adsCatchUpLinkDto = adsCatchUpLinkDto2;
                int readInt3 = parcel.readInt();
                adsHtml5GameDto = createFromParcel9;
                arrayList3 = new ArrayList(readInt3);
                baseLinkButtonActionDto = baseLinkButtonActionDto2;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(AdsItemBlockAdItemDto.class, parcel, arrayList3, i3, 1);
                    readInt3 = readInt3;
                }
            }
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(AdsItemBlockAdItemDto.class.getClassLoader());
            Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf6 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Object readValue = parcel.readValue(AdsItemBlockAdItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                obj = readValue;
                createFromParcel2 = null;
            } else {
                obj = readValue;
                createFromParcel2 = LeadFormsLeadFormDto.CREATOR.createFromParcel(parcel);
            }
            LeadFormsLeadFormDto leadFormsLeadFormDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                leadFormsLeadFormDto = leadFormsLeadFormDto2;
                createFromParcel3 = null;
            } else {
                leadFormsLeadFormDto = leadFormsLeadFormDto2;
                createFromParcel3 = AdsItemBlockAdPostAdsInfoDto.CREATOR.createFromParcel(parcel);
            }
            AdsItemBlockAdPostAdsInfoDto adsItemBlockAdPostAdsInfoDto2 = createFromParcel3;
            BaseLinkButtonActionDto baseLinkButtonActionDto3 = baseLinkButtonActionDto;
            Object obj2 = obj;
            String readString8 = parcel.readString();
            Boolean bool = valueOf;
            ArrayList arrayList7 = arrayList3;
            TypeDto typeDto3 = typeDto;
            AdsHtml5GameDto adsHtml5GameDto2 = adsHtml5GameDto;
            Float f2 = valueOf6;
            LeadFormsLeadFormDto leadFormsLeadFormDto3 = leadFormsLeadFormDto;
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                adsItemBlockAdPostAdsInfoDto = adsItemBlockAdPostAdsInfoDto2;
                typeDto2 = typeDto3;
                f = valueOf5;
                arrayList4 = null;
            } else {
                adsItemBlockAdPostAdsInfoDto = adsItemBlockAdPostAdsInfoDto2;
                int readInt4 = parcel.readInt();
                typeDto2 = typeDto3;
                ArrayList arrayList8 = new ArrayList(readInt4);
                f = valueOf5;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(AdsItemBlockAdItemDto.class, parcel, arrayList8, i4, 1);
                    readInt4 = readInt4;
                }
                arrayList4 = arrayList8;
            }
            String readString10 = parcel.readString();
            Float valueOf7 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            TypeDto typeDto4 = typeDto2;
            String readString11 = parcel.readString();
            VideoVideoFullDto videoVideoFullDto3 = videoVideoFullDto;
            Float f3 = valueOf4;
            AdsCatchUpLinkDto adsCatchUpLinkDto3 = adsCatchUpLinkDto;
            Float f4 = f;
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            LinkUrlTargetDto createFromParcel10 = parcel.readInt() != 0 ? LinkUrlTargetDto.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() == 0) {
                cls = AdsItemBlockAdItemDto.class;
                createFromParcel4 = null;
            } else {
                cls = AdsItemBlockAdItemDto.class;
                createFromParcel4 = LinkTypeDto.CREATOR.createFromParcel(parcel);
            }
            LinkTypeDto linkTypeDto2 = createFromParcel4;
            if (parcel.readInt() == 0) {
                linkTypeDto = linkTypeDto2;
                createFromParcel5 = null;
            } else {
                linkTypeDto = linkTypeDto2;
                createFromParcel5 = LinkCtaTargetDto.CREATOR.createFromParcel(parcel);
            }
            return new AdsItemBlockAdItemDto(typeDto4, str, readString2, readString3, createFromParcel7, readString4, readString5, createFromParcel8, adsItemBlockDisclaimerImgDto, readString6, valueOf2, arrayList, num2, arrayList6, videoVideoFullDto3, adsHtml5GameDto2, baseLinkButtonActionDto3, readString7, wallWallpostFullDto, adsSkadDto, f3, bool, adsCatchUpLinkDto3, arrayList7, newsfeedItemWallpostFeedbackDto, f4, f2, obj2, leadFormsLeadFormDto3, adsItemBlockAdPostAdsInfoDto, readString8, readString9, arrayList4, readString10, valueOf7, readString11, readString12, readString13, readString14, readString15, readString16, createFromParcel10, linkTypeDto, createFromParcel5, parcel.readInt() == 0 ? null : LinkCtaTypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(cls.getClassLoader()), (UserId) parcel.readParcelable(cls.getClassLoader()), (AdsItemBlockAdBannerBaseLinksDto) parcel.readParcelable(cls.getClassLoader()), (AdsItemBlockAdAppDto) parcel.readParcelable(cls.getClassLoader()), (AdsItemBlockAdAppIosDto) parcel.readParcelable(cls.getClassLoader()), (AdsItemBlockAdAppDto) parcel.readParcelable(cls.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdItemDto[] newArray(int i) {
            return new AdsItemBlockAdItemDto[i];
        }
    }

    public AdsItemBlockAdItemDto(TypeDto typeDto, String str, String str2, String str3, FormatDto formatDto, String str4, String str5, DisclaimerTypeDto disclaimerTypeDto, AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto, String str6, Integer num, List<AdsItemBlockAdCardDto> list, Integer num2, List<AdsItemBlockAdPhotoBaseDto> list2, VideoVideoFullDto videoVideoFullDto, AdsHtml5GameDto adsHtml5GameDto, BaseLinkButtonActionDto baseLinkButtonActionDto, String str7, WallWallpostFullDto wallWallpostFullDto, AdsSkadDto adsSkadDto, Float f, Boolean bool, AdsCatchUpLinkDto adsCatchUpLinkDto, List<AdsItemBlockAdStatPixelDto> list3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, Float f2, Float f3, Object obj, LeadFormsLeadFormDto leadFormsLeadFormDto, AdsItemBlockAdPostAdsInfoDto adsItemBlockAdPostAdsInfoDto, String str8, String str9, List<AdsItemBlockAdPhotoMainDto> list4, String str10, Float f4, String str11, String str12, String str13, String str14, String str15, String str16, LinkUrlTargetDto linkUrlTargetDto, LinkTypeDto linkTypeDto, LinkCtaTargetDto linkCtaTargetDto, LinkCtaTypeDto linkCtaTypeDto, UserId userId, UserId userId2, AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto, AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto2) {
        this.type = typeDto;
        this.adData = str;
        this.adDataImpression = str2;
        this.sdkSource = str3;
        this.format = formatDto;
        this.ageRestriction = str4;
        this.disclaimer = str5;
        this.disclaimerType = disclaimerTypeDto;
        this.disclaimerImg = adsItemBlockDisclaimerImgDto;
        this.genre = str6;
        this.clickArea = num;
        this.cards = list;
        this.timeToLive = num2;
        this.photoIcon = list2;
        this.video = videoVideoFullDto;
        this.html5App = adsHtml5GameDto;
        this.action = baseLinkButtonActionDto;
        this.trackCode = str7;
        this.post = wallWallpostFullDto;
        this.skad = adsSkadDto;
        this.shortTextRate = f;
        this.isDescriptionClickable = bool;
        this.headerCatchUpLink = adsCatchUpLinkDto;
        this.statistics = list3;
        this.feedback = newsfeedItemWallpostFeedbackDto;
        this.shortAttachCount = f2;
        this.compactAttachmentsBeforeCut = f3;
        this.awayParams = obj;
        this.leadForm = leadFormsLeadFormDto;
        this.postAdsInfo = adsItemBlockAdPostAdsInfoDto;
        this.title = str8;
        this.description = str9;
        this.photoMain = list4;
        this.followers = str10;
        this.rating = f4;
        this.domain = str11;
        this.siteDescription = str12;
        this.button = str13;
        this.buttonOpen = str14;
        this.linkUrl = str15;
        this.linkCta = str16;
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

    public final String B() {
        return this.genre;
    }

    public final UserId C() {
        return this.groupId;
    }

    public final AdsHtml5GameDto D() {
        return this.html5App;
    }

    public final Boolean D0() {
        return this.isDescriptionClickable;
    }

    public final LinkTypeDto F() {
        return this.linkType;
    }

    public final String G() {
        return this.linkUrl;
    }

    public final LinkUrlTargetDto K() {
        return this.linkUrlTarget;
    }

    public final AdsItemBlockAdBannerBaseLinksDto M() {
        return this.links;
    }

    public final List<AdsItemBlockAdPhotoBaseDto> R() {
        return this.photoIcon;
    }

    public final List<AdsItemBlockAdPhotoMainDto> T() {
        return this.photoMain;
    }

    public final Float W() {
        return this.rating;
    }

    public final Float Z() {
        return this.shortTextRate;
    }

    public final String a0() {
        return this.siteDescription;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.adData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdItemDto)) {
            return false;
        }
        AdsItemBlockAdItemDto adsItemBlockAdItemDto = (AdsItemBlockAdItemDto) obj;
        return this.type == adsItemBlockAdItemDto.type && epx.f(this.adData, adsItemBlockAdItemDto.adData) && epx.f(this.adDataImpression, adsItemBlockAdItemDto.adDataImpression) && epx.f(this.sdkSource, adsItemBlockAdItemDto.sdkSource) && this.format == adsItemBlockAdItemDto.format && epx.f(this.ageRestriction, adsItemBlockAdItemDto.ageRestriction) && epx.f(this.disclaimer, adsItemBlockAdItemDto.disclaimer) && this.disclaimerType == adsItemBlockAdItemDto.disclaimerType && epx.f(this.disclaimerImg, adsItemBlockAdItemDto.disclaimerImg) && epx.f(this.genre, adsItemBlockAdItemDto.genre) && epx.f(this.clickArea, adsItemBlockAdItemDto.clickArea) && epx.f(this.cards, adsItemBlockAdItemDto.cards) && epx.f(this.timeToLive, adsItemBlockAdItemDto.timeToLive) && epx.f(this.photoIcon, adsItemBlockAdItemDto.photoIcon) && epx.f(this.video, adsItemBlockAdItemDto.video) && epx.f(this.html5App, adsItemBlockAdItemDto.html5App) && epx.f(this.action, adsItemBlockAdItemDto.action) && epx.f(this.trackCode, adsItemBlockAdItemDto.trackCode) && epx.f(this.post, adsItemBlockAdItemDto.post) && epx.f(this.skad, adsItemBlockAdItemDto.skad) && epx.f(this.shortTextRate, adsItemBlockAdItemDto.shortTextRate) && epx.f(this.isDescriptionClickable, adsItemBlockAdItemDto.isDescriptionClickable) && epx.f(this.headerCatchUpLink, adsItemBlockAdItemDto.headerCatchUpLink) && epx.f(this.statistics, adsItemBlockAdItemDto.statistics) && epx.f(this.feedback, adsItemBlockAdItemDto.feedback) && epx.f(this.shortAttachCount, adsItemBlockAdItemDto.shortAttachCount) && epx.f(this.compactAttachmentsBeforeCut, adsItemBlockAdItemDto.compactAttachmentsBeforeCut) && epx.f(this.awayParams, adsItemBlockAdItemDto.awayParams) && epx.f(this.leadForm, adsItemBlockAdItemDto.leadForm) && epx.f(this.postAdsInfo, adsItemBlockAdItemDto.postAdsInfo) && epx.f(this.title, adsItemBlockAdItemDto.title) && epx.f(this.description, adsItemBlockAdItemDto.description) && epx.f(this.photoMain, adsItemBlockAdItemDto.photoMain) && epx.f(this.followers, adsItemBlockAdItemDto.followers) && epx.f(this.rating, adsItemBlockAdItemDto.rating) && epx.f(this.domain, adsItemBlockAdItemDto.domain) && epx.f(this.siteDescription, adsItemBlockAdItemDto.siteDescription) && epx.f(this.button, adsItemBlockAdItemDto.button) && epx.f(this.buttonOpen, adsItemBlockAdItemDto.buttonOpen) && epx.f(this.linkUrl, adsItemBlockAdItemDto.linkUrl) && epx.f(this.linkCta, adsItemBlockAdItemDto.linkCta) && this.linkUrlTarget == adsItemBlockAdItemDto.linkUrlTarget && this.linkType == adsItemBlockAdItemDto.linkType && this.linkCtaTarget == adsItemBlockAdItemDto.linkCtaTarget && this.linkCtaType == adsItemBlockAdItemDto.linkCtaType && epx.f(this.groupId, adsItemBlockAdItemDto.groupId) && epx.f(this.userId, adsItemBlockAdItemDto.userId) && epx.f(this.links, adsItemBlockAdItemDto.links) && epx.f(this.androidApp, adsItemBlockAdItemDto.androidApp) && epx.f(this.iosApp, adsItemBlockAdItemDto.iosApp) && epx.f(this.wphoneApp, adsItemBlockAdItemDto.wphoneApp);
    }

    public final String f() {
        return this.adDataImpression;
    }

    public final String g() {
        return this.ageRestriction;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.adData), 31, this.adDataImpression);
        String str = this.sdkSource;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        FormatDto formatDto = this.format;
        int hashCode2 = (hashCode + (formatDto == null ? 0 : formatDto.hashCode())) * 31;
        String str2 = this.ageRestriction;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disclaimer;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DisclaimerTypeDto disclaimerTypeDto = this.disclaimerType;
        int hashCode5 = (hashCode4 + (disclaimerTypeDto == null ? 0 : disclaimerTypeDto.hashCode())) * 31;
        AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto = this.disclaimerImg;
        int hashCode6 = (hashCode5 + (adsItemBlockDisclaimerImgDto == null ? 0 : adsItemBlockDisclaimerImgDto.hashCode())) * 31;
        String str4 = this.genre;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.clickArea;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List<AdsItemBlockAdCardDto> list = this.cards;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.timeToLive;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<AdsItemBlockAdPhotoBaseDto> list2 = this.photoIcon;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode12 = (hashCode11 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        AdsHtml5GameDto adsHtml5GameDto = this.html5App;
        int hashCode13 = (hashCode12 + (adsHtml5GameDto == null ? 0 : adsHtml5GameDto.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode14 = (hashCode13 + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode())) * 31;
        String str5 = this.trackCode;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        WallWallpostFullDto wallWallpostFullDto = this.post;
        int hashCode16 = (hashCode15 + (wallWallpostFullDto == null ? 0 : wallWallpostFullDto.hashCode())) * 31;
        AdsSkadDto adsSkadDto = this.skad;
        int hashCode17 = (hashCode16 + (adsSkadDto == null ? 0 : adsSkadDto.hashCode())) * 31;
        Float f = this.shortTextRate;
        int hashCode18 = (hashCode17 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.isDescriptionClickable;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        AdsCatchUpLinkDto adsCatchUpLinkDto = this.headerCatchUpLink;
        int hashCode20 = (hashCode19 + (adsCatchUpLinkDto == null ? 0 : adsCatchUpLinkDto.hashCode())) * 31;
        List<AdsItemBlockAdStatPixelDto> list3 = this.statistics;
        int hashCode21 = (hashCode20 + (list3 == null ? 0 : list3.hashCode())) * 31;
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
        int hashCode22 = (hashCode21 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
        Float f2 = this.shortAttachCount;
        int hashCode23 = (hashCode22 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.compactAttachmentsBeforeCut;
        int hashCode24 = (hashCode23 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Object obj = this.awayParams;
        int hashCode25 = (hashCode24 + (obj == null ? 0 : obj.hashCode())) * 31;
        LeadFormsLeadFormDto leadFormsLeadFormDto = this.leadForm;
        int hashCode26 = (hashCode25 + (leadFormsLeadFormDto == null ? 0 : leadFormsLeadFormDto.hashCode())) * 31;
        AdsItemBlockAdPostAdsInfoDto adsItemBlockAdPostAdsInfoDto = this.postAdsInfo;
        int hashCode27 = (hashCode26 + (adsItemBlockAdPostAdsInfoDto == null ? 0 : adsItemBlockAdPostAdsInfoDto.hashCode())) * 31;
        String str6 = this.title;
        int hashCode28 = (hashCode27 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.description;
        int hashCode29 = (hashCode28 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<AdsItemBlockAdPhotoMainDto> list4 = this.photoMain;
        int hashCode30 = (hashCode29 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str8 = this.followers;
        int hashCode31 = (hashCode30 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Float f4 = this.rating;
        int hashCode32 = (hashCode31 + (f4 == null ? 0 : f4.hashCode())) * 31;
        String str9 = this.domain;
        int hashCode33 = (hashCode32 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.siteDescription;
        int hashCode34 = (hashCode33 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.button;
        int hashCode35 = (hashCode34 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.buttonOpen;
        int hashCode36 = (hashCode35 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.linkUrl;
        int hashCode37 = (hashCode36 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.linkCta;
        int hashCode38 = (hashCode37 + (str14 == null ? 0 : str14.hashCode())) * 31;
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        int hashCode39 = (hashCode38 + (linkUrlTargetDto == null ? 0 : linkUrlTargetDto.hashCode())) * 31;
        LinkTypeDto linkTypeDto = this.linkType;
        int hashCode40 = (hashCode39 + (linkTypeDto == null ? 0 : linkTypeDto.hashCode())) * 31;
        LinkCtaTargetDto linkCtaTargetDto = this.linkCtaTarget;
        int hashCode41 = (hashCode40 + (linkCtaTargetDto == null ? 0 : linkCtaTargetDto.hashCode())) * 31;
        LinkCtaTypeDto linkCtaTypeDto = this.linkCtaType;
        int hashCode42 = (hashCode41 + (linkCtaTypeDto == null ? 0 : linkCtaTypeDto.hashCode())) * 31;
        UserId userId = this.groupId;
        int hashCode43 = (hashCode42 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.userId;
        int hashCode44 = (hashCode43 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto = this.links;
        int hashCode45 = (hashCode44 + (adsItemBlockAdBannerBaseLinksDto == null ? 0 : adsItemBlockAdBannerBaseLinksDto.hashCode())) * 31;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto = this.androidApp;
        int hashCode46 = (hashCode45 + (adsItemBlockAdAppDto == null ? 0 : adsItemBlockAdAppDto.hashCode())) * 31;
        AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto = this.iosApp;
        int hashCode47 = (hashCode46 + (adsItemBlockAdAppIosDto == null ? 0 : adsItemBlockAdAppIosDto.hashCode())) * 31;
        AdsItemBlockAdAppDto adsItemBlockAdAppDto2 = this.wphoneApp;
        return hashCode47 + (adsItemBlockAdAppDto2 != null ? adsItemBlockAdAppDto2.hashCode() : 0);
    }

    public final AdsItemBlockAdAppDto i() {
        return this.androidApp;
    }

    public final String j() {
        return this.button;
    }

    public final String k() {
        return this.buttonOpen;
    }

    public final List<AdsItemBlockAdCardDto> l() {
        return this.cards;
    }

    public final List<AdsItemBlockAdStatPixelDto> l0() {
        return this.statistics;
    }

    public final String n() {
        return this.disclaimer;
    }

    public final String o() {
        return this.domain;
    }

    public final NewsfeedItemWallpostFeedbackDto p() {
        return this.feedback;
    }

    public final String toString() {
        return "AdsItemBlockAdItemDto(type=" + this.type + ", adData=" + this.adData + ", adDataImpression=" + this.adDataImpression + ", sdkSource=" + this.sdkSource + ", format=" + this.format + ", ageRestriction=" + this.ageRestriction + ", disclaimer=" + this.disclaimer + ", disclaimerType=" + this.disclaimerType + ", disclaimerImg=" + this.disclaimerImg + ", genre=" + this.genre + ", clickArea=" + this.clickArea + ", cards=" + this.cards + ", timeToLive=" + this.timeToLive + ", photoIcon=" + this.photoIcon + ", video=" + this.video + ", html5App=" + this.html5App + ", action=" + this.action + ", trackCode=" + this.trackCode + ", post=" + this.post + ", skad=" + this.skad + ", shortTextRate=" + this.shortTextRate + ", isDescriptionClickable=" + this.isDescriptionClickable + ", headerCatchUpLink=" + this.headerCatchUpLink + ", statistics=" + this.statistics + ", feedback=" + this.feedback + ", shortAttachCount=" + this.shortAttachCount + ", compactAttachmentsBeforeCut=" + this.compactAttachmentsBeforeCut + ", awayParams=" + this.awayParams + ", leadForm=" + this.leadForm + ", postAdsInfo=" + this.postAdsInfo + ", title=" + this.title + ", description=" + this.description + ", photoMain=" + this.photoMain + ", followers=" + this.followers + ", rating=" + this.rating + ", domain=" + this.domain + ", siteDescription=" + this.siteDescription + ", button=" + this.button + ", buttonOpen=" + this.buttonOpen + ", linkUrl=" + this.linkUrl + ", linkCta=" + this.linkCta + ", linkUrlTarget=" + this.linkUrlTarget + ", linkType=" + this.linkType + ", linkCtaTarget=" + this.linkCtaTarget + ", linkCtaType=" + this.linkCtaType + ", groupId=" + this.groupId + ", userId=" + this.userId + ", links=" + this.links + ", androidApp=" + this.androidApp + ", iosApp=" + this.iosApp + ", wphoneApp=" + this.wphoneApp + ')';
    }

    public final String u() {
        return this.followers;
    }

    public final Integer v0() {
        return this.timeToLive;
    }

    public final TypeDto w0() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.adData);
        parcel.writeString(this.adDataImpression);
        parcel.writeString(this.sdkSource);
        FormatDto formatDto = this.format;
        if (formatDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formatDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.ageRestriction);
        parcel.writeString(this.disclaimer);
        DisclaimerTypeDto disclaimerTypeDto = this.disclaimerType;
        if (disclaimerTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            disclaimerTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.disclaimerImg, i);
        parcel.writeString(this.genre);
        Integer num = this.clickArea;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<AdsItemBlockAdCardDto> list = this.cards;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num2 = this.timeToLive;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<AdsItemBlockAdPhotoBaseDto> list2 = this.photoIcon;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((AdsItemBlockAdPhotoBaseDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.video, i);
        AdsHtml5GameDto adsHtml5GameDto = this.html5App;
        if (adsHtml5GameDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsHtml5GameDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.action, i);
        parcel.writeString(this.trackCode);
        WallWallpostFullDto wallWallpostFullDto = this.post;
        if (wallWallpostFullDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostFullDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.skad, i);
        Float f3 = this.shortTextRate;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
        }
        Boolean bool = this.isDescriptionClickable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.headerCatchUpLink, i);
        List<AdsItemBlockAdStatPixelDto> list3 = this.statistics;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list3, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        parcel.writeParcelable(this.feedback, i);
        Float f5 = this.shortAttachCount;
        if (f5 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f5);
        }
        Float f6 = this.compactAttachmentsBeforeCut;
        if (f6 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f6);
        }
        parcel.writeValue(this.awayParams);
        LeadFormsLeadFormDto leadFormsLeadFormDto = this.leadForm;
        if (leadFormsLeadFormDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leadFormsLeadFormDto.writeToParcel(parcel, i);
        }
        AdsItemBlockAdPostAdsInfoDto adsItemBlockAdPostAdsInfoDto = this.postAdsInfo;
        if (adsItemBlockAdPostAdsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsItemBlockAdPostAdsInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        List<AdsItemBlockAdPhotoMainDto> list4 = this.photoMain;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list4, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }
        parcel.writeString(this.followers);
        Float f8 = this.rating;
        if (f8 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f8);
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
        parcel.writeParcelable(this.links, i);
        parcel.writeParcelable(this.androidApp, i);
        parcel.writeParcelable(this.iosApp, i);
        parcel.writeParcelable(this.wphoneApp, i);
    }

    public final VideoVideoFullDto y0() {
        return this.video;
    }

    public /* synthetic */ AdsItemBlockAdItemDto(TypeDto typeDto, String str, String str2, String str3, FormatDto formatDto, String str4, String str5, DisclaimerTypeDto disclaimerTypeDto, AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto, String str6, Integer num, List list, Integer num2, List list2, VideoVideoFullDto videoVideoFullDto, AdsHtml5GameDto adsHtml5GameDto, BaseLinkButtonActionDto baseLinkButtonActionDto, String str7, WallWallpostFullDto wallWallpostFullDto, AdsSkadDto adsSkadDto, Float f, Boolean bool, AdsCatchUpLinkDto adsCatchUpLinkDto, List list3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, Float f2, Float f3, Object obj, LeadFormsLeadFormDto leadFormsLeadFormDto, AdsItemBlockAdPostAdsInfoDto adsItemBlockAdPostAdsInfoDto, String str8, String str9, List list4, String str10, Float f4, String str11, String str12, String str13, String str14, String str15, String str16, LinkUrlTargetDto linkUrlTargetDto, LinkTypeDto linkTypeDto, LinkCtaTargetDto linkCtaTargetDto, LinkCtaTypeDto linkCtaTypeDto, UserId userId, UserId userId2, AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto, AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto, AdsItemBlockAdAppDto adsItemBlockAdAppDto2, int i, int i2, zcl zclVar) {
        this(typeDto, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : formatDto, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : disclaimerTypeDto, (i & 256) != 0 ? null : adsItemBlockDisclaimerImgDto, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : list, (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : list2, (i & 16384) != 0 ? null : videoVideoFullDto, (i & 32768) != 0 ? null : adsHtml5GameDto, (i & 65536) != 0 ? null : baseLinkButtonActionDto, (i & 131072) != 0 ? null : str7, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : wallWallpostFullDto, (524288 & i) != 0 ? null : adsSkadDto, (1048576 & i) != 0 ? null : f, (2097152 & i) != 0 ? null : bool, (4194304 & i) != 0 ? null : adsCatchUpLinkDto, (8388608 & i) != 0 ? null : list3, (16777216 & i) != 0 ? null : newsfeedItemWallpostFeedbackDto, (33554432 & i) != 0 ? null : f2, (67108864 & i) != 0 ? null : f3, (134217728 & i) != 0 ? null : obj, (268435456 & i) != 0 ? null : leadFormsLeadFormDto, (536870912 & i) != 0 ? null : adsItemBlockAdPostAdsInfoDto, (1073741824 & i) != 0 ? null : str8, (i & Integer.MIN_VALUE) != 0 ? null : str9, (i2 & 1) != 0 ? null : list4, (i2 & 2) != 0 ? null : str10, (i2 & 4) != 0 ? null : f4, (i2 & 8) != 0 ? null : str11, (i2 & 16) != 0 ? null : str12, (i2 & 32) != 0 ? null : str13, (i2 & 64) != 0 ? null : str14, (i2 & 128) != 0 ? null : str15, (i2 & 256) != 0 ? null : str16, (i2 & 512) != 0 ? null : linkUrlTargetDto, (i2 & 1024) != 0 ? null : linkTypeDto, (i2 & 2048) != 0 ? null : linkCtaTargetDto, (i2 & 4096) != 0 ? null : linkCtaTypeDto, (i2 & 8192) != 0 ? null : userId, (i2 & 16384) != 0 ? null : userId2, (i2 & 32768) != 0 ? null : adsItemBlockAdBannerBaseLinksDto, (i2 & 65536) != 0 ? null : adsItemBlockAdAppDto, (i2 & 131072) != 0 ? null : adsItemBlockAdAppIosDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : adsItemBlockAdAppDto2);
    }
}
