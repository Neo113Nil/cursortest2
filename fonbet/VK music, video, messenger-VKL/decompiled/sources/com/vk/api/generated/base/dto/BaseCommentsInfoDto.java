package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: BaseCommentsInfoDto.kt */
/* loaded from: classes14.dex */
public final class BaseCommentsInfoDto implements Parcelable {
    public static final Parcelable.Creator<BaseCommentsInfoDto> CREATOR = new a();

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

    /* compiled from: BaseCommentsInfoDto.kt */
    public static final class a implements Parcelable.Creator<BaseCommentsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseCommentsInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(BaseCommentsInfoDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(BaseCommentsInfoDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(BaseCommentsInfoDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(BaseCommentsInfoDto.class.getClassLoader());
            ArrayList arrayList = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            WallWallpostCommentsDonutDto createFromParcel = parcel.readInt() == 0 ? null : WallWallpostCommentsDonutDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = bo.b(BaseCommentsInfoDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new BaseCommentsInfoDto(baseBoolIntDto, baseBoolIntDto2, baseBoolIntDto3, baseBoolIntDto4, valueOf2, valueOf, createFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseCommentsInfoDto[] newArray(int i) {
            return new BaseCommentsInfoDto[i];
        }
    }

    public BaseCommentsInfoDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final BaseBoolIntDto d() {
        return this.canClose;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.canOpen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCommentsInfoDto)) {
            return false;
        }
        BaseCommentsInfoDto baseCommentsInfoDto = (BaseCommentsInfoDto) obj;
        return this.canPost == baseCommentsInfoDto.canPost && this.canOpen == baseCommentsInfoDto.canOpen && this.canClose == baseCommentsInfoDto.canClose && this.canView == baseCommentsInfoDto.canView && epx.f(this.count, baseCommentsInfoDto.count) && epx.f(this.groupsCanPost, baseCommentsInfoDto.groupsCanPost) && epx.f(this.donut, baseCommentsInfoDto.donut) && epx.f(this.list, baseCommentsInfoDto.list) && epx.f(this.pinnedCommentRawId, baseCommentsInfoDto.pinnedCommentRawId);
    }

    public final BaseBoolIntDto f() {
        return this.canPost;
    }

    public final BaseBoolIntDto g() {
        return this.canView;
    }

    public final int hashCode() {
        BaseBoolIntDto baseBoolIntDto = this.canPost;
        int hashCode = (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canOpen;
        int hashCode2 = (hashCode + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canClose;
        int hashCode3 = (hashCode2 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.canView;
        int hashCode4 = (hashCode3 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        Integer num = this.count;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.groupsCanPost;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto = this.donut;
        int hashCode7 = (hashCode6 + (wallWallpostCommentsDonutDto == null ? 0 : wallWallpostCommentsDonutDto.hashCode())) * 31;
        List<WallWallCommentDto> list = this.list;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.pinnedCommentRawId;
        return hashCode8 + (str != null ? str.hashCode() : 0);
    }

    public final Integer i() {
        return this.count;
    }

    public final WallWallpostCommentsDonutDto j() {
        return this.donut;
    }

    public final Boolean k() {
        return this.groupsCanPost;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseCommentsInfoDto(canPost=");
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
        sb.append(", list=");
        sb.append(this.list);
        sb.append(", pinnedCommentRawId=");
        return ho8.a(sb, this.pinnedCommentRawId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
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
        List<WallWallCommentDto> list = this.list;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.pinnedCommentRawId);
    }

    public BaseCommentsInfoDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num, Boolean bool, WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto, List<WallWallCommentDto> list, String str) {
        this.canPost = baseBoolIntDto;
        this.canOpen = baseBoolIntDto2;
        this.canClose = baseBoolIntDto3;
        this.canView = baseBoolIntDto4;
        this.count = num;
        this.groupsCanPost = bool;
        this.donut = wallWallpostCommentsDonutDto;
        this.list = list;
        this.pinnedCommentRawId = str;
    }

    public /* synthetic */ BaseCommentsInfoDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num, Boolean bool, WallWallpostCommentsDonutDto wallWallpostCommentsDonutDto, List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseBoolIntDto, (i & 2) != 0 ? null : baseBoolIntDto2, (i & 4) != 0 ? null : baseBoolIntDto3, (i & 8) != 0 ? null : baseBoolIntDto4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : wallWallpostCommentsDonutDto, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str);
    }
}
