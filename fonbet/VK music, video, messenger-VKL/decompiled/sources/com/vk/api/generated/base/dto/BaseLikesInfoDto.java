package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.wp;
import xsna.zcl;

/* compiled from: BaseLikesInfoDto.kt */
/* loaded from: classes14.dex */
public final class BaseLikesInfoDto implements Parcelable {
    public static final Parcelable.Creator<BaseLikesInfoDto> CREATOR = new a();

    @pmi0("author_liked")
    private final Boolean authorLiked;

    @pmi0("can_like")
    private final BaseBoolIntDto canLike;

    @pmi0("can_like_as_author")
    private final BaseBoolIntDto canLikeAsAuthor;

    @pmi0("can_like_by_group")
    private final BaseBoolIntDto canLikeByGroup;

    @pmi0("can_publish")
    private final BaseBoolIntDto canPublish;

    @pmi0("count")
    private final int count;

    @pmi0("group_liked")
    private final Boolean groupLiked;

    @pmi0("repost_disabled")
    private final Boolean repostDisabled;

    @pmi0("user_likes")
    private final BaseBoolIntDto userLikes;

    /* compiled from: BaseLikesInfoDto.kt */
    public static final class a implements Parcelable.Creator<BaseLikesInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLikesInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(BaseLikesInfoDto.class.getClassLoader());
            int readInt = parcel.readInt();
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(BaseLikesInfoDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(BaseLikesInfoDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(BaseLikesInfoDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(BaseLikesInfoDto.class.getClassLoader());
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BaseLikesInfoDto(baseBoolIntDto, readInt, baseBoolIntDto2, baseBoolIntDto3, baseBoolIntDto4, baseBoolIntDto5, valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLikesInfoDto[] newArray(int i) {
            return new BaseLikesInfoDto[i];
        }
    }

    public BaseLikesInfoDto(BaseBoolIntDto baseBoolIntDto, int i, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, Boolean bool, Boolean bool2, Boolean bool3) {
        this.canLike = baseBoolIntDto;
        this.count = i;
        this.userLikes = baseBoolIntDto2;
        this.canPublish = baseBoolIntDto3;
        this.canLikeAsAuthor = baseBoolIntDto4;
        this.canLikeByGroup = baseBoolIntDto5;
        this.authorLiked = bool;
        this.groupLiked = bool2;
        this.repostDisabled = bool3;
    }

    public final Boolean d() {
        return this.authorLiked;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.canLike;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLikesInfoDto)) {
            return false;
        }
        BaseLikesInfoDto baseLikesInfoDto = (BaseLikesInfoDto) obj;
        return this.canLike == baseLikesInfoDto.canLike && this.count == baseLikesInfoDto.count && this.userLikes == baseLikesInfoDto.userLikes && this.canPublish == baseLikesInfoDto.canPublish && this.canLikeAsAuthor == baseLikesInfoDto.canLikeAsAuthor && this.canLikeByGroup == baseLikesInfoDto.canLikeByGroup && epx.f(this.authorLiked, baseLikesInfoDto.authorLiked) && epx.f(this.groupLiked, baseLikesInfoDto.groupLiked) && epx.f(this.repostDisabled, baseLikesInfoDto.repostDisabled);
    }

    public final BaseBoolIntDto f() {
        return this.canPublish;
    }

    public final Boolean g() {
        return this.repostDisabled;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int b = wp.b(this.userLikes, shy.a(this.count, this.canLike.hashCode() * 31, 31), 31);
        BaseBoolIntDto baseBoolIntDto = this.canPublish;
        int hashCode = (b + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canLikeAsAuthor;
        int hashCode2 = (hashCode + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canLikeByGroup;
        int hashCode3 = (hashCode2 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Boolean bool = this.authorLiked;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.groupLiked;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.repostDisabled;
        return hashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final BaseBoolIntDto i() {
        return this.userLikes;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLikesInfoDto(canLike=");
        sb.append(this.canLike);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", userLikes=");
        sb.append(this.userLikes);
        sb.append(", canPublish=");
        sb.append(this.canPublish);
        sb.append(", canLikeAsAuthor=");
        sb.append(this.canLikeAsAuthor);
        sb.append(", canLikeByGroup=");
        sb.append(this.canLikeByGroup);
        sb.append(", authorLiked=");
        sb.append(this.authorLiked);
        sb.append(", groupLiked=");
        sb.append(this.groupLiked);
        sb.append(", repostDisabled=");
        return tn.a(sb, this.repostDisabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.canLike, i);
        parcel.writeInt(this.count);
        parcel.writeParcelable(this.userLikes, i);
        parcel.writeParcelable(this.canPublish, i);
        parcel.writeParcelable(this.canLikeAsAuthor, i);
        parcel.writeParcelable(this.canLikeByGroup, i);
        Boolean bool = this.authorLiked;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.groupLiked;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.repostDisabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ BaseLikesInfoDto(BaseBoolIntDto baseBoolIntDto, int i, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, Boolean bool, Boolean bool2, Boolean bool3, int i2, zcl zclVar) {
        this(baseBoolIntDto, i, baseBoolIntDto2, (i2 & 8) != 0 ? null : baseBoolIntDto3, (i2 & 16) != 0 ? null : baseBoolIntDto4, (i2 & 32) != 0 ? null : baseBoolIntDto5, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : bool3);
    }
}
