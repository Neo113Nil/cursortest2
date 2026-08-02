package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LikesGetListResponseDto.kt */
/* loaded from: classes14.dex */
public final class LikesGetListResponseDto implements Parcelable {
    public static final Parcelable.Creator<LikesGetListResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    @pmi0("reactions")
    private final List<Integer> reactions;

    /* compiled from: LikesGetListResponseDto.kt */
    public static final class a implements Parcelable.Creator<LikesGetListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesGetListResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(LikesGetListResponseDto.class, parcel, arrayList4, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = pm0.b(parcel, arrayList, i3, 1);
                }
                arrayList2 = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList5, i, 1);
                }
                arrayList3 = arrayList5;
            }
            return new LikesGetListResponseDto(readInt, arrayList4, arrayList, readString, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final LikesGetListResponseDto[] newArray(int i) {
            return new LikesGetListResponseDto[i];
        }
    }

    public LikesGetListResponseDto(int i, List<UserId> list, List<Integer> list2, String str, List<LikesReactionSetDto> list3) {
        this.count = i;
        this.items = list;
        this.reactions = list2;
        this.reactionSetId = str;
        this.reactionSets = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesGetListResponseDto)) {
            return false;
        }
        LikesGetListResponseDto likesGetListResponseDto = (LikesGetListResponseDto) obj;
        return this.count == likesGetListResponseDto.count && epx.f(this.items, likesGetListResponseDto.items) && epx.f(this.reactions, likesGetListResponseDto.reactions) && epx.f(this.reactionSetId, likesGetListResponseDto.reactionSetId) && epx.f(this.reactionSets, likesGetListResponseDto.reactionSets);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<Integer> list = this.reactions;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.reactionSetId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<LikesReactionSetDto> list2 = this.reactionSets;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikesGetListResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", reactions=");
        sb.append(this.reactions);
        sb.append(", reactionSetId=");
        sb.append(this.reactionSetId);
        sb.append(", reactionSets=");
        return ms9.a(')', sb, this.reactionSets);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<Integer> list = this.reactions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeString(this.reactionSetId);
        List<LikesReactionSetDto> list2 = this.reactionSets;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((LikesReactionSetDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ LikesGetListResponseDto(int i, List list, List list2, String str, List list3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list3);
    }
}
