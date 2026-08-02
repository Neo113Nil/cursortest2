package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsGetGroupHistoryFilterDto.kt */
/* loaded from: classes14.dex */
public final class CallsGetGroupHistoryFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallsGetGroupHistoryFilterDto[] $VALUES;

    @pmi0("all")
    public static final CallsGetGroupHistoryFilterDto ALL;
    public static final Parcelable.Creator<CallsGetGroupHistoryFilterDto> CREATOR;

    @pmi0("only_missed")
    public static final CallsGetGroupHistoryFilterDto ONLY_MISSED;
    private final String value;

    /* compiled from: CallsGetGroupHistoryFilterDto.kt */
    public static final class a implements Parcelable.Creator<CallsGetGroupHistoryFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsGetGroupHistoryFilterDto createFromParcel(Parcel parcel) {
            return CallsGetGroupHistoryFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsGetGroupHistoryFilterDto[] newArray(int i) {
            return new CallsGetGroupHistoryFilterDto[i];
        }
    }

    static {
        CallsGetGroupHistoryFilterDto callsGetGroupHistoryFilterDto = new CallsGetGroupHistoryFilterDto("ALL", 0, "all");
        ALL = callsGetGroupHistoryFilterDto;
        CallsGetGroupHistoryFilterDto callsGetGroupHistoryFilterDto2 = new CallsGetGroupHistoryFilterDto("ONLY_MISSED", 1, "only_missed");
        ONLY_MISSED = callsGetGroupHistoryFilterDto2;
        CallsGetGroupHistoryFilterDto[] callsGetGroupHistoryFilterDtoArr = {callsGetGroupHistoryFilterDto, callsGetGroupHistoryFilterDto2};
        $VALUES = callsGetGroupHistoryFilterDtoArr;
        $ENTRIES = new asp(callsGetGroupHistoryFilterDtoArr);
        CREATOR = new a();
    }

    private CallsGetGroupHistoryFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CallsGetGroupHistoryFilterDto valueOf(String str) {
        return (CallsGetGroupHistoryFilterDto) Enum.valueOf(CallsGetGroupHistoryFilterDto.class, str);
    }

    public static CallsGetGroupHistoryFilterDto[] values() {
        return (CallsGetGroupHistoryFilterDto[]) $VALUES.clone();
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
