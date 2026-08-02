package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.b;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoriesGetInterestingBlockResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetInterestingBlockResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetInterestingBlockResponseDto> CREATOR = new a();

    @pmi0(b.JSON_KEY_ADS)
    private final StoriesAdsDataV5113Dto ads;

    @pmi0("block_type")
    private final BlockTypeDto blockType;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<StoriesFeedItemDto> items;

    @pmi0("need_upload_screen")
    private final Boolean needUploadScreen;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesGetInterestingBlockResponseDto.kt */
    public static final class BlockTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockTypeDto[] $VALUES;
        public static final Parcelable.Creator<BlockTypeDto> CREATOR;

        @pmi0("discover")
        public static final BlockTypeDto DISCOVER;

        @pmi0("feed")
        public static final BlockTypeDto FEED;

        @pmi0("phone_book_stories")
        public static final BlockTypeDto PHONE_BOOK_STORIES;

        @pmi0(NotificationCompat.CATEGORY_SOCIAL)
        public static final BlockTypeDto SOCIAL;
        private final String value;

        /* compiled from: StoriesGetInterestingBlockResponseDto.kt */
        public static final class a implements Parcelable.Creator<BlockTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final BlockTypeDto createFromParcel(Parcel parcel) {
                return BlockTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BlockTypeDto[] newArray(int i) {
                return new BlockTypeDto[i];
            }
        }

        static {
            BlockTypeDto blockTypeDto = new BlockTypeDto("DISCOVER", 0, "discover");
            DISCOVER = blockTypeDto;
            BlockTypeDto blockTypeDto2 = new BlockTypeDto("FEED", 1, "feed");
            FEED = blockTypeDto2;
            BlockTypeDto blockTypeDto3 = new BlockTypeDto("SOCIAL", 2, NotificationCompat.CATEGORY_SOCIAL);
            SOCIAL = blockTypeDto3;
            BlockTypeDto blockTypeDto4 = new BlockTypeDto("PHONE_BOOK_STORIES", 3, "phone_book_stories");
            PHONE_BOOK_STORIES = blockTypeDto4;
            BlockTypeDto[] blockTypeDtoArr = {blockTypeDto, blockTypeDto2, blockTypeDto3, blockTypeDto4};
            $VALUES = blockTypeDtoArr;
            $ENTRIES = new asp(blockTypeDtoArr);
            CREATOR = new a();
        }

        private BlockTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static BlockTypeDto valueOf(String str) {
            return (BlockTypeDto) Enum.valueOf(BlockTypeDto.class, str);
        }

        public static BlockTypeDto[] values() {
            return (BlockTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: StoriesGetInterestingBlockResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetInterestingBlockResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetInterestingBlockResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(StoriesFeedItemDto.CREATOR, parcel, arrayList3, i, 1);
            }
            BlockTypeDto createFromParcel = parcel.readInt() == 0 ? null : BlockTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = bo.b(StoriesGetInterestingBlockResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = bo.b(StoriesGetInterestingBlockResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoriesGetInterestingBlockResponseDto(readInt, arrayList3, createFromParcel, readString, arrayList, arrayList2, valueOf, parcel.readInt() == 0 ? null : StoriesAdsDataV5113Dto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetInterestingBlockResponseDto[] newArray(int i) {
            return new StoriesGetInterestingBlockResponseDto[i];
        }
    }

    public StoriesGetInterestingBlockResponseDto(int i, List<StoriesFeedItemDto> list, BlockTypeDto blockTypeDto, String str, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Boolean bool, StoriesAdsDataV5113Dto storiesAdsDataV5113Dto, String str2, String str3) {
        this.count = i;
        this.items = list;
        this.blockType = blockTypeDto;
        this.title = str;
        this.profiles = list2;
        this.groups = list3;
        this.needUploadScreen = bool;
        this.ads = storiesAdsDataV5113Dto;
        this.trackCode = str2;
        this.nextFrom = str3;
    }

    public final BlockTypeDto d() {
        return this.blockType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsGroupFullDto> e() {
        return this.groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetInterestingBlockResponseDto)) {
            return false;
        }
        StoriesGetInterestingBlockResponseDto storiesGetInterestingBlockResponseDto = (StoriesGetInterestingBlockResponseDto) obj;
        return this.count == storiesGetInterestingBlockResponseDto.count && epx.f(this.items, storiesGetInterestingBlockResponseDto.items) && this.blockType == storiesGetInterestingBlockResponseDto.blockType && epx.f(this.title, storiesGetInterestingBlockResponseDto.title) && epx.f(this.profiles, storiesGetInterestingBlockResponseDto.profiles) && epx.f(this.groups, storiesGetInterestingBlockResponseDto.groups) && epx.f(this.needUploadScreen, storiesGetInterestingBlockResponseDto.needUploadScreen) && epx.f(this.ads, storiesGetInterestingBlockResponseDto.ads) && epx.f(this.trackCode, storiesGetInterestingBlockResponseDto.trackCode) && epx.f(this.nextFrom, storiesGetInterestingBlockResponseDto.nextFrom);
    }

    public final List<StoriesFeedItemDto> f() {
        return this.items;
    }

    public final String g() {
        return this.nextFrom;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        BlockTypeDto blockTypeDto = this.blockType;
        int hashCode = (a2 + (blockTypeDto == null ? 0 : blockTypeDto.hashCode())) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.needUploadScreen;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        StoriesAdsDataV5113Dto storiesAdsDataV5113Dto = this.ads;
        int hashCode6 = (hashCode5 + (storiesAdsDataV5113Dto == null ? 0 : storiesAdsDataV5113Dto.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nextFrom;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final List<UsersUserFullDto> i() {
        return this.profiles;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetInterestingBlockResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", blockType=");
        sb.append(this.blockType);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
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
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StoriesFeedItemDto) a2.next()).writeToParcel(parcel, i);
        }
        BlockTypeDto blockTypeDto = this.blockType;
        if (blockTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blockTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
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
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
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

    public /* synthetic */ StoriesGetInterestingBlockResponseDto(int i, List list, BlockTypeDto blockTypeDto, String str, List list2, List list3, Boolean bool, StoriesAdsDataV5113Dto storiesAdsDataV5113Dto, String str2, String str3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : blockTypeDto, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : list3, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : storiesAdsDataV5113Dto, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : str3);
    }
}
