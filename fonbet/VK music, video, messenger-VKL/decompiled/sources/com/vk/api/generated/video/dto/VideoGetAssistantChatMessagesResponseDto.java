package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoGetAssistantChatMessagesResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetAssistantChatMessagesResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetAssistantChatMessagesResponseDto> CREATOR = new a();

    @pmi0("messages")
    private final List<VideoAiAssistantMessageDto> messages;

    @pmi0("next_page_token")
    private final String nextPageToken;

    /* compiled from: VideoGetAssistantChatMessagesResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetAssistantChatMessagesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantChatMessagesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoAiAssistantMessageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoGetAssistantChatMessagesResponseDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantChatMessagesResponseDto[] newArray(int i) {
            return new VideoGetAssistantChatMessagesResponseDto[i];
        }
    }

    public VideoGetAssistantChatMessagesResponseDto(List<VideoAiAssistantMessageDto> list, String str) {
        this.messages = list;
        this.nextPageToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetAssistantChatMessagesResponseDto)) {
            return false;
        }
        VideoGetAssistantChatMessagesResponseDto videoGetAssistantChatMessagesResponseDto = (VideoGetAssistantChatMessagesResponseDto) obj;
        return epx.f(this.messages, videoGetAssistantChatMessagesResponseDto.messages) && epx.f(this.nextPageToken, videoGetAssistantChatMessagesResponseDto.nextPageToken);
    }

    public final int hashCode() {
        return this.nextPageToken.hashCode() + (this.messages.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetAssistantChatMessagesResponseDto(messages=");
        sb.append(this.messages);
        sb.append(", nextPageToken=");
        return ho8.a(sb, this.nextPageToken, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.messages);
        while (a2.hasNext()) {
            ((VideoAiAssistantMessageDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextPageToken);
    }
}
