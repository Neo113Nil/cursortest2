package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.wp;
import xsna.zcl;

/* compiled from: MarketAbandonedCartExtendedDto.kt */
/* loaded from: classes15.dex */
public final class MarketAbandonedCartExtendedDto implements Parcelable {
    public static final Parcelable.Creator<MarketAbandonedCartExtendedDto> CREATOR = new a();

    @pmi0("agreement_info")
    private final String agreementInfo;

    @pmi0("badges")
    private final List<MarketAbandonedCartBadgeDto> badges;

    @pmi0("contact_id")
    private final Integer contactId;

    @pmi0("contains_deleted_items")
    private final BaseBoolIntDto containsDeletedItems;

    @pmi0("create_order_url")
    private final String createOrderUrl;

    @pmi0("failure_order_price_text")
    private final String failureOrderPriceText;

    @pmi0("friends")
    private final List<Integer> friends;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("group_subtitle")
    private final String groupSubtitle;

    @pmi0("integration_type")
    private final MarketIntegrationsTypeDto integrationType;

    @pmi0("min_order_price")
    private final MarketPriceDto minOrderPrice;

    @pmi0("preview_items")
    private final List<MarketMarketItemFullDto> previewItems;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("total_items_count")
    private final int totalItemsCount;

    @pmi0("total_quantity_count")
    private final int totalQuantityCount;

