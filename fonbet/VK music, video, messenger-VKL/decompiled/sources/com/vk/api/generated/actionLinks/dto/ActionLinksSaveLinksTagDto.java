package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionLinksSaveLinksTagDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksSaveLinksTagDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionLinksSaveLinksTagDto[] $VALUES;
    public static final Parcelable.Creator<ActionLinksSaveLinksTagDto> CREATOR;

    @pmi0("live")
    public static final ActionLinksSaveLinksTagDto LIVE;
    private final String value;

    /* compiled from: ActionLinksSaveLinksTagDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksSaveLinksTagDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksSaveLinksTagDto createFromParcel(Parcel parcel) {
            return ActionLinksSaveLinksTagDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksSaveLinksTagDto[] newArray(int i) {
            return new ActionLinksSaveLinksTagDto[i];
        }
    }

    static {
        ActionLinksSaveLinksTagDto actionLinksSaveLinksTagDto = new ActionLinksSaveLinksTagDto("LIVE", 0, "live");
        LIVE = actionLinksSaveLinksTagDto;
        ActionLinksSaveLinksTagDto[] actionLinksSaveLinksTagDtoArr = {actionLinksSaveLinksTagDto};
        $VALUES = actionLinksSaveLinksTagDtoArr;
        $ENTRIES = new asp(actionLinksSaveLinksTagDtoArr);
        CREATOR = new a();
    }

    private ActionLinksSaveLinksTagDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ActionLinksSaveLinksTagDto valueOf(String str) {
        return (ActionLinksSaveLinksTagDto) Enum.valueOf(ActionLinksSaveLinksTagDto.class, str);
    }

    public static ActionLinksSaveLinksTagDto[] values() {
        return (ActionLinksSaveLinksTagDto[]) $VALUES.clone();
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
