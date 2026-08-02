package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LikesReactionTitleDto.kt */
/* loaded from: classes14.dex */
public final class LikesReactionTitleDto implements Parcelable {
    public static final Parcelable.Creator<LikesReactionTitleDto> CREATOR = new a();

    @pmi0("color")
    private final LikesReactionColorDto color;

    /* compiled from: LikesReactionTitleDto.kt */
    public static final class a implements Parcelable.Creator<LikesReactionTitleDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesReactionTitleDto createFromParcel(Parcel parcel) {
            return new LikesReactionTitleDto(parcel.readInt() == 0 ? null : LikesReactionColorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final LikesReactionTitleDto[] newArray(int i) {
            return new LikesReactionTitleDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LikesReactionTitleDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final LikesReactionColorDto d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LikesReactionTitleDto) && epx.f(this.color, ((LikesReactionTitleDto) obj).color);
    }

    public final int hashCode() {
        LikesReactionColorDto likesReactionColorDto = this.color;
        if (likesReactionColorDto == null) {
            return 0;
        }
        return likesReactionColorDto.hashCode();
    }

    public final String toString() {
        return "LikesReactionTitleDto(color=" + this.color + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LikesReactionColorDto likesReactionColorDto = this.color;
        if (likesReactionColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            likesReactionColorDto.writeToParcel(parcel, i);
        }
    }

    public LikesReactionTitleDto(LikesReactionColorDto likesReactionColorDto) {
        this.color = likesReactionColorDto;
    }

    public /* synthetic */ LikesReactionTitleDto(LikesReactionColorDto likesReactionColorDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : likesReactionColorDto);
    }
}
