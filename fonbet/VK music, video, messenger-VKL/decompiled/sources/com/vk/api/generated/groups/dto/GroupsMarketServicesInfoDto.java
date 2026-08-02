package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.market.dto.MarketCurrencyDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.wp;
import xsna.zcl;

/* compiled from: GroupsMarketServicesInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsMarketServicesInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsMarketServicesInfoDto> CREATOR = new a();

    @pmi0("block_title")
    private final String blockTitle;

    @pmi0("contact_id")
    private final int contactId;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final MarketCurrencyDto currency;

    @pmi0("currency_text")
    private final String currencyText;

    @pmi0("enabled")
    private final BaseBoolIntDto enabled;

    @pmi0("main_section_id")
    private final String mainSectionId;

    @pmi0("price_max")
    private final String priceMax;

    @pmi0("price_min")
    private final String priceMin;

    /* compiled from: GroupsMarketServicesInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsMarketServicesInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsMarketServicesInfoDto createFromParcel(Parcel parcel) {
            return new GroupsMarketServicesInfoDto(parcel.readInt(), MarketCurrencyDto.CREATOR.createFromParcel(parcel), parcel.readString(), BaseBoolIntDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsMarketServicesInfoDto[] newArray(int i) {
            return new GroupsMarketServicesInfoDto[i];
        }
    }

    public GroupsMarketServicesInfoDto(int i, MarketCurrencyDto marketCurrencyDto, String str, BaseBoolIntDto baseBoolIntDto, String str2, String str3, String str4, String str5) {
        this.contactId = i;
        this.currency = marketCurrencyDto;
        this.currencyText = str;
        this.enabled = baseBoolIntDto;
        this.mainSectionId = str2;
        this.priceMax = str3;
        this.priceMin = str4;
        this.blockTitle = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsMarketServicesInfoDto)) {
            return false;
        }
        GroupsMarketServicesInfoDto groupsMarketServicesInfoDto = (GroupsMarketServicesInfoDto) obj;
        return this.contactId == groupsMarketServicesInfoDto.contactId && epx.f(this.currency, groupsMarketServicesInfoDto.currency) && epx.f(this.currencyText, groupsMarketServicesInfoDto.currencyText) && this.enabled == groupsMarketServicesInfoDto.enabled && epx.f(this.mainSectionId, groupsMarketServicesInfoDto.mainSectionId) && epx.f(this.priceMax, groupsMarketServicesInfoDto.priceMax) && epx.f(this.priceMin, groupsMarketServicesInfoDto.priceMin) && epx.f(this.blockTitle, groupsMarketServicesInfoDto.blockTitle);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(wp.b(this.enabled, urd0.a((this.currency.hashCode() + (Integer.hashCode(this.contactId) * 31)) * 31, 31, this.currencyText), 31), 31, this.mainSectionId), 31, this.priceMax), 31, this.priceMin);
        String str = this.blockTitle;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsMarketServicesInfoDto(contactId=");
        sb.append(this.contactId);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", currencyText=");
        sb.append(this.currencyText);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", mainSectionId=");
        sb.append(this.mainSectionId);
        sb.append(", priceMax=");
        sb.append(this.priceMax);
        sb.append(", priceMin=");
        sb.append(this.priceMin);
        sb.append(", blockTitle=");
        return ho8.a(sb, this.blockTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.contactId);
        this.currency.writeToParcel(parcel, i);
        parcel.writeString(this.currencyText);
        this.enabled.writeToParcel(parcel, i);
        parcel.writeString(this.mainSectionId);
        parcel.writeString(this.priceMax);
        parcel.writeString(this.priceMin);
        parcel.writeString(this.blockTitle);
    }

    public /* synthetic */ GroupsMarketServicesInfoDto(int i, MarketCurrencyDto marketCurrencyDto, String str, BaseBoolIntDto baseBoolIntDto, String str2, String str3, String str4, String str5, int i2, zcl zclVar) {
        this(i, marketCurrencyDto, str, baseBoolIntDto, str2, str3, str4, (i2 & 128) != 0 ? null : str5);
    }
}
