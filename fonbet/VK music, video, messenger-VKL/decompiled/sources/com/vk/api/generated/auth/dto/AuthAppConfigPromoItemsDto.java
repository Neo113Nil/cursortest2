package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AuthAppConfigPromoItemsDto.kt */
/* loaded from: classes14.dex */
public final class AuthAppConfigPromoItemsDto implements Parcelable {
    public static final Parcelable.Creator<AuthAppConfigPromoItemsDto> CREATOR = new a();

    @pmi0("items")
    private final List<String> items;

    /* compiled from: AuthAppConfigPromoItemsDto.kt */
    public static final class a implements Parcelable.Creator<AuthAppConfigPromoItemsDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigPromoItemsDto createFromParcel(Parcel parcel) {
            return new AuthAppConfigPromoItemsDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigPromoItemsDto[] newArray(int i) {
            return new AuthAppConfigPromoItemsDto[i];
        }
    }

    public AuthAppConfigPromoItemsDto(List<String> list) {
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthAppConfigPromoItemsDto) && epx.f(this.items, ((AuthAppConfigPromoItemsDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AuthAppConfigPromoItemsDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.items);
    }
}
