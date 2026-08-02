package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
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

/* compiled from: NewsfeedGetBreakingNewsBlockContentResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetBreakingNewsBlockContentResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGetBreakingNewsBlockContentResponseDto> CREATOR = new a();

    @pmi0("block")
    private final NewsfeedItemDigestDto block;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    /* compiled from: NewsfeedGetBreakingNewsBlockContentResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetBreakingNewsBlockContentResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBreakingNewsBlockContentResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            NewsfeedItemDigestDto createFromParcel = NewsfeedItemDigestDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(NewsfeedGetBreakingNewsBlockContentResponseDto.class, parcel, arrayList2, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = bo.b(NewsfeedGetBreakingNewsBlockContentResponseDto.class, parcel, arrayList3, i3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList4, i, 1);
                }
                arrayList = arrayList4;
            }
            return new NewsfeedGetBreakingNewsBlockContentResponseDto(createFromParcel, arrayList2, arrayList3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBreakingNewsBlockContentResponseDto[] newArray(int i) {
            return new NewsfeedGetBreakingNewsBlockContentResponseDto[i];
        }
    }

    public NewsfeedGetBreakingNewsBlockContentResponseDto(NewsfeedItemDigestDto newsfeedItemDigestDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, List<LikesReactionSetDto> list3) {
        this.block = newsfeedItemDigestDto;
        this.profiles = list;
        this.groups = list2;
        this.reactionSets = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetBreakingNewsBlockContentResponseDto)) {
            return false;
        }
        NewsfeedGetBreakingNewsBlockContentResponseDto newsfeedGetBreakingNewsBlockContentResponseDto = (NewsfeedGetBreakingNewsBlockContentResponseDto) obj;
        return epx.f(this.block, newsfeedGetBreakingNewsBlockContentResponseDto.block) && epx.f(this.profiles, newsfeedGetBreakingNewsBlockContentResponseDto.profiles) && epx.f(this.groups, newsfeedGetBreakingNewsBlockContentResponseDto.groups) && epx.f(this.reactionSets, newsfeedGetBreakingNewsBlockContentResponseDto.reactionSets);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(this.block.hashCode() * 31, 31, this.profiles), 31, this.groups);
        List<LikesReactionSetDto> list = this.reactionSets;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedGetBreakingNewsBlockContentResponseDto(block=");
        sb.append(this.block);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", reactionSets=");
        return ms9.a(')', sb, this.reactionSets);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.block.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.profiles);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.groups);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
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

    public /* synthetic */ NewsfeedGetBreakingNewsBlockContentResponseDto(NewsfeedItemDigestDto newsfeedItemDigestDto, List list, List list2, List list3, int i, zcl zclVar) {
        this(newsfeedItemDigestDto, list, list2, (i & 8) != 0 ? null : list3);
    }
}
