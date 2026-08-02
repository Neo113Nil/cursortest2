package com.vk.sdk.api.market.dto;

import xsna.epx;
import xsna.i5s;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MarketCurrencyDto.kt */
/* loaded from: classes5.dex */
public final class MarketCurrencyDto {

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("title")
    private final String title;

    public MarketCurrencyDto(int i, String str, String str2) {
        this.id = i;
        this.name = str;
        this.title = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCurrencyDto)) {
            return false;
        }
        MarketCurrencyDto marketCurrencyDto = (MarketCurrencyDto) obj;
        return this.id == marketCurrencyDto.id && epx.f(this.name, marketCurrencyDto.name) && epx.f(this.title, marketCurrencyDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        return i5s.a(kh10.a(i, "MarketCurrencyDto(id=", ", name=", str, ", title="), this.title, ")");
    }
}
