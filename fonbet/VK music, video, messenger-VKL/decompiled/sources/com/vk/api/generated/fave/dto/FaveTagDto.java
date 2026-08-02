package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FaveTagDto.kt */
/* loaded from: classes14.dex */
public final class FaveTagDto implements Parcelable {
    public static final Parcelable.Creator<FaveTagDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    /* compiled from: FaveTagDto.kt */
    public static final class a implements Parcelable.Creator<FaveTagDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveTagDto createFromParcel(Parcel parcel) {
            return new FaveTagDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FaveTagDto[] newArray(int i) {
            return new FaveTagDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaveTagDto() {
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
        if (!(obj instanceof FaveTagDto)) {
            return false;
        }
        FaveTagDto faveTagDto = (FaveTagDto) obj;
        return epx.f(this.id, faveTagDto.id) && epx.f(this.name, faveTagDto.name);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveTagDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.name);
    }

    public FaveTagDto(Integer num, String str) {
        this.id = num;
        this.name = str;
    }

    public /* synthetic */ FaveTagDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
