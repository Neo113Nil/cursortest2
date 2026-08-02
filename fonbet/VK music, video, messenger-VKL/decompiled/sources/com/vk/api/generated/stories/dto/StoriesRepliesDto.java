package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoriesRepliesDto.kt */
/* loaded from: classes15.dex */
public final class StoriesRepliesDto implements Parcelable {
    public static final Parcelable.Creator<StoriesRepliesDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    /* renamed from: new, reason: not valid java name */
    @pmi0("new")
    private final Integer f25new;

    /* compiled from: StoriesRepliesDto.kt */
    public static final class a implements Parcelable.Creator<StoriesRepliesDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesRepliesDto createFromParcel(Parcel parcel) {
            return new StoriesRepliesDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesRepliesDto[] newArray(int i) {
            return new StoriesRepliesDto[i];
        }
    }

    public StoriesRepliesDto(int i, Integer num) {
        this.count = i;
        this.f25new = num;
    }

    public final Integer d() {
        return this.f25new;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesRepliesDto)) {
            return false;
        }
        StoriesRepliesDto storiesRepliesDto = (StoriesRepliesDto) obj;
        return this.count == storiesRepliesDto.count && epx.f(this.f25new, storiesRepliesDto.f25new);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        Integer num = this.f25new;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesRepliesDto(count=");
        sb.append(this.count);
        sb.append(", new=");
        return uqi.b(sb, this.f25new, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Integer num = this.f25new;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ StoriesRepliesDto(int i, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
