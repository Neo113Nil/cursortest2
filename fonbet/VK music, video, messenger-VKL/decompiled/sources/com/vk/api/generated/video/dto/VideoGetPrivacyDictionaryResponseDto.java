package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoGetPrivacyDictionaryResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetPrivacyDictionaryResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetPrivacyDictionaryResponseDto> CREATOR = new a();

    @pmi0("privacy")
    private final VideoPrivacySectionDto privacy;

    /* compiled from: VideoGetPrivacyDictionaryResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetPrivacyDictionaryResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetPrivacyDictionaryResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetPrivacyDictionaryResponseDto(VideoPrivacySectionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetPrivacyDictionaryResponseDto[] newArray(int i) {
            return new VideoGetPrivacyDictionaryResponseDto[i];
        }
    }

    public VideoGetPrivacyDictionaryResponseDto(VideoPrivacySectionDto videoPrivacySectionDto) {
        this.privacy = videoPrivacySectionDto;
    }

    public final VideoPrivacySectionDto d() {
        return this.privacy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGetPrivacyDictionaryResponseDto) && epx.f(this.privacy, ((VideoGetPrivacyDictionaryResponseDto) obj).privacy);
    }

    public final int hashCode() {
        return this.privacy.hashCode();
    }

    public final String toString() {
        return "VideoGetPrivacyDictionaryResponseDto(privacy=" + this.privacy + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.privacy.writeToParcel(parcel, i);
    }
}
