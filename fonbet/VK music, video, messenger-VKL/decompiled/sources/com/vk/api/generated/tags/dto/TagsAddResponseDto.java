package com.vk.api.generated.tags.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: TagsAddResponseDto.kt */
/* loaded from: classes15.dex */
public final class TagsAddResponseDto implements Parcelable {
    public static final Parcelable.Creator<TagsAddResponseDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    /* compiled from: TagsAddResponseDto.kt */
    public static final class a implements Parcelable.Creator<TagsAddResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final TagsAddResponseDto createFromParcel(Parcel parcel) {
            return new TagsAddResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final TagsAddResponseDto[] newArray(int i) {
            return new TagsAddResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TagsAddResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TagsAddResponseDto) && epx.f(this.id, ((TagsAddResponseDto) obj).id);
    }

    public final int hashCode() {
        Integer num = this.id;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("TagsAddResponseDto(id="), this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public TagsAddResponseDto(Integer num) {
        this.id = num;
    }

    public /* synthetic */ TagsAddResponseDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
