package ru.ozon.app.android.bank.widgets.adBanner.data;

import G.g;
import I0.C3173b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/data/SetBannerActionRequest;", "", "action", "", "adTraceID", "slug", "placementSlug", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getAdTraceID", "getSlug", "getPlacementSlug", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SetBannerActionRequest {

    @NotNull
    private final String action;

    @NotNull
    private final String adTraceID;
    private final String placementSlug;
    private final String slug;

    public SetBannerActionRequest(@NotNull String action, @NotNull String adTraceID, String str, String str2) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(adTraceID, "adTraceID");
        this.action = action;
        this.adTraceID = adTraceID;
        this.slug = str;
        this.placementSlug = str2;
    }

    public static /* synthetic */ SetBannerActionRequest copy$default(SetBannerActionRequest setBannerActionRequest, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = setBannerActionRequest.action;
        }
        if ((i11 & 2) != 0) {
            str2 = setBannerActionRequest.adTraceID;
        }
        if ((i11 & 4) != 0) {
            str3 = setBannerActionRequest.slug;
        }
        if ((i11 & 8) != 0) {
            str4 = setBannerActionRequest.placementSlug;
        }
        return setBannerActionRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAdTraceID() {
        return this.adTraceID;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlacementSlug() {
        return this.placementSlug;
    }

    @NotNull
    public final SetBannerActionRequest copy(@NotNull String action, @NotNull String adTraceID, String slug, String placementSlug) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(adTraceID, "adTraceID");
        return new SetBannerActionRequest(action, adTraceID, slug, placementSlug);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetBannerActionRequest)) {
            return false;
        }
        SetBannerActionRequest setBannerActionRequest = (SetBannerActionRequest) other;
        return Intrinsics.d(this.action, setBannerActionRequest.action) && Intrinsics.d(this.adTraceID, setBannerActionRequest.adTraceID) && Intrinsics.d(this.slug, setBannerActionRequest.slug) && Intrinsics.d(this.placementSlug, setBannerActionRequest.placementSlug);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getAdTraceID() {
        return this.adTraceID;
    }

    public final String getPlacementSlug() {
        return this.placementSlug;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        int a11 = g.a(this.action.hashCode() * 31, 31, this.adTraceID);
        String str = this.slug;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placementSlug;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.adTraceID;
        return C3173b.c(C3660k.d("SetBannerActionRequest(action=", str, ", adTraceID=", str2, ", slug="), this.slug, ", placementSlug=", this.placementSlug, ")");
    }
}
