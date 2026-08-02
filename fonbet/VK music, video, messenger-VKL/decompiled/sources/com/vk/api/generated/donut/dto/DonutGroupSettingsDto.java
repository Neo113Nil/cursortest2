package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: DonutGroupSettingsDto.kt */
/* loaded from: classes14.dex */
public final class DonutGroupSettingsDto implements Parcelable {
    public static final Parcelable.Creator<DonutGroupSettingsDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("dons_description")
    private final String donsDescription;

    @pmi0("edit_donut_unavailable_reason")
    private final String editDonutUnavailableReason;

    @pmi0("explore_post_enabled")
    private final Boolean explorePostEnabled;

    @pmi0("farewell_message")
    private final String farewellMessage;

    @pmi0("goal_limits")
    private final DonutGroupSettingsGoalLimitsDto goalLimits;

    @pmi0("is_edit_donut_available")
    private final boolean isEditDonutAvailable;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("is_one_time_payments_enabled")
    private final Boolean isOneTimePaymentsEnabled;

    @pmi0("is_show_regular_help_tips")
    private final Boolean isShowRegularHelpTips;

    @pmi0("level_limit")
    private final DonutGroupSettingsLevelLimitDto levelLimit;

    @pmi0("limited_comments_enabled")
    private final Boolean limitedCommentsEnabled;

    @pmi0("masked_pan")
    private final String maskedPan;

    @pmi0("max_price")
    private final Integer maxPrice;

    @pmi0("min_payout_threshold")
    private final Integer minPayoutThreshold;

    @pmi0("min_price")
    private final Integer minPrice;

    @pmi0("need_show_onboarding")
    private final Boolean needShowOnboarding;

    @pmi0("payout_type")
    private final String payoutType;

    @pmi0("price")
    private final Integer price;

    @pmi0("short_link")
    private final String shortLink;

    @pmi0("trial_limit")
    private final DonutGroupSettingsTrialLimitDto trialLimit;

    @pmi0("vkpay_receivers")
    private final List<UsersUserFullDto> vkpayReceivers;

    @pmi0("vkpay_recipient")
    private final Integer vkpayRecipient;

    @pmi0("welcome_message")
    private final String welcomeMessage;

