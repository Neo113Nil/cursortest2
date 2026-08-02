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
/* compiled from: MessagesSetActivityTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSetActivityTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesSetActivityTypeDto[] $VALUES;

    @pmi0("audiomessage")
    public static final MessagesSetActivityTypeDto AUDIOMESSAGE;

    @pmi0("choosing_file")
    public static final MessagesSetActivityTypeDto CHOOSING_FILE;

    @pmi0("choosing_template")
    public static final MessagesSetActivityTypeDto CHOOSING_TEMPLATE;
    public static final Parcelable.Creator<MessagesSetActivityTypeDto> CREATOR;

    @pmi0(X3.i.b)
    public static final MessagesSetActivityTypeDto FILE;

    @pmi0("photo")
    public static final MessagesSetActivityTypeDto PHOTO;

    @pmi0("typing")
    public static final MessagesSetActivityTypeDto TYPING;

    @pmi0("video")
    public static final MessagesSetActivityTypeDto VIDEO;

    @pmi0("videomessage")
    public static final MessagesSetActivityTypeDto VIDEOMESSAGE;
    private final String value;

    /* compiled from: MessagesSetActivityTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSetActivityTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSetActivityTypeDto createFromParcel(Parcel parcel) {
            return MessagesSetActivityTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSetActivityTypeDto[] newArray(int i) {
            return new MessagesSetActivityTypeDto[i];
        }
    }

    static {
        MessagesSetActivityTypeDto messagesSetActivityTypeDto = new MessagesSetActivityTypeDto("AUDIOMESSAGE", 0, "audiomessage");
        AUDIOMESSAGE = messagesSetActivityTypeDto;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto2 = new MessagesSetActivityTypeDto("CHOOSING_FILE", 1, "choosing_file");
        CHOOSING_FILE = messagesSetActivityTypeDto2;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto3 = new MessagesSetActivityTypeDto("CHOOSING_TEMPLATE", 2, "choosing_template");
        CHOOSING_TEMPLATE = messagesSetActivityTypeDto3;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto4 = new MessagesSetActivityTypeDto("FILE", 3, X3.i.b);
        FILE = messagesSetActivityTypeDto4;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto5 = new MessagesSetActivityTypeDto("PHOTO", 4, "photo");
        PHOTO = messagesSetActivityTypeDto5;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto6 = new MessagesSetActivityTypeDto("TYPING", 5, "typing");
        TYPING = messagesSetActivityTypeDto6;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto7 = new MessagesSetActivityTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 6, "video");
        VIDEO = messagesSetActivityTypeDto7;
        MessagesSetActivityTypeDto messagesSetActivityTypeDto8 = new MessagesSetActivityTypeDto("VIDEOMESSAGE", 7, "videomessage");
        VIDEOMESSAGE = messagesSetActivityTypeDto8;
        MessagesSetActivityTypeDto[] messagesSetActivityTypeDtoArr = {messagesSetActivityTypeDto, messagesSetActivityTypeDto2, messagesSetActivityTypeDto3, messagesSetActivityTypeDto4, messagesSetActivityTypeDto5, messagesSetActivityTypeDto6, messagesSetActivityTypeDto7, messagesSetActivityTypeDto8};
        $VALUES = messagesSetActivityTypeDtoArr;
        $ENTRIES = new asp(messagesSetActivityTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesSetActivityTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesSetActivityTypeDto valueOf(String str) {
        return (MessagesSetActivityTypeDto) Enum.valueOf(MessagesSetActivityTypeDto.class, str);
    }

    public static MessagesSetActivityTypeDto[] values() {
        return (MessagesSetActivityTypeDto[]) $VALUES.clone();
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
