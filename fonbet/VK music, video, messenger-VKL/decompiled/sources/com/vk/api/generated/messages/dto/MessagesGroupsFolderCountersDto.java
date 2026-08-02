package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: MessagesGroupsFolderCountersDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGroupsFolderCountersDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGroupsFolderCountersDto> CREATOR = new a();

    @pmi0("dialogs_count")
    private final int dialogsCount;

    @pmi0("dialogs_count_unmuted")
    private final int dialogsCountUnmuted;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: MessagesGroupsFolderCountersDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGroupsFolderCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGroupsFolderCountersDto createFromParcel(Parcel parcel) {
            return new MessagesGroupsFolderCountersDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGroupsFolderCountersDto[] newArray(int i) {
            return new MessagesGroupsFolderCountersDto[i];
        }
    }

    public MessagesGroupsFolderCountersDto(int i, int i2, int i3) {
        this.totalCount = i;
        this.dialogsCount = i2;
        this.dialogsCountUnmuted = i3;
    }

    public final int d() {
        return this.dialogsCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.dialogsCountUnmuted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGroupsFolderCountersDto)) {
            return false;
        }
        MessagesGroupsFolderCountersDto messagesGroupsFolderCountersDto = (MessagesGroupsFolderCountersDto) obj;
        return this.totalCount == messagesGroupsFolderCountersDto.totalCount && this.dialogsCount == messagesGroupsFolderCountersDto.dialogsCount && this.dialogsCountUnmuted == messagesGroupsFolderCountersDto.dialogsCountUnmuted;
    }

    public final int f() {
        return this.totalCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.dialogsCountUnmuted) + shy.a(this.dialogsCount, Integer.hashCode(this.totalCount) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGroupsFolderCountersDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", dialogsCount=");
        sb.append(this.dialogsCount);
        sb.append(", dialogsCountUnmuted=");
        return vu5.b(sb, this.dialogsCountUnmuted, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.dialogsCount);
        parcel.writeInt(this.dialogsCountUnmuted);
    }
}
