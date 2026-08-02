package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AccountMusicBackgroundDto.kt */
/* loaded from: classes14.dex */
public final class AccountMusicBackgroundDto implements Parcelable {
    public static final Parcelable.Creator<AccountMusicBackgroundDto> CREATOR = new a();

    @pmi0("audio_background_limit")
    private final Integer audioBackgroundLimit;

    @pmi0("show_subscription_window")
    private final Boolean showSubscriptionWindow;

    /* compiled from: AccountMusicBackgroundDto.kt */
    public static final class a implements Parcelable.Creator<AccountMusicBackgroundDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountMusicBackgroundDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountMusicBackgroundDto(valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountMusicBackgroundDto[] newArray(int i) {
            return new AccountMusicBackgroundDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountMusicBackgroundDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountMusicBackgroundDto)) {
            return false;
        }
        AccountMusicBackgroundDto accountMusicBackgroundDto = (AccountMusicBackgroundDto) obj;
        return epx.f(this.showSubscriptionWindow, accountMusicBackgroundDto.showSubscriptionWindow) && epx.f(this.audioBackgroundLimit, accountMusicBackgroundDto.audioBackgroundLimit);
    }

    public final int hashCode() {
        Boolean bool = this.showSubscriptionWindow;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.audioBackgroundLimit;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountMusicBackgroundDto(showSubscriptionWindow=");
        sb.append(this.showSubscriptionWindow);
        sb.append(", audioBackgroundLimit=");
        return uqi.b(sb, this.audioBackgroundLimit, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.showSubscriptionWindow;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.audioBackgroundLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public AccountMusicBackgroundDto(Boolean bool, Integer num) {
        this.showSubscriptionWindow = bool;
        this.audioBackgroundLimit = num;
    }

    public /* synthetic */ AccountMusicBackgroundDto(Boolean bool, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
    }
}
