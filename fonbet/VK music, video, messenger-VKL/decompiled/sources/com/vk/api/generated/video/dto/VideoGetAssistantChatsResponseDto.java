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

/* compiled from: VideoGetAssistantChatsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetAssistantChatsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetAssistantChatsResponseDto> CREATOR = new a();

    @pmi0("chats")
    private final List<VideoAiAssistantChatDto> chats;

    @pmi0("next_page_token")
    private final String nextPageToken;

    /* compiled from: VideoGetAssistantChatsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetAssistantChatsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantChatsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoAiAssistantChatDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoGetAssistantChatsResponseDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantChatsResponseDto[] newArray(int i) {
            return new VideoGetAssistantChatsResponseDto[i];
        }
    }

    public VideoGetAssistantChatsResponseDto(List<VideoAiAssistantChatDto> list, String str) {
        this.chats = list;
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
        if (!(obj instanceof VideoGetAssistantChatsResponseDto)) {
            return false;
        }
        VideoGetAssistantChatsResponseDto videoGetAssistantChatsResponseDto = (VideoGetAssistantChatsResponseDto) obj;
        return epx.f(this.chats, videoGetAssistantChatsResponseDto.chats) && epx.f(this.nextPageToken, videoGetAssistantChatsResponseDto.nextPageToken);
    }

    public final int hashCode() {
        return this.nextPageToken.hashCode() + (this.chats.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetAssistantChatsResponseDto(chats=");
        sb.append(this.chats);
        sb.append(", nextPageToken=");
        return ho8.a(sb, this.nextPageToken, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.chats);
        while (a2.hasNext()) {
            ((VideoAiAssistantChatDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextPageToken);
    }
}
