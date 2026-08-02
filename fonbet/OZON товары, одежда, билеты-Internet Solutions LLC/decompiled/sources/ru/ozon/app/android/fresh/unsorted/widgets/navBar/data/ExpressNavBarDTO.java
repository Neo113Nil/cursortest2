package ru.ozon.app.android.fresh.unsorted.widgets.navBar.data;

import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JF\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/data/ExpressNavBarDTO;", "", "navBarTintColor", "", "navTintColor", "hideSystemBackButton", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "getNavBarTintColor", "()Ljava/lang/String;", "getNavTintColor", "getHideSystemBackButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/fresh/unsorted/widgets/navBar/data/ExpressNavBarDTO;", "equals", "other", "hashCode", "", "toString", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ExpressNavBarDTO {

    @NotNull
    public static final String NESTED_PLACEHOLDER_CENTER = "default";

    @NotNull
    public static final String NESTED_PLACEHOLDER_LEFT = "left";

    @NotNull
    public static final String NESTED_PLACEHOLDER_RIGHT = "right";
    private final Boolean hideSystemBackButton;

    @NotNull
    private final String navBarTintColor;

    @NotNull
    private final String navTintColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    public static final int $stable = 8;

    public ExpressNavBarDTO(@NotNull String navBarTintColor, @NotNull String navTintColor, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(navBarTintColor, "navBarTintColor");
        Intrinsics.checkNotNullParameter(navTintColor, "navTintColor");
        this.navBarTintColor = navBarTintColor;
        this.navTintColor = navTintColor;
        this.hideSystemBackButton = bool;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpressNavBarDTO copy$default(ExpressNavBarDTO expressNavBarDTO, String str, String str2, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = expressNavBarDTO.navBarTintColor;
        }
        if ((i11 & 2) != 0) {
            str2 = expressNavBarDTO.navTintColor;
        }
        if ((i11 & 4) != 0) {
            bool = expressNavBarDTO.hideSystemBackButton;
        }
        if ((i11 & 8) != 0) {
            map = expressNavBarDTO.trackingInfo;
        }
        return expressNavBarDTO.copy(str, str2, bool, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNavBarTintColor() {
        return this.navBarTintColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNavTintColor() {
        return this.navTintColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHideSystemBackButton() {
        return this.hideSystemBackButton;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ExpressNavBarDTO copy(@NotNull String navBarTintColor, @NotNull String navTintColor, Boolean hideSystemBackButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(navBarTintColor, "navBarTintColor");
        Intrinsics.checkNotNullParameter(navTintColor, "navTintColor");
        return new ExpressNavBarDTO(navBarTintColor, navTintColor, hideSystemBackButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpressNavBarDTO)) {
            return false;
        }
        ExpressNavBarDTO expressNavBarDTO = (ExpressNavBarDTO) other;
        return Intrinsics.d(this.navBarTintColor, expressNavBarDTO.navBarTintColor) && Intrinsics.d(this.navTintColor, expressNavBarDTO.navTintColor) && Intrinsics.d(this.hideSystemBackButton, expressNavBarDTO.hideSystemBackButton) && Intrinsics.d(this.trackingInfo, expressNavBarDTO.trackingInfo);
    }

    public final Boolean getHideSystemBackButton() {
        return this.hideSystemBackButton;
    }

    @NotNull
    public final String getNavBarTintColor() {
        return this.navBarTintColor;
    }

    @NotNull
    public final String getNavTintColor() {
        return this.navTintColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.navBarTintColor.hashCode() * 31, 31, this.navTintColor);
        Boolean bool = this.hideSystemBackButton;
        int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.navBarTintColor;
        String str2 = this.navTintColor;
        Boolean bool = this.hideSystemBackButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("ExpressNavBarDTO(navBarTintColor=", str, ", navTintColor=", str2, ", hideSystemBackButton=");
        d11.append(bool);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ ExpressNavBarDTO(String str, String str2, Boolean bool, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, (i11 & 8) != 0 ? null : map);
    }
}
