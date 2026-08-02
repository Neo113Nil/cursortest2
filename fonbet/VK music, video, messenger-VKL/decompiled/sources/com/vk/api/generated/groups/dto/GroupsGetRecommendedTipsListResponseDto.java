package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: GroupsGetRecommendedTipsListResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetRecommendedTipsListResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetRecommendedTipsListResponseDto> CREATOR = new a();

    @pmi0(HintCategories.PARAM_NAME)
    private final List<GroupsRecommendedTipsListCategoryDto> categories;

    @pmi0("images")
    private final GroupsRecommendedTipsListImagesDto images;

    @pmi0("section_hidden")
    private final boolean sectionHidden;

    /* compiled from: GroupsGetRecommendedTipsListResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetRecommendedTipsListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetRecommendedTipsListResponseDto createFromParcel(Parcel parcel) {
            int i = 0;
            boolean z = parcel.readInt() != 0;
            GroupsRecommendedTipsListImagesDto createFromParcel = GroupsRecommendedTipsListImagesDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = en.a(GroupsRecommendedTipsListCategoryDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsGetRecommendedTipsListResponseDto(z, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetRecommendedTipsListResponseDto[] newArray(int i) {
            return new GroupsGetRecommendedTipsListResponseDto[i];
        }
    }

    public GroupsGetRecommendedTipsListResponseDto(boolean z, GroupsRecommendedTipsListImagesDto groupsRecommendedTipsListImagesDto, List<GroupsRecommendedTipsListCategoryDto> list) {
        this.sectionHidden = z;
        this.images = groupsRecommendedTipsListImagesDto;
        this.categories = list;
    }

    public final List<GroupsRecommendedTipsListCategoryDto> d() {
        return this.categories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsRecommendedTipsListImagesDto e() {
        return this.images;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetRecommendedTipsListResponseDto)) {
            return false;
        }
        GroupsGetRecommendedTipsListResponseDto groupsGetRecommendedTipsListResponseDto = (GroupsGetRecommendedTipsListResponseDto) obj;
        return this.sectionHidden == groupsGetRecommendedTipsListResponseDto.sectionHidden && epx.f(this.images, groupsGetRecommendedTipsListResponseDto.images) && epx.f(this.categories, groupsGetRecommendedTipsListResponseDto.categories);
    }

    public final int hashCode() {
        return this.categories.hashCode() + ((this.images.hashCode() + (Boolean.hashCode(this.sectionHidden) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetRecommendedTipsListResponseDto(sectionHidden=");
        sb.append(this.sectionHidden);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", categories=");
        return ms9.a(')', sb, this.categories);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sectionHidden ? 1 : 0);
        this.images.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.categories);
        while (a2.hasNext()) {
            ((GroupsRecommendedTipsListCategoryDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