    /* compiled from: DonutGroupSettingsDto.kt */
    public static final class a implements Parcelable.Creator<DonutGroupSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList;
            Boolean valueOf4;
            Boolean valueOf5;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            DonutGroupSettingsGoalLimitsDto createFromParcel = DonutGroupSettingsGoalLimitsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(UsersUserFullDto.CREATOR, parcel, arrayList, i, 1);
                    readInt = readInt;
                }
            }
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            DonutGroupSettingsLevelLimitDto createFromParcel2 = parcel.readInt() == 0 ? null : DonutGroupSettingsLevelLimitDto.CREATOR.createFromParcel(parcel);
            DonutGroupSettingsTrialLimitDto createFromParcel3 = parcel.readInt() == 0 ? null : DonutGroupSettingsTrialLimitDto.CREATOR.createFromParcel(parcel);
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
            return new DonutGroupSettingsDto(z, z2, createFromParcel, valueOf, readString, valueOf2, valueOf6, valueOf7, valueOf8, readString2, readString3, valueOf3, readString4, readString5, valueOf9, readString6, arrayList, valueOf10, readString7, readString8, createFromParcel2, createFromParcel3, valueOf4, valueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGroupSettingsDto[] newArray(int i) {
            return new DonutGroupSettingsDto[i];
        }
    }

    public DonutGroupSettingsDto(boolean z, boolean z2, DonutGroupSettingsGoalLimitsDto donutGroupSettingsGoalLimitsDto, Boolean bool, String str, Boolean bool2, Integer num, Integer num2, Integer num3, String str2, String str3, Boolean bool3, String str4, String str5, Integer num4, String str6, List<UsersUserFullDto> list, Integer num5, String str7, String str8, DonutGroupSettingsLevelLimitDto donutGroupSettingsLevelLimitDto, DonutGroupSettingsTrialLimitDto donutGroupSettingsTrialLimitDto, Boolean bool4, Boolean bool5) {
        this.isEnabled = z;
        this.isEditDonutAvailable = z2;
        this.goalLimits = donutGroupSettingsGoalLimitsDto;
        this.isOneTimePaymentsEnabled = bool;
        this.editDonutUnavailableReason = str;
        this.limitedCommentsEnabled = bool2;
        this.minPrice = num;
        this.maxPrice = num2;
        this.price = num3;
        this.description = str2;
        this.donsDescription = str3;
        this.explorePostEnabled = bool3;
        this.shortLink = str4;
        this.maskedPan = str5;
        this.vkpayRecipient = num4;
        this.payoutType = str6;
        this.vkpayReceivers = list;
        this.minPayoutThreshold = num5;
        this.welcomeMessage = str7;
        this.farewellMessage = str8;
        this.levelLimit = donutGroupSettingsLevelLimitDto;
        this.trialLimit = donutGroupSettingsTrialLimitDto;
        this.needShowOnboarding = bool4;
        this.isShowRegularHelpTips = bool5;
    }

    public final DonutGroupSettingsLevelLimitDto d() {
        return this.levelLimit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.maskedPan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGroupSettingsDto)) {
            return false;
        }
        DonutGroupSettingsDto donutGroupSettingsDto = (DonutGroupSettingsDto) obj;
        return this.isEnabled == donutGroupSettingsDto.isEnabled && this.isEditDonutAvailable == donutGroupSettingsDto.isEditDonutAvailable && epx.f(this.goalLimits, donutGroupSettingsDto.goalLimits) && epx.f(this.isOneTimePaymentsEnabled, donutGroupSettingsDto.isOneTimePaymentsEnabled) && epx.f(this.editDonutUnavailableReason, donutGroupSettingsDto.editDonutUnavailableReason) && epx.f(this.limitedCommentsEnabled, donutGroupSettingsDto.limitedCommentsEnabled) && epx.f(this.minPrice, donutGroupSettingsDto.minPrice) && epx.f(this.maxPrice, donutGroupSettingsDto.maxPrice) && epx.f(this.price, donutGroupSettingsDto.price) && epx.f(this.description, donutGroupSettingsDto.description) && epx.f(this.donsDescription, donutGroupSettingsDto.donsDescription) && epx.f(this.explorePostEnabled, donutGroupSettingsDto.explorePostEnabled) && epx.f(this.shortLink, donutGroupSettingsDto.shortLink) && epx.f(this.maskedPan, donutGroupSettingsDto.maskedPan) && epx.f(this.vkpayRecipient, donutGroupSettingsDto.vkpayRecipient) && epx.f(this.payoutType, donutGroupSettingsDto.payoutType) && epx.f(this.vkpayReceivers, donutGroupSettingsDto.vkpayReceivers) && epx.f(this.minPayoutThreshold, donutGroupSettingsDto.minPayoutThreshold) && epx.f(this.welcomeMessage, donutGroupSettingsDto.welcomeMessage) && epx.f(this.farewellMessage, donutGroupSettingsDto.farewellMessage) && epx.f(this.levelLimit, donutGroupSettingsDto.levelLimit) && epx.f(this.trialLimit, donutGroupSettingsDto.trialLimit) && epx.f(this.needShowOnboarding, donutGroupSettingsDto.needShowOnboarding) && epx.f(this.isShowRegularHelpTips, donutGroupSettingsDto.isShowRegularHelpTips);
    }

    public final Boolean f() {
        return this.needShowOnboarding;
    }

    public final String g() {
        return this.payoutType;
    }

    public final int hashCode() {
        int hashCode = (this.goalLimits.hashCode() + qoy.b(Boolean.hashCode(this.isEnabled) * 31, 31, this.isEditDonutAvailable)) * 31;
        Boolean bool = this.isOneTimePaymentsEnabled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.editDonutUnavailableReason;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.limitedCommentsEnabled;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.minPrice;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxPrice;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.price;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.description;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.donsDescription;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.explorePostEnabled;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.shortLink;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.maskedPan;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.vkpayRecipient;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.payoutType;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<UsersUserFullDto> list = this.vkpayReceivers;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num5 = this.minPayoutThreshold;
        int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str7 = this.welcomeMessage;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.farewellMessage;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        DonutGroupSettingsLevelLimitDto donutGroupSettingsLevelLimitDto = this.levelLimit;
        int hashCode19 = (hashCode18 + (donutGroupSettingsLevelLimitDto == null ? 0 : donutGroupSettingsLevelLimitDto.hashCode())) * 31;
        DonutGroupSettingsTrialLimitDto donutGroupSettingsTrialLimitDto = this.trialLimit;
        int hashCode20 = (hashCode19 + (donutGroupSettingsTrialLimitDto == null ? 0 : donutGroupSettingsTrialLimitDto.hashCode())) * 31;
        Boolean bool4 = this.needShowOnboarding;
        int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isShowRegularHelpTips;
        return hashCode21 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final List<UsersUserFullDto> i() {
        return this.vkpayReceivers;
    }

    public final Integer j() {
        return this.vkpayRecipient;
    }

    public final boolean k() {
        return this.isEditDonutAvailable;
    }

    public final boolean l() {
        return this.isEnabled;
    }

    public final Boolean n() {
        return this.isOneTimePaymentsEnabled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutGroupSettingsDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", isEditDonutAvailable=");
        sb.append(this.isEditDonutAvailable);
        sb.append(", goalLimits=");
        sb.append(this.goalLimits);
        sb.append(", isOneTimePaymentsEnabled=");
        sb.append(this.isOneTimePaymentsEnabled);
        sb.append(", editDonutUnavailableReason=");
        sb.append(this.editDonutUnavailableReason);
        sb.append(", limitedCommentsEnabled=");
        sb.append(this.limitedCommentsEnabled);
        sb.append(", minPrice=");
        sb.append(this.minPrice);
        sb.append(", maxPrice=");
        sb.append(this.maxPrice);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", donsDescription=");
        sb.append(this.donsDescription);
        sb.append(", explorePostEnabled=");
        sb.append(this.explorePostEnabled);
        sb.append(", shortLink=");
        sb.append(this.shortLink);
        sb.append(", maskedPan=");
        sb.append(this.maskedPan);
        sb.append(", vkpayRecipient=");
        sb.append(this.vkpayRecipient);
        sb.append(", payoutType=");
        sb.append(this.payoutType);
        sb.append(", vkpayReceivers=");
        sb.append(this.vkpayReceivers);
        sb.append(", minPayoutThreshold=");
        sb.append(this.minPayoutThreshold);
        sb.append(", welcomeMessage=");
        sb.append(this.welcomeMessage);
        sb.append(", farewellMessage=");
        sb.append(this.farewellMessage);
        sb.append(", levelLimit=");
        sb.append(this.levelLimit);
        sb.append(", trialLimit=");
        sb.append(this.trialLimit);
        sb.append(", needShowOnboarding=");
        sb.append(this.needShowOnboarding);
        sb.append(", isShowRegularHelpTips=");
        return tn.a(sb, this.isShowRegularHelpTips, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeInt(this.isEditDonutAvailable ? 1 : 0);
        this.goalLimits.writeToParcel(parcel, i);
        Boolean bool = this.isOneTimePaymentsEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.editDonutUnavailableReason);
        Boolean bool2 = this.limitedCommentsEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.minPrice;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.maxPrice;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.price;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.description);
        parcel.writeString(this.donsDescription);
        Boolean bool3 = this.explorePostEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.shortLink);
        parcel.writeString(this.maskedPan);
        Integer num4 = this.vkpayRecipient;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.payoutType);
        List<UsersUserFullDto> list = this.vkpayReceivers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((UsersUserFullDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num5 = this.minPayoutThreshold;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeString(this.welcomeMessage);
        parcel.writeString(this.farewellMessage);
        DonutGroupSettingsLevelLimitDto donutGroupSettingsLevelLimitDto = this.levelLimit;
        if (donutGroupSettingsLevelLimitDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutGroupSettingsLevelLimitDto.writeToParcel(parcel, i);
        }
        DonutGroupSettingsTrialLimitDto donutGroupSettingsTrialLimitDto = this.trialLimit;
        if (donutGroupSettingsTrialLimitDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutGroupSettingsTrialLimitDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.needShowOnboarding;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isShowRegularHelpTips;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
    }

    public /* synthetic */ DonutGroupSettingsDto(boolean z, boolean z2, DonutGroupSettingsGoalLimitsDto donutGroupSettingsGoalLimitsDto, Boolean bool, String str, Boolean bool2, Integer num, Integer num2, Integer num3, String str2, String str3, Boolean bool3, String str4, String str5, Integer num4, String str6, List list, Integer num5, String str7, String str8, DonutGroupSettingsLevelLimitDto donutGroupSettingsLevelLimitDto, DonutGroupSettingsTrialLimitDto donutGroupSettingsTrialLimitDto, Boolean bool4, Boolean bool5, int i, zcl zclVar) {
        this(z, z2, donutGroupSettingsGoalLimitsDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : num4, (32768 & i) != 0 ? null : str6, (65536 & i) != 0 ? null : list, (131072 & i) != 0 ? null : num5, (262144 & i) != 0 ? null : str7, (524288 & i) != 0 ? null : str8, (1048576 & i) != 0 ? null : donutGroupSettingsLevelLimitDto, (2097152 & i) != 0 ? null : donutGroupSettingsTrialLimitDto, (4194304 & i) != 0 ? null : bool4, (i & 8388608) != 0 ? null : bool5);
    }
}
