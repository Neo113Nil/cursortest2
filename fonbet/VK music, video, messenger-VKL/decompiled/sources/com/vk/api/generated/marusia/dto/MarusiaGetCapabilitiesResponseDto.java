package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarusiaGetCapabilitiesResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaGetCapabilitiesResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaGetCapabilitiesResponseDto> CREATOR = new a();

    @pmi0("capabilities")
    private final String capabilities;

    @pmi0("capabilities2")
    private final List<MarusiaCapability2ItemDto> capabilities2;

    /* compiled from: MarusiaGetCapabilitiesResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaGetCapabilitiesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaGetCapabilitiesResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarusiaCapability2ItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarusiaGetCapabilitiesResponseDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaGetCapabilitiesResponseDto[] newArray(int i) {
            return new MarusiaGetCapabilitiesResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarusiaGetCapabilitiesResponseDto() {
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
        if (!(obj instanceof MarusiaGetCapabilitiesResponseDto)) {
            return false;
        }
        MarusiaGetCapabilitiesResponseDto marusiaGetCapabilitiesResponseDto = (MarusiaGetCapabilitiesResponseDto) obj;
        return epx.f(this.capabilities, marusiaGetCapabilitiesResponseDto.capabilities) && epx.f(this.capabilities2, marusiaGetCapabilitiesResponseDto.capabilities2);
    }

    public final int hashCode() {
        String str = this.capabilities;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<MarusiaCapability2ItemDto> list = this.capabilities2;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaGetCapabilitiesResponseDto(capabilities=");
        sb.append(this.capabilities);
        sb.append(", capabilities2=");
        return ms9.a(')', sb, this.capabilities2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.capabilities);
        List<MarusiaCapability2ItemDto> list = this.capabilities2;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarusiaCapability2ItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MarusiaGetCapabilitiesResponseDto(String str, List<MarusiaCapability2ItemDto> list) {
        this.capabilities = str;
        this.capabilities2 = list;
    }

    public /* synthetic */ MarusiaGetCapabilitiesResponseDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
