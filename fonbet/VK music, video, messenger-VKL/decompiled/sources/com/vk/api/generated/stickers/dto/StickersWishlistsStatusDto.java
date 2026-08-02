package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: StickersWishlistsStatusDto.kt */
/* loaded from: classes15.dex */
public final class StickersWishlistsStatusDto implements Parcelable {
    public static final Parcelable.Creator<StickersWishlistsStatusDto> CREATOR = new a();

    @pmi0("is_added")
    private final Boolean isAdded;

    /* compiled from: StickersWishlistsStatusDto.kt */
    public static final class a implements Parcelable.Creator<StickersWishlistsStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersWishlistsStatusDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StickersWishlistsStatusDto(valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersWishlistsStatusDto[] newArray(int i) {
            return new StickersWishlistsStatusDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickersWishlistsStatusDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean d() {
        return this.isAdded;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickersWishlistsStatusDto) && epx.f(this.isAdded, ((StickersWishlistsStatusDto) obj).isAdded);
    }

    public final int hashCode() {
        Boolean bool = this.isAdded;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(new StringBuilder("StickersWishlistsStatusDto(isAdded="), this.isAdded, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isAdded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public StickersWishlistsStatusDto(Boolean bool) {
        this.isAdded = bool;
    }

    public /* synthetic */ StickersWishlistsStatusDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
