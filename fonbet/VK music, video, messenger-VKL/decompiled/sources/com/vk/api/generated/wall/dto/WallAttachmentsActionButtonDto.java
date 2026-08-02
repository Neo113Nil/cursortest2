package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: WallAttachmentsActionButtonDto.kt */
/* loaded from: classes15.dex */
public final class WallAttachmentsActionButtonDto implements Parcelable {
    public static final Parcelable.Creator<WallAttachmentsActionButtonDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("donut_goal")
    private final WallActionButtonGoalDto donutGoal;

    @pmi0("donut_level")
    private final WallActionButtonLevelDto donutLevel;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final WallActionButtonTypeDto type;

    @pmi0("vk_ticket")
    private final WallPostingSettingsActionButtonVkTicketDto vkTicket;

    /* compiled from: WallAttachmentsActionButtonDto.kt */
    public static final class a implements Parcelable.Creator<WallAttachmentsActionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsActionButtonDto createFromParcel(Parcel parcel) {
            return new WallAttachmentsActionButtonDto((WallActionButtonTypeDto) parcel.readParcelable(WallAttachmentsActionButtonDto.class.getClassLoader()), parcel.readString(), parcel.readString(), (WallActionButtonGoalDto) parcel.readParcelable(WallAttachmentsActionButtonDto.class.getClassLoader()), (WallActionButtonLevelDto) parcel.readParcelable(WallAttachmentsActionButtonDto.class.getClassLoader()), parcel.readInt() == 0 ? null : WallPostingSettingsActionButtonVkTicketDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsActionButtonDto[] newArray(int i) {
            return new WallAttachmentsActionButtonDto[i];
        }
    }

    public WallAttachmentsActionButtonDto(WallActionButtonTypeDto wallActionButtonTypeDto, String str, String str2, WallActionButtonGoalDto wallActionButtonGoalDto, WallActionButtonLevelDto wallActionButtonLevelDto, WallPostingSettingsActionButtonVkTicketDto wallPostingSettingsActionButtonVkTicketDto) {
        this.type = wallActionButtonTypeDto;
        this.title = str;
        this.description = str2;
        this.donutGoal = wallActionButtonGoalDto;
        this.donutLevel = wallActionButtonLevelDto;
        this.vkTicket = wallPostingSettingsActionButtonVkTicketDto;
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
        if (!(obj instanceof WallAttachmentsActionButtonDto)) {
            return false;
        }
        WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto = (WallAttachmentsActionButtonDto) obj;
        return this.type == wallAttachmentsActionButtonDto.type && epx.f(this.title, wallAttachmentsActionButtonDto.title) && epx.f(this.description, wallAttachmentsActionButtonDto.description) && epx.f(this.donutGoal, wallAttachmentsActionButtonDto.donutGoal) && epx.f(this.donutLevel, wallAttachmentsActionButtonDto.donutLevel) && epx.f(this.vkTicket, wallAttachmentsActionButtonDto.vkTicket);
    }

    public final WallActionButtonTypeDto f() {
        return this.type;
    }

    public final WallPostingSettingsActionButtonVkTicketDto g() {
        return this.vkTicket;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.description);
        WallActionButtonGoalDto wallActionButtonGoalDto = this.donutGoal;
        int hashCode = (a2 + (wallActionButtonGoalDto == null ? 0 : wallActionButtonGoalDto.hashCode())) * 31;
        WallActionButtonLevelDto wallActionButtonLevelDto = this.donutLevel;
        int hashCode2 = (hashCode + (wallActionButtonLevelDto == null ? 0 : wallActionButtonLevelDto.hashCode())) * 31;
        WallPostingSettingsActionButtonVkTicketDto wallPostingSettingsActionButtonVkTicketDto = this.vkTicket;
        return hashCode2 + (wallPostingSettingsActionButtonVkTicketDto != null ? wallPostingSettingsActionButtonVkTicketDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallAttachmentsActionButtonDto(type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", donutGoal=" + this.donutGoal + ", donutLevel=" + this.donutLevel + ", vkTicket=" + this.vkTicket + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.type, i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.donutGoal, i);
        parcel.writeParcelable(this.donutLevel, i);
        WallPostingSettingsActionButtonVkTicketDto wallPostingSettingsActionButtonVkTicketDto = this.vkTicket;
        if (wallPostingSettingsActionButtonVkTicketDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingSettingsActionButtonVkTicketDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ WallAttachmentsActionButtonDto(WallActionButtonTypeDto wallActionButtonTypeDto, String str, String str2, WallActionButtonGoalDto wallActionButtonGoalDto, WallActionButtonLevelDto wallActionButtonLevelDto, WallPostingSettingsActionButtonVkTicketDto wallPostingSettingsActionButtonVkTicketDto, int i, zcl zclVar) {
        this(wallActionButtonTypeDto, str, str2, (i & 8) != 0 ? null : wallActionButtonGoalDto, (i & 16) != 0 ? null : wallActionButtonLevelDto, (i & 32) != 0 ? null : wallPostingSettingsActionButtonVkTicketDto);
    }
}
