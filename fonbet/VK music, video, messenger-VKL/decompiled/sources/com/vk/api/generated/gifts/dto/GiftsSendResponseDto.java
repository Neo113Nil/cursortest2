package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.stickers.dto.StickersBonusResultDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GiftsSendResponseDto.kt */
/* loaded from: classes14.dex */
public final class GiftsSendResponseDto implements Parcelable {
    public static final Parcelable.Creator<GiftsSendResponseDto> CREATOR = new a();

    @pmi0("confirmation")
    private final GiftsSendConfirmationDto confirmation;

    @pmi0("stickers_bonus")
    private final StickersBonusResultDto stickersBonus;

    @pmi0("success")
    private final BaseBoolIntDto success;

    @pmi0("user_ids")
    private final List<UserId> userIds;

    @pmi0("withdrawn_votes")
    private final Integer withdrawnVotes;

    /* compiled from: GiftsSendResponseDto.kt */
    public static final class a implements Parcelable.Creator<GiftsSendResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsSendResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            GiftsSendConfirmationDto createFromParcel = parcel.readInt() == 0 ? null : GiftsSendConfirmationDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(GiftsSendResponseDto.class.getClassLoader());
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(GiftsSendResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            return new GiftsSendResponseDto(createFromParcel, baseBoolIntDto, valueOf, arrayList, parcel.readInt() != 0 ? StickersBonusResultDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsSendResponseDto[] newArray(int i) {
            return new GiftsSendResponseDto[i];
        }
    }

    public GiftsSendResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsSendResponseDto)) {
            return false;
        }
        GiftsSendResponseDto giftsSendResponseDto = (GiftsSendResponseDto) obj;
        return epx.f(this.confirmation, giftsSendResponseDto.confirmation) && this.success == giftsSendResponseDto.success && epx.f(this.withdrawnVotes, giftsSendResponseDto.withdrawnVotes) && epx.f(this.userIds, giftsSendResponseDto.userIds) && epx.f(this.stickersBonus, giftsSendResponseDto.stickersBonus);
    }

    public final int hashCode() {
        GiftsSendConfirmationDto giftsSendConfirmationDto = this.confirmation;
        int hashCode = (giftsSendConfirmationDto == null ? 0 : giftsSendConfirmationDto.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto = this.success;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Integer num = this.withdrawnVotes;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<UserId> list = this.userIds;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        StickersBonusResultDto stickersBonusResultDto = this.stickersBonus;
        return hashCode4 + (stickersBonusResultDto != null ? stickersBonusResultDto.hashCode() : 0);
    }

    public final String toString() {
        return "GiftsSendResponseDto(confirmation=" + this.confirmation + ", success=" + this.success + ", withdrawnVotes=" + this.withdrawnVotes + ", userIds=" + this.userIds + ", stickersBonus=" + this.stickersBonus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GiftsSendConfirmationDto giftsSendConfirmationDto = this.confirmation;
        if (giftsSendConfirmationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsSendConfirmationDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.success, i);
        Integer num = this.withdrawnVotes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<UserId> list = this.userIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        StickersBonusResultDto stickersBonusResultDto = this.stickersBonus;
        if (stickersBonusResultDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersBonusResultDto.writeToParcel(parcel, i);
        }
    }

    public GiftsSendResponseDto(GiftsSendConfirmationDto giftsSendConfirmationDto, BaseBoolIntDto baseBoolIntDto, Integer num, List<UserId> list, StickersBonusResultDto stickersBonusResultDto) {
        this.confirmation = giftsSendConfirmationDto;
        this.success = baseBoolIntDto;
        this.withdrawnVotes = num;
        this.userIds = list;
        this.stickersBonus = stickersBonusResultDto;
    }

    public /* synthetic */ GiftsSendResponseDto(GiftsSendConfirmationDto giftsSendConfirmationDto, BaseBoolIntDto baseBoolIntDto, Integer num, List list, StickersBonusResultDto stickersBonusResultDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : giftsSendConfirmationDto, (i & 2) != 0 ? null : baseBoolIntDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : stickersBonusResultDto);
    }
}
