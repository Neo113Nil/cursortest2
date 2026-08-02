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

/* compiled from: MarketNotificationReceiversSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MarketNotificationReceiversSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MarketNotificationReceiversSettingsDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<MarketAdminDto> options;

    @pmi0("value")
    private final List<MarketAdminDto> value;

    /* compiled from: MarketNotificationReceiversSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MarketNotificationReceiversSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketNotificationReceiversSettingsDto createFromParcel(Parcel parcel) {
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
                    i2 = en.a(MarketAdminDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(MarketAdminDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new MarketNotificationReceiversSettingsDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketNotificationReceiversSettingsDto[] newArray(int i) {
            return new MarketNotificationReceiversSettingsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketNotificationReceiversSettingsDto() {
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
        if (!(obj instanceof MarketNotificationReceiversSettingsDto)) {
            return false;
        }
        MarketNotificationReceiversSettingsDto marketNotificationReceiversSettingsDto = (MarketNotificationReceiversSettingsDto) obj;
        return epx.f(this.value, marketNotificationReceiversSettingsDto.value) && epx.f(this.options, marketNotificationReceiversSettingsDto.options);
    }

    public final int hashCode() {
        List<MarketAdminDto> list = this.value;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MarketAdminDto> list2 = this.options;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketNotificationReceiversSettingsDto(value=");
        sb.append(this.value);
        sb.append(", options=");
        return ms9.a(')', sb, this.options);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MarketAdminDto> list = this.value;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketAdminDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketAdminDto> list2 = this.options;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((MarketAdminDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public MarketNotificationReceiversSettingsDto(List<MarketAdminDto> list, List<MarketAdminDto> list2) {
        this.value = list;
        this.options = list2;
    }

    public /* synthetic */ MarketNotificationReceiversSettingsDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
