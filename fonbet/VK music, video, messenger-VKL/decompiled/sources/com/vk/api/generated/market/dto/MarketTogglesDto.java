package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketTogglesDto.kt */
/* loaded from: classes15.dex */
public final class MarketTogglesDto implements Parcelable {
    public static final Parcelable.Creator<MarketTogglesDto> CREATOR = new a();

    @pmi0("community_review_anonymous_settings_reviews_show")
    private final Boolean communityReviewAnonymousSettingsReviewsShow;

    @pmi0("creation_form_mobile_redesign")
    private final Boolean creationFormMobileRedesign;

    @pmi0("extract_settings_from_groups_vkui")
    private final Boolean extractSettingsFromGroupsVkui;

    @pmi0("is_base_market_items_admin_enabled")
    private final Boolean isBaseMarketItemsAdminEnabled;

    @pmi0("is_go_uploader")
    private final Boolean isGoUploader;

    @pmi0("is_new_categories_tree")
    private final Boolean isNewCategoriesTree;

    @pmi0("is_unified_market")
    private final Boolean isUnifiedMarket;

    @pmi0("market_video_attach")
    private final Boolean marketVideoAttach;

    @pmi0("show_market_item_comments_description")
    private final Boolean showMarketItemCommentsDescription;

    /* compiled from: MarketTogglesDto.kt */
    public static final class a implements Parcelable.Creator<MarketTogglesDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketTogglesDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketTogglesDto(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketTogglesDto[] newArray(int i) {
            return new MarketTogglesDto[i];
        }
    }

    public MarketTogglesDto() {
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
        if (!(obj instanceof MarketTogglesDto)) {
            return false;
        }
        MarketTogglesDto marketTogglesDto = (MarketTogglesDto) obj;
        return epx.f(this.creationFormMobileRedesign, marketTogglesDto.creationFormMobileRedesign) && epx.f(this.isNewCategoriesTree, marketTogglesDto.isNewCategoriesTree) && epx.f(this.marketVideoAttach, marketTogglesDto.marketVideoAttach) && epx.f(this.isGoUploader, marketTogglesDto.isGoUploader) && epx.f(this.extractSettingsFromGroupsVkui, marketTogglesDto.extractSettingsFromGroupsVkui) && epx.f(this.communityReviewAnonymousSettingsReviewsShow, marketTogglesDto.communityReviewAnonymousSettingsReviewsShow) && epx.f(this.showMarketItemCommentsDescription, marketTogglesDto.showMarketItemCommentsDescription) && epx.f(this.isBaseMarketItemsAdminEnabled, marketTogglesDto.isBaseMarketItemsAdminEnabled) && epx.f(this.isUnifiedMarket, marketTogglesDto.isUnifiedMarket);
    }

    public final int hashCode() {
        Boolean bool = this.creationFormMobileRedesign;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isNewCategoriesTree;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.marketVideoAttach;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isGoUploader;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.extractSettingsFromGroupsVkui;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.communityReviewAnonymousSettingsReviewsShow;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.showMarketItemCommentsDescription;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.isBaseMarketItemsAdminEnabled;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isUnifiedMarket;
        return hashCode8 + (bool9 != null ? bool9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketTogglesDto(creationFormMobileRedesign=");
        sb.append(this.creationFormMobileRedesign);
        sb.append(", isNewCategoriesTree=");
        sb.append(this.isNewCategoriesTree);
        sb.append(", marketVideoAttach=");
        sb.append(this.marketVideoAttach);
        sb.append(", isGoUploader=");
        sb.append(this.isGoUploader);
        sb.append(", extractSettingsFromGroupsVkui=");
        sb.append(this.extractSettingsFromGroupsVkui);
        sb.append(", communityReviewAnonymousSettingsReviewsShow=");
        sb.append(this.communityReviewAnonymousSettingsReviewsShow);
        sb.append(", showMarketItemCommentsDescription=");
        sb.append(this.showMarketItemCommentsDescription);
        sb.append(", isBaseMarketItemsAdminEnabled=");
        sb.append(this.isBaseMarketItemsAdminEnabled);
        sb.append(", isUnifiedMarket=");
        return tn.a(sb, this.isUnifiedMarket, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.creationFormMobileRedesign;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isNewCategoriesTree;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.marketVideoAttach;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isGoUploader;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.extractSettingsFromGroupsVkui;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.communityReviewAnonymousSettingsReviewsShow;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.showMarketItemCommentsDescription;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Boolean bool8 = this.isBaseMarketItemsAdminEnabled;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.isUnifiedMarket;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
    }

    public MarketTogglesDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9) {
        this.creationFormMobileRedesign = bool;
        this.isNewCategoriesTree = bool2;
        this.marketVideoAttach = bool3;
        this.isGoUploader = bool4;
        this.extractSettingsFromGroupsVkui = bool5;
        this.communityReviewAnonymousSettingsReviewsShow = bool6;
        this.showMarketItemCommentsDescription = bool7;
        this.isBaseMarketItemsAdminEnabled = bool8;
        this.isUnifiedMarket = bool9;
    }

    public /* synthetic */ MarketTogglesDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : bool6, (i & 64) != 0 ? null : bool7, (i & 128) != 0 ? null : bool8, (i & 256) != 0 ? null : bool9);
    }
}
