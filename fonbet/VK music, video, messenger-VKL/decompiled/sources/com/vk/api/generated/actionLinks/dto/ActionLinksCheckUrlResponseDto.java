package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ActionLinksCheckUrlResponseDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksCheckUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<ActionLinksCheckUrlResponseDto> CREATOR = new a();

    @pmi0("action")
    private final ActionLinksActionDto action;

    @pmi0("error_text")
    private final String errorText;

    @pmi0("is_valid")
    private final BaseBoolIntDto isValid;

    /* compiled from: ActionLinksCheckUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksCheckUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksCheckUrlResponseDto createFromParcel(Parcel parcel) {
            return new ActionLinksCheckUrlResponseDto((BaseBoolIntDto) parcel.readParcelable(ActionLinksCheckUrlResponseDto.class.getClassLoader()), (ActionLinksActionDto) parcel.readParcelable(ActionLinksCheckUrlResponseDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksCheckUrlResponseDto[] newArray(int i) {
            return new ActionLinksCheckUrlResponseDto[i];
        }
    }

    public ActionLinksCheckUrlResponseDto(BaseBoolIntDto baseBoolIntDto, ActionLinksActionDto actionLinksActionDto, String str) {
        this.isValid = baseBoolIntDto;
        this.action = actionLinksActionDto;
        this.errorText = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionLinksCheckUrlResponseDto)) {
            return false;
        }
        ActionLinksCheckUrlResponseDto actionLinksCheckUrlResponseDto = (ActionLinksCheckUrlResponseDto) obj;
        return this.isValid == actionLinksCheckUrlResponseDto.isValid && epx.f(this.action, actionLinksCheckUrlResponseDto.action) && epx.f(this.errorText, actionLinksCheckUrlResponseDto.errorText);
    }

    public final int hashCode() {
        int hashCode = this.isValid.hashCode() * 31;
        ActionLinksActionDto actionLinksActionDto = this.action;
        int hashCode2 = (hashCode + (actionLinksActionDto == null ? 0 : actionLinksActionDto.hashCode())) * 31;
        String str = this.errorText;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionLinksCheckUrlResponseDto(isValid=");
        sb.append(this.isValid);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", errorText=");
        return ho8.a(sb, this.errorText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.isValid, i);
        parcel.writeParcelable(this.action, i);
        parcel.writeString(this.errorText);
    }

    public /* synthetic */ ActionLinksCheckUrlResponseDto(BaseBoolIntDto baseBoolIntDto, ActionLinksActionDto actionLinksActionDto, String str, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : actionLinksActionDto, (i & 4) != 0 ? null : str);
    }
}
