package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.api;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/api/CheckLegalAddressResponse;", "", "isFinal", "", "deeplink", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getDeeplink", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckLegalAddressResponse {
    public static final int $stable = 0;
    private final String deeplink;
    private final boolean isFinal;

    public CheckLegalAddressResponse(boolean z11, String str) {
        this.isFinal = z11;
        this.deeplink = str;
    }

    public static /* synthetic */ CheckLegalAddressResponse copy$default(CheckLegalAddressResponse checkLegalAddressResponse, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = checkLegalAddressResponse.isFinal;
        }
        if ((i11 & 2) != 0) {
            str = checkLegalAddressResponse.deeplink;
        }
        return checkLegalAddressResponse.copy(z11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFinal() {
        return this.isFinal;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final CheckLegalAddressResponse copy(boolean isFinal, String deeplink) {
        return new CheckLegalAddressResponse(isFinal, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckLegalAddressResponse)) {
            return false;
        }
        CheckLegalAddressResponse checkLegalAddressResponse = (CheckLegalAddressResponse) other;
        return this.isFinal == checkLegalAddressResponse.isFinal && Intrinsics.d(this.deeplink, checkLegalAddressResponse.deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isFinal) * 31;
        String str = this.deeplink;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isFinal() {
        return this.isFinal;
    }

    @NotNull
    public String toString() {
        return "CheckLegalAddressResponse(isFinal=" + this.isFinal + ", deeplink=" + this.deeplink + ")";
    }
}
