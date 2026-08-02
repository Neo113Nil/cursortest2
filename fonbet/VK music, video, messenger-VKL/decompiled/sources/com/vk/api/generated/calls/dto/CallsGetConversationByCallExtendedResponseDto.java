package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.messages.dto.MessagesConversationDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CallsGetConversationByCallExtendedResponseDto.kt */
/* loaded from: classes14.dex */
public final class CallsGetConversationByCallExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<CallsGetConversationByCallExtendedResponseDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_CONVERSATION)
    private final MessagesConversationDto conversation;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: CallsGetConversationByCallExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<CallsGetConversationByCallExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsGetConversationByCallExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            MessagesConversationDto createFromParcel = parcel.readInt() == 0 ? null : MessagesConversationDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(CallsGetConversationByCallExtendedResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new CallsGetConversationByCallExtendedResponseDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CallsGetConversationByCallExtendedResponseDto[] newArray(int i) {
            return new CallsGetConversationByCallExtendedResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallsGetConversationByCallExtendedResponseDto() {
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
        if (!(obj instanceof CallsGetConversationByCallExtendedResponseDto)) {
            return false;
        }
        CallsGetConversationByCallExtendedResponseDto callsGetConversationByCallExtendedResponseDto = (CallsGetConversationByCallExtendedResponseDto) obj;
        return epx.f(this.conversation, callsGetConversationByCallExtendedResponseDto.conversation) && epx.f(this.profiles, callsGetConversationByCallExtendedResponseDto.profiles);
    }

    public final int hashCode() {
        MessagesConversationDto messagesConversationDto = this.conversation;
        int hashCode = (messagesConversationDto == null ? 0 : messagesConversationDto.hashCode()) * 31;
        List<UsersUserFullDto> list = this.profiles;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsGetConversationByCallExtendedResponseDto(conversation=");
        sb.append(this.conversation);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MessagesConversationDto messagesConversationDto = this.conversation;
        if (messagesConversationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationDto.writeToParcel(parcel, i);
        }
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public CallsGetConversationByCallExtendedResponseDto(MessagesConversationDto messagesConversationDto, List<UsersUserFullDto> list) {
        this.conversation = messagesConversationDto;
        this.profiles = list;
    }

    public /* synthetic */ CallsGetConversationByCallExtendedResponseDto(MessagesConversationDto messagesConversationDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : messagesConversationDto, (i & 2) != 0 ? null : list);
    }
}
