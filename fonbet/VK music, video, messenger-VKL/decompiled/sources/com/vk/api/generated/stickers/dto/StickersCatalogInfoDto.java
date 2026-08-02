package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: StickersCatalogInfoDto.kt */
/* loaded from: classes15.dex */
public final class StickersCatalogInfoDto implements Parcelable {
    public static final Parcelable.Creator<StickersCatalogInfoDto> CREATOR = new a();

    @pmi0("bonus_balance")
    private final StickersBonusBalanceDto bonusBalance;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_bonus_enabled")
    private final Boolean isBonusEnabled;

    /* compiled from: StickersCatalogInfoDto.kt */
    public static final class a implements Parcelable.Creator<StickersCatalogInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersCatalogInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StickersCatalogInfoDto(valueOf2, valueOf, parcel.readInt() != 0 ? StickersBonusBalanceDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersCatalogInfoDto[] newArray(int i) {
            return new StickersCatalogInfoDto[i];
        }
    }

    public StickersCatalogInfoDto() {
        this(null, null, null, 7, null);
    }

    public final StickersBonusBalanceDto d() {
        return this.bonusBalance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersCatalogInfoDto)) {
            return false;
        }
        StickersCatalogInfoDto stickersCatalogInfoDto = (StickersCatalogInfoDto) obj;
        return epx.f(this.id, stickersCatalogInfoDto.id) && epx.f(this.isBonusEnabled, stickersCatalogInfoDto.isBonusEnabled) && epx.f(this.bonusBalance, stickersCatalogInfoDto.bonusBalance);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.isBonusEnabled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        StickersBonusBalanceDto stickersBonusBalanceDto = this.bonusBalance;
        return hashCode2 + (stickersBonusBalanceDto != null ? stickersBonusBalanceDto.hashCode() : 0);
    }

    public final String toString() {
        return "StickersCatalogInfoDto(id=" + this.id + ", isBonusEnabled=" + this.isBonusEnabled + ", bonusBalance=" + this.bonusBalance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isBonusEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        StickersBonusBalanceDto stickersBonusBalanceDto = this.bonusBalance;
        if (stickersBonusBalanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersBonusBalanceDto.writeToParcel(parcel, i);
        }
    }

    public StickersCatalogInfoDto(Integer num, Boolean bool, StickersBonusBalanceDto stickersBonusBalanceDto) {
        this.id = num;
        this.isBonusEnabled = bool;
        this.bonusBalance = stickersBonusBalanceDto;
    }

    public /* synthetic */ StickersCatalogInfoDto(Integer num, Boolean bool, StickersBonusBalanceDto stickersBonusBalanceDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : stickersBonusBalanceDto);
    }
}
