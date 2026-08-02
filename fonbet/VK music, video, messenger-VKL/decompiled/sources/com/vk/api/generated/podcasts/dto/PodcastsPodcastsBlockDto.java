package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PodcastsPodcastsBlockDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsPodcastsBlockDto implements Parcelable {
    public static final Parcelable.Creator<PodcastsPodcastsBlockDto> CREATOR = new a();

    @pmi0("display_type")
    private final PodcastsBlockDisplayTypeDto displayType;

    @pmi0("next_offset")
    private final Integer nextOffset;

    @pmi0("podcasts")
    private final List<PodcastsBlockPodcastDto> podcasts;

    @pmi0("source")
    private final String source;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* compiled from: PodcastsPodcastsBlockDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsPodcastsBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsPodcastsBlockDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(PodcastsBlockPodcastDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new PodcastsPodcastsBlockDto(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), PodcastsBlockDisplayTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsPodcastsBlockDto[] newArray(int i) {
            return new PodcastsPodcastsBlockDto[i];
        }
    }

    public PodcastsPodcastsBlockDto(List<PodcastsBlockPodcastDto> list, String str, String str2, String str3, String str4, PodcastsBlockDisplayTypeDto podcastsBlockDisplayTypeDto, Integer num) {
        this.podcasts = list;
        this.title = str;
        this.subtitle = str2;
        this.type = str3;
        this.source = str4;
        this.displayType = podcastsBlockDisplayTypeDto;
        this.nextOffset = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastsPodcastsBlockDto)) {
            return false;
        }
        PodcastsPodcastsBlockDto podcastsPodcastsBlockDto = (PodcastsPodcastsBlockDto) obj;
        return epx.f(this.podcasts, podcastsPodcastsBlockDto.podcasts) && epx.f(this.title, podcastsPodcastsBlockDto.title) && epx.f(this.subtitle, podcastsPodcastsBlockDto.subtitle) && epx.f(this.type, podcastsPodcastsBlockDto.type) && epx.f(this.source, podcastsPodcastsBlockDto.source) && this.displayType == podcastsPodcastsBlockDto.displayType && epx.f(this.nextOffset, podcastsPodcastsBlockDto.nextOffset);
    }

    public final int hashCode() {
        int hashCode = (this.displayType.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(this.podcasts.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.type), 31, this.source)) * 31;
        Integer num = this.nextOffset;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastsPodcastsBlockDto(podcasts=");
        sb.append(this.podcasts);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", displayType=");
        sb.append(this.displayType);
        sb.append(", nextOffset=");
        return uqi.b(sb, this.nextOffset, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.podcasts);
        while (a2.hasNext()) {
            ((PodcastsBlockPodcastDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.type);
        parcel.writeString(this.source);
        this.displayType.writeToParcel(parcel, i);
        Integer num = this.nextOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ PodcastsPodcastsBlockDto(List list, String str, String str2, String str3, String str4, PodcastsBlockDisplayTypeDto podcastsBlockDisplayTypeDto, Integer num, int i, zcl zclVar) {
        this(list, str, str2, str3, str4, podcastsBlockDisplayTypeDto, (i & 64) != 0 ? null : num);
    }
}
