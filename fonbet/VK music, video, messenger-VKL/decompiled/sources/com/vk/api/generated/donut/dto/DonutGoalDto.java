package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DonutGoalDto.kt */
/* loaded from: classes14.dex */
public final class DonutGoalDto implements Parcelable {
    public static final Parcelable.Creator<DonutGoalDto> CREATOR = new a();

    @pmi0("action_button")
    private final BaseLinkButtonDto actionButton;

    @pmi0("completed_at")
    private final int completedAt;

    @pmi0("created_at")
    private final int createdAt;

    @pmi0("deleted_at")
    private final int deletedAt;

    @pmi0("description")
    private final String description;

    @pmi0("don_info")
    private final DonutGoalDonInfoDto donInfo;

    @pmi0("id")
    private final int id;

    @pmi0("is_don_description")
    private final String isDonDescription;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("progress_description")
    private final String progressDescription;

    @pmi0("progress_percentage")
    private final int progressPercentage;

    @pmi0("progress_value")
    private final int progressValue;

    @pmi0("status")
    private final DonutGoalStatusDto status;

    @pmi0("target_value")
    private final int targetValue;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final DonutGoalTypeDto type;

    @pmi0("updated_at")
    private final int updatedAt;

    /* compiled from: DonutGoalDto.kt */
    public static final class a implements Parcelable.Creator<DonutGoalDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGoalDto createFromParcel(Parcel parcel) {
            int i;
            DonutGoalDonInfoDto createFromParcel;
            DonutGoalDonInfoDto donutGoalDonInfoDto;
            BaseLinkButtonDto createFromParcel2;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(DonutGoalDto.class.getClassLoader());
            DonutGoalTypeDto createFromParcel3 = DonutGoalTypeDto.CREATOR.createFromParcel(parcel);
            DonutGoalStatusDto createFromParcel4 = DonutGoalStatusDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            String readString3 = parcel.readString();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            int readInt8 = parcel.readInt();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                i = readInt;
                createFromParcel = null;
            } else {
                i = readInt;
                createFromParcel = DonutGoalDonInfoDto.CREATOR.createFromParcel(parcel);
            }
            DonutGoalDonInfoDto donutGoalDonInfoDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
                donutGoalDonInfoDto = donutGoalDonInfoDto2;
            } else {
                donutGoalDonInfoDto = donutGoalDonInfoDto2;
                createFromParcel2 = BaseLinkButtonDto.CREATOR.createFromParcel(parcel);
            }
            return new DonutGoalDto(i, userId, createFromParcel3, createFromParcel4, readString, readString2, readInt2, readInt3, readInt4, readString3, readInt5, readInt6, readInt7, readInt8, readString4, donutGoalDonInfoDto, createFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGoalDto[] newArray(int i) {
            return new DonutGoalDto[i];
        }
    }

    public DonutGoalDto(int i, UserId userId, DonutGoalTypeDto donutGoalTypeDto, DonutGoalStatusDto donutGoalStatusDto, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, int i7, int i8, String str4, DonutGoalDonInfoDto donutGoalDonInfoDto, BaseLinkButtonDto baseLinkButtonDto) {
        this.id = i;
        this.ownerId = userId;
        this.type = donutGoalTypeDto;
        this.status = donutGoalStatusDto;
        this.title = str;
        this.description = str2;
        this.targetValue = i2;
        this.progressValue = i3;
        this.progressPercentage = i4;
        this.progressDescription = str3;
        this.completedAt = i5;
        this.createdAt = i6;
        this.deletedAt = i7;
        this.updatedAt = i8;
        this.isDonDescription = str4;
        this.donInfo = donutGoalDonInfoDto;
        this.actionButton = baseLinkButtonDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGoalDto)) {
            return false;
        }
        DonutGoalDto donutGoalDto = (DonutGoalDto) obj;
        return this.id == donutGoalDto.id && epx.f(this.ownerId, donutGoalDto.ownerId) && this.type == donutGoalDto.type && this.status == donutGoalDto.status && epx.f(this.title, donutGoalDto.title) && epx.f(this.description, donutGoalDto.description) && this.targetValue == donutGoalDto.targetValue && this.progressValue == donutGoalDto.progressValue && this.progressPercentage == donutGoalDto.progressPercentage && epx.f(this.progressDescription, donutGoalDto.progressDescription) && this.completedAt == donutGoalDto.completedAt && this.createdAt == donutGoalDto.createdAt && this.deletedAt == donutGoalDto.deletedAt && this.updatedAt == donutGoalDto.updatedAt && epx.f(this.isDonDescription, donutGoalDto.isDonDescription) && epx.f(this.donInfo, donutGoalDto.donInfo) && epx.f(this.actionButton, donutGoalDto.actionButton);
    }

    public final int hashCode() {
        int a2 = shy.a(this.updatedAt, shy.a(this.deletedAt, shy.a(this.createdAt, shy.a(this.completedAt, urd0.a(shy.a(this.progressPercentage, shy.a(this.progressValue, shy.a(this.targetValue, urd0.a(urd0.a((this.status.hashCode() + ((this.type.hashCode() + bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b)) * 31)) * 31, 31, this.title), 31, this.description), 31), 31), 31), 31, this.progressDescription), 31), 31), 31), 31);
        String str = this.isDonDescription;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        DonutGoalDonInfoDto donutGoalDonInfoDto = this.donInfo;
        int hashCode2 = (hashCode + (donutGoalDonInfoDto == null ? 0 : donutGoalDonInfoDto.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.actionButton;
        return hashCode2 + (baseLinkButtonDto != null ? baseLinkButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "DonutGoalDto(id=" + this.id + ", ownerId=" + this.ownerId + ", type=" + this.type + ", status=" + this.status + ", title=" + this.title + ", description=" + this.description + ", targetValue=" + this.targetValue + ", progressValue=" + this.progressValue + ", progressPercentage=" + this.progressPercentage + ", progressDescription=" + this.progressDescription + ", completedAt=" + this.completedAt + ", createdAt=" + this.createdAt + ", deletedAt=" + this.deletedAt + ", updatedAt=" + this.updatedAt + ", isDonDescription=" + this.isDonDescription + ", donInfo=" + this.donInfo + ", actionButton=" + this.actionButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        this.type.writeToParcel(parcel, i);
        this.status.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.targetValue);
        parcel.writeInt(this.progressValue);
        parcel.writeInt(this.progressPercentage);
        parcel.writeString(this.progressDescription);
        parcel.writeInt(this.completedAt);
        parcel.writeInt(this.createdAt);
        parcel.writeInt(this.deletedAt);
        parcel.writeInt(this.updatedAt);
        parcel.writeString(this.isDonDescription);
        DonutGoalDonInfoDto donutGoalDonInfoDto = this.donInfo;
        if (donutGoalDonInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutGoalDonInfoDto.writeToParcel(parcel, i);
        }
        BaseLinkButtonDto baseLinkButtonDto = this.actionButton;
        if (baseLinkButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DonutGoalDto(int i, UserId userId, DonutGoalTypeDto donutGoalTypeDto, DonutGoalStatusDto donutGoalStatusDto, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, int i7, int i8, String str4, DonutGoalDonInfoDto donutGoalDonInfoDto, BaseLinkButtonDto baseLinkButtonDto, int i9, zcl zclVar) {
        this(i, userId, donutGoalTypeDto, donutGoalStatusDto, str, str2, i2, i3, i4, str3, i5, i6, i7, i8, (i9 & 16384) != 0 ? null : str4, (32768 & i9) != 0 ? null : donutGoalDonInfoDto, (i9 & 65536) != 0 ? null : baseLinkButtonDto);
    }
}
