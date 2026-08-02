package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ServerEffectsVideoThumbDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsVideoThumbDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsVideoThumbDto> CREATOR = new a();

    @pmi0("thumb_full_id")
    private final String thumbFullId;

    @pmi0("url")
    private final String url;

    /* compiled from: ServerEffectsVideoThumbDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsVideoThumbDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsVideoThumbDto createFromParcel(Parcel parcel) {
            return new ServerEffectsVideoThumbDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsVideoThumbDto[] newArray(int i) {
            return new ServerEffectsVideoThumbDto[i];
        }
    }

    public ServerEffectsVideoThumbDto(String str, String str2) {
        this.thumbFullId = str;
        this.url = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerEffectsVideoThumbDto)) {
            return false;
        }
        ServerEffectsVideoThumbDto serverEffectsVideoThumbDto = (ServerEffectsVideoThumbDto) obj;
        return epx.f(this.thumbFullId, serverEffectsVideoThumbDto.thumbFullId) && epx.f(this.url, serverEffectsVideoThumbDto.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.thumbFullId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerEffectsVideoThumbDto(thumbFullId=");
        sb.append(this.thumbFullId);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.thumbFullId);
        parcel.writeString(this.url);
    }
}
