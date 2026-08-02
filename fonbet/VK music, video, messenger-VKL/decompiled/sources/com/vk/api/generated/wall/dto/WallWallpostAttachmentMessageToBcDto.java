package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;

/* compiled from: WallWallpostAttachmentMessageToBcDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentMessageToBcDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAttachmentMessageToBcDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    /* compiled from: WallWallpostAttachmentMessageToBcDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentMessageToBcDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentMessageToBcDto createFromParcel(Parcel parcel) {
            return new WallWallpostAttachmentMessageToBcDto((UserId) parcel.readParcelable(WallWallpostAttachmentMessageToBcDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentMessageToBcDto[] newArray(int i) {
            return new WallWallpostAttachmentMessageToBcDto[i];
        }
    }

    public WallWallpostAttachmentMessageToBcDto(UserId userId) {
        this.ownerId = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallWallpostAttachmentMessageToBcDto) && epx.f(this.ownerId, ((WallWallpostAttachmentMessageToBcDto) obj).ownerId);
    }

    public final int hashCode() {
        return Long.hashCode(this.ownerId.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("WallWallpostAttachmentMessageToBcDto(ownerId="), this.ownerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
    }
}
