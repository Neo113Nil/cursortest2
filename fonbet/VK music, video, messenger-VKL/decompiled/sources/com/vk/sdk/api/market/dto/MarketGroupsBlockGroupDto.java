package com.vk.sdk.api.market.dto;

import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.i5s;
import xsna.n6j;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketGroupsBlockGroupDto.kt */
/* loaded from: classes5.dex */
public final class MarketGroupsBlockGroupDto {

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("group_photo")
    private final List<BaseImageDto> groupPhoto;

    @pmi0("has_new")
    private final boolean hasNew;

    @pmi0("is_subscribed")
    private final boolean isSubscribed;

    @pmi0("last_photo_text")
    private final String lastPhotoText;

    @pmi0("market_items")
    private final List<MarketGroupsBlockMarketItemDto> marketItems;

    @pmi0("new_count")
    private final int newCount;

    @pmi0("reason")
    private final ReasonDto reason;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketGroupsBlockGroupDto.kt */
    public static final class ReasonDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ReasonDto[] $VALUES;

        @pmi0("ml_recommendations")
        public static final ReasonDto ML_RECOMMENDATIONS;

        @pmi0("similar_recommendations")
        public static final ReasonDto SIMILAR_RECOMMENDATIONS;

        @pmi0("subscription")
        public static final ReasonDto SUBSCRIPTION;
        private final String value;

        static {
            ReasonDto reasonDto = new ReasonDto("SUBSCRIPTION", 0, "subscription");
            SUBSCRIPTION = reasonDto;
            ReasonDto reasonDto2 = new ReasonDto("ML_RECOMMENDATIONS", 1, "ml_recommendations");
            ML_RECOMMENDATIONS = reasonDto2;
            ReasonDto reasonDto3 = new ReasonDto("SIMILAR_RECOMMENDATIONS", 2, "similar_recommendations");
            SIMILAR_RECOMMENDATIONS = reasonDto3;
            ReasonDto[] reasonDtoArr = {reasonDto, reasonDto2, reasonDto3};
            $VALUES = reasonDtoArr;
            $ENTRIES = new asp(reasonDtoArr);
        }

        private ReasonDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ReasonDto valueOf(String str) {
            return (ReasonDto) Enum.valueOf(ReasonDto.class, str);
        }

        public static ReasonDto[] values() {
            return (ReasonDto[]) $VALUES.clone();
        }
    }

    public MarketGroupsBlockGroupDto(UserId userId, List<BaseImageDto> list, String str, String str2, String str3, List<MarketGroupsBlockMarketItemDto> list2, boolean z, int i, boolean z2, ReasonDto reasonDto, String str4) {
        this.groupId = userId;
        this.groupPhoto = list;
        this.title = str;
        this.subtitle = str2;
        this.url = str3;
        this.marketItems = list2;
        this.hasNew = z;
        this.newCount = i;
        this.isSubscribed = z2;
        this.reason = reasonDto;
        this.lastPhotoText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGroupsBlockGroupDto)) {
            return false;
        }
        MarketGroupsBlockGroupDto marketGroupsBlockGroupDto = (MarketGroupsBlockGroupDto) obj;
        return epx.f(this.groupId, marketGroupsBlockGroupDto.groupId) && epx.f(this.groupPhoto, marketGroupsBlockGroupDto.groupPhoto) && epx.f(this.title, marketGroupsBlockGroupDto.title) && epx.f(this.subtitle, marketGroupsBlockGroupDto.subtitle) && epx.f(this.url, marketGroupsBlockGroupDto.url) && epx.f(this.marketItems, marketGroupsBlockGroupDto.marketItems) && this.hasNew == marketGroupsBlockGroupDto.hasNew && this.newCount == marketGroupsBlockGroupDto.newCount && this.isSubscribed == marketGroupsBlockGroupDto.isSubscribed && this.reason == marketGroupsBlockGroupDto.reason && epx.f(this.lastPhotoText, marketGroupsBlockGroupDto.lastPhotoText);
    }

    public final int hashCode() {
        int hashCode = (this.reason.hashCode() + qoy.b(shy.a(this.newCount, qoy.b(fw3.a(urd0.a(urd0.a(urd0.a(fw3.a(Long.hashCode(this.groupId.b) * 31, 31, this.groupPhoto), 31, this.title), 31, this.subtitle), 31, this.url), 31, this.marketItems), 31, this.hasNew), 31), 31, this.isSubscribed)) * 31;
        String str = this.lastPhotoText;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        UserId userId = this.groupId;
        List<BaseImageDto> list = this.groupPhoto;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.url;
        List<MarketGroupsBlockMarketItemDto> list2 = this.marketItems;
        boolean z = this.hasNew;
        int i = this.newCount;
        boolean z2 = this.isSubscribed;
        ReasonDto reasonDto = this.reason;
        String str4 = this.lastPhotoText;
        StringBuilder sb = new StringBuilder("MarketGroupsBlockGroupDto(groupId=");
        sb.append(userId);
        sb.append(", groupPhoto=");
        sb.append(list);
        sb.append(", title=");
        n6j.b(sb, str, ", subtitle=", str2, ", url=");
        b.c(str3, ", marketItems=", ", hasNew=", sb, list2);
        sb.append(z);
        sb.append(", newCount=");
        sb.append(i);
        sb.append(", isSubscribed=");
        sb.append(z2);
        sb.append(", reason=");
        sb.append(reasonDto);
        sb.append(", lastPhotoText=");
        return i5s.a(sb, str4, ")");
    }

    public /* synthetic */ MarketGroupsBlockGroupDto(UserId userId, List list, String str, String str2, String str3, List list2, boolean z, int i, boolean z2, ReasonDto reasonDto, String str4, int i2, zcl zclVar) {
        this(userId, list, str, str2, str3, list2, z, i, z2, reasonDto, (i2 & 1024) != 0 ? null : str4);
    }
}
