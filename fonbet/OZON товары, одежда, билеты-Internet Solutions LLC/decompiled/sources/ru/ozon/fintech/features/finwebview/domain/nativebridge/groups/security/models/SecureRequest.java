package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.security.models;

import B90.C2618u;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/security/models/SecureRequest;", "", "secured", "", "<init>", "(Z)V", "getSecured", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SecureRequest {
    private final boolean secured;

    public SecureRequest(@i(name = "secured") boolean z11) {
        this.secured = z11;
    }

    public static /* synthetic */ SecureRequest copy$default(SecureRequest secureRequest, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = secureRequest.secured;
        }
        return secureRequest.copy(z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSecured() {
        return this.secured;
    }

    @NotNull
    public final SecureRequest copy(@i(name = "secured") boolean secured) {
        return new SecureRequest(secured);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SecureRequest) && this.secured == ((SecureRequest) other).secured;
    }

    public final boolean getSecured() {
        return this.secured;
    }

    public int hashCode() {
        return Boolean.hashCode(this.secured);
    }

    @NotNull
    public String toString() {
        return C2618u.g("SecureRequest(secured=", ")", this.secured);
    }
}
