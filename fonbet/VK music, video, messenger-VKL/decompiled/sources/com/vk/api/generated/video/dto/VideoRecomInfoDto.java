package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoRecomInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoRecomInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoRecomInfoDto> CREATOR = new a();

    @pmi0("feature_sampling_uuid")
    private final String featureSamplingUuid;

    @pmi0("recom_sources")
    private final List<Integer> recomSources;

    /* compiled from: VideoRecomInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoRecomInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoRecomInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoRecomInfoDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoRecomInfoDto[] newArray(int i) {
            return new VideoRecomInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoRecomInfoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.featureSamplingUuid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Integer> e() {
        return this.recomSources;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoRecomInfoDto)) {
            return false;
        }
        VideoRecomInfoDto videoRecomInfoDto = (VideoRecomInfoDto) obj;
        return epx.f(this.featureSamplingUuid, videoRecomInfoDto.featureSamplingUuid) && epx.f(this.recomSources, videoRecomInfoDto.recomSources);
    }

    public final int hashCode() {
        String str = this.featureSamplingUuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Integer> list = this.recomSources;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRecomInfoDto(featureSamplingUuid=");
        sb.append(this.featureSamplingUuid);
        sb.append(", recomSources=");
        return ms9.a(')', sb, this.recomSources);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.featureSamplingUuid);
        List<Integer> list = this.recomSources;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public VideoRecomInfoDto(String str, List<Integer> list) {
        this.featureSamplingUuid = str;
        this.recomSources = list;
    }

    public /* synthetic */ VideoRecomInfoDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