    /* compiled from: MarketAbandonedCartExtendedDto.kt */
    public static final class a implements Parcelable.Creator<MarketAbandonedCartExtendedDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketAbandonedCartExtendedDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Class<MarketAbandonedCartExtendedDto> cls = MarketAbandonedCartExtendedDto.class;
            UserId userId = (UserId) parcel.readParcelable(cls.getClassLoader());
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(cls.getClassLoader());
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = en.a(MarketMarketItemFullDto.CREATOR, parcel, arrayList3, i, 1);
            }
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(cls.getClassLoader());
            MarketIntegrationsTypeDto marketIntegrationsTypeDto = (MarketIntegrationsTypeDto) parcel.readParcelable(cls.getClassLoader());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                int i2 = 0;
                while (i2 != readInt4) {
                    i2 = pm0.b(parcel, arrayList4, i2, 1);
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt5);
                int i3 = 0;
                while (i3 != readInt5) {
                    i3 = en.a(MarketAbandonedCartBadgeDto.CREATOR, parcel, arrayList5, i3, 1);
                    cls = cls;
                }
                arrayList2 = arrayList5;
            }
            return new MarketAbandonedCartExtendedDto(userId, readString, readInt, readInt2, baseBoolIntDto, arrayList3, marketPriceDto, marketIntegrationsTypeDto, readString2, arrayList, arrayList2, (MarketPriceDto) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketAbandonedCartExtendedDto[] newArray(int i) {
            return new MarketAbandonedCartExtendedDto[i];
        }
    }

    public MarketAbandonedCartExtendedDto(UserId userId, String str, int i, int i2, BaseBoolIntDto baseBoolIntDto, List<MarketMarketItemFullDto> list, MarketPriceDto marketPriceDto, MarketIntegrationsTypeDto marketIntegrationsTypeDto, String str2, List<Integer> list2, List<MarketAbandonedCartBadgeDto> list3, MarketPriceDto marketPriceDto2, String str3, Integer num, String str4) {
        this.groupId = userId;
        this.groupSubtitle = str;
        this.totalItemsCount = i;
        this.totalQuantityCount = i2;
        this.containsDeletedItems = baseBoolIntDto;
        this.previewItems = list;
        this.price = marketPriceDto;
        this.integrationType = marketIntegrationsTypeDto;
        this.createOrderUrl = str2;
        this.friends = list2;
        this.badges = list3;
        this.minOrderPrice = marketPriceDto2;
        this.failureOrderPriceText = str3;
        this.contactId = num;
        this.agreementInfo = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketAbandonedCartExtendedDto)) {
            return false;
        }
        MarketAbandonedCartExtendedDto marketAbandonedCartExtendedDto = (MarketAbandonedCartExtendedDto) obj;
        return epx.f(this.groupId, marketAbandonedCartExtendedDto.groupId) && epx.f(this.groupSubtitle, marketAbandonedCartExtendedDto.groupSubtitle) && this.totalItemsCount == marketAbandonedCartExtendedDto.totalItemsCount && this.totalQuantityCount == marketAbandonedCartExtendedDto.totalQuantityCount && this.containsDeletedItems == marketAbandonedCartExtendedDto.containsDeletedItems && epx.f(this.previewItems, marketAbandonedCartExtendedDto.previewItems) && epx.f(this.price, marketAbandonedCartExtendedDto.price) && this.integrationType == marketAbandonedCartExtendedDto.integrationType && epx.f(this.createOrderUrl, marketAbandonedCartExtendedDto.createOrderUrl) && epx.f(this.friends, marketAbandonedCartExtendedDto.friends) && epx.f(this.badges, marketAbandonedCartExtendedDto.badges) && epx.f(this.minOrderPrice, marketAbandonedCartExtendedDto.minOrderPrice) && epx.f(this.failureOrderPriceText, marketAbandonedCartExtendedDto.failureOrderPriceText) && epx.f(this.contactId, marketAbandonedCartExtendedDto.contactId) && epx.f(this.agreementInfo, marketAbandonedCartExtendedDto.agreementInfo);
    }

    public final int hashCode() {
        int hashCode = (this.price.hashCode() + fw3.a(wp.b(this.containsDeletedItems, shy.a(this.totalQuantityCount, shy.a(this.totalItemsCount, urd0.a(Long.hashCode(this.groupId.b) * 31, 31, this.groupSubtitle), 31), 31), 31), 31, this.previewItems)) * 31;
        MarketIntegrationsTypeDto marketIntegrationsTypeDto = this.integrationType;
        int hashCode2 = (hashCode + (marketIntegrationsTypeDto == null ? 0 : marketIntegrationsTypeDto.hashCode())) * 31;
        String str = this.createOrderUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list = this.friends;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<MarketAbandonedCartBadgeDto> list2 = this.badges;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.minOrderPrice;
        int hashCode6 = (hashCode5 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        String str2 = this.failureOrderPriceText;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.contactId;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.agreementInfo;
        return hashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAbandonedCartExtendedDto(groupId=");
        sb.append(this.groupId);
        sb.append(", groupSubtitle=");
        sb.append(this.groupSubtitle);
        sb.append(", totalItemsCount=");
        sb.append(this.totalItemsCount);
        sb.append(", totalQuantityCount=");
        sb.append(this.totalQuantityCount);
        sb.append(", containsDeletedItems=");
        sb.append(this.containsDeletedItems);
        sb.append(", previewItems=");
        sb.append(this.previewItems);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", integrationType=");
        sb.append(this.integrationType);
        sb.append(", createOrderUrl=");
        sb.append(this.createOrderUrl);
        sb.append(", friends=");
        sb.append(this.friends);
        sb.append(", badges=");
        sb.append(this.badges);
        sb.append(", minOrderPrice=");
        sb.append(this.minOrderPrice);
        sb.append(", failureOrderPriceText=");
        sb.append(this.failureOrderPriceText);
        sb.append(", contactId=");
        sb.append(this.contactId);
        sb.append(", agreementInfo=");
        return ho8.a(sb, this.agreementInfo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.groupId, i);
        parcel.writeString(this.groupSubtitle);
        parcel.writeInt(this.totalItemsCount);
        parcel.writeInt(this.totalQuantityCount);
        parcel.writeParcelable(this.containsDeletedItems, i);
        Iterator a2 = ao.a(parcel, this.previewItems);
        while (a2.hasNext()) {
            ((MarketMarketItemFullDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.price, i);
        parcel.writeParcelable(this.integrationType, i);
        parcel.writeString(this.createOrderUrl);
        List<Integer> list = this.friends;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        List<MarketAbandonedCartBadgeDto> list2 = this.badges;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketAbandonedCartBadgeDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.minOrderPrice, i);
        parcel.writeString(this.failureOrderPriceText);
        Integer num = this.contactId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.agreementInfo);
    }

    public /* synthetic */ MarketAbandonedCartExtendedDto(UserId userId, String str, int i, int i2, BaseBoolIntDto baseBoolIntDto, List list, MarketPriceDto marketPriceDto, MarketIntegrationsTypeDto marketIntegrationsTypeDto, String str2, List list2, List list3, MarketPriceDto marketPriceDto2, String str3, Integer num, String str4, int i3, zcl zclVar) {
        this(userId, str, i, i2, baseBoolIntDto, list, marketPriceDto, (i3 & 128) != 0 ? null : marketIntegrationsTypeDto, (i3 & 256) != 0 ? null : str2, (i3 & 512) != 0 ? null : list2, (i3 & 1024) != 0 ? null : list3, (i3 & 2048) != 0 ? null : marketPriceDto2, (i3 & 4096) != 0 ? null : str3, (i3 & 8192) != 0 ? null : num, (i3 & 16384) != 0 ? null : str4);
    }
}
