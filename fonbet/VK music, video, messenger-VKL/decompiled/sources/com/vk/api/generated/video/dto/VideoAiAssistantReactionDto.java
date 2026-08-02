package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoAiAssistantReactionDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantReactionDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantReactionDto> CREATOR = new a();

    @pmi0(HintCategories.PARAM_NAME)
    private final List<VideoAiAssistantReactionCategoryDto> categories;

    @pmi0("state")
    private final StateDto state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAiAssistantReactionDto.kt */
    public static final class StateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;
        public static final Parcelable.Creator<StateDto> CREATOR;

        @pmi0("dislike")
        public static final StateDto DISLIKE;

        @pmi0("like")
        public static final StateDto LIKE;

        @pmi0("unspecified")
        public static final StateDto UNSPECIFIED;
        private final String value;

        /* compiled from: VideoAiAssistantReactionDto.kt */
        public static final class a implements Parcelable.Creator<StateDto> {
            @Override // android.os.Parcelable.Creator
            public final StateDto createFromParcel(Parcel parcel) {
                return StateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StateDto[] newArray(int i) {
                return new StateDto[i];
            }
        }

        static {
            StateDto stateDto = new StateDto("UNSPECIFIED", 0, "unspecified");
            UNSPECIFIED = stateDto;
            StateDto stateDto2 = new StateDto("LIKE", 1, "like");
            LIKE = stateDto2;
            StateDto stateDto3 = new StateDto("DISLIKE", 2, "dislike");
            DISLIKE = stateDto3;
            StateDto[] stateDtoArr = {stateDto, stateDto2, stateDto3};
            $VALUES = stateDtoArr;
            $ENTRIES = new asp(stateDtoArr);
            CREATOR = new a();
        }

        private StateDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
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

    /* compiled from: VideoAiAssistantReactionDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantReactionDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantReactionDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            StateDto createFromParcel = StateDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoAiAssistantReactionCategoryDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoAiAssistantReactionDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantReactionDto[] newArray(int i) {
            return new VideoAiAssistantReactionDto[i];
        }
    }

    public VideoAiAssistantReactionDto(StateDto stateDto, List<VideoAiAssistantReactionCategoryDto> list) {
        this.state = stateDto;
        this.categories = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAiAssistantReactionDto)) {
            return false;
        }
        VideoAiAssistantReactionDto videoAiAssistantReactionDto = (VideoAiAssistantReactionDto) obj;
        return this.state == videoAiAssistantReactionDto.state && epx.f(this.categories, videoAiAssistantReactionDto.categories);
    }

    public final int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        List<VideoAiAssistantReactionCategoryDto> list = this.categories;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAiAssistantReactionDto(state=");
        sb.append(this.state);
        sb.append(", categories=");
        return ms9.a(')', sb, this.categories);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.state.writeToParcel(parcel, i);
        List<VideoAiAssistantReactionCategoryDto> list = this.categories;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoAiAssistantReactionCategoryDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoAiAssistantReactionDto(StateDto stateDto, List list, int i, zcl zclVar) {
        this(stateDto, (i & 2) != 0 ? null : list);
    }
}
