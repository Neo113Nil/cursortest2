package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.account.dto.AccountInfoMarketAdult18plusDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetItemCardResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetItemCardResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetItemCardResponseDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<MarketItemCardErrorDto> errors;

    @pmi0("group_get")
    private final GroupsGroupFullDto groupGet;

    @pmi0("group_get_as_contact")
    private final GroupsGroupFullDto groupGetAsContact;

    @pmi0("group_get_members")
    private final MarketItemCardGroupGetMembersResponseObjectDto groupGetMembers;

    @pmi0("market_get_adult_18_plus")
    private final AccountInfoMarketAdult18plusDto marketGetAdult18Plus;

    @pmi0("market_get_buttons")
    private final MarketItemCardGetButtonsResponseObjectDto marketGetButtons;

    @pmi0("market_get_comments")
    private final MarketGetCommentsResponseObjectDto marketGetComments;

    @pmi0("market_get_counters")
    private final MarketGetCountersResponseObjectDto marketGetCounters;

    @pmi0("market_get_edit_url")
    private final MarketGetEditUrlResponseObjectDto marketGetEditUrl;

    @pmi0("market_get_item")
    private final MarketMarketGetItemResponseObjectDto marketGetItem;

    @pmi0("market_get_item_card_quick_messages")
    private final MarketGetItemCardQuickMessagesResponseObjectDto marketGetItemCardQuickMessages;

    @pmi0("market_get_item_reviews")
    private final MarketGetItemReviewsResponseObjectDto marketGetItemReviews;

    @pmi0("market_get_other_items")
    private final MarketMarketOtherItemsResponseObjectDto marketGetOtherItems;

    @pmi0("market_get_product_linked_content")
    private final MarketGetProductLinkedContentResponseObjectDto marketGetProductLinkedContent;

    @pmi0("market_get_promote_url")
    private final MarketGetPromoteUrlResponseObjectDto marketGetPromoteUrl;

    @pmi0("market_get_related_categories_block")
    private final MarketGetRelatedCategoriesBlockResponseObjectDto marketGetRelatedCategoriesBlock;

    @pmi0("market_get_seller_response_time")
    private final MarketGetSellerResponseTimeResponseObjectDto marketGetSellerResponseTime;

    @pmi0("market_get_similar_items")
    private final MarketGetSimilarItemsResponseObjectDto marketGetSimilarItems;

    @pmi0("user_get")
    private final UsersUserFullDto userGet;

    @pmi0("video_get")
    private final MarketItemCardVideoGetResponseObjectDto videoGet;

    /* compiled from: MarketGetItemCardResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetItemCardResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetItemCardResponseDto createFromParcel(Parcel parcel) {
            MarketMarketGetItemResponseObjectDto marketMarketGetItemResponseObjectDto;
            ArrayList arrayList;
            MarketMarketGetItemResponseObjectDto createFromParcel = parcel.readInt() == 0 ? null : MarketMarketGetItemResponseObjectDto.CREATOR.createFromParcel(parcel);
            GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) parcel.readParcelable(MarketGetItemCardResponseDto.class.getClassLoader());
            MarketItemCardGetButtonsResponseObjectDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketItemCardGetButtonsResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketGetCommentsResponseObjectDto createFromParcel3 = parcel.readInt() == 0 ? null : MarketGetCommentsResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketItemCardGroupGetMembersResponseObjectDto createFromParcel4 = parcel.readInt() == 0 ? null : MarketItemCardGroupGetMembersResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketItemCardVideoGetResponseObjectDto createFromParcel5 = parcel.readInt() == 0 ? null : MarketItemCardVideoGetResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketGetProductLinkedContentResponseObjectDto createFromParcel6 = parcel.readInt() == 0 ? null : MarketGetProductLinkedContentResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketGetSimilarItemsResponseObjectDto createFromParcel7 = parcel.readInt() == 0 ? null : MarketGetSimilarItemsResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketGetItemReviewsResponseObjectDto createFromParcel8 = parcel.readInt() == 0 ? null : MarketGetItemReviewsResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketGetCountersResponseObjectDto createFromParcel9 = parcel.readInt() == 0 ? null : MarketGetCountersResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketGetEditUrlResponseObjectDto createFromParcel10 = parcel.readInt() == 0 ? null : MarketGetEditUrlResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketGetPromoteUrlResponseObjectDto createFromParcel11 = parcel.readInt() == 0 ? null : MarketGetPromoteUrlResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketGetRelatedCategoriesBlockResponseObjectDto createFromParcel12 = parcel.readInt() == 0 ? null : MarketGetRelatedCategoriesBlockResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketGetItemCardQuickMessagesResponseObjectDto createFromParcel13 = parcel.readInt() == 0 ? null : MarketGetItemCardQuickMessagesResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketGetSellerResponseTimeResponseObjectDto createFromParcel14 = parcel.readInt() == 0 ? null : MarketGetSellerResponseTimeResponseObjectDto.CREATOR.createFromParcel(parcel);
            MarketMarketOtherItemsResponseObjectDto createFromParcel15 = parcel.readInt() == 0 ? null : MarketMarketOtherItemsResponseObjectDto.CREATOR.createFromParcel(parcel);
            AccountInfoMarketAdult18plusDto accountInfoMarketAdult18plusDto = (AccountInfoMarketAdult18plusDto) parcel.readParcelable(MarketGetItemCardResponseDto.class.getClassLoader());
            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) parcel.readParcelable(MarketGetItemCardResponseDto.class.getClassLoader());
            GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) parcel.readParcelable(MarketGetItemCardResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
                marketMarketGetItemResponseObjectDto = createFromParcel;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketItemCardErrorDto.CREATOR, parcel, arrayList2, i, 1);
                    readInt = readInt;
                    createFromParcel = createFromParcel;
                }
                marketMarketGetItemResponseObjectDto = createFromParcel;
                arrayList = arrayList2;
            }
            return new MarketGetItemCardResponseDto(marketMarketGetItemResponseObjectDto, groupsGroupFullDto, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, createFromParcel11, createFromParcel12, createFromParcel13, createFromParcel14, createFromParcel15, accountInfoMarketAdult18plusDto, usersUserFullDto, groupsGroupFullDto2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetItemCardResponseDto[] newArray(int i) {
            return new MarketGetItemCardResponseDto[i];
        }
    }

    public MarketGetItemCardResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public final MarketItemCardVideoGetResponseObjectDto B() {
        return this.videoGet;
    }

    public final GroupsGroupFullDto d() {
        return this.groupGet;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsGroupFullDto e() {
        return this.groupGetAsContact;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetItemCardResponseDto)) {
            return false;
        }
        MarketGetItemCardResponseDto marketGetItemCardResponseDto = (MarketGetItemCardResponseDto) obj;
        return epx.f(this.marketGetItem, marketGetItemCardResponseDto.marketGetItem) && epx.f(this.groupGet, marketGetItemCardResponseDto.groupGet) && epx.f(this.marketGetButtons, marketGetItemCardResponseDto.marketGetButtons) && epx.f(this.marketGetComments, marketGetItemCardResponseDto.marketGetComments) && epx.f(this.groupGetMembers, marketGetItemCardResponseDto.groupGetMembers) && epx.f(this.videoGet, marketGetItemCardResponseDto.videoGet) && epx.f(this.marketGetProductLinkedContent, marketGetItemCardResponseDto.marketGetProductLinkedContent) && epx.f(this.marketGetSimilarItems, marketGetItemCardResponseDto.marketGetSimilarItems) && epx.f(this.marketGetItemReviews, marketGetItemCardResponseDto.marketGetItemReviews) && epx.f(this.marketGetCounters, marketGetItemCardResponseDto.marketGetCounters) && epx.f(this.marketGetEditUrl, marketGetItemCardResponseDto.marketGetEditUrl) && epx.f(this.marketGetPromoteUrl, marketGetItemCardResponseDto.marketGetPromoteUrl) && epx.f(this.marketGetRelatedCategoriesBlock, marketGetItemCardResponseDto.marketGetRelatedCategoriesBlock) && epx.f(this.marketGetItemCardQuickMessages, marketGetItemCardResponseDto.marketGetItemCardQuickMessages) && epx.f(this.marketGetSellerResponseTime, marketGetItemCardResponseDto.marketGetSellerResponseTime) && epx.f(this.marketGetOtherItems, marketGetItemCardResponseDto.marketGetOtherItems) && epx.f(this.marketGetAdult18Plus, marketGetItemCardResponseDto.marketGetAdult18Plus) && epx.f(this.userGet, marketGetItemCardResponseDto.userGet) && epx.f(this.groupGetAsContact, marketGetItemCardResponseDto.groupGetAsContact) && epx.f(this.errors, marketGetItemCardResponseDto.errors);
    }

    public final MarketItemCardGetButtonsResponseObjectDto f() {
        return this.marketGetButtons;
    }

    public final MarketGetEditUrlResponseObjectDto g() {
        return this.marketGetEditUrl;
    }

    public final int hashCode() {
        MarketMarketGetItemResponseObjectDto marketMarketGetItemResponseObjectDto = this.marketGetItem;
        int hashCode = (marketMarketGetItemResponseObjectDto == null ? 0 : marketMarketGetItemResponseObjectDto.hashCode()) * 31;
        GroupsGroupFullDto groupsGroupFullDto = this.groupGet;
        int hashCode2 = (hashCode + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
        MarketItemCardGetButtonsResponseObjectDto marketItemCardGetButtonsResponseObjectDto = this.marketGetButtons;
        int hashCode3 = (hashCode2 + (marketItemCardGetButtonsResponseObjectDto == null ? 0 : marketItemCardGetButtonsResponseObjectDto.hashCode())) * 31;
        MarketGetCommentsResponseObjectDto marketGetCommentsResponseObjectDto = this.marketGetComments;
        int hashCode4 = (hashCode3 + (marketGetCommentsResponseObjectDto == null ? 0 : marketGetCommentsResponseObjectDto.hashCode())) * 31;
        MarketItemCardGroupGetMembersResponseObjectDto marketItemCardGroupGetMembersResponseObjectDto = this.groupGetMembers;
        int hashCode5 = (hashCode4 + (marketItemCardGroupGetMembersResponseObjectDto == null ? 0 : marketItemCardGroupGetMembersResponseObjectDto.hashCode())) * 31;
        MarketItemCardVideoGetResponseObjectDto marketItemCardVideoGetResponseObjectDto = this.videoGet;
        int hashCode6 = (hashCode5 + (marketItemCardVideoGetResponseObjectDto == null ? 0 : marketItemCardVideoGetResponseObjectDto.hashCode())) * 31;
        MarketGetProductLinkedContentResponseObjectDto marketGetProductLinkedContentResponseObjectDto = this.marketGetProductLinkedContent;
        int hashCode7 = (hashCode6 + (marketGetProductLinkedContentResponseObjectDto == null ? 0 : marketGetProductLinkedContentResponseObjectDto.hashCode())) * 31;
        MarketGetSimilarItemsResponseObjectDto marketGetSimilarItemsResponseObjectDto = this.marketGetSimilarItems;
        int hashCode8 = (hashCode7 + (marketGetSimilarItemsResponseObjectDto == null ? 0 : marketGetSimilarItemsResponseObjectDto.hashCode())) * 31;
        MarketGetItemReviewsResponseObjectDto marketGetItemReviewsResponseObjectDto = this.marketGetItemReviews;
        int hashCode9 = (hashCode8 + (marketGetItemReviewsResponseObjectDto == null ? 0 : marketGetItemReviewsResponseObjectDto.hashCode())) * 31;
        MarketGetCountersResponseObjectDto marketGetCountersResponseObjectDto = this.marketGetCounters;
        int hashCode10 = (hashCode9 + (marketGetCountersResponseObjectDto == null ? 0 : marketGetCountersResponseObjectDto.hashCode())) * 31;
        MarketGetEditUrlResponseObjectDto marketGetEditUrlResponseObjectDto = this.marketGetEditUrl;
        int hashCode11 = (hashCode10 + (marketGetEditUrlResponseObjectDto == null ? 0 : marketGetEditUrlResponseObjectDto.hashCode())) * 31;
        MarketGetPromoteUrlResponseObjectDto marketGetPromoteUrlResponseObjectDto = this.marketGetPromoteUrl;
        int hashCode12 = (hashCode11 + (marketGetPromoteUrlResponseObjectDto == null ? 0 : marketGetPromoteUrlResponseObjectDto.hashCode())) * 31;
        MarketGetRelatedCategoriesBlockResponseObjectDto marketGetRelatedCategoriesBlockResponseObjectDto = this.marketGetRelatedCategoriesBlock;
        int hashCode13 = (hashCode12 + (marketGetRelatedCategoriesBlockResponseObjectDto == null ? 0 : marketGetRelatedCategoriesBlockResponseObjectDto.hashCode())) * 31;
        MarketGetItemCardQuickMessagesResponseObjectDto marketGetItemCardQuickMessagesResponseObjectDto = this.marketGetItemCardQuickMessages;
        int hashCode14 = (hashCode13 + (marketGetItemCardQuickMessagesResponseObjectDto == null ? 0 : marketGetItemCardQuickMessagesResponseObjectDto.hashCode())) * 31;
        MarketGetSellerResponseTimeResponseObjectDto marketGetSellerResponseTimeResponseObjectDto = this.marketGetSellerResponseTime;
        int hashCode15 = (hashCode14 + (marketGetSellerResponseTimeResponseObjectDto == null ? 0 : marketGetSellerResponseTimeResponseObjectDto.hashCode())) * 31;
        MarketMarketOtherItemsResponseObjectDto marketMarketOtherItemsResponseObjectDto = this.marketGetOtherItems;
        int hashCode16 = (hashCode15 + (marketMarketOtherItemsResponseObjectDto == null ? 0 : marketMarketOtherItemsResponseObjectDto.hashCode())) * 31;
        AccountInfoMarketAdult18plusDto accountInfoMarketAdult18plusDto = this.marketGetAdult18Plus;
        int hashCode17 = (hashCode16 + (accountInfoMarketAdult18plusDto == null ? 0 : accountInfoMarketAdult18plusDto.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.userGet;
        int hashCode18 = (hashCode17 + (usersUserFullDto == null ? 0 : usersUserFullDto.hashCode())) * 31;
        GroupsGroupFullDto groupsGroupFullDto2 = this.groupGetAsContact;
        int hashCode19 = (hashCode18 + (groupsGroupFullDto2 == null ? 0 : groupsGroupFullDto2.hashCode())) * 31;
        List<MarketItemCardErrorDto> list = this.errors;
        return hashCode19 + (list != null ? list.hashCode() : 0);
    }

    public final MarketMarketGetItemResponseObjectDto i() {
        return this.marketGetItem;
    }

    public final MarketGetItemCardQuickMessagesResponseObjectDto j() {
        return this.marketGetItemCardQuickMessages;
    }

    public final MarketGetItemReviewsResponseObjectDto k() {
        return this.marketGetItemReviews;
    }

    public final MarketMarketOtherItemsResponseObjectDto l() {
        return this.marketGetOtherItems;
    }

    public final MarketGetProductLinkedContentResponseObjectDto n() {
        return this.marketGetProductLinkedContent;
    }

    public final MarketGetPromoteUrlResponseObjectDto o() {
        return this.marketGetPromoteUrl;
    }

    public final MarketGetRelatedCategoriesBlockResponseObjectDto p() {
        return this.marketGetRelatedCategoriesBlock;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetItemCardResponseDto(marketGetItem=");
        sb.append(this.marketGetItem);
        sb.append(", groupGet=");
        sb.append(this.groupGet);
        sb.append(", marketGetButtons=");
        sb.append(this.marketGetButtons);
        sb.append(", marketGetComments=");
        sb.append(this.marketGetComments);
        sb.append(", groupGetMembers=");
        sb.append(this.groupGetMembers);
        sb.append(", videoGet=");
        sb.append(this.videoGet);
        sb.append(", marketGetProductLinkedContent=");
        sb.append(this.marketGetProductLinkedContent);
        sb.append(", marketGetSimilarItems=");
        sb.append(this.marketGetSimilarItems);
        sb.append(", marketGetItemReviews=");
        sb.append(this.marketGetItemReviews);
        sb.append(", marketGetCounters=");
        sb.append(this.marketGetCounters);
        sb.append(", marketGetEditUrl=");
        sb.append(this.marketGetEditUrl);
        sb.append(", marketGetPromoteUrl=");
        sb.append(this.marketGetPromoteUrl);
        sb.append(", marketGetRelatedCategoriesBlock=");
        sb.append(this.marketGetRelatedCategoriesBlock);
        sb.append(", marketGetItemCardQuickMessages=");
        sb.append(this.marketGetItemCardQuickMessages);
        sb.append(", marketGetSellerResponseTime=");
        sb.append(this.marketGetSellerResponseTime);
        sb.append(", marketGetOtherItems=");
        sb.append(this.marketGetOtherItems);
        sb.append(", marketGetAdult18Plus=");
        sb.append(this.marketGetAdult18Plus);
        sb.append(", userGet=");
        sb.append(this.userGet);
        sb.append(", groupGetAsContact=");
        sb.append(this.groupGetAsContact);
        sb.append(", errors=");
        return ms9.a(')', sb, this.errors);
    }

    public final MarketGetSellerResponseTimeResponseObjectDto u() {
        return this.marketGetSellerResponseTime;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MarketMarketGetItemResponseObjectDto marketMarketGetItemResponseObjectDto = this.marketGetItem;
        if (marketMarketGetItemResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketGetItemResponseObjectDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.groupGet, i);
        MarketItemCardGetButtonsResponseObjectDto marketItemCardGetButtonsResponseObjectDto = this.marketGetButtons;
        if (marketItemCardGetButtonsResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemCardGetButtonsResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketGetCommentsResponseObjectDto marketGetCommentsResponseObjectDto = this.marketGetComments;
        if (marketGetCommentsResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketGetCommentsResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketItemCardGroupGetMembersResponseObjectDto marketItemCardGroupGetMembersResponseObjectDto = this.groupGetMembers;
        if (marketItemCardGroupGetMembersResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemCardGroupGetMembersResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketItemCardVideoGetResponseObjectDto marketItemCardVideoGetResponseObjectDto = this.videoGet;
        if (marketItemCardVideoGetResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemCardVideoGetResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketGetProductLinkedContentResponseObjectDto marketGetProductLinkedContentResponseObjectDto = this.marketGetProductLinkedContent;
        if (marketGetProductLinkedContentResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketGetProductLinkedContentResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketGetSimilarItemsResponseObjectDto marketGetSimilarItemsResponseObjectDto = this.marketGetSimilarItems;
        if (marketGetSimilarItemsResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketGetSimilarItemsResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketGetItemReviewsResponseObjectDto marketGetItemReviewsResponseObjectDto = this.marketGetItemReviews;
        if (marketGetItemReviewsResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketGetItemReviewsResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketGetCountersResponseObjectDto marketGetCountersResponseObjectDto = this.marketGetCounters;
        if (marketGetCountersResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketGetCountersResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketGetEditUrlResponseObjectDto marketGetEditUrlResponseObjectDto = this.marketGetEditUrl;
        if (marketGetEditUrlResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketGetEditUrlResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketGetPromoteUrlResponseObjectDto marketGetPromoteUrlResponseObjectDto = this.marketGetPromoteUrl;
        if (marketGetPromoteUrlResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketGetPromoteUrlResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketGetRelatedCategoriesBlockResponseObjectDto marketGetRelatedCategoriesBlockResponseObjectDto = this.marketGetRelatedCategoriesBlock;
        if (marketGetRelatedCategoriesBlockResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketGetRelatedCategoriesBlockResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketGetItemCardQuickMessagesResponseObjectDto marketGetItemCardQuickMessagesResponseObjectDto = this.marketGetItemCardQuickMessages;
        if (marketGetItemCardQuickMessagesResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketGetItemCardQuickMessagesResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketGetSellerResponseTimeResponseObjectDto marketGetSellerResponseTimeResponseObjectDto = this.marketGetSellerResponseTime;
        if (marketGetSellerResponseTimeResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketGetSellerResponseTimeResponseObjectDto.writeToParcel(parcel, i);
        }
        MarketMarketOtherItemsResponseObjectDto marketMarketOtherItemsResponseObjectDto = this.marketGetOtherItems;
        if (marketMarketOtherItemsResponseObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketOtherItemsResponseObjectDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.marketGetAdult18Plus, i);
        parcel.writeParcelable(this.userGet, i);
        parcel.writeParcelable(this.groupGetAsContact, i);
        List<MarketItemCardErrorDto> list = this.errors;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketItemCardErrorDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MarketGetItemCardResponseDto(MarketMarketGetItemResponseObjectDto marketMarketGetItemResponseObjectDto, GroupsGroupFullDto groupsGroupFullDto, MarketItemCardGetButtonsResponseObjectDto marketItemCardGetButtonsResponseObjectDto, MarketGetCommentsResponseObjectDto marketGetCommentsResponseObjectDto, MarketItemCardGroupGetMembersResponseObjectDto marketItemCardGroupGetMembersResponseObjectDto, MarketItemCardVideoGetResponseObjectDto marketItemCardVideoGetResponseObjectDto, MarketGetProductLinkedContentResponseObjectDto marketGetProductLinkedContentResponseObjectDto, MarketGetSimilarItemsResponseObjectDto marketGetSimilarItemsResponseObjectDto, MarketGetItemReviewsResponseObjectDto marketGetItemReviewsResponseObjectDto, MarketGetCountersResponseObjectDto marketGetCountersResponseObjectDto, MarketGetEditUrlResponseObjectDto marketGetEditUrlResponseObjectDto, MarketGetPromoteUrlResponseObjectDto marketGetPromoteUrlResponseObjectDto, MarketGetRelatedCategoriesBlockResponseObjectDto marketGetRelatedCategoriesBlockResponseObjectDto, MarketGetItemCardQuickMessagesResponseObjectDto marketGetItemCardQuickMessagesResponseObjectDto, MarketGetSellerResponseTimeResponseObjectDto marketGetSellerResponseTimeResponseObjectDto, MarketMarketOtherItemsResponseObjectDto marketMarketOtherItemsResponseObjectDto, AccountInfoMarketAdult18plusDto accountInfoMarketAdult18plusDto, UsersUserFullDto usersUserFullDto, GroupsGroupFullDto groupsGroupFullDto2, List<MarketItemCardErrorDto> list) {
        this.marketGetItem = marketMarketGetItemResponseObjectDto;
        this.groupGet = groupsGroupFullDto;
        this.marketGetButtons = marketItemCardGetButtonsResponseObjectDto;
        this.marketGetComments = marketGetCommentsResponseObjectDto;
        this.groupGetMembers = marketItemCardGroupGetMembersResponseObjectDto;
        this.videoGet = marketItemCardVideoGetResponseObjectDto;
        this.marketGetProductLinkedContent = marketGetProductLinkedContentResponseObjectDto;
        this.marketGetSimilarItems = marketGetSimilarItemsResponseObjectDto;
        this.marketGetItemReviews = marketGetItemReviewsResponseObjectDto;
        this.marketGetCounters = marketGetCountersResponseObjectDto;
        this.marketGetEditUrl = marketGetEditUrlResponseObjectDto;
        this.marketGetPromoteUrl = marketGetPromoteUrlResponseObjectDto;
        this.marketGetRelatedCategoriesBlock = marketGetRelatedCategoriesBlockResponseObjectDto;
        this.marketGetItemCardQuickMessages = marketGetItemCardQuickMessagesResponseObjectDto;
        this.marketGetSellerResponseTime = marketGetSellerResponseTimeResponseObjectDto;
        this.marketGetOtherItems = marketMarketOtherItemsResponseObjectDto;
        this.marketGetAdult18Plus = accountInfoMarketAdult18plusDto;
        this.userGet = usersUserFullDto;
        this.groupGetAsContact = groupsGroupFullDto2;
        this.errors = list;
    }

    public /* synthetic */ MarketGetItemCardResponseDto(MarketMarketGetItemResponseObjectDto marketMarketGetItemResponseObjectDto, GroupsGroupFullDto groupsGroupFullDto, MarketItemCardGetButtonsResponseObjectDto marketItemCardGetButtonsResponseObjectDto, MarketGetCommentsResponseObjectDto marketGetCommentsResponseObjectDto, MarketItemCardGroupGetMembersResponseObjectDto marketItemCardGroupGetMembersResponseObjectDto, MarketItemCardVideoGetResponseObjectDto marketItemCardVideoGetResponseObjectDto, MarketGetProductLinkedContentResponseObjectDto marketGetProductLinkedContentResponseObjectDto, MarketGetSimilarItemsResponseObjectDto marketGetSimilarItemsResponseObjectDto, MarketGetItemReviewsResponseObjectDto marketGetItemReviewsResponseObjectDto, MarketGetCountersResponseObjectDto marketGetCountersResponseObjectDto, MarketGetEditUrlResponseObjectDto marketGetEditUrlResponseObjectDto, MarketGetPromoteUrlResponseObjectDto marketGetPromoteUrlResponseObjectDto, MarketGetRelatedCategoriesBlockResponseObjectDto marketGetRelatedCategoriesBlockResponseObjectDto, MarketGetItemCardQuickMessagesResponseObjectDto marketGetItemCardQuickMessagesResponseObjectDto, MarketGetSellerResponseTimeResponseObjectDto marketGetSellerResponseTimeResponseObjectDto, MarketMarketOtherItemsResponseObjectDto marketMarketOtherItemsResponseObjectDto, AccountInfoMarketAdult18plusDto accountInfoMarketAdult18plusDto, UsersUserFullDto usersUserFullDto, GroupsGroupFullDto groupsGroupFullDto2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketMarketGetItemResponseObjectDto, (i & 2) != 0 ? null : groupsGroupFullDto, (i & 4) != 0 ? null : marketItemCardGetButtonsResponseObjectDto, (i & 8) != 0 ? null : marketGetCommentsResponseObjectDto, (i & 16) != 0 ? null : marketItemCardGroupGetMembersResponseObjectDto, (i & 32) != 0 ? null : marketItemCardVideoGetResponseObjectDto, (i & 64) != 0 ? null : marketGetProductLinkedContentResponseObjectDto, (i & 128) != 0 ? null : marketGetSimilarItemsResponseObjectDto, (i & 256) != 0 ? null : marketGetItemReviewsResponseObjectDto, (i & 512) != 0 ? null : marketGetCountersResponseObjectDto, (i & 1024) != 0 ? null : marketGetEditUrlResponseObjectDto, (i & 2048) != 0 ? null : marketGetPromoteUrlResponseObjectDto, (i & 4096) != 0 ? null : marketGetRelatedCategoriesBlockResponseObjectDto, (i & 8192) != 0 ? null : marketGetItemCardQuickMessagesResponseObjectDto, (i & 16384) != 0 ? null : marketGetSellerResponseTimeResponseObjectDto, (i & 32768) != 0 ? null : marketMarketOtherItemsResponseObjectDto, (i & 65536) != 0 ? null : accountInfoMarketAdult18plusDto, (i & 131072) != 0 ? null : usersUserFullDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : groupsGroupFullDto2, (i & 524288) != 0 ? null : list);
    }
}
