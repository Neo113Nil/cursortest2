package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogBlockReplacementsDto.kt */
/* loaded from: classes14.dex */
public final class CatalogBlockReplacementsDto implements Parcelable {
    public static final Parcelable.Creator<CatalogBlockReplacementsDto> CREATOR = new a();

    @pmi0("new_next_from")
    private final String newNextFrom;

    @pmi0("replacements")
    private final List<CatalogBlockReplacementDto> replacements;

    /* compiled from: CatalogBlockReplacementsDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBlockReplacementsDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBlockReplacementsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(CatalogBlockReplacementDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new CatalogBlockReplacementsDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBlockReplacementsDto[] newArray(int i) {
            return new CatalogBlockReplacementsDto[i];
        }
    }

    public CatalogBlockReplacementsDto(List<CatalogBlockReplacementDto> list, String str) {
        this.replacements = list;
        this.newNextFrom = str;
    }

    public final String d() {
        return this.newNextFrom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<CatalogBlockReplacementDto> e() {
        return this.replacements;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBlockReplacementsDto)) {
            return false;
        }
        CatalogBlockReplacementsDto catalogBlockReplacementsDto = (CatalogBlockReplacementsDto) obj;
        return epx.f(this.replacements, catalogBlockReplacementsDto.replacements) && epx.f(this.newNextFrom, catalogBlockReplacementsDto.newNextFrom);
    }

    public final int hashCode() {
        int hashCode = this.replacements.hashCode() * 31;
        String str = this.newNextFrom;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBlockReplacementsDto(replacements=");
        sb.append(this.replacements);
        sb.append(", newNextFrom=");
        return ho8.a(sb, this.newNextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.replacements);
        while (a2.hasNext()) {
            ((CatalogBlockReplacementDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.newNextFrom);
    }

    public /* synthetic */ CatalogBlockReplacementsDto(List list, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
