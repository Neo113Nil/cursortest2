package com.vk.sdk.api.gifts.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.mq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GiftsGiftDto.kt */
/* loaded from: classes5.dex */
public final class GiftsGiftDto {

    @pmi0("date")
    private final Integer date;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("gift")
    private final GiftsLayoutDto gift;

    @pmi0("gift_hash")
    private final String giftHash;

    @pmi0("id")
    private final Integer id;

    @pmi0("message")
    private final String message;

    @pmi0("privacy")
    private final GiftsGiftPrivacyDto privacy;

    public GiftsGiftDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsGiftDto)) {
            return false;
        }
        GiftsGiftDto giftsGiftDto = (GiftsGiftDto) obj;
        return epx.f(this.date, giftsGiftDto.date) && epx.f(this.fromId, giftsGiftDto.fromId) && epx.f(this.gift, giftsGiftDto.gift) && epx.f(this.giftHash, giftsGiftDto.giftHash) && epx.f(this.id, giftsGiftDto.id) && epx.f(this.message, giftsGiftDto.message) && this.privacy == giftsGiftDto.privacy;
    }

    public final int hashCode() {
        Integer num = this.date;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.fromId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        GiftsLayoutDto giftsLayoutDto = this.gift;
        int hashCode3 = (hashCode2 + (giftsLayoutDto == null ? 0 : giftsLayoutDto.hashCode())) * 31;
        String str = this.giftHash;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.id;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.message;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GiftsGiftPrivacyDto giftsGiftPrivacyDto = this.privacy;
        return hashCode6 + (giftsGiftPrivacyDto != null ? giftsGiftPrivacyDto.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.date;
        UserId userId = this.fromId;
        GiftsLayoutDto giftsLayoutDto = this.gift;
        String str = this.giftHash;
        Integer num2 = this.id;
        String str2 = this.message;
        GiftsGiftPrivacyDto giftsGiftPrivacyDto = this.privacy;
        StringBuilder sb = new StringBuilder("GiftsGiftDto(date=");
        sb.append(num);
        sb.append(", fromId=");
        sb.append(userId);
        sb.append(", gift=");
        sb.append(giftsLayoutDto);
        sb.append(", giftHash=");
        sb.append(str);
        sb.append(", id=");
        mq.b(num2, ", message=", str2, ", privacy=", sb);
        sb.append(giftsGiftPrivacyDto);
        sb.append(")");
        return sb.toString();
    }

    public GiftsGiftDto(Integer num, UserId userId, GiftsLayoutDto giftsLayoutDto, String str, Integer num2, String str2, GiftsGiftPrivacyDto giftsGiftPrivacyDto) {
        this.date = num;
        this.fromId = userId;
        this.gift = giftsLayoutDto;
        this.giftHash = str;
        this.id = num2;
        this.message = str2;
        this.privacy = giftsGiftPrivacyDto;
    }

    public /* synthetic */ GiftsGiftDto(Integer num, UserId userId, GiftsLayoutDto giftsLayoutDto, String str, Integer num2, String str2, GiftsGiftPrivacyDto giftsGiftPrivacyDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : giftsLayoutDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : giftsGiftPrivacyDto);
    }
}
