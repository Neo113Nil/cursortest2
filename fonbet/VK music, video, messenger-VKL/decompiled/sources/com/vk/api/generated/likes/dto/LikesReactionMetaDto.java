package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: LikesReactionMetaDto.kt */
/* loaded from: classes14.dex */
public final class LikesReactionMetaDto implements Parcelable {
    public static final Parcelable.Creator<LikesReactionMetaDto> CREATOR = new a();

    @pmi0("asset")
    private final LikesReactionAssetDto asset;

    @pmi0("id")
    private final int id;

    @pmi0("score")
    private final Integer score;

    @pmi0("title")
    private final String title;

    /* compiled from: LikesReactionMetaDto.kt */
    public static final class a implements Parcelable.Creator<LikesReactionMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesReactionMetaDto createFromParcel(Parcel parcel) {
            return new LikesReactionMetaDto(parcel.readInt(), parcel.readString(), LikesReactionAssetDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final LikesReactionMetaDto[] newArray(int i) {
            return new LikesReactionMetaDto[i];
        }
    }

    public LikesReactionMetaDto(int i, String str, LikesReactionAssetDto likesReactionAssetDto, Integer num) {
        this.id = i;
        this.title = str;
        this.asset = likesReactionAssetDto;
        this.score = num;
    }

    public final LikesReactionAssetDto d() {
        return this.asset;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.score;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesReactionMetaDto)) {
            return false;
        }
        LikesReactionMetaDto likesReactionMetaDto = (LikesReactionMetaDto) obj;
        return this.id == likesReactionMetaDto.id && epx.f(this.title, likesReactionMetaDto.title) && epx.f(this.asset, likesReactionMetaDto.asset) && epx.f(this.score, likesReactionMetaDto.score);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.asset.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.title)) * 31;
        Integer num = this.score;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikesReactionMetaDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", asset=");
        sb.append(this.asset);
        sb.append(", score=");
        return uqi.b(sb, this.score, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        this.asset.writeToParcel(parcel, i);
        Integer num = this.score;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ LikesReactionMetaDto(int i, String str, LikesReactionAssetDto likesReactionAssetDto, Integer num, int i2, zcl zclVar) {
        this(i, str, likesReactionAssetDto, (i2 & 8) != 0 ? null : num);
    }
}
