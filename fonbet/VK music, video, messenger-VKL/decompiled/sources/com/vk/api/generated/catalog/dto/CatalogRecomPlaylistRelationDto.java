package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogRecomPlaylistRelationDto.kt */
/* loaded from: classes14.dex */
public final class CatalogRecomPlaylistRelationDto implements Parcelable {
    public static final Parcelable.Creator<CatalogRecomPlaylistRelationDto> CREATOR = new a();

    @pmi0("artists_ids")
    private final List<String> artistsIds;

    @pmi0("playlist_id")
    private final String playlistId;

    /* compiled from: CatalogRecomPlaylistRelationDto.kt */
    public static final class a implements Parcelable.Creator<CatalogRecomPlaylistRelationDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogRecomPlaylistRelationDto createFromParcel(Parcel parcel) {
            return new CatalogRecomPlaylistRelationDto(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogRecomPlaylistRelationDto[] newArray(int i) {
            return new CatalogRecomPlaylistRelationDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogRecomPlaylistRelationDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<String> d() {
        return this.artistsIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.playlistId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogRecomPlaylistRelationDto)) {
            return false;
        }
        CatalogRecomPlaylistRelationDto catalogRecomPlaylistRelationDto = (CatalogRecomPlaylistRelationDto) obj;
        return epx.f(this.playlistId, catalogRecomPlaylistRelationDto.playlistId) && epx.f(this.artistsIds, catalogRecomPlaylistRelationDto.artistsIds);
    }

    public final int hashCode() {
        String str = this.playlistId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.artistsIds;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogRecomPlaylistRelationDto(playlistId=");
        sb.append(this.playlistId);
        sb.append(", artistsIds=");
        return ms9.a(')', sb, this.artistsIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.playlistId);
        parcel.writeStringList(this.artistsIds);
    }

    public CatalogRecomPlaylistRelationDto(String str, List<String> list) {
        this.playlistId = str;
        this.artistsIds = list;
    }

    public /* synthetic */ CatalogRecomPlaylistRelationDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
