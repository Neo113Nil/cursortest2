package ru.ozon.app.android.geo.addresseditformprompt.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.android.flashbar.model.Restriction;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzResponse;", "", "customTplLink", "", "viewport", "Lru/ozon/app/android/geo/addresseditformprompt/data/ViewPort;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/model/Restriction;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/geo/addresseditformprompt/data/ViewPort;Lru/ozon/uni/android/flashbar/model/Restriction;)V", "getCustomTplLink", "()Ljava/lang/String;", "getViewport", "()Lru/ozon/app/android/geo/addresseditformprompt/data/ViewPort;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RecommendPvzResponse {
    private final String customTplLink;
    private final Restriction restriction;
    private final ViewPort viewport;

    public RecommendPvzResponse(String str, ViewPort viewPort, Restriction restriction) {
        this.customTplLink = str;
        this.viewport = viewPort;
        this.restriction = restriction;
    }

    public static /* synthetic */ RecommendPvzResponse copy$default(RecommendPvzResponse recommendPvzResponse, String str, ViewPort viewPort, Restriction restriction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = recommendPvzResponse.customTplLink;
        }
        if ((i11 & 2) != 0) {
            viewPort = recommendPvzResponse.viewport;
        }
        if ((i11 & 4) != 0) {
            restriction = recommendPvzResponse.restriction;
        }
        return recommendPvzResponse.copy(str, viewPort, restriction);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCustomTplLink() {
        return this.customTplLink;
    }

    /* renamed from: component2, reason: from getter */
    public final ViewPort getViewport() {
        return this.viewport;
    }

    /* renamed from: component3, reason: from getter */
    public final Restriction getRestriction() {
        return this.restriction;
    }

    @NotNull
    public final RecommendPvzResponse copy(String customTplLink, ViewPort viewport, Restriction restriction) {
        return new RecommendPvzResponse(customTplLink, viewport, restriction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendPvzResponse)) {
            return false;
        }
        RecommendPvzResponse recommendPvzResponse = (RecommendPvzResponse) other;
        return Intrinsics.d(this.customTplLink, recommendPvzResponse.customTplLink) && Intrinsics.d(this.viewport, recommendPvzResponse.viewport) && Intrinsics.d(this.restriction, recommendPvzResponse.restriction);
    }

    public final String getCustomTplLink() {
        return this.customTplLink;
    }

    public final Restriction getRestriction() {
        return this.restriction;
    }

    public final ViewPort getViewport() {
        return this.viewport;
    }

    public int hashCode() {
        String str = this.customTplLink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ViewPort viewPort = this.viewport;
        int hashCode2 = (hashCode + (viewPort == null ? 0 : viewPort.hashCode())) * 31;
        Restriction restriction = this.restriction;
        return hashCode2 + (restriction != null ? restriction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RecommendPvzResponse(customTplLink=" + this.customTplLink + ", viewport=" + this.viewport + ", restriction=" + this.restriction + ")";
    }
}
