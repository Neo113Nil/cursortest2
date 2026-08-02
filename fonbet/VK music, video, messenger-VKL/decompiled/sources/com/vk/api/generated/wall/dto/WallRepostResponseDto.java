package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesObjectInfoDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: WallRepostResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallRepostResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallRepostResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final BadgesObjectInfoDto badges;

    @pmi0("likes_count")
    private final int likesCount;

    @pmi0("mail_repost_count")
    private final Integer mailRepostCount;

    @pmi0("post_id")
    private final int postId;

    @pmi0("reactions")
    private final LikesItemReactionsDto reactions;

    @pmi0("reposts_count")
    private final int repostsCount;

    @pmi0("success")
    private final int success;

    @pmi0("wall_repost_count")
    private final Integer wallRepostCount;

    /* compiled from: WallRepostResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallRepostResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallRepostResponseDto createFromParcel(Parcel parcel) {
            return new WallRepostResponseDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (LikesItemReactionsDto) parcel.readParcelable(WallRepostResponseDto.class.getClassLoader()), parcel.readInt() != 0 ? BadgesObjectInfoDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallRepostResponseDto[] newArray(int i) {
            return new WallRepostResponseDto[i];
        }
    }

    public WallRepostResponseDto(int i, int i2, int i3, int i4, Integer num, Integer num2, LikesItemReactionsDto likesItemReactionsDto, BadgesObjectInfoDto badgesObjectInfoDto) {
        this.success = i;
        this.postId = i2;
        this.repostsCount = i3;
        this.likesCount = i4;
        this.wallRepostCount = num;
        this.mailRepostCount = num2;
        this.reactions = likesItemReactionsDto;
        this.badges = badgesObjectInfoDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallRepostResponseDto)) {
            return false;
        }
        WallRepostResponseDto wallRepostResponseDto = (WallRepostResponseDto) obj;
        return this.success == wallRepostResponseDto.success && this.postId == wallRepostResponseDto.postId && this.repostsCount == wallRepostResponseDto.repostsCount && this.likesCount == wallRepostResponseDto.likesCount && epx.f(this.wallRepostCount, wallRepostResponseDto.wallRepostCount) && epx.f(this.mailRepostCount, wallRepostResponseDto.mailRepostCount) && epx.f(this.reactions, wallRepostResponseDto.reactions) && epx.f(this.badges, wallRepostResponseDto.badges);
    }

    public final int hashCode() {
        int a2 = shy.a(this.likesCount, shy.a(this.repostsCount, shy.a(this.postId, Integer.hashCode(this.success) * 31, 31), 31), 31);
        Integer num = this.wallRepostCount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.mailRepostCount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        LikesItemReactionsDto likesItemReactionsDto = this.reactions;
        int hashCode3 = (hashCode2 + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
        BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
        return hashCode3 + (badgesObjectInfoDto != null ? badgesObjectInfoDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallRepostResponseDto(success=" + this.success + ", postId=" + this.postId + ", repostsCount=" + this.repostsCount + ", likesCount=" + this.likesCount + ", wallRepostCount=" + this.wallRepostCount + ", mailRepostCount=" + this.mailRepostCount + ", reactions=" + this.reactions + ", badges=" + this.badges + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.success);
        parcel.writeInt(this.postId);
        parcel.writeInt(this.repostsCount);
        parcel.writeInt(this.likesCount);
        Integer num = this.wallRepostCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.mailRepostCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.reactions, i);
        BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
        if (badgesObjectInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesObjectInfoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ WallRepostResponseDto(int i, int i2, int i3, int i4, Integer num, Integer num2, LikesItemReactionsDto likesItemReactionsDto, BadgesObjectInfoDto badgesObjectInfoDto, int i5, zcl zclVar) {
        this(i, i2, i3, i4, (i5 & 16) != 0 ? null : num, (i5 & 32) != 0 ? null : num2, (i5 & 64) != 0 ? null : likesItemReactionsDto, (i5 & 128) != 0 ? null : badgesObjectInfoDto);
    }
}
