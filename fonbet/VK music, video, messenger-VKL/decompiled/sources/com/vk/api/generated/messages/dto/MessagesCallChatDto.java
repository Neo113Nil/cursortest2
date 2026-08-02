package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesCallChatDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCallChatDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCallChatDto> CREATOR = new a();

    @pmi0("call_in_progress")
    private final MessagesCallInProgressDto callInProgress;

    @pmi0("id")
    private final int id;

    @pmi0("left_or_kicked")
    private final Boolean leftOrKicked;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_400")
    private final String photo400;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("title")
    private final String title;

    /* compiled from: MessagesCallChatDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCallChatDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCallChatDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(MessagesCallChatDto.class.getClassLoader());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Boolean bool = null;
            MessagesCallInProgressDto createFromParcel = parcel.readInt() == 0 ? null : MessagesCallInProgressDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesCallChatDto(readInt, readString, userId, readString2, readString3, readString4, readString5, readString6, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCallChatDto[] newArray(int i) {
            return new MessagesCallChatDto[i];
        }
    }

    public MessagesCallChatDto(int i, String str, UserId userId, String str2, String str3, String str4, String str5, String str6, MessagesCallInProgressDto messagesCallInProgressDto, Boolean bool) {
        this.id = i;
        this.title = str;
        this.peerId = userId;
        this.photo50 = str2;
        this.photo100 = str3;
        this.photo200 = str4;
        this.photo400 = str5;
        this.photoBase = str6;
        this.callInProgress = messagesCallInProgressDto;
        this.leftOrKicked = bool;
    }

    public final UserId d() {
        return this.peerId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.photoBase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesCallChatDto)) {
            return false;
        }
        MessagesCallChatDto messagesCallChatDto = (MessagesCallChatDto) obj;
        return this.id == messagesCallChatDto.id && epx.f(this.title, messagesCallChatDto.title) && epx.f(this.peerId, messagesCallChatDto.peerId) && epx.f(this.photo50, messagesCallChatDto.photo50) && epx.f(this.photo100, messagesCallChatDto.photo100) && epx.f(this.photo200, messagesCallChatDto.photo200) && epx.f(this.photo400, messagesCallChatDto.photo400) && epx.f(this.photoBase, messagesCallChatDto.photoBase) && epx.f(this.callInProgress, messagesCallChatDto.callInProgress) && epx.f(this.leftOrKicked, messagesCallChatDto.leftOrKicked);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        UserId userId = this.peerId;
        int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.photo50;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo100;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo200;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo400;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photoBase;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MessagesCallInProgressDto messagesCallInProgressDto = this.callInProgress;
        int hashCode7 = (hashCode6 + (messagesCallInProgressDto == null ? 0 : messagesCallInProgressDto.hashCode())) * 31;
        Boolean bool = this.leftOrKicked;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesCallChatDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", peerId=");
        sb.append(this.peerId);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photo400=");
        sb.append(this.photo400);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", callInProgress=");
        sb.append(this.callInProgress);
        sb.append(", leftOrKicked=");
        return tn.a(sb, this.leftOrKicked, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.peerId, i);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photo400);
        parcel.writeString(this.photoBase);
        MessagesCallInProgressDto messagesCallInProgressDto = this.callInProgress;
        if (messagesCallInProgressDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCallInProgressDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.leftOrKicked;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesCallChatDto(int i, String str, UserId userId, String str2, String str3, String str4, String str5, String str6, MessagesCallInProgressDto messagesCallInProgressDto, Boolean bool, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : userId, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : messagesCallInProgressDto, (i2 & 512) != 0 ? null : bool);
    }
}
