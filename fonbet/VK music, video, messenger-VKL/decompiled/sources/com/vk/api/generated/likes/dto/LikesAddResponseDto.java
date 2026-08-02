package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: LikesAddResponseDto.kt */
/* loaded from: classes14.dex */
public final class LikesAddResponseDto implements Parcelable {
    public static final Parcelable.Creator<LikesAddResponseDto> CREATOR = new a();

    @pmi0("likes")
    private final int likes;

    @pmi0("reactions")
    private final LikesItemReactionsDto reactions;

    @pmi0("suggest_subscribe")
    private final Boolean suggestSubscribe;

    /* compiled from: LikesAddResponseDto.kt */
    public static final class a implements Parcelable.Creator<LikesAddResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesAddResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            LikesItemReactionsDto likesItemReactionsDto = (LikesItemReactionsDto) parcel.readParcelable(LikesAddResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LikesAddResponseDto(readInt, likesItemReactionsDto, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final LikesAddResponseDto[] newArray(int i) {
            return new LikesAddResponseDto[i];
        }
    }

    public LikesAddResponseDto(int i, LikesItemReactionsDto likesItemReactionsDto, Boolean bool) {
        this.likes = i;
        this.reactions = likesItemReactionsDto;
        this.suggestSubscribe = bool;
    }

    public final LikesItemReactionsDto d() {
        return this.reactions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.suggestSubscribe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesAddResponseDto)) {
            return false;
        }
        LikesAddResponseDto likesAddResponseDto = (LikesAddResponseDto) obj;
        return this.likes == likesAddResponseDto.likes && epx.f(this.reactions, likesAddResponseDto.reactions) && epx.f(this.suggestSubscribe, likesAddResponseDto.suggestSubscribe);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.likes) * 31;
        LikesItemReactionsDto likesItemReactionsDto = this.reactions;
        int hashCode2 = (hashCode + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
        Boolean bool = this.suggestSubscribe;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final int l1() {
        return this.likes;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikesAddResponseDto(likes=");
        sb.append(this.likes);
        sb.append(", reactions=");
        sb.append(this.reactions);
        sb.append(", suggestSubscribe=");
        return tn.a(sb, this.suggestSubscribe, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.likes);
        parcel.writeParcelable(this.reactions, i);
        Boolean bool = this.suggestSubscribe;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ LikesAddResponseDto(int i, LikesItemReactionsDto likesItemReactionsDto, Boolean bool, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : likesItemReactionsDto, (i2 & 4) != 0 ? null : bool);
    }
}
