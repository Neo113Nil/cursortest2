package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: LikesItemReactionsDto.kt */
/* loaded from: classes14.dex */
public final class LikesItemReactionsDto implements Parcelable {
    public static final Parcelable.Creator<LikesItemReactionsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<LikesItemReactionDto> items;

    @pmi0("user_reaction")
    private final Integer userReaction;

    /* compiled from: LikesItemReactionsDto.kt */
    public static final class a implements Parcelable.Creator<LikesItemReactionsDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesItemReactionsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(LikesItemReactionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new LikesItemReactionsDto(arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final LikesItemReactionsDto[] newArray(int i) {
            return new LikesItemReactionsDto[i];
        }
    }

    public LikesItemReactionsDto(List<LikesItemReactionDto> list, int i, Integer num) {
        this.items = list;
        this.count = i;
        this.userReaction = num;
    }

    public final List<LikesItemReactionDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.userReaction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesItemReactionsDto)) {
            return false;
        }
        LikesItemReactionsDto likesItemReactionsDto = (LikesItemReactionsDto) obj;
        return epx.f(this.items, likesItemReactionsDto.items) && this.count == likesItemReactionsDto.count && epx.f(this.userReaction, likesItemReactionsDto.userReaction);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, this.items.hashCode() * 31, 31);
        Integer num = this.userReaction;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikesItemReactionsDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", userReaction=");
        return uqi.b(sb, this.userReaction, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((LikesItemReactionDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
        Integer num = this.userReaction;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ LikesItemReactionsDto(List list, int i, Integer num, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : num);
    }
}
