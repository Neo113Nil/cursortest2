package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: StoriesClickableAreaDto.kt */
/* loaded from: classes15.dex */
public final class StoriesClickableAreaDto implements Parcelable {
    public static final Parcelable.Creator<StoriesClickableAreaDto> CREATOR = new a();

    @pmi0("x")
    private final int x;

    @pmi0("y")
    private final int y;

    /* compiled from: StoriesClickableAreaDto.kt */
    public static final class a implements Parcelable.Creator<StoriesClickableAreaDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesClickableAreaDto createFromParcel(Parcel parcel) {
            return new StoriesClickableAreaDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesClickableAreaDto[] newArray(int i) {
            return new StoriesClickableAreaDto[i];
        }
    }

    public StoriesClickableAreaDto(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public final int d() {
        return this.x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesClickableAreaDto)) {
            return false;
        }
        StoriesClickableAreaDto storiesClickableAreaDto = (StoriesClickableAreaDto) obj;
        return this.x == storiesClickableAreaDto.x && this.y == storiesClickableAreaDto.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (Integer.hashCode(this.x) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesClickableAreaDto(x=");
        sb.append(this.x);
        sb.append(", y=");
        return vu5.b(sb, this.y, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
    }
}
