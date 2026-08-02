package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetHistoryFilterDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetHistoryFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetHistoryFilterDto[] $VALUES;

    @pmi0("all")
    public static final MessagesGetHistoryFilterDto ALL;

    @pmi0("audio")
    public static final MessagesGetHistoryFilterDto AUDIO;
    public static final Parcelable.Creator<MessagesGetHistoryFilterDto> CREATOR;

    @pmi0(X3.i.b)
    public static final MessagesGetHistoryFilterDto FILE;

    @pmi0("link")
    public static final MessagesGetHistoryFilterDto LINK;

    @pmi0("media_viewer")
    public static final MessagesGetHistoryFilterDto MEDIA_VIEWER;

    @pmi0("photo")
    public static final MessagesGetHistoryFilterDto PHOTO;

    @pmi0("pinned_messages")
    public static final MessagesGetHistoryFilterDto PINNED_MESSAGES;

    @pmi0("video")
    public static final MessagesGetHistoryFilterDto VIDEO;
    private final String value;

    /* compiled from: MessagesGetHistoryFilterDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetHistoryFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryFilterDto createFromParcel(Parcel parcel) {
            return MessagesGetHistoryFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryFilterDto[] newArray(int i) {
            return new MessagesGetHistoryFilterDto[i];
        }
    }

    static {
        MessagesGetHistoryFilterDto messagesGetHistoryFilterDto = new MessagesGetHistoryFilterDto("ALL", 0, "all");
        ALL = messagesGetHistoryFilterDto;
        MessagesGetHistoryFilterDto messagesGetHistoryFilterDto2 = new MessagesGetHistoryFilterDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 1, "audio");
        AUDIO = messagesGetHistoryFilterDto2;
        MessagesGetHistoryFilterDto messagesGetHistoryFilterDto3 = new MessagesGetHistoryFilterDto("FILE", 2, X3.i.b);
        FILE = messagesGetHistoryFilterDto3;
        MessagesGetHistoryFilterDto messagesGetHistoryFilterDto4 = new MessagesGetHistoryFilterDto("LINK", 3, "link");
        LINK = messagesGetHistoryFilterDto4;
        MessagesGetHistoryFilterDto messagesGetHistoryFilterDto5 = new MessagesGetHistoryFilterDto("MEDIA_VIEWER", 4, "media_viewer");
        MEDIA_VIEWER = messagesGetHistoryFilterDto5;
        MessagesGetHistoryFilterDto messagesGetHistoryFilterDto6 = new MessagesGetHistoryFilterDto("PHOTO", 5, "photo");
        PHOTO = messagesGetHistoryFilterDto6;
        MessagesGetHistoryFilterDto messagesGetHistoryFilterDto7 = new MessagesGetHistoryFilterDto("PINNED_MESSAGES", 6, "pinned_messages");
        PINNED_MESSAGES = messagesGetHistoryFilterDto7;
        MessagesGetHistoryFilterDto messagesGetHistoryFilterDto8 = new MessagesGetHistoryFilterDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 7, "video");
        VIDEO = messagesGetHistoryFilterDto8;
        MessagesGetHistoryFilterDto[] messagesGetHistoryFilterDtoArr = {messagesGetHistoryFilterDto, messagesGetHistoryFilterDto2, messagesGetHistoryFilterDto3, messagesGetHistoryFilterDto4, messagesGetHistoryFilterDto5, messagesGetHistoryFilterDto6, messagesGetHistoryFilterDto7, messagesGetHistoryFilterDto8};
        $VALUES = messagesGetHistoryFilterDtoArr;
        $ENTRIES = new asp(messagesGetHistoryFilterDtoArr);
        CREATOR = new a();
    }

    private MessagesGetHistoryFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetHistoryFilterDto valueOf(String str) {
        return (MessagesGetHistoryFilterDto) Enum.valueOf(MessagesGetHistoryFilterDto.class, str);
    }

    public static MessagesGetHistoryFilterDto[] values() {
        return (MessagesGetHistoryFilterDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
