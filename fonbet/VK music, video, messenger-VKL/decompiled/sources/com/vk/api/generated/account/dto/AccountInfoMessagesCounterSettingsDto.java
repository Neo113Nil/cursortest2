package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;
import xsna.qoy;

/* compiled from: AccountInfoMessagesCounterSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoMessagesCounterSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoMessagesCounterSettingsDto> CREATOR = new a();

    @pmi0("include_channels")
    private final boolean includeChannels;

    @pmi0("include_group_dialogs")
    private final boolean includeGroupDialogs;

    @pmi0("include_muted")
    private final boolean includeMuted;

    /* compiled from: AccountInfoMessagesCounterSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoMessagesCounterSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoMessagesCounterSettingsDto createFromParcel(Parcel parcel) {
            return new AccountInfoMessagesCounterSettingsDto(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoMessagesCounterSettingsDto[] newArray(int i) {
            return new AccountInfoMessagesCounterSettingsDto[i];
        }
    }

    public AccountInfoMessagesCounterSettingsDto(boolean z, boolean z2, boolean z3) {
        this.includeMuted = z;
        this.includeGroupDialogs = z2;
        this.includeChannels = z3;
    }

    public final boolean d() {
        return this.includeChannels;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.includeGroupDialogs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoMessagesCounterSettingsDto)) {
            return false;
        }
        AccountInfoMessagesCounterSettingsDto accountInfoMessagesCounterSettingsDto = (AccountInfoMessagesCounterSettingsDto) obj;
        return this.includeMuted == accountInfoMessagesCounterSettingsDto.includeMuted && this.includeGroupDialogs == accountInfoMessagesCounterSettingsDto.includeGroupDialogs && this.includeChannels == accountInfoMessagesCounterSettingsDto.includeChannels;
    }

    public final boolean f() {
        return this.includeMuted;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.includeChannels) + qoy.b(Boolean.hashCode(this.includeMuted) * 31, 31, this.includeGroupDialogs);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoMessagesCounterSettingsDto(includeMuted=");
        sb.append(this.includeMuted);
        sb.append(", includeGroupDialogs=");
        sb.append(this.includeGroupDialogs);
        sb.append(", includeChannels=");
        return q0.a(sb, this.includeChannels, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.includeMuted ? 1 : 0);
        parcel.writeInt(this.includeGroupDialogs ? 1 : 0);
        parcel.writeInt(this.includeChannels ? 1 : 0);
    }
}
