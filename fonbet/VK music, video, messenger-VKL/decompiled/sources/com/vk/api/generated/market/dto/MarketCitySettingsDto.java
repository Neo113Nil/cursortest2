package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseCityDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCitySettingsDto.kt */
/* loaded from: classes15.dex */
public final class MarketCitySettingsDto implements Parcelable {
    public static final Parcelable.Creator<MarketCitySettingsDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<BaseCityDto> options;

    @pmi0("value")
    private final List<BaseCityDto> value;

    /* compiled from: MarketCitySettingsDto.kt */
    public static final class a implements Parcelable.Creator<MarketCitySettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCitySettingsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(MarketCitySettingsDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(MarketCitySettingsDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new MarketCitySettingsDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCitySettingsDto[] newArray(int i) {
            return new MarketCitySettingsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketCitySettingsDto() {
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
        if (!(obj instanceof MarketCitySettingsDto)) {
            return false;
        }
        MarketCitySettingsDto marketCitySettingsDto = (MarketCitySettingsDto) obj;
        return epx.f(this.value, marketCitySettingsDto.value) && epx.f(this.options, marketCitySettingsDto.options);
    }

    public final int hashCode() {
        List<BaseCityDto> list = this.value;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<BaseCityDto> list2 = this.options;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCitySettingsDto(value=");
        sb.append(this.value);
        sb.append(", options=");
        return ms9.a(')', sb, this.options);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<BaseCityDto> list = this.value;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseCityDto> list2 = this.options;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public MarketCitySettingsDto(List<BaseCityDto> list, List<BaseCityDto> list2) {
        this.value = list;
        this.options = list2;
    }

    public /* synthetic */ MarketCitySettingsDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
