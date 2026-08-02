package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutGoalStatusDto.kt */
/* loaded from: classes14.dex */
public final class DonutGoalStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutGoalStatusDto[] $VALUES;

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    public static final DonutGoalStatusDto ACTIVE;

    @pmi0("completed")
    public static final DonutGoalStatusDto COMPLETED;
    public static final Parcelable.Creator<DonutGoalStatusDto> CREATOR;

    @pmi0("deleted")
    public static final DonutGoalStatusDto DELETED;

    @pmi0("inactive")
    public static final DonutGoalStatusDto INACTIVE;
    private final String value;

    /* compiled from: DonutGoalStatusDto.kt */
    public static final class a implements Parcelable.Creator<DonutGoalStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGoalStatusDto createFromParcel(Parcel parcel) {
            return DonutGoalStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGoalStatusDto[] newArray(int i) {
            return new DonutGoalStatusDto[i];
        }
    }

    static {
        DonutGoalStatusDto donutGoalStatusDto = new DonutGoalStatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
        ACTIVE = donutGoalStatusDto;
        DonutGoalStatusDto donutGoalStatusDto2 = new DonutGoalStatusDto("INACTIVE", 1, "inactive");
        INACTIVE = donutGoalStatusDto2;
        DonutGoalStatusDto donutGoalStatusDto3 = new DonutGoalStatusDto("COMPLETED", 2, "completed");
        COMPLETED = donutGoalStatusDto3;
        DonutGoalStatusDto donutGoalStatusDto4 = new DonutGoalStatusDto("DELETED", 3, "deleted");
        DELETED = donutGoalStatusDto4;
        DonutGoalStatusDto[] donutGoalStatusDtoArr = {donutGoalStatusDto, donutGoalStatusDto2, donutGoalStatusDto3, donutGoalStatusDto4};
        $VALUES = donutGoalStatusDtoArr;
        $ENTRIES = new asp(donutGoalStatusDtoArr);
        CREATOR = new a();
    }

    private DonutGoalStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutGoalStatusDto valueOf(String str) {
        return (DonutGoalStatusDto) Enum.valueOf(DonutGoalStatusDto.class, str);
    }

    public static DonutGoalStatusDto[] values() {
        return (DonutGoalStatusDto[]) $VALUES.clone();
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
