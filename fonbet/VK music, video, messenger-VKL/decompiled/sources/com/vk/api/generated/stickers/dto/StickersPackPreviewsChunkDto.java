package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickersPackPreviewsChunkDto.kt */
/* loaded from: classes15.dex */
public final class StickersPackPreviewsChunkDto implements Parcelable {
    public static final Parcelable.Creator<StickersPackPreviewsChunkDto> CREATOR = new a();

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("previews")
    private final List<StickersPackPreviewDto> previews;

    /* compiled from: StickersPackPreviewsChunkDto.kt */
    public static final class a implements Parcelable.Creator<StickersPackPreviewsChunkDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersPackPreviewsChunkDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StickersPackPreviewDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StickersPackPreviewsChunkDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersPackPreviewsChunkDto[] newArray(int i) {
            return new StickersPackPreviewsChunkDto[i];
        }
    }

    public StickersPackPreviewsChunkDto(List<StickersPackPreviewDto> list, String str) {
        this.previews = list;
        this.nextFrom = str;
    }

    public final String d() {
        return this.nextFrom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<StickersPackPreviewDto> e() {
        return this.previews;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersPackPreviewsChunkDto)) {
            return false;
        }
        StickersPackPreviewsChunkDto stickersPackPreviewsChunkDto = (StickersPackPreviewsChunkDto) obj;
        return epx.f(this.previews, stickersPackPreviewsChunkDto.previews) && epx.f(this.nextFrom, stickersPackPreviewsChunkDto.nextFrom);
    }

    public final int hashCode() {
        int hashCode = this.previews.hashCode() * 31;
        String str = this.nextFrom;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersPackPreviewsChunkDto(previews=");
        sb.append(this.previews);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.previews);
        while (a2.hasNext()) {
            ((StickersPackPreviewDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ StickersPackPreviewsChunkDto(List list, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
