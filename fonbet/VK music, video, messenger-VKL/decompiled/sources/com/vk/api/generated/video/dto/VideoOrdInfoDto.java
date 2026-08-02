package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VideoOrdInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoOrdInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoOrdInfoDto> CREATOR = new a();

    @pmi0("advertisers")
    private final List<VideoOrdInfoAdvertiserDto> advertisers;

    @pmi0("is_ads")
    private final Boolean isAds;

    @pmi0("moderated")
    private final Boolean moderated;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoOrdInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoOrdInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoOrdInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoOrdInfoAdvertiserDto.CREATOR, parcel, arrayList, i, 1);
            }
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoOrdInfoDto(readString, arrayList, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoOrdInfoDto[] newArray(int i) {
            return new VideoOrdInfoDto[i];
        }
    }

    public VideoOrdInfoDto(String str, List<VideoOrdInfoAdvertiserDto> list, Boolean bool, Boolean bool2) {
        this.title = str;
        this.advertisers = list;
        this.moderated = bool;
        this.isAds = bool2;
    }

    public final List<VideoOrdInfoAdvertiserDto> d() {
        return this.advertisers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoOrdInfoDto)) {
            return false;
        }
        VideoOrdInfoDto videoOrdInfoDto = (VideoOrdInfoDto) obj;
        return epx.f(this.title, videoOrdInfoDto.title) && epx.f(this.advertisers, videoOrdInfoDto.advertisers) && epx.f(this.moderated, videoOrdInfoDto.moderated) && epx.f(this.isAds, videoOrdInfoDto.isAds);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.title.hashCode() * 31, 31, this.advertisers);
        Boolean bool = this.moderated;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAds;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoOrdInfoDto(title=");
        sb.append(this.title);
        sb.append(", advertisers=");
        sb.append(this.advertisers);
        sb.append(", moderated=");
        sb.append(this.moderated);
        sb.append(", isAds=");
        return tn.a(sb, this.isAds, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.advertisers);
        while (a2.hasNext()) {
            ((VideoOrdInfoAdvertiserDto) a2.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.moderated;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isAds;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ VideoOrdInfoDto(String str, List list, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2);
    }
}
