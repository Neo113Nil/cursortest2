package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.MetaBox;
import xsna.epx;
import xsna.k73;
import xsna.pmi0;

/* compiled from: MarusiaPlaylistTrackDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaPlaylistTrackDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaPlaylistTrackDto> CREATOR = new a();

    @pmi0(MetaBox.TYPE)
    private final Object meta;

    @pmi0("url")
    private final String url;

    /* compiled from: MarusiaPlaylistTrackDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaPlaylistTrackDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaPlaylistTrackDto createFromParcel(Parcel parcel) {
            return new MarusiaPlaylistTrackDto(parcel.readString(), parcel.readValue(MarusiaPlaylistTrackDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaPlaylistTrackDto[] newArray(int i) {
            return new MarusiaPlaylistTrackDto[i];
        }
    }

    public MarusiaPlaylistTrackDto(String str, Object obj) {
        this.url = str;
        this.meta = obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaPlaylistTrackDto)) {
            return false;
        }
        MarusiaPlaylistTrackDto marusiaPlaylistTrackDto = (MarusiaPlaylistTrackDto) obj;
        return epx.f(this.url, marusiaPlaylistTrackDto.url) && epx.f(this.meta, marusiaPlaylistTrackDto.meta);
    }

    public final int hashCode() {
        return this.meta.hashCode() + (this.url.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaPlaylistTrackDto(url=");
        sb.append(this.url);
        sb.append(", meta=");
        return k73.c(sb, this.meta, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeValue(this.meta);
    }
}
