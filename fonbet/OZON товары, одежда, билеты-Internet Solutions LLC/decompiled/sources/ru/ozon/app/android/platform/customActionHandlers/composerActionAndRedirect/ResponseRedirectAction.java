package ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect;

import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.model.Restriction;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ResponseRedirectAction;", "", "redirectLink", "", "refreshLink", "message", "Lru/ozon/uni/android/flashbar/model/Restriction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/flashbar/model/Restriction;)V", "getRedirectLink", "()Ljava/lang/String;", "getRefreshLink", "getMessage", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ResponseRedirectAction {
    private final Restriction message;
    private final String redirectLink;
    private final String refreshLink;

    public ResponseRedirectAction(String str, String str2, Restriction restriction) {
        this.redirectLink = str;
        this.refreshLink = str2;
        this.message = restriction;
    }

    public static /* synthetic */ ResponseRedirectAction copy$default(ResponseRedirectAction responseRedirectAction, String str, String str2, Restriction restriction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = responseRedirectAction.redirectLink;
        }
        if ((i11 & 2) != 0) {
            str2 = responseRedirectAction.refreshLink;
        }
        if ((i11 & 4) != 0) {
            restriction = responseRedirectAction.message;
        }
        return responseRedirectAction.copy(str, str2, restriction);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRedirectLink() {
        return this.redirectLink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRefreshLink() {
        return this.refreshLink;
    }

    /* renamed from: component3, reason: from getter */
    public final Restriction getMessage() {
        return this.message;
    }

    @NotNull
    public final ResponseRedirectAction copy(String redirectLink, String refreshLink, Restriction message) {
        return new ResponseRedirectAction(redirectLink, refreshLink, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseRedirectAction)) {
            return false;
        }
        ResponseRedirectAction responseRedirectAction = (ResponseRedirectAction) other;
        return Intrinsics.d(this.redirectLink, responseRedirectAction.redirectLink) && Intrinsics.d(this.refreshLink, responseRedirectAction.refreshLink) && Intrinsics.d(this.message, responseRedirectAction.message);
    }

    public final Restriction getMessage() {
        return this.message;
    }

    public final String getRedirectLink() {
        return this.redirectLink;
    }

    public final String getRefreshLink() {
        return this.refreshLink;
    }

    public int hashCode() {
        String str = this.redirectLink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.refreshLink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Restriction restriction = this.message;
        return hashCode2 + (restriction != null ? restriction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.redirectLink;
        String str2 = this.refreshLink;
        Restriction restriction = this.message;
        StringBuilder d11 = C3660k.d("ResponseRedirectAction(redirectLink=", str, ", refreshLink=", str2, ", message=");
        d11.append(restriction);
        d11.append(")");
        return d11.toString();
    }
}
