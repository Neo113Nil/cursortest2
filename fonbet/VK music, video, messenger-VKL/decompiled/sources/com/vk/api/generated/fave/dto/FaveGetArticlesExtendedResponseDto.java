package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
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

/* compiled from: FaveGetArticlesExtendedResponseDto.kt */
/* loaded from: classes14.dex */
public final class FaveGetArticlesExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<FaveGetArticlesExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupDto> groups;

    @pmi0("items")
    private final List<ArticlesArticleDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: FaveGetArticlesExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<FaveGetArticlesExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveGetArticlesExtendedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(FaveGetArticlesExtendedResponseDto.class, parcel, arrayList, i2, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = bo.b(FaveGetArticlesExtendedResponseDto.class, parcel, arrayList2, i3, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt4);
            while (i != readInt4) {
                i = bo.b(FaveGetArticlesExtendedResponseDto.class, parcel, arrayList3, i, 1);
            }
            return new FaveGetArticlesExtendedResponseDto(readInt, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final FaveGetArticlesExtendedResponseDto[] newArray(int i) {
            return new FaveGetArticlesExtendedResponseDto[i];
        }
    }

    public FaveGetArticlesExtendedResponseDto(int i, List<ArticlesArticleDto> list, List<UsersUserFullDto> list2, List<GroupsGroupDto> list3) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveGetArticlesExtendedResponseDto)) {
            return false;
        }
        FaveGetArticlesExtendedResponseDto faveGetArticlesExtendedResponseDto = (FaveGetArticlesExtendedResponseDto) obj;
        return this.count == faveGetArticlesExtendedResponseDto.count && epx.f(this.items, faveGetArticlesExtendedResponseDto.items) && epx.f(this.profiles, faveGetArticlesExtendedResponseDto.profiles) && epx.f(this.groups, faveGetArticlesExtendedResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveGetArticlesExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.groups);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
    }
}
