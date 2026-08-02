package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: StoriesGetGfycatTokenResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetGfycatTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetGfycatTokenResponseDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final int expiresIn;

    @pmi0("token")
    private final String token;

    /* compiled from: StoriesGetGfycatTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetGfycatTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetGfycatTokenResponseDto createFromParcel(Parcel parcel) {
            return new StoriesGetGfycatTokenResponseDto(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetGfycatTokenResponseDto[] newArray(int i) {
            return new StoriesGetGfycatTokenResponseDto[i];
        }
    }

    public StoriesGetGfycatTokenResponseDto(String str, int i) {
        this.token = str;
        this.expiresIn = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetGfycatTokenResponseDto)) {
            return false;
        }
        StoriesGetGfycatTokenResponseDto storiesGetGfycatTokenResponseDto = (StoriesGetGfycatTokenResponseDto) obj;
        return epx.f(this.token, storiesGetGfycatTokenResponseDto.token) && this.expiresIn == storiesGetGfycatTokenResponseDto.expiresIn;
    }

    public final int hashCode() {
        return Integer.hashCode(this.expiresIn) + (this.token.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetGfycatTokenResponseDto(token=");
        sb.append(this.token);
        sb.append(", expiresIn=");
        return vu5.b(sb, this.expiresIn, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        parcel.writeInt(this.expiresIn);
    }
}
