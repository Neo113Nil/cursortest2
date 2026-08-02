package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: DonutLevelTrialDto.kt */
/* loaded from: classes14.dex */
public final class DonutLevelTrialDto implements Parcelable {
    public static final Parcelable.Creator<DonutLevelTrialDto> CREATOR = new a();

    @pmi0("ends_at")
    private final Integer endsAt;

    @pmi0("id")
    private final int id;

    @pmi0("level_id")
    private final int levelId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("promo_limit")
    private final Integer promoLimit;

    @pmi0("promo_percent")
    private final Long promoPercent;

    @pmi0("promo_price")
    private final Long promoPrice;

    @pmi0("status")
    private final DonutLevelTrialStatusEnumDto status;

    @pmi0("subscription_duration")
    private final int subscriptionDuration;

    @pmi0("subscriptions_count")
    private final int subscriptionsCount;

    @pmi0("subscriptions_limit")
    private final Integer subscriptionsLimit;

    @pmi0("type")
    private final DonutLevelTrialPromoTypeEnumDto type;

    /* compiled from: DonutLevelTrialDto.kt */
    public static final class a implements Parcelable.Creator<DonutLevelTrialDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutLevelTrialDto createFromParcel(Parcel parcel) {
            return new DonutLevelTrialDto(parcel.readInt(), (UserId) parcel.readParcelable(DonutLevelTrialDto.class.getClassLoader()), parcel.readInt(), parcel.readInt(), DonutLevelTrialStatusEnumDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? DonutLevelTrialPromoTypeEnumDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutLevelTrialDto[] newArray(int i) {
            return new DonutLevelTrialDto[i];
        }
    }

    public DonutLevelTrialDto(int i, UserId userId, int i2, int i3, DonutLevelTrialStatusEnumDto donutLevelTrialStatusEnumDto, int i4, Integer num, Integer num2, Long l, Long l2, Integer num3, DonutLevelTrialPromoTypeEnumDto donutLevelTrialPromoTypeEnumDto) {
        this.id = i;
        this.ownerId = userId;
        this.levelId = i2;
        this.subscriptionDuration = i3;
        this.status = donutLevelTrialStatusEnumDto;
        this.subscriptionsCount = i4;
        this.subscriptionsLimit = num;
        this.endsAt = num2;
        this.promoPrice = l;
        this.promoPercent = l2;
        this.promoLimit = num3;
        this.type = donutLevelTrialPromoTypeEnumDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutLevelTrialDto)) {
            return false;
        }
        DonutLevelTrialDto donutLevelTrialDto = (DonutLevelTrialDto) obj;
        return this.id == donutLevelTrialDto.id && epx.f(this.ownerId, donutLevelTrialDto.ownerId) && this.levelId == donutLevelTrialDto.levelId && this.subscriptionDuration == donutLevelTrialDto.subscriptionDuration && this.status == donutLevelTrialDto.status && this.subscriptionsCount == donutLevelTrialDto.subscriptionsCount && epx.f(this.subscriptionsLimit, donutLevelTrialDto.subscriptionsLimit) && epx.f(this.endsAt, donutLevelTrialDto.endsAt) && epx.f(this.promoPrice, donutLevelTrialDto.promoPrice) && epx.f(this.promoPercent, donutLevelTrialDto.promoPercent) && epx.f(this.promoLimit, donutLevelTrialDto.promoLimit) && this.type == donutLevelTrialDto.type;
    }

    public final int hashCode() {
        int a2 = shy.a(this.subscriptionsCount, (this.status.hashCode() + shy.a(this.subscriptionDuration, shy.a(this.levelId, bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31), 31)) * 31, 31);
        Integer num = this.subscriptionsLimit;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.endsAt;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.promoPrice;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.promoPercent;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.promoLimit;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        DonutLevelTrialPromoTypeEnumDto donutLevelTrialPromoTypeEnumDto = this.type;
        return hashCode5 + (donutLevelTrialPromoTypeEnumDto != null ? donutLevelTrialPromoTypeEnumDto.hashCode() : 0);
    }

    public final String toString() {
        return "DonutLevelTrialDto(id=" + this.id + ", ownerId=" + this.ownerId + ", levelId=" + this.levelId + ", subscriptionDuration=" + this.subscriptionDuration + ", status=" + this.status + ", subscriptionsCount=" + this.subscriptionsCount + ", subscriptionsLimit=" + this.subscriptionsLimit + ", endsAt=" + this.endsAt + ", promoPrice=" + this.promoPrice + ", promoPercent=" + this.promoPercent + ", promoLimit=" + this.promoLimit + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.levelId);
        parcel.writeInt(this.subscriptionDuration);
        this.status.writeToParcel(parcel, i);
        parcel.writeInt(this.subscriptionsCount);
        Integer num = this.subscriptionsLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.endsAt;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Long l = this.promoPrice;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Long l2 = this.promoPercent;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
        Integer num3 = this.promoLimit;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        DonutLevelTrialPromoTypeEnumDto donutLevelTrialPromoTypeEnumDto = this.type;
        if (donutLevelTrialPromoTypeEnumDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutLevelTrialPromoTypeEnumDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DonutLevelTrialDto(int i, UserId userId, int i2, int i3, DonutLevelTrialStatusEnumDto donutLevelTrialStatusEnumDto, int i4, Integer num, Integer num2, Long l, Long l2, Integer num3, DonutLevelTrialPromoTypeEnumDto donutLevelTrialPromoTypeEnumDto, int i5, zcl zclVar) {
        this(i, userId, i2, i3, donutLevelTrialStatusEnumDto, i4, (i5 & 64) != 0 ? null : num, (i5 & 128) != 0 ? null : num2, (i5 & 256) != 0 ? null : l, (i5 & 512) != 0 ? null : l2, (i5 & 1024) != 0 ? null : num3, (i5 & 2048) != 0 ? null : donutLevelTrialPromoTypeEnumDto);
    }
}
