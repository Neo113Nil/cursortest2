package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutLevelTrialStatusEnumDto.kt */
/* loaded from: classes14.dex */
public final class DonutLevelTrialStatusEnumDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutLevelTrialStatusEnumDto[] $VALUES;

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    public static final DonutLevelTrialStatusEnumDto ACTIVE;

    @pmi0("closed")
    public static final DonutLevelTrialStatusEnumDto CLOSED;
    public static final Parcelable.Creator<DonutLevelTrialStatusEnumDto> CREATOR;

    @pmi0("deleted")
    public static final DonutLevelTrialStatusEnumDto DELETED;

    @pmi0("ends")
    public static final DonutLevelTrialStatusEnumDto ENDS;
    private final String value;

    /* compiled from: DonutLevelTrialStatusEnumDto.kt */
    public static final class a implements Parcelable.Creator<DonutLevelTrialStatusEnumDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutLevelTrialStatusEnumDto createFromParcel(Parcel parcel) {
            return DonutLevelTrialStatusEnumDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutLevelTrialStatusEnumDto[] newArray(int i) {
            return new DonutLevelTrialStatusEnumDto[i];
        }
    }

    static {
        DonutLevelTrialStatusEnumDto donutLevelTrialStatusEnumDto = new DonutLevelTrialStatusEnumDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
        ACTIVE = donutLevelTrialStatusEnumDto;
        DonutLevelTrialStatusEnumDto donutLevelTrialStatusEnumDto2 = new DonutLevelTrialStatusEnumDto("ENDS", 1, "ends");
        ENDS = donutLevelTrialStatusEnumDto2;
        DonutLevelTrialStatusEnumDto donutLevelTrialStatusEnumDto3 = new DonutLevelTrialStatusEnumDto("CLOSED", 2, "closed");
        CLOSED = donutLevelTrialStatusEnumDto3;
        DonutLevelTrialStatusEnumDto donutLevelTrialStatusEnumDto4 = new DonutLevelTrialStatusEnumDto("DELETED", 3, "deleted");
        DELETED = donutLevelTrialStatusEnumDto4;
        DonutLevelTrialStatusEnumDto[] donutLevelTrialStatusEnumDtoArr = {donutLevelTrialStatusEnumDto, donutLevelTrialStatusEnumDto2, donutLevelTrialStatusEnumDto3, donutLevelTrialStatusEnumDto4};
        $VALUES = donutLevelTrialStatusEnumDtoArr;
        $ENTRIES = new asp(donutLevelTrialStatusEnumDtoArr);
        CREATOR = new a();
    }

    private DonutLevelTrialStatusEnumDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutLevelTrialStatusEnumDto valueOf(String str) {
        return (DonutLevelTrialStatusEnumDto) Enum.valueOf(DonutLevelTrialStatusEnumDto.class, str);
    }

    public static DonutLevelTrialStatusEnumDto[] values() {
        return (DonutLevelTrialStatusEnumDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
