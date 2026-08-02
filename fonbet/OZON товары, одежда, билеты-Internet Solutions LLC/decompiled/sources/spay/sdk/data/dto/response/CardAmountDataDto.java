package spay.sdk.data.dto.response;

import J8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.CardAmountData;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lspay/sdk/data/dto/response/CardAmountDataDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/CardAmountData;", "amount", "", "currency", "", "(DLjava/lang/String;)V", "getAmount", "()D", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CardAmountDataDto implements DataDtoInterface<CardAmountData> {

    @b("amount")
    private final double amount;

    @b("currency")
    @NotNull
    private final String currency;

    public CardAmountDataDto(double d11, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amount = d11;
        this.currency = currency;
    }

    public static /* synthetic */ CardAmountDataDto copy$default(CardAmountDataDto cardAmountDataDto, double d11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = cardAmountDataDto.amount;
        }
        if ((i11 & 2) != 0) {
            str = cardAmountDataDto.currency;
        }
        return cardAmountDataDto.copy(d11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final CardAmountDataDto copy(double amount, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new CardAmountDataDto(amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardAmountDataDto)) {
            return false;
        }
        CardAmountDataDto cardAmountDataDto = (CardAmountDataDto) other;
        return Double.compare(this.amount, cardAmountDataDto.amount) == 0 && Intrinsics.d(this.currency, cardAmountDataDto.currency);
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return this.currency.hashCode() + (Double.hashCode(this.amount) * 31);
    }

    @NotNull
    public String toString() {
        return "CardAmountDataDto(amount=" + this.amount + ", currency=" + this.currency + ")";
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public CardAmountData toModel() {
        int i11 = (int) (this.amount * 100);
        Intrinsics.checkNotNullParameter(this.currency, "<this>");
        return new CardAmountData(i11, "₽");
    }
}
