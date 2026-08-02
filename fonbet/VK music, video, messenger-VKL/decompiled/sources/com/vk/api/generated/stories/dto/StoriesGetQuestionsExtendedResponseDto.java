package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: StoriesGetQuestionsExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetQuestionsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetQuestionsExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<StoriesQuestionDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: StoriesGetQuestionsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetQuestionsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetQuestionsExtendedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(StoriesQuestionDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = bo.b(StoriesGetQuestionsExtendedResponseDto.class, parcel, arrayList2, i, 1);
            }
            return new StoriesGetQuestionsExtendedResponseDto(readInt, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetQuestionsExtendedResponseDto[] newArray(int i) {
            return new StoriesGetQuestionsExtendedResponseDto[i];
        }
    }

    public StoriesGetQuestionsExtendedResponseDto(int i, List<StoriesQuestionDto> list, List<UsersUserFullDto> list2) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
    }

    public final List<StoriesQuestionDto> d() {
        return this.items;
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
        if (!(obj instanceof StoriesGetQuestionsExtendedResponseDto)) {
            return false;
        }
        StoriesGetQuestionsExtendedResponseDto storiesGetQuestionsExtendedResponseDto = (StoriesGetQuestionsExtendedResponseDto) obj;
        return this.count == storiesGetQuestionsExtendedResponseDto.count && epx.f(this.items, storiesGetQuestionsExtendedResponseDto.items) && epx.f(this.profiles, storiesGetQuestionsExtendedResponseDto.profiles);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.profiles.hashCode() + fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetQuestionsExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StoriesQuestionDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
    }
}
