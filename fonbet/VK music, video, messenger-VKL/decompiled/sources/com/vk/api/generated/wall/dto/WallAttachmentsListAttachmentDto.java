package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallAttachmentsListAttachmentDto.kt */
/* loaded from: classes15.dex */
public final class WallAttachmentsListAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<WallAttachmentsListAttachmentDto> CREATOR = new a();

    @pmi0("action_button")
    private final WallAttachmentsListAttachmentActionButtonDto actionButton;

    @pmi0("type")
    private final WallWallpostAttachmentTypeDto type;

    /* compiled from: WallAttachmentsListAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<WallAttachmentsListAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsListAttachmentDto createFromParcel(Parcel parcel) {
            return new WallAttachmentsListAttachmentDto((WallWallpostAttachmentTypeDto) parcel.readParcelable(WallAttachmentsListAttachmentDto.class.getClassLoader()), parcel.readInt() == 0 ? null : WallAttachmentsListAttachmentActionButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsListAttachmentDto[] newArray(int i) {
            return new WallAttachmentsListAttachmentDto[i];
        }
    }

    public WallAttachmentsListAttachmentDto(WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto, WallAttachmentsListAttachmentActionButtonDto wallAttachmentsListAttachmentActionButtonDto) {
        this.type = wallWallpostAttachmentTypeDto;
        this.actionButton = wallAttachmentsListAttachmentActionButtonDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallAttachmentsListAttachmentDto)) {
            return false;
        }
        WallAttachmentsListAttachmentDto wallAttachmentsListAttachmentDto = (WallAttachmentsListAttachmentDto) obj;
        return this.type == wallAttachmentsListAttachmentDto.type && epx.f(this.actionButton, wallAttachmentsListAttachmentDto.actionButton);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        WallAttachmentsListAttachmentActionButtonDto wallAttachmentsListAttachmentActionButtonDto = this.actionButton;
        return hashCode + (wallAttachmentsListAttachmentActionButtonDto == null ? 0 : wallAttachmentsListAttachmentActionButtonDto.hashCode());
    }

    public final String toString() {
        return "WallAttachmentsListAttachmentDto(type=" + this.type + ", actionButton=" + this.actionButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.type, i);
        WallAttachmentsListAttachmentActionButtonDto wallAttachmentsListAttachmentActionButtonDto = this.actionButton;
        if (wallAttachmentsListAttachmentActionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallAttachmentsListAttachmentActionButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ WallAttachmentsListAttachmentDto(WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto, WallAttachmentsListAttachmentActionButtonDto wallAttachmentsListAttachmentActionButtonDto, int i, zcl zclVar) {
        this(wallWallpostAttachmentTypeDto, (i & 2) != 0 ? null : wallAttachmentsListAttachmentActionButtonDto);
    }
}
