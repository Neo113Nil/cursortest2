package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedGetActivityReactionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetActivityReactionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGetActivityReactionsResponseDto> CREATOR = new a();

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    /* compiled from: NewsfeedGetActivityReactionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetActivityReactionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetActivityReactionsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new NewsfeedGetActivityReactionsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetActivityReactionsResponseDto[] newArray(int i) {
            return new NewsfeedGetActivityReactionsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedGetActivityReactionsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedGetActivityReactionsResponseDto) && epx.f(this.reactionSets, ((NewsfeedGetActivityReactionsResponseDto) obj).reactionSets);
    }

    public final int hashCode() {
        List<LikesReactionSetDto> list = this.reactionSets;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("NewsfeedGetActivityReactionsResponseDto(reactionSets="), this.reactionSets);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<LikesReactionSetDto> list = this.reactionSets;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((LikesReactionSetDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public NewsfeedGetActivityReactionsResponseDto(List<LikesReactionSetDto> list) {
        this.reactionSets = list;
    }

    public /* synthetic */ NewsfeedGetActivityReactionsResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
