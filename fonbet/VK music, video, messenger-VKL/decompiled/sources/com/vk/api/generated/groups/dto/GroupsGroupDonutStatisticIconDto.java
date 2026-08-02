package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupDonutStatisticIconDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutStatisticIconDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupDonutStatisticIconDto[] $VALUES;

    @pmi0("articles")
    public static final GroupsGroupDonutStatisticIconDto ARTICLES;

    @pmi0("chats")
    public static final GroupsGroupDonutStatisticIconDto CHATS;

    @pmi0("comment")
    public static final GroupsGroupDonutStatisticIconDto COMMENT;
    public static final Parcelable.Creator<GroupsGroupDonutStatisticIconDto> CREATOR;

    @pmi0("friends")
    public static final GroupsGroupDonutStatisticIconDto FRIENDS;

    @pmi0("podcasts")
    public static final GroupsGroupDonutStatisticIconDto PODCASTS;

    @pmi0("subscribers")
    public static final GroupsGroupDonutStatisticIconDto SUBSCRIBERS;

    @pmi0("wall")
    public static final GroupsGroupDonutStatisticIconDto WALL;
    private final String value;

    /* compiled from: GroupsGroupDonutStatisticIconDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutStatisticIconDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutStatisticIconDto createFromParcel(Parcel parcel) {
            return GroupsGroupDonutStatisticIconDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutStatisticIconDto[] newArray(int i) {
            return new GroupsGroupDonutStatisticIconDto[i];
        }
    }

    static {
        GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto = new GroupsGroupDonutStatisticIconDto("ARTICLES", 0, "articles");
        ARTICLES = groupsGroupDonutStatisticIconDto;
        GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto2 = new GroupsGroupDonutStatisticIconDto("COMMENT", 1, "comment");
        COMMENT = groupsGroupDonutStatisticIconDto2;
        GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto3 = new GroupsGroupDonutStatisticIconDto("PODCASTS", 2, "podcasts");
        PODCASTS = groupsGroupDonutStatisticIconDto3;
        GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto4 = new GroupsGroupDonutStatisticIconDto("SUBSCRIBERS", 3, "subscribers");
        SUBSCRIBERS = groupsGroupDonutStatisticIconDto4;
        GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto5 = new GroupsGroupDonutStatisticIconDto("WALL", 4, "wall");
        WALL = groupsGroupDonutStatisticIconDto5;
        GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto6 = new GroupsGroupDonutStatisticIconDto("CHATS", 5, "chats");
        CHATS = groupsGroupDonutStatisticIconDto6;
        GroupsGroupDonutStatisticIconDto groupsGroupDonutStatisticIconDto7 = new GroupsGroupDonutStatisticIconDto(Privacy.FRIENDS, 6, "friends");
        FRIENDS = groupsGroupDonutStatisticIconDto7;
        GroupsGroupDonutStatisticIconDto[] groupsGroupDonutStatisticIconDtoArr = {groupsGroupDonutStatisticIconDto, groupsGroupDonutStatisticIconDto2, groupsGroupDonutStatisticIconDto3, groupsGroupDonutStatisticIconDto4, groupsGroupDonutStatisticIconDto5, groupsGroupDonutStatisticIconDto6, groupsGroupDonutStatisticIconDto7};
        $VALUES = groupsGroupDonutStatisticIconDtoArr;
        $ENTRIES = new asp(groupsGroupDonutStatisticIconDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupDonutStatisticIconDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGroupDonutStatisticIconDto valueOf(String str) {
        return (GroupsGroupDonutStatisticIconDto) Enum.valueOf(GroupsGroupDonutStatisticIconDto.class, str);
    }

    public static GroupsGroupDonutStatisticIconDto[] values() {
        return (GroupsGroupDonutStatisticIconDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
