package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesChatSettingsYoulaDealInfoItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatSettingsYoulaDealInfoItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatSettingsYoulaDealInfoItemDto> CREATOR = new a();

    @pmi0("commercial_profile_link")
    private final String commercialProfileLink;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("profile_photo")
    private final String profilePhoto;

    @pmi0("youla_user_id")
    private final String youlaUserId;

    /* compiled from: MessagesChatSettingsYoulaDealInfoItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatSettingsYoulaDealInfoItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsYoulaDealInfoItemDto createFromParcel(Parcel parcel) {
            return new MessagesChatSettingsYoulaDealInfoItemDto((UserId) parcel.readParcelable(MessagesChatSettingsYoulaDealInfoItemDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsYoulaDealInfoItemDto[] newArray(int i) {
            return new MessagesChatSettingsYoulaDealInfoItemDto[i];
        }
    }

    public MessagesChatSettingsYoulaDealInfoItemDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsYoulaDealInfoItemDto)) {
            return false;
        }
        MessagesChatSettingsYoulaDealInfoItemDto messagesChatSettingsYoulaDealInfoItemDto = (MessagesChatSettingsYoulaDealInfoItemDto) obj;
        return epx.f(this.ownerId, messagesChatSettingsYoulaDealInfoItemDto.ownerId) && epx.f(this.youlaUserId, messagesChatSettingsYoulaDealInfoItemDto.youlaUserId) && epx.f(this.firstName, messagesChatSettingsYoulaDealInfoItemDto.firstName) && epx.f(this.lastName, messagesChatSettingsYoulaDealInfoItemDto.lastName) && epx.f(this.profilePhoto, messagesChatSettingsYoulaDealInfoItemDto.profilePhoto) && epx.f(this.commercialProfileLink, messagesChatSettingsYoulaDealInfoItemDto.commercialProfileLink);
    }

    public final int hashCode() {
        UserId userId = this.ownerId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.youlaUserId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profilePhoto;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.commercialProfileLink;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChatSettingsYoulaDealInfoItemDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", youlaUserId=");
        sb.append(this.youlaUserId);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", profilePhoto=");
        sb.append(this.profilePhoto);
        sb.append(", commercialProfileLink=");
        return ho8.a(sb, this.commercialProfileLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.youlaUserId);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.profilePhoto);
        parcel.writeString(this.commercialProfileLink);
    }

    public MessagesChatSettingsYoulaDealInfoItemDto(UserId userId, String str, String str2, String str3, String str4, String str5) {
        this.ownerId = userId;
        this.youlaUserId = str;
        this.firstName = str2;
        this.lastName = str3;
        this.profilePhoto = str4;
        this.commercialProfileLink = str5;
    }

    public /* synthetic */ MessagesChatSettingsYoulaDealInfoItemDto(UserId userId, String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
