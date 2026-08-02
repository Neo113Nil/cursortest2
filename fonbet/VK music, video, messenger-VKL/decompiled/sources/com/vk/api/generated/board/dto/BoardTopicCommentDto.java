package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.wall.dto.WallCommentAttachmentDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BoardTopicCommentDto.kt */
/* loaded from: classes14.dex */
public final class BoardTopicCommentDto implements Parcelable {
    public static final Parcelable.Creator<BoardTopicCommentDto> CREATOR = new a();

    @pmi0("attachments")
    private final List<WallCommentAttachmentDto> attachments;

    @pmi0("can_edit")
    private final BaseBoolIntDto canEdit;

    @pmi0("date")
    private final int date;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("id")
    private final int id;

    @pmi0("likes")
    private final BaseLikesInfoDto likes;

    @pmi0("real_offset")
    private final Integer realOffset;

    @pmi0("text")
    private final String text;

    /* compiled from: BoardTopicCommentDto.kt */
    public static final class a implements Parcelable.Creator<BoardTopicCommentDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardTopicCommentDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(BoardTopicCommentDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = en.a(WallCommentAttachmentDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new BoardTopicCommentDto(readInt, userId, readInt2, readString, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (BaseBoolIntDto) parcel.readParcelable(BoardTopicCommentDto.class.getClassLoader()), (BaseLikesInfoDto) parcel.readParcelable(BoardTopicCommentDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BoardTopicCommentDto[] newArray(int i) {
            return new BoardTopicCommentDto[i];
        }
    }

    public BoardTopicCommentDto(int i, UserId userId, int i2, String str, List<WallCommentAttachmentDto> list, Integer num, BaseBoolIntDto baseBoolIntDto, BaseLikesInfoDto baseLikesInfoDto) {
        this.date = i;
        this.fromId = userId;
        this.id = i2;
        this.text = str;
        this.attachments = list;
        this.realOffset = num;
        this.canEdit = baseBoolIntDto;
        this.likes = baseLikesInfoDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardTopicCommentDto)) {
            return false;
        }
        BoardTopicCommentDto boardTopicCommentDto = (BoardTopicCommentDto) obj;
        return this.date == boardTopicCommentDto.date && epx.f(this.fromId, boardTopicCommentDto.fromId) && this.id == boardTopicCommentDto.id && epx.f(this.text, boardTopicCommentDto.text) && epx.f(this.attachments, boardTopicCommentDto.attachments) && epx.f(this.realOffset, boardTopicCommentDto.realOffset) && this.canEdit == boardTopicCommentDto.canEdit && epx.f(this.likes, boardTopicCommentDto.likes);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.id, bh10.a(Integer.hashCode(this.date) * 31, 31, this.fromId.b), 31), 31, this.text);
        List<WallCommentAttachmentDto> list = this.attachments;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.realOffset;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canEdit;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        return hashCode3 + (baseLikesInfoDto != null ? baseLikesInfoDto.hashCode() : 0);
    }

    public final String toString() {
        return "BoardTopicCommentDto(date=" + this.date + ", fromId=" + this.fromId + ", id=" + this.id + ", text=" + this.text + ", attachments=" + this.attachments + ", realOffset=" + this.realOffset + ", canEdit=" + this.canEdit + ", likes=" + this.likes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.date);
        parcel.writeParcelable(this.fromId, i);
        parcel.writeInt(this.id);
        parcel.writeString(this.text);
        List<WallCommentAttachmentDto> list = this.attachments;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((WallCommentAttachmentDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.realOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.canEdit, i);
        parcel.writeParcelable(this.likes, i);
    }

    public /* synthetic */ BoardTopicCommentDto(int i, UserId userId, int i2, String str, List list, Integer num, BaseBoolIntDto baseBoolIntDto, BaseLikesInfoDto baseLikesInfoDto, int i3, zcl zclVar) {
        this(i, userId, i2, str, (i3 & 16) != 0 ? null : list, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : baseBoolIntDto, (i3 & 128) != 0 ? null : baseLikesInfoDto);
    }
}
