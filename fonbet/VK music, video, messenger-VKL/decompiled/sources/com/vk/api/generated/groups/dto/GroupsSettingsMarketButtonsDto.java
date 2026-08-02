package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.market.dto.MarketCustomButtonDto;
import com.vk.api.generated.market.dto.MarketCustomButtonListingDto;
import com.vk.api.generated.market.dto.MarketCustomButtonTypeCallPresetDto;
import com.vk.api.generated.market.dto.MarketCustomButtonTypeOpenPresetDto;
import com.vk.api.generated.market.dto.MarketCustomButtonTypeWritePresetDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsSettingsMarketButtonsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSettingsMarketButtonsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSettingsMarketButtonsDto> CREATOR = new a();

    @pmi0("button_type")
    private final List<MarketCustomButtonListingDto> buttonType;

    @pmi0("button_type_call_preset")
    private final MarketCustomButtonTypeCallPresetDto buttonTypeCallPreset;

    @pmi0("button_type_open_preset")
    private final MarketCustomButtonTypeOpenPresetDto buttonTypeOpenPreset;

    @pmi0("button_type_write_preset")
    private final MarketCustomButtonTypeWritePresetDto buttonTypeWritePreset;

    @pmi0("buttons")
    private final List<MarketCustomButtonDto> buttons;

    /* compiled from: GroupsSettingsMarketButtonsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSettingsMarketButtonsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsMarketButtonsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(MarketCustomButtonListingDto.CREATOR, parcel, arrayList, i2, 1);
            }
            MarketCustomButtonTypeWritePresetDto createFromParcel = MarketCustomButtonTypeWritePresetDto.CREATOR.createFromParcel(parcel);
            MarketCustomButtonTypeOpenPresetDto createFromParcel2 = MarketCustomButtonTypeOpenPresetDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(MarketCustomButtonDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new GroupsSettingsMarketButtonsDto(arrayList, createFromParcel, createFromParcel2, arrayList2, parcel.readInt() == 0 ? null : MarketCustomButtonTypeCallPresetDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsMarketButtonsDto[] newArray(int i) {
            return new GroupsSettingsMarketButtonsDto[i];
        }
    }

    public GroupsSettingsMarketButtonsDto(List<MarketCustomButtonListingDto> list, MarketCustomButtonTypeWritePresetDto marketCustomButtonTypeWritePresetDto, MarketCustomButtonTypeOpenPresetDto marketCustomButtonTypeOpenPresetDto, List<MarketCustomButtonDto> list2, MarketCustomButtonTypeCallPresetDto marketCustomButtonTypeCallPresetDto) {
        this.buttonType = list;
        this.buttonTypeWritePreset = marketCustomButtonTypeWritePresetDto;
        this.buttonTypeOpenPreset = marketCustomButtonTypeOpenPresetDto;
        this.buttons = list2;
        this.buttonTypeCallPreset = marketCustomButtonTypeCallPresetDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSettingsMarketButtonsDto)) {
            return false;
        }
        GroupsSettingsMarketButtonsDto groupsSettingsMarketButtonsDto = (GroupsSettingsMarketButtonsDto) obj;
        return epx.f(this.buttonType, groupsSettingsMarketButtonsDto.buttonType) && epx.f(this.buttonTypeWritePreset, groupsSettingsMarketButtonsDto.buttonTypeWritePreset) && epx.f(this.buttonTypeOpenPreset, groupsSettingsMarketButtonsDto.buttonTypeOpenPreset) && epx.f(this.buttons, groupsSettingsMarketButtonsDto.buttons) && epx.f(this.buttonTypeCallPreset, groupsSettingsMarketButtonsDto.buttonTypeCallPreset);
    }

    public final int hashCode() {
        int a2 = fw3.a((this.buttonTypeOpenPreset.hashCode() + ((this.buttonTypeWritePreset.hashCode() + (this.buttonType.hashCode() * 31)) * 31)) * 31, 31, this.buttons);
        MarketCustomButtonTypeCallPresetDto marketCustomButtonTypeCallPresetDto = this.buttonTypeCallPreset;
        return a2 + (marketCustomButtonTypeCallPresetDto == null ? 0 : marketCustomButtonTypeCallPresetDto.hashCode());
    }

    public final String toString() {
        return "GroupsSettingsMarketButtonsDto(buttonType=" + this.buttonType + ", buttonTypeWritePreset=" + this.buttonTypeWritePreset + ", buttonTypeOpenPreset=" + this.buttonTypeOpenPreset + ", buttons=" + this.buttons + ", buttonTypeCallPreset=" + this.buttonTypeCallPreset + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.buttonType);
        while (a2.hasNext()) {
            ((MarketCustomButtonListingDto) a2.next()).writeToParcel(parcel, i);
        }
        this.buttonTypeWritePreset.writeToParcel(parcel, i);
        this.buttonTypeOpenPreset.writeToParcel(parcel, i);
        Iterator a3 = ao.a(parcel, this.buttons);
        while (a3.hasNext()) {
            ((MarketCustomButtonDto) a3.next()).writeToParcel(parcel, i);
        }
        MarketCustomButtonTypeCallPresetDto marketCustomButtonTypeCallPresetDto = this.buttonTypeCallPreset;
        if (marketCustomButtonTypeCallPresetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCustomButtonTypeCallPresetDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsSettingsMarketButtonsDto(List list, MarketCustomButtonTypeWritePresetDto marketCustomButtonTypeWritePresetDto, MarketCustomButtonTypeOpenPresetDto marketCustomButtonTypeOpenPresetDto, List list2, MarketCustomButtonTypeCallPresetDto marketCustomButtonTypeCallPresetDto, int i, zcl zclVar) {
        this(list, marketCustomButtonTypeWritePresetDto, marketCustomButtonTypeOpenPresetDto, list2, (i & 16) != 0 ? null : marketCustomButtonTypeCallPresetDto);
    }
}
