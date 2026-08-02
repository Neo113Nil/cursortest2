package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VideoAiAssistantReactionCategoryDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantReactionCategoryDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantReactionCategoryDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("need_text")
    private final Boolean needText;

    @pmi0("selected")
    private final Boolean selected;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoAiAssistantReactionCategoryDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantReactionCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantReactionCategoryDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoAiAssistantReactionCategoryDto(readString, readString2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantReactionCategoryDto[] newArray(int i) {
            return new VideoAiAssistantReactionCategoryDto[i];
        }
    }

    public VideoAiAssistantReactionCategoryDto(String str, String str2, Boolean bool, Boolean bool2) {
        this.key = str;
        this.title = str2;
        this.needText = bool;
        this.selected = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAiAssistantReactionCategoryDto)) {
            return false;
        }
        VideoAiAssistantReactionCategoryDto videoAiAssistantReactionCategoryDto = (VideoAiAssistantReactionCategoryDto) obj;
        return epx.f(this.key, videoAiAssistantReactionCategoryDto.key) && epx.f(this.title, videoAiAssistantReactionCategoryDto.title) && epx.f(this.needText, videoAiAssistantReactionCategoryDto.needText) && epx.f(this.selected, videoAiAssistantReactionCategoryDto.selected);
    }

    public final int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.needText;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.selected;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAiAssistantReactionCategoryDto(key=");
        sb.append(this.key);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", needText=");
        sb.append(this.needText);
        sb.append(", selected=");
        return tn.a(sb, this.selected, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.title);
        Boolean bool = this.needText;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.selected;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ VideoAiAssistantReactionCategoryDto(String str, String str2, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2);
    }
}
