package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoAiAssistantMessageBlockRecommendedItemsDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantMessageBlockRecommendedItemsDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantMessageBlockRecommendedItemsDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("recommended_items")
    private final List<VideoAiAssistantRecommendedItemDto> recommendedItems;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoAiAssistantMessageBlockRecommendedItemsDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantMessageBlockRecommendedItemsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockRecommendedItemsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readString();
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(VideoAiAssistantRecommendedItemDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(VideoAiAssistantMessageBlockRecommendedItemsDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(VideoAiAssistantMessageBlockRecommendedItemsDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new VideoAiAssistantMessageBlockRecommendedItemsDto(readString, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockRecommendedItemsDto[] newArray(int i) {
            return new VideoAiAssistantMessageBlockRecommendedItemsDto[i];
        }
    }

    public VideoAiAssistantMessageBlockRecommendedItemsDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAiAssistantMessageBlockRecommendedItemsDto)) {
            return false;
        }
        VideoAiAssistantMessageBlockRecommendedItemsDto videoAiAssistantMessageBlockRecommendedItemsDto = (VideoAiAssistantMessageBlockRecommendedItemsDto) obj;
        return epx.f(this.title, videoAiAssistantMessageBlockRecommendedItemsDto.title) && epx.f(this.recommendedItems, videoAiAssistantMessageBlockRecommendedItemsDto.recommendedItems) && epx.f(this.groups, videoAiAssistantMessageBlockRecommendedItemsDto.groups) && epx.f(this.profiles, videoAiAssistantMessageBlockRecommendedItemsDto.profiles);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<VideoAiAssistantRecommendedItemDto> list = this.recommendedItems;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAiAssistantMessageBlockRecommendedItemsDto(title=");
        sb.append(this.title);
        sb.append(", recommendedItems=");
        sb.append(this.recommendedItems);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<VideoAiAssistantRecommendedItemDto> list = this.recommendedItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((VideoAiAssistantRecommendedItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
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
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public VideoAiAssistantMessageBlockRecommendedItemsDto(String str, List<VideoAiAssistantRecommendedItemDto> list, List<GroupsGroupFullDto> list2, List<UsersUserFullDto> list3) {
        this.title = str;
        this.recommendedItems = list;
        this.groups = list2;
        this.profiles = list3;
    }

    public /* synthetic */ VideoAiAssistantMessageBlockRecommendedItemsDto(String str, List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
