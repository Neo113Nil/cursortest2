package com.vk.api.generated.storiesIdeas.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: StoriesIdeasCategoryDto.kt */
/* loaded from: classes15.dex */
public final class StoriesIdeasCategoryDto implements Parcelable {
    public static final Parcelable.Creator<StoriesIdeasCategoryDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("rate")
    private final Float rate;

    @pmi0("sub_names")
    private final List<String> subNames;

    @pmi0("vector")
    private final List<String> vector;

    /* compiled from: StoriesIdeasCategoryDto.kt */
    public static final class a implements Parcelable.Creator<StoriesIdeasCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasCategoryDto createFromParcel(Parcel parcel) {
            return new StoriesIdeasCategoryDto(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasCategoryDto[] newArray(int i) {
            return new StoriesIdeasCategoryDto[i];
        }
    }

    public StoriesIdeasCategoryDto(String str, List<String> list, List<String> list2, Float f) {
        this.name = str;
        this.vector = list;
        this.subNames = list2;
        this.rate = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesIdeasCategoryDto)) {
            return false;
        }
        StoriesIdeasCategoryDto storiesIdeasCategoryDto = (StoriesIdeasCategoryDto) obj;
        return epx.f(this.name, storiesIdeasCategoryDto.name) && epx.f(this.vector, storiesIdeasCategoryDto.vector) && epx.f(this.subNames, storiesIdeasCategoryDto.subNames) && epx.f(this.rate, storiesIdeasCategoryDto.rate);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        List<String> list = this.vector;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.subNames;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Float f = this.rate;
        return hashCode3 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesIdeasCategoryDto(name=");
        sb.append(this.name);
        sb.append(", vector=");
        sb.append(this.vector);
        sb.append(", subNames=");
        sb.append(this.subNames);
        sb.append(", rate=");
        return so.b(sb, this.rate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeStringList(this.vector);
        parcel.writeStringList(this.subNames);
        Float f = this.rate;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
    }

    public /* synthetic */ StoriesIdeasCategoryDto(String str, List list, List list2, Float f, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : f);
    }
}
