package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesAddChatUserSourceDto.kt */
/* loaded from: classes15.dex */
public final class MessagesAddChatUserSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesAddChatUserSourceDto[] $VALUES;

    @pmi0("contacts")
    public static final MessagesAddChatUserSourceDto CONTACTS;

    @pmi0(SignalingProtocol.KEY_CONVERSATION)
    public static final MessagesAddChatUserSourceDto CONVERSATION;

    @pmi0("create_chat")
    public static final MessagesAddChatUserSourceDto CREATE_CHAT;
    public static final Parcelable.Creator<MessagesAddChatUserSourceDto> CREATOR;

    @pmi0("other")
    public static final MessagesAddChatUserSourceDto OTHER;

    @pmi0("personal")
    public static final MessagesAddChatUserSourceDto PERSONAL;

    @pmi0("phone")
    public static final MessagesAddChatUserSourceDto PHONE;

    @pmi0("screen")
    public static final MessagesAddChatUserSourceDto SCREEN;

    @pmi0("search")
    public static final MessagesAddChatUserSourceDto SEARCH;
    private final String value;

    /* compiled from: MessagesAddChatUserSourceDto.kt */
    public static final class a implements Parcelable.Creator<MessagesAddChatUserSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesAddChatUserSourceDto createFromParcel(Parcel parcel) {
            return MessagesAddChatUserSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesAddChatUserSourceDto[] newArray(int i) {
            return new MessagesAddChatUserSourceDto[i];
        }
    }

    static {
        MessagesAddChatUserSourceDto messagesAddChatUserSourceDto = new MessagesAddChatUserSourceDto("CONTACTS", 0, "contacts");
        CONTACTS = messagesAddChatUserSourceDto;
        MessagesAddChatUserSourceDto messagesAddChatUserSourceDto2 = new MessagesAddChatUserSourceDto("CONVERSATION", 1, SignalingProtocol.KEY_CONVERSATION);
        CONVERSATION = messagesAddChatUserSourceDto2;
        MessagesAddChatUserSourceDto messagesAddChatUserSourceDto3 = new MessagesAddChatUserSourceDto("CREATE_CHAT", 2, "create_chat");
        CREATE_CHAT = messagesAddChatUserSourceDto3;
        MessagesAddChatUserSourceDto messagesAddChatUserSourceDto4 = new MessagesAddChatUserSourceDto(NativeAdContent.ViewTag.OTHER, 3, "other");
        OTHER = messagesAddChatUserSourceDto4;
        MessagesAddChatUserSourceDto messagesAddChatUserSourceDto5 = new MessagesAddChatUserSourceDto("PERSONAL", 4, "personal");
        PERSONAL = messagesAddChatUserSourceDto5;
        MessagesAddChatUserSourceDto messagesAddChatUserSourceDto6 = new MessagesAddChatUserSourceDto("PHONE", 5, "phone");
        PHONE = messagesAddChatUserSourceDto6;
        MessagesAddChatUserSourceDto messagesAddChatUserSourceDto7 = new MessagesAddChatUserSourceDto("SCREEN", 6, "screen");
        SCREEN = messagesAddChatUserSourceDto7;
        MessagesAddChatUserSourceDto messagesAddChatUserSourceDto8 = new MessagesAddChatUserSourceDto("SEARCH", 7, "search");
        SEARCH = messagesAddChatUserSourceDto8;
        MessagesAddChatUserSourceDto[] messagesAddChatUserSourceDtoArr = {messagesAddChatUserSourceDto, messagesAddChatUserSourceDto2, messagesAddChatUserSourceDto3, messagesAddChatUserSourceDto4, messagesAddChatUserSourceDto5, messagesAddChatUserSourceDto6, messagesAddChatUserSourceDto7, messagesAddChatUserSourceDto8};
        $VALUES = messagesAddChatUserSourceDtoArr;
        $ENTRIES = new asp(messagesAddChatUserSourceDtoArr);
        CREATOR = new a();
    }

    private MessagesAddChatUserSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesAddChatUserSourceDto valueOf(String str) {
        return (MessagesAddChatUserSourceDto) Enum.valueOf(MessagesAddChatUserSourceDto.class, str);
    }

    public static MessagesAddChatUserSourceDto[] values() {
        return (MessagesAddChatUserSourceDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
