package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: NotificationsEntityVideoPlaylistDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsEntityVideoPlaylistDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsEntityVideoPlaylistDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("playlist_id")
    private final int playlistId;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationsEntityVideoPlaylistDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("video_playlist")
        public static final TypeDto VIDEO_PLAYLIST;
        private final String value;

        /* compiled from: NotificationsEntityVideoPlaylistDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("VIDEO_PLAYLIST", 0, "video_playlist");
            VIDEO_PLAYLIST = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: NotificationsEntityVideoPlaylistDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsEntityVideoPlaylistDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsEntityVideoPlaylistDto createFromParcel(Parcel parcel) {
            return new NotificationsEntityVideoPlaylistDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(NotificationsEntityVideoPlaylistDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsEntityVideoPlaylistDto[] newArray(int i) {
            return new NotificationsEntityVideoPlaylistDto[i];
        }
    }

    public NotificationsEntityVideoPlaylistDto(TypeDto typeDto, UserId userId, int i, String str) {
        this.type = typeDto;
        this.ownerId = userId;
        this.playlistId = i;
        this.url = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsEntityVideoPlaylistDto)) {
            return false;
        }
        NotificationsEntityVideoPlaylistDto notificationsEntityVideoPlaylistDto = (NotificationsEntityVideoPlaylistDto) obj;
        return this.type == notificationsEntityVideoPlaylistDto.type && epx.f(this.ownerId, notificationsEntityVideoPlaylistDto.ownerId) && this.playlistId == notificationsEntityVideoPlaylistDto.playlistId && epx.f(this.url, notificationsEntityVideoPlaylistDto.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + shy.a(this.playlistId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsEntityVideoPlaylistDto(type=");
        sb.append(this.type);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.playlistId);
        parcel.writeString(this.url);
    }
}
