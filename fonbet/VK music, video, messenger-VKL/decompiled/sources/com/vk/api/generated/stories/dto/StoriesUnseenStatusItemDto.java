package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StoriesUnseenStatusItemDto.kt */
/* loaded from: classes15.dex */
public final class StoriesUnseenStatusItemDto implements Parcelable {
    public static final Parcelable.Creator<StoriesUnseenStatusItemDto> CREATOR = new a();

    @pmi0("is_unseen")
    private final boolean isUnseen;

    @pmi0("owner_id")
    private final UserId ownerId;

    /* compiled from: StoriesUnseenStatusItemDto.kt */
    public static final class a implements Parcelable.Creator<StoriesUnseenStatusItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesUnseenStatusItemDto createFromParcel(Parcel parcel) {
            return new StoriesUnseenStatusItemDto((UserId) parcel.readParcelable(StoriesUnseenStatusItemDto.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesUnseenStatusItemDto[] newArray(int i) {
            return new StoriesUnseenStatusItemDto[i];
        }
    }

    public StoriesUnseenStatusItemDto(UserId userId, boolean z) {
        this.ownerId = userId;
        this.isUnseen = z;
    }

    public final boolean d() {
        return this.isUnseen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesUnseenStatusItemDto)) {
            return false;
        }
        StoriesUnseenStatusItemDto storiesUnseenStatusItemDto = (StoriesUnseenStatusItemDto) obj;
        return epx.f(this.ownerId, storiesUnseenStatusItemDto.ownerId) && this.isUnseen == storiesUnseenStatusItemDto.isUnseen;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isUnseen) + (Long.hashCode(this.ownerId.b) * 31);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesUnseenStatusItemDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", isUnseen=");
        return q0.a(sb, this.isUnseen, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.isUnseen ? 1 : 0);
    }
}
