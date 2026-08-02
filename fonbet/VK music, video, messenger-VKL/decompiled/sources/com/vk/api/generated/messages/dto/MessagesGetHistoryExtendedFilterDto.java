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
/* compiled from: MessagesGetHistoryExtendedFilterDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetHistoryExtendedFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetHistoryExtendedFilterDto[] $VALUES;

    @pmi0("all")
    public static final MessagesGetHistoryExtendedFilterDto ALL;

    @pmi0("audio")
    public static final MessagesGetHistoryExtendedFilterDto AUDIO;
    public static final Parcelable.Creator<MessagesGetHistoryExtendedFilterDto> CREATOR;

    @pmi0(X3.i.b)
    public static final MessagesGetHistoryExtendedFilterDto FILE;

    @pmi0("link")
    public static final MessagesGetHistoryExtendedFilterDto LINK;

    @pmi0("media_viewer")
    public static final MessagesGetHistoryExtendedFilterDto MEDIA_VIEWER;

    @pmi0("photo")
    public static final MessagesGetHistoryExtendedFilterDto PHOTO;

    @pmi0("pinned_messages")
    public static final MessagesGetHistoryExtendedFilterDto PINNED_MESSAGES;

    @pmi0("video")
    public static final MessagesGetHistoryExtendedFilterDto VIDEO;
    private final String value;

    /* compiled from: MessagesGetHistoryExtendedFilterDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetHistoryExtendedFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryExtendedFilterDto createFromParcel(Parcel parcel) {
            return MessagesGetHistoryExtendedFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryExtendedFilterDto[] newArray(int i) {
            return new MessagesGetHistoryExtendedFilterDto[i];
        }
    }

    static {
        MessagesGetHistoryExtendedFilterDto messagesGetHistoryExtendedFilterDto = new MessagesGetHistoryExtendedFilterDto("ALL", 0, "all");
        ALL = messagesGetHistoryExtendedFilterDto;
        MessagesGetHistoryExtendedFilterDto messagesGetHistoryExtendedFilterDto2 = new MessagesGetHistoryExtendedFilterDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 1, "audio");
        AUDIO = messagesGetHistoryExtendedFilterDto2;
        MessagesGetHistoryExtendedFilterDto messagesGetHistoryExtendedFilterDto3 = new MessagesGetHistoryExtendedFilterDto("FILE", 2, X3.i.b);
        FILE = messagesGetHistoryExtendedFilterDto3;
        MessagesGetHistoryExtendedFilterDto messagesGetHistoryExtendedFilterDto4 = new MessagesGetHistoryExtendedFilterDto("LINK", 3, "link");
        LINK = messagesGetHistoryExtendedFilterDto4;
        MessagesGetHistoryExtendedFilterDto messagesGetHistoryExtendedFilterDto5 = new MessagesGetHistoryExtendedFilterDto("MEDIA_VIEWER", 4, "media_viewer");
        MEDIA_VIEWER = messagesGetHistoryExtendedFilterDto5;
        MessagesGetHistoryExtendedFilterDto messagesGetHistoryExtendedFilterDto6 = new MessagesGetHistoryExtendedFilterDto("PHOTO", 5, "photo");
        PHOTO = messagesGetHistoryExtendedFilterDto6;
        MessagesGetHistoryExtendedFilterDto messagesGetHistoryExtendedFilterDto7 = new MessagesGetHistoryExtendedFilterDto("PINNED_MESSAGES", 6, "pinned_messages");
        PINNED_MESSAGES = messagesGetHistoryExtendedFilterDto7;
        MessagesGetHistoryExtendedFilterDto messagesGetHistoryExtendedFilterDto8 = new MessagesGetHistoryExtendedFilterDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 7, "video");
        VIDEO = messagesGetHistoryExtendedFilterDto8;
        MessagesGetHistoryExtendedFilterDto[] messagesGetHistoryExtendedFilterDtoArr = {messagesGetHistoryExtendedFilterDto, messagesGetHistoryExtendedFilterDto2, messagesGetHistoryExtendedFilterDto3, messagesGetHistoryExtendedFilterDto4, messagesGetHistoryExtendedFilterDto5, messagesGetHistoryExtendedFilterDto6, messagesGetHistoryExtendedFilterDto7, messagesGetHistoryExtendedFilterDto8};
        $VALUES = messagesGetHistoryExtendedFilterDtoArr;
        $ENTRIES = new asp(messagesGetHistoryExtendedFilterDtoArr);
        CREATOR = new a();
    }

    private MessagesGetHistoryExtendedFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetHistoryExtendedFilterDto valueOf(String str) {
        return (MessagesGetHistoryExtendedFilterDto) Enum.valueOf(MessagesGetHistoryExtendedFilterDto.class, str);
    }

    public static MessagesGetHistoryExtendedFilterDto[] values() {
        return (MessagesGetHistoryExtendedFilterDto[]) $VALUES.clone();
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
