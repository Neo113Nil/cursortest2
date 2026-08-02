package com.vk.api.generated.articles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
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
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ArticlesGetByLinkExtendedResponseDto.kt */
/* loaded from: classes14.dex */
public final class ArticlesGetByLinkExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<ArticlesGetByLinkExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupDto> groups;

    @pmi0("items")
    private final List<ArticlesArticleDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: ArticlesGetByLinkExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<ArticlesGetByLinkExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ArticlesGetByLinkExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(ArticlesGetByLinkExtendedResponseDto.class, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(ArticlesGetByLinkExtendedResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(GroupsGroupDto.CREATOR, parcel, arrayList3, i, 1);
                }
            }
            return new ArticlesGetByLinkExtendedResponseDto(readInt, arrayList2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final ArticlesGetByLinkExtendedResponseDto[] newArray(int i) {
            return new ArticlesGetByLinkExtendedResponseDto[i];
        }
    }

    public ArticlesGetByLinkExtendedResponseDto(int i, List<ArticlesArticleDto> list, List<UsersUserFullDto> list2, List<GroupsGroupDto> list3) {
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
        if (!(obj instanceof ArticlesGetByLinkExtendedResponseDto)) {
            return false;
        }
        ArticlesGetByLinkExtendedResponseDto articlesGetByLinkExtendedResponseDto = (ArticlesGetByLinkExtendedResponseDto) obj;
        return this.count == articlesGetByLinkExtendedResponseDto.count && epx.f(this.items, articlesGetByLinkExtendedResponseDto.items) && epx.f(this.profiles, articlesGetByLinkExtendedResponseDto.profiles) && epx.f(this.groups, articlesGetByLinkExtendedResponseDto.groups);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupDto> list2 = this.groups;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticlesGetByLinkExtendedResponseDto(count=");
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
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((GroupsGroupDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ArticlesGetByLinkExtendedResponseDto(int i, List list, List list2, List list3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3);
    }
}
