package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data;

import I0.C3173b;
import N3.C3660k;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/ExternalVerificationDTO;", "", ImagesContract.URL, "", "redirectUrl", "errorRedirectUrl", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getRedirectUrl", "getErrorRedirectUrl", "getAction", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ExternalVerificationDTO {
    public static final int $stable = 0;
    private final String action;
    private final String errorRedirectUrl;
    private final String redirectUrl;

    @NotNull
    private final String url;

    public ExternalVerificationDTO(@NotNull String url, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.redirectUrl = str;
        this.errorRedirectUrl = str2;
        this.action = str3;
    }

    public static /* synthetic */ ExternalVerificationDTO copy$default(ExternalVerificationDTO externalVerificationDTO, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = externalVerificationDTO.url;
        }
        if ((i11 & 2) != 0) {
            str2 = externalVerificationDTO.redirectUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = externalVerificationDTO.errorRedirectUrl;
        }
        if ((i11 & 8) != 0) {
            str4 = externalVerificationDTO.action;
        }
        return externalVerificationDTO.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorRedirectUrl() {
        return this.errorRedirectUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final ExternalVerificationDTO copy(@NotNull String url, String redirectUrl, String errorRedirectUrl, String action) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new ExternalVerificationDTO(url, redirectUrl, errorRedirectUrl, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalVerificationDTO)) {
            return false;
        }
        ExternalVerificationDTO externalVerificationDTO = (ExternalVerificationDTO) other;
        return Intrinsics.d(this.url, externalVerificationDTO.url) && Intrinsics.d(this.redirectUrl, externalVerificationDTO.redirectUrl) && Intrinsics.d(this.errorRedirectUrl, externalVerificationDTO.errorRedirectUrl) && Intrinsics.d(this.action, externalVerificationDTO.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getErrorRedirectUrl() {
        return this.errorRedirectUrl;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.redirectUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorRedirectUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.action;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.redirectUrl;
        return C3173b.c(C3660k.d("ExternalVerificationDTO(url=", str, ", redirectUrl=", str2, ", errorRedirectUrl="), this.errorRedirectUrl, ", action=", this.action, ")");
    }
}
