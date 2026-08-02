package com.vk.api.generated.kidsCollection.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: KidsCollectionAddPlaylistResponseDto.kt */
/* loaded from: classes14.dex */
public final class KidsCollectionAddPlaylistResponseDto implements Parcelable {
    public static final Parcelable.Creator<KidsCollectionAddPlaylistResponseDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("playlist_id")
    private final Integer playlistId;

    @pmi0("result")
    private final int result;

    /* compiled from: KidsCollectionAddPlaylistResponseDto.kt */
    public static final class a implements Parcelable.Creator<KidsCollectionAddPlaylistResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final KidsCollectionAddPlaylistResponseDto createFromParcel(Parcel parcel) {
            return new KidsCollectionAddPlaylistResponseDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(KidsCollectionAddPlaylistResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final KidsCollectionAddPlaylistResponseDto[] newArray(int i) {
            return new KidsCollectionAddPlaylistResponseDto[i];
        }
    }

    public KidsCollectionAddPlaylistResponseDto(int i, Integer num, UserId userId) {
        this.result = i;
        this.playlistId = num;
        this.ownerId = userId;
    }

    public final Integer d() {
        return this.playlistId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsCollectionAddPlaylistResponseDto)) {
            return false;
        }
        KidsCollectionAddPlaylistResponseDto kidsCollectionAddPlaylistResponseDto = (KidsCollectionAddPlaylistResponseDto) obj;
        return this.result == kidsCollectionAddPlaylistResponseDto.result && epx.f(this.playlistId, kidsCollectionAddPlaylistResponseDto.playlistId) && epx.f(this.ownerId, kidsCollectionAddPlaylistResponseDto.ownerId);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.result) * 31;
        Integer num = this.playlistId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        UserId userId = this.ownerId;
        return hashCode2 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KidsCollectionAddPlaylistResponseDto(result=");
        sb.append(this.result);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", ownerId=");
        return gp.b(sb, this.ownerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.result);
        Integer num = this.playlistId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.ownerId, i);
    }

    public /* synthetic */ KidsCollectionAddPlaylistResponseDto(int i, Integer num, UserId userId, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : userId);
    }
}
