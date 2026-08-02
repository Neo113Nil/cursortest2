package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.calls.dto.CallsShortCredentialsDto;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetJoinLinkResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetJoinLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetJoinLinkResponseDto> CREATOR = new a();

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    @pmi0("room_link")
    private final String roomLink;

    @pmi0("short_credentials")
    private final CallsShortCredentialsDto shortCredentials;

    /* compiled from: MessagesGetJoinLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetJoinLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetJoinLinkResponseDto createFromParcel(Parcel parcel) {
            return new MessagesGetJoinLinkResponseDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CallsShortCredentialsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetJoinLinkResponseDto[] newArray(int i) {
            return new MessagesGetJoinLinkResponseDto[i];
        }
    }

    public MessagesGetJoinLinkResponseDto(String str, String str2, CallsShortCredentialsDto callsShortCredentialsDto) {
        this.joinLink = str;
        this.roomLink = str2;
        this.shortCredentials = callsShortCredentialsDto;
    }

    public final String d() {
        return this.joinLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CallsShortCredentialsDto e() {
        return this.shortCredentials;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetJoinLinkResponseDto)) {
            return false;
        }
        MessagesGetJoinLinkResponseDto messagesGetJoinLinkResponseDto = (MessagesGetJoinLinkResponseDto) obj;
        return epx.f(this.joinLink, messagesGetJoinLinkResponseDto.joinLink) && epx.f(this.roomLink, messagesGetJoinLinkResponseDto.roomLink) && epx.f(this.shortCredentials, messagesGetJoinLinkResponseDto.shortCredentials);
    }

    public final int hashCode() {
        int hashCode = this.joinLink.hashCode() * 31;
        String str = this.roomLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CallsShortCredentialsDto callsShortCredentialsDto = this.shortCredentials;
        return hashCode2 + (callsShortCredentialsDto != null ? callsShortCredentialsDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesGetJoinLinkResponseDto(joinLink=" + this.joinLink + ", roomLink=" + this.roomLink + ", shortCredentials=" + this.shortCredentials + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.joinLink);
        parcel.writeString(this.roomLink);
        CallsShortCredentialsDto callsShortCredentialsDto = this.shortCredentials;
        if (callsShortCredentialsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callsShortCredentialsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesGetJoinLinkResponseDto(String str, String str2, CallsShortCredentialsDto callsShortCredentialsDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : callsShortCredentialsDto);
    }
}
