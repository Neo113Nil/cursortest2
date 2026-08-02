package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ShortVideoShortVideoEngagementDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoEngagementDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoEngagementDto> CREATOR = new a();

    @pmi0("comment_count")
    private final Integer commentCount;

    @pmi0("is_anon_liked")
    private final Boolean isAnonLiked;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_liked")
    private final Boolean isLiked;

    @pmi0("is_reposted")
    private final Boolean isReposted;

    @pmi0("is_subscribed")
    private final Boolean isSubscribed;

    @pmi0("like_count")
    private final Integer likeCount;

    @pmi0("repost_count")
    private final Integer repostCount;

    @pmi0("view_count")
    private final Integer viewCount;

    /* compiled from: ShortVideoShortVideoEngagementDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoEngagementDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoEngagementDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean bool = null;
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoShortVideoEngagementDto(valueOf5, valueOf6, valueOf7, valueOf8, valueOf, valueOf2, valueOf3, valueOf4, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoEngagementDto[] newArray(int i) {
            return new ShortVideoShortVideoEngagementDto[i];
        }
    }

    public ShortVideoShortVideoEngagementDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final Integer d() {
        return this.commentCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.likeCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoEngagementDto)) {
            return false;
        }
        ShortVideoShortVideoEngagementDto shortVideoShortVideoEngagementDto = (ShortVideoShortVideoEngagementDto) obj;
        return epx.f(this.viewCount, shortVideoShortVideoEngagementDto.viewCount) && epx.f(this.commentCount, shortVideoShortVideoEngagementDto.commentCount) && epx.f(this.likeCount, shortVideoShortVideoEngagementDto.likeCount) && epx.f(this.repostCount, shortVideoShortVideoEngagementDto.repostCount) && epx.f(this.isFavorite, shortVideoShortVideoEngagementDto.isFavorite) && epx.f(this.isLiked, shortVideoShortVideoEngagementDto.isLiked) && epx.f(this.isAnonLiked, shortVideoShortVideoEngagementDto.isAnonLiked) && epx.f(this.isReposted, shortVideoShortVideoEngagementDto.isReposted) && epx.f(this.isSubscribed, shortVideoShortVideoEngagementDto.isSubscribed);
    }

    public final Integer f() {
        return this.repostCount;
    }

    public final Integer g() {
        return this.viewCount;
    }

    public final int hashCode() {
        Integer num = this.viewCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.commentCount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.likeCount;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.repostCount;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isLiked;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAnonLiked;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isReposted;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isSubscribed;
        return hashCode8 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isAnonLiked;
    }

    public final Boolean j() {
        return this.isFavorite;
    }

    public final Boolean k() {
        return this.isLiked;
    }

    public final Boolean l() {
        return this.isReposted;
    }

    public final Boolean n() {
        return this.isSubscribed;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoEngagementDto(viewCount=");
        sb.append(this.viewCount);
        sb.append(", commentCount=");
        sb.append(this.commentCount);
        sb.append(", likeCount=");
        sb.append(this.likeCount);
        sb.append(", repostCount=");
        sb.append(this.repostCount);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", isLiked=");
        sb.append(this.isLiked);
        sb.append(", isAnonLiked=");
        sb.append(this.isAnonLiked);
        sb.append(", isReposted=");
        sb.append(this.isReposted);
        sb.append(", isSubscribed=");
        return tn.a(sb, this.isSubscribed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.viewCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.commentCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.likeCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.repostCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Boolean bool = this.isFavorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isLiked;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isAnonLiked;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isReposted;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isSubscribed;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
    }

    public ShortVideoShortVideoEngagementDto(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.viewCount = num;
        this.commentCount = num2;
        this.likeCount = num3;
        this.repostCount = num4;
        this.isFavorite = bool;
        this.isLiked = bool2;
        this.isAnonLiked = bool3;
        this.isReposted = bool4;
        this.isSubscribed = bool5;
    }

    public /* synthetic */ ShortVideoShortVideoEngagementDto(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? null : bool5);
    }
}
