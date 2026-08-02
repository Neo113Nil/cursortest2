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

/* compiled from: VideoAiAssistantMessageBlockSuggestionsDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantMessageBlockSuggestionsDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantMessageBlockSuggestionsDto> CREATOR = new a();

    @pmi0("suggestions")
    private final List<VideoAiAssistantMessageBlockSuggestionDto> suggestions;

    /* compiled from: VideoAiAssistantMessageBlockSuggestionsDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantMessageBlockSuggestionsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockSuggestionsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoAiAssistantMessageBlockSuggestionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoAiAssistantMessageBlockSuggestionsDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockSuggestionsDto[] newArray(int i) {
            return new VideoAiAssistantMessageBlockSuggestionsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoAiAssistantMessageBlockSuggestionsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoAiAssistantMessageBlockSuggestionsDto) && epx.f(this.suggestions, ((VideoAiAssistantMessageBlockSuggestionsDto) obj).suggestions);
    }

    public final int hashCode() {
        List<VideoAiAssistantMessageBlockSuggestionDto> list = this.suggestions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoAiAssistantMessageBlockSuggestionsDto(suggestions="), this.suggestions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoAiAssistantMessageBlockSuggestionDto> list = this.suggestions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoAiAssistantMessageBlockSuggestionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public VideoAiAssistantMessageBlockSuggestionsDto(List<VideoAiAssistantMessageBlockSuggestionDto> list) {
        this.suggestions = list;
    }

    public /* synthetic */ VideoAiAssistantMessageBlockSuggestionsDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
