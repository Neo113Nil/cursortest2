package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AccountChannelsCounterDto.kt */
/* loaded from: classes14.dex */
public final class AccountChannelsCounterDto implements Parcelable {
    public static final Parcelable.Creator<AccountChannelsCounterDto> CREATOR = new a();

    @pmi0("all_folder_count")
    private final Integer allFolderCount;

    @pmi0("all_folder_unmuted_count")
    private final Integer allFolderUnmutedCount;

    @pmi0("archived_count")
    private final int archivedCount;

    @pmi0("total_count")
    private final int totalCount;

    @pmi0("unmuted_count")
    private final int unmutedCount;

    /* compiled from: AccountChannelsCounterDto.kt */
    public static final class a implements Parcelable.Creator<AccountChannelsCounterDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountChannelsCounterDto createFromParcel(Parcel parcel) {
            return new AccountChannelsCounterDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountChannelsCounterDto[] newArray(int i) {
            return new AccountChannelsCounterDto[i];
        }
    }

    public AccountChannelsCounterDto(int i, int i2, int i3, Integer num, Integer num2) {
        this.totalCount = i;
        this.unmutedCount = i2;
        this.archivedCount = i3;
        this.allFolderCount = num;
        this.allFolderUnmutedCount = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountChannelsCounterDto)) {
            return false;
        }
        AccountChannelsCounterDto accountChannelsCounterDto = (AccountChannelsCounterDto) obj;
        return this.totalCount == accountChannelsCounterDto.totalCount && this.unmutedCount == accountChannelsCounterDto.unmutedCount && this.archivedCount == accountChannelsCounterDto.archivedCount && epx.f(this.allFolderCount, accountChannelsCounterDto.allFolderCount) && epx.f(this.allFolderUnmutedCount, accountChannelsCounterDto.allFolderUnmutedCount);
    }

    public final int hashCode() {
        int a2 = shy.a(this.archivedCount, shy.a(this.unmutedCount, Integer.hashCode(this.totalCount) * 31, 31), 31);
        Integer num = this.allFolderCount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.allFolderUnmutedCount;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountChannelsCounterDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", unmutedCount=");
        sb.append(this.unmutedCount);
        sb.append(", archivedCount=");
        sb.append(this.archivedCount);
        sb.append(", allFolderCount=");
        sb.append(this.allFolderCount);
        sb.append(", allFolderUnmutedCount=");
        return uqi.b(sb, this.allFolderUnmutedCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.unmutedCount);
        parcel.writeInt(this.archivedCount);
        Integer num = this.allFolderCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.allFolderUnmutedCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ AccountChannelsCounterDto(int i, int i2, int i3, Integer num, Integer num2, int i4, zcl zclVar) {
        this(i, i2, i3, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? null : num2);
    }
}
