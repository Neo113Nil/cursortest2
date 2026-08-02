package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesCallPreviewDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCallPreviewDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCallPreviewDto> CREATOR = new a();

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("photo")
    private final MessagesChatSettingsPhotoDto photo;

    @pmi0("title")
    private final String title;

    /* compiled from: MessagesCallPreviewDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCallPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCallPreviewDto createFromParcel(Parcel parcel) {
            return new MessagesCallPreviewDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? MessagesChatSettingsPhotoDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCallPreviewDto[] newArray(int i) {
            return new MessagesCallPreviewDto[i];
        }
    }

    public MessagesCallPreviewDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.membersCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MessagesChatSettingsPhotoDto e() {
        return this.photo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesCallPreviewDto)) {
            return false;
        }
        MessagesCallPreviewDto messagesCallPreviewDto = (MessagesCallPreviewDto) obj;
        return epx.f(this.membersCount, messagesCallPreviewDto.membersCount) && epx.f(this.title, messagesCallPreviewDto.title) && epx.f(this.photo, messagesCallPreviewDto.photo);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        Integer num = this.membersCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = this.photo;
        return hashCode2 + (messagesChatSettingsPhotoDto != null ? messagesChatSettingsPhotoDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesCallPreviewDto(membersCount=" + this.membersCount + ", title=" + this.title + ", photo=" + this.photo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.membersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.title);
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = this.photo;
        if (messagesChatSettingsPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatSettingsPhotoDto.writeToParcel(parcel, i);
        }
    }

    public MessagesCallPreviewDto(Integer num, String str, MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto) {
        this.membersCount = num;
        this.title = str;
        this.photo = messagesChatSettingsPhotoDto;
    }

    public /* synthetic */ MessagesCallPreviewDto(Integer num, String str, MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : messagesChatSettingsPhotoDto);
    }
}
