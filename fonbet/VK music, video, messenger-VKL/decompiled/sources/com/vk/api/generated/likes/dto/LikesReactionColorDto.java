package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LikesReactionColorDto.kt */
/* loaded from: classes14.dex */
public final class LikesReactionColorDto implements Parcelable {
    public static final Parcelable.Creator<LikesReactionColorDto> CREATOR = new a();

    @pmi0(L2.g)
    private final LikesReactionThemeColorDto background;

    @pmi0("foreground")
    private final LikesReactionThemeColorDto foreground;

    /* compiled from: LikesReactionColorDto.kt */
    public static final class a implements Parcelable.Creator<LikesReactionColorDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesReactionColorDto createFromParcel(Parcel parcel) {
            return new LikesReactionColorDto(parcel.readInt() == 0 ? null : LikesReactionThemeColorDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LikesReactionThemeColorDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final LikesReactionColorDto[] newArray(int i) {
            return new LikesReactionColorDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LikesReactionColorDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final LikesReactionThemeColorDto d() {
        return this.background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final LikesReactionThemeColorDto e() {
        return this.foreground;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesReactionColorDto)) {
            return false;
        }
        LikesReactionColorDto likesReactionColorDto = (LikesReactionColorDto) obj;
        return epx.f(this.foreground, likesReactionColorDto.foreground) && epx.f(this.background, likesReactionColorDto.background);
    }

    public final int hashCode() {
        LikesReactionThemeColorDto likesReactionThemeColorDto = this.foreground;
        int hashCode = (likesReactionThemeColorDto == null ? 0 : likesReactionThemeColorDto.hashCode()) * 31;
        LikesReactionThemeColorDto likesReactionThemeColorDto2 = this.background;
        return hashCode + (likesReactionThemeColorDto2 != null ? likesReactionThemeColorDto2.hashCode() : 0);
    }

    public final String toString() {
        return "LikesReactionColorDto(foreground=" + this.foreground + ", background=" + this.background + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LikesReactionThemeColorDto likesReactionThemeColorDto = this.foreground;
        if (likesReactionThemeColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            likesReactionThemeColorDto.writeToParcel(parcel, i);
        }
        LikesReactionThemeColorDto likesReactionThemeColorDto2 = this.background;
        if (likesReactionThemeColorDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            likesReactionThemeColorDto2.writeToParcel(parcel, i);
        }
    }

    public LikesReactionColorDto(LikesReactionThemeColorDto likesReactionThemeColorDto, LikesReactionThemeColorDto likesReactionThemeColorDto2) {
        this.foreground = likesReactionThemeColorDto;
        this.background = likesReactionThemeColorDto2;
    }

    public /* synthetic */ LikesReactionColorDto(LikesReactionThemeColorDto likesReactionThemeColorDto, LikesReactionThemeColorDto likesReactionThemeColorDto2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : likesReactionThemeColorDto, (i & 2) != 0 ? null : likesReactionThemeColorDto2);
    }
}
