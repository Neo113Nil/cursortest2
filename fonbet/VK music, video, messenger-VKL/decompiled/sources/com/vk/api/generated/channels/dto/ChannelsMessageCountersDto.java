package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseCommentsInfoDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.wall.dto.WallViewsDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsMessageCountersDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsMessageCountersDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsMessageCountersDto> CREATOR = new a();

    @pmi0("comments")
    private final BaseCommentsInfoDto comments;

    @pmi0("message_id")
    private final int messageId;

    @pmi0("paid_reactions")
    private final ChannelsMessagesPaidReactionCounterDto paidReactions;

    @pmi0("reactions")
    private final LikesItemReactionsDto reactions;

    @pmi0("reposts")
    private final BaseRepostsInfoDto reposts;

    @pmi0("views")
    private final WallViewsDto views;

    /* compiled from: ChannelsMessageCountersDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsMessageCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsMessageCountersDto createFromParcel(Parcel parcel) {
            return new ChannelsMessageCountersDto(parcel.readInt(), (LikesItemReactionsDto) parcel.readParcelable(ChannelsMessageCountersDto.class.getClassLoader()), parcel.readInt() == 0 ? null : BaseCommentsInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallViewsDto.CREATOR.createFromParcel(parcel), (BaseRepostsInfoDto) parcel.readParcelable(ChannelsMessageCountersDto.class.getClassLoader()), parcel.readInt() != 0 ? ChannelsMessagesPaidReactionCounterDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsMessageCountersDto[] newArray(int i) {
            return new ChannelsMessageCountersDto[i];
        }
    }

    public ChannelsMessageCountersDto(int i, LikesItemReactionsDto likesItemReactionsDto, BaseCommentsInfoDto baseCommentsInfoDto, WallViewsDto wallViewsDto, BaseRepostsInfoDto baseRepostsInfoDto, ChannelsMessagesPaidReactionCounterDto channelsMessagesPaidReactionCounterDto) {
        this.messageId = i;
        this.reactions = likesItemReactionsDto;
        this.comments = baseCommentsInfoDto;
        this.views = wallViewsDto;
        this.reposts = baseRepostsInfoDto;
        this.paidReactions = channelsMessagesPaidReactionCounterDto;
    }

    public final BaseCommentsInfoDto d() {
        return this.comments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.messageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsMessageCountersDto)) {
            return false;
        }
        ChannelsMessageCountersDto channelsMessageCountersDto = (ChannelsMessageCountersDto) obj;
        return this.messageId == channelsMessageCountersDto.messageId && epx.f(this.reactions, channelsMessageCountersDto.reactions) && epx.f(this.comments, channelsMessageCountersDto.comments) && epx.f(this.views, channelsMessageCountersDto.views) && epx.f(this.reposts, channelsMessageCountersDto.reposts) && epx.f(this.paidReactions, channelsMessageCountersDto.paidReactions);
    }

    public final ChannelsMessagesPaidReactionCounterDto f() {
        return this.paidReactions;
    }

    public final LikesItemReactionsDto g() {
        return this.reactions;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.messageId) * 31;
        LikesItemReactionsDto likesItemReactionsDto = this.reactions;
        int hashCode2 = (hashCode + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
        BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
        int hashCode3 = (hashCode2 + (baseCommentsInfoDto == null ? 0 : baseCommentsInfoDto.hashCode())) * 31;
        WallViewsDto wallViewsDto = this.views;
        int hashCode4 = (hashCode3 + (wallViewsDto == null ? 0 : wallViewsDto.hashCode())) * 31;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        int hashCode5 = (hashCode4 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
        ChannelsMessagesPaidReactionCounterDto channelsMessagesPaidReactionCounterDto = this.paidReactions;
        return hashCode5 + (channelsMessagesPaidReactionCounterDto != null ? channelsMessagesPaidReactionCounterDto.hashCode() : 0);
    }

    public final BaseRepostsInfoDto i() {
        return this.reposts;
    }

    public final WallViewsDto j() {
        return this.views;
    }

    public final String toString() {
        return "ChannelsMessageCountersDto(messageId=" + this.messageId + ", reactions=" + this.reactions + ", comments=" + this.comments + ", views=" + this.views + ", reposts=" + this.reposts + ", paidReactions=" + this.paidReactions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.messageId);
        parcel.writeParcelable(this.reactions, i);
        BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
        if (baseCommentsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseCommentsInfoDto.writeToParcel(parcel, i);
        }
        WallViewsDto wallViewsDto = this.views;
        if (wallViewsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallViewsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.reposts, i);
        ChannelsMessagesPaidReactionCounterDto channelsMessagesPaidReactionCounterDto = this.paidReactions;
        if (channelsMessagesPaidReactionCounterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsMessagesPaidReactionCounterDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ChannelsMessageCountersDto(int i, LikesItemReactionsDto likesItemReactionsDto, BaseCommentsInfoDto baseCommentsInfoDto, WallViewsDto wallViewsDto, BaseRepostsInfoDto baseRepostsInfoDto, ChannelsMessagesPaidReactionCounterDto channelsMessagesPaidReactionCounterDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : likesItemReactionsDto, (i2 & 4) != 0 ? null : baseCommentsInfoDto, (i2 & 8) != 0 ? null : wallViewsDto, (i2 & 16) != 0 ? null : baseRepostsInfoDto, (i2 & 32) != 0 ? null : channelsMessagesPaidReactionCounterDto);
    }
}
