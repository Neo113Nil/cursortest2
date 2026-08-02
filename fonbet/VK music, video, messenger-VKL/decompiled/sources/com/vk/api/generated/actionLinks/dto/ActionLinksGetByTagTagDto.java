package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionLinksGetByTagTagDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksGetByTagTagDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionLinksGetByTagTagDto[] $VALUES;
    public static final Parcelable.Creator<ActionLinksGetByTagTagDto> CREATOR;

    @pmi0("live")
    public static final ActionLinksGetByTagTagDto LIVE;
    private final String value;

    /* compiled from: ActionLinksGetByTagTagDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksGetByTagTagDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksGetByTagTagDto createFromParcel(Parcel parcel) {
            return ActionLinksGetByTagTagDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksGetByTagTagDto[] newArray(int i) {
            return new ActionLinksGetByTagTagDto[i];
        }
    }

    static {
        ActionLinksGetByTagTagDto actionLinksGetByTagTagDto = new ActionLinksGetByTagTagDto("LIVE", 0, "live");
        LIVE = actionLinksGetByTagTagDto;
        ActionLinksGetByTagTagDto[] actionLinksGetByTagTagDtoArr = {actionLinksGetByTagTagDto};
        $VALUES = actionLinksGetByTagTagDtoArr;
        $ENTRIES = new asp(actionLinksGetByTagTagDtoArr);
        CREATOR = new a();
    }

    private ActionLinksGetByTagTagDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ActionLinksGetByTagTagDto valueOf(String str) {
        return (ActionLinksGetByTagTagDto) Enum.valueOf(ActionLinksGetByTagTagDto.class, str);
    }

    public static ActionLinksGetByTagTagDto[] values() {
        return (ActionLinksGetByTagTagDto[]) $VALUES.clone();
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
