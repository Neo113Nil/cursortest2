package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoriesQuestionsDto.kt */
/* loaded from: classes15.dex */
public final class StoriesQuestionsDto implements Parcelable {
    public static final Parcelable.Creator<StoriesQuestionsDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    /* renamed from: new, reason: not valid java name */
    @pmi0("new")
    private final Integer f24new;

    /* compiled from: StoriesQuestionsDto.kt */
    public static final class a implements Parcelable.Creator<StoriesQuestionsDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesQuestionsDto createFromParcel(Parcel parcel) {
            return new StoriesQuestionsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesQuestionsDto[] newArray(int i) {
            return new StoriesQuestionsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoriesQuestionsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.count;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.f24new;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesQuestionsDto)) {
            return false;
        }
        StoriesQuestionsDto storiesQuestionsDto = (StoriesQuestionsDto) obj;
        return epx.f(this.count, storiesQuestionsDto.count) && epx.f(this.f24new, storiesQuestionsDto.f24new);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f24new;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesQuestionsDto(count=");
        sb.append(this.count);
        sb.append(", new=");
        return uqi.b(sb, this.f24new, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.f24new;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public StoriesQuestionsDto(Integer num, Integer num2) {
        this.count = num;
        this.f24new = num2;
    }

    public /* synthetic */ StoriesQuestionsDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
