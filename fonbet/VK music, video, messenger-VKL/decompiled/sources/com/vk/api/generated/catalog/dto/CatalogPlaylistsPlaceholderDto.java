package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogPlaylistsPlaceholderDto.kt */
/* loaded from: classes14.dex */
public final class CatalogPlaylistsPlaceholderDto implements Parcelable {
    public static final Parcelable.Creator<CatalogPlaylistsPlaceholderDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("name")
    private final String name;

    @pmi0("playlist_id")
    private final String playlistId;

    /* compiled from: CatalogPlaylistsPlaceholderDto.kt */
    public static final class a implements Parcelable.Creator<CatalogPlaylistsPlaceholderDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogPlaylistsPlaceholderDto createFromParcel(Parcel parcel) {
            return new CatalogPlaylistsPlaceholderDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogPlaylistsPlaceholderDto[] newArray(int i) {
            return new CatalogPlaylistsPlaceholderDto[i];
        }
    }

    public CatalogPlaylistsPlaceholderDto(String str, String str2, String str3) {
        this.playlistId = str;
        this.name = str2;
        this.description = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogPlaylistsPlaceholderDto)) {
            return false;
        }
        CatalogPlaylistsPlaceholderDto catalogPlaylistsPlaceholderDto = (CatalogPlaylistsPlaceholderDto) obj;
        return epx.f(this.playlistId, catalogPlaylistsPlaceholderDto.playlistId) && epx.f(this.name, catalogPlaylistsPlaceholderDto.name) && epx.f(this.description, catalogPlaylistsPlaceholderDto.description);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.playlistId.hashCode() * 31, 31, this.name);
        String str = this.description;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogPlaylistsPlaceholderDto(playlistId=");
        sb.append(this.playlistId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.playlistId);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
    }

    public /* synthetic */ CatalogPlaylistsPlaceholderDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
