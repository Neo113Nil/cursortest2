package ru.ozon.app.android.checkoutcomposer.common.cardbinding.data;

import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.model.Restriction;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/cardbinding/data/CardBindingResponseDTO;", "", "redirectUrl", "", "successUrl", "failUrl", "error", "Lru/ozon/uni/android/flashbar/model/Restriction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/flashbar/model/Restriction;)V", "getRedirectUrl", "()Ljava/lang/String;", "getSuccessUrl", "getFailUrl", "getError", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardBindingResponseDTO {
    public static final int $stable = Restriction.$stable;
    private final Restriction error;
    private final String failUrl;
    private final String redirectUrl;
    private final String successUrl;

    public CardBindingResponseDTO(String str, String str2, String str3, Restriction restriction) {
        this.redirectUrl = str;
        this.successUrl = str2;
        this.failUrl = str3;
        this.error = restriction;
    }

    public static /* synthetic */ CardBindingResponseDTO copy$default(CardBindingResponseDTO cardBindingResponseDTO, String str, String str2, String str3, Restriction restriction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cardBindingResponseDTO.redirectUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = cardBindingResponseDTO.successUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = cardBindingResponseDTO.failUrl;
        }
        if ((i11 & 8) != 0) {
            restriction = cardBindingResponseDTO.error;
        }
        return cardBindingResponseDTO.copy(str, str2, str3, restriction);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSuccessUrl() {
        return this.successUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFailUrl() {
        return this.failUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final Restriction getError() {
        return this.error;
    }

    @NotNull
    public final CardBindingResponseDTO copy(String redirectUrl, String successUrl, String failUrl, Restriction error) {
        return new CardBindingResponseDTO(redirectUrl, successUrl, failUrl, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardBindingResponseDTO)) {
            return false;
        }
        CardBindingResponseDTO cardBindingResponseDTO = (CardBindingResponseDTO) other;
        return Intrinsics.d(this.redirectUrl, cardBindingResponseDTO.redirectUrl) && Intrinsics.d(this.successUrl, cardBindingResponseDTO.successUrl) && Intrinsics.d(this.failUrl, cardBindingResponseDTO.failUrl) && Intrinsics.d(this.error, cardBindingResponseDTO.error);
    }

    public final Restriction getError() {
        return this.error;
    }

    public final String getFailUrl() {
        return this.failUrl;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getSuccessUrl() {
        return this.successUrl;
    }

    public int hashCode() {
        String str = this.redirectUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.successUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.failUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Restriction restriction = this.error;
        return hashCode3 + (restriction != null ? restriction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.redirectUrl;
        String str2 = this.successUrl;
        String str3 = this.failUrl;
        Restriction restriction = this.error;
        StringBuilder d11 = C3660k.d("CardBindingResponseDTO(redirectUrl=", str, ", successUrl=", str2, ", failUrl=");
        d11.append(str3);
        d11.append(", error=");
        d11.append(restriction);
        d11.append(")");
        return d11.toString();
    }
}
