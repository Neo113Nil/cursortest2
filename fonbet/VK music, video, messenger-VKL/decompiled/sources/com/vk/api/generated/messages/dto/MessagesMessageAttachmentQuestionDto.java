package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesMessageAttachmentQuestionDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageAttachmentQuestionDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageAttachmentQuestionDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("question")
    private final String question;

    @pmi0("url")
    private final String url;

    /* compiled from: MessagesMessageAttachmentQuestionDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageAttachmentQuestionDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentQuestionDto createFromParcel(Parcel parcel) {
            return new MessagesMessageAttachmentQuestionDto(parcel.readInt(), (UserId) parcel.readParcelable(MessagesMessageAttachmentQuestionDto.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentQuestionDto[] newArray(int i) {
            return new MessagesMessageAttachmentQuestionDto[i];
        }
    }

    public MessagesMessageAttachmentQuestionDto(int i, UserId userId, String str, String str2) {
        this.id = i;
        this.ownerId = userId;
        this.question = str;
        this.url = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageAttachmentQuestionDto)) {
            return false;
        }
        MessagesMessageAttachmentQuestionDto messagesMessageAttachmentQuestionDto = (MessagesMessageAttachmentQuestionDto) obj;
        return this.id == messagesMessageAttachmentQuestionDto.id && epx.f(this.ownerId, messagesMessageAttachmentQuestionDto.ownerId) && epx.f(this.question, messagesMessageAttachmentQuestionDto.question) && epx.f(this.url, messagesMessageAttachmentQuestionDto.url);
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.question);
        String str = this.url;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageAttachmentQuestionDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", question=");
        sb.append(this.question);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.question);
        parcel.writeString(this.url);
    }

    public /* synthetic */ MessagesMessageAttachmentQuestionDto(int i, UserId userId, String str, String str2, int i2, zcl zclVar) {
        this(i, userId, str, (i2 & 8) != 0 ? null : str2);
    }
}
