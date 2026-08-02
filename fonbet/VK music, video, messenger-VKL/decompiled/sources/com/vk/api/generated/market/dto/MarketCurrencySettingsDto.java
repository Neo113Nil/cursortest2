package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCurrencySettingsDto.kt */
/* loaded from: classes15.dex */
public final class MarketCurrencySettingsDto implements Parcelable {
    public static final Parcelable.Creator<MarketCurrencySettingsDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<MarketCurrencyNoSignDto> options;

    @pmi0("value")
    private final MarketCurrencyDto value;

    /* compiled from: MarketCurrencySettingsDto.kt */
    public static final class a implements Parcelable.Creator<MarketCurrencySettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCurrencySettingsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            MarketCurrencyDto marketCurrencyDto = (MarketCurrencyDto) parcel.readParcelable(MarketCurrencySettingsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketCurrencyNoSignDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketCurrencySettingsDto(marketCurrencyDto, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCurrencySettingsDto[] newArray(int i) {
            return new MarketCurrencySettingsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketCurrencySettingsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCurrencySettingsDto)) {
            return false;
        }
        MarketCurrencySettingsDto marketCurrencySettingsDto = (MarketCurrencySettingsDto) obj;
        return epx.f(this.value, marketCurrencySettingsDto.value) && epx.f(this.options, marketCurrencySettingsDto.options);
    }

    public final int hashCode() {
        MarketCurrencyDto marketCurrencyDto = this.value;
        int hashCode = (marketCurrencyDto == null ? 0 : marketCurrencyDto.hashCode()) * 31;
        List<MarketCurrencyNoSignDto> list = this.options;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCurrencySettingsDto(value=");
        sb.append(this.value);
        sb.append(", options=");
        return ms9.a(')', sb, this.options);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.value, i);
        List<MarketCurrencyNoSignDto> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketCurrencyNoSignDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MarketCurrencySettingsDto(MarketCurrencyDto marketCurrencyDto, List<MarketCurrencyNoSignDto> list) {
        this.value = marketCurrencyDto;
        this.options = list;
    }

    public /* synthetic */ MarketCurrencySettingsDto(MarketCurrencyDto marketCurrencyDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketCurrencyDto, (i & 2) != 0 ? null : list);
    }
}
