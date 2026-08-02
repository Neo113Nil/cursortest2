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
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: QuestionsGetByIdExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class QuestionsGetByIdExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<QuestionsGetByIdExtendedResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("question")
    private final QuestionsQuestionDto question;

    /* compiled from: QuestionsGetByIdExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<QuestionsGetByIdExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final QuestionsGetByIdExtendedResponseDto createFromParcel(Parcel parcel) {
            QuestionsQuestionDto createFromParcel = QuestionsQuestionDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(QuestionsGetByIdExtendedResponseDto.class, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = bo.b(QuestionsGetByIdExtendedResponseDto.class, parcel, arrayList2, i, 1);
            }
            return new QuestionsGetByIdExtendedResponseDto(createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final QuestionsGetByIdExtendedResponseDto[] newArray(int i) {
            return new QuestionsGetByIdExtendedResponseDto[i];
        }
    }

    public QuestionsGetByIdExtendedResponseDto(QuestionsQuestionDto questionsQuestionDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2) {
        this.question = questionsQuestionDto;
        this.profiles = list;
        this.groups = list2;
    }

    public final List<UsersUserFullDto> d() {
        return this.profiles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final QuestionsQuestionDto e() {
        return this.question;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionsGetByIdExtendedResponseDto)) {
            return false;
        }
        QuestionsGetByIdExtendedResponseDto questionsGetByIdExtendedResponseDto = (QuestionsGetByIdExtendedResponseDto) obj;
        return epx.f(this.question, questionsGetByIdExtendedResponseDto.question) && epx.f(this.profiles, questionsGetByIdExtendedResponseDto.profiles) && epx.f(this.groups, questionsGetByIdExtendedResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + fw3.a(this.question.hashCode() * 31, 31, this.profiles);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionsGetByIdExtendedResponseDto(question=");
        sb.append(this.question);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.question.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.profiles);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.groups);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
    }
}
