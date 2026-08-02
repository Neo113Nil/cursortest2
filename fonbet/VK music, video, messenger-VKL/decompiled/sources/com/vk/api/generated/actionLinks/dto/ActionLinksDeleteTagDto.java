package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionLinksDeleteTagDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksDeleteTagDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionLinksDeleteTagDto[] $VALUES;
    public static final Parcelable.Creator<ActionLinksDeleteTagDto> CREATOR;

    @pmi0("live")
    public static final ActionLinksDeleteTagDto LIVE;
    private final String value;

    /* compiled from: ActionLinksDeleteTagDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksDeleteTagDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksDeleteTagDto createFromParcel(Parcel parcel) {
            return ActionLinksDeleteTagDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksDeleteTagDto[] newArray(int i) {
            return new ActionLinksDeleteTagDto[i];
        }
    }

    static {
        ActionLinksDeleteTagDto actionLinksDeleteTagDto = new ActionLinksDeleteTagDto("LIVE", 0, "live");
        LIVE = actionLinksDeleteTagDto;
        ActionLinksDeleteTagDto[] actionLinksDeleteTagDtoArr = {actionLinksDeleteTagDto};
        $VALUES = actionLinksDeleteTagDtoArr;
        $ENTRIES = new asp(actionLinksDeleteTagDtoArr);
        CREATOR = new a();
    }

    private ActionLinksDeleteTagDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ActionLinksDeleteTagDto valueOf(String str) {
        return (ActionLinksDeleteTagDto) Enum.valueOf(ActionLinksDeleteTagDto.class, str);
    }

    public static ActionLinksDeleteTagDto[] values() {
        return (ActionLinksDeleteTagDto[]) $VALUES.clone();
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
