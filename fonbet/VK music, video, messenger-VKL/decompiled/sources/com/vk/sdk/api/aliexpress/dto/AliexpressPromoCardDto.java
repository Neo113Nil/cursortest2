package com.vk.sdk.api.aliexpress.dto;

import com.vk.sdk.api.base.dto.BaseLinkButtonDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import xsna.epx;
import xsna.kr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AliexpressPromoCardDto.kt */
/* loaded from: classes5.dex */
public final class AliexpressPromoCardDto {

    @pmi0("action_button")
    private final BaseLinkButtonDto actionButton;

    @pmi0("card_position")
    private final Integer cardPosition;

    @pmi0("icon")
    private final PhotosPhotoDto icon;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    public AliexpressPromoCardDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliexpressPromoCardDto)) {
            return false;
        }
        AliexpressPromoCardDto aliexpressPromoCardDto = (AliexpressPromoCardDto) obj;
        return epx.f(this.icon, aliexpressPromoCardDto.icon) && epx.f(this.title, aliexpressPromoCardDto.title) && epx.f(this.subtitle, aliexpressPromoCardDto.subtitle) && epx.f(this.cardPosition, aliexpressPromoCardDto.cardPosition) && epx.f(this.actionButton, aliexpressPromoCardDto.actionButton);
    }

    public final int hashCode() {
        PhotosPhotoDto photosPhotoDto = this.icon;
        int hashCode = (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.cardPosition;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.actionButton;
        return hashCode4 + (baseLinkButtonDto != null ? baseLinkButtonDto.hashCode() : 0);
    }

    public final String toString() {
        PhotosPhotoDto photosPhotoDto = this.icon;
        String str = this.title;
        String str2 = this.subtitle;
        Integer num = this.cardPosition;
        BaseLinkButtonDto baseLinkButtonDto = this.actionButton;
        StringBuilder sb = new StringBuilder("AliexpressPromoCardDto(icon=");
        sb.append(photosPhotoDto);
        sb.append(", title=");
        sb.append(str);
        sb.append(", subtitle=");
        kr.b(num, str2, ", cardPosition=", ", actionButton=", sb);
        sb.append(baseLinkButtonDto);
        sb.append(")");
        return sb.toString();
    }

    public AliexpressPromoCardDto(PhotosPhotoDto photosPhotoDto, String str, String str2, Integer num, BaseLinkButtonDto baseLinkButtonDto) {
        this.icon = photosPhotoDto;
        this.title = str;
        this.subtitle = str2;
        this.cardPosition = num;
        this.actionButton = baseLinkButtonDto;
    }

    public /* synthetic */ AliexpressPromoCardDto(PhotosPhotoDto photosPhotoDto, String str, String str2, Integer num, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : photosPhotoDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : baseLinkButtonDto);
    }
}
