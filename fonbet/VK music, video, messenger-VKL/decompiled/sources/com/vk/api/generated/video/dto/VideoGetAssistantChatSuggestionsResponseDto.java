package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetAssistantChatSuggestionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetAssistantChatSuggestionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetAssistantChatSuggestionsResponseDto> CREATOR = new a();

    @pmi0("suggestions")
    private final List<VideoAiAssistantChatSuggestionDto> suggestions;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoGetAssistantChatSuggestionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetAssistantChatSuggestionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantChatSuggestionsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoAiAssistantChatSuggestionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoGetAssistantChatSuggestionsResponseDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantChatSuggestionsResponseDto[] newArray(int i) {
            return new VideoGetAssistantChatSuggestionsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoGetAssistantChatSuggestionsResponseDto() {
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
        if (!(obj instanceof VideoGetAssistantChatSuggestionsResponseDto)) {
            return false;
        }
        VideoGetAssistantChatSuggestionsResponseDto videoGetAssistantChatSuggestionsResponseDto = (VideoGetAssistantChatSuggestionsResponseDto) obj;
        return epx.f(this.title, videoGetAssistantChatSuggestionsResponseDto.title) && epx.f(this.suggestions, videoGetAssistantChatSuggestionsResponseDto.suggestions);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<VideoAiAssistantChatSuggestionDto> list = this.suggestions;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetAssistantChatSuggestionsResponseDto(title=");
        sb.append(this.title);
        sb.append(", suggestions=");
        return ms9.a(')', sb, this.suggestions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<VideoAiAssistantChatSuggestionDto> list = this.suggestions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoAiAssistantChatSuggestionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public VideoGetAssistantChatSuggestionsResponseDto(String str, List<VideoAiAssistantChatSuggestionDto> list) {
        this.title = str;
        this.suggestions = list;
    }

    public /* synthetic */ VideoGetAssistantChatSuggestionsResponseDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
