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

/* compiled from: VideoVideoAdsSportSectionsDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsSportSectionsDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsSportSectionsDto> CREATOR = new a();

    @pmi0("overlay")
    private final List<VideoVideoAdsSportSectionDto> overlay;

    /* compiled from: VideoVideoAdsSportSectionsDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsSportSectionsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsSportSectionsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoVideoAdsSportSectionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoVideoAdsSportSectionsDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsSportSectionsDto[] newArray(int i) {
            return new VideoVideoAdsSportSectionsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoVideoAdsSportSectionsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<VideoVideoAdsSportSectionDto> d() {
        return this.overlay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoVideoAdsSportSectionsDto) && epx.f(this.overlay, ((VideoVideoAdsSportSectionsDto) obj).overlay);
    }

    public final int hashCode() {
        List<VideoVideoAdsSportSectionDto> list = this.overlay;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoVideoAdsSportSectionsDto(overlay="), this.overlay);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoVideoAdsSportSectionDto> list = this.overlay;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoVideoAdsSportSectionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public VideoVideoAdsSportSectionsDto(List<VideoVideoAdsSportSectionDto> list) {
        this.overlay = list;
    }

    public /* synthetic */ VideoVideoAdsSportSectionsDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
