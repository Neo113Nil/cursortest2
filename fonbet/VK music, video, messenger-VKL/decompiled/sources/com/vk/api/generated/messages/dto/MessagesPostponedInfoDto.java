package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseMessageErrorDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesPostponedInfoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesPostponedInfoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesPostponedInfoDto> CREATOR = new a();

    @pmi0("error")
    private final BaseMessageErrorDto error;

    @pmi0("settings")
    private final MessagesPostponedSettingsDto settings;

    /* compiled from: MessagesPostponedInfoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesPostponedInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesPostponedInfoDto createFromParcel(Parcel parcel) {
            return new MessagesPostponedInfoDto(MessagesPostponedSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BaseMessageErrorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesPostponedInfoDto[] newArray(int i) {
            return new MessagesPostponedInfoDto[i];
        }
    }

    public MessagesPostponedInfoDto(MessagesPostponedSettingsDto messagesPostponedSettingsDto, BaseMessageErrorDto baseMessageErrorDto) {
        this.settings = messagesPostponedSettingsDto;
        this.error = baseMessageErrorDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesPostponedInfoDto)) {
            return false;
        }
        MessagesPostponedInfoDto messagesPostponedInfoDto = (MessagesPostponedInfoDto) obj;
        return epx.f(this.settings, messagesPostponedInfoDto.settings) && epx.f(this.error, messagesPostponedInfoDto.error);
    }

    public final int hashCode() {
        int hashCode = this.settings.hashCode() * 31;
        BaseMessageErrorDto baseMessageErrorDto = this.error;
        return hashCode + (baseMessageErrorDto == null ? 0 : baseMessageErrorDto.hashCode());
    }

    public final String toString() {
        return "MessagesPostponedInfoDto(settings=" + this.settings + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.settings.writeToParcel(parcel, i);
        BaseMessageErrorDto baseMessageErrorDto = this.error;
        if (baseMessageErrorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseMessageErrorDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesPostponedInfoDto(MessagesPostponedSettingsDto messagesPostponedSettingsDto, BaseMessageErrorDto baseMessageErrorDto, int i, zcl zclVar) {
        this(messagesPostponedSettingsDto, (i & 2) != 0 ? null : baseMessageErrorDto);
    }
}
