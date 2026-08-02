package com.vk.sdk.api.newsfeed.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.sdk.api.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedExpertCardWidgetDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedExpertCardWidgetDto {

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final NewsfeedExpertCardWidgetRatingDto rating;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    public NewsfeedExpertCardWidgetDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedExpertCardWidgetDto)) {
            return false;
        }
        NewsfeedExpertCardWidgetDto newsfeedExpertCardWidgetDto = (NewsfeedExpertCardWidgetDto) obj;
        return epx.f(this.rating, newsfeedExpertCardWidgetDto.rating) && epx.f(this.title, newsfeedExpertCardWidgetDto.title) && epx.f(this.subtitle, newsfeedExpertCardWidgetDto.subtitle) && epx.f(this.action, newsfeedExpertCardWidgetDto.action);
    }

    public final int hashCode() {
        NewsfeedExpertCardWidgetRatingDto newsfeedExpertCardWidgetRatingDto = this.rating;
        int hashCode = (newsfeedExpertCardWidgetRatingDto == null ? 0 : newsfeedExpertCardWidgetRatingDto.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        return hashCode3 + (baseLinkButtonActionDto != null ? baseLinkButtonActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedExpertCardWidgetDto(rating=" + this.rating + ", title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ")";
    }

    public NewsfeedExpertCardWidgetDto(NewsfeedExpertCardWidgetRatingDto newsfeedExpertCardWidgetRatingDto, String str, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto) {
        this.rating = newsfeedExpertCardWidgetRatingDto;
        this.title = str;
        this.subtitle = str2;
        this.action = baseLinkButtonActionDto;
    }

    public /* synthetic */ NewsfeedExpertCardWidgetDto(NewsfeedExpertCardWidgetRatingDto newsfeedExpertCardWidgetRatingDto, String str, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedExpertCardWidgetRatingDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : baseLinkButtonActionDto);
    }
}
