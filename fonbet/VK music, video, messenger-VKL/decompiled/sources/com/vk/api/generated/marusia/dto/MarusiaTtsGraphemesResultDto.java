package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarusiaTtsGraphemesResultDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaTtsGraphemesResultDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaTtsGraphemesResultDto> CREATOR = new a();

    @pmi0("orig_text")
    private final String origText;

    @pmi0("orig_text_range")
    private final List<Integer> origTextRange;

    @pmi0("spoken_text")
    private final String spokenText;

    @pmi0("utterance_range")
    private final List<Float> utteranceRange;

    /* compiled from: MarusiaTtsGraphemesResultDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaTtsGraphemesResultDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaTtsGraphemesResultDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList3.add(Float.valueOf(parcel.readFloat()));
                }
                arrayList2 = arrayList3;
            }
            return new MarusiaTtsGraphemesResultDto(readString, arrayList, readString2, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaTtsGraphemesResultDto[] newArray(int i) {
            return new MarusiaTtsGraphemesResultDto[i];
        }
    }

    public MarusiaTtsGraphemesResultDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaTtsGraphemesResultDto)) {
            return false;
        }
        MarusiaTtsGraphemesResultDto marusiaTtsGraphemesResultDto = (MarusiaTtsGraphemesResultDto) obj;
        return epx.f(this.origText, marusiaTtsGraphemesResultDto.origText) && epx.f(this.origTextRange, marusiaTtsGraphemesResultDto.origTextRange) && epx.f(this.spokenText, marusiaTtsGraphemesResultDto.spokenText) && epx.f(this.utteranceRange, marusiaTtsGraphemesResultDto.utteranceRange);
    }

    public final int hashCode() {
        String str = this.origText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Integer> list = this.origTextRange;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.spokenText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Float> list2 = this.utteranceRange;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaTtsGraphemesResultDto(origText=");
        sb.append(this.origText);
        sb.append(", origTextRange=");
        sb.append(this.origTextRange);
        sb.append(", spokenText=");
        sb.append(this.spokenText);
        sb.append(", utteranceRange=");
        return ms9.a(')', sb, this.utteranceRange);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.origText);
        List<Integer> list = this.origTextRange;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeString(this.spokenText);
        List<Float> list2 = this.utteranceRange;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeFloat(((Number) f2.next()).floatValue());
        }
    }

    public MarusiaTtsGraphemesResultDto(String str, List<Integer> list, String str2, List<Float> list2) {
        this.origText = str;
        this.origTextRange = list;
        this.spokenText = str2;
        this.utteranceRange = list2;
    }

    public /* synthetic */ MarusiaTtsGraphemesResultDto(String str, List list, String str2, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list2);
    }
}
