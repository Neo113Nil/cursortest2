package spay.sdk.data.dto.response.bnpl;

import C.o0;
import J8.b;
import Ve.C4452mn;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.bnpl.BnplPayment;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001c"}, d2 = {"Lspay/sdk/data/dto/response/bnpl/BnplPaymentDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/bnpl/BnplPayment;", "date", "", "amount", "", AppsFlyerProperties.CURRENCY_CODE, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrencyCode", "()Ljava/lang/String;", "getDate", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lspay/sdk/data/dto/response/bnpl/BnplPaymentDto;", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BnplPaymentDto implements DataDtoInterface<BnplPayment> {

    @b("amount")
    private final Long amount;

    @b(AppsFlyerProperties.CURRENCY_CODE)
    private final String currencyCode;

    @b("date")
    private final String date;

    public BnplPaymentDto(String str, Long l11, String str2) {
        this.date = str;
        this.amount = l11;
        this.currencyCode = str2;
    }

    public static /* synthetic */ BnplPaymentDto copy$default(BnplPaymentDto bnplPaymentDto, String str, Long l11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bnplPaymentDto.date;
        }
        if ((i11 & 2) != 0) {
            l11 = bnplPaymentDto.amount;
        }
        if ((i11 & 4) != 0) {
            str2 = bnplPaymentDto.currencyCode;
        }
        return bnplPaymentDto.copy(str, l11, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final BnplPaymentDto copy(String date, Long amount, String currencyCode) {
        return new BnplPaymentDto(date, amount, currencyCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BnplPaymentDto)) {
            return false;
        }
        BnplPaymentDto bnplPaymentDto = (BnplPaymentDto) other;
        return Intrinsics.d(this.date, bnplPaymentDto.date) && Intrinsics.d(this.amount, bnplPaymentDto.amount) && Intrinsics.d(this.currencyCode, bnplPaymentDto.currencyCode);
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        String str = this.date;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.amount;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.currencyCode;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.date;
        Long l11 = this.amount;
        String str2 = this.currencyCode;
        StringBuilder sb2 = new StringBuilder("BnplPaymentDto(date=");
        sb2.append(str);
        sb2.append(", amount=");
        sb2.append(l11);
        sb2.append(", currencyCode=");
        return o0.c(sb2, str2, ")");
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public BnplPayment toModel() {
        String str = this.date;
        if (str == null) {
            throw new C4452mn("date");
        }
        Long l11 = this.amount;
        if (l11 == null) {
            throw new C4452mn("amount");
        }
        long longValue = l11.longValue();
        String str2 = this.currencyCode;
        if (str2 != null) {
            return new BnplPayment(str, longValue, str2);
        }
        throw new C4452mn(AppsFlyerProperties.CURRENCY_CODE);
    }
}
