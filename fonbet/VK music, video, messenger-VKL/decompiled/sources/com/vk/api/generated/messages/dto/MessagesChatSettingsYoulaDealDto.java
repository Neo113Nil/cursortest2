package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesChatSettingsYoulaDealDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatSettingsYoulaDealDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatSettingsYoulaDealDto> CREATOR = new a();

    @pmi0("commercial_profile_link")
    private final String commercialProfileLink;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("self_commercial_profile_link")
    private final String selfCommercialProfileLink;

    @pmi0("self_owner_id")
    private final UserId selfOwnerId;

    @pmi0("target_owner_id")
    private final UserId targetOwnerId;

    @pmi0("youla_user_id")
    private final String youlaUserId;

    /* compiled from: MessagesChatSettingsYoulaDealDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatSettingsYoulaDealDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsYoulaDealDto createFromParcel(Parcel parcel) {
            return new MessagesChatSettingsYoulaDealDto((UserId) parcel.readParcelable(MessagesChatSettingsYoulaDealDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(MessagesChatSettingsYoulaDealDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsYoulaDealDto[] newArray(int i) {
            return new MessagesChatSettingsYoulaDealDto[i];
        }
    }

    public MessagesChatSettingsYoulaDealDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsYoulaDealDto)) {
            return false;
        }
        MessagesChatSettingsYoulaDealDto messagesChatSettingsYoulaDealDto = (MessagesChatSettingsYoulaDealDto) obj;
        return epx.f(this.targetOwnerId, messagesChatSettingsYoulaDealDto.targetOwnerId) && epx.f(this.youlaUserId, messagesChatSettingsYoulaDealDto.youlaUserId) && epx.f(this.lastName, messagesChatSettingsYoulaDealDto.lastName) && epx.f(this.firstName, messagesChatSettingsYoulaDealDto.firstName) && epx.f(this.commercialProfileLink, messagesChatSettingsYoulaDealDto.commercialProfileLink) && epx.f(this.selfOwnerId, messagesChatSettingsYoulaDealDto.selfOwnerId) && epx.f(this.selfCommercialProfileLink, messagesChatSettingsYoulaDealDto.selfCommercialProfileLink);
    }

    public final int hashCode() {
        UserId userId = this.targetOwnerId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.youlaUserId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.commercialProfileLink;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UserId userId2 = this.selfOwnerId;
        int hashCode6 = (hashCode5 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        String str5 = this.selfCommercialProfileLink;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChatSettingsYoulaDealDto(targetOwnerId=");
        sb.append(this.targetOwnerId);
        sb.append(", youlaUserId=");
        sb.append(this.youlaUserId);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", commercialProfileLink=");
        sb.append(this.commercialProfileLink);
        sb.append(", selfOwnerId=");
        sb.append(this.selfOwnerId);
        sb.append(", selfCommercialProfileLink=");
        return ho8.a(sb, this.selfCommercialProfileLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.targetOwnerId, i);
        parcel.writeString(this.youlaUserId);
        parcel.writeString(this.lastName);
        parcel.writeString(this.firstName);
        parcel.writeString(this.commercialProfileLink);
        parcel.writeParcelable(this.selfOwnerId, i);
        parcel.writeString(this.selfCommercialProfileLink);
    }

    public MessagesChatSettingsYoulaDealDto(UserId userId, String str, String str2, String str3, String str4, UserId userId2, String str5) {
        this.targetOwnerId = userId;
        this.youlaUserId = str;
        this.lastName = str2;
        this.firstName = str3;
        this.commercialProfileLink = str4;
        this.selfOwnerId = userId2;
        this.selfCommercialProfileLink = str5;
    }

    public /* synthetic */ MessagesChatSettingsYoulaDealDto(UserId userId, String str, String str2, String str3, String str4, UserId userId2, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : userId2, (i & 64) != 0 ? null : str5);
    }
}
