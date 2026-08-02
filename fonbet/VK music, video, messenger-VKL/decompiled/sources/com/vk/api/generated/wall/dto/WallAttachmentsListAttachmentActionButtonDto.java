package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallAttachmentsListAttachmentActionButtonDto.kt */
/* loaded from: classes15.dex */
public final class WallAttachmentsListAttachmentActionButtonDto implements Parcelable {
    public static final Parcelable.Creator<WallAttachmentsListAttachmentActionButtonDto> CREATOR = new a();

    @pmi0("donut_goal")
    private final WallActionButtonGoalDto donutGoal;

    @pmi0("donut_level")
    private final WallActionButtonLevelDto donutLevel;

    @pmi0("type")
    private final WallActionButtonTypeDto type;

    @pmi0("vk_ticket")
    private final WallActionButtonVkTicketDto vkTicket;

    /* compiled from: WallAttachmentsListAttachmentActionButtonDto.kt */
    public static final class a implements Parcelable.Creator<WallAttachmentsListAttachmentActionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsListAttachmentActionButtonDto createFromParcel(Parcel parcel) {
            return new WallAttachmentsListAttachmentActionButtonDto((WallActionButtonTypeDto) parcel.readParcelable(WallAttachmentsListAttachmentActionButtonDto.class.getClassLoader()), (WallActionButtonGoalDto) parcel.readParcelable(WallAttachmentsListAttachmentActionButtonDto.class.getClassLoader()), (WallActionButtonLevelDto) parcel.readParcelable(WallAttachmentsListAttachmentActionButtonDto.class.getClassLoader()), (WallActionButtonVkTicketDto) parcel.readParcelable(WallAttachmentsListAttachmentActionButtonDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsListAttachmentActionButtonDto[] newArray(int i) {
            return new WallAttachmentsListAttachmentActionButtonDto[i];
        }
    }

    public WallAttachmentsListAttachmentActionButtonDto(WallActionButtonTypeDto wallActionButtonTypeDto, WallActionButtonGoalDto wallActionButtonGoalDto, WallActionButtonLevelDto wallActionButtonLevelDto, WallActionButtonVkTicketDto wallActionButtonVkTicketDto) {
        this.type = wallActionButtonTypeDto;
        this.donutGoal = wallActionButtonGoalDto;
        this.donutLevel = wallActionButtonLevelDto;
        this.vkTicket = wallActionButtonVkTicketDto;
    }

    public final WallActionButtonGoalDto d() {
        return this.donutGoal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final WallActionButtonLevelDto e() {
        return this.donutLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallAttachmentsListAttachmentActionButtonDto)) {
            return false;
        }
        WallAttachmentsListAttachmentActionButtonDto wallAttachmentsListAttachmentActionButtonDto = (WallAttachmentsListAttachmentActionButtonDto) obj;
        return this.type == wallAttachmentsListAttachmentActionButtonDto.type && epx.f(this.donutGoal, wallAttachmentsListAttachmentActionButtonDto.donutGoal) && epx.f(this.donutLevel, wallAttachmentsListAttachmentActionButtonDto.donutLevel) && epx.f(this.vkTicket, wallAttachmentsListAttachmentActionButtonDto.vkTicket);
    }

    public final WallActionButtonTypeDto f() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        WallActionButtonGoalDto wallActionButtonGoalDto = this.donutGoal;
        int hashCode2 = (hashCode + (wallActionButtonGoalDto == null ? 0 : wallActionButtonGoalDto.hashCode())) * 31;
        WallActionButtonLevelDto wallActionButtonLevelDto = this.donutLevel;
        int hashCode3 = (hashCode2 + (wallActionButtonLevelDto == null ? 0 : wallActionButtonLevelDto.hashCode())) * 31;
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto = this.vkTicket;
        return hashCode3 + (wallActionButtonVkTicketDto != null ? wallActionButtonVkTicketDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallAttachmentsListAttachmentActionButtonDto(type=" + this.type + ", donutGoal=" + this.donutGoal + ", donutLevel=" + this.donutLevel + ", vkTicket=" + this.vkTicket + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.type, i);
        parcel.writeParcelable(this.donutGoal, i);
        parcel.writeParcelable(this.donutLevel, i);
        parcel.writeParcelable(this.vkTicket, i);
    }

    public /* synthetic */ WallAttachmentsListAttachmentActionButtonDto(WallActionButtonTypeDto wallActionButtonTypeDto, WallActionButtonGoalDto wallActionButtonGoalDto, WallActionButtonLevelDto wallActionButtonLevelDto, WallActionButtonVkTicketDto wallActionButtonVkTicketDto, int i, zcl zclVar) {
        this(wallActionButtonTypeDto, (i & 2) != 0 ? null : wallActionButtonGoalDto, (i & 4) != 0 ? null : wallActionButtonLevelDto, (i & 8) != 0 ? null : wallActionButtonVkTicketDto);
    }
}
