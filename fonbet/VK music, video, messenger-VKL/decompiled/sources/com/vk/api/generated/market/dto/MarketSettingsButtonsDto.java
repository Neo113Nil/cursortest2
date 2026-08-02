package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketSettingsButtonsDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsButtonsDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsButtonsDto> CREATOR = new a();

    @pmi0("button_type")
    private final List<MarketCustomButtonListingDto> buttonType;

    @pmi0("button_type_call_preset")
    private final MarketCustomButtonTypeCallPresetDto buttonTypeCallPreset;

    @pmi0("button_type_open_preset")
    private final MarketCustomButtonTypeOpenPresetDto buttonTypeOpenPreset;

    @pmi0("button_type_write_preset")
    private final MarketCustomButtonTypeWritePresetDto buttonTypeWritePreset;

    @pmi0("button_types")
    private final List<MarketCustomButtonListingDto> buttonTypes;

    @pmi0("buttons")
    private final List<MarketCustomButtonDto> buttons;

    /* compiled from: MarketSettingsButtonsDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsButtonsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsButtonsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(MarketCustomButtonListingDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            MarketCustomButtonTypeWritePresetDto createFromParcel = MarketCustomButtonTypeWritePresetDto.CREATOR.createFromParcel(parcel);
            MarketCustomButtonTypeOpenPresetDto createFromParcel2 = MarketCustomButtonTypeOpenPresetDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = en.a(MarketCustomButtonDto.CREATOR, parcel, arrayList3, i3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(MarketCustomButtonListingDto.CREATOR, parcel, arrayList4, i, 1);
                }
                arrayList = arrayList4;
            }
            return new MarketSettingsButtonsDto(arrayList2, createFromParcel, createFromParcel2, arrayList3, arrayList, parcel.readInt() != 0 ? MarketCustomButtonTypeCallPresetDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsButtonsDto[] newArray(int i) {
            return new MarketSettingsButtonsDto[i];
        }
    }

    public MarketSettingsButtonsDto(List<MarketCustomButtonListingDto> list, MarketCustomButtonTypeWritePresetDto marketCustomButtonTypeWritePresetDto, MarketCustomButtonTypeOpenPresetDto marketCustomButtonTypeOpenPresetDto, List<MarketCustomButtonDto> list2, List<MarketCustomButtonListingDto> list3, MarketCustomButtonTypeCallPresetDto marketCustomButtonTypeCallPresetDto) {
        this.buttonType = list;
        this.buttonTypeWritePreset = marketCustomButtonTypeWritePresetDto;
        this.buttonTypeOpenPreset = marketCustomButtonTypeOpenPresetDto;
        this.buttons = list2;
        this.buttonTypes = list3;
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
        if (!(obj instanceof MarketSettingsButtonsDto)) {
            return false;
        }
        MarketSettingsButtonsDto marketSettingsButtonsDto = (MarketSettingsButtonsDto) obj;
        return epx.f(this.buttonType, marketSettingsButtonsDto.buttonType) && epx.f(this.buttonTypeWritePreset, marketSettingsButtonsDto.buttonTypeWritePreset) && epx.f(this.buttonTypeOpenPreset, marketSettingsButtonsDto.buttonTypeOpenPreset) && epx.f(this.buttons, marketSettingsButtonsDto.buttons) && epx.f(this.buttonTypes, marketSettingsButtonsDto.buttonTypes) && epx.f(this.buttonTypeCallPreset, marketSettingsButtonsDto.buttonTypeCallPreset);
    }

    public final int hashCode() {
        int a2 = fw3.a((this.buttonTypeOpenPreset.hashCode() + ((this.buttonTypeWritePreset.hashCode() + (this.buttonType.hashCode() * 31)) * 31)) * 31, 31, this.buttons);
        List<MarketCustomButtonListingDto> list = this.buttonTypes;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        MarketCustomButtonTypeCallPresetDto marketCustomButtonTypeCallPresetDto = this.buttonTypeCallPreset;
        return hashCode + (marketCustomButtonTypeCallPresetDto != null ? marketCustomButtonTypeCallPresetDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketSettingsButtonsDto(buttonType=" + this.buttonType + ", buttonTypeWritePreset=" + this.buttonTypeWritePreset + ", buttonTypeOpenPreset=" + this.buttonTypeOpenPreset + ", buttons=" + this.buttons + ", buttonTypes=" + this.buttonTypes + ", buttonTypeCallPreset=" + this.buttonTypeCallPreset + ')';
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
        List<MarketCustomButtonListingDto> list = this.buttonTypes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketCustomButtonListingDto) f.next()).writeToParcel(parcel, i);
            }
        }
        MarketCustomButtonTypeCallPresetDto marketCustomButtonTypeCallPresetDto = this.buttonTypeCallPreset;
        if (marketCustomButtonTypeCallPresetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCustomButtonTypeCallPresetDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketSettingsButtonsDto(List list, MarketCustomButtonTypeWritePresetDto marketCustomButtonTypeWritePresetDto, MarketCustomButtonTypeOpenPresetDto marketCustomButtonTypeOpenPresetDto, List list2, List list3, MarketCustomButtonTypeCallPresetDto marketCustomButtonTypeCallPresetDto, int i, zcl zclVar) {
        this(list, marketCustomButtonTypeWritePresetDto, marketCustomButtonTypeOpenPresetDto, list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : marketCustomButtonTypeCallPresetDto);
    }
}
