package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsGetHistoryFilterDto.kt */
/* loaded from: classes14.dex */
public final class CallsGetHistoryFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallsGetHistoryFilterDto[] $VALUES;

    @pmi0("all")
    public static final CallsGetHistoryFilterDto ALL;
    public static final Parcelable.Creator<CallsGetHistoryFilterDto> CREATOR;

    @pmi0("only_missed")
    public static final CallsGetHistoryFilterDto ONLY_MISSED;
    private final String value;

    /* compiled from: CallsGetHistoryFilterDto.kt */
    public static final class a implements Parcelable.Creator<CallsGetHistoryFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsGetHistoryFilterDto createFromParcel(Parcel parcel) {
            return CallsGetHistoryFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsGetHistoryFilterDto[] newArray(int i) {
            return new CallsGetHistoryFilterDto[i];
        }
    }

    static {
        CallsGetHistoryFilterDto callsGetHistoryFilterDto = new CallsGetHistoryFilterDto("ALL", 0, "all");
        ALL = callsGetHistoryFilterDto;
        CallsGetHistoryFilterDto callsGetHistoryFilterDto2 = new CallsGetHistoryFilterDto("ONLY_MISSED", 1, "only_missed");
        ONLY_MISSED = callsGetHistoryFilterDto2;
        CallsGetHistoryFilterDto[] callsGetHistoryFilterDtoArr = {callsGetHistoryFilterDto, callsGetHistoryFilterDto2};
        $VALUES = callsGetHistoryFilterDtoArr;
        $ENTRIES = new asp(callsGetHistoryFilterDtoArr);
        CREATOR = new a();
    }

    private CallsGetHistoryFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CallsGetHistoryFilterDto valueOf(String str) {
        return (CallsGetHistoryFilterDto) Enum.valueOf(CallsGetHistoryFilterDto.class, str);
    }

    public static CallsGetHistoryFilterDto[] values() {
        return (CallsGetHistoryFilterDto[]) $VALUES.clone();
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
