package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: LikesItemReactionDto.kt */
/* loaded from: classes14.dex */
public final class LikesItemReactionDto implements Parcelable {
    public static final Parcelable.Creator<LikesItemReactionDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("id")
    private final int id;

    /* compiled from: LikesItemReactionDto.kt */
    public static final class a implements Parcelable.Creator<LikesItemReactionDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesItemReactionDto createFromParcel(Parcel parcel) {
            return new LikesItemReactionDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LikesItemReactionDto[] newArray(int i) {
            return new LikesItemReactionDto[i];
        }
    }

    public LikesItemReactionDto(int i, int i2) {
        this.id = i;
        this.count = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesItemReactionDto)) {
            return false;
        }
        LikesItemReactionDto likesItemReactionDto = (LikesItemReactionDto) obj;
        return this.id == likesItemReactionDto.id && this.count == likesItemReactionDto.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikesItemReactionDto(id=");
        sb.append(this.id);
        sb.append(", count=");
        return vu5.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.count);
    }
}
