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

/* compiled from: VideoVideoAdsInstreamSectionsDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsInstreamSectionsDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsInstreamSectionsDto> CREATOR = new a();

    @pmi0("midroll")
    private final List<VideoVideoAdsInstreamSectionDto> midroll;

    @pmi0("postroll")
    private final List<VideoVideoAdsInstreamSectionDto> postroll;

    @pmi0("preroll")
    private final List<VideoVideoAdsInstreamSectionDto> preroll;

    /* compiled from: VideoVideoAdsInstreamSectionsDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsInstreamSectionsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsInstreamSectionsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(VideoVideoAdsInstreamSectionDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(VideoVideoAdsInstreamSectionDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(VideoVideoAdsInstreamSectionDto.CREATOR, parcel, arrayList3, i, 1);
                }
            }
            return new VideoVideoAdsInstreamSectionsDto(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsInstreamSectionsDto[] newArray(int i) {
            return new VideoVideoAdsInstreamSectionsDto[i];
        }
    }

    public VideoVideoAdsInstreamSectionsDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAdsInstreamSectionsDto)) {
            return false;
        }
        VideoVideoAdsInstreamSectionsDto videoVideoAdsInstreamSectionsDto = (VideoVideoAdsInstreamSectionsDto) obj;
        return epx.f(this.preroll, videoVideoAdsInstreamSectionsDto.preroll) && epx.f(this.midroll, videoVideoAdsInstreamSectionsDto.midroll) && epx.f(this.postroll, videoVideoAdsInstreamSectionsDto.postroll);
    }

    public final int hashCode() {
        List<VideoVideoAdsInstreamSectionDto> list = this.preroll;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<VideoVideoAdsInstreamSectionDto> list2 = this.midroll;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<VideoVideoAdsInstreamSectionDto> list3 = this.postroll;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoAdsInstreamSectionsDto(preroll=");
        sb.append(this.preroll);
        sb.append(", midroll=");
        sb.append(this.midroll);
        sb.append(", postroll=");
        return ms9.a(')', sb, this.postroll);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoVideoAdsInstreamSectionDto> list = this.preroll;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((VideoVideoAdsInstreamSectionDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoVideoAdsInstreamSectionDto> list2 = this.midroll;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((VideoVideoAdsInstreamSectionDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoVideoAdsInstreamSectionDto> list3 = this.postroll;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((VideoVideoAdsInstreamSectionDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public VideoVideoAdsInstreamSectionsDto(List<VideoVideoAdsInstreamSectionDto> list, List<VideoVideoAdsInstreamSectionDto> list2, List<VideoVideoAdsInstreamSectionDto> list3) {
        this.preroll = list;
        this.midroll = list2;
        this.postroll = list3;
    }

    public /* synthetic */ VideoVideoAdsInstreamSectionsDto(List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
