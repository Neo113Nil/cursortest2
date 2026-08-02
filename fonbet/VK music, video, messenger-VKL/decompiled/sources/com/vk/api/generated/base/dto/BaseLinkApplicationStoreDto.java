package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLinkApplicationStoreDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkApplicationStoreDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkApplicationStoreDto> CREATOR = new a();

    @pmi0("id")
    private final Float id;

    @pmi0("name")
    private final String name;

    /* compiled from: BaseLinkApplicationStoreDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkApplicationStoreDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkApplicationStoreDto createFromParcel(Parcel parcel) {
            return new BaseLinkApplicationStoreDto(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkApplicationStoreDto[] newArray(int i) {
            return new BaseLinkApplicationStoreDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseLinkApplicationStoreDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkApplicationStoreDto)) {
            return false;
        }
        BaseLinkApplicationStoreDto baseLinkApplicationStoreDto = (BaseLinkApplicationStoreDto) obj;
        return epx.f(this.id, baseLinkApplicationStoreDto.id) && epx.f(this.name, baseLinkApplicationStoreDto.name);
    }

    public final int hashCode() {
        Float f = this.id;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLinkApplicationStoreDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.id;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeString(this.name);
    }

    public BaseLinkApplicationStoreDto(Float f, String str) {
        this.id = f;
        this.name = str;
    }

    public /* synthetic */ BaseLinkApplicationStoreDto(Float f, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : str);
    }
}
