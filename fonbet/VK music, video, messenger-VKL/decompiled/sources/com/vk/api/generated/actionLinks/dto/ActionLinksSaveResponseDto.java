package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ActionLinksSaveResponseDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksSaveResponseDto implements Parcelable {
    public static final Parcelable.Creator<ActionLinksSaveResponseDto> CREATOR = new a();

    @pmi0("action")
    private final ActionLinksActionDto action;

    /* compiled from: ActionLinksSaveResponseDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksSaveResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksSaveResponseDto createFromParcel(Parcel parcel) {
            return new ActionLinksSaveResponseDto((ActionLinksActionDto) parcel.readParcelable(ActionLinksSaveResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksSaveResponseDto[] newArray(int i) {
            return new ActionLinksSaveResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionLinksSaveResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionLinksSaveResponseDto) && epx.f(this.action, ((ActionLinksSaveResponseDto) obj).action);
    }

    public final int hashCode() {
        ActionLinksActionDto actionLinksActionDto = this.action;
        if (actionLinksActionDto == null) {
            return 0;
        }
        return actionLinksActionDto.hashCode();
    }

    public final String toString() {
        return "ActionLinksSaveResponseDto(action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.action, i);
    }

    public ActionLinksSaveResponseDto(ActionLinksActionDto actionLinksActionDto) {
        this.action = actionLinksActionDto;
    }

    public /* synthetic */ ActionLinksSaveResponseDto(ActionLinksActionDto actionLinksActionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : actionLinksActionDto);
    }
}
