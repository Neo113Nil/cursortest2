package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.market.dto.MarketShopConditionsFieldsDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsSettingsMarketShopConditionsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSettingsMarketShopConditionsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSettingsMarketShopConditionsDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<BaseLinkButtonDto> buttons;

    @pmi0("fields")
    private final MarketShopConditionsFieldsDto fields;

    @pmi0("header")
    private final String header;

    @pmi0("integration_type")
    private final MarketIntegrationsTypeDto integrationType;

    /* compiled from: GroupsSettingsMarketShopConditionsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSettingsMarketShopConditionsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsMarketShopConditionsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(BaseLinkButtonDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsSettingsMarketShopConditionsDto(arrayList, MarketShopConditionsFieldsDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : MarketIntegrationsTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsMarketShopConditionsDto[] newArray(int i) {
            return new GroupsSettingsMarketShopConditionsDto[i];
        }
    }

    public GroupsSettingsMarketShopConditionsDto(List<BaseLinkButtonDto> list, MarketShopConditionsFieldsDto marketShopConditionsFieldsDto, String str, MarketIntegrationsTypeDto marketIntegrationsTypeDto) {
        this.buttons = list;
        this.fields = marketShopConditionsFieldsDto;
        this.header = str;
        this.integrationType = marketIntegrationsTypeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSettingsMarketShopConditionsDto)) {
            return false;
        }
        GroupsSettingsMarketShopConditionsDto groupsSettingsMarketShopConditionsDto = (GroupsSettingsMarketShopConditionsDto) obj;
        return epx.f(this.buttons, groupsSettingsMarketShopConditionsDto.buttons) && epx.f(this.fields, groupsSettingsMarketShopConditionsDto.fields) && epx.f(this.header, groupsSettingsMarketShopConditionsDto.header) && this.integrationType == groupsSettingsMarketShopConditionsDto.integrationType;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.fields.hashCode() + (this.buttons.hashCode() * 31)) * 31, 31, this.header);
        MarketIntegrationsTypeDto marketIntegrationsTypeDto = this.integrationType;
        return a2 + (marketIntegrationsTypeDto == null ? 0 : marketIntegrationsTypeDto.hashCode());
    }

    public final String toString() {
        return "GroupsSettingsMarketShopConditionsDto(buttons=" + this.buttons + ", fields=" + this.fields + ", header=" + this.header + ", integrationType=" + this.integrationType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.buttons);
        while (a2.hasNext()) {
            ((BaseLinkButtonDto) a2.next()).writeToParcel(parcel, i);
        }
        this.fields.writeToParcel(parcel, i);
        parcel.writeString(this.header);
        MarketIntegrationsTypeDto marketIntegrationsTypeDto = this.integrationType;
        if (marketIntegrationsTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketIntegrationsTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsSettingsMarketShopConditionsDto(List list, MarketShopConditionsFieldsDto marketShopConditionsFieldsDto, String str, MarketIntegrationsTypeDto marketIntegrationsTypeDto, int i, zcl zclVar) {
        this(list, marketShopConditionsFieldsDto, str, (i & 8) != 0 ? null : marketIntegrationsTypeDto);
    }
}
