package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: AccountMessagesFoldersCounterItemDto.kt */
/* loaded from: classes14.dex */
public final class AccountMessagesFoldersCounterItemDto implements Parcelable {
    public static final Parcelable.Creator<AccountMessagesFoldersCounterItemDto> CREATOR = new a();

    @pmi0("folder_id")
    private final int folderId;

    @pmi0("total_count")
    private final int totalCount;

    @pmi0("unmuted_count")
    private final int unmutedCount;

    /* compiled from: AccountMessagesFoldersCounterItemDto.kt */
    public static final class a implements Parcelable.Creator<AccountMessagesFoldersCounterItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountMessagesFoldersCounterItemDto createFromParcel(Parcel parcel) {
            return new AccountMessagesFoldersCounterItemDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountMessagesFoldersCounterItemDto[] newArray(int i) {
            return new AccountMessagesFoldersCounterItemDto[i];
        }
    }

    public AccountMessagesFoldersCounterItemDto(int i, int i2, int i3) {
        this.folderId = i;
        this.totalCount = i2;
        this.unmutedCount = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountMessagesFoldersCounterItemDto)) {
            return false;
        }
        AccountMessagesFoldersCounterItemDto accountMessagesFoldersCounterItemDto = (AccountMessagesFoldersCounterItemDto) obj;
        return this.folderId == accountMessagesFoldersCounterItemDto.folderId && this.totalCount == accountMessagesFoldersCounterItemDto.totalCount && this.unmutedCount == accountMessagesFoldersCounterItemDto.unmutedCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.unmutedCount) + shy.a(this.totalCount, Integer.hashCode(this.folderId) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountMessagesFoldersCounterItemDto(folderId=");
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
