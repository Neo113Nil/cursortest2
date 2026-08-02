package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketReviewCommentDto.kt */
/* loaded from: classes15.dex */
public final class MarketReviewCommentDto implements Parcelable {
    public static final Parcelable.Creator<MarketReviewCommentDto> CREATOR = new a();

    @pmi0("attachments")
    private final List<WallWallpostAttachmentDto> attachments;

    @pmi0("author_id")
    private final long authorId;

    @pmi0("can_delete")
    private final boolean canDelete;

    @pmi0("can_update")
    private final boolean canUpdate;

    @pmi0("created_at")
    private final int createdAt;

    @pmi0("depth")
    private final int depth;

    @pmi0("descendants_count")
    private final Integer descendantsCount;

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("root_item_id")
    private final int rootItemId;

    @pmi0("text")
    private final String text;

    @pmi0("updated_at")
    private final int updatedAt;

    /* compiled from: MarketReviewCommentDto.kt */
    public static final class a implements Parcelable.Creator<MarketReviewCommentDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketReviewCommentDto createFromParcel(Parcel parcel) {
            UserId userId;
            boolean z;
            UserId userId2;
            boolean z2;
            ArrayList arrayList;
            int i;
            long j;
            int readInt = parcel.readInt();
            UserId userId3 = (UserId) parcel.readParcelable(MarketReviewCommentDto.class.getClassLoader());
            long readLong = parcel.readLong();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString = parcel.readString();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            if (parcel.readInt() != 0) {
                userId = userId3;
                z = true;
            } else {
                userId = userId3;
                z = false;
            }
            if (parcel.readInt() != 0) {
                userId2 = userId;
                z2 = true;
            } else {
                userId2 = userId;
                z2 = false;
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList = new ArrayList(readInt6);
                i = readInt;
                int i2 = 0;
                while (true) {
                    j = readLong;
                    if (i2 == readInt6) {
                        break;
                    }
                    i2 = bo.b(MarketReviewCommentDto.class, parcel, arrayList, i2, 1);
                    readLong = j;
                }
            } else {
                i = readInt;
                arrayList = null;
                j = readLong;
            }
            return new MarketReviewCommentDto(i, userId2, j, readInt2, readInt3, readString, readInt4, readInt5, z, z2, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketReviewCommentDto[] newArray(int i) {
            return new MarketReviewCommentDto[i];
        }
    }

    public MarketReviewCommentDto(int i, UserId userId, long j, int i2, int i3, String str, int i4, int i5, boolean z, boolean z2, Integer num, List<WallWallpostAttachmentDto> list) {
        this.id = i;
        this.ownerId = userId;
        this.authorId = j;
        this.rootItemId = i2;
        this.depth = i3;
        this.text = str;
        this.createdAt = i4;
        this.updatedAt = i5;
        this.canUpdate = z;
        this.canDelete = z2;
        this.descendantsCount = num;
        this.attachments = list;
    }

    public final List<WallWallpostAttachmentDto> d() {
        return this.attachments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.authorId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketReviewCommentDto)) {
            return false;
        }
        MarketReviewCommentDto marketReviewCommentDto = (MarketReviewCommentDto) obj;
        return this.id == marketReviewCommentDto.id && epx.f(this.ownerId, marketReviewCommentDto.ownerId) && this.authorId == marketReviewCommentDto.authorId && this.rootItemId == marketReviewCommentDto.rootItemId && this.depth == marketReviewCommentDto.depth && epx.f(this.text, marketReviewCommentDto.text) && this.createdAt == marketReviewCommentDto.createdAt && this.updatedAt == marketReviewCommentDto.updatedAt && this.canUpdate == marketReviewCommentDto.canUpdate && this.canDelete == marketReviewCommentDto.canDelete && epx.f(this.descendantsCount, marketReviewCommentDto.descendantsCount) && epx.f(this.attachments, marketReviewCommentDto.attachments);
    }

    public final boolean f() {
        return this.canUpdate;
    }

    public final int g() {
        return this.createdAt;
    }

    public final boolean g1() {
        return this.canDelete;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(shy.a(this.updatedAt, shy.a(this.createdAt, urd0.a(shy.a(this.depth, shy.a(this.rootItemId, bh10.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.authorId), 31), 31), 31, this.text), 31), 31), 31, this.canUpdate), 31, this.canDelete);
        Integer num = this.descendantsCount;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        List<WallWallpostAttachmentDto> list = this.attachments;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String i() {
        return this.text;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketReviewCommentDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", authorId=");
        sb.append(this.authorId);
        sb.append(", rootItemId=");
        sb.append(this.rootItemId);
        sb.append(", depth=");
        sb.append(this.depth);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", updatedAt=");
        sb.append(this.updatedAt);
        sb.append(", canUpdate=");
        sb.append(this.canUpdate);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", descendantsCount=");
        sb.append(this.descendantsCount);
        sb.append(", attachments=");
        return ms9.a(')', sb, this.attachments);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeLong(this.authorId);
        parcel.writeInt(this.rootItemId);
        parcel.writeInt(this.depth);
        parcel.writeString(this.text);
        parcel.writeInt(this.createdAt);
        parcel.writeInt(this.updatedAt);
        parcel.writeInt(this.canUpdate ? 1 : 0);
        parcel.writeInt(this.canDelete ? 1 : 0);
        Integer num = this.descendantsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<WallWallpostAttachmentDto> list = this.attachments;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MarketReviewCommentDto(int i, UserId userId, long j, int i2, int i3, String str, int i4, int i5, boolean z, boolean z2, Integer num, List list, int i6, zcl zclVar) {
        this(i, userId, j, i2, i3, str, i4, i5, z, z2, (i6 & 1024) != 0 ? null : num, (i6 & 2048) != 0 ? null : list);
    }
}
