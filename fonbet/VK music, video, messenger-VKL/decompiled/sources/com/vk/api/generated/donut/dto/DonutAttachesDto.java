package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: DonutAttachesDto.kt */
/* loaded from: classes14.dex */
public final class DonutAttachesDto implements Parcelable {
    public static final Parcelable.Creator<DonutAttachesDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: DonutAttachesDto.kt */
    public static final class a implements Parcelable.Creator<DonutAttachesDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutAttachesDto createFromParcel(Parcel parcel) {
            return new DonutAttachesDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutAttachesDto[] newArray(int i) {
            return new DonutAttachesDto[i];
        }
    }

    public DonutAttachesDto(int i, String str, String str2) {
        this.id = i;
        this.title = str;
        this.subtitle = str2;
    }

    public final String d() {
        return this.subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutAttachesDto)) {
            return false;
        }
        DonutAttachesDto donutAttachesDto = (DonutAttachesDto) obj;
        return this.id == donutAttachesDto.id && epx.f(this.title, donutAttachesDto.title) && epx.f(this.subtitle, donutAttachesDto.subtitle);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutAttachesDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return ho8.a(sb, this.subtitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
    }
}
