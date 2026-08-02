package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ShortVideoDeletePlaylistsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoDeletePlaylistsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoDeletePlaylistsResponseDto> CREATOR = new a();

    @pmi0("playlists")
    private final List<ShortVideoDeletedPlaylistDto> playlists;

    /* compiled from: ShortVideoDeletePlaylistsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoDeletePlaylistsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoDeletePlaylistsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoDeletedPlaylistDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoDeletePlaylistsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoDeletePlaylistsResponseDto[] newArray(int i) {
            return new ShortVideoDeletePlaylistsResponseDto[i];
        }
    }

    public ShortVideoDeletePlaylistsResponseDto(List<ShortVideoDeletedPlaylistDto> list) {
        this.playlists = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoDeletePlaylistsResponseDto) && epx.f(this.playlists, ((ShortVideoDeletePlaylistsResponseDto) obj).playlists);
    }

    public final int hashCode() {
        return this.playlists.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ShortVideoDeletePlaylistsResponseDto(playlists="), this.playlists);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.playlists);
        while (a2.hasNext()) {
            ((ShortVideoDeletedPlaylistDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
