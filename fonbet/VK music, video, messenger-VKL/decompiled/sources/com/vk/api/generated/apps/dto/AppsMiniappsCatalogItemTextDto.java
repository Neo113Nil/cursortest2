package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsMiniappsCatalogItemTextDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemTextDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemTextDto> CREATOR = new a();

    @pmi0("colors")
    private final List<String> colors;

    @pmi0("value")
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemTextDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemTextDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemTextDto createFromParcel(Parcel parcel) {
            return new AppsMiniappsCatalogItemTextDto(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemTextDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemTextDto[i];
        }
    }

    public AppsMiniappsCatalogItemTextDto(String str, List<String> list) {
        this.value = str;
        this.colors = list;
    }

    public final List<String> d() {
        return this.colors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogItemTextDto)) {
            return false;
        }
        AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto = (AppsMiniappsCatalogItemTextDto) obj;
        return epx.f(this.value, appsMiniappsCatalogItemTextDto.value) && epx.f(this.colors, appsMiniappsCatalogItemTextDto.colors);
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        List<String> list = this.colors;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemTextDto(value=");
        sb.append(this.value);
        sb.append(", colors=");
        return ms9.a(')', sb, this.colors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.value);
        parcel.writeStringList(this.colors);
    }

    public /* synthetic */ AppsMiniappsCatalogItemTextDto(String str, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
