package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.pmi0;
import xsna.shy;
import xsna.wp;
import xsna.zcl;

/* compiled from: AccountPushConversationsItemDto.kt */
/* loaded from: classes14.dex */
public final class AccountPushConversationsItemDto implements Parcelable {
    public static final Parcelable.Creator<AccountPushConversationsItemDto> CREATOR = new a();

    @pmi0("disabled_mass_mentions")
    private final BaseBoolIntDto disabledMassMentions;

    @pmi0("disabled_mentions")
    private final BaseBoolIntDto disabledMentions;

    @pmi0("disabled_until")
    private final int disabledUntil;

    @pmi0("peer_id")
    private final int peerId;

    @pmi0("sound")
    private final BaseBoolIntDto sound;

    /* compiled from: AccountPushConversationsItemDto.kt */
    public static final class a implements Parcelable.Creator<AccountPushConversationsItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPushConversationsItemDto createFromParcel(Parcel parcel) {
            return new AccountPushConversationsItemDto(parcel.readInt(), parcel.readInt(), (BaseBoolIntDto) parcel.readParcelable(AccountPushConversationsItemDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(AccountPushConversationsItemDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(AccountPushConversationsItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPushConversationsItemDto[] newArray(int i) {
            return new AccountPushConversationsItemDto[i];
        }
    }

    public AccountPushConversationsItemDto(int i, int i2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3) {
        this.disabledUntil = i;
        this.peerId = i2;
        this.sound = baseBoolIntDto;
        this.disabledMentions = baseBoolIntDto2;
        this.disabledMassMentions = baseBoolIntDto3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPushConversationsItemDto)) {
            return false;
        }
        AccountPushConversationsItemDto accountPushConversationsItemDto = (AccountPushConversationsItemDto) obj;
        return this.disabledUntil == accountPushConversationsItemDto.disabledUntil && this.peerId == accountPushConversationsItemDto.peerId && this.sound == accountPushConversationsItemDto.sound && this.disabledMentions == accountPushConversationsItemDto.disabledMentions && this.disabledMassMentions == accountPushConversationsItemDto.disabledMassMentions;
    }

    public final int hashCode() {
        int b = wp.b(this.sound, shy.a(this.peerId, Integer.hashCode(this.disabledUntil) * 31, 31), 31);
        BaseBoolIntDto baseBoolIntDto = this.disabledMentions;
        int hashCode = (b + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.disabledMassMentions;
        return hashCode + (baseBoolIntDto2 != null ? baseBoolIntDto2.hashCode() : 0);
    }

    public final String toString() {
        return "AccountPushConversationsItemDto(disabledUntil=" + this.disabledUntil + ", peerId=" + this.peerId + ", sound=" + this.sound + ", disabledMentions=" + this.disabledMentions + ", disabledMassMentions=" + this.disabledMassMentions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.disabledUntil);
        parcel.writeInt(this.peerId);
        parcel.writeParcelable(this.sound, i);
        parcel.writeParcelable(this.disabledMentions, i);
        parcel.writeParcelable(this.disabledMassMentions, i);
    }

    public /* synthetic */ AccountPushConversationsItemDto(int i, int i2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, int i3, zcl zclVar) {
        this(i, i2, baseBoolIntDto, (i3 & 8) != 0 ? null : baseBoolIntDto2, (i3 & 16) != 0 ? null : baseBoolIntDto3);
    }
}
