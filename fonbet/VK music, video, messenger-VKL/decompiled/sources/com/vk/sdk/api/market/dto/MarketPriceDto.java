package com.vk.sdk.api.market.dto;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import xsna.epx;
import xsna.h5s;
import xsna.kr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketPriceDto.kt */
/* loaded from: classes5.dex */
public final class MarketPriceDto {

    @pmi0("amount")
    private final String amount;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final MarketCurrencyDto currency;

    @pmi0("discount_rate")
    private final Integer discountRate;

    @pmi0("old_amount")
    private final String oldAmount;

    @pmi0("old_amount_text")
    private final String oldAmountText;

    @pmi0("text")
    private final String text;

    public MarketPriceDto(String str, MarketCurrencyDto marketCurrencyDto, String str2, Integer num, String str3, String str4) {
        this.amount = str;
        this.currency = marketCurrencyDto;
        this.text = str2;
        this.discountRate = num;
        this.oldAmount = str3;
        this.oldAmountText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketPriceDto)) {
            return false;
        }
        MarketPriceDto marketPriceDto = (MarketPriceDto) obj;
        return epx.f(this.amount, marketPriceDto.amount) && epx.f(this.currency, marketPriceDto.currency) && epx.f(this.text, marketPriceDto.text) && epx.f(this.discountRate, marketPriceDto.discountRate) && epx.f(this.oldAmount, marketPriceDto.oldAmount) && epx.f(this.oldAmountText, marketPriceDto.oldAmountText);
    }

    public final int hashCode() {
        int a = urd0.a((this.currency.hashCode() + (this.amount.hashCode() * 31)) * 31, 31, this.text);
        Integer num = this.discountRate;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.oldAmount;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.oldAmountText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.amount;
        MarketCurrencyDto marketCurrencyDto = this.currency;
        String str2 = this.text;
        Integer num = this.discountRate;
        String str3 = this.oldAmount;
        String str4 = this.oldAmountText;
        StringBuilder sb = new StringBuilder("MarketPriceDto(amount=");
        sb.append(str);
        sb.append(", currency=");
        sb.append(marketCurrencyDto);
        sb.append(", text=");
        kr.b(num, str2, ", discountRate=", ", oldAmount=", sb);
        return h5s.d(sb, str3, ", oldAmountText=", str4, ")");
    }

    public /* synthetic */ MarketPriceDto(String str, MarketCurrencyDto marketCurrencyDto, String str2, Integer num, String str3, String str4, int i, zcl zclVar) {
        this(str, marketCurrencyDto, str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
