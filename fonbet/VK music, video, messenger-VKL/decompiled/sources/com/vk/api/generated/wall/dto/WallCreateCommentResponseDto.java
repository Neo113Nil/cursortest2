package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallCreateCommentResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallCreateCommentResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallCreateCommentResponseDto> CREATOR = new a();

    @pmi0("comment_id")
    private final int commentId;

    @pmi0("parents_stack")
    private final List<Integer> parentsStack;

    /* compiled from: WallCreateCommentResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallCreateCommentResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallCreateCommentResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new WallCreateCommentResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WallCreateCommentResponseDto[] newArray(int i) {
            return new WallCreateCommentResponseDto[i];
        }
    }

    public WallCreateCommentResponseDto(int i, List<Integer> list) {
        this.commentId = i;
        this.parentsStack = list;
    }

    public final int d() {
        return this.commentId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallCreateCommentResponseDto)) {
            return false;
        }
        WallCreateCommentResponseDto wallCreateCommentResponseDto = (WallCreateCommentResponseDto) obj;
        return this.commentId == wallCreateCommentResponseDto.commentId && epx.f(this.parentsStack, wallCreateCommentResponseDto.parentsStack);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.commentId) * 31;
        List<Integer> list = this.parentsStack;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallCreateCommentResponseDto(commentId=");
        sb.append(this.commentId);
        sb.append(", parentsStack=");
        return ms9.a(')', sb, this.parentsStack);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.commentId);
        List<Integer> list = this.parentsStack;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public /* synthetic */ WallCreateCommentResponseDto(int i, List list, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list);
    }
}
