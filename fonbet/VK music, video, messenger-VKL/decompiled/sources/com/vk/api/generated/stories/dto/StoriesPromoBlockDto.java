package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: StoriesPromoBlockDto.kt */
/* loaded from: classes15.dex */
public final class StoriesPromoBlockDto implements Parcelable {
    public static final Parcelable.Creator<StoriesPromoBlockDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("not_animated")
    private final boolean notAnimated;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    /* compiled from: StoriesPromoBlockDto.kt */
    public static final class a implements Parcelable.Creator<StoriesPromoBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesPromoBlockDto createFromParcel(Parcel parcel) {
            return new StoriesPromoBlockDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesPromoBlockDto[] newArray(int i) {
            return new StoriesPromoBlockDto[i];
        }
    }

    public StoriesPromoBlockDto(String str, String str2, String str3, String str4, boolean z) {
        this.name = str;
        this.photo50 = str2;
        this.photo100 = str3;
        this.photoBase = str4;
        this.notAnimated = z;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.notAnimated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesPromoBlockDto)) {
            return false;
        }
        StoriesPromoBlockDto storiesPromoBlockDto = (StoriesPromoBlockDto) obj;
        return epx.f(this.name, storiesPromoBlockDto.name) && epx.f(this.photo50, storiesPromoBlockDto.photo50) && epx.f(this.photo100, storiesPromoBlockDto.photo100) && epx.f(this.photoBase, storiesPromoBlockDto.photoBase) && this.notAnimated == storiesPromoBlockDto.notAnimated;
    }

    public final String f() {
        return this.photo100;
    }

    public final String g() {
        return this.photo50;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.notAnimated) + urd0.a(urd0.a(urd0.a(this.name.hashCode() * 31, 31, this.photo50), 31, this.photo100), 31, this.photoBase);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesPromoBlockDto(name=");
        sb.append(this.name);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", notAnimated=");
        return q0.a(sb, this.notAnimated, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photoBase);
        parcel.writeInt(this.notAnimated ? 1 : 0);
    }
}
