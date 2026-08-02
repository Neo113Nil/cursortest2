package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PodcastsLegalNoticeDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsLegalNoticeDto implements Parcelable {
    public static final Parcelable.Creator<PodcastsLegalNoticeDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: PodcastsLegalNoticeDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsLegalNoticeDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsLegalNoticeDto createFromParcel(Parcel parcel) {
            return new PodcastsLegalNoticeDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsLegalNoticeDto[] newArray(int i) {
            return new PodcastsLegalNoticeDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PodcastsLegalNoticeDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastsLegalNoticeDto)) {
            return false;
        }
        PodcastsLegalNoticeDto podcastsLegalNoticeDto = (PodcastsLegalNoticeDto) obj;
        return epx.f(this.title, podcastsLegalNoticeDto.title) && epx.f(this.text, podcastsLegalNoticeDto.text);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastsLegalNoticeDto(title=");
        sb.append(this.title);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
    }

    public PodcastsLegalNoticeDto(String str, String str2) {
        this.title = str;
        this.text = str2;
    }

    public /* synthetic */ PodcastsLegalNoticeDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
