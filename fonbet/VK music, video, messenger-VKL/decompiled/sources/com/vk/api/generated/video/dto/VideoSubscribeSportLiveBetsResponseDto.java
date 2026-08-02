package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;

/* compiled from: VideoSubscribeSportLiveBetsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoSubscribeSportLiveBetsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoSubscribeSportLiveBetsResponseDto> CREATOR = new a();

    @pmi0("base_url")
    private final String baseUrl;

    @pmi0("key")
    private final String key;

    @pmi0("ts")
    private final int ts;

    /* compiled from: VideoSubscribeSportLiveBetsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoSubscribeSportLiveBetsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSubscribeSportLiveBetsResponseDto createFromParcel(Parcel parcel) {
            return new VideoSubscribeSportLiveBetsResponseDto(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSubscribeSportLiveBetsResponseDto[] newArray(int i) {
            return new VideoSubscribeSportLiveBetsResponseDto[i];
        }
    }

    public VideoSubscribeSportLiveBetsResponseDto(String str, String str2, int i) {
        this.baseUrl = str;
        this.key = str2;
        this.ts = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSubscribeSportLiveBetsResponseDto)) {
            return false;
        }
        VideoSubscribeSportLiveBetsResponseDto videoSubscribeSportLiveBetsResponseDto = (VideoSubscribeSportLiveBetsResponseDto) obj;
        return epx.f(this.baseUrl, videoSubscribeSportLiveBetsResponseDto.baseUrl) && epx.f(this.key, videoSubscribeSportLiveBetsResponseDto.key) && this.ts == videoSubscribeSportLiveBetsResponseDto.ts;
    }

    public final int hashCode() {
        return Integer.hashCode(this.ts) + urd0.a(this.baseUrl.hashCode() * 31, 31, this.key);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSubscribeSportLiveBetsResponseDto(baseUrl=");
        sb.append(this.baseUrl);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", ts=");
        return vu5.b(sb, this.ts, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.baseUrl);
        parcel.writeString(this.key);
        parcel.writeInt(this.ts);
    }
}
