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

/* compiled from: MarketDeliveryFreeTypesDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryFreeTypesDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryFreeTypesDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<MarketDeliveryFreeTypeDto> options;

    @pmi0("values")
    private final List<MarketDeliveryFreeTypeDto> values;

    /* compiled from: MarketDeliveryFreeTypesDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryFreeTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryFreeTypesDto createFromParcel(Parcel parcel) {
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
                    i2 = en.a(MarketDeliveryFreeTypeDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(MarketDeliveryFreeTypeDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new MarketDeliveryFreeTypesDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryFreeTypesDto[] newArray(int i) {
            return new MarketDeliveryFreeTypesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketDeliveryFreeTypesDto() {
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
        if (!(obj instanceof MarketDeliveryFreeTypesDto)) {
            return false;
        }
        MarketDeliveryFreeTypesDto marketDeliveryFreeTypesDto = (MarketDeliveryFreeTypesDto) obj;
        return epx.f(this.values, marketDeliveryFreeTypesDto.values) && epx.f(this.options, marketDeliveryFreeTypesDto.options);
    }

    public final int hashCode() {
        List<MarketDeliveryFreeTypeDto> list = this.values;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MarketDeliveryFreeTypeDto> list2 = this.options;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketDeliveryFreeTypesDto(values=");
        sb.append(this.values);
        sb.append(", options=");
        return ms9.a(')', sb, this.options);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MarketDeliveryFreeTypeDto> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketDeliveryFreeTypeDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketDeliveryFreeTypeDto> list2 = this.options;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((MarketDeliveryFreeTypeDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public MarketDeliveryFreeTypesDto(List<MarketDeliveryFreeTypeDto> list, List<MarketDeliveryFreeTypeDto> list2) {
        this.values = list;
        this.options = list2;
    }

    public /* synthetic */ MarketDeliveryFreeTypesDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
