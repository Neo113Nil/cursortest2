package ru.ozon.app.android.storage.hosts;

import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storage/hosts/FintechUrls;", "", "", "bankUrl", "checkoutUrl", "apiBankUrl", "pinsBankUrl", "esiaSelectRedirectUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBankUrl", "getCheckoutUrl", "getApiBankUrl", "getPinsBankUrl", "getEsiaSelectRedirectUrl", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FintechUrls {

    @NotNull
    private final String apiBankUrl;

    @NotNull
    private final String bankUrl;

    @NotNull
    private final String checkoutUrl;

    @NotNull
    private final String esiaSelectRedirectUrl;

    @NotNull
    private final String pinsBankUrl;

    public FintechUrls(@NotNull String bankUrl, @NotNull String checkoutUrl, @NotNull String apiBankUrl, @NotNull String pinsBankUrl, @NotNull String esiaSelectRedirectUrl) {
        Intrinsics.checkNotNullParameter(bankUrl, "bankUrl");
        Intrinsics.checkNotNullParameter(checkoutUrl, "checkoutUrl");
        Intrinsics.checkNotNullParameter(apiBankUrl, "apiBankUrl");
        Intrinsics.checkNotNullParameter(pinsBankUrl, "pinsBankUrl");
        Intrinsics.checkNotNullParameter(esiaSelectRedirectUrl, "esiaSelectRedirectUrl");
        this.bankUrl = bankUrl;
        this.checkoutUrl = checkoutUrl;
        this.apiBankUrl = apiBankUrl;
        this.pinsBankUrl = pinsBankUrl;
        this.esiaSelectRedirectUrl = esiaSelectRedirectUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FintechUrls)) {
            return false;
        }
        FintechUrls fintechUrls = (FintechUrls) other;
        return Intrinsics.d(this.bankUrl, fintechUrls.bankUrl) && Intrinsics.d(this.checkoutUrl, fintechUrls.checkoutUrl) && Intrinsics.d(this.apiBankUrl, fintechUrls.apiBankUrl) && Intrinsics.d(this.pinsBankUrl, fintechUrls.pinsBankUrl) && Intrinsics.d(this.esiaSelectRedirectUrl, fintechUrls.esiaSelectRedirectUrl);
    }

    @NotNull
    public final String getApiBankUrl() {
        return this.apiBankUrl;
    }

    @NotNull
    public final String getBankUrl() {
        return this.bankUrl;
    }

    @NotNull
    public final String getCheckoutUrl() {
        return this.checkoutUrl;
    }

    @NotNull
    public final String getEsiaSelectRedirectUrl() {
        return this.esiaSelectRedirectUrl;
    }

    @NotNull
    public final String getPinsBankUrl() {
        return this.pinsBankUrl;
    }

    public int hashCode() {
        return this.esiaSelectRedirectUrl.hashCode() + g.a(g.a(g.a(this.bankUrl.hashCode() * 31, 31, this.checkoutUrl), 31, this.apiBankUrl), 31, this.pinsBankUrl);
    }

    @NotNull
    public String toString() {
        String str = this.bankUrl;
        String str2 = this.checkoutUrl;
        String str3 = this.apiBankUrl;
        String str4 = this.pinsBankUrl;
        String str5 = this.esiaSelectRedirectUrl;
        StringBuilder d11 = C3660k.d("FintechUrls(bankUrl=", str, ", checkoutUrl=", str2, ", apiBankUrl=");
        a.h(d11, str3, ", pinsBankUrl=", str4, ", esiaSelectRedirectUrl=");
        return o0.c(d11, str5, ")");
    }
}
