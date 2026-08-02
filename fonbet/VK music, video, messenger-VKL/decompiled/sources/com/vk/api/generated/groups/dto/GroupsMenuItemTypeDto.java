package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.mbridge.msdk.MBridgeConstans;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsMenuItemTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsMenuItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsMenuItemTypeDto[] $VALUES;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    public static final GroupsMenuItemTypeDto ADDRESS;

    @pmi0("addresses")
    public static final GroupsMenuItemTypeDto ADDRESSES;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static final GroupsMenuItemTypeDto APP;

    @pmi0("article")
    public static final GroupsMenuItemTypeDto ARTICLE;

    @pmi0("artist_page")
    public static final GroupsMenuItemTypeDto ARTIST_PAGE;
    public static final Parcelable.Creator<GroupsMenuItemTypeDto> CREATOR;

    @pmi0("discussion")
    public static final GroupsMenuItemTypeDto DISCUSSION;

    @pmi0("discussion_list")
    public static final GroupsMenuItemTypeDto DISCUSSION_LIST;

    @pmi0("document")
    public static final GroupsMenuItemTypeDto DOCUMENT;

    @pmi0("document_list")
    public static final GroupsMenuItemTypeDto DOCUMENT_LIST;

    @pmi0("donut_level")
    public static final GroupsMenuItemTypeDto DONUT_LEVEL;

    @pmi0("donut_levels_list")
    public static final GroupsMenuItemTypeDto DONUT_LEVELS_LIST;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final GroupsMenuItemTypeDto EVENT;

    @pmi0("group")
    public static final GroupsMenuItemTypeDto GROUP;

    @pmi0("market")
    public static final GroupsMenuItemTypeDto MARKET;

    @pmi0("market_cart")
    public static final GroupsMenuItemTypeDto MARKET_CART;

    @pmi0("market_collection")
    public static final GroupsMenuItemTypeDto MARKET_COLLECTION;

    @pmi0("market_item")
    public static final GroupsMenuItemTypeDto MARKET_ITEM;

    @pmi0("market_yc_integration")
    public static final GroupsMenuItemTypeDto MARKET_YC_INTEGRATION;

    @pmi0("musical_album")
    public static final GroupsMenuItemTypeDto MUSICAL_ALBUM;

    @pmi0("narrative")
    public static final GroupsMenuItemTypeDto NARRATIVE;

    @pmi0("other")
    public static final GroupsMenuItemTypeDto OTHER;

    @pmi0("photo")
    public static final GroupsMenuItemTypeDto PHOTO;

    @pmi0("photo_album")
    public static final GroupsMenuItemTypeDto PHOTO_ALBUM;

    @pmi0("playlist")
    public static final GroupsMenuItemTypeDto PLAYLIST;

    @pmi0("podcast")
    public static final GroupsMenuItemTypeDto PODCAST;

    @pmi0("post")
    public static final GroupsMenuItemTypeDto POST;

    @pmi0("user")
    public static final GroupsMenuItemTypeDto USER;

    @pmi0("video")
    public static final GroupsMenuItemTypeDto VIDEO;

    @pmi0("video_album")
    public static final GroupsMenuItemTypeDto VIDEO_ALBUM;

    @pmi0("video_in_playlist")
    public static final GroupsMenuItemTypeDto VIDEO_IN_PLAYLIST;

    @pmi0("wiki")
    public static final GroupsMenuItemTypeDto WIKI;
    private final String value;

    /* compiled from: GroupsMenuItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsMenuItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsMenuItemTypeDto createFromParcel(Parcel parcel) {
            return GroupsMenuItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsMenuItemTypeDto[] newArray(int i) {
            return new GroupsMenuItemTypeDto[i];
        }
    }

    static {
        GroupsMenuItemTypeDto groupsMenuItemTypeDto = new GroupsMenuItemTypeDto("POST", 0, "post");
        POST = groupsMenuItemTypeDto;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto2 = new GroupsMenuItemTypeDto("ARTICLE", 1, "article");
        ARTICLE = groupsMenuItemTypeDto2;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto3 = new GroupsMenuItemTypeDto("MARKET_ITEM", 2, "market_item");
        MARKET_ITEM = groupsMenuItemTypeDto3;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto4 = new GroupsMenuItemTypeDto("PHOTO", 3, "photo");
        PHOTO = groupsMenuItemTypeDto4;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto5 = new GroupsMenuItemTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 4, "video");
        VIDEO = groupsMenuItemTypeDto5;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto6 = new GroupsMenuItemTypeDto("DISCUSSION", 5, "discussion");
        DISCUSSION = groupsMenuItemTypeDto6;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto7 = new GroupsMenuItemTypeDto("DOCUMENT", 6, "document");
        DOCUMENT = groupsMenuItemTypeDto7;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto8 = new GroupsMenuItemTypeDto("PLAYLIST", 7, "playlist");
        PLAYLIST = groupsMenuItemTypeDto8;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto9 = new GroupsMenuItemTypeDto("ARTIST_PAGE", 8, "artist_page");
        ARTIST_PAGE = groupsMenuItemTypeDto9;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto10 = new GroupsMenuItemTypeDto("APP", 9, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = groupsMenuItemTypeDto10;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto11 = new GroupsMenuItemTypeDto("USER", 10, "user");
        USER = groupsMenuItemTypeDto11;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto12 = new GroupsMenuItemTypeDto("GROUP", 11, "group");
        GROUP = groupsMenuItemTypeDto12;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto13 = new GroupsMenuItemTypeDto("EVENT", 12, NotificationCompat.CATEGORY_EVENT);
        EVENT = groupsMenuItemTypeDto13;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto14 = new GroupsMenuItemTypeDto(NativeAdContent.ViewTag.OTHER, 13, "other");
        OTHER = groupsMenuItemTypeDto14;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto15 = new GroupsMenuItemTypeDto("MARKET_COLLECTION", 14, "market_collection");
        MARKET_COLLECTION = groupsMenuItemTypeDto15;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto16 = new GroupsMenuItemTypeDto("PHOTO_ALBUM", 15, "photo_album");
        PHOTO_ALBUM = groupsMenuItemTypeDto16;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto17 = new GroupsMenuItemTypeDto("MUSICAL_ALBUM", 16, "musical_album");
        MUSICAL_ALBUM = groupsMenuItemTypeDto17;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto18 = new GroupsMenuItemTypeDto("DISCUSSION_LIST", 17, "discussion_list");
        DISCUSSION_LIST = groupsMenuItemTypeDto18;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto19 = new GroupsMenuItemTypeDto("DOCUMENT_LIST", 18, "document_list");
        DOCUMENT_LIST = groupsMenuItemTypeDto19;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto20 = new GroupsMenuItemTypeDto("MARKET", 19, "market");
        MARKET = groupsMenuItemTypeDto20;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto21 = new GroupsMenuItemTypeDto("MARKET_CART", 20, "market_cart");
        MARKET_CART = groupsMenuItemTypeDto21;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto22 = new GroupsMenuItemTypeDto("ADDRESS", 21, RTCStatsConstants.KEY_ADDRESS);
        ADDRESS = groupsMenuItemTypeDto22;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto23 = new GroupsMenuItemTypeDto("ADDRESSES", 22, "addresses");
        ADDRESSES = groupsMenuItemTypeDto23;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto24 = new GroupsMenuItemTypeDto("MARKET_YC_INTEGRATION", 23, "market_yc_integration");
        MARKET_YC_INTEGRATION = groupsMenuItemTypeDto24;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto25 = new GroupsMenuItemTypeDto("DONUT_LEVELS_LIST", 24, "donut_levels_list");
        DONUT_LEVELS_LIST = groupsMenuItemTypeDto25;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto26 = new GroupsMenuItemTypeDto("DONUT_LEVEL", 25, "donut_level");
        DONUT_LEVEL = groupsMenuItemTypeDto26;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto27 = new GroupsMenuItemTypeDto("VIDEO_IN_PLAYLIST", 26, "video_in_playlist");
        VIDEO_IN_PLAYLIST = groupsMenuItemTypeDto27;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto28 = new GroupsMenuItemTypeDto("NARRATIVE", 27, "narrative");
        NARRATIVE = groupsMenuItemTypeDto28;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto29 = new GroupsMenuItemTypeDto("WIKI", 28, "wiki");
        WIKI = groupsMenuItemTypeDto29;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto30 = new GroupsMenuItemTypeDto("VIDEO_ALBUM", 29, "video_album");
        VIDEO_ALBUM = groupsMenuItemTypeDto30;
        GroupsMenuItemTypeDto groupsMenuItemTypeDto31 = new GroupsMenuItemTypeDto("PODCAST", 30, "podcast");
        PODCAST = groupsMenuItemTypeDto31;
        GroupsMenuItemTypeDto[] groupsMenuItemTypeDtoArr = {groupsMenuItemTypeDto, groupsMenuItemTypeDto2, groupsMenuItemTypeDto3, groupsMenuItemTypeDto4, groupsMenuItemTypeDto5, groupsMenuItemTypeDto6, groupsMenuItemTypeDto7, groupsMenuItemTypeDto8, groupsMenuItemTypeDto9, groupsMenuItemTypeDto10, groupsMenuItemTypeDto11, groupsMenuItemTypeDto12, groupsMenuItemTypeDto13, groupsMenuItemTypeDto14, groupsMenuItemTypeDto15, groupsMenuItemTypeDto16, groupsMenuItemTypeDto17, groupsMenuItemTypeDto18, groupsMenuItemTypeDto19, groupsMenuItemTypeDto20, groupsMenuItemTypeDto21, groupsMenuItemTypeDto22, groupsMenuItemTypeDto23, groupsMenuItemTypeDto24, groupsMenuItemTypeDto25, groupsMenuItemTypeDto26, groupsMenuItemTypeDto27, groupsMenuItemTypeDto28, groupsMenuItemTypeDto29, groupsMenuItemTypeDto30, groupsMenuItemTypeDto31};
        $VALUES = groupsMenuItemTypeDtoArr;
        $ENTRIES = new asp(groupsMenuItemTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsMenuItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsMenuItemTypeDto valueOf(String str) {
        return (GroupsMenuItemTypeDto) Enum.valueOf(GroupsMenuItemTypeDto.class, str);
    }

    public static GroupsMenuItemTypeDto[] values() {
        return (GroupsMenuItemTypeDto[]) $VALUES.clone();
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
