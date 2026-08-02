package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: MessagesVideoMessageShapeResponseItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesVideoMessageShapeResponseItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesVideoMessageShapeResponseItemDto> CREATOR = new a();

    @pmi0("end_date")
    private final int endDate;

    @pmi0("id")
    private final int id;

    @pmi0("raw_path")
    private final String rawPath;

    @pmi0("start_date")
    private final int startDate;

    /* compiled from: MessagesVideoMessageShapeResponseItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesVideoMessageShapeResponseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesVideoMessageShapeResponseItemDto createFromParcel(Parcel parcel) {
            return new MessagesVideoMessageShapeResponseItemDto(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesVideoMessageShapeResponseItemDto[] newArray(int i) {
            return new MessagesVideoMessageShapeResponseItemDto[i];
        }
    }

    public MessagesVideoMessageShapeResponseItemDto(int i, String str, int i2, int i3) {
        this.id = i;
        this.rawPath = str;
        this.startDate = i2;
        this.endDate = i3;
    }

    public final int d() {
        return this.endDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.rawPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesVideoMessageShapeResponseItemDto)) {
            return false;
        }
        MessagesVideoMessageShapeResponseItemDto messagesVideoMessageShapeResponseItemDto = (MessagesVideoMessageShapeResponseItemDto) obj;
        return this.id == messagesVideoMessageShapeResponseItemDto.id && epx.f(this.rawPath, messagesVideoMessageShapeResponseItemDto.rawPath) && this.startDate == messagesVideoMessageShapeResponseItemDto.startDate && this.endDate == messagesVideoMessageShapeResponseItemDto.endDate;
    }

    public final int f() {
        return this.startDate;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return Integer.hashCode(this.endDate) + shy.a(this.startDate, urd0.a(Integer.hashCode(this.id) * 31, 31, this.rawPath), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesVideoMessageShapeResponseItemDto(id=");
        sb.append(this.id);
        sb.append(", rawPath=");
        sb.append(this.rawPath);
        sb.append(", startDate=");
        sb.append(this.startDate);
        sb.append(", endDate=");
        return vu5.b(sb, this.endDate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.rawPath);
        parcel.writeInt(this.startDate);
        parcel.writeInt(this.endDate);
    }
}
