package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.api.generated.market.dto.MarketCurrencyDto;
import com.vk.api.generated.market.dto.MarketServicesSelectDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsSettingsMarketServicesDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSettingsMarketServicesDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSettingsMarketServicesDto> CREATOR = new a();

    @pmi0("block_name")
    private final MarketServicesSelectDto blockName;

    @pmi0("button_label")
    private final MarketServicesSelectDto buttonLabel;

    @pmi0("can_message")
    private final Boolean canMessage;

    @pmi0("comments_enabled")
    private final Boolean commentsEnabled;

    @pmi0("contact_id")
    private final Integer contactId;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final MarketCurrencyDto currency;

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("view_type")
    private final MarketServicesSelectDto viewType;

    /* compiled from: GroupsSettingsMarketServicesDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSettingsMarketServicesDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsMarketServicesDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            boolean z = parcel.readInt() != 0;
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
            return new GroupsSettingsMarketServicesDto(z, valueOf, valueOf2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (MarketCurrencyDto) parcel.readParcelable(GroupsSettingsMarketServicesDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MarketServicesSelectDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MarketServicesSelectDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MarketServicesSelectDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsMarketServicesDto[] newArray(int i) {
            return new GroupsSettingsMarketServicesDto[i];
        }
    }

    public GroupsSettingsMarketServicesDto(boolean z, Boolean bool, Boolean bool2, Integer num, MarketCurrencyDto marketCurrencyDto, MarketServicesSelectDto marketServicesSelectDto, MarketServicesSelectDto marketServicesSelectDto2, MarketServicesSelectDto marketServicesSelectDto3) {
        this.enabled = z;
        this.canMessage = bool;
        this.commentsEnabled = bool2;
        this.contactId = num;
        this.currency = marketCurrencyDto;
        this.viewType = marketServicesSelectDto;
        this.blockName = marketServicesSelectDto2;
        this.buttonLabel = marketServicesSelectDto3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSettingsMarketServicesDto)) {
            return false;
        }
        GroupsSettingsMarketServicesDto groupsSettingsMarketServicesDto = (GroupsSettingsMarketServicesDto) obj;
        return this.enabled == groupsSettingsMarketServicesDto.enabled && epx.f(this.canMessage, groupsSettingsMarketServicesDto.canMessage) && epx.f(this.commentsEnabled, groupsSettingsMarketServicesDto.commentsEnabled) && epx.f(this.contactId, groupsSettingsMarketServicesDto.contactId) && epx.f(this.currency, groupsSettingsMarketServicesDto.currency) && epx.f(this.viewType, groupsSettingsMarketServicesDto.viewType) && epx.f(this.blockName, groupsSettingsMarketServicesDto.blockName) && epx.f(this.buttonLabel, groupsSettingsMarketServicesDto.buttonLabel);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.enabled) * 31;
        Boolean bool = this.canMessage;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.commentsEnabled;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.contactId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        MarketCurrencyDto marketCurrencyDto = this.currency;
        int hashCode5 = (hashCode4 + (marketCurrencyDto == null ? 0 : marketCurrencyDto.hashCode())) * 31;
        MarketServicesSelectDto marketServicesSelectDto = this.viewType;
        int hashCode6 = (hashCode5 + (marketServicesSelectDto == null ? 0 : marketServicesSelectDto.hashCode())) * 31;
        MarketServicesSelectDto marketServicesSelectDto2 = this.blockName;
        int hashCode7 = (hashCode6 + (marketServicesSelectDto2 == null ? 0 : marketServicesSelectDto2.hashCode())) * 31;
        MarketServicesSelectDto marketServicesSelectDto3 = this.buttonLabel;
        return hashCode7 + (marketServicesSelectDto3 != null ? marketServicesSelectDto3.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsSettingsMarketServicesDto(enabled=" + this.enabled + ", canMessage=" + this.canMessage + ", commentsEnabled=" + this.commentsEnabled + ", contactId=" + this.contactId + ", currency=" + this.currency + ", viewType=" + this.viewType + ", blockName=" + this.blockName + ", buttonLabel=" + this.buttonLabel + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
        Boolean bool = this.canMessage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.commentsEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.contactId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.currency, i);
        MarketServicesSelectDto marketServicesSelectDto = this.viewType;
        if (marketServicesSelectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketServicesSelectDto.writeToParcel(parcel, i);
        }
        MarketServicesSelectDto marketServicesSelectDto2 = this.blockName;
        if (marketServicesSelectDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketServicesSelectDto2.writeToParcel(parcel, i);
        }
        MarketServicesSelectDto marketServicesSelectDto3 = this.buttonLabel;
        if (marketServicesSelectDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketServicesSelectDto3.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsSettingsMarketServicesDto(boolean z, Boolean bool, Boolean bool2, Integer num, MarketCurrencyDto marketCurrencyDto, MarketServicesSelectDto marketServicesSelectDto, MarketServicesSelectDto marketServicesSelectDto2, MarketServicesSelectDto marketServicesSelectDto3, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : marketCurrencyDto, (i & 32) != 0 ? null : marketServicesSelectDto, (i & 64) != 0 ? null : marketServicesSelectDto2, (i & 128) != 0 ? null : marketServicesSelectDto3);
    }
}
