package com.vk.api.generated.shortVideo.dto;

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
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ShortVideoGetPlaylistsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetPlaylistsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetPlaylistsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<ShortVideoPlaylistFullDto> items;

    @pmi0("max_playlists")
    private final Integer maxPlaylists;

    @pmi0("max_videos")
    private final Integer maxVideos;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: ShortVideoGetPlaylistsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetPlaylistsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetPlaylistsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoPlaylistFullDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoGetPlaylistsResponseDto(arrayList, parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetPlaylistsResponseDto[] newArray(int i) {
            return new ShortVideoGetPlaylistsResponseDto[i];
        }
    }

    public ShortVideoGetPlaylistsResponseDto(List<ShortVideoPlaylistFullDto> list, int i, String str, Integer num, Integer num2) {
        this.items = list;
        this.count = i;
        this.nextFrom = str;
        this.maxVideos = num;
        this.maxPlaylists = num2;
    }

    public final List<ShortVideoPlaylistFullDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.maxPlaylists;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGetPlaylistsResponseDto)) {
            return false;
        }
        ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = (ShortVideoGetPlaylistsResponseDto) obj;
        return epx.f(this.items, shortVideoGetPlaylistsResponseDto.items) && this.count == shortVideoGetPlaylistsResponseDto.count && epx.f(this.nextFrom, shortVideoGetPlaylistsResponseDto.nextFrom) && epx.f(this.maxVideos, shortVideoGetPlaylistsResponseDto.maxVideos) && epx.f(this.maxPlaylists, shortVideoGetPlaylistsResponseDto.maxPlaylists);
    }

    public final Integer f() {
        return this.maxVideos;
    }

    public final String g() {
        return this.nextFrom;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, this.items.hashCode() * 31, 31);
        String str = this.nextFrom;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.maxVideos;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxPlaylists;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetPlaylistsResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", maxVideos=");
        sb.append(this.maxVideos);
        sb.append(", maxPlaylists=");
        return uqi.b(sb, this.maxPlaylists, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ShortVideoPlaylistFullDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
        parcel.writeString(this.nextFrom);
        Integer num = this.maxVideos;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.maxPlaylists;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ ShortVideoGetPlaylistsResponseDto(List list, int i, String str, Integer num, Integer num2, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2);
    }
}
