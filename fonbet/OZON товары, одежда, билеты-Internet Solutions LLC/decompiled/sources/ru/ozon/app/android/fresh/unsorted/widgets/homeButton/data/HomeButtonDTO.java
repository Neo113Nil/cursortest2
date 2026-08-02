package ru.ozon.app.android.fresh.unsorted.widgets.homeButton.data;

import Kk.C3532b;
import T7.P;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/data/HomeButtonDTO;", "", "icon", "", "isDefaultBehavior", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ZLjava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HomeButtonDTO {
    public static final int $stable = 8;

    @NotNull
    private final String icon;
    private final boolean isDefaultBehavior;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public HomeButtonDTO(@NotNull String icon, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.icon = icon;
        this.isDefaultBehavior = z11;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeButtonDTO copy$default(HomeButtonDTO homeButtonDTO, String str, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = homeButtonDTO.icon;
        }
        if ((i11 & 2) != 0) {
            z11 = homeButtonDTO.isDefaultBehavior;
        }
        if ((i11 & 4) != 0) {
            map = homeButtonDTO.trackingInfo;
        }
        return homeButtonDTO.copy(str, z11, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDefaultBehavior() {
        return this.isDefaultBehavior;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final HomeButtonDTO copy(@NotNull String icon, boolean isDefaultBehavior, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new HomeButtonDTO(icon, isDefaultBehavior, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeButtonDTO)) {
            return false;
        }
        HomeButtonDTO homeButtonDTO = (HomeButtonDTO) other;
        return Intrinsics.d(this.icon, homeButtonDTO.icon) && this.isDefaultBehavior == homeButtonDTO.isDefaultBehavior && Intrinsics.d(this.trackingInfo, homeButtonDTO.trackingInfo);
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.icon.hashCode() * 31, 31, this.isDefaultBehavior);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    public final boolean isDefaultBehavior() {
        return this.isDefaultBehavior;
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        boolean z11 = this.isDefaultBehavior;
        return P.f(C4636t5.b("HomeButtonDTO(icon=", str, ", isDefaultBehavior=", ", trackingInfo=", z11), this.trackingInfo, ")");
    }
}
