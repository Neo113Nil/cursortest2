package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesChatSettingsYoulaDealInfoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatSettingsYoulaDealInfoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatSettingsYoulaDealInfoDto> CREATOR = new a();

    @pmi0("bot_user_id")
    private final UserId botUserId;

    @pmi0("companion_info")
    private final MessagesChatSettingsYoulaDealInfoItemDto companionInfo;

    @pmi0("self_info")
    private final MessagesChatSettingsYoulaDealInfoItemDto selfInfo;

    /* compiled from: MessagesChatSettingsYoulaDealInfoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatSettingsYoulaDealInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsYoulaDealInfoDto createFromParcel(Parcel parcel) {
            return new MessagesChatSettingsYoulaDealInfoDto(parcel.readInt() == 0 ? null : MessagesChatSettingsYoulaDealInfoItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MessagesChatSettingsYoulaDealInfoItemDto.CREATOR.createFromParcel(parcel) : null, (UserId) parcel.readParcelable(MessagesChatSettingsYoulaDealInfoDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsYoulaDealInfoDto[] newArray(int i) {
            return new MessagesChatSettingsYoulaDealInfoDto[i];
        }
    }

    public MessagesChatSettingsYoulaDealInfoDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsYoulaDealInfoDto)) {
            return false;
        }
        MessagesChatSettingsYoulaDealInfoDto messagesChatSettingsYoulaDealInfoDto = (MessagesChatSettingsYoulaDealInfoDto) obj;
        return epx.f(this.selfInfo, messagesChatSettingsYoulaDealInfoDto.selfInfo) && epx.f(this.companionInfo, messagesChatSettingsYoulaDealInfoDto.companionInfo) && epx.f(this.botUserId, messagesChatSettingsYoulaDealInfoDto.botUserId);
    }

    public final int hashCode() {
        MessagesChatSettingsYoulaDealInfoItemDto messagesChatSettingsYoulaDealInfoItemDto = this.selfInfo;
        int hashCode = (messagesChatSettingsYoulaDealInfoItemDto == null ? 0 : messagesChatSettingsYoulaDealInfoItemDto.hashCode()) * 31;
        MessagesChatSettingsYoulaDealInfoItemDto messagesChatSettingsYoulaDealInfoItemDto2 = this.companionInfo;
        int hashCode2 = (hashCode + (messagesChatSettingsYoulaDealInfoItemDto2 == null ? 0 : messagesChatSettingsYoulaDealInfoItemDto2.hashCode())) * 31;
        UserId userId = this.botUserId;
        return hashCode2 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChatSettingsYoulaDealInfoDto(selfInfo=");
        sb.append(this.selfInfo);
        sb.append(", companionInfo=");
        sb.append(this.companionInfo);
        sb.append(", botUserId=");
        return gp.b(sb, this.botUserId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MessagesChatSettingsYoulaDealInfoItemDto messagesChatSettingsYoulaDealInfoItemDto = this.selfInfo;
        if (messagesChatSettingsYoulaDealInfoItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatSettingsYoulaDealInfoItemDto.writeToParcel(parcel, i);
        }
        MessagesChatSettingsYoulaDealInfoItemDto messagesChatSettingsYoulaDealInfoItemDto2 = this.companionInfo;
        if (messagesChatSettingsYoulaDealInfoItemDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatSettingsYoulaDealInfoItemDto2.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.botUserId, i);
    }

    public MessagesChatSettingsYoulaDealInfoDto(MessagesChatSettingsYoulaDealInfoItemDto messagesChatSettingsYoulaDealInfoItemDto, MessagesChatSettingsYoulaDealInfoItemDto messagesChatSettingsYoulaDealInfoItemDto2, UserId userId) {
        this.selfInfo = messagesChatSettingsYoulaDealInfoItemDto;
        this.companionInfo = messagesChatSettingsYoulaDealInfoItemDto2;
        this.botUserId = userId;
    }

    public /* synthetic */ MessagesChatSettingsYoulaDealInfoDto(MessagesChatSettingsYoulaDealInfoItemDto messagesChatSettingsYoulaDealInfoItemDto, MessagesChatSettingsYoulaDealInfoItemDto messagesChatSettingsYoulaDealInfoItemDto2, UserId userId, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : messagesChatSettingsYoulaDealInfoItemDto, (i & 2) != 0 ? null : messagesChatSettingsYoulaDealInfoItemDto2, (i & 4) != 0 ? null : userId);
    }
}
