package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarusiaPlaylistDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaPlaylistDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaPlaylistDto> CREATOR = new a();

    @pmi0("length")
    private final Integer length;

    @pmi0("media_type")
    private final Integer mediaType;

    @pmi0("seek_second")
    private final Integer seekSecond;

    @pmi0("seek_track")
    private final Integer seekTrack;

    @pmi0("tracks")
    private final List<MarusiaPlaylistTrackDto> tracks;

    @pmi0("tracks_type")
    private final String tracksType;

    /* compiled from: MarusiaPlaylistDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaPlaylistDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaPlaylistDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarusiaPlaylistTrackDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarusiaPlaylistDto(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaPlaylistDto[] newArray(int i) {
            return new MarusiaPlaylistDto[i];
        }
    }

    public MarusiaPlaylistDto(List<MarusiaPlaylistTrackDto> list, String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this.tracks = list;
        this.tracksType = str;
        this.mediaType = num;
        this.seekTrack = num2;
        this.seekSecond = num3;
        this.length = num4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaPlaylistDto)) {
            return false;
        }
        MarusiaPlaylistDto marusiaPlaylistDto = (MarusiaPlaylistDto) obj;
        return epx.f(this.tracks, marusiaPlaylistDto.tracks) && epx.f(this.tracksType, marusiaPlaylistDto.tracksType) && epx.f(this.mediaType, marusiaPlaylistDto.mediaType) && epx.f(this.seekTrack, marusiaPlaylistDto.seekTrack) && epx.f(this.seekSecond, marusiaPlaylistDto.seekSecond) && epx.f(this.length, marusiaPlaylistDto.length);
    }

    public final int hashCode() {
        int hashCode = this.tracks.hashCode() * 31;
        String str = this.tracksType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.mediaType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.seekTrack;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.seekSecond;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.length;
        return hashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaPlaylistDto(tracks=");
        sb.append(this.tracks);
        sb.append(", tracksType=");
        sb.append(this.tracksType);
        sb.append(", mediaType=");
        sb.append(this.mediaType);
        sb.append(", seekTrack=");
        sb.append(this.seekTrack);
        sb.append(", seekSecond=");
        sb.append(this.seekSecond);
        sb.append(", length=");
        return uqi.b(sb, this.length, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.tracks);
        while (a2.hasNext()) {
            ((MarusiaPlaylistTrackDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.tracksType);
        Integer num = this.mediaType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.seekTrack;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.seekSecond;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.length;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public /* synthetic */ MarusiaPlaylistDto(List list, String str, Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4);
    }
}
