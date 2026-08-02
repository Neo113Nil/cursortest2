package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import I0.C3173b;
import K1.G;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentDTO;", "", "", "isIframe", "", "redirect3dsUrl", "redirectUrl", "status", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentDTO;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getRedirect3dsUrl", "getRedirectUrl", "getStatus", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuthorizePaymentDTO {
    private final boolean isIframe;
    private final String redirect3dsUrl;
    private final String redirectUrl;

    @NotNull
    private final String status;

    public AuthorizePaymentDTO(boolean z11, String str, String str2, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.isIframe = z11;
        this.redirect3dsUrl = str;
        this.redirectUrl = str2;
        this.status = status;
    }

    public static /* synthetic */ AuthorizePaymentDTO copy$default(AuthorizePaymentDTO authorizePaymentDTO, boolean z11, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = authorizePaymentDTO.isIframe;
        }
        if ((i11 & 2) != 0) {
            str = authorizePaymentDTO.redirect3dsUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = authorizePaymentDTO.redirectUrl;
        }
        if ((i11 & 8) != 0) {
            str3 = authorizePaymentDTO.status;
        }
        return authorizePaymentDTO.copy(z11, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsIframe() {
        return this.isIframe;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRedirect3dsUrl() {
        return this.redirect3dsUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final AuthorizePaymentDTO copy(boolean isIframe, String redirect3dsUrl, String redirectUrl, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new AuthorizePaymentDTO(isIframe, redirect3dsUrl, redirectUrl, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizePaymentDTO)) {
            return false;
        }
        AuthorizePaymentDTO authorizePaymentDTO = (AuthorizePaymentDTO) other;
        return this.isIframe == authorizePaymentDTO.isIframe && Intrinsics.d(this.redirect3dsUrl, authorizePaymentDTO.redirect3dsUrl) && Intrinsics.d(this.redirectUrl, authorizePaymentDTO.redirectUrl) && Intrinsics.d(this.status, authorizePaymentDTO.status);
    }

    public final String getRedirect3dsUrl() {
        return this.redirect3dsUrl;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isIframe) * 31;
        String str = this.redirect3dsUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redirectUrl;
        return this.status.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isIframe() {
        return this.isIframe;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isIframe;
        String str = this.redirect3dsUrl;
        return C3173b.c(G.d("AuthorizePaymentDTO(isIframe=", ", redirect3dsUrl=", str, ", redirectUrl=", z11), this.redirectUrl, ", status=", this.status, ")");
    }

    public /* synthetic */ AuthorizePaymentDTO(boolean z11, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, str, str2, str3);
    }
}
