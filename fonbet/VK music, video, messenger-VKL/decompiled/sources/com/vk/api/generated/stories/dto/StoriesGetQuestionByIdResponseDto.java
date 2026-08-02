package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesGetQuestionByIdResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetQuestionByIdResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetQuestionByIdResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("question")
    private final StoriesQuestionDto question;

    /* compiled from: StoriesGetQuestionByIdResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetQuestionByIdResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetQuestionByIdResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            StoriesQuestionDto createFromParcel = StoriesQuestionDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(StoriesGetQuestionByIdResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(StoriesGetQuestionByIdResponseDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new StoriesGetQuestionByIdResponseDto(createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetQuestionByIdResponseDto[] newArray(int i) {
            return new StoriesGetQuestionByIdResponseDto[i];
        }
    }

    public StoriesGetQuestionByIdResponseDto(StoriesQuestionDto storiesQuestionDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2) {
        this.question = storiesQuestionDto;
        this.profiles = list;
        this.groups = list2;
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UsersUserFullDto> e() {
        return this.profiles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetQuestionByIdResponseDto)) {
            return false;
        }
        StoriesGetQuestionByIdResponseDto storiesGetQuestionByIdResponseDto = (StoriesGetQuestionByIdResponseDto) obj;
        return epx.f(this.question, storiesGetQuestionByIdResponseDto.question) && epx.f(this.profiles, storiesGetQuestionByIdResponseDto.profiles) && epx.f(this.groups, storiesGetQuestionByIdResponseDto.groups);
    }

    public final StoriesQuestionDto f() {
        return this.question;
    }

    public final int hashCode() {
        int hashCode = this.question.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetQuestionByIdResponseDto(question=");
        sb.append(this.question);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.question.writeToParcel(parcel, i);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ StoriesGetQuestionByIdResponseDto(StoriesQuestionDto storiesQuestionDto, List list, List list2, int i, zcl zclVar) {
        this(storiesQuestionDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
