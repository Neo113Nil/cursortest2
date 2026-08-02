package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionLinksSaveTagDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksSaveTagDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionLinksSaveTagDto[] $VALUES;
    public static final Parcelable.Creator<ActionLinksSaveTagDto> CREATOR;

    @pmi0("live")
    public static final ActionLinksSaveTagDto LIVE;
    private final String value;

    /* compiled from: ActionLinksSaveTagDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksSaveTagDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksSaveTagDto createFromParcel(Parcel parcel) {
            return ActionLinksSaveTagDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksSaveTagDto[] newArray(int i) {
            return new ActionLinksSaveTagDto[i];
        }
    }

    static {
        ActionLinksSaveTagDto actionLinksSaveTagDto = new ActionLinksSaveTagDto("LIVE", 0, "live");
        LIVE = actionLinksSaveTagDto;
        ActionLinksSaveTagDto[] actionLinksSaveTagDtoArr = {actionLinksSaveTagDto};
        $VALUES = actionLinksSaveTagDtoArr;
        $ENTRIES = new asp(actionLinksSaveTagDtoArr);
        CREATOR = new a();
    }

    private ActionLinksSaveTagDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ActionLinksSaveTagDto valueOf(String str) {
        return (ActionLinksSaveTagDto) Enum.valueOf(ActionLinksSaveTagDto.class, str);
    }

    public static ActionLinksSaveTagDto[] values() {
        return (ActionLinksSaveTagDto[]) $VALUES.clone();
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
