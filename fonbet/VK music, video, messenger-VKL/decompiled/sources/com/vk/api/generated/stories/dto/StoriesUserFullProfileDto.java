package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.b;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.storiesIdeas.dto.StoriesIdeasIdeasBlockDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: StoriesUserFullProfileDto.kt */
/* loaded from: classes15.dex */
public final class StoriesUserFullProfileDto implements Parcelable {
    public static final Parcelable.Creator<StoriesUserFullProfileDto> CREATOR = new a();

    @pmi0(b.JSON_KEY_ADS)
    private final StoriesAdsDataV5113Dto ads;

    @pmi0("count")
    private final Integer count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("ideas")
    private final StoriesIdeasIdeasBlockDto ideas;

    @pmi0("items")
    private final List<StoriesFeedItemDto> items;

    @pmi0("need_upload_screen")
    private final Boolean needUploadScreen;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: StoriesUserFullProfileDto.kt */
    public static final class a implements Parcelable.Creator<StoriesUserFullProfileDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesUserFullProfileDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(StoriesFeedItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(StoriesUserFullProfileDto.class, parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(StoriesUserFullProfileDto.class, parcel, arrayList4, i3, 1);
                }
                arrayList3 = arrayList4;
            }
            StoriesIdeasIdeasBlockDto createFromParcel = parcel.readInt() == 0 ? null : StoriesIdeasIdeasBlockDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoriesUserFullProfileDto(valueOf2, arrayList, arrayList2, arrayList3, createFromParcel, valueOf, parcel.readInt() != 0 ? StoriesAdsDataV5113Dto.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesUserFullProfileDto[] newArray(int i) {
            return new StoriesUserFullProfileDto[i];
        }
    }

    public StoriesUserFullProfileDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesUserFullProfileDto)) {
            return false;
        }
        StoriesUserFullProfileDto storiesUserFullProfileDto = (StoriesUserFullProfileDto) obj;
        return epx.f(this.count, storiesUserFullProfileDto.count) && epx.f(this.items, storiesUserFullProfileDto.items) && epx.f(this.profiles, storiesUserFullProfileDto.profiles) && epx.f(this.groups, storiesUserFullProfileDto.groups) && epx.f(this.ideas, storiesUserFullProfileDto.ideas) && epx.f(this.needUploadScreen, storiesUserFullProfileDto.needUploadScreen) && epx.f(this.ads, storiesUserFullProfileDto.ads) && epx.f(this.trackCode, storiesUserFullProfileDto.trackCode) && epx.f(this.nextFrom, storiesUserFullProfileDto.nextFrom);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<StoriesFeedItemDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        StoriesIdeasIdeasBlockDto storiesIdeasIdeasBlockDto = this.ideas;
        int hashCode5 = (hashCode4 + (storiesIdeasIdeasBlockDto == null ? 0 : storiesIdeasIdeasBlockDto.hashCode())) * 31;
        Boolean bool = this.needUploadScreen;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        StoriesAdsDataV5113Dto storiesAdsDataV5113Dto = this.ads;
        int hashCode7 = (hashCode6 + (storiesAdsDataV5113Dto == null ? 0 : storiesAdsDataV5113Dto.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode8 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesUserFullProfileDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", ideas=");
        sb.append(this.ideas);
        sb.append(", needUploadScreen=");
        sb.append(this.needUploadScreen);
        sb.append(", ads=");
        sb.append(this.ads);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<StoriesFeedItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((StoriesFeedItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<UsersUserFullDto> list2 = this.profiles;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<GroupsGroupFullDto> list3 = this.groups;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        StoriesIdeasIdeasBlockDto storiesIdeasIdeasBlockDto = this.ideas;
        if (storiesIdeasIdeasBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesIdeasIdeasBlockDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.needUploadScreen;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        StoriesAdsDataV5113Dto storiesAdsDataV5113Dto = this.ads;
        if (storiesAdsDataV5113Dto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesAdsDataV5113Dto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.nextFrom);
    }

    public StoriesUserFullProfileDto(Integer num, List<StoriesFeedItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, StoriesIdeasIdeasBlockDto storiesIdeasIdeasBlockDto, Boolean bool, StoriesAdsDataV5113Dto storiesAdsDataV5113Dto, String str, String str2) {
        this.count = num;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.ideas = storiesIdeasIdeasBlockDto;
        this.needUploadScreen = bool;
        this.ads = storiesAdsDataV5113Dto;
        this.trackCode = str;
        this.nextFrom = str2;
    }

    public /* synthetic */ StoriesUserFullProfileDto(Integer num, List list, List list2, List list3, StoriesIdeasIdeasBlockDto storiesIdeasIdeasBlockDto, Boolean bool, StoriesAdsDataV5113Dto storiesAdsDataV5113Dto, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : storiesIdeasIdeasBlockDto, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : storiesAdsDataV5113Dto, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2);
    }
}
