package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: VideoPrivacySectionDto.kt */
/* loaded from: classes15.dex */
public final class VideoPrivacySectionDto implements Parcelable {
    public static final Parcelable.Creator<VideoPrivacySectionDto> CREATOR = new a();

    @pmi0("comment")
    private final List<VideoPrivacyDto> comment;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
    private final List<VideoPrivacyDto> view;

    /* compiled from: VideoPrivacySectionDto.kt */
    public static final class a implements Parcelable.Creator<VideoPrivacySectionDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoPrivacySectionDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(VideoPrivacyDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(VideoPrivacyDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new VideoPrivacySectionDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPrivacySectionDto[] newArray(int i) {
            return new VideoPrivacySectionDto[i];
        }
    }

    public VideoPrivacySectionDto(List<VideoPrivacyDto> list, List<VideoPrivacyDto> list2) {
        this.view = list;
        this.comment = list2;
    }

    public final List<VideoPrivacyDto> d() {
        return this.comment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<VideoPrivacyDto> e() {
        return this.view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPrivacySectionDto)) {
            return false;
        }
        VideoPrivacySectionDto videoPrivacySectionDto = (VideoPrivacySectionDto) obj;
        return epx.f(this.view, videoPrivacySectionDto.view) && epx.f(this.comment, videoPrivacySectionDto.comment);
    }

    public final int hashCode() {
        return this.comment.hashCode() + (this.view.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPrivacySectionDto(view=");
        sb.append(this.view);
        sb.append(", comment=");
        return ms9.a(')', sb, this.comment);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.view);
        while (a2.hasNext()) {
            ((VideoPrivacyDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.comment);
        while (a3.hasNext()) {
            ((VideoPrivacyDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
