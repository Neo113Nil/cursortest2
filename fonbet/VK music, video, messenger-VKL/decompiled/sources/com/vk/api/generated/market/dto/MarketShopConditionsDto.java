package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketShopConditionsDto.kt */
/* loaded from: classes15.dex */
public final class MarketShopConditionsDto implements Parcelable {
    public static final Parcelable.Creator<MarketShopConditionsDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<BaseLinkButtonDto> buttons;

    @pmi0("fields")
    private final MarketShopConditionsFieldsDto fields;

    @pmi0("header")
    private final String header;

    @pmi0("integration_type")
    private final MarketIntegrationsTypeDto integrationType;

    /* compiled from: MarketShopConditionsDto.kt */
    public static final class a implements Parcelable.Creator<MarketShopConditionsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketShopConditionsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MarketShopConditionsDto.class, parcel, arrayList, i, 1);
            }
            return new MarketShopConditionsDto(arrayList, (MarketShopConditionsFieldsDto) parcel.readParcelable(MarketShopConditionsDto.class.getClassLoader()), parcel.readString(), (MarketIntegrationsTypeDto) parcel.readParcelable(MarketShopConditionsDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketShopConditionsDto[] newArray(int i) {
            return new MarketShopConditionsDto[i];
        }
    }

    public MarketShopConditionsDto(List<BaseLinkButtonDto> list, MarketShopConditionsFieldsDto marketShopConditionsFieldsDto, String str, MarketIntegrationsTypeDto marketIntegrationsTypeDto) {
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
        if (!(obj instanceof MarketShopConditionsDto)) {
            return false;
        }
        MarketShopConditionsDto marketShopConditionsDto = (MarketShopConditionsDto) obj;
        return epx.f(this.buttons, marketShopConditionsDto.buttons) && epx.f(this.fields, marketShopConditionsDto.fields) && epx.f(this.header, marketShopConditionsDto.header) && this.integrationType == marketShopConditionsDto.integrationType;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.fields.hashCode() + (this.buttons.hashCode() * 31)) * 31, 31, this.header);
        MarketIntegrationsTypeDto marketIntegrationsTypeDto = this.integrationType;
        return a2 + (marketIntegrationsTypeDto == null ? 0 : marketIntegrationsTypeDto.hashCode());
    }

    public final String toString() {
        return "MarketShopConditionsDto(buttons=" + this.buttons + ", fields=" + this.fields + ", header=" + this.header + ", integrationType=" + this.integrationType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.buttons);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.fields, i);
        parcel.writeString(this.header);
        parcel.writeParcelable(this.integrationType, i);
    }

    public /* synthetic */ MarketShopConditionsDto(List list, MarketShopConditionsFieldsDto marketShopConditionsFieldsDto, String str, MarketIntegrationsTypeDto marketIntegrationsTypeDto, int i, zcl zclVar) {
        this(list, marketShopConditionsFieldsDto, str, (i & 8) != 0 ? null : marketIntegrationsTypeDto);
    }
}
