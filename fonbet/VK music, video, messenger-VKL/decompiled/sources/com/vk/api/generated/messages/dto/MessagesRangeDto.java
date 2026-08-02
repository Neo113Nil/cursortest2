package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesRangeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesRangeDto implements Parcelable {
    public static final Parcelable.Creator<MessagesRangeDto> CREATOR = new a();

    @pmi0(InneractiveMediationNameConsts.MAX)
    private final long max;

    @pmi0(UcumUtils.UCUM_MINUTES)
    private final long min;

    /* compiled from: MessagesRangeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesRangeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesRangeDto createFromParcel(Parcel parcel) {
            return new MessagesRangeDto(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesRangeDto[] newArray(int i) {
            return new MessagesRangeDto[i];
        }
    }

    public MessagesRangeDto(long j, long j2) {
        this.min = j;
        this.max = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesRangeDto)) {
            return false;
        }
        MessagesRangeDto messagesRangeDto = (MessagesRangeDto) obj;
        return this.min == messagesRangeDto.min && this.max == messagesRangeDto.max;
    }

    public final int hashCode() {
        return Long.hashCode(this.max) + (Long.hashCode(this.min) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesRangeDto(min=");
        sb.append(this.min);
        sb.append(", max=");
        return vu5.a(')', this.max, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.min);
        parcel.writeLong(this.max);
    }
}
