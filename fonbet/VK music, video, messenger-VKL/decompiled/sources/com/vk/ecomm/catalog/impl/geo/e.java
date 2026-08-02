package com.vk.ecomm.catalog.impl.geo;

import com.vk.api.generated.market.dto.MarketReferenceDto;
import xsna.bpn0;
import xsna.lk;

/* compiled from: ClassifiedsGeoRxEvents.kt */
/* loaded from: classes18.dex */
public final class e {
    public static final bpn0 a = new bpn0(new lk(5));

    /* compiled from: ClassifiedsGeoRxEvents.kt */
    public static abstract class a {
        public final MarketReferenceDto a;

        /* compiled from: ClassifiedsGeoRxEvents.kt */
        /* renamed from: com.vk.ecomm.catalog.impl.geo.e$a$a, reason: collision with other inner class name */
        public static final class C0931a extends a {
        }

        /* compiled from: ClassifiedsGeoRxEvents.kt */
        public static final class b extends a {
            public final String b;

            public b(MarketReferenceDto marketReferenceDto, String str) {
                super(marketReferenceDto);
                this.b = str;
            }
        }

        public a(MarketReferenceDto marketReferenceDto) {
            this.a = marketReferenceDto;
        }
    }
}
