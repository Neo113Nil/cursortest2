package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesChatPushSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatPushSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatPushSettingsDto> CREATOR = new a();

    @pmi0("disabled_until")
    private final Integer disabledUntil;

    @pmi0("sound")
    private final BaseBoolIntDto sound;

    /* compiled from: MessagesChatPushSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatPushSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatPushSettingsDto createFromParcel(Parcel parcel) {
            return new MessagesChatPushSettingsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BaseBoolIntDto) parcel.readParcelable(MessagesChatPushSettingsDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatPushSettingsDto[] newArray(int i) {
            return new MessagesChatPushSettingsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesChatPushSettingsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatPushSettingsDto)) {
            return false;
        }
        MessagesChatPushSettingsDto messagesChatPushSettingsDto = (MessagesChatPushSettingsDto) obj;
        return epx.f(this.disabledUntil, messagesChatPushSettingsDto.disabledUntil) && this.sound == messagesChatPushSettingsDto.sound;
    }

    public final int hashCode() {
        Integer num = this.disabledUntil;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto = this.sound;
        return hashCode + (baseBoolIntDto != null ? baseBoolIntDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesChatPushSettingsDto(disabledUntil=" + this.disabledUntil + ", sound=" + this.sound + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.disabledUntil;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.sound, i);
    }

    public MessagesChatPushSettingsDto(Integer num, BaseBoolIntDto baseBoolIntDto) {
        this.disabledUntil = num;
        this.sound = baseBoolIntDto;
    }

    public /* synthetic */ MessagesChatPushSettingsDto(Integer num, BaseBoolIntDto baseBoolIntDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : baseBoolIntDto);
    }
}
