package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: CallsReactionImageDto.kt */
/* loaded from: classes14.dex */
public final class CallsReactionImageDto implements Parcelable {
    public static final Parcelable.Creator<CallsReactionImageDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: CallsReactionImageDto.kt */
    public static final class a implements Parcelable.Creator<CallsReactionImageDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsReactionImageDto createFromParcel(Parcel parcel) {
            return new CallsReactionImageDto(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsReactionImageDto[] newArray(int i) {
            return new CallsReactionImageDto[i];
        }
    }

    public CallsReactionImageDto(int i, int i2, String str) {
        this.width = i;
        this.height = i2;
        this.url = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsReactionImageDto)) {
            return false;
        }
        CallsReactionImageDto callsReactionImageDto = (CallsReactionImageDto) obj;
        return this.width == callsReactionImageDto.width && this.height == callsReactionImageDto.height && epx.f(this.url, callsReactionImageDto.url);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return this.url.hashCode() + shy.a(this.height, Integer.hashCode(this.width) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsReactionImageDto(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.url);
    }
}
