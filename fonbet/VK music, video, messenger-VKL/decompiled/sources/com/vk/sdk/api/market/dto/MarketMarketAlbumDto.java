package com.vk.sdk.api.market.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import xsna.bh10;
import xsna.epx;
import xsna.nyh0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.xq;
import xsna.zcl;

/* compiled from: MarketMarketAlbumDto.kt */
/* loaded from: classes5.dex */
public final class MarketMarketAlbumDto {

    @pmi0("count")
    private final int count;

    @pmi0("id")
    private final int id;

    @pmi0("is_blur_enabled")
    private final Boolean isBlurEnabled;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("is_main")
    private final Boolean isMain;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("title")
    private final String title;

    @pmi0("updated_time")
    private final int updatedTime;

    public MarketMarketAlbumDto(int i, UserId userId, String str, int i2, int i3, Boolean bool, Boolean bool2, PhotosPhotoDto photosPhotoDto, Boolean bool3) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
        this.count = i2;
        this.updatedTime = i3;
        this.isMain = bool;
        this.isHidden = bool2;
        this.photo = photosPhotoDto;
        this.isBlurEnabled = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketAlbumDto)) {
            return false;
        }
        MarketMarketAlbumDto marketMarketAlbumDto = (MarketMarketAlbumDto) obj;
        return this.id == marketMarketAlbumDto.id && epx.f(this.ownerId, marketMarketAlbumDto.ownerId) && epx.f(this.title, marketMarketAlbumDto.title) && this.count == marketMarketAlbumDto.count && this.updatedTime == marketMarketAlbumDto.updatedTime && epx.f(this.isMain, marketMarketAlbumDto.isMain) && epx.f(this.isHidden, marketMarketAlbumDto.isHidden) && epx.f(this.photo, marketMarketAlbumDto.photo) && epx.f(this.isBlurEnabled, marketMarketAlbumDto.isBlurEnabled);
    }

    public final int hashCode() {
        int a = shy.a(this.updatedTime, shy.a(this.count, urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.title), 31), 31);
        Boolean bool = this.isMain;
        int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isHidden;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode3 = (hashCode2 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        Boolean bool3 = this.isBlurEnabled;
        return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        UserId userId = this.ownerId;
        String str = this.title;
        int i2 = this.count;
        int i3 = this.updatedTime;
        Boolean bool = this.isMain;
        Boolean bool2 = this.isHidden;
        PhotosPhotoDto photosPhotoDto = this.photo;
        Boolean bool3 = this.isBlurEnabled;
        StringBuilder sb = new StringBuilder("MarketMarketAlbumDto(id=");
        sb.append(i);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", title=");
        nyh0.a(i2, str, ", count=", ", updatedTime=", sb);
        sb.append(i3);
        sb.append(", isMain=");
        sb.append(bool);
        sb.append(", isHidden=");
        sb.append(bool2);
        sb.append(", photo=");
        sb.append(photosPhotoDto);
        sb.append(", isBlurEnabled=");
        return xq.d(sb, bool3, ")");
    }

    public /* synthetic */ MarketMarketAlbumDto(int i, UserId userId, String str, int i2, int i3, Boolean bool, Boolean bool2, PhotosPhotoDto photosPhotoDto, Boolean bool3, int i4, zcl zclVar) {
        this(i, userId, str, i2, i3, (i4 & 32) != 0 ? null : bool, (i4 & 64) != 0 ? null : bool2, (i4 & 128) != 0 ? null : photosPhotoDto, (i4 & 256) != 0 ? null : bool3);
    }
}
