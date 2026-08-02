package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.api.generated.wall.dto.WallWallpostCommentsDonutDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: NewsfeedCommentsBaseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedCommentsBaseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedCommentsBaseDto> CREATOR = new a();

    @pmi0("can_close")
    private final BaseBoolIntDto canClose;

    @pmi0("can_open")
    private final BaseBoolIntDto canOpen;

    @pmi0("can_post")
    private final BaseBoolIntDto canPost;

    @pmi0("can_view")
    private final BaseBoolIntDto canView;

    @pmi0("count")
    private final Integer count;

    @pmi0("donut")
    private final WallWallpostCommentsDonutDto donut;

    @pmi0("groups_can_post")
    private final Boolean groupsCanPost;

    @pmi0("list")
    private final List<WallWallCommentDto> list;

    @pmi0("pinned_comment_raw_id")
    private final String pinnedCommentRawId;

    /* compiled from: NewsfeedCommentsBaseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedCommentsBaseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedCommentsBaseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NewsfeedCommentsBaseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsBaseDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsBaseDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsBaseDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsBaseDto.class.getClassLoader());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedCommentsBaseDto(arrayList, baseBoolIntDto, baseBoolIntDto2, baseBoolIntDto3, baseBoolIntDto4, valueOf2, valueOf, parcel.readInt() != 0 ? WallWallpostCommentsDonutDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedCommentsBaseDto[] newArray(int i) {
            return new NewsfeedCommentsBaseDto[i];
        }
    }

    public NewsfeedCommentsBaseDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedCommentsBaseDto)) {
            return false;
        }
        NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = (NewsfeedCommentsBaseDto) obj;
        return epx.f(this.list, newsfeedCommentsBaseDto.list) && this.canPost == newsfeedCommentsBaseDto.canPost && this.canOpen == newsfeedCommentsBaseDto.canOpen && this.canClose == newsfeedCommentsBaseDto.canClose && this.canView == newsfeedCommentsBaseDto.canView && epx.f(this.count, newsfeedCommentsBaseDto.count) && epx.f(this.groupsCanPost, newsfeedCommentsBaseDto.groupsCanPost) && epx.f(this.donut, newsfeedCommentsBaseDto.donut) && epx.f(this.pinnedCommentRawId, newsfeedCommentsBaseDto.pinnedCommentRawId);
    }

    public final int hashCode() {
        List<WallWallCommentDto> list = this.list;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canPost;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canOpen;
        int hashCode3 = (hashCode2 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canClose;
        int hashCode4 = (hashCode3 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.canView;
        int hashCode5 = (hashCode4 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        Integer num = this.count;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.groupsCanPost;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto = this.donut;
        int hashCode8 = (hashCode7 + (wallWallpostCommentsDonutDto == null ? 0 : wallWallpostCommentsDonutDto.hashCode())) * 31;
        String str = this.pinnedCommentRawId;
        return hashCode8 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedCommentsBaseDto(list=");
        sb.append(this.list);
        sb.append(", canPost=");
        sb.append(this.canPost);
        sb.append(", canOpen=");
        sb.append(this.canOpen);
        sb.append(", canClose=");
        sb.append(this.canClose);
        sb.append(", canView=");
        sb.append(this.canView);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", groupsCanPost=");
        sb.append(this.groupsCanPost);
        sb.append(", donut=");
        sb.append(this.donut);
        sb.append(", pinnedCommentRawId=");
        return ho8.a(sb, this.pinnedCommentRawId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<WallWallCommentDto> list = this.list;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.canPost, i);
        parcel.writeParcelable(this.canOpen, i);
        parcel.writeParcelable(this.canClose, i);
        parcel.writeParcelable(this.canView, i);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.groupsCanPost;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto = this.donut;
        if (wallWallpostCommentsDonutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostCommentsDonutDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.pinnedCommentRawId);
    }

    public NewsfeedCommentsBaseDto(List<WallWallCommentDto> list, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num, Boolean bool, WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto, String str) {
        this.list = list;
        this.canPost = baseBoolIntDto;
        this.canOpen = baseBoolIntDto2;
        this.canClose = baseBoolIntDto3;
        this.canView = baseBoolIntDto4;
        this.count = num;
        this.groupsCanPost = bool;
        this.donut = wallWallpostCommentsDonutDto;
        this.pinnedCommentRawId = str;
    }

    public /* synthetic */ NewsfeedCommentsBaseDto(List list, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num, Boolean bool, WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : baseBoolIntDto, (i & 4) != 0 ? null : baseBoolIntDto2, (i & 8) != 0 ? null : baseBoolIntDto3, (i & 16) != 0 ? null : baseBoolIntDto4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : wallWallpostCommentsDonutDto, (i & 256) != 0 ? null : str);
    }
}
