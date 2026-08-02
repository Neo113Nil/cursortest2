package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallPostPrimaryAttachmentsModeDto.kt */
/* loaded from: classes15.dex */
public final class WallPostPrimaryAttachmentsModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallPostPrimaryAttachmentsModeDto[] $VALUES;

    @pmi0("carousel")
    public static final WallPostPrimaryAttachmentsModeDto CAROUSEL;
    public static final Parcelable.Creator<WallPostPrimaryAttachmentsModeDto> CREATOR;

    @pmi0("grid")
    public static final WallPostPrimaryAttachmentsModeDto GRID;
    private final String value;

    /* compiled from: WallPostPrimaryAttachmentsModeDto.kt */
    public static final class a implements Parcelable.Creator<WallPostPrimaryAttachmentsModeDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostPrimaryAttachmentsModeDto createFromParcel(Parcel parcel) {
            return WallPostPrimaryAttachmentsModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostPrimaryAttachmentsModeDto[] newArray(int i) {
            return new WallPostPrimaryAttachmentsModeDto[i];
        }
    }

    static {
        WallPostPrimaryAttachmentsModeDto wallPostPrimaryAttachmentsModeDto = new WallPostPrimaryAttachmentsModeDto("CAROUSEL", 0, "carousel");
        CAROUSEL = wallPostPrimaryAttachmentsModeDto;
        WallPostPrimaryAttachmentsModeDto wallPostPrimaryAttachmentsModeDto2 = new WallPostPrimaryAttachmentsModeDto(SignalingProtocol.KEY_GRID, 1, "grid");
        GRID = wallPostPrimaryAttachmentsModeDto2;
        WallPostPrimaryAttachmentsModeDto[] wallPostPrimaryAttachmentsModeDtoArr = {wallPostPrimaryAttachmentsModeDto, wallPostPrimaryAttachmentsModeDto2};
        $VALUES = wallPostPrimaryAttachmentsModeDtoArr;
        $ENTRIES = new asp(wallPostPrimaryAttachmentsModeDtoArr);
        CREATOR = new a();
    }

    private WallPostPrimaryAttachmentsModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallPostPrimaryAttachmentsModeDto valueOf(String str) {
        return (WallPostPrimaryAttachmentsModeDto) Enum.valueOf(WallPostPrimaryAttachmentsModeDto.class, str);
    }

    public static WallPostPrimaryAttachmentsModeDto[] values() {
        return (WallPostPrimaryAttachmentsModeDto[]) $VALUES.clone();
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
