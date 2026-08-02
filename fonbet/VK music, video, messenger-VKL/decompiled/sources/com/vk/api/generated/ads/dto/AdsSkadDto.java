package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AdsSkadDto.kt */
/* loaded from: classes14.dex */
public final class AdsSkadDto implements Parcelable {
    public static final Parcelable.Creator<AdsSkadDto> CREATOR = new a();

    @pmi0("adNetworkId")
    private final String adNetworkId;

    @pmi0("appStoreId")
    private final int appStoreId;

    @pmi0("campaignId")
    private final int campaignId;

    @pmi0("fidelities")
    private final List<AdsSkadFidelityDto> fidelities;

    @pmi0("nonce")
    private final String nonce;

    @pmi0("sign")
    private final String sign;

    @pmi0("sourceAppStoreId")
    private final int sourceAppStoreId;

    @pmi0("timestamp")
    private final Integer timestamp;

    @pmi0("version")
    private final String version;

    /* compiled from: AdsSkadDto.kt */
    public static final class a implements Parcelable.Creator<AdsSkadDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsSkadDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                int i = 0;
                while (i != readInt4) {
                    i = en.a(AdsSkadFidelityDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new AdsSkadDto(readString, readString2, readInt, readInt2, readInt3, valueOf, readString3, readString4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsSkadDto[] newArray(int i) {
            return new AdsSkadDto[i];
        }
    }

    public AdsSkadDto(String str, String str2, int i, int i2, int i3, Integer num, String str3, String str4, List<AdsSkadFidelityDto> list) {
        this.version = str;
        this.adNetworkId = str2;
        this.campaignId = i;
        this.appStoreId = i2;
        this.sourceAppStoreId = i3;
        this.timestamp = num;
        this.nonce = str3;
        this.sign = str4;
        this.fidelities = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsSkadDto)) {
            return false;
        }
        AdsSkadDto adsSkadDto = (AdsSkadDto) obj;
        return epx.f(this.version, adsSkadDto.version) && epx.f(this.adNetworkId, adsSkadDto.adNetworkId) && this.campaignId == adsSkadDto.campaignId && this.appStoreId == adsSkadDto.appStoreId && this.sourceAppStoreId == adsSkadDto.sourceAppStoreId && epx.f(this.timestamp, adsSkadDto.timestamp) && epx.f(this.nonce, adsSkadDto.nonce) && epx.f(this.sign, adsSkadDto.sign) && epx.f(this.fidelities, adsSkadDto.fidelities);
    }

    public final int hashCode() {
        int a2 = shy.a(this.sourceAppStoreId, shy.a(this.appStoreId, shy.a(this.campaignId, urd0.a(this.version.hashCode() * 31, 31, this.adNetworkId), 31), 31), 31);
        Integer num = this.timestamp;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nonce;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sign;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AdsSkadFidelityDto> list = this.fidelities;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsSkadDto(version=");
        sb.append(this.version);
        sb.append(", adNetworkId=");
        sb.append(this.adNetworkId);
        sb.append(", campaignId=");
        sb.append(this.campaignId);
        sb.append(", appStoreId=");
        sb.append(this.appStoreId);
        sb.append(", sourceAppStoreId=");
        sb.append(this.sourceAppStoreId);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", nonce=");
        sb.append(this.nonce);
        sb.append(", sign=");
        sb.append(this.sign);
        sb.append(", fidelities=");
        return ms9.a(')', sb, this.fidelities);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.version);
        parcel.writeString(this.adNetworkId);
        parcel.writeInt(this.campaignId);
        parcel.writeInt(this.appStoreId);
        parcel.writeInt(this.sourceAppStoreId);
        Integer num = this.timestamp;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.nonce);
        parcel.writeString(this.sign);
        List<AdsSkadFidelityDto> list = this.fidelities;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AdsSkadFidelityDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AdsSkadDto(String str, String str2, int i, int i2, int i3, Integer num, String str3, String str4, List list, int i4, zcl zclVar) {
        this(str, str2, i, i2, i3, (i4 & 32) != 0 ? null : num, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? null : str4, (i4 & 256) != 0 ? null : list);
    }
}
