package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.mbridge.msdk.foundation.entity.b;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetRecommendedTipCompleteChecklistTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetRecommendedTipCompleteChecklistTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetRecommendedTipCompleteChecklistTypeDto[] $VALUES;

    @pmi0("action_button")
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto ACTION_BUTTON;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto ADDRESS;

    @pmi0(b.JSON_KEY_ADS)
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto ADS;

    @pmi0("cover_image")
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto COVER_IMAGE;
    public static final Parcelable.Creator<GroupsSetRecommendedTipCompleteChecklistTypeDto> CREATOR;

    @pmi0("description")
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto DESCRIPTION;

    @pmi0("invite_friends")
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto INVITE_FRIENDS;

    @pmi0("load_avatar")
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto LOAD_AVATAR;

    @pmi0("make_post")
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto MAKE_POST;

    @pmi0("market_item")
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto MARKET_ITEM;

    @pmi0("short_url")
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto SHORT_URL;

    @pmi0("subscribe_vk_news")
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto SUBSCRIBE_VK_NEWS;

    @pmi0("vkconnect")
    public static final GroupsSetRecommendedTipCompleteChecklistTypeDto VKCONNECT;
    private final String value;

    /* compiled from: GroupsSetRecommendedTipCompleteChecklistTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetRecommendedTipCompleteChecklistTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetRecommendedTipCompleteChecklistTypeDto createFromParcel(Parcel parcel) {
            return GroupsSetRecommendedTipCompleteChecklistTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetRecommendedTipCompleteChecklistTypeDto[] newArray(int i) {
            return new GroupsSetRecommendedTipCompleteChecklistTypeDto[i];
        }
    }

    static {
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto = new GroupsSetRecommendedTipCompleteChecklistTypeDto("ACTION_BUTTON", 0, "action_button");
        ACTION_BUTTON = groupsSetRecommendedTipCompleteChecklistTypeDto;
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto2 = new GroupsSetRecommendedTipCompleteChecklistTypeDto("ADDRESS", 1, RTCStatsConstants.KEY_ADDRESS);
        ADDRESS = groupsSetRecommendedTipCompleteChecklistTypeDto2;
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto3 = new GroupsSetRecommendedTipCompleteChecklistTypeDto("ADS", 2, b.JSON_KEY_ADS);
        ADS = groupsSetRecommendedTipCompleteChecklistTypeDto3;
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto4 = new GroupsSetRecommendedTipCompleteChecklistTypeDto("COVER_IMAGE", 3, "cover_image");
        COVER_IMAGE = groupsSetRecommendedTipCompleteChecklistTypeDto4;
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto5 = new GroupsSetRecommendedTipCompleteChecklistTypeDto(NativeAdContent.ViewTag.AD_DESCRIPTION, 4, "description");
        DESCRIPTION = groupsSetRecommendedTipCompleteChecklistTypeDto5;
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto6 = new GroupsSetRecommendedTipCompleteChecklistTypeDto("INVITE_FRIENDS", 5, "invite_friends");
        INVITE_FRIENDS = groupsSetRecommendedTipCompleteChecklistTypeDto6;
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto7 = new GroupsSetRecommendedTipCompleteChecklistTypeDto("LOAD_AVATAR", 6, "load_avatar");
        LOAD_AVATAR = groupsSetRecommendedTipCompleteChecklistTypeDto7;
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto8 = new GroupsSetRecommendedTipCompleteChecklistTypeDto("MAKE_POST", 7, "make_post");
        MAKE_POST = groupsSetRecommendedTipCompleteChecklistTypeDto8;
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto9 = new GroupsSetRecommendedTipCompleteChecklistTypeDto("MARKET_ITEM", 8, "market_item");
        MARKET_ITEM = groupsSetRecommendedTipCompleteChecklistTypeDto9;
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto10 = new GroupsSetRecommendedTipCompleteChecklistTypeDto("SHORT_URL", 9, "short_url");
        SHORT_URL = groupsSetRecommendedTipCompleteChecklistTypeDto10;
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto11 = new GroupsSetRecommendedTipCompleteChecklistTypeDto("SUBSCRIBE_VK_NEWS", 10, "subscribe_vk_news");
        SUBSCRIBE_VK_NEWS = groupsSetRecommendedTipCompleteChecklistTypeDto11;
        GroupsSetRecommendedTipCompleteChecklistTypeDto groupsSetRecommendedTipCompleteChecklistTypeDto12 = new GroupsSetRecommendedTipCompleteChecklistTypeDto("VKCONNECT", 11, "vkconnect");
        VKCONNECT = groupsSetRecommendedTipCompleteChecklistTypeDto12;
        GroupsSetRecommendedTipCompleteChecklistTypeDto[] groupsSetRecommendedTipCompleteChecklistTypeDtoArr = {groupsSetRecommendedTipCompleteChecklistTypeDto, groupsSetRecommendedTipCompleteChecklistTypeDto2, groupsSetRecommendedTipCompleteChecklistTypeDto3, groupsSetRecommendedTipCompleteChecklistTypeDto4, groupsSetRecommendedTipCompleteChecklistTypeDto5, groupsSetRecommendedTipCompleteChecklistTypeDto6, groupsSetRecommendedTipCompleteChecklistTypeDto7, groupsSetRecommendedTipCompleteChecklistTypeDto8, groupsSetRecommendedTipCompleteChecklistTypeDto9, groupsSetRecommendedTipCompleteChecklistTypeDto10, groupsSetRecommendedTipCompleteChecklistTypeDto11, groupsSetRecommendedTipCompleteChecklistTypeDto12};
        $VALUES = groupsSetRecommendedTipCompleteChecklistTypeDtoArr;
        $ENTRIES = new asp(groupsSetRecommendedTipCompleteChecklistTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsSetRecommendedTipCompleteChecklistTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetRecommendedTipCompleteChecklistTypeDto valueOf(String str) {
        return (GroupsSetRecommendedTipCompleteChecklistTypeDto) Enum.valueOf(GroupsSetRecommendedTipCompleteChecklistTypeDto.class, str);
    }

    public static GroupsSetRecommendedTipCompleteChecklistTypeDto[] values() {
        return (GroupsSetRecommendedTipCompleteChecklistTypeDto[]) $VALUES.clone();
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
