package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallEditPrimaryAttachmentsModeDto.kt */
/* loaded from: classes15.dex */
public final class WallEditPrimaryAttachmentsModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallEditPrimaryAttachmentsModeDto[] $VALUES;

    @pmi0("carousel")
    public static final WallEditPrimaryAttachmentsModeDto CAROUSEL;
    public static final Parcelable.Creator<WallEditPrimaryAttachmentsModeDto> CREATOR;

    @pmi0("grid")
    public static final WallEditPrimaryAttachmentsModeDto GRID;
    private final String value;

    /* compiled from: WallEditPrimaryAttachmentsModeDto.kt */
    public static final class a implements Parcelable.Creator<WallEditPrimaryAttachmentsModeDto> {
        @Override // android.os.Parcelable.Creator
        public final WallEditPrimaryAttachmentsModeDto createFromParcel(Parcel parcel) {
            return WallEditPrimaryAttachmentsModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallEditPrimaryAttachmentsModeDto[] newArray(int i) {
            return new WallEditPrimaryAttachmentsModeDto[i];
        }
    }

    static {
        WallEditPrimaryAttachmentsModeDto wallEditPrimaryAttachmentsModeDto = new WallEditPrimaryAttachmentsModeDto("CAROUSEL", 0, "carousel");
        CAROUSEL = wallEditPrimaryAttachmentsModeDto;
        WallEditPrimaryAttachmentsModeDto wallEditPrimaryAttachmentsModeDto2 = new WallEditPrimaryAttachmentsModeDto(SignalingProtocol.KEY_GRID, 1, "grid");
        GRID = wallEditPrimaryAttachmentsModeDto2;
        WallEditPrimaryAttachmentsModeDto[] wallEditPrimaryAttachmentsModeDtoArr = {wallEditPrimaryAttachmentsModeDto, wallEditPrimaryAttachmentsModeDto2};
        $VALUES = wallEditPrimaryAttachmentsModeDtoArr;
        $ENTRIES = new asp(wallEditPrimaryAttachmentsModeDtoArr);
        CREATOR = new a();
    }

    private WallEditPrimaryAttachmentsModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallEditPrimaryAttachmentsModeDto valueOf(String str) {
        return (WallEditPrimaryAttachmentsModeDto) Enum.valueOf(WallEditPrimaryAttachmentsModeDto.class, str);
    }

    public static WallEditPrimaryAttachmentsModeDto[] values() {
        return (WallEditPrimaryAttachmentsModeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
