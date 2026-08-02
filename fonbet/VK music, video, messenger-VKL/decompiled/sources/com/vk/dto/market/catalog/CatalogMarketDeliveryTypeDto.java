package com.vk.dto.market.catalog;

import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogMarketFilter.kt */
/* loaded from: classes18.dex */
public final class CatalogMarketDeliveryTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogMarketDeliveryTypeDto[] $VALUES;
    public static final CatalogMarketDeliveryTypeDto ANY;
    public static final CatalogMarketDeliveryTypeDto COURIER;
    public static final a Companion;
    public static final CatalogMarketDeliveryTypeDto PICKUP;
    private final String value;

    /* compiled from: CatalogMarketFilter.kt */
    public static final class a {
        public static CatalogMarketDeliveryTypeDto a(String str) {
            Object obj;
            Iterator<E> it = CatalogMarketDeliveryTypeDto.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((CatalogMarketDeliveryTypeDto) obj).i(), str)) {
                    break;
                }
            }
            return (CatalogMarketDeliveryTypeDto) obj;
        }
    }

    static {
        CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto = new CatalogMarketDeliveryTypeDto("ANY", 0, "any");
        ANY = catalogMarketDeliveryTypeDto;
        CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto2 = new CatalogMarketDeliveryTypeDto("COURIER", 1, "courier");
        COURIER = catalogMarketDeliveryTypeDto2;
        CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto3 = new CatalogMarketDeliveryTypeDto("PICKUP", 2, "pickup");
        PICKUP = catalogMarketDeliveryTypeDto3;
        CatalogMarketDeliveryTypeDto[] catalogMarketDeliveryTypeDtoArr = {catalogMarketDeliveryTypeDto, catalogMarketDeliveryTypeDto2, catalogMarketDeliveryTypeDto3};
        $VALUES = catalogMarketDeliveryTypeDtoArr;
        $ENTRIES = new asp(catalogMarketDeliveryTypeDtoArr);
        Companion = new a();
    }

    public CatalogMarketDeliveryTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<CatalogMarketDeliveryTypeDto> h() {
        return $ENTRIES;
    }

    public static CatalogMarketDeliveryTypeDto valueOf(String str) {
        return (CatalogMarketDeliveryTypeDto) Enum.valueOf(CatalogMarketDeliveryTypeDto.class, str);
    }

    public static CatalogMarketDeliveryTypeDto[] values() {
        return (CatalogMarketDeliveryTypeDto[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
