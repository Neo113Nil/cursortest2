package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.wall.dto.WallNegativeRepliesPlaceholderDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ChannelsCommentThreadDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsCommentThreadDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsCommentThreadDto> CREATOR = new a();

    @pmi0("author_replied")
    private final Boolean authorReplied;

    @pmi0("can_post")
    private final Boolean canPost;

    @pmi0("count")
    private final int count;

    @pmi0("groups_can_post")
    private final Boolean groupsCanPost;

    @pmi0("items")
    private final List<ChannelsMessageCommentDto> items;

    @pmi0("negative_replies_placeholder")
    private final WallNegativeRepliesPlaceholderDto negativeRepliesPlaceholder;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    /* compiled from: ChannelsCommentThreadDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsCommentThreadDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsCommentThreadDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            int readInt = parcel.readInt();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(ChannelsMessageCommentDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
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
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ChannelsCommentThreadDto(readInt, arrayList, valueOf, valueOf2, valueOf3, bool, (WallNegativeRepliesPlaceholderDto) parcel.readParcelable(ChannelsCommentThreadDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsCommentThreadDto[] newArray(int i) {
            return new ChannelsCommentThreadDto[i];
        }
    }

    public ChannelsCommentThreadDto(int i, List<ChannelsMessageCommentDto> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto, String str) {
        this.count = i;
        this.items = list;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
        this.authorReplied = bool4;
        this.negativeRepliesPlaceholder = wallNegativeRepliesPlaceholderDto;
        this.nextFrom = str;
    }

    public final List<ChannelsMessageCommentDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final WallNegativeRepliesPlaceholderDto e() {
        return this.negativeRepliesPlaceholder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsCommentThreadDto)) {
            return false;
        }
        ChannelsCommentThreadDto channelsCommentThreadDto = (ChannelsCommentThreadDto) obj;
        return this.count == channelsCommentThreadDto.count && epx.f(this.items, channelsCommentThreadDto.items) && epx.f(this.canPost, channelsCommentThreadDto.canPost) && epx.f(this.showReplyButton, channelsCommentThreadDto.showReplyButton) && epx.f(this.groupsCanPost, channelsCommentThreadDto.groupsCanPost) && epx.f(this.authorReplied, channelsCommentThreadDto.authorReplied) && epx.f(this.negativeRepliesPlaceholder, channelsCommentThreadDto.negativeRepliesPlaceholder) && epx.f(this.nextFrom, channelsCommentThreadDto.nextFrom);
    }

    public final String f() {
        return this.nextFrom;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        List<ChannelsMessageCommentDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.canPost;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showReplyButton;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.groupsCanPost;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.authorReplied;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto = this.negativeRepliesPlaceholder;
        int hashCode7 = (hashCode6 + (wallNegativeRepliesPlaceholderDto == null ? 0 : wallNegativeRepliesPlaceholderDto.hashCode())) * 31;
        String str = this.nextFrom;
        return hashCode7 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsCommentThreadDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", canPost=");
        sb.append(this.canPost);
        sb.append(", showReplyButton=");
        sb.append(this.showReplyButton);
        sb.append(", groupsCanPost=");
        sb.append(this.groupsCanPost);
        sb.append(", authorReplied=");
        sb.append(this.authorReplied);
        sb.append(", negativeRepliesPlaceholder=");
        sb.append(this.negativeRepliesPlaceholder);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        List<ChannelsMessageCommentDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ChannelsMessageCommentDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.canPost;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.showReplyButton;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.groupsCanPost;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.authorReplied;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeParcelable(this.negativeRepliesPlaceholder, i);
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ ChannelsCommentThreadDto(int i, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : bool3, (i2 & 32) != 0 ? null : bool4, (i2 & 64) != 0 ? null : wallNegativeRepliesPlaceholderDto, (i2 & 128) != 0 ? null : str);
    }
}
