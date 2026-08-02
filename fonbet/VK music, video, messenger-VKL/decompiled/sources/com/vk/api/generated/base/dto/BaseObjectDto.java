package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: BaseObjectDto.kt */
/* loaded from: classes14.dex */
public final class BaseObjectDto implements Parcelable {
    public static final Parcelable.Creator<BaseObjectDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: BaseObjectDto.kt */
    public static final class a implements Parcelable.Creator<BaseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseObjectDto createFromParcel(Parcel parcel) {
            return new BaseObjectDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseObjectDto[] newArray(int i) {
            return new BaseObjectDto[i];
        }
    }

    public BaseObjectDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseObjectDto)) {
            return false;
        }
        BaseObjectDto baseObjectDto = (BaseObjectDto) obj;
        return this.id == baseObjectDto.id && epx.f(this.title, baseObjectDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseObjectDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }
}
