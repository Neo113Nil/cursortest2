package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogLayoutTopTitleDto.kt */
/* loaded from: classes14.dex */
public final class CatalogLayoutTopTitleDto implements Parcelable {
    public static final Parcelable.Creator<CatalogLayoutTopTitleDto> CREATOR = new a();

    @pmi0("icon")
    private final String icon;

    @pmi0("text")
    private final String text;

    /* compiled from: CatalogLayoutTopTitleDto.kt */
    public static final class a implements Parcelable.Creator<CatalogLayoutTopTitleDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogLayoutTopTitleDto createFromParcel(Parcel parcel) {
            return new CatalogLayoutTopTitleDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogLayoutTopTitleDto[] newArray(int i) {
            return new CatalogLayoutTopTitleDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogLayoutTopTitleDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.icon;
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
        if (!(obj instanceof CatalogLayoutTopTitleDto)) {
            return false;
        }
        CatalogLayoutTopTitleDto catalogLayoutTopTitleDto = (CatalogLayoutTopTitleDto) obj;
        return epx.f(this.icon, catalogLayoutTopTitleDto.icon) && epx.f(this.text, catalogLayoutTopTitleDto.text);
    }

    public final int hashCode() {
        String str = this.icon;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogLayoutTopTitleDto(icon=");
        sb.append(this.icon);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.icon);
        parcel.writeString(this.text);
    }

    public CatalogLayoutTopTitleDto(String str, String str2) {
        this.icon = str;
        this.text = str2;
    }

    public /* synthetic */ CatalogLayoutTopTitleDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
