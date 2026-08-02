package com.vk.api.generated.topshelf.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: TopshelfTopshelfMetaDto.kt */
/* loaded from: classes15.dex */
public final class TopshelfTopshelfMetaDto implements Parcelable {
    public static final Parcelable.Creator<TopshelfTopshelfMetaDto> CREATOR = new a();

    @pmi0("age_rating")
    private final String ageRating;

    @pmi0("genres")
    private final List<String> genres;

    @pmi0("year")
    private final Integer year;

    /* compiled from: TopshelfTopshelfMetaDto.kt */
    public static final class a implements Parcelable.Creator<TopshelfTopshelfMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfMetaDto createFromParcel(Parcel parcel) {
            return new TopshelfTopshelfMetaDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfMetaDto[] newArray(int i) {
            return new TopshelfTopshelfMetaDto[i];
        }
    }

    public TopshelfTopshelfMetaDto() {
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
        if (!(obj instanceof TopshelfTopshelfMetaDto)) {
            return false;
        }
        TopshelfTopshelfMetaDto topshelfTopshelfMetaDto = (TopshelfTopshelfMetaDto) obj;
        return epx.f(this.year, topshelfTopshelfMetaDto.year) && epx.f(this.genres, topshelfTopshelfMetaDto.genres) && epx.f(this.ageRating, topshelfTopshelfMetaDto.ageRating);
    }

    public final int hashCode() {
        Integer num = this.year;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.genres;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.ageRating;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfTopshelfMetaDto(year=");
        sb.append(this.year);
        sb.append(", genres=");
        sb.append(this.genres);
        sb.append(", ageRating=");
        return ho8.a(sb, this.ageRating, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.year;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeStringList(this.genres);
        parcel.writeString(this.ageRating);
    }

    public TopshelfTopshelfMetaDto(Integer num, List<String> list, String str) {
        this.year = num;
        this.genres = list;
        this.ageRating = str;
    }

    public /* synthetic */ TopshelfTopshelfMetaDto(Integer num, List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str);
    }
}
