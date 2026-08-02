package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesCreateFolderResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCreateFolderResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCreateFolderResponseDto> CREATOR = new a();

    @pmi0("folder_id")
    private final int folderId;

    /* compiled from: MessagesCreateFolderResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCreateFolderResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCreateFolderResponseDto createFromParcel(Parcel parcel) {
            return new MessagesCreateFolderResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCreateFolderResponseDto[] newArray(int i) {
            return new MessagesCreateFolderResponseDto[i];
        }
    }

    public MessagesCreateFolderResponseDto(int i) {
        this.folderId = i;
    }

    public final int d() {
        return this.folderId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesCreateFolderResponseDto) && this.folderId == ((MessagesCreateFolderResponseDto) obj).folderId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.folderId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("MessagesCreateFolderResponseDto(folderId="), this.folderId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.folderId);
    }
}
