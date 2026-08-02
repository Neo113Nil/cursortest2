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
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsHideReasonsDto.kt */
/* loaded from: classes14.dex */
public final class AdsHideReasonsDto implements Parcelable {
    public static final Parcelable.Creator<AdsHideReasonsDto> CREATOR = new a();

    @pmi0("items")
    private final List<AdsHideReasonDto> items;

    /* compiled from: AdsHideReasonsDto.kt */
    public static final class a implements Parcelable.Creator<AdsHideReasonsDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsHideReasonsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AdsHideReasonDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AdsHideReasonsDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsHideReasonsDto[] newArray(int i) {
            return new AdsHideReasonsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdsHideReasonsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<AdsHideReasonDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsHideReasonsDto) && epx.f(this.items, ((AdsHideReasonsDto) obj).items);
    }

    public final int hashCode() {
        List<AdsHideReasonDto> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AdsHideReasonsDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AdsHideReasonDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AdsHideReasonDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public AdsHideReasonsDto(List<AdsHideReasonDto> list) {
        this.items = list;
    }

    public /* synthetic */ AdsHideReasonsDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
