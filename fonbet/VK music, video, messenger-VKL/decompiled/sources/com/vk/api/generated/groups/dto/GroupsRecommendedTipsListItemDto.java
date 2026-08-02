package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.mbridge.msdk.foundation.entity.b;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsRecommendedTipsListItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsRecommendedTipsListItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsRecommendedTipsListItemDto> CREATOR = new a();

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("completed_button_text")
    private final String completedButtonText;

    @pmi0("description")
    private final String description;

    @pmi0("internal_link")
    private final String internalLink;

    @pmi0("is_completed")
    private final boolean isCompleted;

    @pmi0("miniapp_link")
    private final String miniappLink;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("tip_type")
    private final TipTypeDto tipType;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsRecommendedTipsListItemDto.kt */
    public static final class TipTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TipTypeDto[] $VALUES;

        @pmi0("action_button")
        public static final TipTypeDto ACTION_BUTTON;

        @pmi0(RTCStatsConstants.KEY_ADDRESS)
        public static final TipTypeDto ADDRESS;

        @pmi0(b.JSON_KEY_ADS)
        public static final TipTypeDto ADS;

        @pmi0("cover_image")
        public static final TipTypeDto COVER_IMAGE;
        public static final Parcelable.Creator<TipTypeDto> CREATOR;

        @pmi0("description")
        public static final TipTypeDto DESCRIPTION;

        @pmi0("invite_friends")
        public static final TipTypeDto INVITE_FRIENDS;

        @pmi0("load_avatar")
        public static final TipTypeDto LOAD_AVATAR;

        @pmi0("make_post")
        public static final TipTypeDto MAKE_POST;

        @pmi0("market_item")
        public static final TipTypeDto MARKET_ITEM;

        @pmi0("short_url")
        public static final TipTypeDto SHORT_URL;

        @pmi0("subscribe_vk_news")
        public static final TipTypeDto SUBSCRIBE_VK_NEWS;

        @pmi0("vkconnect")
        public static final TipTypeDto VKCONNECT;
        private final String value;

        /* compiled from: GroupsRecommendedTipsListItemDto.kt */
        public static final class a implements Parcelable.Creator<TipTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TipTypeDto createFromParcel(Parcel parcel) {
                return TipTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TipTypeDto[] newArray(int i) {
                return new TipTypeDto[i];
            }
        }

        static {
            TipTypeDto tipTypeDto = new TipTypeDto("LOAD_AVATAR", 0, "load_avatar");
            LOAD_AVATAR = tipTypeDto;
            TipTypeDto tipTypeDto2 = new TipTypeDto(NativeAdContent.ViewTag.AD_DESCRIPTION, 1, "description");
            DESCRIPTION = tipTypeDto2;
            TipTypeDto tipTypeDto3 = new TipTypeDto("SHORT_URL", 2, "short_url");
            SHORT_URL = tipTypeDto3;
            TipTypeDto tipTypeDto4 = new TipTypeDto("ADDRESS", 3, RTCStatsConstants.KEY_ADDRESS);
            ADDRESS = tipTypeDto4;
            TipTypeDto tipTypeDto5 = new TipTypeDto("ACTION_BUTTON", 4, "action_button");
            ACTION_BUTTON = tipTypeDto5;
            TipTypeDto tipTypeDto6 = new TipTypeDto("MARKET_ITEM", 5, "market_item");
            MARKET_ITEM = tipTypeDto6;
            TipTypeDto tipTypeDto7 = new TipTypeDto("MAKE_POST", 6, "make_post");
            MAKE_POST = tipTypeDto7;
            TipTypeDto tipTypeDto8 = new TipTypeDto("COVER_IMAGE", 7, "cover_image");
            COVER_IMAGE = tipTypeDto8;
            TipTypeDto tipTypeDto9 = new TipTypeDto("SUBSCRIBE_VK_NEWS", 8, "subscribe_vk_news");
            SUBSCRIBE_VK_NEWS = tipTypeDto9;
            TipTypeDto tipTypeDto10 = new TipTypeDto("INVITE_FRIENDS", 9, "invite_friends");
            INVITE_FRIENDS = tipTypeDto10;
            TipTypeDto tipTypeDto11 = new TipTypeDto("ADS", 10, b.JSON_KEY_ADS);
            ADS = tipTypeDto11;
            TipTypeDto tipTypeDto12 = new TipTypeDto("VKCONNECT", 11, "vkconnect");
            VKCONNECT = tipTypeDto12;
            TipTypeDto[] tipTypeDtoArr = {tipTypeDto, tipTypeDto2, tipTypeDto3, tipTypeDto4, tipTypeDto5, tipTypeDto6, tipTypeDto7, tipTypeDto8, tipTypeDto9, tipTypeDto10, tipTypeDto11, tipTypeDto12};
            $VALUES = tipTypeDtoArr;
            $ENTRIES = new asp(tipTypeDtoArr);
            CREATOR = new a();
        }

        private TipTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TipTypeDto valueOf(String str) {
            return (TipTypeDto) Enum.valueOf(TipTypeDto.class, str);
        }

        public static TipTypeDto[] values() {
            return (TipTypeDto[]) $VALUES.clone();
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

    /* compiled from: GroupsRecommendedTipsListItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsRecommendedTipsListItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsRecommendedTipsListItemDto createFromParcel(Parcel parcel) {
            return new GroupsRecommendedTipsListItemDto(TipTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsRecommendedTipsListItemDto[] newArray(int i) {
            return new GroupsRecommendedTipsListItemDto[i];
        }
    }

    public GroupsRecommendedTipsListItemDto(TipTypeDto tipTypeDto, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.tipType = tipTypeDto;
        this.title = str;
        this.subtitle = str2;
        this.description = str3;
        this.buttonText = str4;
        this.miniappLink = str5;
        this.internalLink = str6;
        this.isCompleted = z;
        this.completedButtonText = str7;
    }

    public final String d() {
        return this.internalLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.miniappLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsRecommendedTipsListItemDto)) {
            return false;
        }
        GroupsRecommendedTipsListItemDto groupsRecommendedTipsListItemDto = (GroupsRecommendedTipsListItemDto) obj;
        return this.tipType == groupsRecommendedTipsListItemDto.tipType && epx.f(this.title, groupsRecommendedTipsListItemDto.title) && epx.f(this.subtitle, groupsRecommendedTipsListItemDto.subtitle) && epx.f(this.description, groupsRecommendedTipsListItemDto.description) && epx.f(this.buttonText, groupsRecommendedTipsListItemDto.buttonText) && epx.f(this.miniappLink, groupsRecommendedTipsListItemDto.miniappLink) && epx.f(this.internalLink, groupsRecommendedTipsListItemDto.internalLink) && this.isCompleted == groupsRecommendedTipsListItemDto.isCompleted && epx.f(this.completedButtonText, groupsRecommendedTipsListItemDto.completedButtonText);
    }

    public final TipTypeDto f() {
        return this.tipType;
    }

    public final boolean g() {
        return this.isCompleted;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(this.tipType.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.description), 31, this.buttonText), 31, this.miniappLink), 31, this.internalLink), 31, this.isCompleted);
        String str = this.completedButtonText;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsRecommendedTipsListItemDto(tipType=");
        sb.append(this.tipType);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", miniappLink=");
        sb.append(this.miniappLink);
        sb.append(", internalLink=");
        sb.append(this.internalLink);
        sb.append(", isCompleted=");
        sb.append(this.isCompleted);
        sb.append(", completedButtonText=");
        return ho8.a(sb, this.completedButtonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.tipType.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.description);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.miniappLink);
        parcel.writeString(this.internalLink);
        parcel.writeInt(this.isCompleted ? 1 : 0);
        parcel.writeString(this.completedButtonText);
    }

    public /* synthetic */ GroupsRecommendedTipsListItemDto(TipTypeDto tipTypeDto, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, int i, zcl zclVar) {
        this(tipTypeDto, str, str2, str3, str4, str5, str6, z, (i & 256) != 0 ? null : str7);
    }
}
