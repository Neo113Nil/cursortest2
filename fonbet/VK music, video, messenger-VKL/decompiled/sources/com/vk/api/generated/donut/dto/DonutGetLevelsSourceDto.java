package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutGetLevelsSourceDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetLevelsSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutGetLevelsSourceDto[] $VALUES;
    public static final Parcelable.Creator<DonutGetLevelsSourceDto> CREATOR;

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    public static final DonutGetLevelsSourceDto PERMISSIONS;
    private final String value;

    /* compiled from: DonutGetLevelsSourceDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetLevelsSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetLevelsSourceDto createFromParcel(Parcel parcel) {
            return DonutGetLevelsSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetLevelsSourceDto[] newArray(int i) {
            return new DonutGetLevelsSourceDto[i];
        }
    }

    static {
        DonutGetLevelsSourceDto donutGetLevelsSourceDto = new DonutGetLevelsSourceDto("PERMISSIONS", 0, SignalingProtocol.KEY_PERMISSIONS);
        PERMISSIONS = donutGetLevelsSourceDto;
        DonutGetLevelsSourceDto[] donutGetLevelsSourceDtoArr = {donutGetLevelsSourceDto};
        $VALUES = donutGetLevelsSourceDtoArr;
        $ENTRIES = new asp(donutGetLevelsSourceDtoArr);
        CREATOR = new a();
    }

    private DonutGetLevelsSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutGetLevelsSourceDto valueOf(String str) {
        return (DonutGetLevelsSourceDto) Enum.valueOf(DonutGetLevelsSourceDto.class, str);
    }

    public static DonutGetLevelsSourceDto[] values() {
        return (DonutGetLevelsSourceDto[]) $VALUES.clone();
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
