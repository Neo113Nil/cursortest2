package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetInteractiveVideoInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetInteractiveVideoInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetInteractiveVideoInfoResponseDto> CREATOR = new a();

    @pmi0("chapters")
    private final List<VideoInteractiveVideoChapterInfoDto> chapters;

    @pmi0("history")
    private final List<Integer> history;

    /* compiled from: VideoGetInteractiveVideoInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetInteractiveVideoInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetInteractiveVideoInfoResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(VideoInteractiveVideoChapterInfoDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = pm0.b(parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new VideoGetInteractiveVideoInfoResponseDto(arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetInteractiveVideoInfoResponseDto[] newArray(int i) {
            return new VideoGetInteractiveVideoInfoResponseDto[i];
        }
    }

    public VideoGetInteractiveVideoInfoResponseDto(List<VideoInteractiveVideoChapterInfoDto> list, List<Integer> list2) {
        this.chapters = list;
        this.history = list2;
    }

    public final List<VideoInteractiveVideoChapterInfoDto> d() {
        return this.chapters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Integer> e() {
        return this.history;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetInteractiveVideoInfoResponseDto)) {
            return false;
        }
        VideoGetInteractiveVideoInfoResponseDto videoGetInteractiveVideoInfoResponseDto = (VideoGetInteractiveVideoInfoResponseDto) obj;
        return epx.f(this.chapters, videoGetInteractiveVideoInfoResponseDto.chapters) && epx.f(this.history, videoGetInteractiveVideoInfoResponseDto.history);
    }

    public final int hashCode() {
        int hashCode = this.chapters.hashCode() * 31;
        List<Integer> list = this.history;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetInteractiveVideoInfoResponseDto(chapters=");
        sb.append(this.chapters);
        sb.append(", history=");
        return ms9.a(')', sb, this.history);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.chapters);
        while (a2.hasNext()) {
            ((VideoInteractiveVideoChapterInfoDto) a2.next()).writeToParcel(parcel, i);
        }
        List<Integer> list = this.history;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public /* synthetic */ VideoGetInteractiveVideoInfoResponseDto(List list, List list2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
