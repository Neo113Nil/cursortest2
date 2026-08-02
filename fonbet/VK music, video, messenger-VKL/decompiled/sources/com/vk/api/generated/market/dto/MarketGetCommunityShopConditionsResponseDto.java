package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetCommunityShopConditionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCommunityShopConditionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCommunityShopConditionsResponseDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<BaseLinkButtonDto> buttons;

    @pmi0("conditions")
    private final MarketCommunityConditionsDto conditions;

    @pmi0("integration_type")
    private final MarketIntegrationsTypeDto integrationType;

    /* compiled from: MarketGetCommunityShopConditionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCommunityShopConditionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityShopConditionsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            MarketCommunityConditionsDto createFromParcel = MarketCommunityConditionsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MarketGetCommunityShopConditionsResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketGetCommunityShopConditionsResponseDto(createFromParcel, arrayList, (MarketIntegrationsTypeDto) parcel.readParcelable(MarketGetCommunityShopConditionsResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityShopConditionsResponseDto[] newArray(int i) {
            return new MarketGetCommunityShopConditionsResponseDto[i];
        }
    }

    public MarketGetCommunityShopConditionsResponseDto(MarketCommunityConditionsDto marketCommunityConditionsDto, List<BaseLinkButtonDto> list, MarketIntegrationsTypeDto marketIntegrationsTypeDto) {
        this.conditions = marketCommunityConditionsDto;
        this.buttons = list;
        this.integrationType = marketIntegrationsTypeDto;
    }

    public final List<BaseLinkButtonDto> d() {
        return this.buttons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketCommunityConditionsDto e() {
        return this.conditions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetCommunityShopConditionsResponseDto)) {
            return false;
        }
        MarketGetCommunityShopConditionsResponseDto marketGetCommunityShopConditionsResponseDto = (MarketGetCommunityShopConditionsResponseDto) obj;
        return epx.f(this.conditions, marketGetCommunityShopConditionsResponseDto.conditions) && epx.f(this.buttons, marketGetCommunityShopConditionsResponseDto.buttons) && this.integrationType == marketGetCommunityShopConditionsResponseDto.integrationType;
    }

    public final int hashCode() {
        int hashCode = this.conditions.hashCode() * 31;
        List<BaseLinkButtonDto> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        MarketIntegrationsTypeDto marketIntegrationsTypeDto = this.integrationType;
        return hashCode2 + (marketIntegrationsTypeDto != null ? marketIntegrationsTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketGetCommunityShopConditionsResponseDto(conditions=" + this.conditions + ", buttons=" + this.buttons + ", integrationType=" + this.integrationType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.conditions.writeToParcel(parcel, i);
        List<BaseLinkButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.integrationType, i);
    }

    public /* synthetic */ MarketGetCommunityShopConditionsResponseDto(MarketCommunityConditionsDto marketCommunityConditionsDto, List list, MarketIntegrationsTypeDto marketIntegrationsTypeDto, int i, zcl zclVar) {
        this(marketCommunityConditionsDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : marketIntegrationsTypeDto);
    }
}
