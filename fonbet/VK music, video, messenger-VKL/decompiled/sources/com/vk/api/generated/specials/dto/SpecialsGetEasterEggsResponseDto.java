package com.vk.api.generated.specials.dto;

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

/* compiled from: SpecialsGetEasterEggsResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpecialsGetEasterEggsResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpecialsGetEasterEggsResponseDto> CREATOR = new a();

    @pmi0("easter_eggs")
    private final List<SpecialsEasterEggDto> easterEggs;

    /* compiled from: SpecialsGetEasterEggsResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpecialsGetEasterEggsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpecialsGetEasterEggsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SpecialsEasterEggDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SpecialsGetEasterEggsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialsGetEasterEggsResponseDto[] newArray(int i) {
            return new SpecialsGetEasterEggsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpecialsGetEasterEggsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<SpecialsEasterEggDto> d() {
        return this.easterEggs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpecialsGetEasterEggsResponseDto) && epx.f(this.easterEggs, ((SpecialsGetEasterEggsResponseDto) obj).easterEggs);
    }

    public final int hashCode() {
        List<SpecialsEasterEggDto> list = this.easterEggs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("SpecialsGetEasterEggsResponseDto(easterEggs="), this.easterEggs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SpecialsEasterEggDto> list = this.easterEggs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((SpecialsEasterEggDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public SpecialsGetEasterEggsResponseDto(List<SpecialsEasterEggDto> list) {
        this.easterEggs = list;
    }

    public /* synthetic */ SpecialsGetEasterEggsResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
