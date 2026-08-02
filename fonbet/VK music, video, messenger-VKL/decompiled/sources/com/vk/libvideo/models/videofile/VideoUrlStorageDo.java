package com.vk.libvideo.models.videofile;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.cjl0;
import xsna.epx;
import xsna.jgp;
import xsna.zcl;

/* compiled from: VideoFilePlaybackDo.kt */
/* loaded from: classes3.dex */
public final class VideoUrlStorageDo implements Parcelable {
    public static final Parcelable.Creator<VideoUrlStorageDo> CREATOR = new a();
    public final Map<String, VideoUrlInfoDo> b;

    /* compiled from: VideoFilePlaybackDo.kt */
    public static final class a implements Parcelable.Creator<VideoUrlStorageDo> {
        @Override // android.os.Parcelable.Creator
        public final VideoUrlStorageDo createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), VideoUrlInfoDo.CREATOR.createFromParcel(parcel));
            }
            return new VideoUrlStorageDo(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoUrlStorageDo[] newArray(int i) {
            return new VideoUrlStorageDo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoUrlStorageDo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, VideoUrlInfoDo> d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoUrlStorageDo) && epx.f(this.b, ((VideoUrlStorageDo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return cjl0.a(new StringBuilder("VideoUrlStorageDo(map="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, VideoUrlInfoDo> map = this.b;
        parcel.writeInt(map.size());
        for (Map.Entry<String, VideoUrlInfoDo> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
    }

    public VideoUrlStorageDo(Map<String, VideoUrlInfoDo> map) {
        this.b = map;
    }

    public /* synthetic */ VideoUrlStorageDo(Map map, int i, zcl zclVar) {
        this((i & 1) != 0 ? jgp.b : map);
    }
}
