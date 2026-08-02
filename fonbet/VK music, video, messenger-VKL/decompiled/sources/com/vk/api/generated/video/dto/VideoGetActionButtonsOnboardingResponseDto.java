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

/* compiled from: VideoGetActionButtonsOnboardingResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetActionButtonsOnboardingResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetActionButtonsOnboardingResponseDto> CREATOR = new a();

    @pmi0("slides")
    private final List<VideoActionButtonsOnboardingSlideDto> slides;

    @pmi0("test_group")
    private final String testGroup;

    /* compiled from: VideoGetActionButtonsOnboardingResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetActionButtonsOnboardingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetActionButtonsOnboardingResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoActionButtonsOnboardingSlideDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoGetActionButtonsOnboardingResponseDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetActionButtonsOnboardingResponseDto[] newArray(int i) {
            return new VideoGetActionButtonsOnboardingResponseDto[i];
        }
    }

    public VideoGetActionButtonsOnboardingResponseDto(String str, List<VideoActionButtonsOnboardingSlideDto> list) {
        this.testGroup = str;
        this.slides = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetActionButtonsOnboardingResponseDto)) {
            return false;
        }
        VideoGetActionButtonsOnboardingResponseDto videoGetActionButtonsOnboardingResponseDto = (VideoGetActionButtonsOnboardingResponseDto) obj;
        return epx.f(this.testGroup, videoGetActionButtonsOnboardingResponseDto.testGroup) && epx.f(this.slides, videoGetActionButtonsOnboardingResponseDto.slides);
    }

    public final int hashCode() {
        int hashCode = this.testGroup.hashCode() * 31;
        List<VideoActionButtonsOnboardingSlideDto> list = this.slides;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetActionButtonsOnboardingResponseDto(testGroup=");
        sb.append(this.testGroup);
        sb.append(", slides=");
        return ms9.a(')', sb, this.slides);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.testGroup);
        List<VideoActionButtonsOnboardingSlideDto> list = this.slides;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoActionButtonsOnboardingSlideDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoGetActionButtonsOnboardingResponseDto(String str, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
