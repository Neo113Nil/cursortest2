package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesIncognitoMemberDto.kt */
/* loaded from: classes15.dex */
public final class MessagesIncognitoMemberDto implements Parcelable {
    public static final Parcelable.Creator<MessagesIncognitoMemberDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("peer_id")
    private final UserId peerId;

    /* compiled from: MessagesIncognitoMemberDto.kt */
    public static final class a implements Parcelable.Creator<MessagesIncognitoMemberDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesIncognitoMemberDto createFromParcel(Parcel parcel) {
            return new MessagesIncognitoMemberDto(parcel.readInt(), (UserId) parcel.readParcelable(MessagesIncognitoMemberDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesIncognitoMemberDto[] newArray(int i) {
            return new MessagesIncognitoMemberDto[i];
        }
    }

    public MessagesIncognitoMemberDto(int i, UserId userId, String str) {
        this.id = i;
        this.peerId = userId;
        this.name = str;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesIncognitoMemberDto)) {
            return false;
        }
        MessagesIncognitoMemberDto messagesIncognitoMemberDto = (MessagesIncognitoMemberDto) obj;
        return this.id == messagesIncognitoMemberDto.id && epx.f(this.peerId, messagesIncognitoMemberDto.peerId) && epx.f(this.name, messagesIncognitoMemberDto.name);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        UserId userId = this.peerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.name;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesIncognitoMemberDto(id=");
        sb.append(this.id);
        sb.append(", peerId=");
        sb.append(this.peerId);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.peerId, i);
        parcel.writeString(this.name);
    }

    public /* synthetic */ MessagesIncognitoMemberDto(int i, UserId userId, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : userId, (i2 & 4) != 0 ? null : str);
    }
}
