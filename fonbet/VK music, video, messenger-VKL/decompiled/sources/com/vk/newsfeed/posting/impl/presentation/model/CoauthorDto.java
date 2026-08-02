package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import xsna.epx;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class CoauthorDto implements Parcelable {
    public static final Parcelable.Creator<CoauthorDto> CREATOR = new a();
    public final Owner b;

    /* compiled from: PostingViewState.kt */
    public static final class a implements Parcelable.Creator<CoauthorDto> {
        @Override // android.os.Parcelable.Creator
        public final CoauthorDto createFromParcel(Parcel parcel) {
            return new CoauthorDto((Owner) parcel.readParcelable(CoauthorDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CoauthorDto[] newArray(int i) {
            return new CoauthorDto[i];
        }
    }

    public CoauthorDto(Owner owner) {
        this.b = owner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        Owner owner;
        UserId userId = null;
        CoauthorDto coauthorDto = obj instanceof CoauthorDto ? (CoauthorDto) obj : null;
        if (coauthorDto != null && (owner = coauthorDto.b) != null) {
            userId = owner.b;
        }
        return epx.f(userId, this.b.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b.b);
    }

    public final String toString() {
        return "CoauthorDto(owner=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
