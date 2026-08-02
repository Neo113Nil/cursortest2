package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CatalogUxPollDto.kt */
/* loaded from: classes14.dex */
public final class CatalogUxPollDto implements Parcelable {
    public static final Parcelable.Creator<CatalogUxPollDto> CREATOR = new a();

    @pmi0("poll_id")
    private final String pollId;

    @pmi0("video_id")
    private final long videoId;

    @pmi0("video_owner_id")
    private final long videoOwnerId;

    /* compiled from: CatalogUxPollDto.kt */
    public static final class a implements Parcelable.Creator<CatalogUxPollDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogUxPollDto createFromParcel(Parcel parcel) {
            return new CatalogUxPollDto(parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogUxPollDto[] newArray(int i) {
            return new CatalogUxPollDto[i];
        }
    }

    public CatalogUxPollDto(long j, long j2, String str) {
        this.videoOwnerId = j;
        this.videoId = j2;
        this.pollId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogUxPollDto)) {
            return false;
        }
        CatalogUxPollDto catalogUxPollDto = (CatalogUxPollDto) obj;
        return this.videoOwnerId == catalogUxPollDto.videoOwnerId && this.videoId == catalogUxPollDto.videoId && epx.f(this.pollId, catalogUxPollDto.pollId);
    }

    public final int hashCode() {
        return this.pollId.hashCode() + bh10.a(Long.hashCode(this.videoOwnerId) * 31, 31, this.videoId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogUxPollDto(videoOwnerId=");
        sb.append(this.videoOwnerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", pollId=");
        return ho8.a(sb, this.pollId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.videoOwnerId);
        parcel.writeLong(this.videoId);
        parcel.writeString(this.pollId);
    }
}
