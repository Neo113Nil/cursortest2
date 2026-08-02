package ru.ozon.fintech.features.operations.network;

import C.o0;
import E70.a;
import G.g;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jj\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b+\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b.\u0010\u0010¨\u0006/"}, d2 = {"Lru/ozon/fintech/features/operations/network/C2bReceiptInfoDto;", "", "", "id", "amount", "counterPartyName", "counterPartyPhone", "counterPartyBank", "time", "logoUrl", "LE70/a;", "status", "paymentToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LE70/a;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()LE70/a;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LE70/a;Ljava/lang/String;)Lru/ozon/fintech/features/operations/network/C2bReceiptInfoDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getAmount", "getCounterPartyName", "getCounterPartyPhone", "getCounterPartyBank", "getTime", "getLogoUrl", "LE70/a;", "getStatus", "getPaymentToken", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class C2bReceiptInfoDto {

    @NotNull
    private final String amount;

    @NotNull
    private final String counterPartyBank;

    @NotNull
    private final String counterPartyName;

    @NotNull
    private final String counterPartyPhone;

    @NotNull
    private final String id;

    @NotNull
    private final String logoUrl;

    @NotNull
    private final String paymentToken;

    @NotNull
    private final a status;

    @NotNull
    private final String time;

    public C2bReceiptInfoDto(@i(name = "id") @NotNull String id2, @i(name = "amount") @NotNull String amount, @i(name = "counterPartyName") @NotNull String counterPartyName, @i(name = "counterPartyPhone") @NotNull String counterPartyPhone, @i(name = "counterPartyBank") @NotNull String counterPartyBank, @i(name = "time") @NotNull String time, @i(name = "logoUrl") @NotNull String logoUrl, @i(name = "status") @NotNull a status, @i(name = "paymentToken") @NotNull String paymentToken) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(counterPartyName, "counterPartyName");
        Intrinsics.checkNotNullParameter(counterPartyPhone, "counterPartyPhone");
        Intrinsics.checkNotNullParameter(counterPartyBank, "counterPartyBank");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        this.id = id2;
        this.amount = amount;
        this.counterPartyName = counterPartyName;
        this.counterPartyPhone = counterPartyPhone;
        this.counterPartyBank = counterPartyBank;
        this.time = time;
        this.logoUrl = logoUrl;
        this.status = status;
        this.paymentToken = paymentToken;
    }

    public static /* synthetic */ C2bReceiptInfoDto copy$default(C2bReceiptInfoDto c2bReceiptInfoDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c2bReceiptInfoDto.id;
        }
        if ((i11 & 2) != 0) {
            str2 = c2bReceiptInfoDto.amount;
        }
        if ((i11 & 4) != 0) {
            str3 = c2bReceiptInfoDto.counterPartyName;
        }
        if ((i11 & 8) != 0) {
            str4 = c2bReceiptInfoDto.counterPartyPhone;
        }
        if ((i11 & 16) != 0) {
            str5 = c2bReceiptInfoDto.counterPartyBank;
        }
        if ((i11 & 32) != 0) {
            str6 = c2bReceiptInfoDto.time;
        }
        if ((i11 & 64) != 0) {
            str7 = c2bReceiptInfoDto.logoUrl;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            aVar = c2bReceiptInfoDto.status;
        }
        if ((i11 & 256) != 0) {
            str8 = c2bReceiptInfoDto.paymentToken;
        }
        a aVar2 = aVar;
        String str9 = str8;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return c2bReceiptInfoDto.copy(str, str2, str13, str4, str12, str10, str11, aVar2, str9);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCounterPartyName() {
        return this.counterPartyName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCounterPartyPhone() {
        return this.counterPartyPhone;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCounterPartyBank() {
        return this.counterPartyBank;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final a getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getPaymentToken() {
        return this.paymentToken;
    }

    @NotNull
    public final C2bReceiptInfoDto copy(@i(name = "id") @NotNull String id2, @i(name = "amount") @NotNull String amount, @i(name = "counterPartyName") @NotNull String counterPartyName, @i(name = "counterPartyPhone") @NotNull String counterPartyPhone, @i(name = "counterPartyBank") @NotNull String counterPartyBank, @i(name = "time") @NotNull String time, @i(name = "logoUrl") @NotNull String logoUrl, @i(name = "status") @NotNull a status, @i(name = "paymentToken") @NotNull String paymentToken) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(counterPartyName, "counterPartyName");
        Intrinsics.checkNotNullParameter(counterPartyPhone, "counterPartyPhone");
        Intrinsics.checkNotNullParameter(counterPartyBank, "counterPartyBank");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        return new C2bReceiptInfoDto(id2, amount, counterPartyName, counterPartyPhone, counterPartyBank, time, logoUrl, status, paymentToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2bReceiptInfoDto)) {
            return false;
        }
        C2bReceiptInfoDto c2bReceiptInfoDto = (C2bReceiptInfoDto) other;
        return Intrinsics.d(this.id, c2bReceiptInfoDto.id) && Intrinsics.d(this.amount, c2bReceiptInfoDto.amount) && Intrinsics.d(this.counterPartyName, c2bReceiptInfoDto.counterPartyName) && Intrinsics.d(this.counterPartyPhone, c2bReceiptInfoDto.counterPartyPhone) && Intrinsics.d(this.counterPartyBank, c2bReceiptInfoDto.counterPartyBank) && Intrinsics.d(this.time, c2bReceiptInfoDto.time) && Intrinsics.d(this.logoUrl, c2bReceiptInfoDto.logoUrl) && this.status == c2bReceiptInfoDto.status && Intrinsics.d(this.paymentToken, c2bReceiptInfoDto.paymentToken);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCounterPartyBank() {
        return this.counterPartyBank;
    }

    @NotNull
    public final String getCounterPartyName() {
        return this.counterPartyName;
    }

    @NotNull
    public final String getCounterPartyPhone() {
        return this.counterPartyPhone;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    public final String getPaymentToken() {
        return this.paymentToken;
    }

    @NotNull
    public final a getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.paymentToken.hashCode() + ((this.status.hashCode() + g.a(g.a(g.a(g.a(g.a(g.a(this.id.hashCode() * 31, 31, this.amount), 31, this.counterPartyName), 31, this.counterPartyPhone), 31, this.counterPartyBank), 31, this.time), 31, this.logoUrl)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.amount;
        String str3 = this.counterPartyName;
        String str4 = this.counterPartyPhone;
        String str5 = this.counterPartyBank;
        String str6 = this.time;
        String str7 = this.logoUrl;
        a aVar = this.status;
        String str8 = this.paymentToken;
        StringBuilder d11 = C3660k.d("C2bReceiptInfoDto(id=", str, ", amount=", str2, ", counterPartyName=");
        Nh.a.h(d11, str3, ", counterPartyPhone=", str4, ", counterPartyBank=");
        Nh.a.h(d11, str5, ", time=", str6, ", logoUrl=");
        d11.append(str7);
        d11.append(", status=");
        d11.append(aVar);
        d11.append(", paymentToken=");
        return o0.c(d11, str8, ")");
    }
}
