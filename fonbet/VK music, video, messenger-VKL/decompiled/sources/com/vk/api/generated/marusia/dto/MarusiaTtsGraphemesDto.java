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

/* compiled from: MarusiaTtsGraphemesDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaTtsGraphemesDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaTtsGraphemesDto> CREATOR = new a();

    @pmi0("qid")
    private final String qid;

    @pmi0("result")
    private final List<MarusiaTtsGraphemesResultDto> result;

    /* compiled from: MarusiaTtsGraphemesDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaTtsGraphemesDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaTtsGraphemesDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarusiaTtsGraphemesResultDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarusiaTtsGraphemesDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaTtsGraphemesDto[] newArray(int i) {
            return new MarusiaTtsGraphemesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarusiaTtsGraphemesDto() {
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
        if (!(obj instanceof MarusiaTtsGraphemesDto)) {
            return false;
        }
        MarusiaTtsGraphemesDto marusiaTtsGraphemesDto = (MarusiaTtsGraphemesDto) obj;
        return epx.f(this.qid, marusiaTtsGraphemesDto.qid) && epx.f(this.result, marusiaTtsGraphemesDto.result);
    }

    public final int hashCode() {
        String str = this.qid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<MarusiaTtsGraphemesResultDto> list = this.result;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaTtsGraphemesDto(qid=");
        sb.append(this.qid);
        sb.append(", result=");
        return ms9.a(')', sb, this.result);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.qid);
        List<MarusiaTtsGraphemesResultDto> list = this.result;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarusiaTtsGraphemesResultDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MarusiaTtsGraphemesDto(String str, List<MarusiaTtsGraphemesResultDto> list) {
        this.qid = str;
        this.result = list;
    }

    public /* synthetic */ MarusiaTtsGraphemesDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
