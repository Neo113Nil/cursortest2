package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.ads.dto.AdsAdvertiserInfoDto;
import com.vk.api.generated.ads.dto.AdsChoicesDto;
import com.vk.api.generated.ads.dto.AdsHideReasonsDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdItemDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.badges.dto.BadgesCommentInfoDto;
import com.vk.api.generated.badges.dto.BadgesDonutInfoDto;
import com.vk.api.generated.badges.dto.BadgesObjectInfoDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseBottomExtensionDto;
import com.vk.api.generated.base.dto.BaseCommentsInfoDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.donut.dto.DonutWallDonateBlockFriendsDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedMediascopeResearchDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemCaptionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ho8;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallWallItemDto.kt */
/* loaded from: classes15.dex */
public abstract class WallWallItemDto implements Parcelable {

    /* compiled from: WallWallItemDto.kt */
    public static final class Deserializer implements a9y<WallWallItemDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1863356540:
                        if (f.equals("suggest")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 96432:
                        if (f.equals(b.JSON_KEY_ADS)) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallItemAdsBlockDto.class);
                        }
                        break;
                    case 3059573:
                        if (f.equals("copy")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 3446944:
                        if (f.equals("post")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 95768354:
                        if (f.equals("donut")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, DonutWallDonateBlockDto.class);
                        }
                        break;
                    case 95844769:
                        if (f.equals("draft")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 106642994:
                        if (f.equals("photo")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 108401386:
                        if (f.equals("reply")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 112202875:
                        if (f.equals("video")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 757330065:
                        if (f.equals("post_ads")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                    case 757850262:
                        if (f.equals("postpone")) {
                            return (WallWallItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, WallWallpostFullDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: WallWallItemDto.kt */
    public static final class DonutWallDonateBlockDto extends WallWallItemDto implements Parcelable {
        public static final Parcelable.Creator<DonutWallDonateBlockDto> CREATOR = new a();

        @pmi0("about")
        private final BaseLinkButtonDto about;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("friends")
        private final DonutWallDonateBlockFriendsDto friends;

        @pmi0("icon")
        private final List<BaseImageDto> icon;

        @pmi0("image")
        private final List<BaseImageDto> image;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final WallItemTypeDto type;

        /* compiled from: WallWallItemDto.kt */
        public static final class a implements Parcelable.Creator<DonutWallDonateBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final DonutWallDonateBlockDto createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(DonutWallDonateBlockDto.class, parcel, arrayList, i2, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(DonutWallDonateBlockDto.class, parcel, arrayList2, i, 1);
                }
                return new DonutWallDonateBlockDto(arrayList, arrayList2, parcel.readString(), parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(DonutWallDonateBlockDto.class.getClassLoader()), parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(DonutWallDonateBlockDto.class.getClassLoader()), parcel.readInt() == 0 ? null : DonutWallDonateBlockFriendsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? WallItemTypeDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final DonutWallDonateBlockDto[] newArray(int i) {
                return new DonutWallDonateBlockDto[i];
            }
        }

        public /* synthetic */ DonutWallDonateBlockDto(List list, List list2, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, String str3, BaseLinkButtonDto baseLinkButtonDto2, DonutWallDonateBlockFriendsDto donutWallDonateBlockFriendsDto, WallItemTypeDto wallItemTypeDto, int i, zcl zclVar) {
            this(list, list2, str, str2, baseLinkButtonDto, str3, (i & 64) != 0 ? null : baseLinkButtonDto2, (i & 128) != 0 ? null : donutWallDonateBlockFriendsDto, (i & 256) != 0 ? null : wallItemTypeDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DonutWallDonateBlockDto)) {
                return false;
            }
            DonutWallDonateBlockDto donutWallDonateBlockDto = (DonutWallDonateBlockDto) obj;
            return epx.f(this.image, donutWallDonateBlockDto.image) && epx.f(this.icon, donutWallDonateBlockDto.icon) && epx.f(this.title, donutWallDonateBlockDto.title) && epx.f(this.subtitle, donutWallDonateBlockDto.subtitle) && epx.f(this.button, donutWallDonateBlockDto.button) && epx.f(this.trackCode, donutWallDonateBlockDto.trackCode) && epx.f(this.about, donutWallDonateBlockDto.about) && epx.f(this.friends, donutWallDonateBlockDto.friends) && this.type == donutWallDonateBlockDto.type;
        }

        public final int hashCode() {
            int a2 = urd0.a((this.button.hashCode() + urd0.a(urd0.a(fw3.a(this.image.hashCode() * 31, 31, this.icon), 31, this.title), 31, this.subtitle)) * 31, 31, this.trackCode);
            BaseLinkButtonDto baseLinkButtonDto = this.about;
            int hashCode = (a2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            DonutWallDonateBlockFriendsDto donutWallDonateBlockFriendsDto = this.friends;
            int hashCode2 = (hashCode + (donutWallDonateBlockFriendsDto == null ? 0 : donutWallDonateBlockFriendsDto.hashCode())) * 31;
            WallItemTypeDto wallItemTypeDto = this.type;
            return hashCode2 + (wallItemTypeDto != null ? wallItemTypeDto.hashCode() : 0);
        }

        public final String toString() {
            return "DonutWallDonateBlockDto(image=" + this.image + ", icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", button=" + this.button + ", trackCode=" + this.trackCode + ", about=" + this.about + ", friends=" + this.friends + ", type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.image);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            Iterator a3 = ao.a(parcel, this.icon);
            while (a3.hasNext()) {
                parcel.writeParcelable((Parcelable) a3.next(), i);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.button, i);
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.about, i);
            DonutWallDonateBlockFriendsDto donutWallDonateBlockFriendsDto = this.friends;
            if (donutWallDonateBlockFriendsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                donutWallDonateBlockFriendsDto.writeToParcel(parcel, i);
            }
            WallItemTypeDto wallItemTypeDto = this.type;
            if (wallItemTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallItemTypeDto.writeToParcel(parcel, i);
            }
        }

        public DonutWallDonateBlockDto(List<BaseImageDto> list, List<BaseImageDto> list2, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, String str3, BaseLinkButtonDto baseLinkButtonDto2, DonutWallDonateBlockFriendsDto donutWallDonateBlockFriendsDto, WallItemTypeDto wallItemTypeDto) {
            super(null);
            this.image = list;
            this.icon = list2;
            this.title = str;
            this.subtitle = str2;
            this.button = baseLinkButtonDto;
            this.trackCode = str3;
            this.about = baseLinkButtonDto2;
            this.friends = donutWallDonateBlockFriendsDto;
            this.type = wallItemTypeDto;
        }
    }

    /* compiled from: WallWallItemDto.kt */
    public static final class WallItemAdsBlockDto extends WallWallItemDto implements Parcelable {
        public static final Parcelable.Creator<WallItemAdsBlockDto> CREATOR = new a();

        @pmi0("ad_choices")
        private final AdsChoicesDto adChoices;

        @pmi0("ad_marker")
        private final String adMarker;

        @pmi0("ad_source")
        private final AdSourceDto adSource;

        @pmi0("ad_url")
        private final String adUrl;

        @pmi0(b.JSON_KEY_ADS)
        private final List<AdsItemBlockAdItemDto> ads;

        @pmi0("ads_debug")
        private final String adsDebug;

        @pmi0("ads_id1")
        private final int adsId1;

        @pmi0("ads_id2")
        private final int adsId2;

        @pmi0("ads_statistics")
        private final List<AdsItemBlockAdStatPixelDto> adsStatistics;

        @pmi0("ads_title")
        private final String adsTitle;

        @pmi0("advertiser_info_url")
        private final String advertiserInfoUrl;

        @pmi0("header")
        private final NewsfeedNewsfeedItemHeaderDto header;

        @pmi0("hide_reasons")
        private final AdsHideReasonsDto hideReasons;

        @pmi0("impression_id")
        private final String impressionId;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("recommendation_info")
        private final String recommendationInfo;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("try_yandex")
        private final Boolean tryYandex;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallWallItemDto.kt */
        public static final class AdSourceDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ AdSourceDto[] $VALUES;
            public static final Parcelable.Creator<AdSourceDto> CREATOR;

            @pmi0("vkfeed")
            public static final AdSourceDto VKFEED;

            @pmi0("vkfeed_yandex")
            public static final AdSourceDto VKFEED_YANDEX;

            @pmi0("vkontakte")
            public static final AdSourceDto VKONTAKTE;
            private final String value;

            /* compiled from: WallWallItemDto.kt */
            public static final class a implements Parcelable.Creator<AdSourceDto> {
                @Override // android.os.Parcelable.Creator
                public final AdSourceDto createFromParcel(Parcel parcel) {
                    return AdSourceDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AdSourceDto[] newArray(int i) {
                    return new AdSourceDto[i];
                }
            }

            static {
                AdSourceDto adSourceDto = new AdSourceDto("VKONTAKTE", 0, "vkontakte");
                VKONTAKTE = adSourceDto;
                AdSourceDto adSourceDto2 = new AdSourceDto("VKFEED", 1, "vkfeed");
                VKFEED = adSourceDto2;
                AdSourceDto adSourceDto3 = new AdSourceDto("VKFEED_YANDEX", 2, "vkfeed_yandex");
                VKFEED_YANDEX = adSourceDto3;
                AdSourceDto[] adSourceDtoArr = {adSourceDto, adSourceDto2, adSourceDto3};
                $VALUES = adSourceDtoArr;
                $ENTRIES = new asp(adSourceDtoArr);
                CREATOR = new a();
            }

            private AdSourceDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static AdSourceDto valueOf(String str) {
                return (AdSourceDto) Enum.valueOf(AdSourceDto.class, str);
            }

            public static AdSourceDto[] values() {
                return (AdSourceDto[]) $VALUES.clone();
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
        /* compiled from: WallWallItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0(b.JSON_KEY_ADS)
            public static final TypeDto ADS;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: WallWallItemDto.kt */
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
                TypeDto typeDto = new TypeDto("ADS", 0, b.JSON_KEY_ADS);
                ADS = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: WallWallItemDto.kt */
        public static final class a implements Parcelable.Creator<WallItemAdsBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final WallItemAdsBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean bool;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = en.a(AdsItemBlockAdItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString3 = parcel.readString();
                ArrayList arrayList2 = null;
                Boolean bool2 = valueOf2;
                String readString4 = parcel.readString();
                AdsHideReasonsDto createFromParcel2 = parcel.readInt() == 0 ? null : AdsHideReasonsDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    bool = valueOf;
                } else {
                    int readInt4 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt4);
                    bool = valueOf;
                    int i2 = 0;
                    while (i2 != readInt4) {
                        i2 = bo.b(WallItemAdsBlockDto.class, parcel, arrayList2, i2, 1);
                    }
                }
                return new WallItemAdsBlockDto(createFromParcel, readString, readInt, readInt2, arrayList, readString2, bool, bool2, readString3, readString4, createFromParcel2, arrayList2, parcel.readString(), parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdSourceDto.CREATOR.createFromParcel(parcel), (AdsChoicesDto) parcel.readParcelable(WallItemAdsBlockDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final WallItemAdsBlockDto[] newArray(int i) {
                return new WallItemAdsBlockDto[i];
            }
        }

        public /* synthetic */ WallItemAdsBlockDto(TypeDto typeDto, String str, int i, int i2, List list, String str2, Boolean bool, Boolean bool2, String str3, String str4, AdsHideReasonsDto adsHideReasonsDto, List list2, String str5, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, AdSourceDto adSourceDto, AdsChoicesDto adsChoicesDto, String str6, String str7, String str8, int i3, zcl zclVar) {
            this(typeDto, str, i, i2, list, str2, (i3 & 64) != 0 ? null : bool, (i3 & 128) != 0 ? null : bool2, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? null : str4, (i3 & 1024) != 0 ? null : adsHideReasonsDto, (i3 & 2048) != 0 ? null : list2, (i3 & 4096) != 0 ? null : str5, (i3 & 8192) != 0 ? null : newsfeedNewsfeedItemHeaderDto, (i3 & 16384) != 0 ? null : adSourceDto, (32768 & i3) != 0 ? null : adsChoicesDto, (65536 & i3) != 0 ? null : str6, (131072 & i3) != 0 ? null : str7, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str8);
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
            if (!(obj instanceof WallItemAdsBlockDto)) {
                return false;
            }
            WallItemAdsBlockDto wallItemAdsBlockDto = (WallItemAdsBlockDto) obj;
            return this.type == wallItemAdsBlockDto.type && epx.f(this.adsTitle, wallItemAdsBlockDto.adsTitle) && this.adsId1 == wallItemAdsBlockDto.adsId1 && this.adsId2 == wallItemAdsBlockDto.adsId2 && epx.f(this.ads, wallItemAdsBlockDto.ads) && epx.f(this.advertiserInfoUrl, wallItemAdsBlockDto.advertiserInfoUrl) && epx.f(this.tryYandex, wallItemAdsBlockDto.tryYandex) && epx.f(this.isAsync, wallItemAdsBlockDto.isAsync) && epx.f(this.trackCode, wallItemAdsBlockDto.trackCode) && epx.f(this.impressionId, wallItemAdsBlockDto.impressionId) && epx.f(this.hideReasons, wallItemAdsBlockDto.hideReasons) && epx.f(this.adsStatistics, wallItemAdsBlockDto.adsStatistics) && epx.f(this.adsDebug, wallItemAdsBlockDto.adsDebug) && epx.f(this.header, wallItemAdsBlockDto.header) && this.adSource == wallItemAdsBlockDto.adSource && epx.f(this.adChoices, wallItemAdsBlockDto.adChoices) && epx.f(this.adMarker, wallItemAdsBlockDto.adMarker) && epx.f(this.recommendationInfo, wallItemAdsBlockDto.recommendationInfo) && epx.f(this.adUrl, wallItemAdsBlockDto.adUrl);
        }

        public final AdSourceDto f() {
            return this.adSource;
        }

        public final List<AdsItemBlockAdItemDto> g() {
            return this.ads;
        }

        public final int hashCode() {
            int a2 = urd0.a(fw3.a(shy.a(this.adsId2, shy.a(this.adsId1, urd0.a(this.type.hashCode() * 31, 31, this.adsTitle), 31), 31), 31, this.ads), 31, this.advertiserInfoUrl);
            Boolean bool = this.tryYandex;
            int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isAsync;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.impressionId;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AdsHideReasonsDto adsHideReasonsDto = this.hideReasons;
            int hashCode5 = (hashCode4 + (adsHideReasonsDto == null ? 0 : adsHideReasonsDto.hashCode())) * 31;
            List<AdsItemBlockAdStatPixelDto> list = this.adsStatistics;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.adsDebug;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            int hashCode8 = (hashCode7 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
            AdSourceDto adSourceDto = this.adSource;
            int hashCode9 = (hashCode8 + (adSourceDto == null ? 0 : adSourceDto.hashCode())) * 31;
            AdsChoicesDto adsChoicesDto = this.adChoices;
            int hashCode10 = (hashCode9 + (adsChoicesDto == null ? 0 : adsChoicesDto.hashCode())) * 31;
            String str4 = this.adMarker;
            int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.recommendationInfo;
            int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.adUrl;
            return hashCode12 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String i() {
            return this.adsDebug;
        }

        public final int j() {
            return this.adsId1;
        }

        public final int k() {
            return this.adsId2;
        }

        public final List<AdsItemBlockAdStatPixelDto> l() {
            return this.adsStatistics;
        }

        public final String n() {
            return this.adsTitle;
        }

        public final String o() {
            return this.advertiserInfoUrl;
        }

        public final NewsfeedNewsfeedItemHeaderDto p() {
            return this.header;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WallItemAdsBlockDto(type=");
            sb.append(this.type);
            sb.append(", adsTitle=");
            sb.append(this.adsTitle);
            sb.append(", adsId1=");
            sb.append(this.adsId1);
            sb.append(", adsId2=");
            sb.append(this.adsId2);
            sb.append(", ads=");
            sb.append(this.ads);
            sb.append(", advertiserInfoUrl=");
            sb.append(this.advertiserInfoUrl);
            sb.append(", tryYandex=");
            sb.append(this.tryYandex);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", impressionId=");
            sb.append(this.impressionId);
            sb.append(", hideReasons=");
            sb.append(this.hideReasons);
            sb.append(", adsStatistics=");
            sb.append(this.adsStatistics);
            sb.append(", adsDebug=");
            sb.append(this.adsDebug);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", adSource=");
            sb.append(this.adSource);
            sb.append(", adChoices=");
            sb.append(this.adChoices);
            sb.append(", adMarker=");
            sb.append(this.adMarker);
            sb.append(", recommendationInfo=");
            sb.append(this.recommendationInfo);
            sb.append(", adUrl=");
            return ho8.a(sb, this.adUrl, ')');
        }

        public final AdsHideReasonsDto u() {
            return this.hideReasons;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.adsTitle);
            parcel.writeInt(this.adsId1);
            parcel.writeInt(this.adsId2);
            Iterator a2 = ao.a(parcel, this.ads);
            while (a2.hasNext()) {
                ((AdsItemBlockAdItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.advertiserInfoUrl);
            Boolean bool = this.tryYandex;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.isAsync;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeString(this.impressionId);
            AdsHideReasonsDto adsHideReasonsDto = this.hideReasons;
            if (adsHideReasonsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                adsHideReasonsDto.writeToParcel(parcel, i);
            }
            List<AdsItemBlockAdStatPixelDto> list = this.adsStatistics;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeString(this.adsDebug);
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            if (newsfeedNewsfeedItemHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedNewsfeedItemHeaderDto.writeToParcel(parcel, i);
            }
            AdSourceDto adSourceDto = this.adSource;
            if (adSourceDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                adSourceDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.adChoices, i);
            parcel.writeString(this.adMarker);
            parcel.writeString(this.recommendationInfo);
            parcel.writeString(this.adUrl);
        }

        public WallItemAdsBlockDto(TypeDto typeDto, String str, int i, int i2, List<AdsItemBlockAdItemDto> list, String str2, Boolean bool, Boolean bool2, String str3, String str4, AdsHideReasonsDto adsHideReasonsDto, List<AdsItemBlockAdStatPixelDto> list2, String str5, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, AdSourceDto adSourceDto, AdsChoicesDto adsChoicesDto, String str6, String str7, String str8) {
            super(null);
            this.type = typeDto;
            this.adsTitle = str;
            this.adsId1 = i;
            this.adsId2 = i2;
            this.ads = list;
            this.advertiserInfoUrl = str2;
            this.tryYandex = bool;
            this.isAsync = bool2;
            this.trackCode = str3;
            this.impressionId = str4;
            this.hideReasons = adsHideReasonsDto;
            this.adsStatistics = list2;
            this.adsDebug = str5;
            this.header = newsfeedNewsfeedItemHeaderDto;
            this.adSource = adSourceDto;
            this.adChoices = adsChoicesDto;
            this.adMarker = str6;
            this.recommendationInfo = str7;
            this.adUrl = str8;
        }
    }

    /* compiled from: WallWallItemDto.kt */
    public static final class WallWallpostFullDto extends WallWallItemDto implements Parcelable {
        public static final Parcelable.Creator<WallWallpostFullDto> CREATOR = new a();

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("ad_data")
        private final String adData;

        @pmi0("ad_moderation_checksum")
        private final String adModerationChecksum;

        @pmi0("ads_easy_promote")
        private final WallWallpostAdsEasyPromoteDto adsEasyPromote;

        @pmi0("ads_easy_promote_three_dots")
        private final Boolean adsEasyPromoteThreeDots;

        @pmi0("attachments")
        private final List<WallWallpostAttachmentDto> attachments;

        @pmi0("attachments_meta")
        private final WallWallpostAttachmentsMetaDto attachmentsMeta;

        @pmi0("author_ad")
        private final AdsAdvertiserInfoDto authorAd;

        @pmi0("away_params")
        private final Object awayParams;

        @pmi0("badge_id")
        private final Integer badgeId;

        @pmi0("badge_info")
        private final BadgesCommentInfoDto badgeInfo;

        @pmi0("badges")
        private final BadgesObjectInfoDto badges;

        @pmi0("best_friends_only")
        private final BaseBoolIntDto bestFriendsOnly;

        @pmi0("bottom_extension")
        private final BaseBottomExtensionDto bottomExtension;

        @pmi0("can_archive")
        private final Boolean canArchive;

        @pmi0("can_delete")
        private final BaseBoolIntDto canDelete;

        @pmi0("can_doubt_category")
        private final Boolean canDoubtCategory;

        @pmi0("can_edit")
        private final BaseBoolIntDto canEdit;

        @pmi0("can_pin")
        private final BaseBoolIntDto canPin;

        @pmi0("can_publish")
        private final BaseBoolIntDto canPublish;

        @pmi0("can_set_category")
        private final Boolean canSetCategory;

        @pmi0("can_view_stats")
        private final BaseBoolIntDto canViewStats;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("category_action")
        private final WallWallpostCategoryActionDto categoryAction;

        @pmi0("check_sign")
        private final Boolean checkSign;

        @pmi0("comments")
        private final BaseCommentsInfoDto comments;

        @pmi0("compact_attachments_before_cut")
        private final Integer compactAttachmentsBeforeCut;

        @pmi0("content_layout")
        private final List<WallWallpostContentLayoutItemDto> contentLayout;

        @pmi0("coowners")
        private final WallCoownersDto coowners;

        @pmi0("copy_history")
        private final List<com.vk.api.generated.wall.dto.WallWallpostFullDto> copyHistory;

        @pmi0("copyright")
        private final WallPostCopyrightDto copyright;

        @pmi0("created_by")
        private final UserId createdBy;

        @pmi0("date")
        private final Integer date;

        @pmi0("deleted_details")
        private final String deletedDetails;

        @pmi0("deleted_reason")
        private final String deletedReason;

        @pmi0("donut")
        private final WallWallpostDonutDto donut;

        @pmi0("donut_badge_info")
        private final BadgesDonutInfoDto donutBadgeInfo;

        @pmi0("donut_miniapp_url")
        private final String donutMiniappUrl;

        @pmi0("edited")
        private final Integer edited;

        @pmi0("facebook_export")
        private final Integer facebookExport;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("final_post")
        private final BaseBoolIntDto finalPost;

        @pmi0("friends_only")
        private final BaseBoolIntDto friendsOnly;

        @pmi0("from_id")
        private final UserId fromId;

        @pmi0("geo")
        private final WallGeoDto geo;

        @pmi0("has_market_link")
        private final Boolean hasMarketLink;

        @pmi0("has_translation")
        private final Boolean hasTranslation;

        @pmi0("has_video_autoplay")
        private final Boolean hasVideoAutoplay;

        @pmi0("hash")
        private final String hash;

        @pmi0("header")
        private final NewsfeedNewsfeedItemHeaderDto header;

        @pmi0("hide_likes")
        private final Boolean hideLikes;

        @pmi0("id")
        private final Integer id;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("is_added_to_main_tab")
        private final Boolean isAddedToMainTab;

        @pmi0("is_archived")
        private final Boolean isArchived;

        @pmi0("is_blacklisted")
        private final Boolean isBlacklisted;

        @pmi0("is_deleted")
        private final Boolean isDeleted;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("is_from_private_group")
        private final Boolean isFromPrivateGroup;

        @pmi0("is_pinned")
        private final BaseBoolIntDto isPinned;

        @pmi0("is_promoted_post_stealth")
        private final Boolean isPromotedPostStealth;

        @pmi0("likes")
        private final BaseLikesInfoDto likes;

        @pmi0("marked_as_ads")
        private final BaseBoolIntDto markedAsAds;

        @pmi0("marked_as_author_ad")
        private final Boolean markedAsAuthorAd;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("parents_stack")
        private final List<Integer> parentsStack;

        @pmi0("post_author_data")
        private final WallWallpostAuthorDataDto postAuthorData;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("post_source")
        private final WallPostSourceDto postSource;

        @pmi0("post_type")
        private final WallPostTypeDto postType;

        @pmi0("poster")
        private final WallPosterDto poster;

        @pmi0("postponed_id")
        private final Integer postponedId;

        @pmi0("push_subscription")
        private final WallPushSubscriptionDto pushSubscription;

        @pmi0(CampaignEx.JSON_KEY_STAR)
        private final WallWallpostRatingDto rating;

        @pmi0("reaction_set_id")
        private final String reactionSetId;

        @pmi0("reactions")
        private final LikesItemReactionsDto reactions;

        @pmi0("reply_count")
        private final Integer replyCount;

        @pmi0("reply_owner_id")
        private final UserId replyOwnerId;

        @pmi0("reply_post_id")
        private final Integer replyPostId;

        @pmi0("reply_to")
        private final UserId replyTo;

        @pmi0("reposts")
        private final BaseRepostsInfoDto reposts;

        @pmi0("research")
        private final NewsfeedMediascopeResearchDto research;

        @pmi0("share_url")
        private final String shareUrl;

        @pmi0("sharing")
        private final WallSharingDto sharing;

        @pmi0("short_attach_count")
        private final Integer shortAttachCount;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("signer_id")
        private final UserId signerId;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("text")
        private final String text;

        @pmi0("thumbs_max_height")
        private final Float thumbsMaxHeight;

        @pmi0("to_id")
        private final UserId toId;

        @pmi0("topic_id")
        private final TopicIdDto topicId;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("translation_lang")
        private final String translationLang;

        @pmi0("trending")
        private final Boolean trending;

        @pmi0("twitter_export")
        private final Integer twitterExport;

        @pmi0("type")
        private final WallPostTypeDto type;

        @pmi0("views")
        private final WallViewsDto views;

        @pmi0("zoom_text")
        private final Boolean zoomText;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallWallItemDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("wall_wallpost")
            public static final InnerTypeDto WALL_WALLPOST;
            private final String value;

            /* compiled from: WallWallItemDto.kt */
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
                InnerTypeDto innerTypeDto = new InnerTypeDto("WALL_WALLPOST", 0, "wall_wallpost");
                WALL_WALLPOST = innerTypeDto;
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallWallItemDto.kt */
        public static final class TopicIdDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TopicIdDto[] $VALUES;

            @pmi0("1")
            public static final TopicIdDto ART;
            public static final Parcelable.Creator<TopicIdDto> CREATOR;

            @pmi0("0")
            public static final TopicIdDto EMPTY_TOPIC;

            @pmi0("43")
            public static final TopicIdDto FASHION;

            @pmi0("12")
            public static final TopicIdDto GAMES;

            @pmi0("32")
            public static final TopicIdDto HUMOR;

            @pmi0(Gc.e)
            public static final TopicIdDto IT;

            @pmi0("16")
            public static final TopicIdDto MUSIC;

            @pmi0("19")
            public static final TopicIdDto PHOTO;

            @pmi0("21")
            public static final TopicIdDto SCIENCE_AND_TECH;

            @pmi0("23")
            public static final TopicIdDto SPORT;

            @pmi0("25")
            public static final TopicIdDto TRAVEL;

            @pmi0("26")
            public static final TopicIdDto TV_AND_CINEMA;
            private final int value;

            /* compiled from: WallWallItemDto.kt */
            public static final class a implements Parcelable.Creator<TopicIdDto> {
                @Override // android.os.Parcelable.Creator
                public final TopicIdDto createFromParcel(Parcel parcel) {
                    return TopicIdDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TopicIdDto[] newArray(int i) {
                    return new TopicIdDto[i];
                }
            }

            static {
                TopicIdDto topicIdDto = new TopicIdDto("EMPTY_TOPIC", 0, 0);
                EMPTY_TOPIC = topicIdDto;
                TopicIdDto topicIdDto2 = new TopicIdDto("ART", 1, 1);
                ART = topicIdDto2;
                TopicIdDto topicIdDto3 = new TopicIdDto("IT", 2, 7);
                IT = topicIdDto3;
                TopicIdDto topicIdDto4 = new TopicIdDto("GAMES", 3, 12);
                GAMES = topicIdDto4;
                TopicIdDto topicIdDto5 = new TopicIdDto("MUSIC", 4, 16);
                MUSIC = topicIdDto5;
                TopicIdDto topicIdDto6 = new TopicIdDto("PHOTO", 5, 19);
                PHOTO = topicIdDto6;
                TopicIdDto topicIdDto7 = new TopicIdDto("SCIENCE_AND_TECH", 6, 21);
                SCIENCE_AND_TECH = topicIdDto7;
                TopicIdDto topicIdDto8 = new TopicIdDto("SPORT", 7, 23);
                SPORT = topicIdDto8;
                TopicIdDto topicIdDto9 = new TopicIdDto("TRAVEL", 8, 25);
                TRAVEL = topicIdDto9;
                TopicIdDto topicIdDto10 = new TopicIdDto("TV_AND_CINEMA", 9, 26);
                TV_AND_CINEMA = topicIdDto10;
                TopicIdDto topicIdDto11 = new TopicIdDto("HUMOR", 10, 32);
                HUMOR = topicIdDto11;
                TopicIdDto topicIdDto12 = new TopicIdDto("FASHION", 11, 43);
                FASHION = topicIdDto12;
                TopicIdDto[] topicIdDtoArr = {topicIdDto, topicIdDto2, topicIdDto3, topicIdDto4, topicIdDto5, topicIdDto6, topicIdDto7, topicIdDto8, topicIdDto9, topicIdDto10, topicIdDto11, topicIdDto12};
                $VALUES = topicIdDtoArr;
                $ENTRIES = new asp(topicIdDtoArr);
                CREATOR = new a();
            }

            private TopicIdDto(String str, int i, int i2) {
                this.value = i2;
            }

            public static TopicIdDto valueOf(String str) {
                return (TopicIdDto) Enum.valueOf(TopicIdDto.class, str);
            }

            public static TopicIdDto[] values() {
                return (TopicIdDto[]) $VALUES.clone();
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

        /* compiled from: WallWallItemDto.kt */
        public static final class a implements Parcelable.Creator<WallWallpostFullDto> {
            @Override // android.os.Parcelable.Creator
            public final WallWallpostFullDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                ArrayList arrayList;
                Boolean valueOf2;
                Boolean bool;
                BaseCommentsInfoDto createFromParcel;
                Boolean valueOf3;
                BaseBoolIntDto baseBoolIntDto;
                AdsAdvertiserInfoDto createFromParcel2;
                Boolean valueOf4;
                Boolean valueOf5;
                WallPostActivityDto wallPostActivityDto;
                WallWallpostRatingDto createFromParcel3;
                Boolean valueOf6;
                Boolean valueOf7;
                WallWallpostRatingDto wallWallpostRatingDto;
                WallWallpostCategoryActionDto createFromParcel4;
                WallWallpostCategoryActionDto wallWallpostCategoryActionDto;
                TopicIdDto createFromParcel5;
                Boolean valueOf8;
                UserId userId;
                WallCoownersDto createFromParcel6;
                Boolean valueOf9;
                Boolean valueOf10;
                Boolean valueOf11;
                Boolean valueOf12;
                Object obj;
                WallPostTypeDto createFromParcel7;
                Boolean valueOf13;
                Boolean valueOf14;
                UserId userId2;
                WallPushSubscriptionDto createFromParcel8;
                WallPushSubscriptionDto wallPushSubscriptionDto;
                WallWallpostAuthorDataDto createFromParcel9;
                WallWallpostAuthorDataDto wallWallpostAuthorDataDto;
                NewsfeedMediascopeResearchDto createFromParcel10;
                Boolean valueOf15;
                Boolean valueOf16;
                Boolean valueOf17;
                NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto;
                BaseBoolIntDto baseBoolIntDto2;
                ArrayList arrayList2;
                InnerTypeDto innerTypeDto;
                WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Boolean valueOf18;
                BaseBoolIntDto baseBoolIntDto3;
                WallPostCopyrightDto createFromParcel11;
                WallGeoDto wallGeoDto;
                NewsfeedNewsfeedItemHeaderDto createFromParcel12;
                Boolean valueOf19;
                Boolean valueOf20;
                LikesItemReactionsDto likesItemReactionsDto;
                BadgesObjectInfoDto createFromParcel13;
                UserId userId3;
                WallPosterDto createFromParcel14;
                WallPosterDto wallPosterDto;
                Integer num;
                ArrayList arrayList5;
                BadgesCommentInfoDto badgesCommentInfoDto;
                UserId userId4;
                WallViewsDto createFromParcel15;
                InnerTypeDto createFromParcel16 = InnerTypeDto.CREATOR.createFromParcel(parcel);
                WallWallpostAdsEasyPromoteDto createFromParcel17 = parcel.readInt() == 0 ? null : WallWallpostAdsEasyPromoteDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(com.vk.api.generated.wall.dto.WallWallpostFullDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                UserId userId5 = (UserId) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                WallWallpostDonutDto createFromParcel18 = parcel.readInt() == 0 ? null : WallWallpostDonutDto.CREATOR.createFromParcel(parcel);
                BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    bool = valueOf;
                    createFromParcel = null;
                } else {
                    bool = valueOf;
                    createFromParcel = BaseCommentsInfoDto.CREATOR.createFromParcel(parcel);
                }
                BaseCommentsInfoDto baseCommentsInfoDto = createFromParcel;
                BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    baseBoolIntDto = baseBoolIntDto12;
                    createFromParcel2 = null;
                } else {
                    baseBoolIntDto = baseBoolIntDto12;
                    createFromParcel2 = AdsAdvertiserInfoDto.CREATOR.createFromParcel(parcel);
                }
                AdsAdvertiserInfoDto adsAdvertiserInfoDto = createFromParcel2;
                WallPostActivityDto wallPostActivityDto2 = (WallPostActivityDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    wallPostActivityDto = wallPostActivityDto2;
                    createFromParcel3 = null;
                } else {
                    wallPostActivityDto = wallPostActivityDto2;
                    createFromParcel3 = WallWallpostRatingDto.CREATOR.createFromParcel(parcel);
                }
                WallWallpostRatingDto wallWallpostRatingDto2 = createFromParcel3;
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    wallWallpostRatingDto = wallWallpostRatingDto2;
                    createFromParcel4 = null;
                } else {
                    wallWallpostRatingDto = wallWallpostRatingDto2;
                    createFromParcel4 = WallWallpostCategoryActionDto.CREATOR.createFromParcel(parcel);
                }
                WallWallpostCategoryActionDto wallWallpostCategoryActionDto2 = createFromParcel4;
                if (parcel.readInt() == 0) {
                    wallWallpostCategoryActionDto = wallWallpostCategoryActionDto2;
                    createFromParcel5 = null;
                } else {
                    wallWallpostCategoryActionDto = wallWallpostCategoryActionDto2;
                    createFromParcel5 = TopicIdDto.CREATOR.createFromParcel(parcel);
                }
                TopicIdDto topicIdDto = createFromParcel5;
                if (parcel.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBottomExtensionDto baseBottomExtensionDto = (BaseBottomExtensionDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                Float valueOf21 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Integer valueOf22 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                UserId userId6 = (UserId) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                Integer valueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    userId = userId6;
                    createFromParcel6 = null;
                } else {
                    userId = userId6;
                    createFromParcel6 = WallCoownersDto.CREATOR.createFromParcel(parcel);
                }
                WallCoownersDto wallCoownersDto = createFromParcel6;
                Float valueOf24 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                BaseBoolIntDto baseBoolIntDto13 = baseBoolIntDto;
                Boolean bool2 = valueOf4;
                WallWallpostRatingDto wallWallpostRatingDto3 = wallWallpostRatingDto;
                Boolean bool3 = valueOf8;
                Float f = valueOf21;
                UserId userId7 = userId;
                String readString = parcel.readString();
                Boolean bool4 = bool;
                Boolean bool5 = valueOf3;
                WallPostActivityDto wallPostActivityDto3 = wallPostActivityDto;
                Boolean bool6 = valueOf7;
                Integer num2 = valueOf22;
                Integer num3 = valueOf23;
                Float f2 = valueOf24;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf25 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Object readValue = parcel.readValue(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    obj = readValue;
                    createFromParcel7 = null;
                } else {
                    obj = readValue;
                    createFromParcel7 = WallPostTypeDto.CREATOR.createFromParcel(parcel);
                }
                WallPostTypeDto wallPostTypeDto = createFromParcel7;
                NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                UserId userId8 = (UserId) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf14 = null;
                } else {
                    valueOf14 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    userId2 = userId8;
                    createFromParcel8 = null;
                } else {
                    userId2 = userId8;
                    createFromParcel8 = WallPushSubscriptionDto.CREATOR.createFromParcel(parcel);
                }
                WallPushSubscriptionDto wallPushSubscriptionDto2 = createFromParcel8;
                if (parcel.readInt() == 0) {
                    wallPushSubscriptionDto = wallPushSubscriptionDto2;
                    createFromParcel9 = null;
                } else {
                    wallPushSubscriptionDto = wallPushSubscriptionDto2;
                    createFromParcel9 = WallWallpostAuthorDataDto.CREATOR.createFromParcel(parcel);
                }
                WallWallpostAuthorDataDto wallWallpostAuthorDataDto2 = createFromParcel9;
                if (parcel.readInt() == 0) {
                    wallWallpostAuthorDataDto = wallWallpostAuthorDataDto2;
                    createFromParcel10 = null;
                } else {
                    wallWallpostAuthorDataDto = wallWallpostAuthorDataDto2;
                    createFromParcel10 = NewsfeedMediascopeResearchDto.CREATOR.createFromParcel(parcel);
                }
                NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto2 = createFromParcel10;
                if (parcel.readInt() == 0) {
                    valueOf15 = null;
                } else {
                    valueOf15 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf16 = null;
                } else {
                    valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Boolean bool7 = valueOf13;
                WallPushSubscriptionDto wallPushSubscriptionDto3 = wallPushSubscriptionDto;
                Boolean bool8 = valueOf15;
                String readString5 = parcel.readString();
                Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf17 = null;
                } else {
                    valueOf17 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString7 = parcel.readString();
                Integer num4 = valueOf25;
                Integer num5 = valueOf27;
                Boolean bool9 = valueOf11;
                Boolean bool10 = valueOf12;
                Boolean bool11 = valueOf14;
                WallWallpostAuthorDataDto wallWallpostAuthorDataDto3 = wallWallpostAuthorDataDto;
                Boolean bool12 = valueOf16;
                Integer num6 = valueOf28;
                Boolean bool13 = valueOf17;
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    newsfeedMediascopeResearchDto = newsfeedMediascopeResearchDto2;
                    baseBoolIntDto2 = baseBoolIntDto9;
                    innerTypeDto = createFromParcel16;
                    arrayList2 = null;
                } else {
                    newsfeedMediascopeResearchDto = newsfeedMediascopeResearchDto2;
                    int readInt2 = parcel.readInt();
                    baseBoolIntDto2 = baseBoolIntDto9;
                    arrayList2 = new ArrayList(readInt2);
                    innerTypeDto = createFromParcel16;
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = bo.b(WallWallpostFullDto.class, parcel, arrayList2, i2, 1);
                        readInt2 = readInt2;
                    }
                }
                WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto2 = (WallWallpostAttachmentsMetaDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    wallWallpostAttachmentsMetaDto = wallWallpostAttachmentsMetaDto2;
                    arrayList4 = arrayList2;
                    arrayList3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    wallWallpostAttachmentsMetaDto = wallWallpostAttachmentsMetaDto2;
                    arrayList3 = new ArrayList(readInt3);
                    arrayList4 = arrayList2;
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = bo.b(WallWallpostFullDto.class, parcel, arrayList3, i3, 1);
                        readInt3 = readInt3;
                    }
                }
                Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BadgesCommentInfoDto badgesCommentInfoDto2 = (BadgesCommentInfoDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                ArrayList arrayList6 = arrayList3;
                BadgesDonutInfoDto badgesDonutInfoDto = (BadgesDonutInfoDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf18 = null;
                } else {
                    valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    baseBoolIntDto3 = baseBoolIntDto14;
                    createFromParcel11 = null;
                } else {
                    baseBoolIntDto3 = baseBoolIntDto14;
                    createFromParcel11 = WallPostCopyrightDto.CREATOR.createFromParcel(parcel);
                }
                WallPostCopyrightDto wallPostCopyrightDto = createFromParcel11;
                Integer valueOf30 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf31 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                UserId userId9 = (UserId) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                WallGeoDto wallGeoDto2 = (WallGeoDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    wallGeoDto = wallGeoDto2;
                    createFromParcel12 = null;
                } else {
                    wallGeoDto = wallGeoDto2;
                    createFromParcel12 = NewsfeedNewsfeedItemHeaderDto.CREATOR.createFromParcel(parcel);
                }
                NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = createFromParcel12;
                Integer valueOf32 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf19 = null;
                } else {
                    valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf20 = null;
                } else {
                    valueOf20 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseLikesInfoDto baseLikesInfoDto = (BaseLikesInfoDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto3 = wallWallpostAttachmentsMetaDto;
                Integer num7 = valueOf30;
                Integer num8 = valueOf32;
                Boolean bool14 = valueOf20;
                String readString10 = parcel.readString();
                LikesItemReactionsDto likesItemReactionsDto2 = (LikesItemReactionsDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    likesItemReactionsDto = likesItemReactionsDto2;
                    createFromParcel13 = null;
                } else {
                    likesItemReactionsDto = likesItemReactionsDto2;
                    createFromParcel13 = BadgesObjectInfoDto.CREATOR.createFromParcel(parcel);
                }
                BadgesObjectInfoDto badgesObjectInfoDto = createFromParcel13;
                UserId userId10 = (UserId) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                UserId userId11 = (UserId) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                Integer valueOf33 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                UserId userId12 = (UserId) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    userId3 = userId12;
                    createFromParcel14 = null;
                } else {
                    userId3 = userId12;
                    createFromParcel14 = WallPosterDto.CREATOR.createFromParcel(parcel);
                }
                WallPosterDto wallPosterDto2 = createFromParcel14;
                Integer valueOf34 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    wallPosterDto = wallPosterDto2;
                    num = valueOf29;
                    badgesCommentInfoDto = badgesCommentInfoDto2;
                    arrayList5 = null;
                } else {
                    wallPosterDto = wallPosterDto2;
                    int readInt4 = parcel.readInt();
                    num = valueOf29;
                    arrayList5 = new ArrayList(readInt4);
                    badgesCommentInfoDto = badgesCommentInfoDto2;
                    int i4 = 0;
                    while (i4 != readInt4) {
                        i4 = pm0.b(parcel, arrayList5, i4, 1);
                        readInt4 = readInt4;
                    }
                }
                WallPostSourceDto createFromParcel19 = parcel.readInt() == 0 ? null : WallPostSourceDto.CREATOR.createFromParcel(parcel);
                WallPostTypeDto createFromParcel20 = parcel.readInt() == 0 ? null : WallPostTypeDto.CREATOR.createFromParcel(parcel);
                BaseRepostsInfoDto baseRepostsInfoDto = (BaseRepostsInfoDto) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                UserId userId13 = (UserId) parcel.readParcelable(WallWallpostFullDto.class.getClassLoader());
                String readString11 = parcel.readString();
                if (parcel.readInt() == 0) {
                    userId4 = userId13;
                    createFromParcel15 = null;
                } else {
                    userId4 = userId13;
                    createFromParcel15 = WallViewsDto.CREATOR.createFromParcel(parcel);
                }
                return new WallWallpostFullDto(innerTypeDto, createFromParcel17, bool4, arrayList, baseBoolIntDto4, userId5, baseBoolIntDto5, baseBoolIntDto6, baseBoolIntDto7, createFromParcel18, baseBoolIntDto8, baseBoolIntDto2, baseBoolIntDto10, valueOf2, baseBoolIntDto11, baseCommentsInfoDto, baseBoolIntDto13, bool5, adsAdvertiserInfoDto, wallPostActivityDto3, bool2, valueOf5, wallWallpostRatingDto3, valueOf6, bool6, wallWallpostCategoryActionDto, topicIdDto, bool3, baseBottomExtensionDto, f, num2, userId7, num3, wallCoownersDto, f2, readString, readString2, readString3, newsfeedNewsfeedItemCaptionDto, readString4, valueOf9, num4, valueOf26, num5, valueOf10, bool9, obj, bool10, wallPostTypeDto, newsfeedItemWallpostFeedbackDto, userId2, bool7, bool11, wallPushSubscriptionDto3, wallWallpostAuthorDataDto3, newsfeedMediascopeResearchDto, bool8, bool12, readString5, num6, readString6, bool13, readString7, readString8, readString9, arrayList4, wallWallpostAttachmentsMetaDto3, arrayList6, num, badgesCommentInfoDto, badgesDonutInfoDto, valueOf18, baseBoolIntDto3, wallPostCopyrightDto, num7, valueOf31, userId9, wallGeoDto, newsfeedNewsfeedItemHeaderDto, num8, valueOf19, bool14, baseLikesInfoDto, readString10, likesItemReactionsDto, badgesObjectInfoDto, userId10, userId11, valueOf33, userId3, wallPosterDto, valueOf34, arrayList5, createFromParcel19, createFromParcel20, baseRepostsInfoDto, userId4, readString11, createFromParcel15, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : WallSharingDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final WallWallpostFullDto[] newArray(int i) {
                return new WallWallpostFullDto[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ WallWallpostFullDto(InnerTypeDto innerTypeDto, WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto, Boolean bool, List list, BaseBoolIntDto baseBoolIntDto, UserId userId, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool2, BaseBoolIntDto baseBoolIntDto8, BaseCommentsInfoDto baseCommentsInfoDto, BaseBoolIntDto baseBoolIntDto9, Boolean bool3, AdsAdvertiserInfoDto adsAdvertiserInfoDto, WallPostActivityDto wallPostActivityDto, Boolean bool4, Boolean bool5, WallWallpostRatingDto wallWallpostRatingDto, Boolean bool6, Boolean bool7, WallWallpostCategoryActionDto wallWallpostCategoryActionDto, TopicIdDto topicIdDto, Boolean bool8, BaseBottomExtensionDto baseBottomExtensionDto, Float f, Integer num, UserId userId2, Integer num2, WallCoownersDto wallCoownersDto, Float f2, String str, String str2, String str3, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, String str4, Boolean bool9, Integer num3, Integer num4, Integer num5, Boolean bool10, Boolean bool11, Object obj, Boolean bool12, WallPostTypeDto wallPostTypeDto, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, UserId userId3, Boolean bool13, Boolean bool14, WallPushSubscriptionDto wallPushSubscriptionDto, WallWallpostAuthorDataDto wallWallpostAuthorDataDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool15, Boolean bool16, String str5, Integer num6, String str6, Boolean bool17, String str7, String str8, String str9, List list2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List list3, Integer num7, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool18, BaseBoolIntDto baseBoolIntDto10, WallPostCopyrightDto wallPostCopyrightDto, Integer num8, Integer num9, UserId userId4, WallGeoDto wallGeoDto, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Integer num10, Boolean bool19, Boolean bool20, BaseLikesInfoDto baseLikesInfoDto, String str10, LikesItemReactionsDto likesItemReactionsDto, BadgesObjectInfoDto badgesObjectInfoDto, UserId userId5, UserId userId6, Integer num11, UserId userId7, WallPosterDto wallPosterDto, Integer num12, List list4, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto2, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId8, String str11, WallViewsDto wallViewsDto, Integer num13, String str12, WallSharingDto wallSharingDto, int i, int i2, int i3, int i4, zcl zclVar) {
            this(innerTypeDto, r86, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r3, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r0, (i2 & 1) != 0 ? null : num2, (i2 & 2) != 0 ? null : wallCoownersDto, (i2 & 4) != 0 ? null : f2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : bool9, (i2 & 512) != 0 ? null : num3, (i2 & 1024) != 0 ? null : num4, (i2 & 2048) != 0 ? null : num5, (i2 & 4096) != 0 ? null : bool10, (i2 & 8192) != 0 ? null : bool11, (i2 & 16384) != 0 ? null : obj, (i2 & 32768) != 0 ? null : bool12, (i2 & 65536) != 0 ? null : wallPostTypeDto, (i2 & 131072) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : userId3, (i2 & 524288) != 0 ? null : bool13, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool14, (i2 & 2097152) != 0 ? null : wallPushSubscriptionDto, (i2 & 4194304) != 0 ? null : wallWallpostAuthorDataDto, (i2 & 8388608) != 0 ? null : newsfeedMediascopeResearchDto, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool15, (i2 & 33554432) != 0 ? null : bool16, (i2 & 67108864) != 0 ? null : str5, (i2 & 134217728) != 0 ? null : num6, (i2 & 268435456) != 0 ? null : str6, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool17, (i2 & 1073741824) != 0 ? null : str7, (i2 & Integer.MIN_VALUE) != 0 ? null : str8, (i3 & 1) != 0 ? null : str9, (i3 & 2) != 0 ? null : list2, (i3 & 4) != 0 ? null : wallWallpostAttachmentsMetaDto, (i3 & 8) != 0 ? null : list3, (i3 & 16) != 0 ? null : num7, (i3 & 32) != 0 ? null : badgesCommentInfoDto, (i3 & 64) != 0 ? null : badgesDonutInfoDto, (i3 & 128) != 0 ? null : bool18, (i3 & 256) != 0 ? null : baseBoolIntDto10, (i3 & 512) != 0 ? null : wallPostCopyrightDto, (i3 & 1024) != 0 ? null : num8, (i3 & 2048) != 0 ? null : num9, (i3 & 4096) != 0 ? null : userId4, (i3 & 8192) != 0 ? null : wallGeoDto, (i3 & 16384) != 0 ? null : newsfeedNewsfeedItemHeaderDto, (i3 & 32768) != 0 ? null : num10, (i3 & 65536) != 0 ? null : bool19, (i3 & 131072) != 0 ? null : bool20, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseLikesInfoDto, (i3 & 524288) != 0 ? null : str10, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : likesItemReactionsDto, (i3 & 2097152) != 0 ? null : badgesObjectInfoDto, (i3 & 4194304) != 0 ? null : userId5, (i3 & 8388608) != 0 ? null : userId6, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num11, (i3 & 33554432) != 0 ? null : userId7, (i3 & 67108864) != 0 ? null : wallPosterDto, (i3 & 134217728) != 0 ? null : num12, (i3 & 268435456) != 0 ? null : list4, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : wallPostSourceDto, (i3 & 1073741824) != 0 ? null : wallPostTypeDto2, (i3 & Integer.MIN_VALUE) != 0 ? null : baseRepostsInfoDto, (i4 & 1) != 0 ? null : userId8, (i4 & 2) != 0 ? null : str11, (i4 & 4) != 0 ? null : wallViewsDto, (i4 & 8) != 0 ? null : num13, (i4 & 16) != 0 ? null : str12, (i4 & 32) != 0 ? null : wallSharingDto);
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto2 = (i & 2) != 0 ? null : wallWallpostAdsEasyPromoteDto;
            Boolean bool21 = (i & 4) != 0 ? null : bool;
            List list5 = (i & 8) != 0 ? null : list;
            BaseBoolIntDto baseBoolIntDto11 = (i & 16) != 0 ? null : baseBoolIntDto;
            UserId userId9 = (i & 32) != 0 ? null : userId;
            BaseBoolIntDto baseBoolIntDto12 = (i & 64) != 0 ? null : baseBoolIntDto2;
            BaseBoolIntDto baseBoolIntDto13 = (i & 128) != 0 ? null : baseBoolIntDto3;
            BaseBoolIntDto baseBoolIntDto14 = (i & 256) != 0 ? null : baseBoolIntDto4;
            WallWallpostDonutDto wallWallpostDonutDto2 = (i & 512) != 0 ? null : wallWallpostDonutDto;
            BaseBoolIntDto baseBoolIntDto15 = (i & 1024) != 0 ? null : baseBoolIntDto5;
            BaseBoolIntDto baseBoolIntDto16 = (i & 2048) != 0 ? null : baseBoolIntDto6;
            BaseBoolIntDto baseBoolIntDto17 = (i & 4096) != 0 ? null : baseBoolIntDto7;
            Boolean bool22 = (i & 8192) != 0 ? null : bool2;
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto3 = wallWallpostAdsEasyPromoteDto2;
            BaseBoolIntDto baseBoolIntDto18 = (i & 16384) != 0 ? null : baseBoolIntDto8;
            BaseCommentsInfoDto baseCommentsInfoDto2 = (i & 32768) != 0 ? null : baseCommentsInfoDto;
            BaseBoolIntDto baseBoolIntDto19 = (i & 65536) != 0 ? null : baseBoolIntDto9;
            Boolean bool23 = (i & 131072) != 0 ? null : bool3;
            AdsAdvertiserInfoDto adsAdvertiserInfoDto2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : adsAdvertiserInfoDto;
            WallPostActivityDto wallPostActivityDto2 = (i & 524288) != 0 ? null : wallPostActivityDto;
            Boolean bool24 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool4;
            Boolean bool25 = (i & 2097152) != 0 ? null : bool5;
            WallWallpostRatingDto wallWallpostRatingDto2 = (i & 4194304) != 0 ? null : wallWallpostRatingDto;
            Boolean bool26 = (i & 8388608) != 0 ? null : bool6;
            Boolean bool27 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool7;
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto2 = (i & 33554432) != 0 ? null : wallWallpostCategoryActionDto;
            TopicIdDto topicIdDto2 = (i & 67108864) != 0 ? null : topicIdDto;
            Boolean bool28 = (i & 134217728) != 0 ? null : bool8;
            BaseBottomExtensionDto baseBottomExtensionDto2 = (i & 268435456) != 0 ? null : baseBottomExtensionDto;
            Float f3 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : f;
            Integer num14 = (i & 1073741824) != 0 ? null : num;
            UserId userId10 = (i & Integer.MIN_VALUE) != 0 ? null : userId2;
        }

        public final BaseBoolIntDto B() {
            return this.canPin;
        }

        public final Integer B1() {
            return this.shortAttachCount;
        }

        public final BaseBoolIntDto C() {
            return this.canViewStats;
        }

        public final NewsfeedNewsfeedItemCaptionDto D() {
            return this.caption;
        }

        public final BaseBoolIntDto D0() {
            return this.friendsOnly;
        }

        public final Float D1() {
            return this.shortTextRate;
        }

        public final UserId E1() {
            return this.signerId;
        }

        public final Integer F() {
            return this.carouselOffset;
        }

        public final UserId F0() {
            return this.fromId;
        }

        public final BaseCommentsInfoDto G() {
            return this.comments;
        }

        public final WallGeoDto H0() {
            return this.geo;
        }

        public final Integer K() {
            return this.compactAttachmentsBeforeCut;
        }

        public final NewsfeedNewsfeedItemHeaderDto K0() {
            return this.header;
        }

        public final UserId L1() {
            return this.sourceId;
        }

        public final WallCoownersDto M() {
            return this.coowners;
        }

        public final Boolean N0() {
            return this.hideLikes;
        }

        public final Boolean N1() {
            return this.suggestSubscribe;
        }

        public final Integer P0() {
            return this.id;
        }

        public final List<com.vk.api.generated.wall.dto.WallWallpostFullDto> R() {
            return this.copyHistory;
        }

        public final String R1() {
            return this.text;
        }

        public final BaseLikesInfoDto S0() {
            return this.likes;
        }

        public final WallPostCopyrightDto T() {
            return this.copyright;
        }

        public final BaseBoolIntDto U0() {
            return this.markedAsAds;
        }

        public final Float U1() {
            return this.thumbsMaxHeight;
        }

        public final List<Integer> V0() {
            return this.parentsStack;
        }

        public final UserId V1() {
            return this.toId;
        }

        public final UserId W() {
            return this.createdBy;
        }

        public final String W1() {
            return this.translationLang;
        }

        public final Boolean X1() {
            return this.trending;
        }

        public final Integer Z() {
            return this.date;
        }

        public final WallWallpostDonutDto a0() {
            return this.donut;
        }

        public final Integer b1() {
            return this.postId;
        }

        public final WallPostActivityDto d() {
            return this.activity;
        }

        public final WallPostSourceDto d1() {
            return this.postSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final WallWallpostAdsEasyPromoteDto e() {
            return this.adsEasyPromote;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WallWallpostFullDto)) {
                return false;
            }
            WallWallpostFullDto wallWallpostFullDto = (WallWallpostFullDto) obj;
            return this.innerType == wallWallpostFullDto.innerType && epx.f(this.adsEasyPromote, wallWallpostFullDto.adsEasyPromote) && epx.f(this.adsEasyPromoteThreeDots, wallWallpostFullDto.adsEasyPromoteThreeDots) && epx.f(this.copyHistory, wallWallpostFullDto.copyHistory) && this.canEdit == wallWallpostFullDto.canEdit && epx.f(this.createdBy, wallWallpostFullDto.createdBy) && this.canDelete == wallWallpostFullDto.canDelete && this.canPublish == wallWallpostFullDto.canPublish && this.canPin == wallWallpostFullDto.canPin && epx.f(this.donut, wallWallpostFullDto.donut) && this.friendsOnly == wallWallpostFullDto.friendsOnly && this.bestFriendsOnly == wallWallpostFullDto.bestFriendsOnly && this.finalPost == wallWallpostFullDto.finalPost && epx.f(this.checkSign, wallWallpostFullDto.checkSign) && this.isPinned == wallWallpostFullDto.isPinned && epx.f(this.comments, wallWallpostFullDto.comments) && this.markedAsAds == wallWallpostFullDto.markedAsAds && epx.f(this.markedAsAuthorAd, wallWallpostFullDto.markedAsAuthorAd) && epx.f(this.authorAd, wallWallpostFullDto.authorAd) && epx.f(this.activity, wallWallpostFullDto.activity) && epx.f(this.suggestSubscribe, wallWallpostFullDto.suggestSubscribe) && epx.f(this.zoomText, wallWallpostFullDto.zoomText) && epx.f(this.rating, wallWallpostFullDto.rating) && epx.f(this.canSetCategory, wallWallpostFullDto.canSetCategory) && epx.f(this.canDoubtCategory, wallWallpostFullDto.canDoubtCategory) && epx.f(this.categoryAction, wallWallpostFullDto.categoryAction) && this.topicId == wallWallpostFullDto.topicId && epx.f(this.trending, wallWallpostFullDto.trending) && epx.f(this.bottomExtension, wallWallpostFullDto.bottomExtension) && epx.f(this.shortTextRate, wallWallpostFullDto.shortTextRate) && epx.f(this.shortAttachCount, wallWallpostFullDto.shortAttachCount) && epx.f(this.sourceId, wallWallpostFullDto.sourceId) && epx.f(this.compactAttachmentsBeforeCut, wallWallpostFullDto.compactAttachmentsBeforeCut) && epx.f(this.coowners, wallWallpostFullDto.coowners) && epx.f(this.thumbsMaxHeight, wallWallpostFullDto.thumbsMaxHeight) && epx.f(this.hash, wallWallpostFullDto.hash) && epx.f(this.adData, wallWallpostFullDto.adData) && epx.f(this.adModerationChecksum, wallWallpostFullDto.adModerationChecksum) && epx.f(this.caption, wallWallpostFullDto.caption) && epx.f(this.translationLang, wallWallpostFullDto.translationLang) && epx.f(this.hasTranslation, wallWallpostFullDto.hasTranslation) && epx.f(this.facebookExport, wallWallpostFullDto.facebookExport) && epx.f(this.twitterExport, wallWallpostFullDto.twitterExport) && epx.f(this.postponedId, wallWallpostFullDto.postponedId) && epx.f(this.isPromotedPostStealth, wallWallpostFullDto.isPromotedPostStealth) && epx.f(this.hasVideoAutoplay, wallWallpostFullDto.hasVideoAutoplay) && epx.f(this.awayParams, wallWallpostFullDto.awayParams) && epx.f(this.hideLikes, wallWallpostFullDto.hideLikes) && this.type == wallWallpostFullDto.type && epx.f(this.feedback, wallWallpostFullDto.feedback) && epx.f(this.toId, wallWallpostFullDto.toId) && epx.f(this.hasMarketLink, wallWallpostFullDto.hasMarketLink) && epx.f(this.isFromPrivateGroup, wallWallpostFullDto.isFromPrivateGroup) && epx.f(this.pushSubscription, wallWallpostFullDto.pushSubscription) && epx.f(this.postAuthorData, wallWallpostFullDto.postAuthorData) && epx.f(this.research, wallWallpostFullDto.research) && epx.f(this.isAddedToMainTab, wallWallpostFullDto.isAddedToMainTab) && epx.f(this.isBlacklisted, wallWallpostFullDto.isBlacklisted) && epx.f(this.shareUrl, wallWallpostFullDto.shareUrl) && epx.f(this.carouselOffset, wallWallpostFullDto.carouselOffset) && epx.f(this.accessKey, wallWallpostFullDto.accessKey) && epx.f(this.isDeleted, wallWallpostFullDto.isDeleted) && epx.f(this.deletedReason, wallWallpostFullDto.deletedReason) && epx.f(this.deletedDetails, wallWallpostFullDto.deletedDetails) && epx.f(this.donutMiniappUrl, wallWallpostFullDto.donutMiniappUrl) && epx.f(this.attachments, wallWallpostFullDto.attachments) && epx.f(this.attachmentsMeta, wallWallpostFullDto.attachmentsMeta) && epx.f(this.contentLayout, wallWallpostFullDto.contentLayout) && epx.f(this.badgeId, wallWallpostFullDto.badgeId) && epx.f(this.badgeInfo, wallWallpostFullDto.badgeInfo) && epx.f(this.donutBadgeInfo, wallWallpostFullDto.donutBadgeInfo) && epx.f(this.canArchive, wallWallpostFullDto.canArchive) && this.canViewStats == wallWallpostFullDto.canViewStats && epx.f(this.copyright, wallWallpostFullDto.copyright) && epx.f(this.date, wallWallpostFullDto.date) && epx.f(this.edited, wallWallpostFullDto.edited) && epx.f(this.fromId, wallWallpostFullDto.fromId) && epx.f(this.geo, wallWallpostFullDto.geo) && epx.f(this.header, wallWallpostFullDto.header) && epx.f(this.id, wallWallpostFullDto.id) && epx.f(this.isArchived, wallWallpostFullDto.isArchived) && epx.f(this.isFavorite, wallWallpostFullDto.isFavorite) && epx.f(this.likes, wallWallpostFullDto.likes) && epx.f(this.reactionSetId, wallWallpostFullDto.reactionSetId) && epx.f(this.reactions, wallWallpostFullDto.reactions) && epx.f(this.badges, wallWallpostFullDto.badges) && epx.f(this.ownerId, wallWallpostFullDto.ownerId) && epx.f(this.replyOwnerId, wallWallpostFullDto.replyOwnerId) && epx.f(this.replyPostId, wallWallpostFullDto.replyPostId) && epx.f(this.replyTo, wallWallpostFullDto.replyTo) && epx.f(this.poster, wallWallpostFullDto.poster) && epx.f(this.postId, wallWallpostFullDto.postId) && epx.f(this.parentsStack, wallWallpostFullDto.parentsStack) && epx.f(this.postSource, wallWallpostFullDto.postSource) && this.postType == wallWallpostFullDto.postType && epx.f(this.reposts, wallWallpostFullDto.reposts) && epx.f(this.signerId, wallWallpostFullDto.signerId) && epx.f(this.text, wallWallpostFullDto.text) && epx.f(this.views, wallWallpostFullDto.views) && epx.f(this.replyCount, wallWallpostFullDto.replyCount) && epx.f(this.trackCode, wallWallpostFullDto.trackCode) && epx.f(this.sharing, wallWallpostFullDto.sharing);
        }

        public final List<WallWallpostAttachmentDto> f() {
            return this.attachments;
        }

        public final WallWallpostAttachmentsMetaDto g() {
            return this.attachmentsMeta;
        }

        public final int hashCode() {
            int hashCode = this.innerType.hashCode() * 31;
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto = this.adsEasyPromote;
            int hashCode2 = (hashCode + (wallWallpostAdsEasyPromoteDto == null ? 0 : wallWallpostAdsEasyPromoteDto.hashCode())) * 31;
            Boolean bool = this.adsEasyPromoteThreeDots;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<com.vk.api.generated.wall.dto.WallWallpostFullDto> list = this.copyHistory;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canEdit;
            int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            UserId userId = this.createdBy;
            int hashCode6 = (hashCode5 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
            int hashCode7 = (hashCode6 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.canPublish;
            int hashCode8 = (hashCode7 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.canPin;
            int hashCode9 = (hashCode8 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            int hashCode10 = (hashCode9 + (wallWallpostDonutDto == null ? 0 : wallWallpostDonutDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto5 = this.friendsOnly;
            int hashCode11 = (hashCode10 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto6 = this.bestFriendsOnly;
            int hashCode12 = (hashCode11 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto7 = this.finalPost;
            int hashCode13 = (hashCode12 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
            Boolean bool2 = this.checkSign;
            int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto8 = this.isPinned;
            int hashCode15 = (hashCode14 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            int hashCode16 = (hashCode15 + (baseCommentsInfoDto == null ? 0 : baseCommentsInfoDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto9 = this.markedAsAds;
            int hashCode17 = (hashCode16 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
            Boolean bool3 = this.markedAsAuthorAd;
            int hashCode18 = (hashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            AdsAdvertiserInfoDto adsAdvertiserInfoDto = this.authorAd;
            int hashCode19 = (hashCode18 + (adsAdvertiserInfoDto == null ? 0 : adsAdvertiserInfoDto.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode20 = (hashCode19 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.zoomText;
            int hashCode22 = (hashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            WallWallpostRatingDto wallWallpostRatingDto = this.rating;
            int hashCode23 = (hashCode22 + (wallWallpostRatingDto == null ? 0 : wallWallpostRatingDto.hashCode())) * 31;
            Boolean bool6 = this.canSetCategory;
            int hashCode24 = (hashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.canDoubtCategory;
            int hashCode25 = (hashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto = this.categoryAction;
            int hashCode26 = (hashCode25 + (wallWallpostCategoryActionDto == null ? 0 : wallWallpostCategoryActionDto.hashCode())) * 31;
            TopicIdDto topicIdDto = this.topicId;
            int hashCode27 = (hashCode26 + (topicIdDto == null ? 0 : topicIdDto.hashCode())) * 31;
            Boolean bool8 = this.trending;
            int hashCode28 = (hashCode27 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            BaseBottomExtensionDto baseBottomExtensionDto = this.bottomExtension;
            int hashCode29 = (hashCode28 + (baseBottomExtensionDto == null ? 0 : baseBottomExtensionDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode30 = (hashCode29 + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.shortAttachCount;
            int hashCode31 = (hashCode30 + (num == null ? 0 : num.hashCode())) * 31;
            UserId userId2 = this.sourceId;
            int hashCode32 = (hashCode31 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            Integer num2 = this.compactAttachmentsBeforeCut;
            int hashCode33 = (hashCode32 + (num2 == null ? 0 : num2.hashCode())) * 31;
            WallCoownersDto wallCoownersDto = this.coowners;
            int hashCode34 = (hashCode33 + (wallCoownersDto == null ? 0 : wallCoownersDto.hashCode())) * 31;
            Float f2 = this.thumbsMaxHeight;
            int hashCode35 = (hashCode34 + (f2 == null ? 0 : f2.hashCode())) * 31;
            String str = this.hash;
            int hashCode36 = (hashCode35 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.adData;
            int hashCode37 = (hashCode36 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adModerationChecksum;
            int hashCode38 = (hashCode37 + (str3 == null ? 0 : str3.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode39 = (hashCode38 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            String str4 = this.translationLang;
            int hashCode40 = (hashCode39 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool9 = this.hasTranslation;
            int hashCode41 = (hashCode40 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Integer num3 = this.facebookExport;
            int hashCode42 = (hashCode41 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.twitterExport;
            int hashCode43 = (hashCode42 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.postponedId;
            int hashCode44 = (hashCode43 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Boolean bool10 = this.isPromotedPostStealth;
            int hashCode45 = (hashCode44 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.hasVideoAutoplay;
            int hashCode46 = (hashCode45 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Object obj = this.awayParams;
            int hashCode47 = (hashCode46 + (obj == null ? 0 : obj.hashCode())) * 31;
            Boolean bool12 = this.hideLikes;
            int hashCode48 = (hashCode47 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            WallPostTypeDto wallPostTypeDto = this.type;
            int hashCode49 = (hashCode48 + (wallPostTypeDto == null ? 0 : wallPostTypeDto.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode50 = (hashCode49 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            UserId userId3 = this.toId;
            int hashCode51 = (hashCode50 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
            Boolean bool13 = this.hasMarketLink;
            int hashCode52 = (hashCode51 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.isFromPrivateGroup;
            int hashCode53 = (hashCode52 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            WallPushSubscriptionDto wallPushSubscriptionDto = this.pushSubscription;
            int hashCode54 = (hashCode53 + (wallPushSubscriptionDto == null ? 0 : wallPushSubscriptionDto.hashCode())) * 31;
            WallWallpostAuthorDataDto wallWallpostAuthorDataDto = this.postAuthorData;
            int hashCode55 = (hashCode54 + (wallWallpostAuthorDataDto == null ? 0 : wallWallpostAuthorDataDto.hashCode())) * 31;
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
            int hashCode56 = (hashCode55 + (newsfeedMediascopeResearchDto == null ? 0 : newsfeedMediascopeResearchDto.hashCode())) * 31;
            Boolean bool15 = this.isAddedToMainTab;
            int hashCode57 = (hashCode56 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.isBlacklisted;
            int hashCode58 = (hashCode57 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            String str5 = this.shareUrl;
            int hashCode59 = (hashCode58 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num6 = this.carouselOffset;
            int hashCode60 = (hashCode59 + (num6 == null ? 0 : num6.hashCode())) * 31;
            String str6 = this.accessKey;
            int hashCode61 = (hashCode60 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool17 = this.isDeleted;
            int hashCode62 = (hashCode61 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            String str7 = this.deletedReason;
            int hashCode63 = (hashCode62 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.deletedDetails;
            int hashCode64 = (hashCode63 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.donutMiniappUrl;
            int hashCode65 = (hashCode64 + (str9 == null ? 0 : str9.hashCode())) * 31;
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            int hashCode66 = (hashCode65 + (list2 == null ? 0 : list2.hashCode())) * 31;
            WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto = this.attachmentsMeta;
            int hashCode67 = (hashCode66 + (wallWallpostAttachmentsMetaDto == null ? 0 : wallWallpostAttachmentsMetaDto.hashCode())) * 31;
            List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
            int hashCode68 = (hashCode67 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Integer num7 = this.badgeId;
            int hashCode69 = (hashCode68 + (num7 == null ? 0 : num7.hashCode())) * 31;
            BadgesCommentInfoDto badgesCommentInfoDto = this.badgeInfo;
            int hashCode70 = (hashCode69 + (badgesCommentInfoDto == null ? 0 : badgesCommentInfoDto.hashCode())) * 31;
            BadgesDonutInfoDto badgesDonutInfoDto = this.donutBadgeInfo;
            int hashCode71 = (hashCode70 + (badgesDonutInfoDto == null ? 0 : badgesDonutInfoDto.hashCode())) * 31;
            Boolean bool18 = this.canArchive;
            int hashCode72 = (hashCode71 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto10 = this.canViewStats;
            int hashCode73 = (hashCode72 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            int hashCode74 = (hashCode73 + (wallPostCopyrightDto == null ? 0 : wallPostCopyrightDto.hashCode())) * 31;
            Integer num8 = this.date;
            int hashCode75 = (hashCode74 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.edited;
            int hashCode76 = (hashCode75 + (num9 == null ? 0 : num9.hashCode())) * 31;
            UserId userId4 = this.fromId;
            int hashCode77 = (hashCode76 + (userId4 == null ? 0 : Long.hashCode(userId4.b))) * 31;
            WallGeoDto wallGeoDto = this.geo;
            int hashCode78 = (hashCode77 + (wallGeoDto == null ? 0 : wallGeoDto.hashCode())) * 31;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            int hashCode79 = (hashCode78 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
            Integer num10 = this.id;
            int hashCode80 = (hashCode79 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Boolean bool19 = this.isArchived;
            int hashCode81 = (hashCode80 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
            Boolean bool20 = this.isFavorite;
            int hashCode82 = (hashCode81 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            int hashCode83 = (hashCode82 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
            String str10 = this.reactionSetId;
            int hashCode84 = (hashCode83 + (str10 == null ? 0 : str10.hashCode())) * 31;
            LikesItemReactionsDto likesItemReactionsDto = this.reactions;
            int hashCode85 = (hashCode84 + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
            BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
            int hashCode86 = (hashCode85 + (badgesObjectInfoDto == null ? 0 : badgesObjectInfoDto.hashCode())) * 31;
            UserId userId5 = this.ownerId;
            int hashCode87 = (hashCode86 + (userId5 == null ? 0 : Long.hashCode(userId5.b))) * 31;
            UserId userId6 = this.replyOwnerId;
            int hashCode88 = (hashCode87 + (userId6 == null ? 0 : Long.hashCode(userId6.b))) * 31;
            Integer num11 = this.replyPostId;
            int hashCode89 = (hashCode88 + (num11 == null ? 0 : num11.hashCode())) * 31;
            UserId userId7 = this.replyTo;
            int hashCode90 = (hashCode89 + (userId7 == null ? 0 : Long.hashCode(userId7.b))) * 31;
            WallPosterDto wallPosterDto = this.poster;
            int hashCode91 = (hashCode90 + (wallPosterDto == null ? 0 : wallPosterDto.hashCode())) * 31;
            Integer num12 = this.postId;
            int hashCode92 = (hashCode91 + (num12 == null ? 0 : num12.hashCode())) * 31;
            List<Integer> list4 = this.parentsStack;
            int hashCode93 = (hashCode92 + (list4 == null ? 0 : list4.hashCode())) * 31;
            WallPostSourceDto wallPostSourceDto = this.postSource;
            int hashCode94 = (hashCode93 + (wallPostSourceDto == null ? 0 : wallPostSourceDto.hashCode())) * 31;
            WallPostTypeDto wallPostTypeDto2 = this.postType;
            int hashCode95 = (hashCode94 + (wallPostTypeDto2 == null ? 0 : wallPostTypeDto2.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode96 = (hashCode95 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            UserId userId8 = this.signerId;
            int hashCode97 = (hashCode96 + (userId8 == null ? 0 : Long.hashCode(userId8.b))) * 31;
            String str11 = this.text;
            int hashCode98 = (hashCode97 + (str11 == null ? 0 : str11.hashCode())) * 31;
            WallViewsDto wallViewsDto = this.views;
            int hashCode99 = (hashCode98 + (wallViewsDto == null ? 0 : wallViewsDto.hashCode())) * 31;
            Integer num13 = this.replyCount;
            int hashCode100 = (hashCode99 + (num13 == null ? 0 : num13.hashCode())) * 31;
            String str12 = this.trackCode;
            int hashCode101 = (hashCode100 + (str12 == null ? 0 : str12.hashCode())) * 31;
            WallSharingDto wallSharingDto = this.sharing;
            return hashCode101 + (wallSharingDto != null ? wallSharingDto.hashCode() : 0);
        }

        public final AdsAdvertiserInfoDto i() {
            return this.authorAd;
        }

        public final Integer i2() {
            return this.twitterExport;
        }

        public final Integer j() {
            return this.badgeId;
        }

        public final BadgesObjectInfoDto k() {
            return this.badges;
        }

        public final BaseBoolIntDto l() {
            return this.bestFriendsOnly;
        }

        public final BadgesDonutInfoDto l0() {
            return this.donutBadgeInfo;
        }

        public final WallViewsDto l2() {
            return this.views;
        }

        public final Boolean m2() {
            return this.zoomText;
        }

        public final Boolean n() {
            return this.canArchive;
        }

        public final WallPostTypeDto n1() {
            return this.postType;
        }

        public final BaseBoolIntDto o() {
            return this.canDelete;
        }

        public final WallPosterDto o1() {
            return this.poster;
        }

        public final Boolean o2() {
            return this.isArchived;
        }

        public final Boolean p() {
            return this.canDoubtCategory;
        }

        public final UserId q() {
            return this.ownerId;
        }

        public final Boolean q2() {
            return this.isDeleted;
        }

        public final String r() {
            return this.trackCode;
        }

        public final Boolean r2() {
            return this.isFavorite;
        }

        public final String s1() {
            return this.reactionSetId;
        }

        public final LikesItemReactionsDto t1() {
            return this.reactions;
        }

        public final String toString() {
            return "WallWallpostFullDto(innerType=" + this.innerType + ", adsEasyPromote=" + this.adsEasyPromote + ", adsEasyPromoteThreeDots=" + this.adsEasyPromoteThreeDots + ", copyHistory=" + this.copyHistory + ", canEdit=" + this.canEdit + ", createdBy=" + this.createdBy + ", canDelete=" + this.canDelete + ", canPublish=" + this.canPublish + ", canPin=" + this.canPin + ", donut=" + this.donut + ", friendsOnly=" + this.friendsOnly + ", bestFriendsOnly=" + this.bestFriendsOnly + ", finalPost=" + this.finalPost + ", checkSign=" + this.checkSign + ", isPinned=" + this.isPinned + ", comments=" + this.comments + ", markedAsAds=" + this.markedAsAds + ", markedAsAuthorAd=" + this.markedAsAuthorAd + ", authorAd=" + this.authorAd + ", activity=" + this.activity + ", suggestSubscribe=" + this.suggestSubscribe + ", zoomText=" + this.zoomText + ", rating=" + this.rating + ", canSetCategory=" + this.canSetCategory + ", canDoubtCategory=" + this.canDoubtCategory + ", categoryAction=" + this.categoryAction + ", topicId=" + this.topicId + ", trending=" + this.trending + ", bottomExtension=" + this.bottomExtension + ", shortTextRate=" + this.shortTextRate + ", shortAttachCount=" + this.shortAttachCount + ", sourceId=" + this.sourceId + ", compactAttachmentsBeforeCut=" + this.compactAttachmentsBeforeCut + ", coowners=" + this.coowners + ", thumbsMaxHeight=" + this.thumbsMaxHeight + ", hash=" + this.hash + ", adData=" + this.adData + ", adModerationChecksum=" + this.adModerationChecksum + ", caption=" + this.caption + ", translationLang=" + this.translationLang + ", hasTranslation=" + this.hasTranslation + ", facebookExport=" + this.facebookExport + ", twitterExport=" + this.twitterExport + ", postponedId=" + this.postponedId + ", isPromotedPostStealth=" + this.isPromotedPostStealth + ", hasVideoAutoplay=" + this.hasVideoAutoplay + ", awayParams=" + this.awayParams + ", hideLikes=" + this.hideLikes + ", type=" + this.type + ", feedback=" + this.feedback + ", toId=" + this.toId + ", hasMarketLink=" + this.hasMarketLink + ", isFromPrivateGroup=" + this.isFromPrivateGroup + ", pushSubscription=" + this.pushSubscription + ", postAuthorData=" + this.postAuthorData + ", research=" + this.research + ", isAddedToMainTab=" + this.isAddedToMainTab + ", isBlacklisted=" + this.isBlacklisted + ", shareUrl=" + this.shareUrl + ", carouselOffset=" + this.carouselOffset + ", accessKey=" + this.accessKey + ", isDeleted=" + this.isDeleted + ", deletedReason=" + this.deletedReason + ", deletedDetails=" + this.deletedDetails + ", donutMiniappUrl=" + this.donutMiniappUrl + ", attachments=" + this.attachments + ", attachmentsMeta=" + this.attachmentsMeta + ", contentLayout=" + this.contentLayout + ", badgeId=" + this.badgeId + ", badgeInfo=" + this.badgeInfo + ", donutBadgeInfo=" + this.donutBadgeInfo + ", canArchive=" + this.canArchive + ", canViewStats=" + this.canViewStats + ", copyright=" + this.copyright + ", date=" + this.date + ", edited=" + this.edited + ", fromId=" + this.fromId + ", geo=" + this.geo + ", header=" + this.header + ", id=" + this.id + ", isArchived=" + this.isArchived + ", isFavorite=" + this.isFavorite + ", likes=" + this.likes + ", reactionSetId=" + this.reactionSetId + ", reactions=" + this.reactions + ", badges=" + this.badges + ", ownerId=" + this.ownerId + ", replyOwnerId=" + this.replyOwnerId + ", replyPostId=" + this.replyPostId + ", replyTo=" + this.replyTo + ", poster=" + this.poster + ", postId=" + this.postId + ", parentsStack=" + this.parentsStack + ", postSource=" + this.postSource + ", postType=" + this.postType + ", reposts=" + this.reposts + ", signerId=" + this.signerId + ", text=" + this.text + ", views=" + this.views + ", replyCount=" + this.replyCount + ", trackCode=" + this.trackCode + ", sharing=" + this.sharing + ')';
        }

        public final BaseBoolIntDto u() {
            return this.canEdit;
        }

        public final Integer v0() {
            return this.facebookExport;
        }

        public final NewsfeedItemWallpostFeedbackDto w0() {
            return this.feedback;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.innerType.writeToParcel(parcel, i);
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto = this.adsEasyPromote;
            if (wallWallpostAdsEasyPromoteDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostAdsEasyPromoteDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.adsEasyPromoteThreeDots;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            List<com.vk.api.generated.wall.dto.WallWallpostFullDto> list = this.copyHistory;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((com.vk.api.generated.wall.dto.WallWallpostFullDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.canEdit, i);
            parcel.writeParcelable(this.createdBy, i);
            parcel.writeParcelable(this.canDelete, i);
            parcel.writeParcelable(this.canPublish, i);
            parcel.writeParcelable(this.canPin, i);
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            if (wallWallpostDonutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostDonutDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.friendsOnly, i);
            parcel.writeParcelable(this.bestFriendsOnly, i);
            parcel.writeParcelable(this.finalPost, i);
            Boolean bool2 = this.checkSign;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.isPinned, i);
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            if (baseCommentsInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                baseCommentsInfoDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.markedAsAds, i);
            Boolean bool3 = this.markedAsAuthorAd;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            AdsAdvertiserInfoDto adsAdvertiserInfoDto = this.authorAd;
            if (adsAdvertiserInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                adsAdvertiserInfoDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.activity, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            Boolean bool5 = this.zoomText;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool5);
            }
            WallWallpostRatingDto wallWallpostRatingDto = this.rating;
            if (wallWallpostRatingDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostRatingDto.writeToParcel(parcel, i);
            }
            Boolean bool6 = this.canSetCategory;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool6);
            }
            Boolean bool7 = this.canDoubtCategory;
            if (bool7 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool7);
            }
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto = this.categoryAction;
            if (wallWallpostCategoryActionDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostCategoryActionDto.writeToParcel(parcel, i);
            }
            TopicIdDto topicIdDto = this.topicId;
            if (topicIdDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                topicIdDto.writeToParcel(parcel, i);
            }
            Boolean bool8 = this.trending;
            if (bool8 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool8);
            }
            parcel.writeParcelable(this.bottomExtension, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            Integer num = this.shortAttachCount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeParcelable(this.sourceId, i);
            Integer num2 = this.compactAttachmentsBeforeCut;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            WallCoownersDto wallCoownersDto = this.coowners;
            if (wallCoownersDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallCoownersDto.writeToParcel(parcel, i);
            }
            Float f3 = this.thumbsMaxHeight;
            if (f3 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f3);
            }
            parcel.writeString(this.hash);
            parcel.writeString(this.adData);
            parcel.writeString(this.adModerationChecksum);
            parcel.writeParcelable(this.caption, i);
            parcel.writeString(this.translationLang);
            Boolean bool9 = this.hasTranslation;
            if (bool9 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool9);
            }
            Integer num3 = this.facebookExport;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
            }
            Integer num4 = this.twitterExport;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num4);
            }
            Integer num5 = this.postponedId;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num5);
            }
            Boolean bool10 = this.isPromotedPostStealth;
            if (bool10 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool10);
            }
            Boolean bool11 = this.hasVideoAutoplay;
            if (bool11 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool11);
            }
            parcel.writeValue(this.awayParams);
            Boolean bool12 = this.hideLikes;
            if (bool12 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool12);
            }
            WallPostTypeDto wallPostTypeDto = this.type;
            if (wallPostTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostTypeDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.toId, i);
            Boolean bool13 = this.hasMarketLink;
            if (bool13 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool13);
            }
            Boolean bool14 = this.isFromPrivateGroup;
            if (bool14 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool14);
            }
            WallPushSubscriptionDto wallPushSubscriptionDto = this.pushSubscription;
            if (wallPushSubscriptionDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPushSubscriptionDto.writeToParcel(parcel, i);
            }
            WallWallpostAuthorDataDto wallWallpostAuthorDataDto = this.postAuthorData;
            if (wallWallpostAuthorDataDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostAuthorDataDto.writeToParcel(parcel, i);
            }
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
            if (newsfeedMediascopeResearchDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedMediascopeResearchDto.writeToParcel(parcel, i);
            }
            Boolean bool15 = this.isAddedToMainTab;
            if (bool15 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool15);
            }
            Boolean bool16 = this.isBlacklisted;
            if (bool16 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool16);
            }
            parcel.writeString(this.shareUrl);
            Integer num6 = this.carouselOffset;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num6);
            }
            parcel.writeString(this.accessKey);
            Boolean bool17 = this.isDeleted;
            if (bool17 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool17);
            }
            parcel.writeString(this.deletedReason);
            parcel.writeString(this.deletedDetails);
            parcel.writeString(this.donutMiniappUrl);
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f4 = dn.f(parcel, list2, 1);
                while (f4.hasNext()) {
                    parcel.writeParcelable((Parcelable) f4.next(), i);
                }
            }
            parcel.writeParcelable(this.attachmentsMeta, i);
            List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f5 = dn.f(parcel, list3, 1);
                while (f5.hasNext()) {
                    parcel.writeParcelable((Parcelable) f5.next(), i);
                }
            }
            Integer num7 = this.badgeId;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num7);
            }
            parcel.writeParcelable(this.badgeInfo, i);
            parcel.writeParcelable(this.donutBadgeInfo, i);
            Boolean bool18 = this.canArchive;
            if (bool18 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool18);
            }
            parcel.writeParcelable(this.canViewStats, i);
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            if (wallPostCopyrightDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostCopyrightDto.writeToParcel(parcel, i);
            }
            Integer num8 = this.date;
            if (num8 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num8);
            }
            Integer num9 = this.edited;
            if (num9 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num9);
            }
            parcel.writeParcelable(this.fromId, i);
            parcel.writeParcelable(this.geo, i);
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            if (newsfeedNewsfeedItemHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedNewsfeedItemHeaderDto.writeToParcel(parcel, i);
            }
            Integer num10 = this.id;
            if (num10 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num10);
            }
            Boolean bool19 = this.isArchived;
            if (bool19 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool19);
            }
            Boolean bool20 = this.isFavorite;
            if (bool20 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool20);
            }
            parcel.writeParcelable(this.likes, i);
            parcel.writeString(this.reactionSetId);
            parcel.writeParcelable(this.reactions, i);
            BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
            if (badgesObjectInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                badgesObjectInfoDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeParcelable(this.replyOwnerId, i);
            Integer num11 = this.replyPostId;
            if (num11 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num11);
            }
            parcel.writeParcelable(this.replyTo, i);
            WallPosterDto wallPosterDto = this.poster;
            if (wallPosterDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPosterDto.writeToParcel(parcel, i);
            }
            Integer num12 = this.postId;
            if (num12 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num12);
            }
            List<Integer> list4 = this.parentsStack;
            if (list4 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f6 = dn.f(parcel, list4, 1);
                while (f6.hasNext()) {
                    parcel.writeInt(((Number) f6.next()).intValue());
                }
            }
            WallPostSourceDto wallPostSourceDto = this.postSource;
            if (wallPostSourceDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostSourceDto.writeToParcel(parcel, i);
            }
            WallPostTypeDto wallPostTypeDto2 = this.postType;
            if (wallPostTypeDto2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostTypeDto2.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.reposts, i);
            parcel.writeParcelable(this.signerId, i);
            parcel.writeString(this.text);
            WallViewsDto wallViewsDto = this.views;
            if (wallViewsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallViewsDto.writeToParcel(parcel, i);
            }
            Integer num13 = this.replyCount;
            if (num13 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num13);
            }
            parcel.writeString(this.trackCode);
            WallSharingDto wallSharingDto = this.sharing;
            if (wallSharingDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallSharingDto.writeToParcel(parcel, i);
            }
        }

        public final UserId x1() {
            return this.replyOwnerId;
        }

        public final BaseBoolIntDto y0() {
            return this.finalPost;
        }

        public final Integer y1() {
            return this.replyPostId;
        }

        public final BaseBoolIntDto y2() {
            return this.isPinned;
        }

        public final BaseRepostsInfoDto z1() {
            return this.reposts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WallWallpostFullDto(InnerTypeDto innerTypeDto, WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto, Boolean bool, List<com.vk.api.generated.wall.dto.WallWallpostFullDto> list, BaseBoolIntDto baseBoolIntDto, UserId userId, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool2, BaseBoolIntDto baseBoolIntDto8, BaseCommentsInfoDto baseCommentsInfoDto, BaseBoolIntDto baseBoolIntDto9, Boolean bool3, AdsAdvertiserInfoDto adsAdvertiserInfoDto, WallPostActivityDto wallPostActivityDto, Boolean bool4, Boolean bool5, WallWallpostRatingDto wallWallpostRatingDto, Boolean bool6, Boolean bool7, WallWallpostCategoryActionDto wallWallpostCategoryActionDto, TopicIdDto topicIdDto, Boolean bool8, BaseBottomExtensionDto baseBottomExtensionDto, Float f, Integer num, UserId userId2, Integer num2, WallCoownersDto wallCoownersDto, Float f2, String str, String str2, String str3, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, String str4, Boolean bool9, Integer num3, Integer num4, Integer num5, Boolean bool10, Boolean bool11, Object obj, Boolean bool12, WallPostTypeDto wallPostTypeDto, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, UserId userId3, Boolean bool13, Boolean bool14, WallPushSubscriptionDto wallPushSubscriptionDto, WallWallpostAuthorDataDto wallWallpostAuthorDataDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool15, Boolean bool16, String str5, Integer num6, String str6, Boolean bool17, String str7, String str8, String str9, List<WallWallpostAttachmentDto> list2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List<? extends WallWallpostContentLayoutItemDto> list3, Integer num7, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool18, BaseBoolIntDto baseBoolIntDto10, WallPostCopyrightDto wallPostCopyrightDto, Integer num8, Integer num9, UserId userId4, WallGeoDto wallGeoDto, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Integer num10, Boolean bool19, Boolean bool20, BaseLikesInfoDto baseLikesInfoDto, String str10, LikesItemReactionsDto likesItemReactionsDto, BadgesObjectInfoDto badgesObjectInfoDto, UserId userId5, UserId userId6, Integer num11, UserId userId7, WallPosterDto wallPosterDto, Integer num12, List<Integer> list4, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto2, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId8, String str11, WallViewsDto wallViewsDto, Integer num13, String str12, WallSharingDto wallSharingDto) {
            super(null);
            this.innerType = innerTypeDto;
            this.adsEasyPromote = wallWallpostAdsEasyPromoteDto;
            this.adsEasyPromoteThreeDots = bool;
            this.copyHistory = list;
            this.canEdit = baseBoolIntDto;
            this.createdBy = userId;
            this.canDelete = baseBoolIntDto2;
            this.canPublish = baseBoolIntDto3;
            this.canPin = baseBoolIntDto4;
            this.donut = wallWallpostDonutDto;
            this.friendsOnly = baseBoolIntDto5;
            this.bestFriendsOnly = baseBoolIntDto6;
            this.finalPost = baseBoolIntDto7;
            this.checkSign = bool2;
            this.isPinned = baseBoolIntDto8;
            this.comments = baseCommentsInfoDto;
            this.markedAsAds = baseBoolIntDto9;
            this.markedAsAuthorAd = bool3;
            this.authorAd = adsAdvertiserInfoDto;
            this.activity = wallPostActivityDto;
            this.suggestSubscribe = bool4;
            this.zoomText = bool5;
            this.rating = wallWallpostRatingDto;
            this.canSetCategory = bool6;
            this.canDoubtCategory = bool7;
            this.categoryAction = wallWallpostCategoryActionDto;
            this.topicId = topicIdDto;
            this.trending = bool8;
            this.bottomExtension = baseBottomExtensionDto;
            this.shortTextRate = f;
            this.shortAttachCount = num;
            this.sourceId = userId2;
            this.compactAttachmentsBeforeCut = num2;
            this.coowners = wallCoownersDto;
            this.thumbsMaxHeight = f2;
            this.hash = str;
            this.adData = str2;
            this.adModerationChecksum = str3;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.translationLang = str4;
            this.hasTranslation = bool9;
            this.facebookExport = num3;
            this.twitterExport = num4;
            this.postponedId = num5;
            this.isPromotedPostStealth = bool10;
            this.hasVideoAutoplay = bool11;
            this.awayParams = obj;
            this.hideLikes = bool12;
            this.type = wallPostTypeDto;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.toId = userId3;
            this.hasMarketLink = bool13;
            this.isFromPrivateGroup = bool14;
            this.pushSubscription = wallPushSubscriptionDto;
            this.postAuthorData = wallWallpostAuthorDataDto;
            this.research = newsfeedMediascopeResearchDto;
            this.isAddedToMainTab = bool15;
            this.isBlacklisted = bool16;
            this.shareUrl = str5;
            this.carouselOffset = num6;
            this.accessKey = str6;
            this.isDeleted = bool17;
            this.deletedReason = str7;
            this.deletedDetails = str8;
            this.donutMiniappUrl = str9;
            this.attachments = list2;
            this.attachmentsMeta = wallWallpostAttachmentsMetaDto;
            this.contentLayout = list3;
            this.badgeId = num7;
            this.badgeInfo = badgesCommentInfoDto;
            this.donutBadgeInfo = badgesDonutInfoDto;
            this.canArchive = bool18;
            this.canViewStats = baseBoolIntDto10;
            this.copyright = wallPostCopyrightDto;
            this.date = num8;
            this.edited = num9;
            this.fromId = userId4;
            this.geo = wallGeoDto;
            this.header = newsfeedNewsfeedItemHeaderDto;
            this.id = num10;
            this.isArchived = bool19;
            this.isFavorite = bool20;
            this.likes = baseLikesInfoDto;
            this.reactionSetId = str10;
            this.reactions = likesItemReactionsDto;
            this.badges = badgesObjectInfoDto;
            this.ownerId = userId5;
            this.replyOwnerId = userId6;
            this.replyPostId = num11;
            this.replyTo = userId7;
            this.poster = wallPosterDto;
            this.postId = num12;
            this.parentsStack = list4;
            this.postSource = wallPostSourceDto;
            this.postType = wallPostTypeDto2;
            this.reposts = baseRepostsInfoDto;
            this.signerId = userId8;
            this.text = str11;
            this.views = wallViewsDto;
            this.replyCount = num13;
            this.trackCode = str12;
            this.sharing = wallSharingDto;
        }
    }

    public /* synthetic */ WallWallItemDto(zcl zclVar) {
        this();
    }

    private WallWallItemDto() {
    }
}
