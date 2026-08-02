package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesStartCallResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesStartCallResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesStartCallResponseDto> CREATOR = new a();

    @pmi0("call_id")
    private final String callId;

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    /* compiled from: MessagesStartCallResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesStartCallResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesStartCallResponseDto createFromParcel(Parcel parcel) {
            return new MessagesStartCallResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesStartCallResponseDto[] newArray(int i) {
            return new MessagesStartCallResponseDto[i];
        }
    }

    public MessagesStartCallResponseDto(String str, String str2) {
        this.joinLink = str;
        this.callId = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesStartCallResponseDto)) {
            return false;
        }
        MessagesStartCallResponseDto messagesStartCallResponseDto = (MessagesStartCallResponseDto) obj;
        return epx.f(this.joinLink, messagesStartCallResponseDto.joinLink) && epx.f(this.callId, messagesStartCallResponseDto.callId);
    }

    public final int hashCode() {
        int hashCode = this.joinLink.hashCode() * 31;
        String str = this.callId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesStartCallResponseDto(joinLink=");
        sb.append(this.joinLink);
        sb.append(", callId=");
        return ho8.a(sb, this.callId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.joinLink);
        parcel.writeString(this.callId);
    }

    public /* synthetic */ MessagesStartCallResponseDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
