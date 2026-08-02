package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesGetViewersExtendedV5115ResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetViewersExtendedV5115ResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetViewersExtendedV5115ResponseDto> CREATOR = new a();

    @pmi0("answers_count")
    private final Integer answersCount;

    @pmi0("count")
    private final int count;

    @pmi0("hidden_reason")
    private final String hiddenReason;

    @pmi0("items")
    private final List<StoriesViewersItemDto> items;

    @pmi0("new_reactions")
    private final List<StoriesNewReactionDto> newReactions;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("reactions_count")
    private final Integer reactionsCount;

    /* compiled from: StoriesGetViewersExtendedV5115ResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetViewersExtendedV5115ResponseDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final StoriesGetViewersExtendedV5115ResponseDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(StoriesViewersItemDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
                arrayList = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                arrayList = null;
            }
            String readString = parcel.readString();
            Object valueOf2 = parcel.readInt() == 0 ? arrayList : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(StoriesGetViewersExtendedV5115ResponseDto.class, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new StoriesGetViewersExtendedV5115ResponseDto(readInt, arrayList2, valueOf, readString, valueOf2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetViewersExtendedV5115ResponseDto[] newArray(int i) {
            return new StoriesGetViewersExtendedV5115ResponseDto[i];
        }
    }

    public StoriesGetViewersExtendedV5115ResponseDto(int i, List<StoriesViewersItemDto> list, Integer num, String str, Integer num2, List<StoriesNewReactionDto> list2, String str2) {
        this.count = i;
        this.items = list;
        this.answersCount = num;
        this.hiddenReason = str;
        this.reactionsCount = num2;
        this.newReactions = list2;
        this.nextFrom = str2;
    }

    public final Integer d() {
        return this.answersCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.hiddenReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetViewersExtendedV5115ResponseDto)) {
            return false;
        }
        StoriesGetViewersExtendedV5115ResponseDto storiesGetViewersExtendedV5115ResponseDto = (StoriesGetViewersExtendedV5115ResponseDto) obj;
        return this.count == storiesGetViewersExtendedV5115ResponseDto.count && epx.f(this.items, storiesGetViewersExtendedV5115ResponseDto.items) && epx.f(this.answersCount, storiesGetViewersExtendedV5115ResponseDto.answersCount) && epx.f(this.hiddenReason, storiesGetViewersExtendedV5115ResponseDto.hiddenReason) && epx.f(this.reactionsCount, storiesGetViewersExtendedV5115ResponseDto.reactionsCount) && epx.f(this.newReactions, storiesGetViewersExtendedV5115ResponseDto.newReactions) && epx.f(this.nextFrom, storiesGetViewersExtendedV5115ResponseDto.nextFrom);
    }

    public final List<StoriesViewersItemDto> f() {
        return this.items;
    }

    public final List<StoriesNewReactionDto> g() {
        return this.newReactions;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.answersCount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.hiddenReason;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.reactionsCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<StoriesNewReactionDto> list = this.newReactions;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.nextFrom;
    }

    public final Integer j() {
        return this.reactionsCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetViewersExtendedV5115ResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", answersCount=");
        sb.append(this.answersCount);
        sb.append(", hiddenReason=");
        sb.append(this.hiddenReason);
        sb.append(", reactionsCount=");
        sb.append(this.reactionsCount);
        sb.append(", newReactions=");
        sb.append(this.newReactions);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StoriesViewersItemDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.answersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.hiddenReason);
        Integer num2 = this.reactionsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<StoriesNewReactionDto> list = this.newReactions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ StoriesGetViewersExtendedV5115ResponseDto(int i, List list, Integer num, String str, Integer num2, List list2, String str2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : str2);
    }
}
