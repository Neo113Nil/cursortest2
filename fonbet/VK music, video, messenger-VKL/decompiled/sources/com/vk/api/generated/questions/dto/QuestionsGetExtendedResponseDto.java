package com.vk.api.generated.questions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: QuestionsGetExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class QuestionsGetExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<QuestionsGetExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<QuestionsQuestionDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: QuestionsGetExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<QuestionsGetExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final QuestionsGetExtendedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(QuestionsQuestionDto.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                i2 = bo.b(QuestionsGetExtendedResponseDto.class, parcel, arrayList2, i2, 1);
            }
            int readInt4 = parcel.readInt();
            int i3 = 0;
            ArrayList arrayList3 = new ArrayList(readInt4);
            while (i3 != readInt4) {
                i3 = bo.b(QuestionsGetExtendedResponseDto.class, parcel, arrayList3, i3, 1);
            }
            return new QuestionsGetExtendedResponseDto(readInt, arrayList, arrayList2, arrayList3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final QuestionsGetExtendedResponseDto[] newArray(int i) {
            return new QuestionsGetExtendedResponseDto[i];
        }
    }

    public QuestionsGetExtendedResponseDto(int i, List<QuestionsQuestionDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, String str) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.nextFrom = str;
    }

    public final List<QuestionsQuestionDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.nextFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionsGetExtendedResponseDto)) {
            return false;
        }
        QuestionsGetExtendedResponseDto questionsGetExtendedResponseDto = (QuestionsGetExtendedResponseDto) obj;
        return this.count == questionsGetExtendedResponseDto.count && epx.f(this.items, questionsGetExtendedResponseDto.items) && epx.f(this.profiles, questionsGetExtendedResponseDto.profiles) && epx.f(this.groups, questionsGetExtendedResponseDto.groups) && epx.f(this.nextFrom, questionsGetExtendedResponseDto.nextFrom);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles), 31, this.groups);
        String str = this.nextFrom;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionsGetExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((QuestionsQuestionDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.groups);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ QuestionsGetExtendedResponseDto(int i, List list, List list2, List list3, String str, int i2, zcl zclVar) {
        this(i, list, list2, list3, (i2 & 16) != 0 ? null : str);
    }
}
