package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CatalogTextDto.kt */
/* loaded from: classes14.dex */
public final class CatalogTextDto implements Parcelable {
    public static final Parcelable.Creator<CatalogTextDto> CREATOR = new a();

    @pmi0("collapsed_lines")
    private final Integer collapsedLines;

    @pmi0("id")
    private final String id;

    @pmi0("text")
    private final String text;

    /* compiled from: CatalogTextDto.kt */
    public static final class a implements Parcelable.Creator<CatalogTextDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogTextDto createFromParcel(Parcel parcel) {
            return new CatalogTextDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogTextDto[] newArray(int i) {
            return new CatalogTextDto[i];
        }
    }

    public CatalogTextDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.collapsedLines;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogTextDto)) {
            return false;
        }
        CatalogTextDto catalogTextDto = (CatalogTextDto) obj;
        return epx.f(this.id, catalogTextDto.id) && epx.f(this.text, catalogTextDto.text) && epx.f(this.collapsedLines, catalogTextDto.collapsedLines);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.collapsedLines;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogTextDto(id=");
        sb.append(this.id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", collapsedLines=");
        return uqi.b(sb, this.collapsedLines, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.text);
        Integer num = this.collapsedLines;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public CatalogTextDto(String str, String str2, Integer num) {
        this.id = str;
        this.text = str2;
        this.collapsedLines = num;
    }

    public /* synthetic */ CatalogTextDto(String str, String str2, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
