package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: MessagesFoldersCounterItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesFoldersCounterItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesFoldersCounterItemDto> CREATOR = new a();

    @pmi0("folder_id")
    private final int folderId;

    @pmi0("total_count")
    private final int totalCount;

    @pmi0("unmuted_count")
    private final int unmutedCount;

    /* compiled from: MessagesFoldersCounterItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesFoldersCounterItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesFoldersCounterItemDto createFromParcel(Parcel parcel) {
            return new MessagesFoldersCounterItemDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesFoldersCounterItemDto[] newArray(int i) {
            return new MessagesFoldersCounterItemDto[i];
        }
    }

    public MessagesFoldersCounterItemDto(int i, int i2, int i3) {
        this.folderId = i;
        this.totalCount = i2;
        this.unmutedCount = i3;
    }

    public final int d() {
        return this.folderId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.totalCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesFoldersCounterItemDto)) {
            return false;
        }
        MessagesFoldersCounterItemDto messagesFoldersCounterItemDto = (MessagesFoldersCounterItemDto) obj;
        return this.folderId == messagesFoldersCounterItemDto.folderId && this.totalCount == messagesFoldersCounterItemDto.totalCount && this.unmutedCount == messagesFoldersCounterItemDto.unmutedCount;
    }

    public final int f() {
        return this.unmutedCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.unmutedCount) + shy.a(this.totalCount, Integer.hashCode(this.folderId) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesFoldersCounterItemDto(folderId=");
        sb.append(this.folderId);
        sb.append(", totalCount=");
        sb.append(this.totalCount);
        sb.append(", unmutedCount=");
        return vu5.b(sb, this.unmutedCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.folderId);
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.unmutedCount);
    }
}
