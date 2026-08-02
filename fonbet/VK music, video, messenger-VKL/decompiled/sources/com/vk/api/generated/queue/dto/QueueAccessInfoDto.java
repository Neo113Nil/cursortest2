package com.vk.api.generated.queue.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: QueueAccessInfoDto.kt */
/* loaded from: classes15.dex */
public final class QueueAccessInfoDto implements Parcelable {
    public static final Parcelable.Creator<QueueAccessInfoDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("timestamp")
    private final int timestamp;

    /* compiled from: QueueAccessInfoDto.kt */
    public static final class a implements Parcelable.Creator<QueueAccessInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final QueueAccessInfoDto createFromParcel(Parcel parcel) {
            return new QueueAccessInfoDto(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final QueueAccessInfoDto[] newArray(int i) {
            return new QueueAccessInfoDto[i];
        }
    }

    public QueueAccessInfoDto(String str, int i) {
        this.key = str;
        this.timestamp = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueAccessInfoDto)) {
            return false;
        }
        QueueAccessInfoDto queueAccessInfoDto = (QueueAccessInfoDto) obj;
        return epx.f(this.key, queueAccessInfoDto.key) && this.timestamp == queueAccessInfoDto.timestamp;
    }

    public final int hashCode() {
        return Integer.hashCode(this.timestamp) + (this.key.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueAccessInfoDto(key=");
        sb.append(this.key);
        sb.append(", timestamp=");
        return vu5.b(sb, this.timestamp, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeInt(this.timestamp);
    }
}
