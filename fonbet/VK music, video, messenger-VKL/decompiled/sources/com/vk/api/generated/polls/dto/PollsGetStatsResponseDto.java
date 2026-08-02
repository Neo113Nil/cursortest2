package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.k73;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: PollsGetStatsResponseDto.kt */
/* loaded from: classes15.dex */
public final class PollsGetStatsResponseDto implements Parcelable {
    public static final Parcelable.Creator<PollsGetStatsResponseDto> CREATOR = new a();

    @pmi0("answer_ids")
    private final List<Long> answerIds;

    @pmi0("answers")
    private final List<PollsAnswerDto> answers;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("votes")
    private final Integer votes;

    /* compiled from: PollsGetStatsResponseDto.kt */
    public static final class a implements Parcelable.Creator<PollsGetStatsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsGetStatsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = k73.b(parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(PollsGetStatsResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(PollsGetStatsResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new PollsGetStatsResponseDto(arrayList, arrayList2, arrayList3, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PollsGetStatsResponseDto[] newArray(int i) {
            return new PollsGetStatsResponseDto[i];
        }
    }

    public PollsGetStatsResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final List<Long> d() {
        return this.answerIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<PollsAnswerDto> e() {
        return this.answers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsGetStatsResponseDto)) {
            return false;
        }
        PollsGetStatsResponseDto pollsGetStatsResponseDto = (PollsGetStatsResponseDto) obj;
        return epx.f(this.answerIds, pollsGetStatsResponseDto.answerIds) && epx.f(this.answers, pollsGetStatsResponseDto.answers) && epx.f(this.profiles, pollsGetStatsResponseDto.profiles) && epx.f(this.votes, pollsGetStatsResponseDto.votes);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final Integer g() {
        return this.votes;
    }

    public final int hashCode() {
        List<Long> list = this.answerIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PollsAnswerDto> list2 = this.answers;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.votes;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollsGetStatsResponseDto(answerIds=");
        sb.append(this.answerIds);
        sb.append(", answers=");
        sb.append(this.answers);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", votes=");
        return uqi.b(sb, this.votes, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Long> list = this.answerIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeLong(((Number) f.next()).longValue());
            }
        }
        List<PollsAnswerDto> list2 = this.answers;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<UsersUserFullDto> list3 = this.profiles;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        Integer num = this.votes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public PollsGetStatsResponseDto(List<Long> list, List<PollsAnswerDto> list2, List<UsersUserFullDto> list3, Integer num) {
        this.answerIds = list;
        this.answers = list2;
        this.profiles = list3;
        this.votes = num;
    }

    public /* synthetic */ PollsGetStatsResponseDto(List list, List list2, List list3, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : num);
    }
}
