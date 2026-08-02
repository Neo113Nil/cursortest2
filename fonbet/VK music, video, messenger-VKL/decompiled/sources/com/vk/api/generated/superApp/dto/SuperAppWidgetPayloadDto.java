package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.api.generated.account.dto.AccountMenuItemDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseActionDto;
import com.vk.api.generated.vkRun.dto.VkRunBackgroundSyncConfigDto;
import com.vk.api.generated.vkRun.dto.VkRunLeaderboardDto;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
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
import xsna.ly80;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.so;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppWidgetPayloadDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppWidgetPayloadDto implements Parcelable {

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class AccountMenuItemListDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<AccountMenuItemListDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("count")
        private final Integer count;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<AccountMenuItemDto> items;

        @pmi0("show_more_has_dot")
        private final Boolean showMoreHasDot;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<AccountMenuItemListDto> {
            @Override // android.os.Parcelable.Creator
            public final AccountMenuItemListDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(AccountMenuItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new AccountMenuItemListDto(valueOf2, arrayList, valueOf, parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AccountMenuItemListDto[] newArray(int i) {
                return new AccountMenuItemListDto[i];
            }
        }

        public AccountMenuItemListDto() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountMenuItemListDto)) {
                return false;
            }
            AccountMenuItemListDto accountMenuItemListDto = (AccountMenuItemListDto) obj;
            return epx.f(this.count, accountMenuItemListDto.count) && epx.f(this.items, accountMenuItemListDto.items) && epx.f(this.showMoreHasDot, accountMenuItemListDto.showMoreHasDot) && epx.f(this.accessibility, accountMenuItemListDto.accessibility) && epx.f(this.additionalHeaderIcon, accountMenuItemListDto.additionalHeaderIcon) && this.headerRightType == accountMenuItemListDto.headerRightType && epx.f(this.weight, accountMenuItemListDto.weight) && this.type == accountMenuItemListDto.type;
        }

        public final int hashCode() {
            Integer num = this.count;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            List<AccountMenuItemDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.showMoreHasDot;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode4 = (hashCode3 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode7 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccountMenuItemListDto(count=");
            sb.append(this.count);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", showMoreHasDot=");
            sb.append(this.showMoreHasDot);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Integer num = this.count;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            List<AccountMenuItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((AccountMenuItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            Boolean bool = this.showMoreHasDot;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ AccountMenuItemListDto(Integer num, List list, Boolean bool, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : superAppAccessibilityDto, (i & 16) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 32) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        public AccountMenuItemListDto(Integer num, List<AccountMenuItemDto> list, Boolean bool, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.count = num;
            this.items = list;
            this.showMoreHasDot = bool;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    public static final class Deserializer implements a9y<SuperAppWidgetPayloadDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1974402383:
                        if (f.equals("showcase_menu")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetShowcaseMenuDto.class);
                        }
                        break;
                    case -1704846360:
                        if (f.equals("widget_skeleton")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetSkeletonDto.class);
                        }
                        break;
                    case -1503684735:
                        if (f.equals("dock_block")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetDockBlockDto.class);
                        }
                        break;
                    case -1470125187:
                        if (f.equals("assistant_v2")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetAssistantV2Dto.class);
                        }
                        break;
                    case -1420498616:
                        if (f.equals("afisha")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetAfishaDto.class);
                        }
                        break;
                    case -1359418551:
                        if (f.equals("miniapps")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetMiniappsDto.class);
                        }
                        break;
                    case -1354573786:
                        if (f.equals("coupon")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetCouponDto.class);
                        }
                        break;
                    case -1220677729:
                        if (f.equals("horizontal_button_scroll")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetHorizontalButtonScrollDto.class);
                        }
                        break;
                    case -1209078378:
                        if (f.equals("birthdays")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetBirthdaysDto.class);
                        }
                        break;
                    case -1057428150:
                        if (f.equals("universal_informer")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeInformerPayloadDto.class);
                        }
                        break;
                    case -931312831:
                        if (f.equals("universal_scroll")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeScrollPayloadDto.class);
                        }
                        break;
                    case -814967295:
                        if (f.equals("vk_run")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetVkRunDto.class);
                        }
                        break;
                    case -665854415:
                        if (f.equals("universal_internal")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeInternalPayloadDto.class);
                        }
                        break;
                    case -582165438:
                        if (f.equals("greeting_v2")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetGreetingV2Dto.class);
                        }
                        break;
                    case -467688407:
                        if (f.equals("vkpay_slim")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetVkpaySlimDto.class);
                        }
                        break;
                    case -324298207:
                        if (f.equals("delivery_club")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetDeliveryClubDto.class);
                        }
                        break;
                    case -167741222:
                        if (f.equals("universal_table")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeTablePayloadDto.class);
                        }
                        break;
                    case -121513353:
                        if (f.equals("exchange_rates")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetExchangeRatesDto.class);
                        }
                        break;
                    case -58428729:
                        if (f.equals("mini_widgets")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppMiniWidgetsDto.class);
                        }
                        break;
                    case 3347807:
                        if (f.equals("menu")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AccountMenuItemListDto.class);
                        }
                        break;
                    case 98120385:
                        if (f.equals("games")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetGamesDto.class);
                        }
                        break;
                    case 104263205:
                        if (f.equals("music")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetMusicDto.class);
                        }
                        break;
                    case 106940687:
                        if (f.equals(NotificationCompat.CATEGORY_PROMO)) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetPromoDto.class);
                        }
                        break;
                    case 178836950:
                        if (f.equals("informer")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetInformerDto.class);
                        }
                        break;
                    case 205422649:
                        if (f.equals("greeting")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetGreetingDto.class);
                        }
                        break;
                    case 225214472:
                        if (f.equals("universal_counter")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeCounterPayloadDto.class);
                        }
                        break;
                    case 369215871:
                        if (f.equals("universal_placeholder")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypePlaceholderPayloadDto.class);
                        }
                        break;
                    case 505858408:
                        if (f.equals("vk_taxi")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetVkTaxiDto.class);
                        }
                        break;
                    case 582307586:
                        if (f.equals("customizable_menu")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppCustomizableMenuWidgetDto.class);
                        }
                        break;
                    case 1091905624:
                        if (f.equals("holiday")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetHolidayDto.class);
                        }
                        break;
                    case 1223440372:
                        if (f.equals("weather")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetWeatherDto.class);
                        }
                        break;
                    case 1248937906:
                        if (f.equals("ads_easy_promote")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetAdsEasyPromoteDto.class);
                        }
                        break;
                    case 1425957600:
                        if (f.equals("onboarding_panel")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetOnboardingPanelDto.class);
                        }
                        break;
                    case 1429828318:
                        if (f.equals("assistant")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetAssistantDto.class);
                        }
                        break;
                    case 1518103684:
                        if (f.equals("universal_card")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeCardPayloadDto.class);
                        }
                        break;
                    case 1518238906:
                        if (f.equals("universal_grid")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetTypeGridPayloadDto.class);
                        }
                        break;
                    case 1546413605:
                        if (f.equals("covid_dynamic")) {
                            return (SuperAppWidgetPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppWidgetCovidDynamicDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppCustomizableMenuWidgetDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppCustomizableMenuWidgetDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("count")
        private final Integer count;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppCustomMenuItemDto> items;

        @pmi0("show_more_has_dot")
        private final Boolean showMoreHasDot;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppCustomizableMenuWidgetDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppCustomizableMenuWidgetDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppCustomMenuItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SuperAppCustomizableMenuWidgetDto(valueOf2, arrayList, valueOf, parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppCustomizableMenuWidgetDto[] newArray(int i) {
                return new SuperAppCustomizableMenuWidgetDto[i];
            }
        }

        public SuperAppCustomizableMenuWidgetDto() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppCustomizableMenuWidgetDto)) {
                return false;
            }
            SuperAppCustomizableMenuWidgetDto superAppCustomizableMenuWidgetDto = (SuperAppCustomizableMenuWidgetDto) obj;
            return epx.f(this.count, superAppCustomizableMenuWidgetDto.count) && epx.f(this.items, superAppCustomizableMenuWidgetDto.items) && epx.f(this.showMoreHasDot, superAppCustomizableMenuWidgetDto.showMoreHasDot) && epx.f(this.accessibility, superAppCustomizableMenuWidgetDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppCustomizableMenuWidgetDto.additionalHeaderIcon) && this.headerRightType == superAppCustomizableMenuWidgetDto.headerRightType && epx.f(this.weight, superAppCustomizableMenuWidgetDto.weight) && this.type == superAppCustomizableMenuWidgetDto.type;
        }

        public final int hashCode() {
            Integer num = this.count;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            List<SuperAppCustomMenuItemDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.showMoreHasDot;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode4 = (hashCode3 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode7 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppCustomizableMenuWidgetDto(count=");
            sb.append(this.count);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", showMoreHasDot=");
            sb.append(this.showMoreHasDot);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Integer num = this.count;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            List<SuperAppCustomMenuItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppCustomMenuItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            Boolean bool = this.showMoreHasDot;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppCustomizableMenuWidgetDto(Integer num, List list, Boolean bool, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : superAppAccessibilityDto, (i & 16) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 32) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        public SuperAppCustomizableMenuWidgetDto(Integer num, List<SuperAppCustomMenuItemDto> list, Boolean bool, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.count = num;
            this.items = list;
            this.showMoreHasDot = bool;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppMiniWidgetsDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppMiniWidgetsDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppMiniWidgetItemDto> items;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        @pmi0("widget_size")
        private final WidgetSizeDto widgetSize;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class WidgetSizeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ WidgetSizeDto[] $VALUES;

            @pmi0("big")
            public static final WidgetSizeDto BIG;
            public static final Parcelable.Creator<WidgetSizeDto> CREATOR;

            @pmi0("small")
            public static final WidgetSizeDto SMALL;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
            public static final class a implements Parcelable.Creator<WidgetSizeDto> {
                @Override // android.os.Parcelable.Creator
                public final WidgetSizeDto createFromParcel(Parcel parcel) {
                    return WidgetSizeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final WidgetSizeDto[] newArray(int i) {
                    return new WidgetSizeDto[i];
                }
            }

            static {
                WidgetSizeDto widgetSizeDto = new WidgetSizeDto("BIG", 0, "big");
                BIG = widgetSizeDto;
                WidgetSizeDto widgetSizeDto2 = new WidgetSizeDto("SMALL", 1, "small");
                SMALL = widgetSizeDto2;
                WidgetSizeDto[] widgetSizeDtoArr = {widgetSizeDto, widgetSizeDto2};
                $VALUES = widgetSizeDtoArr;
                $ENTRIES = new asp(widgetSizeDtoArr);
                CREATOR = new a();
            }

            private WidgetSizeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static WidgetSizeDto valueOf(String str) {
                return (WidgetSizeDto) Enum.valueOf(WidgetSizeDto.class, str);
            }

            public static WidgetSizeDto[] values() {
                return (WidgetSizeDto[]) $VALUES.clone();
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppMiniWidgetsDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppMiniWidgetsDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                WidgetSizeDto createFromParcel = WidgetSizeDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppMiniWidgetItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppMiniWidgetsDto(createFromParcel, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppMiniWidgetsDto[] newArray(int i) {
                return new SuperAppMiniWidgetsDto[i];
            }
        }

        public /* synthetic */ SuperAppMiniWidgetsDto(WidgetSizeDto widgetSizeDto, List list, String str, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(widgetSizeDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : superAppAccessibilityDto, (i & 16) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 32) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppMiniWidgetsDto)) {
                return false;
            }
            SuperAppMiniWidgetsDto superAppMiniWidgetsDto = (SuperAppMiniWidgetsDto) obj;
            return this.widgetSize == superAppMiniWidgetsDto.widgetSize && epx.f(this.items, superAppMiniWidgetsDto.items) && epx.f(this.trackCode, superAppMiniWidgetsDto.trackCode) && epx.f(this.accessibility, superAppMiniWidgetsDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppMiniWidgetsDto.additionalHeaderIcon) && this.headerRightType == superAppMiniWidgetsDto.headerRightType && epx.f(this.weight, superAppMiniWidgetsDto.weight) && this.type == superAppMiniWidgetsDto.type;
        }

        public final int hashCode() {
            int hashCode = this.widgetSize.hashCode() * 31;
            List<SuperAppMiniWidgetItemDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode4 = (hashCode3 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode7 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppMiniWidgetsDto(widgetSize=");
            sb.append(this.widgetSize);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.widgetSize.writeToParcel(parcel, i);
            List<SuperAppMiniWidgetItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppMiniWidgetItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppMiniWidgetsDto(WidgetSizeDto widgetSizeDto, List<SuperAppMiniWidgetItemDto> list, String str, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.widgetSize = widgetSizeDto;
            this.items = list;
            this.trackCode = str;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeCardPayloadDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeCardPayloadDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("additional_header")
        private final String additionalHeader;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("animation")
        private final SuperAppUniversalWidgetAnimationBlockDto animation;

        @pmi0("footer")
        private final SuperAppUniversalWidgetFooterDto footer;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("header_title")
        private final String headerTitle;

        @pmi0("image")
        private final SuperAppUniversalWidgetImageBlockDto image;

        @pmi0("root_style")
        private final SuperAppUniversalWidgetTypeCardRootStyleDto rootStyle;

        @pmi0("second_subtitle")
        private final SuperAppUniversalWidgetTextBlockDto secondSubtitle;

        @pmi0("state")
        private final String state;

        @pmi0("subtitle")
        private final SuperAppUniversalWidgetTextBlockDto subtitle;

        @pmi0("title")
        private final SuperAppUniversalWidgetTextBlockDto title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("updated_time")
        private final SuperAppUniversalWidgetUpdatedTimeDto updatedTime;

        @pmi0("weight")
        private final Float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("universal_card")
            public static final TypeDto UNIVERSAL_CARD;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("UNIVERSAL_CARD", 0, "universal_card");
                UNIVERSAL_CARD = typeDto;
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeCardPayloadDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeCardPayloadDto createFromParcel(Parcel parcel) {
                SuperAppUniversalWidgetAnimationBlockDto superAppUniversalWidgetAnimationBlockDto;
                SuperAppUniversalWidgetTypeCardRootStyleDto createFromParcel = SuperAppUniversalWidgetTypeCardRootStyleDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto = (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppUniversalWidgetTypeCardPayloadDto.class.getClassLoader());
                ArrayList arrayList = null;
                SuperAppUniversalWidgetAnimationBlockDto createFromParcel2 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAnimationBlockDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetTextBlockDto createFromParcel3 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetTextBlockDto createFromParcel4 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetTextBlockDto createFromParcel5 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypeCardPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto = (SuperAppUniversalWidgetFooterDto) parcel.readParcelable(SuperAppUniversalWidgetTypeCardPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetUpdatedTimeDto createFromParcel6 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetUpdatedTimeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                SuperAppAccessibilityDto createFromParcel7 = parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel);
                Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                TypeDto createFromParcel8 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                SuperAppUniversalWidgetAdditionalHeaderIconDto createFromParcel9 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetHeaderRightTypeDto createFromParcel10 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    superAppUniversalWidgetAnimationBlockDto = createFromParcel2;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    superAppUniversalWidgetAnimationBlockDto = createFromParcel2;
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                        readInt = readInt;
                        createFromParcel = createFromParcel;
                    }
                }
                return new SuperAppUniversalWidgetTypeCardPayloadDto(createFromParcel, superAppUniversalWidgetImageBlockDto, superAppUniversalWidgetAnimationBlockDto, createFromParcel3, createFromParcel4, createFromParcel5, superAppUniversalWidgetActionDto, superAppUniversalWidgetFooterDto, createFromParcel6, readString, createFromParcel7, valueOf, createFromParcel8, readString2, readString3, readString4, createFromParcel9, createFromParcel10, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeCardPayloadDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypeCardPayloadDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypeCardPayloadDto(SuperAppUniversalWidgetTypeCardRootStyleDto superAppUniversalWidgetTypeCardRootStyleDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetAnimationBlockDto superAppUniversalWidgetAnimationBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto3, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List list, int i, zcl zclVar) {
            this(superAppUniversalWidgetTypeCardRootStyleDto, (i & 2) != 0 ? null : superAppUniversalWidgetImageBlockDto, (i & 4) != 0 ? null : superAppUniversalWidgetAnimationBlockDto, (i & 8) != 0 ? null : superAppUniversalWidgetTextBlockDto, (i & 16) != 0 ? null : superAppUniversalWidgetTextBlockDto2, (i & 32) != 0 ? null : superAppUniversalWidgetTextBlockDto3, (i & 64) != 0 ? null : superAppUniversalWidgetActionDto, (i & 128) != 0 ? null : superAppUniversalWidgetFooterDto, (i & 256) != 0 ? null : superAppUniversalWidgetUpdatedTimeDto, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? null : superAppAccessibilityDto, (i & 2048) != 0 ? null : f, (i & 4096) != 0 ? null : typeDto, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : str3, (i & 32768) != 0 ? null : str4, (i & 65536) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 131072) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypeCardPayloadDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypeCardPayloadDto superAppUniversalWidgetTypeCardPayloadDto = (SuperAppUniversalWidgetTypeCardPayloadDto) obj;
            return epx.f(this.rootStyle, superAppUniversalWidgetTypeCardPayloadDto.rootStyle) && epx.f(this.image, superAppUniversalWidgetTypeCardPayloadDto.image) && epx.f(this.animation, superAppUniversalWidgetTypeCardPayloadDto.animation) && epx.f(this.title, superAppUniversalWidgetTypeCardPayloadDto.title) && epx.f(this.subtitle, superAppUniversalWidgetTypeCardPayloadDto.subtitle) && epx.f(this.secondSubtitle, superAppUniversalWidgetTypeCardPayloadDto.secondSubtitle) && epx.f(this.action, superAppUniversalWidgetTypeCardPayloadDto.action) && epx.f(this.footer, superAppUniversalWidgetTypeCardPayloadDto.footer) && epx.f(this.updatedTime, superAppUniversalWidgetTypeCardPayloadDto.updatedTime) && epx.f(this.trackCode, superAppUniversalWidgetTypeCardPayloadDto.trackCode) && epx.f(this.accessibility, superAppUniversalWidgetTypeCardPayloadDto.accessibility) && epx.f(this.weight, superAppUniversalWidgetTypeCardPayloadDto.weight) && this.type == superAppUniversalWidgetTypeCardPayloadDto.type && epx.f(this.state, superAppUniversalWidgetTypeCardPayloadDto.state) && epx.f(this.headerTitle, superAppUniversalWidgetTypeCardPayloadDto.headerTitle) && epx.f(this.additionalHeader, superAppUniversalWidgetTypeCardPayloadDto.additionalHeader) && epx.f(this.additionalHeaderIcon, superAppUniversalWidgetTypeCardPayloadDto.additionalHeaderIcon) && this.headerRightType == superAppUniversalWidgetTypeCardPayloadDto.headerRightType && epx.f(this.headerIcon, superAppUniversalWidgetTypeCardPayloadDto.headerIcon);
        }

        public final int hashCode() {
            int hashCode = this.rootStyle.hashCode() * 31;
            SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto = this.image;
            int hashCode2 = (hashCode + (superAppUniversalWidgetImageBlockDto == null ? 0 : superAppUniversalWidgetImageBlockDto.hashCode())) * 31;
            SuperAppUniversalWidgetAnimationBlockDto superAppUniversalWidgetAnimationBlockDto = this.animation;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetAnimationBlockDto == null ? 0 : superAppUniversalWidgetAnimationBlockDto.hashCode())) * 31;
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetTextBlockDto == null ? 0 : superAppUniversalWidgetTextBlockDto.hashCode())) * 31;
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.subtitle;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetTextBlockDto2 == null ? 0 : superAppUniversalWidgetTextBlockDto2.hashCode())) * 31;
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto3 = this.secondSubtitle;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetTextBlockDto3 == null ? 0 : superAppUniversalWidgetTextBlockDto3.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode7 = (hashCode6 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto = this.footer;
            int hashCode8 = (hashCode7 + (superAppUniversalWidgetFooterDto == null ? 0 : superAppUniversalWidgetFooterDto.hashCode())) * 31;
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            int hashCode9 = (hashCode8 + (superAppUniversalWidgetUpdatedTimeDto == null ? 0 : superAppUniversalWidgetUpdatedTimeDto.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode11 = (hashCode10 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode12 = (hashCode11 + (f == null ? 0 : f.hashCode())) * 31;
            TypeDto typeDto = this.type;
            int hashCode13 = (hashCode12 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            String str2 = this.state;
            int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.headerTitle;
            int hashCode15 = (hashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.additionalHeader;
            int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode17 = (hashCode16 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode18 = (hashCode17 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            return hashCode18 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetTypeCardPayloadDto(rootStyle=");
            sb.append(this.rootStyle);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", animation=");
            sb.append(this.animation);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", secondSubtitle=");
            sb.append(this.secondSubtitle);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", updatedTime=");
            sb.append(this.updatedTime);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", headerTitle=");
            sb.append(this.headerTitle);
            sb.append(", additionalHeader=");
            sb.append(this.additionalHeader);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", headerIcon=");
            return ms9.a(')', sb, this.headerIcon);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.rootStyle.writeToParcel(parcel, i);
            parcel.writeParcelable(this.image, i);
            SuperAppUniversalWidgetAnimationBlockDto superAppUniversalWidgetAnimationBlockDto = this.animation;
            if (superAppUniversalWidgetAnimationBlockDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAnimationBlockDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
            if (superAppUniversalWidgetTextBlockDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetTextBlockDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.subtitle;
            if (superAppUniversalWidgetTextBlockDto2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetTextBlockDto2.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto3 = this.secondSubtitle;
            if (superAppUniversalWidgetTextBlockDto3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetTextBlockDto3.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.footer, i);
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            if (superAppUniversalWidgetUpdatedTimeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetUpdatedTimeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            Float f = this.weight;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.state);
            parcel.writeString(this.headerTitle);
            parcel.writeString(this.additionalHeader);
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f2 = dn.f(parcel, list, 1);
            while (f2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetTypeCardPayloadDto(SuperAppUniversalWidgetTypeCardRootStyleDto superAppUniversalWidgetTypeCardRootStyleDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetAnimationBlockDto superAppUniversalWidgetAnimationBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto3, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List<SuperAppUniversalWidgetImageItemDto> list) {
            super(null);
            this.rootStyle = superAppUniversalWidgetTypeCardRootStyleDto;
            this.image = superAppUniversalWidgetImageBlockDto;
            this.animation = superAppUniversalWidgetAnimationBlockDto;
            this.title = superAppUniversalWidgetTextBlockDto;
            this.subtitle = superAppUniversalWidgetTextBlockDto2;
            this.secondSubtitle = superAppUniversalWidgetTextBlockDto3;
            this.action = superAppUniversalWidgetActionDto;
            this.footer = superAppUniversalWidgetFooterDto;
            this.updatedTime = superAppUniversalWidgetUpdatedTimeDto;
            this.trackCode = str;
            this.accessibility = superAppAccessibilityDto;
            this.weight = f;
            this.type = typeDto;
            this.state = str2;
            this.headerTitle = str3;
            this.additionalHeader = str4;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.headerIcon = list;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeCounterPayloadDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeCounterPayloadDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("additional_header")
        private final String additionalHeader;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("footer")
        private final SuperAppUniversalWidgetFooterDto footer;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("header_title")
        private final String headerTitle;

        @pmi0("items")
        private final List<SuperAppUniversalWidgetTypeCounterItemDto> items;

        @pmi0("root_style")
        private final SuperAppUniversalWidgetTypeCounterRootStyleDto rootStyle;

        @pmi0("state")
        private final String state;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("updated_time")
        private final SuperAppUniversalWidgetUpdatedTimeDto updatedTime;

        @pmi0("weight")
        private final Float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("universal_counter")
            public static final TypeDto UNIVERSAL_COUNTER;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("UNIVERSAL_COUNTER", 0, "universal_counter");
                UNIVERSAL_COUNTER = typeDto;
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeCounterPayloadDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeCounterPayloadDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto;
                SuperAppUniversalWidgetTypeCounterRootStyleDto superAppUniversalWidgetTypeCounterRootStyleDto;
                ArrayList arrayList2;
                SuperAppUniversalWidgetTypeCounterRootStyleDto createFromParcel = SuperAppUniversalWidgetTypeCounterRootStyleDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppUniversalWidgetTypeCounterItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypeCounterPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto2 = (SuperAppUniversalWidgetFooterDto) parcel.readParcelable(SuperAppUniversalWidgetTypeCounterPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetUpdatedTimeDto createFromParcel2 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetUpdatedTimeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                SuperAppAccessibilityDto createFromParcel3 = parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel);
                Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                TypeDto createFromParcel4 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
                Float f = valueOf;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = null;
                String readString4 = parcel.readString();
                SuperAppUniversalWidgetAdditionalHeaderIconDto createFromParcel5 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    superAppUniversalWidgetHeaderRightTypeDto = SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel);
                }
                SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto2 = superAppUniversalWidgetHeaderRightTypeDto;
                if (parcel.readInt() == 0) {
                    superAppUniversalWidgetFooterDto = superAppUniversalWidgetFooterDto2;
                    superAppUniversalWidgetTypeCounterRootStyleDto = createFromParcel;
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    superAppUniversalWidgetFooterDto = superAppUniversalWidgetFooterDto2;
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    superAppUniversalWidgetTypeCounterRootStyleDto = createFromParcel;
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList3, i2, 1);
                        readInt2 = readInt2;
                        createFromParcel5 = createFromParcel5;
                    }
                    arrayList2 = arrayList3;
                }
                return new SuperAppUniversalWidgetTypeCounterPayloadDto(superAppUniversalWidgetTypeCounterRootStyleDto, arrayList, superAppUniversalWidgetActionDto, superAppUniversalWidgetFooterDto, createFromParcel2, readString, createFromParcel3, f, createFromParcel4, readString2, readString3, readString4, createFromParcel5, superAppUniversalWidgetHeaderRightTypeDto2, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeCounterPayloadDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypeCounterPayloadDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypeCounterPayloadDto(SuperAppUniversalWidgetTypeCounterRootStyleDto superAppUniversalWidgetTypeCounterRootStyleDto, List list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List list2, int i, zcl zclVar) {
            this(superAppUniversalWidgetTypeCounterRootStyleDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : superAppUniversalWidgetActionDto, (i & 8) != 0 ? null : superAppUniversalWidgetFooterDto, (i & 16) != 0 ? null : superAppUniversalWidgetUpdatedTimeDto, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : superAppAccessibilityDto, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : typeDto, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 8192) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 16384) != 0 ? null : list2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypeCounterPayloadDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypeCounterPayloadDto superAppUniversalWidgetTypeCounterPayloadDto = (SuperAppUniversalWidgetTypeCounterPayloadDto) obj;
            return epx.f(this.rootStyle, superAppUniversalWidgetTypeCounterPayloadDto.rootStyle) && epx.f(this.items, superAppUniversalWidgetTypeCounterPayloadDto.items) && epx.f(this.action, superAppUniversalWidgetTypeCounterPayloadDto.action) && epx.f(this.footer, superAppUniversalWidgetTypeCounterPayloadDto.footer) && epx.f(this.updatedTime, superAppUniversalWidgetTypeCounterPayloadDto.updatedTime) && epx.f(this.trackCode, superAppUniversalWidgetTypeCounterPayloadDto.trackCode) && epx.f(this.accessibility, superAppUniversalWidgetTypeCounterPayloadDto.accessibility) && epx.f(this.weight, superAppUniversalWidgetTypeCounterPayloadDto.weight) && this.type == superAppUniversalWidgetTypeCounterPayloadDto.type && epx.f(this.state, superAppUniversalWidgetTypeCounterPayloadDto.state) && epx.f(this.headerTitle, superAppUniversalWidgetTypeCounterPayloadDto.headerTitle) && epx.f(this.additionalHeader, superAppUniversalWidgetTypeCounterPayloadDto.additionalHeader) && epx.f(this.additionalHeaderIcon, superAppUniversalWidgetTypeCounterPayloadDto.additionalHeaderIcon) && this.headerRightType == superAppUniversalWidgetTypeCounterPayloadDto.headerRightType && epx.f(this.headerIcon, superAppUniversalWidgetTypeCounterPayloadDto.headerIcon);
        }

        public final int hashCode() {
            int hashCode = this.rootStyle.hashCode() * 31;
            List<SuperAppUniversalWidgetTypeCounterItemDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto = this.footer;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetFooterDto == null ? 0 : superAppUniversalWidgetFooterDto.hashCode())) * 31;
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetUpdatedTimeDto == null ? 0 : superAppUniversalWidgetUpdatedTimeDto.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode7 = (hashCode6 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            TypeDto typeDto = this.type;
            int hashCode9 = (hashCode8 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            String str2 = this.state;
            int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.headerTitle;
            int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.additionalHeader;
            int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode13 = (hashCode12 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode14 = (hashCode13 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
            return hashCode14 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetTypeCounterPayloadDto(rootStyle=");
            sb.append(this.rootStyle);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", updatedTime=");
            sb.append(this.updatedTime);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", headerTitle=");
            sb.append(this.headerTitle);
            sb.append(", additionalHeader=");
            sb.append(this.additionalHeader);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", headerIcon=");
            return ms9.a(')', sb, this.headerIcon);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.rootStyle.writeToParcel(parcel, i);
            List<SuperAppUniversalWidgetTypeCounterItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetTypeCounterItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.footer, i);
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            if (superAppUniversalWidgetUpdatedTimeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetUpdatedTimeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.state);
            parcel.writeString(this.headerTitle);
            parcel.writeString(this.additionalHeader);
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f3 = dn.f(parcel, list2, 1);
            while (f3.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) f3.next()).writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetTypeCounterPayloadDto(SuperAppUniversalWidgetTypeCounterRootStyleDto superAppUniversalWidgetTypeCounterRootStyleDto, List<SuperAppUniversalWidgetTypeCounterItemDto> list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List<SuperAppUniversalWidgetImageItemDto> list2) {
            super(null);
            this.rootStyle = superAppUniversalWidgetTypeCounterRootStyleDto;
            this.items = list;
            this.action = superAppUniversalWidgetActionDto;
            this.footer = superAppUniversalWidgetFooterDto;
            this.updatedTime = superAppUniversalWidgetUpdatedTimeDto;
            this.trackCode = str;
            this.accessibility = superAppAccessibilityDto;
            this.weight = f;
            this.type = typeDto;
            this.state = str2;
            this.headerTitle = str3;
            this.additionalHeader = str4;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.headerIcon = list2;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeGridPayloadDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeGridPayloadDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("additional_header")
        private final String additionalHeader;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("footer")
        private final SuperAppUniversalWidgetFooterDto footer;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("header_title")
        private final String headerTitle;

        @pmi0("items")
        private final List<SuperAppUniversalWidgetImageBlockDto> items;

        @pmi0("root_style")
        private final SuperAppUniversalWidgetTypeGridRootStyleDto rootStyle;

        @pmi0("state")
        private final String state;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("updated_time")
        private final SuperAppUniversalWidgetUpdatedTimeDto updatedTime;

        @pmi0("weight")
        private final Float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("universal_grid")
            public static final TypeDto UNIVERSAL_GRID;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("UNIVERSAL_GRID", 0, "universal_grid");
                UNIVERSAL_GRID = typeDto;
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeGridPayloadDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeGridPayloadDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto;
                SuperAppUniversalWidgetTypeGridRootStyleDto superAppUniversalWidgetTypeGridRootStyleDto;
                ArrayList arrayList2;
                SuperAppUniversalWidgetTypeGridRootStyleDto createFromParcel = SuperAppUniversalWidgetTypeGridRootStyleDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(SuperAppUniversalWidgetTypeGridPayloadDto.class, parcel, arrayList, i, 1);
                    }
                }
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto2 = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypeGridPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto = (SuperAppUniversalWidgetFooterDto) parcel.readParcelable(SuperAppUniversalWidgetTypeGridPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetUpdatedTimeDto createFromParcel2 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetUpdatedTimeDto.CREATOR.createFromParcel(parcel);
                ArrayList arrayList3 = arrayList;
                String readString = parcel.readString();
                SuperAppAccessibilityDto createFromParcel3 = parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel);
                Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                TypeDto createFromParcel4 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
                Float f = valueOf;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                SuperAppUniversalWidgetAdditionalHeaderIconDto createFromParcel5 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetHeaderRightTypeDto createFromParcel6 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    superAppUniversalWidgetActionDto = superAppUniversalWidgetActionDto2;
                    superAppUniversalWidgetTypeGridRootStyleDto = createFromParcel;
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    superAppUniversalWidgetActionDto = superAppUniversalWidgetActionDto2;
                    ArrayList arrayList4 = new ArrayList(readInt2);
                    superAppUniversalWidgetTypeGridRootStyleDto = createFromParcel;
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList4, i2, 1);
                        readInt2 = readInt2;
                        arrayList3 = arrayList3;
                    }
                    arrayList2 = arrayList4;
                }
                return new SuperAppUniversalWidgetTypeGridPayloadDto(superAppUniversalWidgetTypeGridRootStyleDto, arrayList3, superAppUniversalWidgetActionDto, superAppUniversalWidgetFooterDto, createFromParcel2, readString, createFromParcel3, f, createFromParcel4, readString2, readString3, readString4, createFromParcel5, createFromParcel6, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeGridPayloadDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypeGridPayloadDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypeGridPayloadDto(SuperAppUniversalWidgetTypeGridRootStyleDto superAppUniversalWidgetTypeGridRootStyleDto, List list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List list2, int i, zcl zclVar) {
            this(superAppUniversalWidgetTypeGridRootStyleDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : superAppUniversalWidgetActionDto, (i & 8) != 0 ? null : superAppUniversalWidgetFooterDto, (i & 16) != 0 ? null : superAppUniversalWidgetUpdatedTimeDto, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : superAppAccessibilityDto, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : typeDto, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 8192) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 16384) != 0 ? null : list2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypeGridPayloadDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypeGridPayloadDto superAppUniversalWidgetTypeGridPayloadDto = (SuperAppUniversalWidgetTypeGridPayloadDto) obj;
            return epx.f(this.rootStyle, superAppUniversalWidgetTypeGridPayloadDto.rootStyle) && epx.f(this.items, superAppUniversalWidgetTypeGridPayloadDto.items) && epx.f(this.action, superAppUniversalWidgetTypeGridPayloadDto.action) && epx.f(this.footer, superAppUniversalWidgetTypeGridPayloadDto.footer) && epx.f(this.updatedTime, superAppUniversalWidgetTypeGridPayloadDto.updatedTime) && epx.f(this.trackCode, superAppUniversalWidgetTypeGridPayloadDto.trackCode) && epx.f(this.accessibility, superAppUniversalWidgetTypeGridPayloadDto.accessibility) && epx.f(this.weight, superAppUniversalWidgetTypeGridPayloadDto.weight) && this.type == superAppUniversalWidgetTypeGridPayloadDto.type && epx.f(this.state, superAppUniversalWidgetTypeGridPayloadDto.state) && epx.f(this.headerTitle, superAppUniversalWidgetTypeGridPayloadDto.headerTitle) && epx.f(this.additionalHeader, superAppUniversalWidgetTypeGridPayloadDto.additionalHeader) && epx.f(this.additionalHeaderIcon, superAppUniversalWidgetTypeGridPayloadDto.additionalHeaderIcon) && this.headerRightType == superAppUniversalWidgetTypeGridPayloadDto.headerRightType && epx.f(this.headerIcon, superAppUniversalWidgetTypeGridPayloadDto.headerIcon);
        }

        public final int hashCode() {
            int hashCode = this.rootStyle.hashCode() * 31;
            List<SuperAppUniversalWidgetImageBlockDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto = this.footer;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetFooterDto == null ? 0 : superAppUniversalWidgetFooterDto.hashCode())) * 31;
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetUpdatedTimeDto == null ? 0 : superAppUniversalWidgetUpdatedTimeDto.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode7 = (hashCode6 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            TypeDto typeDto = this.type;
            int hashCode9 = (hashCode8 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            String str2 = this.state;
            int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.headerTitle;
            int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.additionalHeader;
            int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode13 = (hashCode12 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode14 = (hashCode13 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
            return hashCode14 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetTypeGridPayloadDto(rootStyle=");
            sb.append(this.rootStyle);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", updatedTime=");
            sb.append(this.updatedTime);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", headerTitle=");
            sb.append(this.headerTitle);
            sb.append(", additionalHeader=");
            sb.append(this.additionalHeader);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", headerIcon=");
            return ms9.a(')', sb, this.headerIcon);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.rootStyle.writeToParcel(parcel, i);
            List<SuperAppUniversalWidgetImageBlockDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.footer, i);
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            if (superAppUniversalWidgetUpdatedTimeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetUpdatedTimeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.state);
            parcel.writeString(this.headerTitle);
            parcel.writeString(this.additionalHeader);
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f3 = dn.f(parcel, list2, 1);
            while (f3.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) f3.next()).writeToParcel(parcel, i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppUniversalWidgetTypeGridPayloadDto(SuperAppUniversalWidgetTypeGridRootStyleDto superAppUniversalWidgetTypeGridRootStyleDto, List<? extends SuperAppUniversalWidgetImageBlockDto> list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List<SuperAppUniversalWidgetImageItemDto> list2) {
            super(null);
            this.rootStyle = superAppUniversalWidgetTypeGridRootStyleDto;
            this.items = list;
            this.action = superAppUniversalWidgetActionDto;
            this.footer = superAppUniversalWidgetFooterDto;
            this.updatedTime = superAppUniversalWidgetUpdatedTimeDto;
            this.trackCode = str;
            this.accessibility = superAppAccessibilityDto;
            this.weight = f;
            this.type = typeDto;
            this.state = str2;
            this.headerTitle = str3;
            this.additionalHeader = str4;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.headerIcon = list2;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeInformerPayloadDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerPayloadDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("additional_header")
        private final String additionalHeader;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("footer")
        private final SuperAppUniversalWidgetFooterDto footer;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("header_title")
        private final String headerTitle;

        @pmi0("root_style")
        private final List<SuperAppUniversalWidgetTypeInformerRootStyleRowDto> rootStyle;

        @pmi0("rows")
        private final List<SuperAppUniversalWidgetTypeInformerRowDto> rows;

        @pmi0("state")
        private final String state;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("updated_time")
        private final SuperAppUniversalWidgetUpdatedTimeDto updatedTime;

        @pmi0("weight")
        private final Float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("universal_informer")
            public static final TypeDto UNIVERSAL_INFORMER;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("UNIVERSAL_INFORMER", 0, "universal_informer");
                UNIVERSAL_INFORMER = typeDto;
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerPayloadDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInformerPayloadDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto;
                SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto;
                ArrayList arrayList2;
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetTypeInformerRootStyleRowDto.CREATOR, parcel, arrayList3, i, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = en.a(SuperAppUniversalWidgetTypeInformerRowDto.CREATOR, parcel, arrayList, i2, 1);
                    }
                }
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypeInformerPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto2 = (SuperAppUniversalWidgetFooterDto) parcel.readParcelable(SuperAppUniversalWidgetTypeInformerPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetUpdatedTimeDto createFromParcel = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetUpdatedTimeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                SuperAppAccessibilityDto createFromParcel2 = parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel);
                Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                TypeDto createFromParcel3 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
                Float f = valueOf;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                SuperAppUniversalWidgetAdditionalHeaderIconDto createFromParcel4 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetHeaderRightTypeDto createFromParcel5 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    superAppUniversalWidgetFooterDto = superAppUniversalWidgetFooterDto2;
                    superAppUniversalWidgetAdditionalHeaderIconDto = createFromParcel4;
                    arrayList2 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    superAppUniversalWidgetFooterDto = superAppUniversalWidgetFooterDto2;
                    ArrayList arrayList4 = new ArrayList(readInt3);
                    superAppUniversalWidgetAdditionalHeaderIconDto = createFromParcel4;
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList4, i3, 1);
                        arrayList3 = arrayList3;
                        createFromParcel5 = createFromParcel5;
                    }
                    arrayList2 = arrayList4;
                }
                return new SuperAppUniversalWidgetTypeInformerPayloadDto(arrayList3, arrayList, superAppUniversalWidgetActionDto, superAppUniversalWidgetFooterDto, createFromParcel, readString, createFromParcel2, f, createFromParcel3, readString2, readString3, readString4, superAppUniversalWidgetAdditionalHeaderIconDto, createFromParcel5, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInformerPayloadDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypeInformerPayloadDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypeInformerPayloadDto(List list, List list2, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List list3, int i, zcl zclVar) {
            this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : superAppUniversalWidgetActionDto, (i & 8) != 0 ? null : superAppUniversalWidgetFooterDto, (i & 16) != 0 ? null : superAppUniversalWidgetUpdatedTimeDto, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : superAppAccessibilityDto, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : typeDto, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 8192) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 16384) != 0 ? null : list3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypeInformerPayloadDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypeInformerPayloadDto superAppUniversalWidgetTypeInformerPayloadDto = (SuperAppUniversalWidgetTypeInformerPayloadDto) obj;
            return epx.f(this.rootStyle, superAppUniversalWidgetTypeInformerPayloadDto.rootStyle) && epx.f(this.rows, superAppUniversalWidgetTypeInformerPayloadDto.rows) && epx.f(this.action, superAppUniversalWidgetTypeInformerPayloadDto.action) && epx.f(this.footer, superAppUniversalWidgetTypeInformerPayloadDto.footer) && epx.f(this.updatedTime, superAppUniversalWidgetTypeInformerPayloadDto.updatedTime) && epx.f(this.trackCode, superAppUniversalWidgetTypeInformerPayloadDto.trackCode) && epx.f(this.accessibility, superAppUniversalWidgetTypeInformerPayloadDto.accessibility) && epx.f(this.weight, superAppUniversalWidgetTypeInformerPayloadDto.weight) && this.type == superAppUniversalWidgetTypeInformerPayloadDto.type && epx.f(this.state, superAppUniversalWidgetTypeInformerPayloadDto.state) && epx.f(this.headerTitle, superAppUniversalWidgetTypeInformerPayloadDto.headerTitle) && epx.f(this.additionalHeader, superAppUniversalWidgetTypeInformerPayloadDto.additionalHeader) && epx.f(this.additionalHeaderIcon, superAppUniversalWidgetTypeInformerPayloadDto.additionalHeaderIcon) && this.headerRightType == superAppUniversalWidgetTypeInformerPayloadDto.headerRightType && epx.f(this.headerIcon, superAppUniversalWidgetTypeInformerPayloadDto.headerIcon);
        }

        public final int hashCode() {
            int hashCode = this.rootStyle.hashCode() * 31;
            List<SuperAppUniversalWidgetTypeInformerRowDto> list = this.rows;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto = this.footer;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetFooterDto == null ? 0 : superAppUniversalWidgetFooterDto.hashCode())) * 31;
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetUpdatedTimeDto == null ? 0 : superAppUniversalWidgetUpdatedTimeDto.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode7 = (hashCode6 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            TypeDto typeDto = this.type;
            int hashCode9 = (hashCode8 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            String str2 = this.state;
            int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.headerTitle;
            int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.additionalHeader;
            int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode13 = (hashCode12 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode14 = (hashCode13 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
            return hashCode14 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetTypeInformerPayloadDto(rootStyle=");
            sb.append(this.rootStyle);
            sb.append(", rows=");
            sb.append(this.rows);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", updatedTime=");
            sb.append(this.updatedTime);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", headerTitle=");
            sb.append(this.headerTitle);
            sb.append(", additionalHeader=");
            sb.append(this.additionalHeader);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", headerIcon=");
            return ms9.a(')', sb, this.headerIcon);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.rootStyle);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetTypeInformerRootStyleRowDto) a2.next()).writeToParcel(parcel, i);
            }
            List<SuperAppUniversalWidgetTypeInformerRowDto> list = this.rows;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetTypeInformerRowDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.footer, i);
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            if (superAppUniversalWidgetUpdatedTimeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetUpdatedTimeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.state);
            parcel.writeString(this.headerTitle);
            parcel.writeString(this.additionalHeader);
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f3 = dn.f(parcel, list2, 1);
            while (f3.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) f3.next()).writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetTypeInformerPayloadDto(List<SuperAppUniversalWidgetTypeInformerRootStyleRowDto> list, List<SuperAppUniversalWidgetTypeInformerRowDto> list2, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List<SuperAppUniversalWidgetImageItemDto> list3) {
            super(null);
            this.rootStyle = list;
            this.rows = list2;
            this.action = superAppUniversalWidgetActionDto;
            this.footer = superAppUniversalWidgetFooterDto;
            this.updatedTime = superAppUniversalWidgetUpdatedTimeDto;
            this.trackCode = str;
            this.accessibility = superAppAccessibilityDto;
            this.weight = f;
            this.type = typeDto;
            this.state = str2;
            this.headerTitle = str3;
            this.additionalHeader = str4;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.headerIcon = list3;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeInternalPayloadDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInternalPayloadDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("root_style")
        private final SuperAppUniversalWidgetTypeInternalRootStyleDto rootStyle;

        @pmi0("state")
        private final String state;

        @pmi0("subtitle")
        private final SuperAppUniversalWidgetTextBlockDto subtitle;

        @pmi0("title")
        private final SuperAppUniversalWidgetTextBlockDto title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("updated_time")
        private final SuperAppUniversalWidgetUpdatedTimeDto updatedTime;

        @pmi0("weight")
        private final Float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("universal_internal")
            public static final TypeDto UNIVERSAL_INTERNAL;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("UNIVERSAL_INTERNAL", 0, "universal_internal");
                UNIVERSAL_INTERNAL = typeDto;
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInternalPayloadDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInternalPayloadDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                SuperAppUniversalWidgetTypeInternalRootStyleDto createFromParcel = SuperAppUniversalWidgetTypeInternalRootStyleDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppUniversalWidgetTypeInternalPayloadDto(createFromParcel, arrayList, parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypeInternalPayloadDto.class.getClassLoader()), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetUpdatedTimeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeInternalPayloadDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypeInternalPayloadDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypeInternalPayloadDto(SuperAppUniversalWidgetTypeInternalRootStyleDto superAppUniversalWidgetTypeInternalRootStyleDto, List list, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, Float f, TypeDto typeDto, String str, String str2, SuperAppAccessibilityDto superAppAccessibilityDto, int i, zcl zclVar) {
            this(superAppUniversalWidgetTypeInternalRootStyleDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 8) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 16) != 0 ? null : superAppUniversalWidgetTextBlockDto, (i & 32) != 0 ? null : superAppUniversalWidgetTextBlockDto2, (i & 64) != 0 ? null : superAppUniversalWidgetActionDto, (i & 128) != 0 ? null : superAppUniversalWidgetUpdatedTimeDto, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : typeDto, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? null : str2, (i & 4096) != 0 ? null : superAppAccessibilityDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypeInternalPayloadDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypeInternalPayloadDto superAppUniversalWidgetTypeInternalPayloadDto = (SuperAppUniversalWidgetTypeInternalPayloadDto) obj;
            return epx.f(this.rootStyle, superAppUniversalWidgetTypeInternalPayloadDto.rootStyle) && epx.f(this.headerIcon, superAppUniversalWidgetTypeInternalPayloadDto.headerIcon) && epx.f(this.additionalHeaderIcon, superAppUniversalWidgetTypeInternalPayloadDto.additionalHeaderIcon) && this.headerRightType == superAppUniversalWidgetTypeInternalPayloadDto.headerRightType && epx.f(this.title, superAppUniversalWidgetTypeInternalPayloadDto.title) && epx.f(this.subtitle, superAppUniversalWidgetTypeInternalPayloadDto.subtitle) && epx.f(this.action, superAppUniversalWidgetTypeInternalPayloadDto.action) && epx.f(this.updatedTime, superAppUniversalWidgetTypeInternalPayloadDto.updatedTime) && epx.f(this.weight, superAppUniversalWidgetTypeInternalPayloadDto.weight) && this.type == superAppUniversalWidgetTypeInternalPayloadDto.type && epx.f(this.state, superAppUniversalWidgetTypeInternalPayloadDto.state) && epx.f(this.trackCode, superAppUniversalWidgetTypeInternalPayloadDto.trackCode) && epx.f(this.accessibility, superAppUniversalWidgetTypeInternalPayloadDto.accessibility);
        }

        public final int hashCode() {
            int hashCode = this.rootStyle.hashCode() * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetTextBlockDto == null ? 0 : superAppUniversalWidgetTextBlockDto.hashCode())) * 31;
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.subtitle;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetTextBlockDto2 == null ? 0 : superAppUniversalWidgetTextBlockDto2.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode7 = (hashCode6 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            int hashCode8 = (hashCode7 + (superAppUniversalWidgetUpdatedTimeDto == null ? 0 : superAppUniversalWidgetUpdatedTimeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            TypeDto typeDto = this.type;
            int hashCode10 = (hashCode9 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            String str = this.state;
            int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            return hashCode12 + (superAppAccessibilityDto != null ? superAppAccessibilityDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppUniversalWidgetTypeInternalPayloadDto(rootStyle=" + this.rootStyle + ", headerIcon=" + this.headerIcon + ", additionalHeaderIcon=" + this.additionalHeaderIcon + ", headerRightType=" + this.headerRightType + ", title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ", updatedTime=" + this.updatedTime + ", weight=" + this.weight + ", type=" + this.type + ", state=" + this.state + ", trackCode=" + this.trackCode + ", accessibility=" + this.accessibility + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.rootStyle.writeToParcel(parcel, i);
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
            if (superAppUniversalWidgetTextBlockDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetTextBlockDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.subtitle;
            if (superAppUniversalWidgetTextBlockDto2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetTextBlockDto2.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.action, i);
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            if (superAppUniversalWidgetUpdatedTimeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetUpdatedTimeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.state);
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetTypeInternalPayloadDto(SuperAppUniversalWidgetTypeInternalRootStyleDto superAppUniversalWidgetTypeInternalRootStyleDto, List<SuperAppUniversalWidgetImageItemDto> list, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, Float f, TypeDto typeDto, String str, String str2, SuperAppAccessibilityDto superAppAccessibilityDto) {
            super(null);
            this.rootStyle = superAppUniversalWidgetTypeInternalRootStyleDto;
            this.headerIcon = list;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.title = superAppUniversalWidgetTextBlockDto;
            this.subtitle = superAppUniversalWidgetTextBlockDto2;
            this.action = superAppUniversalWidgetActionDto;
            this.updatedTime = superAppUniversalWidgetUpdatedTimeDto;
            this.weight = f;
            this.type = typeDto;
            this.state = str;
            this.trackCode = str2;
            this.accessibility = superAppAccessibilityDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypePlaceholderPayloadDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypePlaceholderPayloadDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("additional_header")
        private final String additionalHeader;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("button")
        private final SuperAppUniversalWidgetButtonDto button;

        @pmi0("footer")
        private final SuperAppUniversalWidgetFooterDto footer;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("header_title")
        private final String headerTitle;

        @pmi0("root_style")
        private final SuperAppUniversalWidgetTypePlaceholderRootStyleDto rootStyle;

        @pmi0("state")
        private final String state;

        @pmi0("title")
        private final SuperAppUniversalWidgetTextBlockDto title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("updated_time")
        private final SuperAppUniversalWidgetUpdatedTimeDto updatedTime;

        @pmi0("weight")
        private final Float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("universal_placeholder")
            public static final TypeDto UNIVERSAL_PLACEHOLDER;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("UNIVERSAL_PLACEHOLDER", 0, "universal_placeholder");
                UNIVERSAL_PLACEHOLDER = typeDto;
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypePlaceholderPayloadDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypePlaceholderPayloadDto createFromParcel(Parcel parcel) {
                SuperAppUniversalWidgetTypePlaceholderRootStyleDto superAppUniversalWidgetTypePlaceholderRootStyleDto;
                SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto;
                ArrayList arrayList;
                SuperAppUniversalWidgetTypePlaceholderRootStyleDto createFromParcel = SuperAppUniversalWidgetTypePlaceholderRootStyleDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetTextBlockDto createFromParcel2 = SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetButtonDto createFromParcel3 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetButtonDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypePlaceholderPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto = (SuperAppUniversalWidgetFooterDto) parcel.readParcelable(SuperAppUniversalWidgetTypePlaceholderPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetUpdatedTimeDto createFromParcel4 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetUpdatedTimeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                SuperAppAccessibilityDto createFromParcel5 = parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel);
                Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                TypeDto createFromParcel6 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                SuperAppUniversalWidgetAdditionalHeaderIconDto createFromParcel7 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetHeaderRightTypeDto createFromParcel8 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    superAppUniversalWidgetTypePlaceholderRootStyleDto = createFromParcel;
                    arrayList = null;
                    superAppUniversalWidgetTextBlockDto = createFromParcel2;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    superAppUniversalWidgetTypePlaceholderRootStyleDto = createFromParcel;
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList2, i, 1);
                        readInt = readInt;
                        createFromParcel2 = createFromParcel2;
                    }
                    superAppUniversalWidgetTextBlockDto = createFromParcel2;
                    arrayList = arrayList2;
                }
                return new SuperAppUniversalWidgetTypePlaceholderPayloadDto(superAppUniversalWidgetTypePlaceholderRootStyleDto, superAppUniversalWidgetTextBlockDto, createFromParcel3, superAppUniversalWidgetActionDto, superAppUniversalWidgetFooterDto, createFromParcel4, readString, createFromParcel5, valueOf, createFromParcel6, readString2, readString3, readString4, createFromParcel7, createFromParcel8, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypePlaceholderPayloadDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypePlaceholderPayloadDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypePlaceholderPayloadDto(SuperAppUniversalWidgetTypePlaceholderRootStyleDto superAppUniversalWidgetTypePlaceholderRootStyleDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List list, int i, zcl zclVar) {
            this(superAppUniversalWidgetTypePlaceholderRootStyleDto, superAppUniversalWidgetTextBlockDto, (i & 4) != 0 ? null : superAppUniversalWidgetButtonDto, (i & 8) != 0 ? null : superAppUniversalWidgetActionDto, (i & 16) != 0 ? null : superAppUniversalWidgetFooterDto, (i & 32) != 0 ? null : superAppUniversalWidgetUpdatedTimeDto, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : superAppAccessibilityDto, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : typeDto, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 16384) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 32768) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypePlaceholderPayloadDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypePlaceholderPayloadDto superAppUniversalWidgetTypePlaceholderPayloadDto = (SuperAppUniversalWidgetTypePlaceholderPayloadDto) obj;
            return epx.f(this.rootStyle, superAppUniversalWidgetTypePlaceholderPayloadDto.rootStyle) && epx.f(this.title, superAppUniversalWidgetTypePlaceholderPayloadDto.title) && epx.f(this.button, superAppUniversalWidgetTypePlaceholderPayloadDto.button) && epx.f(this.action, superAppUniversalWidgetTypePlaceholderPayloadDto.action) && epx.f(this.footer, superAppUniversalWidgetTypePlaceholderPayloadDto.footer) && epx.f(this.updatedTime, superAppUniversalWidgetTypePlaceholderPayloadDto.updatedTime) && epx.f(this.trackCode, superAppUniversalWidgetTypePlaceholderPayloadDto.trackCode) && epx.f(this.accessibility, superAppUniversalWidgetTypePlaceholderPayloadDto.accessibility) && epx.f(this.weight, superAppUniversalWidgetTypePlaceholderPayloadDto.weight) && this.type == superAppUniversalWidgetTypePlaceholderPayloadDto.type && epx.f(this.state, superAppUniversalWidgetTypePlaceholderPayloadDto.state) && epx.f(this.headerTitle, superAppUniversalWidgetTypePlaceholderPayloadDto.headerTitle) && epx.f(this.additionalHeader, superAppUniversalWidgetTypePlaceholderPayloadDto.additionalHeader) && epx.f(this.additionalHeaderIcon, superAppUniversalWidgetTypePlaceholderPayloadDto.additionalHeaderIcon) && this.headerRightType == superAppUniversalWidgetTypePlaceholderPayloadDto.headerRightType && epx.f(this.headerIcon, superAppUniversalWidgetTypePlaceholderPayloadDto.headerIcon);
        }

        public final int hashCode() {
            int hashCode = (this.title.hashCode() + (this.rootStyle.hashCode() * 31)) * 31;
            SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto = this.button;
            int hashCode2 = (hashCode + (superAppUniversalWidgetButtonDto == null ? 0 : superAppUniversalWidgetButtonDto.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto = this.footer;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetFooterDto == null ? 0 : superAppUniversalWidgetFooterDto.hashCode())) * 31;
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetUpdatedTimeDto == null ? 0 : superAppUniversalWidgetUpdatedTimeDto.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode7 = (hashCode6 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            TypeDto typeDto = this.type;
            int hashCode9 = (hashCode8 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            String str2 = this.state;
            int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.headerTitle;
            int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.additionalHeader;
            int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode13 = (hashCode12 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode14 = (hashCode13 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            return hashCode14 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetTypePlaceholderPayloadDto(rootStyle=");
            sb.append(this.rootStyle);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", updatedTime=");
            sb.append(this.updatedTime);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", headerTitle=");
            sb.append(this.headerTitle);
            sb.append(", additionalHeader=");
            sb.append(this.additionalHeader);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", headerIcon=");
            return ms9.a(')', sb, this.headerIcon);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.rootStyle.writeToParcel(parcel, i);
            this.title.writeToParcel(parcel, i);
            SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto = this.button;
            if (superAppUniversalWidgetButtonDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetButtonDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.footer, i);
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            if (superAppUniversalWidgetUpdatedTimeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetUpdatedTimeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            Float f = this.weight;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.state);
            parcel.writeString(this.headerTitle);
            parcel.writeString(this.additionalHeader);
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f2 = dn.f(parcel, list, 1);
            while (f2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetTypePlaceholderPayloadDto(SuperAppUniversalWidgetTypePlaceholderRootStyleDto superAppUniversalWidgetTypePlaceholderRootStyleDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List<SuperAppUniversalWidgetImageItemDto> list) {
            super(null);
            this.rootStyle = superAppUniversalWidgetTypePlaceholderRootStyleDto;
            this.title = superAppUniversalWidgetTextBlockDto;
            this.button = superAppUniversalWidgetButtonDto;
            this.action = superAppUniversalWidgetActionDto;
            this.footer = superAppUniversalWidgetFooterDto;
            this.updatedTime = superAppUniversalWidgetUpdatedTimeDto;
            this.trackCode = str;
            this.accessibility = superAppAccessibilityDto;
            this.weight = f;
            this.type = typeDto;
            this.state = str2;
            this.headerTitle = str3;
            this.additionalHeader = str4;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.headerIcon = list;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeScrollPayloadDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeScrollPayloadDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("additional_header")
        private final String additionalHeader;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("footer")
        private final SuperAppUniversalWidgetFooterDto footer;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("header_title")
        private final String headerTitle;

        @pmi0("items")
        private final List<SuperAppUniversalWidgetTypeScrollItemPayloadDto> items;

        @pmi0("root_style")
        private final SuperAppUniversalWidgetTypeScrollRootStyleDto rootStyle;

        @pmi0("state")
        private final String state;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("updated_time")
        private final SuperAppUniversalWidgetUpdatedTimeDto updatedTime;

        @pmi0("weight")
        private final Float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("universal_scroll")
            public static final TypeDto UNIVERSAL_SCROLL;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("UNIVERSAL_SCROLL", 0, "universal_scroll");
                UNIVERSAL_SCROLL = typeDto;
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeScrollPayloadDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeScrollPayloadDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto;
                SuperAppUniversalWidgetTypeScrollRootStyleDto superAppUniversalWidgetTypeScrollRootStyleDto;
                ArrayList arrayList2;
                SuperAppUniversalWidgetTypeScrollRootStyleDto createFromParcel = SuperAppUniversalWidgetTypeScrollRootStyleDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppUniversalWidgetTypeScrollItemPayloadDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypeScrollPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto2 = (SuperAppUniversalWidgetFooterDto) parcel.readParcelable(SuperAppUniversalWidgetTypeScrollPayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetUpdatedTimeDto createFromParcel2 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetUpdatedTimeDto.CREATOR.createFromParcel(parcel);
                Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                TypeDto createFromParcel3 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
                Float f = valueOf;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                SuperAppAccessibilityDto createFromParcel4 = parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel);
                String readString3 = parcel.readString();
                SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = null;
                String readString4 = parcel.readString();
                SuperAppUniversalWidgetAdditionalHeaderIconDto createFromParcel5 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    superAppUniversalWidgetHeaderRightTypeDto = SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel);
                }
                SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto2 = superAppUniversalWidgetHeaderRightTypeDto;
                if (parcel.readInt() == 0) {
                    superAppUniversalWidgetFooterDto = superAppUniversalWidgetFooterDto2;
                    superAppUniversalWidgetTypeScrollRootStyleDto = createFromParcel;
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    superAppUniversalWidgetFooterDto = superAppUniversalWidgetFooterDto2;
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    superAppUniversalWidgetTypeScrollRootStyleDto = createFromParcel;
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList3, i2, 1);
                        readInt2 = readInt2;
                        createFromParcel5 = createFromParcel5;
                    }
                    arrayList2 = arrayList3;
                }
                return new SuperAppUniversalWidgetTypeScrollPayloadDto(superAppUniversalWidgetTypeScrollRootStyleDto, arrayList, superAppUniversalWidgetActionDto, superAppUniversalWidgetFooterDto, createFromParcel2, f, createFromParcel3, readString, readString2, createFromParcel4, readString3, readString4, createFromParcel5, superAppUniversalWidgetHeaderRightTypeDto2, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeScrollPayloadDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypeScrollPayloadDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypeScrollPayloadDto(SuperAppUniversalWidgetTypeScrollRootStyleDto superAppUniversalWidgetTypeScrollRootStyleDto, List list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, Float f, TypeDto typeDto, String str, String str2, SuperAppAccessibilityDto superAppAccessibilityDto, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List list2, int i, zcl zclVar) {
            this(superAppUniversalWidgetTypeScrollRootStyleDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : superAppUniversalWidgetActionDto, (i & 8) != 0 ? null : superAppUniversalWidgetFooterDto, (i & 16) != 0 ? null : superAppUniversalWidgetUpdatedTimeDto, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : typeDto, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : superAppAccessibilityDto, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 8192) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 16384) != 0 ? null : list2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypeScrollPayloadDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypeScrollPayloadDto superAppUniversalWidgetTypeScrollPayloadDto = (SuperAppUniversalWidgetTypeScrollPayloadDto) obj;
            return epx.f(this.rootStyle, superAppUniversalWidgetTypeScrollPayloadDto.rootStyle) && epx.f(this.items, superAppUniversalWidgetTypeScrollPayloadDto.items) && epx.f(this.action, superAppUniversalWidgetTypeScrollPayloadDto.action) && epx.f(this.footer, superAppUniversalWidgetTypeScrollPayloadDto.footer) && epx.f(this.updatedTime, superAppUniversalWidgetTypeScrollPayloadDto.updatedTime) && epx.f(this.weight, superAppUniversalWidgetTypeScrollPayloadDto.weight) && this.type == superAppUniversalWidgetTypeScrollPayloadDto.type && epx.f(this.state, superAppUniversalWidgetTypeScrollPayloadDto.state) && epx.f(this.trackCode, superAppUniversalWidgetTypeScrollPayloadDto.trackCode) && epx.f(this.accessibility, superAppUniversalWidgetTypeScrollPayloadDto.accessibility) && epx.f(this.headerTitle, superAppUniversalWidgetTypeScrollPayloadDto.headerTitle) && epx.f(this.additionalHeader, superAppUniversalWidgetTypeScrollPayloadDto.additionalHeader) && epx.f(this.additionalHeaderIcon, superAppUniversalWidgetTypeScrollPayloadDto.additionalHeaderIcon) && this.headerRightType == superAppUniversalWidgetTypeScrollPayloadDto.headerRightType && epx.f(this.headerIcon, superAppUniversalWidgetTypeScrollPayloadDto.headerIcon);
        }

        public final int hashCode() {
            int hashCode = this.rootStyle.hashCode() * 31;
            List<SuperAppUniversalWidgetTypeScrollItemPayloadDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto = this.footer;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetFooterDto == null ? 0 : superAppUniversalWidgetFooterDto.hashCode())) * 31;
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetUpdatedTimeDto == null ? 0 : superAppUniversalWidgetUpdatedTimeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            TypeDto typeDto = this.type;
            int hashCode7 = (hashCode6 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            String str = this.state;
            int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode10 = (hashCode9 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            String str3 = this.headerTitle;
            int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.additionalHeader;
            int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode13 = (hashCode12 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode14 = (hashCode13 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
            return hashCode14 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetTypeScrollPayloadDto(rootStyle=");
            sb.append(this.rootStyle);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", updatedTime=");
            sb.append(this.updatedTime);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", headerTitle=");
            sb.append(this.headerTitle);
            sb.append(", additionalHeader=");
            sb.append(this.additionalHeader);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", headerIcon=");
            return ms9.a(')', sb, this.headerIcon);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.rootStyle.writeToParcel(parcel, i);
            List<SuperAppUniversalWidgetTypeScrollItemPayloadDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetTypeScrollItemPayloadDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.footer, i);
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            if (superAppUniversalWidgetUpdatedTimeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetUpdatedTimeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.state);
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.headerTitle);
            parcel.writeString(this.additionalHeader);
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f3 = dn.f(parcel, list2, 1);
            while (f3.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) f3.next()).writeToParcel(parcel, i);
            }
        }

        public SuperAppUniversalWidgetTypeScrollPayloadDto(SuperAppUniversalWidgetTypeScrollRootStyleDto superAppUniversalWidgetTypeScrollRootStyleDto, List<SuperAppUniversalWidgetTypeScrollItemPayloadDto> list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, Float f, TypeDto typeDto, String str, String str2, SuperAppAccessibilityDto superAppAccessibilityDto, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List<SuperAppUniversalWidgetImageItemDto> list2) {
            super(null);
            this.rootStyle = superAppUniversalWidgetTypeScrollRootStyleDto;
            this.items = list;
            this.action = superAppUniversalWidgetActionDto;
            this.footer = superAppUniversalWidgetFooterDto;
            this.updatedTime = superAppUniversalWidgetUpdatedTimeDto;
            this.weight = f;
            this.type = typeDto;
            this.state = str;
            this.trackCode = str2;
            this.accessibility = superAppAccessibilityDto;
            this.headerTitle = str3;
            this.additionalHeader = str4;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.headerIcon = list2;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetTypeTablePayloadDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetTypeTablePayloadDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("additional_header")
        private final String additionalHeader;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("footer")
        private final SuperAppUniversalWidgetFooterDto footer;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("header_title")
        private final String headerTitle;

        @pmi0("items")
        private final List<List<SuperAppUniversalWidgetTypeTableCellPayloadDto>> items;

        @pmi0("root_style")
        private final SuperAppUniversalWidgetTypeTableRootStyleDto rootStyle;

        @pmi0("state")
        private final String state;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("updated_time")
        private final SuperAppUniversalWidgetUpdatedTimeDto updatedTime;

        @pmi0("weight")
        private final Float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("universal_table")
            public static final TypeDto UNIVERSAL_TABLE;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("UNIVERSAL_TABLE", 0, "universal_table");
                UNIVERSAL_TABLE = typeDto;
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeTablePayloadDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeTablePayloadDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto;
                SuperAppUniversalWidgetTypeTableRootStyleDto superAppUniversalWidgetTypeTableRootStyleDto;
                ArrayList arrayList2;
                SuperAppUniversalWidgetTypeTableRootStyleDto createFromParcel = SuperAppUniversalWidgetTypeTableRootStyleDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        int readInt2 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(readInt2);
                        int i2 = 0;
                        while (i2 != readInt2) {
                            i2 = en.a(SuperAppUniversalWidgetTypeTableCellPayloadDto.CREATOR, parcel, arrayList3, i2, 1);
                        }
                        arrayList.add(arrayList3);
                    }
                }
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypeTablePayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto2 = (SuperAppUniversalWidgetFooterDto) parcel.readParcelable(SuperAppUniversalWidgetTypeTablePayloadDto.class.getClassLoader());
                SuperAppUniversalWidgetUpdatedTimeDto createFromParcel2 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetUpdatedTimeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                SuperAppAccessibilityDto createFromParcel3 = parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel);
                Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                TypeDto createFromParcel4 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
                Float f = valueOf;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                SuperAppUniversalWidgetAdditionalHeaderIconDto createFromParcel5 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetHeaderRightTypeDto createFromParcel6 = parcel.readInt() != 0 ? SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() == 0) {
                    superAppUniversalWidgetFooterDto = superAppUniversalWidgetFooterDto2;
                    superAppUniversalWidgetTypeTableRootStyleDto = createFromParcel;
                    arrayList2 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    superAppUniversalWidgetFooterDto = superAppUniversalWidgetFooterDto2;
                    ArrayList arrayList4 = new ArrayList(readInt3);
                    superAppUniversalWidgetTypeTableRootStyleDto = createFromParcel;
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList4, i3, 1);
                        readInt3 = readInt3;
                        createFromParcel5 = createFromParcel5;
                    }
                    arrayList2 = arrayList4;
                }
                return new SuperAppUniversalWidgetTypeTablePayloadDto(superAppUniversalWidgetTypeTableRootStyleDto, arrayList, superAppUniversalWidgetActionDto, superAppUniversalWidgetFooterDto, createFromParcel2, readString, createFromParcel3, f, createFromParcel4, readString2, readString3, readString4, createFromParcel5, createFromParcel6, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetTypeTablePayloadDto[] newArray(int i) {
                return new SuperAppUniversalWidgetTypeTablePayloadDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetTypeTablePayloadDto(SuperAppUniversalWidgetTypeTableRootStyleDto superAppUniversalWidgetTypeTableRootStyleDto, List list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List list2, int i, zcl zclVar) {
            this(superAppUniversalWidgetTypeTableRootStyleDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : superAppUniversalWidgetActionDto, (i & 8) != 0 ? null : superAppUniversalWidgetFooterDto, (i & 16) != 0 ? null : superAppUniversalWidgetUpdatedTimeDto, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : superAppAccessibilityDto, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : typeDto, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 8192) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 16384) != 0 ? null : list2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetTypeTablePayloadDto)) {
                return false;
            }
            SuperAppUniversalWidgetTypeTablePayloadDto superAppUniversalWidgetTypeTablePayloadDto = (SuperAppUniversalWidgetTypeTablePayloadDto) obj;
            return epx.f(this.rootStyle, superAppUniversalWidgetTypeTablePayloadDto.rootStyle) && epx.f(this.items, superAppUniversalWidgetTypeTablePayloadDto.items) && epx.f(this.action, superAppUniversalWidgetTypeTablePayloadDto.action) && epx.f(this.footer, superAppUniversalWidgetTypeTablePayloadDto.footer) && epx.f(this.updatedTime, superAppUniversalWidgetTypeTablePayloadDto.updatedTime) && epx.f(this.trackCode, superAppUniversalWidgetTypeTablePayloadDto.trackCode) && epx.f(this.accessibility, superAppUniversalWidgetTypeTablePayloadDto.accessibility) && epx.f(this.weight, superAppUniversalWidgetTypeTablePayloadDto.weight) && this.type == superAppUniversalWidgetTypeTablePayloadDto.type && epx.f(this.state, superAppUniversalWidgetTypeTablePayloadDto.state) && epx.f(this.headerTitle, superAppUniversalWidgetTypeTablePayloadDto.headerTitle) && epx.f(this.additionalHeader, superAppUniversalWidgetTypeTablePayloadDto.additionalHeader) && epx.f(this.additionalHeaderIcon, superAppUniversalWidgetTypeTablePayloadDto.additionalHeaderIcon) && this.headerRightType == superAppUniversalWidgetTypeTablePayloadDto.headerRightType && epx.f(this.headerIcon, superAppUniversalWidgetTypeTablePayloadDto.headerIcon);
        }

        public final int hashCode() {
            int hashCode = this.rootStyle.hashCode() * 31;
            List<List<SuperAppUniversalWidgetTypeTableCellPayloadDto>> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto = this.footer;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetFooterDto == null ? 0 : superAppUniversalWidgetFooterDto.hashCode())) * 31;
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetUpdatedTimeDto == null ? 0 : superAppUniversalWidgetUpdatedTimeDto.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode7 = (hashCode6 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            TypeDto typeDto = this.type;
            int hashCode9 = (hashCode8 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            String str2 = this.state;
            int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.headerTitle;
            int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.additionalHeader;
            int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode13 = (hashCode12 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode14 = (hashCode13 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
            return hashCode14 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetTypeTablePayloadDto(rootStyle=");
            sb.append(this.rootStyle);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", updatedTime=");
            sb.append(this.updatedTime);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", headerTitle=");
            sb.append(this.headerTitle);
            sb.append(", additionalHeader=");
            sb.append(this.additionalHeader);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", headerIcon=");
            return ms9.a(')', sb, this.headerIcon);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.rootStyle.writeToParcel(parcel, i);
            List<List<SuperAppUniversalWidgetTypeTableCellPayloadDto>> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    Iterator a2 = ao.a(parcel, (List) f.next());
                    while (a2.hasNext()) {
                        ((SuperAppUniversalWidgetTypeTableCellPayloadDto) a2.next()).writeToParcel(parcel, i);
                    }
                }
            }
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.footer, i);
            SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = this.updatedTime;
            if (superAppUniversalWidgetUpdatedTimeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetUpdatedTimeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.state);
            parcel.writeString(this.headerTitle);
            parcel.writeString(this.additionalHeader);
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            List<SuperAppUniversalWidgetImageItemDto> list2 = this.headerIcon;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f3 = dn.f(parcel, list2, 1);
            while (f3.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) f3.next()).writeToParcel(parcel, i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppUniversalWidgetTypeTablePayloadDto(SuperAppUniversalWidgetTypeTableRootStyleDto superAppUniversalWidgetTypeTableRootStyleDto, List<? extends List<SuperAppUniversalWidgetTypeTableCellPayloadDto>> list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetFooterDto superAppUniversalWidgetFooterDto, SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto, String str, SuperAppAccessibilityDto superAppAccessibilityDto, Float f, TypeDto typeDto, String str2, String str3, String str4, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, List<SuperAppUniversalWidgetImageItemDto> list2) {
            super(null);
            this.rootStyle = superAppUniversalWidgetTypeTableRootStyleDto;
            this.items = list;
            this.action = superAppUniversalWidgetActionDto;
            this.footer = superAppUniversalWidgetFooterDto;
            this.updatedTime = superAppUniversalWidgetUpdatedTimeDto;
            this.trackCode = str;
            this.accessibility = superAppAccessibilityDto;
            this.weight = f;
            this.type = typeDto;
            this.state = str2;
            this.headerTitle = str3;
            this.additionalHeader = str4;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.headerIcon = list2;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetAdsEasyPromoteDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetAdsEasyPromoteDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("description")
        private final String description;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetAdsEasyPromoteDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetAdsEasyPromoteDto createFromParcel(Parcel parcel) {
                return new SuperAppWidgetAdsEasyPromoteDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetAdsEasyPromoteDto[] newArray(int i) {
                return new SuperAppWidgetAdsEasyPromoteDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetAdsEasyPromoteDto(String str, String str2, String str3, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : superAppAccessibilityDto, (i & 16) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 32) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetAdsEasyPromoteDto)) {
                return false;
            }
            SuperAppWidgetAdsEasyPromoteDto superAppWidgetAdsEasyPromoteDto = (SuperAppWidgetAdsEasyPromoteDto) obj;
            return epx.f(this.title, superAppWidgetAdsEasyPromoteDto.title) && epx.f(this.description, superAppWidgetAdsEasyPromoteDto.description) && epx.f(this.trackCode, superAppWidgetAdsEasyPromoteDto.trackCode) && epx.f(this.accessibility, superAppWidgetAdsEasyPromoteDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetAdsEasyPromoteDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetAdsEasyPromoteDto.headerRightType && epx.f(this.weight, superAppWidgetAdsEasyPromoteDto.weight) && this.type == superAppWidgetAdsEasyPromoteDto.type;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode4 = (hashCode3 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode7 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetAdsEasyPromoteDto(title=");
            sb.append(this.title);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f = this.weight;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetAdsEasyPromoteDto(String str, String str2, String str3, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.description = str2;
            this.trackCode = str3;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetAfishaDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetAfishaDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("app_id")
        private final Integer appId;

        @pmi0("footer_text")
        private final SuperAppWidgetAfishaFooterTextDto footerText;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppWidgetAfishaEventDto> items;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("webview_url")
        private final String webviewUrl;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetAfishaDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetAfishaDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppWidgetAfishaEventDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SuperAppWidgetAfishaDto(readString, valueOf, readString2, arrayList, parcel.readInt() == 0 ? null : SuperAppWidgetAfishaFooterTextDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetAfishaDto[] newArray(int i) {
                return new SuperAppWidgetAfishaDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetAfishaDto(String str, Integer num, String str2, List list, SuperAppWidgetAfishaFooterTextDto superAppWidgetAfishaFooterTextDto, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : superAppWidgetAfishaFooterTextDto, (i & 32) != 0 ? null : superAppAccessibilityDto, (i & 64) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 128) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetAfishaDto)) {
                return false;
            }
            SuperAppWidgetAfishaDto superAppWidgetAfishaDto = (SuperAppWidgetAfishaDto) obj;
            return epx.f(this.title, superAppWidgetAfishaDto.title) && epx.f(this.appId, superAppWidgetAfishaDto.appId) && epx.f(this.webviewUrl, superAppWidgetAfishaDto.webviewUrl) && epx.f(this.items, superAppWidgetAfishaDto.items) && epx.f(this.footerText, superAppWidgetAfishaDto.footerText) && epx.f(this.accessibility, superAppWidgetAfishaDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetAfishaDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetAfishaDto.headerRightType && epx.f(this.weight, superAppWidgetAfishaDto.weight) && this.type == superAppWidgetAfishaDto.type;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Integer num = this.appId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.webviewUrl;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<SuperAppWidgetAfishaEventDto> list = this.items;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppWidgetAfishaFooterTextDto superAppWidgetAfishaFooterTextDto = this.footerText;
            int hashCode5 = (hashCode4 + (superAppWidgetAfishaFooterTextDto == null ? 0 : superAppWidgetAfishaFooterTextDto.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode6 = (hashCode5 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode7 = (hashCode6 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode8 = (hashCode7 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode9 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetAfishaDto(title=");
            sb.append(this.title);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", webviewUrl=");
            sb.append(this.webviewUrl);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", footerText=");
            sb.append(this.footerText);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            Integer num = this.appId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.webviewUrl);
            List<SuperAppWidgetAfishaEventDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppWidgetAfishaEventDto) f.next()).writeToParcel(parcel, i);
                }
            }
            SuperAppWidgetAfishaFooterTextDto superAppWidgetAfishaFooterTextDto = this.footerText;
            if (superAppWidgetAfishaFooterTextDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetAfishaFooterTextDto.writeToParcel(parcel, i);
            }
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetAfishaDto(String str, Integer num, String str2, List<SuperAppWidgetAfishaEventDto> list, SuperAppWidgetAfishaFooterTextDto superAppWidgetAfishaFooterTextDto, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.appId = num;
            this.webviewUrl = str2;
            this.items = list;
            this.footerText = superAppWidgetAfishaFooterTextDto;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetAssistantDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetAssistantDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("greeting")
        private final List<SuperAppWidgetAssistantGreetingDto> greeting;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("icon")
        private final List<SuperAppUniversalWidgetImageItemDto> icon;

        @pmi0("suggests")
        private final List<SuperAppWidgetAssistantSuggestsDto> suggests;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetAssistantDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetAssistantDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                int i = 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList4, i2, 1);
                    }
                    arrayList = arrayList4;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt2);
                    int i3 = 0;
                    while (i3 != readInt2) {
                        i3 = en.a(SuperAppWidgetAssistantGreetingDto.CREATOR, parcel, arrayList5, i3, 1);
                    }
                    arrayList2 = arrayList5;
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt3);
                    while (i != readInt3) {
                        i = en.a(SuperAppWidgetAssistantSuggestsDto.CREATOR, parcel, arrayList6, i, 1);
                    }
                    arrayList3 = arrayList6;
                }
                return new SuperAppWidgetAssistantDto(arrayList, arrayList2, arrayList3, parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetAssistantDto[] newArray(int i) {
                return new SuperAppWidgetAssistantDto[i];
            }
        }

        public SuperAppWidgetAssistantDto() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetAssistantDto)) {
                return false;
            }
            SuperAppWidgetAssistantDto superAppWidgetAssistantDto = (SuperAppWidgetAssistantDto) obj;
            return epx.f(this.icon, superAppWidgetAssistantDto.icon) && epx.f(this.greeting, superAppWidgetAssistantDto.greeting) && epx.f(this.suggests, superAppWidgetAssistantDto.suggests) && epx.f(this.accessibility, superAppWidgetAssistantDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetAssistantDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetAssistantDto.headerRightType && epx.f(this.weight, superAppWidgetAssistantDto.weight) && this.type == superAppWidgetAssistantDto.type;
        }

        public final int hashCode() {
            List<SuperAppUniversalWidgetImageItemDto> list = this.icon;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<SuperAppWidgetAssistantGreetingDto> list2 = this.greeting;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<SuperAppWidgetAssistantSuggestsDto> list3 = this.suggests;
            int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode4 = (hashCode3 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode7 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetAssistantDto(icon=");
            sb.append(this.icon);
            sb.append(", greeting=");
            sb.append(this.greeting);
            sb.append(", suggests=");
            sb.append(this.suggests);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<SuperAppUniversalWidgetImageItemDto> list = this.icon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            List<SuperAppWidgetAssistantGreetingDto> list2 = this.greeting;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f2 = dn.f(parcel, list2, 1);
                while (f2.hasNext()) {
                    ((SuperAppWidgetAssistantGreetingDto) f2.next()).writeToParcel(parcel, i);
                }
            }
            List<SuperAppWidgetAssistantSuggestsDto> list3 = this.suggests;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f3 = dn.f(parcel, list3, 1);
                while (f3.hasNext()) {
                    ((SuperAppWidgetAssistantSuggestsDto) f3.next()).writeToParcel(parcel, i);
                }
            }
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f4 = this.weight;
            if (f4 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f4);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppWidgetAssistantDto(List list, List list2, List list3, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : superAppAccessibilityDto, (i & 16) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 32) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        public SuperAppWidgetAssistantDto(List<SuperAppUniversalWidgetImageItemDto> list, List<SuperAppWidgetAssistantGreetingDto> list2, List<SuperAppWidgetAssistantSuggestsDto> list3, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.icon = list;
            this.greeting = list2;
            this.suggests = list3;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetAssistantV2Dto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetAssistantV2Dto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("app_id")
        private final int appId;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("suggests")
        private final List<SuperAppWidgetAssistantSuggestsDto> suggests;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetAssistantV2Dto> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetAssistantV2Dto createFromParcel(Parcel parcel) {
                Parcelable parcelable;
                ArrayList arrayList;
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(SuperAppWidgetAssistantSuggestsDto.CREATOR, parcel, arrayList2, i2, 1);
                }
                if (parcel.readInt() == 0) {
                    parcelable = null;
                    arrayList = null;
                } else {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    while (i != readInt3) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList3, i, 1);
                    }
                    parcelable = null;
                    arrayList = arrayList3;
                }
                return new SuperAppWidgetAssistantV2Dto(readString, readInt, arrayList2, arrayList, parcel.readString(), (SuperAppAccessibilityDto) (parcel.readInt() == 0 ? parcelable : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel)), (SuperAppUniversalWidgetAdditionalHeaderIconDto) (parcel.readInt() == 0 ? parcelable : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel)), (SuperAppUniversalWidgetHeaderRightTypeDto) (parcel.readInt() == 0 ? parcelable : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? parcelable : Float.valueOf(parcel.readFloat()), (SuperAppWidgetPayloadTypesDto) (parcel.readInt() == 0 ? parcelable : SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel)));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetAssistantV2Dto[] newArray(int i) {
                return new SuperAppWidgetAssistantV2Dto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetAssistantV2Dto(String str, int i, List list, List list2, String str2, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i2, zcl zclVar) {
            this(str, i, list, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : superAppAccessibilityDto, (i2 & 64) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i2 & 128) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i2 & 256) != 0 ? null : f, (i2 & 512) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetAssistantV2Dto)) {
                return false;
            }
            SuperAppWidgetAssistantV2Dto superAppWidgetAssistantV2Dto = (SuperAppWidgetAssistantV2Dto) obj;
            return epx.f(this.title, superAppWidgetAssistantV2Dto.title) && this.appId == superAppWidgetAssistantV2Dto.appId && epx.f(this.suggests, superAppWidgetAssistantV2Dto.suggests) && epx.f(this.headerIcon, superAppWidgetAssistantV2Dto.headerIcon) && epx.f(this.trackCode, superAppWidgetAssistantV2Dto.trackCode) && epx.f(this.accessibility, superAppWidgetAssistantV2Dto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetAssistantV2Dto.additionalHeaderIcon) && this.headerRightType == superAppWidgetAssistantV2Dto.headerRightType && epx.f(this.weight, superAppWidgetAssistantV2Dto.weight) && this.type == superAppWidgetAssistantV2Dto.type;
        }

        public final int hashCode() {
            int a2 = fw3.a(shy.a(this.appId, this.title.hashCode() * 31, 31), 31, this.suggests);
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode3 = (hashCode2 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode6 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetAssistantV2Dto(title=");
            sb.append(this.title);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", suggests=");
            sb.append(this.suggests);
            sb.append(", headerIcon=");
            sb.append(this.headerIcon);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeInt(this.appId);
            Iterator a2 = ao.a(parcel, this.suggests);
            while (a2.hasNext()) {
                ((SuperAppWidgetAssistantSuggestsDto) a2.next()).writeToParcel(parcel, i);
            }
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetAssistantV2Dto(String str, int i, List<SuperAppWidgetAssistantSuggestsDto> list, List<SuperAppUniversalWidgetImageItemDto> list2, String str2, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.appId = i;
            this.suggests = list;
            this.headerIcon = list2;
            this.trackCode = str2;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetBirthdaysDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetBirthdaysDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("is_local")
        private final Boolean isLocal;

        @pmi0("link")
        private final String link;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetBirthdaysDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetBirthdaysDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Float f;
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                    f = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    f = null;
                }
                Float f2 = f;
                return new SuperAppWidgetBirthdaysDto(readString, valueOf, parcel.readString(), parcel.readString(), (SuperAppAccessibilityDto) (parcel.readInt() == 0 ? f2 : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel)), (SuperAppUniversalWidgetAdditionalHeaderIconDto) (parcel.readInt() == 0 ? f2 : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel)), (SuperAppUniversalWidgetHeaderRightTypeDto) (parcel.readInt() == 0 ? f2 : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? f2 : Float.valueOf(parcel.readFloat()), (SuperAppWidgetPayloadTypesDto) (parcel.readInt() == 0 ? f2 : SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel)));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetBirthdaysDto[] newArray(int i) {
                return new SuperAppWidgetBirthdaysDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetBirthdaysDto(String str, Boolean bool, String str2, String str3, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : superAppAccessibilityDto, (i & 32) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 64) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetBirthdaysDto)) {
                return false;
            }
            SuperAppWidgetBirthdaysDto superAppWidgetBirthdaysDto = (SuperAppWidgetBirthdaysDto) obj;
            return epx.f(this.title, superAppWidgetBirthdaysDto.title) && epx.f(this.isLocal, superAppWidgetBirthdaysDto.isLocal) && epx.f(this.link, superAppWidgetBirthdaysDto.link) && epx.f(this.trackCode, superAppWidgetBirthdaysDto.trackCode) && epx.f(this.accessibility, superAppWidgetBirthdaysDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetBirthdaysDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetBirthdaysDto.headerRightType && epx.f(this.weight, superAppWidgetBirthdaysDto.weight) && this.type == superAppWidgetBirthdaysDto.type;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Boolean bool = this.isLocal;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.link;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode5 = (hashCode4 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode7 = (hashCode6 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode8 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetBirthdaysDto(title=");
            sb.append(this.title);
            sb.append(", isLocal=");
            sb.append(this.isLocal);
            sb.append(", link=");
            sb.append(this.link);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            Boolean bool = this.isLocal;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeString(this.link);
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f = this.weight;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetBirthdaysDto(String str, Boolean bool, String str2, String str3, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.isLocal = bool;
            this.link = str2;
            this.trackCode = str3;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetCouponDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetCouponDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("app_id")
        private final int appId;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("icon")
        private final List<BaseImageDto> icon;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetCouponDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetCouponDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = bo.b(SuperAppWidgetCouponDto.class, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppWidgetCouponDto(readString, readInt, arrayList, parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetCouponDto[] newArray(int i) {
                return new SuperAppWidgetCouponDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetCouponDto(String str, int i, List list, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i2, zcl zclVar) {
            this(str, i, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : superAppAccessibilityDto, (i2 & 16) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i2 & 32) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i2 & 64) != 0 ? null : f, (i2 & 128) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetCouponDto)) {
                return false;
            }
            SuperAppWidgetCouponDto superAppWidgetCouponDto = (SuperAppWidgetCouponDto) obj;
            return epx.f(this.title, superAppWidgetCouponDto.title) && this.appId == superAppWidgetCouponDto.appId && epx.f(this.icon, superAppWidgetCouponDto.icon) && epx.f(this.accessibility, superAppWidgetCouponDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetCouponDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetCouponDto.headerRightType && epx.f(this.weight, superAppWidgetCouponDto.weight) && this.type == superAppWidgetCouponDto.type;
        }

        public final int hashCode() {
            int a2 = shy.a(this.appId, this.title.hashCode() * 31, 31);
            List<BaseImageDto> list = this.icon;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode2 = (hashCode + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode5 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetCouponDto(title=");
            sb.append(this.title);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeInt(this.appId);
            List<BaseImageDto> list = this.icon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetCouponDto(String str, int i, List<BaseImageDto> list, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.appId = i;
            this.icon = list;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetCovidDynamicDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetCovidDynamicDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("app_id")
        private final Integer appId;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("local_increase")
        private final Integer localIncrease;

        @pmi0("local_increase_label")
        private final String localIncreaseLabel;

        @pmi0("timeline_dynamic")
        private final List<Float> timelineDynamic;

        @pmi0("title")
        private final String title;

        @pmi0("total_increase")
        private final Integer totalIncrease;

        @pmi0("total_increase_label")
        private final String totalIncreaseLabel;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("webview_url")
        private final String webviewUrl;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetCovidDynamicDto> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetCovidDynamicDto createFromParcel(Parcel parcel) {
                Integer valueOf;
                ArrayList arrayList;
                ArrayList arrayList2;
                Object obj;
                Integer num;
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                    arrayList = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                    arrayList = null;
                }
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList2 = arrayList;
                } else {
                    int readInt = parcel.readInt();
                    arrayList2 = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList2.add(Float.valueOf(parcel.readFloat()));
                    }
                }
                if (parcel.readInt() == 0) {
                    Object obj2 = arrayList;
                    obj = obj2;
                    num = obj2;
                } else {
                    obj = arrayList;
                    num = Integer.valueOf(parcel.readInt());
                }
                Object obj3 = obj;
                return new SuperAppWidgetCovidDynamicDto(readString, valueOf, readString2, arrayList2, num, parcel.readString(), parcel.readInt() == 0 ? obj : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), (SuperAppAccessibilityDto) (parcel.readInt() == 0 ? obj3 : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel)), (SuperAppUniversalWidgetAdditionalHeaderIconDto) (parcel.readInt() == 0 ? obj3 : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel)), (SuperAppUniversalWidgetHeaderRightTypeDto) (parcel.readInt() == 0 ? obj3 : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? obj3 : Float.valueOf(parcel.readFloat()), (SuperAppWidgetPayloadTypesDto) (parcel.readInt() == 0 ? obj3 : SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel)));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetCovidDynamicDto[] newArray(int i) {
                return new SuperAppWidgetCovidDynamicDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetCovidDynamicDto(String str, Integer num, String str2, List list, Integer num2, String str3, Integer num3, String str4, String str5, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : superAppAccessibilityDto, (i & 1024) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 2048) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 4096) != 0 ? null : f, (i & 8192) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetCovidDynamicDto)) {
                return false;
            }
            SuperAppWidgetCovidDynamicDto superAppWidgetCovidDynamicDto = (SuperAppWidgetCovidDynamicDto) obj;
            return epx.f(this.title, superAppWidgetCovidDynamicDto.title) && epx.f(this.appId, superAppWidgetCovidDynamicDto.appId) && epx.f(this.webviewUrl, superAppWidgetCovidDynamicDto.webviewUrl) && epx.f(this.timelineDynamic, superAppWidgetCovidDynamicDto.timelineDynamic) && epx.f(this.totalIncrease, superAppWidgetCovidDynamicDto.totalIncrease) && epx.f(this.totalIncreaseLabel, superAppWidgetCovidDynamicDto.totalIncreaseLabel) && epx.f(this.localIncrease, superAppWidgetCovidDynamicDto.localIncrease) && epx.f(this.localIncreaseLabel, superAppWidgetCovidDynamicDto.localIncreaseLabel) && epx.f(this.trackCode, superAppWidgetCovidDynamicDto.trackCode) && epx.f(this.accessibility, superAppWidgetCovidDynamicDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetCovidDynamicDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetCovidDynamicDto.headerRightType && epx.f(this.weight, superAppWidgetCovidDynamicDto.weight) && this.type == superAppWidgetCovidDynamicDto.type;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Integer num = this.appId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.webviewUrl;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<Float> list = this.timelineDynamic;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num2 = this.totalIncrease;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.totalIncreaseLabel;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num3 = this.localIncrease;
            int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str3 = this.localIncreaseLabel;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackCode;
            int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode10 = (hashCode9 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode11 = (hashCode10 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode12 = (hashCode11 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode13 = (hashCode12 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode13 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetCovidDynamicDto(title=");
            sb.append(this.title);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", webviewUrl=");
            sb.append(this.webviewUrl);
            sb.append(", timelineDynamic=");
            sb.append(this.timelineDynamic);
            sb.append(", totalIncrease=");
            sb.append(this.totalIncrease);
            sb.append(", totalIncreaseLabel=");
            sb.append(this.totalIncreaseLabel);
            sb.append(", localIncrease=");
            sb.append(this.localIncrease);
            sb.append(", localIncreaseLabel=");
            sb.append(this.localIncreaseLabel);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            Integer num = this.appId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.webviewUrl);
            List<Float> list = this.timelineDynamic;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeFloat(((Number) f.next()).floatValue());
                }
            }
            Integer num2 = this.totalIncrease;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            parcel.writeString(this.totalIncreaseLabel);
            Integer num3 = this.localIncrease;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
            }
            parcel.writeString(this.localIncreaseLabel);
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetCovidDynamicDto(String str, Integer num, String str2, List<Float> list, Integer num2, String str3, Integer num3, String str4, String str5, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.appId = num;
            this.webviewUrl = str2;
            this.timelineDynamic = list;
            this.totalIncrease = num2;
            this.totalIncreaseLabel = str3;
            this.localIncrease = num3;
            this.localIncreaseLabel = str4;
            this.trackCode = str5;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetDeliveryClubDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetDeliveryClubDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("app_id")
        private final int appId;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("payload")
        private final SuperAppWidgetDeliveryClubStateDto payload;

        @pmi0("queue")
        private final String queue;

        @pmi0("state")
        private final StateDto state;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("webview_url")
        private final String webviewUrl;

        @pmi0("weight")
        private final Float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class StateDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ StateDto[] $VALUES;
            public static final Parcelable.Creator<StateDto> CREATOR;

            @pmi0("geo_restaurants")
            public static final StateDto GEO_RESTAURANTS;

            @pmi0("request_geo")
            public static final StateDto REQUEST_GEO;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
            public static final class a implements Parcelable.Creator<StateDto> {
                @Override // android.os.Parcelable.Creator
                public final StateDto createFromParcel(Parcel parcel) {
                    return StateDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final StateDto[] newArray(int i) {
                    return new StateDto[i];
                }
            }

            static {
                StateDto stateDto = new StateDto("REQUEST_GEO", 0, "request_geo");
                REQUEST_GEO = stateDto;
                StateDto stateDto2 = new StateDto("GEO_RESTAURANTS", 1, "geo_restaurants");
                GEO_RESTAURANTS = stateDto2;
                StateDto[] stateDtoArr = {stateDto, stateDto2};
                $VALUES = stateDtoArr;
                $ENTRIES = new asp(stateDtoArr);
                CREATOR = new a();
            }

            private StateDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static StateDto valueOf(String str) {
                return (StateDto) Enum.valueOf(StateDto.class, str);
            }

            public static StateDto[] values() {
                return (StateDto[]) $VALUES.clone();
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetDeliveryClubDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetDeliveryClubDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                String readString2 = parcel.readString();
                StateDto createFromParcel = StateDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppWidgetDeliveryClubDto(readString, readInt, readString2, createFromParcel, arrayList, parcel.readString(), (SuperAppWidgetDeliveryClubStateDto) parcel.readParcelable(SuperAppWidgetDeliveryClubDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetDeliveryClubDto[] newArray(int i) {
                return new SuperAppWidgetDeliveryClubDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetDeliveryClubDto(String str, int i, String str2, StateDto stateDto, List list, String str3, SuperAppWidgetDeliveryClubStateDto superAppWidgetDeliveryClubStateDto, String str4, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i2, zcl zclVar) {
            this(str, i, str2, stateDto, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : superAppWidgetDeliveryClubStateDto, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : superAppAccessibilityDto, (i2 & 512) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i2 & 1024) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i2 & 2048) != 0 ? null : f, (i2 & 4096) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetDeliveryClubDto)) {
                return false;
            }
            SuperAppWidgetDeliveryClubDto superAppWidgetDeliveryClubDto = (SuperAppWidgetDeliveryClubDto) obj;
            return epx.f(this.title, superAppWidgetDeliveryClubDto.title) && this.appId == superAppWidgetDeliveryClubDto.appId && epx.f(this.webviewUrl, superAppWidgetDeliveryClubDto.webviewUrl) && this.state == superAppWidgetDeliveryClubDto.state && epx.f(this.headerIcon, superAppWidgetDeliveryClubDto.headerIcon) && epx.f(this.queue, superAppWidgetDeliveryClubDto.queue) && epx.f(this.payload, superAppWidgetDeliveryClubDto.payload) && epx.f(this.trackCode, superAppWidgetDeliveryClubDto.trackCode) && epx.f(this.accessibility, superAppWidgetDeliveryClubDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetDeliveryClubDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetDeliveryClubDto.headerRightType && epx.f(this.weight, superAppWidgetDeliveryClubDto.weight) && this.type == superAppWidgetDeliveryClubDto.type;
        }

        public final int hashCode() {
            int hashCode = (this.state.hashCode() + urd0.a(shy.a(this.appId, this.title.hashCode() * 31, 31), 31, this.webviewUrl)) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.queue;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppWidgetDeliveryClubStateDto superAppWidgetDeliveryClubStateDto = this.payload;
            int hashCode4 = (hashCode3 + (superAppWidgetDeliveryClubStateDto == null ? 0 : superAppWidgetDeliveryClubStateDto.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode6 = (hashCode5 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode7 = (hashCode6 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode8 = (hashCode7 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode9 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetDeliveryClubDto(title=");
            sb.append(this.title);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", webviewUrl=");
            sb.append(this.webviewUrl);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", headerIcon=");
            sb.append(this.headerIcon);
            sb.append(", queue=");
            sb.append(this.queue);
            sb.append(", payload=");
            sb.append(this.payload);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeInt(this.appId);
            parcel.writeString(this.webviewUrl);
            this.state.writeToParcel(parcel, i);
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.queue);
            parcel.writeParcelable(this.payload, i);
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetDeliveryClubDto(String str, int i, String str2, StateDto stateDto, List<SuperAppUniversalWidgetImageItemDto> list, String str3, SuperAppWidgetDeliveryClubStateDto superAppWidgetDeliveryClubStateDto, String str4, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.appId = i;
            this.webviewUrl = str2;
            this.state = stateDto;
            this.headerIcon = list;
            this.queue = str3;
            this.payload = superAppWidgetDeliveryClubStateDto;
            this.trackCode = str4;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetDockBlockDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetDockBlockDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppCustomMenuItemDto> items;

        @pmi0("new_style")
        private final Boolean newStyle;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetDockBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetDockBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                ArrayList arrayList;
                int i = 0;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    while (i != readInt) {
                        i = en.a(SuperAppCustomMenuItemDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SuperAppWidgetDockBlockDto(valueOf, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetDockBlockDto[] newArray(int i) {
                return new SuperAppWidgetDockBlockDto[i];
            }
        }

        public SuperAppWidgetDockBlockDto() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetDockBlockDto)) {
                return false;
            }
            SuperAppWidgetDockBlockDto superAppWidgetDockBlockDto = (SuperAppWidgetDockBlockDto) obj;
            return epx.f(this.newStyle, superAppWidgetDockBlockDto.newStyle) && epx.f(this.items, superAppWidgetDockBlockDto.items) && epx.f(this.trackCode, superAppWidgetDockBlockDto.trackCode) && epx.f(this.accessibility, superAppWidgetDockBlockDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetDockBlockDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetDockBlockDto.headerRightType && epx.f(this.weight, superAppWidgetDockBlockDto.weight) && this.type == superAppWidgetDockBlockDto.type;
        }

        public final int hashCode() {
            Boolean bool = this.newStyle;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            List<SuperAppCustomMenuItemDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode4 = (hashCode3 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode7 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetDockBlockDto(newStyle=");
            sb.append(this.newStyle);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Boolean bool = this.newStyle;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            List<SuperAppCustomMenuItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppCustomMenuItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppWidgetDockBlockDto(Boolean bool, List list, String str, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : superAppAccessibilityDto, (i & 16) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 32) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        public SuperAppWidgetDockBlockDto(Boolean bool, List<SuperAppCustomMenuItemDto> list, String str, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.newStyle = bool;
            this.items = list;
            this.trackCode = str;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetExchangeRatesDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetExchangeRatesDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("app_id")
        private final Integer appId;

        @pmi0("footer_text")
        private final String footerText;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("information_webview_url")
        private final String informationWebviewUrl;

        @pmi0("items")
        private final List<SuperAppWidgetExchangeRatesItemDto> items;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("webview_url")
        private final String webviewUrl;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetExchangeRatesDto> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetExchangeRatesDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Integer valueOf;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                String readString = parcel.readString();
                int i = 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i2, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                    arrayList2 = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                    arrayList2 = null;
                }
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList4 = arrayList2;
                    arrayList3 = arrayList4;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = en.a(SuperAppWidgetExchangeRatesItemDto.CREATOR, parcel, arrayList3, i, 1);
                    }
                    arrayList4 = arrayList2;
                }
                Object obj = arrayList4;
                return new SuperAppWidgetExchangeRatesDto(readString, arrayList, valueOf, readString2, arrayList3, parcel.readString(), parcel.readString(), parcel.readString(), (SuperAppAccessibilityDto) (parcel.readInt() == 0 ? obj : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel)), (SuperAppUniversalWidgetAdditionalHeaderIconDto) (parcel.readInt() == 0 ? obj : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel)), (SuperAppUniversalWidgetHeaderRightTypeDto) (parcel.readInt() == 0 ? obj : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? obj : Float.valueOf(parcel.readFloat()), (SuperAppWidgetPayloadTypesDto) (parcel.readInt() == 0 ? obj : SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel)));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetExchangeRatesDto[] newArray(int i) {
                return new SuperAppWidgetExchangeRatesDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetExchangeRatesDto(String str, List list, Integer num, String str2, List list2, String str3, String str4, String str5, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : superAppAccessibilityDto, (i & 512) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 1024) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 2048) != 0 ? null : f, (i & 4096) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetExchangeRatesDto)) {
                return false;
            }
            SuperAppWidgetExchangeRatesDto superAppWidgetExchangeRatesDto = (SuperAppWidgetExchangeRatesDto) obj;
            return epx.f(this.title, superAppWidgetExchangeRatesDto.title) && epx.f(this.headerIcon, superAppWidgetExchangeRatesDto.headerIcon) && epx.f(this.appId, superAppWidgetExchangeRatesDto.appId) && epx.f(this.webviewUrl, superAppWidgetExchangeRatesDto.webviewUrl) && epx.f(this.items, superAppWidgetExchangeRatesDto.items) && epx.f(this.footerText, superAppWidgetExchangeRatesDto.footerText) && epx.f(this.informationWebviewUrl, superAppWidgetExchangeRatesDto.informationWebviewUrl) && epx.f(this.trackCode, superAppWidgetExchangeRatesDto.trackCode) && epx.f(this.accessibility, superAppWidgetExchangeRatesDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetExchangeRatesDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetExchangeRatesDto.headerRightType && epx.f(this.weight, superAppWidgetExchangeRatesDto.weight) && this.type == superAppWidgetExchangeRatesDto.type;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.appId;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.webviewUrl;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            List<SuperAppWidgetExchangeRatesItemDto> list2 = this.items;
            int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str2 = this.footerText;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.informationWebviewUrl;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackCode;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode9 = (hashCode8 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode10 = (hashCode9 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode11 = (hashCode10 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode12 = (hashCode11 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode12 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetExchangeRatesDto(title=");
            sb.append(this.title);
            sb.append(", headerIcon=");
            sb.append(this.headerIcon);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", webviewUrl=");
            sb.append(this.webviewUrl);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", footerText=");
            sb.append(this.footerText);
            sb.append(", informationWebviewUrl=");
            sb.append(this.informationWebviewUrl);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            Integer num = this.appId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.webviewUrl);
            List<SuperAppWidgetExchangeRatesItemDto> list2 = this.items;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f2 = dn.f(parcel, list2, 1);
                while (f2.hasNext()) {
                    ((SuperAppWidgetExchangeRatesItemDto) f2.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.footerText);
            parcel.writeString(this.informationWebviewUrl);
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f3 = this.weight;
            if (f3 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f3);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetExchangeRatesDto(String str, List<SuperAppUniversalWidgetImageItemDto> list, Integer num, String str2, List<SuperAppWidgetExchangeRatesItemDto> list2, String str3, String str4, String str5, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.headerIcon = list;
            this.appId = num;
            this.webviewUrl = str2;
            this.items = list2;
            this.footerText = str3;
            this.informationWebviewUrl = str4;
            this.trackCode = str5;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetGamesDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetGamesDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppAppListItemDto> items;

        @pmi0("link")
        private final String link;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetGamesDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetGamesDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppAppListItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppWidgetGamesDto(readString, readString2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetGamesDto[] newArray(int i) {
                return new SuperAppWidgetGamesDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetGamesDto(String str, String str2, List list, String str3, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : superAppAccessibilityDto, (i & 32) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 64) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetGamesDto)) {
                return false;
            }
            SuperAppWidgetGamesDto superAppWidgetGamesDto = (SuperAppWidgetGamesDto) obj;
            return epx.f(this.title, superAppWidgetGamesDto.title) && epx.f(this.link, superAppWidgetGamesDto.link) && epx.f(this.items, superAppWidgetGamesDto.items) && epx.f(this.trackCode, superAppWidgetGamesDto.trackCode) && epx.f(this.accessibility, superAppWidgetGamesDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetGamesDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetGamesDto.headerRightType && epx.f(this.weight, superAppWidgetGamesDto.weight) && this.type == superAppWidgetGamesDto.type;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.link;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<SuperAppAppListItemDto> list = this.items;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode5 = (hashCode4 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode7 = (hashCode6 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode8 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetGamesDto(title=");
            sb.append(this.title);
            sb.append(", link=");
            sb.append(this.link);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.link);
            List<SuperAppAppListItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppAppListItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetGamesDto(String str, String str2, List<SuperAppAppListItemDto> list, String str3, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.link = str2;
            this.items = list;
            this.trackCode = str3;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetGreetingDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetGreetingDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppWidgetGreetingItemDto> items;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetGreetingDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetGreetingDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppWidgetGreetingItemDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SuperAppWidgetGreetingDto(arrayList, parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetGreetingDto[] newArray(int i) {
                return new SuperAppWidgetGreetingDto[i];
            }
        }

        public SuperAppWidgetGreetingDto() {
            this(null, null, null, null, null, null, 63, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetGreetingDto)) {
                return false;
            }
            SuperAppWidgetGreetingDto superAppWidgetGreetingDto = (SuperAppWidgetGreetingDto) obj;
            return epx.f(this.items, superAppWidgetGreetingDto.items) && epx.f(this.accessibility, superAppWidgetGreetingDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetGreetingDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetGreetingDto.headerRightType && epx.f(this.weight, superAppWidgetGreetingDto.weight) && this.type == superAppWidgetGreetingDto.type;
        }

        public final int hashCode() {
            List<SuperAppWidgetGreetingItemDto> list = this.items;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode2 = (hashCode + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode5 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetGreetingDto(items=");
            sb.append(this.items);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<SuperAppWidgetGreetingItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppWidgetGreetingItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppWidgetGreetingDto(List list, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : superAppAccessibilityDto, (i & 4) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 8) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        public SuperAppWidgetGreetingDto(List<SuperAppWidgetGreetingItemDto> list, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.items = list;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetGreetingV2Dto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetGreetingV2Dto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("action")
        private final ExploreWidgetsBaseActionDto action;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("subtitle")
        private final List<SuperAppWidgetGreetingSubtitleItemDto> subtitle;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetGreetingV2Dto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetGreetingV2Dto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto = (ExploreWidgetsBaseActionDto) parcel.readParcelable(SuperAppWidgetGreetingV2Dto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppWidgetGreetingSubtitleItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppWidgetGreetingV2Dto(readString, exploreWidgetsBaseActionDto, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetGreetingV2Dto[] newArray(int i) {
                return new SuperAppWidgetGreetingV2Dto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetGreetingV2Dto(String str, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, List list, String str2, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : exploreWidgetsBaseActionDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : superAppAccessibilityDto, (i & 32) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 64) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetGreetingV2Dto)) {
                return false;
            }
            SuperAppWidgetGreetingV2Dto superAppWidgetGreetingV2Dto = (SuperAppWidgetGreetingV2Dto) obj;
            return epx.f(this.title, superAppWidgetGreetingV2Dto.title) && epx.f(this.action, superAppWidgetGreetingV2Dto.action) && epx.f(this.subtitle, superAppWidgetGreetingV2Dto.subtitle) && epx.f(this.trackCode, superAppWidgetGreetingV2Dto.trackCode) && epx.f(this.accessibility, superAppWidgetGreetingV2Dto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetGreetingV2Dto.additionalHeaderIcon) && this.headerRightType == superAppWidgetGreetingV2Dto.headerRightType && epx.f(this.weight, superAppWidgetGreetingV2Dto.weight) && this.type == superAppWidgetGreetingV2Dto.type;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto = this.action;
            int hashCode2 = (hashCode + (exploreWidgetsBaseActionDto == null ? 0 : exploreWidgetsBaseActionDto.hashCode())) * 31;
            List<SuperAppWidgetGreetingSubtitleItemDto> list = this.subtitle;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode5 = (hashCode4 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode7 = (hashCode6 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode8 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetGreetingV2Dto(title=");
            sb.append(this.title);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.action, i);
            List<SuperAppWidgetGreetingSubtitleItemDto> list = this.subtitle;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppWidgetGreetingSubtitleItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetGreetingV2Dto(String str, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, List<SuperAppWidgetGreetingSubtitleItemDto> list, String str2, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.action = exploreWidgetsBaseActionDto;
            this.subtitle = list;
            this.trackCode = str2;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetHolidayDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetHolidayDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("description")
        private final String description;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("images")
        private final List<BaseImageDto> images;

        @pmi0("link")
        private final String link;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetHolidayDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetHolidayDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                int i2 = 0;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(SuperAppWidgetHolidayDto.class.getClassLoader());
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    while (i2 != readInt2) {
                        i2 = bo.b(SuperAppWidgetHolidayDto.class, parcel, arrayList3, i2, 1);
                    }
                    arrayList2 = arrayList3;
                }
                return new SuperAppWidgetHolidayDto(readString, arrayList, readString2, readString3, baseLinkButtonDto, readString4, arrayList2, parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetHolidayDto[] newArray(int i) {
                return new SuperAppWidgetHolidayDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetHolidayDto(String str, List list, String str2, String str3, BaseLinkButtonDto baseLinkButtonDto, String str4, List list2, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : baseLinkButtonDto, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : superAppAccessibilityDto, (i & 256) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 512) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetHolidayDto)) {
                return false;
            }
            SuperAppWidgetHolidayDto superAppWidgetHolidayDto = (SuperAppWidgetHolidayDto) obj;
            return epx.f(this.title, superAppWidgetHolidayDto.title) && epx.f(this.headerIcon, superAppWidgetHolidayDto.headerIcon) && epx.f(this.description, superAppWidgetHolidayDto.description) && epx.f(this.link, superAppWidgetHolidayDto.link) && epx.f(this.button, superAppWidgetHolidayDto.button) && epx.f(this.trackCode, superAppWidgetHolidayDto.trackCode) && epx.f(this.images, superAppWidgetHolidayDto.images) && epx.f(this.accessibility, superAppWidgetHolidayDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetHolidayDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetHolidayDto.headerRightType && epx.f(this.weight, superAppWidgetHolidayDto.weight) && this.type == superAppWidgetHolidayDto.type;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.description;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.link;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            int hashCode5 = (hashCode4 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            String str3 = this.trackCode;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<BaseImageDto> list2 = this.images;
            int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode8 = (hashCode7 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode9 = (hashCode8 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode10 = (hashCode9 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode11 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetHolidayDto(title=");
            sb.append(this.title);
            sb.append(", headerIcon=");
            sb.append(this.headerIcon);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", link=");
            sb.append(this.link);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", images=");
            sb.append(this.images);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.description);
            parcel.writeString(this.link);
            parcel.writeParcelable(this.button, i);
            parcel.writeString(this.trackCode);
            List<BaseImageDto> list2 = this.images;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f2 = dn.f(parcel, list2, 1);
                while (f2.hasNext()) {
                    parcel.writeParcelable((Parcelable) f2.next(), i);
                }
            }
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f3 = this.weight;
            if (f3 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f3);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetHolidayDto(String str, List<SuperAppUniversalWidgetImageItemDto> list, String str2, String str3, BaseLinkButtonDto baseLinkButtonDto, String str4, List<BaseImageDto> list2, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.headerIcon = list;
            this.description = str2;
            this.link = str3;
            this.button = baseLinkButtonDto;
            this.trackCode = str4;
            this.images = list2;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetHorizontalButtonScrollDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetHorizontalButtonScrollDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppWidgetHorizontalButtonScrollOneOfDto> items;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetHorizontalButtonScrollDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetHorizontalButtonScrollDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(SuperAppWidgetHorizontalButtonScrollDto.class, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SuperAppWidgetHorizontalButtonScrollDto(arrayList, parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetHorizontalButtonScrollDto[] newArray(int i) {
                return new SuperAppWidgetHorizontalButtonScrollDto[i];
            }
        }

        public SuperAppWidgetHorizontalButtonScrollDto() {
            this(null, null, null, null, null, null, 63, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetHorizontalButtonScrollDto)) {
                return false;
            }
            SuperAppWidgetHorizontalButtonScrollDto superAppWidgetHorizontalButtonScrollDto = (SuperAppWidgetHorizontalButtonScrollDto) obj;
            return epx.f(this.items, superAppWidgetHorizontalButtonScrollDto.items) && epx.f(this.accessibility, superAppWidgetHorizontalButtonScrollDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetHorizontalButtonScrollDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetHorizontalButtonScrollDto.headerRightType && epx.f(this.weight, superAppWidgetHorizontalButtonScrollDto.weight) && this.type == superAppWidgetHorizontalButtonScrollDto.type;
        }

        public final int hashCode() {
            List<SuperAppWidgetHorizontalButtonScrollOneOfDto> list = this.items;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode2 = (hashCode + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode5 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetHorizontalButtonScrollDto(items=");
            sb.append(this.items);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<SuperAppWidgetHorizontalButtonScrollOneOfDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppWidgetHorizontalButtonScrollDto(List list, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : superAppAccessibilityDto, (i & 4) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 8) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppWidgetHorizontalButtonScrollDto(List<? extends SuperAppWidgetHorizontalButtonScrollOneOfDto> list, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.items = list;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetInformerDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetInformerDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("additional_text")
        private final String additionalText;

        @pmi0("app_id")
        private final Integer appId;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("link")
        private final String link;

        @pmi0("main_text")
        private final String mainText;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("webview_url")
        private final String webviewUrl;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetInformerDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetInformerDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppWidgetInformerDto(readString, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetInformerDto[] newArray(int i) {
                return new SuperAppWidgetInformerDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetInformerDto(String str, List list, String str2, Integer num, String str3, String str4, String str5, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : superAppAccessibilityDto, (i & 256) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 512) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetInformerDto)) {
                return false;
            }
            SuperAppWidgetInformerDto superAppWidgetInformerDto = (SuperAppWidgetInformerDto) obj;
            return epx.f(this.mainText, superAppWidgetInformerDto.mainText) && epx.f(this.headerIcon, superAppWidgetInformerDto.headerIcon) && epx.f(this.additionalText, superAppWidgetInformerDto.additionalText) && epx.f(this.appId, superAppWidgetInformerDto.appId) && epx.f(this.webviewUrl, superAppWidgetInformerDto.webviewUrl) && epx.f(this.link, superAppWidgetInformerDto.link) && epx.f(this.trackCode, superAppWidgetInformerDto.trackCode) && epx.f(this.accessibility, superAppWidgetInformerDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetInformerDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetInformerDto.headerRightType && epx.f(this.weight, superAppWidgetInformerDto.weight) && this.type == superAppWidgetInformerDto.type;
        }

        public final int hashCode() {
            int hashCode = this.mainText.hashCode() * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.additionalText;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.appId;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.webviewUrl;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.link;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackCode;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode8 = (hashCode7 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode9 = (hashCode8 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode10 = (hashCode9 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode11 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetInformerDto(mainText=");
            sb.append(this.mainText);
            sb.append(", headerIcon=");
            sb.append(this.headerIcon);
            sb.append(", additionalText=");
            sb.append(this.additionalText);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", webviewUrl=");
            sb.append(this.webviewUrl);
            sb.append(", link=");
            sb.append(this.link);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mainText);
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.additionalText);
            Integer num = this.appId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.webviewUrl);
            parcel.writeString(this.link);
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetInformerDto(String str, List<SuperAppUniversalWidgetImageItemDto> list, String str2, Integer num, String str3, String str4, String str5, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.mainText = str;
            this.headerIcon = list;
            this.additionalText = str2;
            this.appId = num;
            this.webviewUrl = str3;
            this.link = str4;
            this.trackCode = str5;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetMiniappsDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetMiniappsDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppAppListItemDto> items;

        @pmi0("link")
        private final String link;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetMiniappsDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetMiniappsDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppAppListItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppWidgetMiniappsDto(readString, readString2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetMiniappsDto[] newArray(int i) {
                return new SuperAppWidgetMiniappsDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetMiniappsDto(String str, String str2, List list, String str3, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : superAppAccessibilityDto, (i & 32) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 64) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetMiniappsDto)) {
                return false;
            }
            SuperAppWidgetMiniappsDto superAppWidgetMiniappsDto = (SuperAppWidgetMiniappsDto) obj;
            return epx.f(this.title, superAppWidgetMiniappsDto.title) && epx.f(this.link, superAppWidgetMiniappsDto.link) && epx.f(this.items, superAppWidgetMiniappsDto.items) && epx.f(this.trackCode, superAppWidgetMiniappsDto.trackCode) && epx.f(this.accessibility, superAppWidgetMiniappsDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetMiniappsDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetMiniappsDto.headerRightType && epx.f(this.weight, superAppWidgetMiniappsDto.weight) && this.type == superAppWidgetMiniappsDto.type;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.link;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<SuperAppAppListItemDto> list = this.items;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode5 = (hashCode4 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode7 = (hashCode6 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode8 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetMiniappsDto(title=");
            sb.append(this.title);
            sb.append(", link=");
            sb.append(this.link);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.link);
            List<SuperAppAppListItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppAppListItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetMiniappsDto(String str, String str2, List<SuperAppAppListItemDto> list, String str3, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.link = str2;
            this.items = list;
            this.trackCode = str3;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetMusicDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetMusicDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("additional_text")
        private final String additionalText;

        @pmi0("block_id")
        private final String blockId;

        @pmi0("cover_photos_url")
        private final List<BaseImageDto> coverPhotosUrl;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("link")
        private final String link;

        @pmi0("main_text")
        private final String mainText;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetMusicDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetMusicDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(SuperAppWidgetMusicDto.class, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppWidgetMusicDto(readString, readString2, readString3, readString4, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetMusicDto[] newArray(int i) {
                return new SuperAppWidgetMusicDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetMusicDto(String str, String str2, String str3, String str4, List list, String str5, String str6, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : superAppAccessibilityDto, (i & 256) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 512) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetMusicDto)) {
                return false;
            }
            SuperAppWidgetMusicDto superAppWidgetMusicDto = (SuperAppWidgetMusicDto) obj;
            return epx.f(this.title, superAppWidgetMusicDto.title) && epx.f(this.mainText, superAppWidgetMusicDto.mainText) && epx.f(this.link, superAppWidgetMusicDto.link) && epx.f(this.additionalText, superAppWidgetMusicDto.additionalText) && epx.f(this.coverPhotosUrl, superAppWidgetMusicDto.coverPhotosUrl) && epx.f(this.trackCode, superAppWidgetMusicDto.trackCode) && epx.f(this.blockId, superAppWidgetMusicDto.blockId) && epx.f(this.accessibility, superAppWidgetMusicDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetMusicDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetMusicDto.headerRightType && epx.f(this.weight, superAppWidgetMusicDto.weight) && this.type == superAppWidgetMusicDto.type;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.mainText), 31, this.link);
            String str = this.additionalText;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            List<BaseImageDto> list = this.coverPhotosUrl;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.blockId;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode5 = (hashCode4 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode7 = (hashCode6 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode8 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetMusicDto(title=");
            sb.append(this.title);
            sb.append(", mainText=");
            sb.append(this.mainText);
            sb.append(", link=");
            sb.append(this.link);
            sb.append(", additionalText=");
            sb.append(this.additionalText);
            sb.append(", coverPhotosUrl=");
            sb.append(this.coverPhotosUrl);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", blockId=");
            sb.append(this.blockId);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.mainText);
            parcel.writeString(this.link);
            parcel.writeString(this.additionalText);
            List<BaseImageDto> list = this.coverPhotosUrl;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeString(this.trackCode);
            parcel.writeString(this.blockId);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetMusicDto(String str, String str2, String str3, String str4, List<BaseImageDto> list, String str5, String str6, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.mainText = str2;
            this.link = str3;
            this.additionalText = str4;
            this.coverPhotosUrl = list;
            this.trackCode = str5;
            this.blockId = str6;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetOnboardingPanelDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetOnboardingPanelDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("action")
        private final SuperAppWidgetOnboardingPanelActionDto action;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("closable")
        private final boolean closable;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("icon")
        private final List<SuperAppUniversalWidgetImageItemDto> icon;

        @pmi0("icon_color")
        private final List<String> iconColor;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetOnboardingPanelDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetOnboardingPanelDto createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppWidgetOnboardingPanelDto(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), (SuperAppWidgetOnboardingPanelActionDto) parcel.readParcelable(SuperAppWidgetOnboardingPanelDto.class.getClassLoader()), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetOnboardingPanelDto[] newArray(int i) {
                return new SuperAppWidgetOnboardingPanelDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetOnboardingPanelDto(List list, String str, String str2, boolean z, String str3, List list2, SuperAppWidgetOnboardingPanelActionDto superAppWidgetOnboardingPanelActionDto, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(list, str, str2, z, str3, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : superAppWidgetOnboardingPanelActionDto, (i & 128) != 0 ? null : superAppAccessibilityDto, (i & 256) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 512) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetOnboardingPanelDto)) {
                return false;
            }
            SuperAppWidgetOnboardingPanelDto superAppWidgetOnboardingPanelDto = (SuperAppWidgetOnboardingPanelDto) obj;
            return epx.f(this.icon, superAppWidgetOnboardingPanelDto.icon) && epx.f(this.title, superAppWidgetOnboardingPanelDto.title) && epx.f(this.subtitle, superAppWidgetOnboardingPanelDto.subtitle) && this.closable == superAppWidgetOnboardingPanelDto.closable && epx.f(this.trackCode, superAppWidgetOnboardingPanelDto.trackCode) && epx.f(this.iconColor, superAppWidgetOnboardingPanelDto.iconColor) && epx.f(this.action, superAppWidgetOnboardingPanelDto.action) && epx.f(this.accessibility, superAppWidgetOnboardingPanelDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetOnboardingPanelDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetOnboardingPanelDto.headerRightType && epx.f(this.weight, superAppWidgetOnboardingPanelDto.weight) && this.type == superAppWidgetOnboardingPanelDto.type;
        }

        public final int hashCode() {
            int a2 = urd0.a(qoy.b(urd0.a(urd0.a(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.closable), 31, this.trackCode);
            List<String> list = this.iconColor;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            SuperAppWidgetOnboardingPanelActionDto superAppWidgetOnboardingPanelActionDto = this.action;
            int hashCode2 = (hashCode + (superAppWidgetOnboardingPanelActionDto == null ? 0 : superAppWidgetOnboardingPanelActionDto.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode3 = (hashCode2 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode4 = (hashCode3 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode6 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetOnboardingPanelDto(icon=");
            sb.append(this.icon);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", closable=");
            sb.append(this.closable);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", iconColor=");
            sb.append(this.iconColor);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.icon);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.closable ? 1 : 0);
            parcel.writeString(this.trackCode);
            parcel.writeStringList(this.iconColor);
            parcel.writeParcelable(this.action, i);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f = this.weight;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetOnboardingPanelDto(List<SuperAppUniversalWidgetImageItemDto> list, String str, String str2, boolean z, String str3, List<String> list2, SuperAppWidgetOnboardingPanelActionDto superAppWidgetOnboardingPanelActionDto, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.icon = list;
            this.title = str;
            this.subtitle = str2;
            this.closable = z;
            this.trackCode = str3;
            this.iconColor = list2;
            this.action = superAppWidgetOnboardingPanelActionDto;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetPromoDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetPromoDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppWidgetPromoItemDto> items;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetPromoDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetPromoDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(SuperAppWidgetPromoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppWidgetPromoItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppWidgetPromoDto(baseLinkButtonDto, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetPromoDto[] newArray(int i) {
                return new SuperAppWidgetPromoDto[i];
            }
        }

        public SuperAppWidgetPromoDto() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetPromoDto)) {
                return false;
            }
            SuperAppWidgetPromoDto superAppWidgetPromoDto = (SuperAppWidgetPromoDto) obj;
            return epx.f(this.button, superAppWidgetPromoDto.button) && epx.f(this.items, superAppWidgetPromoDto.items) && epx.f(this.trackCode, superAppWidgetPromoDto.trackCode) && epx.f(this.accessibility, superAppWidgetPromoDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetPromoDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetPromoDto.headerRightType && epx.f(this.weight, superAppWidgetPromoDto.weight) && this.type == superAppWidgetPromoDto.type;
        }

        public final int hashCode() {
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            int hashCode = (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode()) * 31;
            List<SuperAppWidgetPromoItemDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode4 = (hashCode3 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode7 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetPromoDto(button=");
            sb.append(this.button);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.button, i);
            List<SuperAppWidgetPromoItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppWidgetPromoItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppWidgetPromoDto(BaseLinkButtonDto baseLinkButtonDto, List list, String str, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : baseLinkButtonDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : superAppAccessibilityDto, (i & 16) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 32) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        public SuperAppWidgetPromoDto(BaseLinkButtonDto baseLinkButtonDto, List<SuperAppWidgetPromoItemDto> list, String str, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.button = baseLinkButtonDto;
            this.items = list;
            this.trackCode = str;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetShowcaseMenuDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetShowcaseMenuDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("footer")
        private final SuperAppCustomMenuItemDto footer;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("items")
        private final List<SuperAppCustomMenuItemDto> items;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetShowcaseMenuDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetShowcaseMenuDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppCustomMenuItemDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new SuperAppWidgetShowcaseMenuDto(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : SuperAppCustomMenuItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetShowcaseMenuDto[] newArray(int i) {
                return new SuperAppWidgetShowcaseMenuDto[i];
            }
        }

        public SuperAppWidgetShowcaseMenuDto() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetShowcaseMenuDto)) {
                return false;
            }
            SuperAppWidgetShowcaseMenuDto superAppWidgetShowcaseMenuDto = (SuperAppWidgetShowcaseMenuDto) obj;
            return epx.f(this.items, superAppWidgetShowcaseMenuDto.items) && epx.f(this.trackCode, superAppWidgetShowcaseMenuDto.trackCode) && epx.f(this.footer, superAppWidgetShowcaseMenuDto.footer) && epx.f(this.accessibility, superAppWidgetShowcaseMenuDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetShowcaseMenuDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetShowcaseMenuDto.headerRightType && epx.f(this.weight, superAppWidgetShowcaseMenuDto.weight) && this.type == superAppWidgetShowcaseMenuDto.type;
        }

        public final int hashCode() {
            List<SuperAppCustomMenuItemDto> list = this.items;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.trackCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppCustomMenuItemDto superAppCustomMenuItemDto = this.footer;
            int hashCode3 = (hashCode2 + (superAppCustomMenuItemDto == null ? 0 : superAppCustomMenuItemDto.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode4 = (hashCode3 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode5 = (hashCode4 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode6 = (hashCode5 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode7 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetShowcaseMenuDto(items=");
            sb.append(this.items);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<SuperAppCustomMenuItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppCustomMenuItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.trackCode);
            SuperAppCustomMenuItemDto superAppCustomMenuItemDto = this.footer;
            if (superAppCustomMenuItemDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppCustomMenuItemDto.writeToParcel(parcel, i);
            }
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppWidgetShowcaseMenuDto(List list, String str, SuperAppCustomMenuItemDto superAppCustomMenuItemDto, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : superAppCustomMenuItemDto, (i & 8) != 0 ? null : superAppAccessibilityDto, (i & 16) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 32) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        public SuperAppWidgetShowcaseMenuDto(List<SuperAppCustomMenuItemDto> list, String str, SuperAppCustomMenuItemDto superAppCustomMenuItemDto, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.items = list;
            this.trackCode = str;
            this.footer = superAppCustomMenuItemDto;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetSkeletonDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetSkeletonDto> CREATOR = new a();

        @pmi0("type")
        private final String type;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetSkeletonDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetSkeletonDto createFromParcel(Parcel parcel) {
                return new SuperAppWidgetSkeletonDto(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetSkeletonDto[] newArray(int i) {
                return new SuperAppWidgetSkeletonDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetSkeletonDto(String str, Float f, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : f);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetSkeletonDto)) {
                return false;
            }
            SuperAppWidgetSkeletonDto superAppWidgetSkeletonDto = (SuperAppWidgetSkeletonDto) obj;
            return epx.f(this.type, superAppWidgetSkeletonDto.type) && epx.f(this.weight, superAppWidgetSkeletonDto.weight);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            Float f = this.weight;
            return hashCode + (f == null ? 0 : f.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetSkeletonDto(type=");
            sb.append(this.type);
            sb.append(", weight=");
            return so.b(sb, this.weight, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            Float f = this.weight;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
        }

        public SuperAppWidgetSkeletonDto(String str, Float f) {
            super(null);
            this.type = str;
            this.weight = f;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetVkRunDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetVkRunDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("app_id")
        private final Integer appId;

        @pmi0("background_sync_config")
        private final VkRunBackgroundSyncConfigDto backgroundSyncConfig;

        @pmi0("extra")
        private final SuperAppWidgetVkRunExtraDto extra;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("km_count")
        private final Float kmCount;

        @pmi0("km_count_text")
        private final String kmCountText;

        @pmi0("leaderboard")
        private final VkRunLeaderboardDto leaderboard;

        @pmi0("new_user_content")
        private final SuperAppWidgetVkRunNewUserContentDto newUserContent;

        @pmi0("step_count")
        private final Integer stepCount;

        @pmi0("step_count_text")
        private final String stepCountText;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("webview_url")
        private final String webviewUrl;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetVkRunDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkRunDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String str;
                SuperAppUniversalWidgetHeaderRightTypeDto createFromParcel;
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                String readString3 = parcel.readString();
                VkRunLeaderboardDto createFromParcel2 = parcel.readInt() == 0 ? null : VkRunLeaderboardDto.CREATOR.createFromParcel(parcel);
                VkRunBackgroundSyncConfigDto createFromParcel3 = parcel.readInt() == 0 ? null : VkRunBackgroundSyncConfigDto.CREATOR.createFromParcel(parcel);
                SuperAppWidgetVkRunExtraDto createFromParcel4 = parcel.readInt() == 0 ? null : SuperAppWidgetVkRunExtraDto.CREATOR.createFromParcel(parcel);
                SuperAppWidgetVkRunNewUserContentDto createFromParcel5 = parcel.readInt() == 0 ? null : SuperAppWidgetVkRunNewUserContentDto.CREATOR.createFromParcel(parcel);
                Integer num = valueOf;
                Integer num2 = valueOf2;
                Float f = valueOf3;
                String readString4 = parcel.readString();
                SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = null;
                String readString5 = parcel.readString();
                SuperAppAccessibilityDto createFromParcel6 = parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    superAppUniversalWidgetAdditionalHeaderIconDto = SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel);
                }
                SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto2 = superAppUniversalWidgetAdditionalHeaderIconDto;
                if (parcel.readInt() == 0) {
                    str = readString;
                    createFromParcel = null;
                } else {
                    str = readString;
                    createFromParcel = SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel);
                }
                return new SuperAppWidgetVkRunDto(str, arrayList, num, num2, readString2, f, readString3, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, readString4, readString5, createFromParcel6, superAppUniversalWidgetAdditionalHeaderIconDto2, createFromParcel, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkRunDto[] newArray(int i) {
                return new SuperAppWidgetVkRunDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetVkRunDto(String str, List list, Integer num, Integer num2, String str2, Float f, String str3, VkRunLeaderboardDto vkRunLeaderboardDto, VkRunBackgroundSyncConfigDto vkRunBackgroundSyncConfigDto, SuperAppWidgetVkRunExtraDto superAppWidgetVkRunExtraDto, SuperAppWidgetVkRunNewUserContentDto superAppWidgetVkRunNewUserContentDto, String str4, String str5, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f2, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : vkRunLeaderboardDto, (i & 256) != 0 ? null : vkRunBackgroundSyncConfigDto, (i & 512) != 0 ? null : superAppWidgetVkRunExtraDto, (i & 1024) != 0 ? null : superAppWidgetVkRunNewUserContentDto, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : superAppAccessibilityDto, (i & 16384) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 32768) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 65536) != 0 ? null : f2, (i & 131072) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetVkRunDto)) {
                return false;
            }
            SuperAppWidgetVkRunDto superAppWidgetVkRunDto = (SuperAppWidgetVkRunDto) obj;
            return epx.f(this.title, superAppWidgetVkRunDto.title) && epx.f(this.headerIcon, superAppWidgetVkRunDto.headerIcon) && epx.f(this.appId, superAppWidgetVkRunDto.appId) && epx.f(this.stepCount, superAppWidgetVkRunDto.stepCount) && epx.f(this.stepCountText, superAppWidgetVkRunDto.stepCountText) && epx.f(this.kmCount, superAppWidgetVkRunDto.kmCount) && epx.f(this.kmCountText, superAppWidgetVkRunDto.kmCountText) && epx.f(this.leaderboard, superAppWidgetVkRunDto.leaderboard) && epx.f(this.backgroundSyncConfig, superAppWidgetVkRunDto.backgroundSyncConfig) && epx.f(this.extra, superAppWidgetVkRunDto.extra) && epx.f(this.newUserContent, superAppWidgetVkRunDto.newUserContent) && epx.f(this.trackCode, superAppWidgetVkRunDto.trackCode) && epx.f(this.webviewUrl, superAppWidgetVkRunDto.webviewUrl) && epx.f(this.accessibility, superAppWidgetVkRunDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetVkRunDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetVkRunDto.headerRightType && epx.f(this.weight, superAppWidgetVkRunDto.weight) && this.type == superAppWidgetVkRunDto.type;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.appId;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.stepCount;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.stepCountText;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            Float f = this.kmCount;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            String str2 = this.kmCountText;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            VkRunLeaderboardDto vkRunLeaderboardDto = this.leaderboard;
            int hashCode8 = (hashCode7 + (vkRunLeaderboardDto == null ? 0 : vkRunLeaderboardDto.hashCode())) * 31;
            VkRunBackgroundSyncConfigDto vkRunBackgroundSyncConfigDto = this.backgroundSyncConfig;
            int hashCode9 = (hashCode8 + (vkRunBackgroundSyncConfigDto == null ? 0 : vkRunBackgroundSyncConfigDto.hashCode())) * 31;
            SuperAppWidgetVkRunExtraDto superAppWidgetVkRunExtraDto = this.extra;
            int hashCode10 = (hashCode9 + (superAppWidgetVkRunExtraDto == null ? 0 : superAppWidgetVkRunExtraDto.hashCode())) * 31;
            SuperAppWidgetVkRunNewUserContentDto superAppWidgetVkRunNewUserContentDto = this.newUserContent;
            int hashCode11 = (hashCode10 + (superAppWidgetVkRunNewUserContentDto == null ? 0 : superAppWidgetVkRunNewUserContentDto.hashCode())) * 31;
            String str3 = this.trackCode;
            int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.webviewUrl;
            int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode14 = (hashCode13 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode15 = (hashCode14 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode16 = (hashCode15 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f2 = this.weight;
            int hashCode17 = (hashCode16 + (f2 == null ? 0 : f2.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode17 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetVkRunDto(title=");
            sb.append(this.title);
            sb.append(", headerIcon=");
            sb.append(this.headerIcon);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", stepCount=");
            sb.append(this.stepCount);
            sb.append(", stepCountText=");
            sb.append(this.stepCountText);
            sb.append(", kmCount=");
            sb.append(this.kmCount);
            sb.append(", kmCountText=");
            sb.append(this.kmCountText);
            sb.append(", leaderboard=");
            sb.append(this.leaderboard);
            sb.append(", backgroundSyncConfig=");
            sb.append(this.backgroundSyncConfig);
            sb.append(", extra=");
            sb.append(this.extra);
            sb.append(", newUserContent=");
            sb.append(this.newUserContent);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", webviewUrl=");
            sb.append(this.webviewUrl);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            Integer num = this.appId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Integer num2 = this.stepCount;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            parcel.writeString(this.stepCountText);
            Float f2 = this.kmCount;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            parcel.writeString(this.kmCountText);
            VkRunLeaderboardDto vkRunLeaderboardDto = this.leaderboard;
            if (vkRunLeaderboardDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                vkRunLeaderboardDto.writeToParcel(parcel, i);
            }
            VkRunBackgroundSyncConfigDto vkRunBackgroundSyncConfigDto = this.backgroundSyncConfig;
            if (vkRunBackgroundSyncConfigDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                vkRunBackgroundSyncConfigDto.writeToParcel(parcel, i);
            }
            SuperAppWidgetVkRunExtraDto superAppWidgetVkRunExtraDto = this.extra;
            if (superAppWidgetVkRunExtraDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetVkRunExtraDto.writeToParcel(parcel, i);
            }
            SuperAppWidgetVkRunNewUserContentDto superAppWidgetVkRunNewUserContentDto = this.newUserContent;
            if (superAppWidgetVkRunNewUserContentDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetVkRunNewUserContentDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            parcel.writeString(this.webviewUrl);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f3 = this.weight;
            if (f3 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f3);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetVkRunDto(String str, List<SuperAppUniversalWidgetImageItemDto> list, Integer num, Integer num2, String str2, Float f, String str3, VkRunLeaderboardDto vkRunLeaderboardDto, VkRunBackgroundSyncConfigDto vkRunBackgroundSyncConfigDto, SuperAppWidgetVkRunExtraDto superAppWidgetVkRunExtraDto, SuperAppWidgetVkRunNewUserContentDto superAppWidgetVkRunNewUserContentDto, String str4, String str5, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f2, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.headerIcon = list;
            this.appId = num;
            this.stepCount = num2;
            this.stepCountText = str2;
            this.kmCount = f;
            this.kmCountText = str3;
            this.leaderboard = vkRunLeaderboardDto;
            this.backgroundSyncConfig = vkRunBackgroundSyncConfigDto;
            this.extra = superAppWidgetVkRunExtraDto;
            this.newUserContent = superAppWidgetVkRunNewUserContentDto;
            this.trackCode = str4;
            this.webviewUrl = str5;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f2;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetVkTaxiDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetVkTaxiDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("app_id")
        private final int appId;

        @pmi0("header_icon")
        private final List<SuperAppUniversalWidgetImageItemDto> headerIcon;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("payload")
        private final SuperAppWidgetVkTaxiStateDto payload;

        @pmi0("queue")
        private final String queue;

        @pmi0("state")
        private final StateDto state;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("webview_url")
        private final String webviewUrl;

        @pmi0("weight")
        private final Float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class StateDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ StateDto[] $VALUES;
            public static final Parcelable.Creator<StateDto> CREATOR;

            @pmi0("order_status")
            public static final StateDto ORDER_STATUS;

            @pmi0("request_geo")
            public static final StateDto REQUEST_GEO;

            @pmi0("rides_suggestion")
            public static final StateDto RIDES_SUGGESTION;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
            public static final class a implements Parcelable.Creator<StateDto> {
                @Override // android.os.Parcelable.Creator
                public final StateDto createFromParcel(Parcel parcel) {
                    return StateDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final StateDto[] newArray(int i) {
                    return new StateDto[i];
                }
            }

            static {
                StateDto stateDto = new StateDto("REQUEST_GEO", 0, "request_geo");
                REQUEST_GEO = stateDto;
                StateDto stateDto2 = new StateDto("RIDES_SUGGESTION", 1, "rides_suggestion");
                RIDES_SUGGESTION = stateDto2;
                StateDto stateDto3 = new StateDto("ORDER_STATUS", 2, "order_status");
                ORDER_STATUS = stateDto3;
                StateDto[] stateDtoArr = {stateDto, stateDto2, stateDto3};
                $VALUES = stateDtoArr;
                $ENTRIES = new asp(stateDtoArr);
                CREATOR = new a();
            }

            private StateDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static StateDto valueOf(String str) {
                return (StateDto) Enum.valueOf(StateDto.class, str);
            }

            public static StateDto[] values() {
                return (StateDto[]) $VALUES.clone();
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetVkTaxiDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkTaxiDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                String readString2 = parcel.readString();
                StateDto createFromParcel = StateDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new SuperAppWidgetVkTaxiDto(readString, readInt, readString2, createFromParcel, arrayList, parcel.readString(), (SuperAppWidgetVkTaxiStateDto) parcel.readParcelable(SuperAppWidgetVkTaxiDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkTaxiDto[] newArray(int i) {
                return new SuperAppWidgetVkTaxiDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetVkTaxiDto(String str, int i, String str2, StateDto stateDto, List list, String str3, SuperAppWidgetVkTaxiStateDto superAppWidgetVkTaxiStateDto, String str4, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i2, zcl zclVar) {
            this(str, i, str2, stateDto, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : superAppWidgetVkTaxiStateDto, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : superAppAccessibilityDto, (i2 & 512) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i2 & 1024) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i2 & 2048) != 0 ? null : f, (i2 & 4096) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetVkTaxiDto)) {
                return false;
            }
            SuperAppWidgetVkTaxiDto superAppWidgetVkTaxiDto = (SuperAppWidgetVkTaxiDto) obj;
            return epx.f(this.title, superAppWidgetVkTaxiDto.title) && this.appId == superAppWidgetVkTaxiDto.appId && epx.f(this.webviewUrl, superAppWidgetVkTaxiDto.webviewUrl) && this.state == superAppWidgetVkTaxiDto.state && epx.f(this.headerIcon, superAppWidgetVkTaxiDto.headerIcon) && epx.f(this.queue, superAppWidgetVkTaxiDto.queue) && epx.f(this.payload, superAppWidgetVkTaxiDto.payload) && epx.f(this.trackCode, superAppWidgetVkTaxiDto.trackCode) && epx.f(this.accessibility, superAppWidgetVkTaxiDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetVkTaxiDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetVkTaxiDto.headerRightType && epx.f(this.weight, superAppWidgetVkTaxiDto.weight) && this.type == superAppWidgetVkTaxiDto.type;
        }

        public final int hashCode() {
            int hashCode = (this.state.hashCode() + urd0.a(shy.a(this.appId, this.title.hashCode() * 31, 31), 31, this.webviewUrl)) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.queue;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppWidgetVkTaxiStateDto superAppWidgetVkTaxiStateDto = this.payload;
            int hashCode4 = (hashCode3 + (superAppWidgetVkTaxiStateDto == null ? 0 : superAppWidgetVkTaxiStateDto.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode6 = (hashCode5 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode7 = (hashCode6 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode8 = (hashCode7 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode9 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetVkTaxiDto(title=");
            sb.append(this.title);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", webviewUrl=");
            sb.append(this.webviewUrl);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", headerIcon=");
            sb.append(this.headerIcon);
            sb.append(", queue=");
            sb.append(this.queue);
            sb.append(", payload=");
            sb.append(this.payload);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeInt(this.appId);
            parcel.writeString(this.webviewUrl);
            this.state.writeToParcel(parcel, i);
            List<SuperAppUniversalWidgetImageItemDto> list = this.headerIcon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.queue);
            parcel.writeParcelable(this.payload, i);
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetVkTaxiDto(String str, int i, String str2, StateDto stateDto, List<SuperAppUniversalWidgetImageItemDto> list, String str3, SuperAppWidgetVkTaxiStateDto superAppWidgetVkTaxiStateDto, String str4, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.appId = i;
            this.webviewUrl = str2;
            this.state = stateDto;
            this.headerIcon = list;
            this.queue = str3;
            this.payload = superAppWidgetVkTaxiStateDto;
            this.trackCode = str4;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetVkpaySlimDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetVkpaySlimDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("balance")
        private final Float balance;

        @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
        private final CurrencyDto currency;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("is_hidden")
        private final Boolean isHidden;

        @pmi0("status")
        private final StatusDto status;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("weight")
        private final Float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class CurrencyDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ CurrencyDto[] $VALUES;
            public static final Parcelable.Creator<CurrencyDto> CREATOR;

            @pmi0("RUB")
            public static final CurrencyDto RUB;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
            public static final class a implements Parcelable.Creator<CurrencyDto> {
                @Override // android.os.Parcelable.Creator
                public final CurrencyDto createFromParcel(Parcel parcel) {
                    return CurrencyDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CurrencyDto[] newArray(int i) {
                    return new CurrencyDto[i];
                }
            }

            static {
                CurrencyDto currencyDto = new CurrencyDto("RUB", 0, "RUB");
                RUB = currencyDto;
                CurrencyDto[] currencyDtoArr = {currencyDto};
                $VALUES = currencyDtoArr;
                $ENTRIES = new asp(currencyDtoArr);
                CREATOR = new a();
            }

            private CurrencyDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static CurrencyDto valueOf(String str) {
                return (CurrencyDto) Enum.valueOf(CurrencyDto.class, str);
            }

            public static CurrencyDto[] values() {
                return (CurrencyDto[]) $VALUES.clone();
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
        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class StatusDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ StatusDto[] $VALUES;

            @pmi0(SignalingProtocol.KEY_ACTIVE)
            public static final StatusDto ACTIVE;
            public static final Parcelable.Creator<StatusDto> CREATOR;

            @pmi0("inactive")
            public static final StatusDto INACTIVE;
            private final String value;

            /* compiled from: SuperAppWidgetPayloadDto.kt */
            public static final class a implements Parcelable.Creator<StatusDto> {
                @Override // android.os.Parcelable.Creator
                public final StatusDto createFromParcel(Parcel parcel) {
                    return StatusDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final StatusDto[] newArray(int i) {
                    return new StatusDto[i];
                }
            }

            static {
                StatusDto statusDto = new StatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
                ACTIVE = statusDto;
                StatusDto statusDto2 = new StatusDto("INACTIVE", 1, "inactive");
                INACTIVE = statusDto2;
                StatusDto[] statusDtoArr = {statusDto, statusDto2};
                $VALUES = statusDtoArr;
                $ENTRIES = new asp(statusDtoArr);
                CREATOR = new a();
            }

            private StatusDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static StatusDto valueOf(String str) {
                return (StatusDto) Enum.valueOf(StatusDto.class, str);
            }

            public static StatusDto[] values() {
                return (StatusDto[]) $VALUES.clone();
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

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetVkpaySlimDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkpaySlimDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                StatusDto createFromParcel = parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SuperAppWidgetVkpaySlimDto(createFromParcel, valueOf, parcel.readInt() == 0 ? null : CurrencyDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetVkpaySlimDto[] newArray(int i) {
                return new SuperAppWidgetVkpaySlimDto[i];
            }
        }

        public SuperAppWidgetVkpaySlimDto() {
            this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetVkpaySlimDto)) {
                return false;
            }
            SuperAppWidgetVkpaySlimDto superAppWidgetVkpaySlimDto = (SuperAppWidgetVkpaySlimDto) obj;
            return this.status == superAppWidgetVkpaySlimDto.status && epx.f(this.isHidden, superAppWidgetVkpaySlimDto.isHidden) && this.currency == superAppWidgetVkpaySlimDto.currency && epx.f(this.trackCode, superAppWidgetVkpaySlimDto.trackCode) && epx.f(this.balance, superAppWidgetVkpaySlimDto.balance) && epx.f(this.accessibility, superAppWidgetVkpaySlimDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetVkpaySlimDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetVkpaySlimDto.headerRightType && epx.f(this.weight, superAppWidgetVkpaySlimDto.weight) && this.type == superAppWidgetVkpaySlimDto.type;
        }

        public final int hashCode() {
            StatusDto statusDto = this.status;
            int hashCode = (statusDto == null ? 0 : statusDto.hashCode()) * 31;
            Boolean bool = this.isHidden;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            CurrencyDto currencyDto = this.currency;
            int hashCode3 = (hashCode2 + (currencyDto == null ? 0 : currencyDto.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Float f = this.balance;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode6 = (hashCode5 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode7 = (hashCode6 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode8 = (hashCode7 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f2 = this.weight;
            int hashCode9 = (hashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode9 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetVkpaySlimDto(status=");
            sb.append(this.status);
            sb.append(", isHidden=");
            sb.append(this.isHidden);
            sb.append(", currency=");
            sb.append(this.currency);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", balance=");
            sb.append(this.balance);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            StatusDto statusDto = this.status;
            if (statusDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                statusDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.isHidden;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            CurrencyDto currencyDto = this.currency;
            if (currencyDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                currencyDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            Float f = this.balance;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ SuperAppWidgetVkpaySlimDto(StatusDto statusDto, Boolean bool, CurrencyDto currencyDto, String str, Float f, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f2, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : statusDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : currencyDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : superAppAccessibilityDto, (i & 64) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 128) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 256) != 0 ? null : f2, (i & 512) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        public SuperAppWidgetVkpaySlimDto(StatusDto statusDto, Boolean bool, CurrencyDto currencyDto, String str, Float f, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f2, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.status = statusDto;
            this.isHidden = bool;
            this.currency = currencyDto;
            this.trackCode = str;
            this.balance = f;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f2;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    /* compiled from: SuperAppWidgetPayloadDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppWidgetWeatherDto extends SuperAppWidgetPayloadDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppWidgetWeatherDto> CREATOR = new a();

        @pmi0("accessibility")
        private final SuperAppAccessibilityDto accessibility;

        @pmi0("additional_header_icon")
        private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

        @pmi0("app_id")
        private final Integer appId;

        @pmi0("header_right_type")
        private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

        @pmi0("images")
        private final List<BaseImageDto> images;

        @pmi0("main_description")
        private final String mainDescription;

        @pmi0("short_description")
        private final String shortDescription;

        @pmi0("short_description_additional_value")
        private final String shortDescriptionAdditionalValue;

        @pmi0("temperature")
        private final String temperature;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final SuperAppWidgetPayloadTypesDto type;

        @pmi0("webview_url")
        private final String webviewUrl;

        @pmi0("weight")
        private final Float weight;

        /* compiled from: SuperAppWidgetPayloadDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppWidgetWeatherDto> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetWeatherDto createFromParcel(Parcel parcel) {
                Integer valueOf;
                ArrayList arrayList;
                ArrayList arrayList2;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                    arrayList = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                    arrayList = null;
                }
                String readString4 = parcel.readString();
                ArrayList arrayList3 = arrayList;
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList2 = arrayList3;
                } else {
                    int readInt = parcel.readInt();
                    arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(SuperAppWidgetWeatherDto.class, parcel, arrayList2, i, 1);
                    }
                }
                return new SuperAppWidgetWeatherDto(readString, readString2, readString3, valueOf, readString4, readString5, readString6, arrayList2, parcel.readString(), (SuperAppAccessibilityDto) (parcel.readInt() == 0 ? arrayList3 : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel)), (SuperAppUniversalWidgetAdditionalHeaderIconDto) (parcel.readInt() == 0 ? arrayList3 : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel)), (SuperAppUniversalWidgetHeaderRightTypeDto) (parcel.readInt() == 0 ? arrayList3 : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? arrayList3 : Float.valueOf(parcel.readFloat()), (SuperAppWidgetPayloadTypesDto) (parcel.readInt() == 0 ? arrayList3 : SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel)));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppWidgetWeatherDto[] newArray(int i) {
                return new SuperAppWidgetWeatherDto[i];
            }
        }

        public /* synthetic */ SuperAppWidgetWeatherDto(String str, String str2, String str3, Integer num, String str4, String str5, String str6, List list, String str7, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
            this(str, str2, str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : superAppAccessibilityDto, (i & 1024) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 2048) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 4096) != 0 ? null : f, (i & 8192) != 0 ? null : superAppWidgetPayloadTypesDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppWidgetWeatherDto)) {
                return false;
            }
            SuperAppWidgetWeatherDto superAppWidgetWeatherDto = (SuperAppWidgetWeatherDto) obj;
            return epx.f(this.title, superAppWidgetWeatherDto.title) && epx.f(this.temperature, superAppWidgetWeatherDto.temperature) && epx.f(this.mainDescription, superAppWidgetWeatherDto.mainDescription) && epx.f(this.appId, superAppWidgetWeatherDto.appId) && epx.f(this.webviewUrl, superAppWidgetWeatherDto.webviewUrl) && epx.f(this.shortDescription, superAppWidgetWeatherDto.shortDescription) && epx.f(this.shortDescriptionAdditionalValue, superAppWidgetWeatherDto.shortDescriptionAdditionalValue) && epx.f(this.images, superAppWidgetWeatherDto.images) && epx.f(this.trackCode, superAppWidgetWeatherDto.trackCode) && epx.f(this.accessibility, superAppWidgetWeatherDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetWeatherDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetWeatherDto.headerRightType && epx.f(this.weight, superAppWidgetWeatherDto.weight) && this.type == superAppWidgetWeatherDto.type;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.temperature), 31, this.mainDescription);
            Integer num = this.appId;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.webviewUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.shortDescription;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.shortDescriptionAdditionalValue;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<BaseImageDto> list = this.images;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.trackCode;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            int hashCode7 = (hashCode6 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            int hashCode8 = (hashCode7 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            int hashCode9 = (hashCode8 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
            Float f = this.weight;
            int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            return hashCode10 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppWidgetWeatherDto(title=");
            sb.append(this.title);
            sb.append(", temperature=");
            sb.append(this.temperature);
            sb.append(", mainDescription=");
            sb.append(this.mainDescription);
            sb.append(", appId=");
            sb.append(this.appId);
            sb.append(", webviewUrl=");
            sb.append(this.webviewUrl);
            sb.append(", shortDescription=");
            sb.append(this.shortDescription);
            sb.append(", shortDescriptionAdditionalValue=");
            sb.append(this.shortDescriptionAdditionalValue);
            sb.append(", images=");
            sb.append(this.images);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", accessibility=");
            sb.append(this.accessibility);
            sb.append(", additionalHeaderIcon=");
            sb.append(this.additionalHeaderIcon);
            sb.append(", headerRightType=");
            sb.append(this.headerRightType);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", type=");
            return ly80.b(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.temperature);
            parcel.writeString(this.mainDescription);
            Integer num = this.appId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.webviewUrl);
            parcel.writeString(this.shortDescription);
            parcel.writeString(this.shortDescriptionAdditionalValue);
            List<BaseImageDto> list = this.images;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeString(this.trackCode);
            SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
            if (superAppAccessibilityDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppAccessibilityDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
            if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
            }
            SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
            if (superAppUniversalWidgetHeaderRightTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
            }
            Float f2 = this.weight;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
            if (superAppWidgetPayloadTypesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
            }
        }

        public SuperAppWidgetWeatherDto(String str, String str2, String str3, Integer num, String str4, String str5, String str6, List<BaseImageDto> list, String str7, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
            super(null);
            this.title = str;
            this.temperature = str2;
            this.mainDescription = str3;
            this.appId = num;
            this.webviewUrl = str4;
            this.shortDescription = str5;
            this.shortDescriptionAdditionalValue = str6;
            this.images = list;
            this.trackCode = str7;
            this.accessibility = superAppAccessibilityDto;
            this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
            this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
            this.weight = f;
            this.type = superAppWidgetPayloadTypesDto;
        }
    }

    public /* synthetic */ SuperAppWidgetPayloadDto(zcl zclVar) {
        this();
    }

    private SuperAppWidgetPayloadDto() {
    }
}
