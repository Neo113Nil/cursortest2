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

/* compiled from: MarketPaymentsReceiversSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MarketPaymentsReceiversSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MarketPaymentsReceiversSettingsDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<MarketAdminDto> options;

    @pmi0("value")
    private final MarketAdminDto value;

    /* compiled from: MarketPaymentsReceiversSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MarketPaymentsReceiversSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketPaymentsReceiversSettingsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            MarketAdminDto createFromParcel = parcel.readInt() == 0 ? null : MarketAdminDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketAdminDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketPaymentsReceiversSettingsDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketPaymentsReceiversSettingsDto[] newArray(int i) {
            return new MarketPaymentsReceiversSettingsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketPaymentsReceiversSettingsDto() {
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
        if (!(obj instanceof MarketPaymentsReceiversSettingsDto)) {
            return false;
        }
        MarketPaymentsReceiversSettingsDto marketPaymentsReceiversSettingsDto = (MarketPaymentsReceiversSettingsDto) obj;
        return epx.f(this.value, marketPaymentsReceiversSettingsDto.value) && epx.f(this.options, marketPaymentsReceiversSettingsDto.options);
    }

    public final int hashCode() {
        MarketAdminDto marketAdminDto = this.value;
        int hashCode = (marketAdminDto == null ? 0 : marketAdminDto.hashCode()) * 31;
        List<MarketAdminDto> list = this.options;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketPaymentsReceiversSettingsDto(value=");
        sb.append(this.value);
        sb.append(", options=");
        return ms9.a(')', sb, this.options);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MarketAdminDto marketAdminDto = this.value;
        if (marketAdminDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketAdminDto.writeToParcel(parcel, i);
        }
        List<MarketAdminDto> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketAdminDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MarketPaymentsReceiversSettingsDto(MarketAdminDto marketAdminDto, List<MarketAdminDto> list) {
        this.value = marketAdminDto;
        this.options = list;
    }

    public /* synthetic */ MarketPaymentsReceiversSettingsDto(MarketAdminDto marketAdminDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketAdminDto, (i & 2) != 0 ? null : list);
    }
}
