package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: StoreSpecialEventMarkupDto.kt */
/* loaded from: classes15.dex */
public final class StoreSpecialEventMarkupDto implements Parcelable {
    public static final Parcelable.Creator<StoreSpecialEventMarkupDto> CREATOR = new a();

    @pmi0("colors")
    private final List<String> colors;

    /* compiled from: StoreSpecialEventMarkupDto.kt */
    public static final class a implements Parcelable.Creator<StoreSpecialEventMarkupDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreSpecialEventMarkupDto createFromParcel(Parcel parcel) {
            return new StoreSpecialEventMarkupDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreSpecialEventMarkupDto[] newArray(int i) {
            return new StoreSpecialEventMarkupDto[i];
        }
    }

    public StoreSpecialEventMarkupDto(List<String> list) {
        this.colors = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreSpecialEventMarkupDto) && epx.f(this.colors, ((StoreSpecialEventMarkupDto) obj).colors);
    }

    public final int hashCode() {
        return this.colors.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("StoreSpecialEventMarkupDto(colors="), this.colors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.colors);
    }
}
