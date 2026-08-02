package ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.data;

import Ih.a;
import Ql.c;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/data/NavBarIconButtonDTO;", "", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NavBarIconButtonDTO {

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final String icon;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public NavBarIconButtonDTO(@NotNull String icon, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.icon = icon;
        this.action = action;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavBarIconButtonDTO copy$default(NavBarIconButtonDTO navBarIconButtonDTO, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navBarIconButtonDTO.icon;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = navBarIconButtonDTO.action;
        }
        if ((i11 & 4) != 0) {
            map = navBarIconButtonDTO.trackingInfo;
        }
        return navBarIconButtonDTO.copy(str, atomActionDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final NavBarIconButtonDTO copy(@NotNull String icon, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        return new NavBarIconButtonDTO(icon, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarIconButtonDTO)) {
            return false;
        }
        NavBarIconButtonDTO navBarIconButtonDTO = (NavBarIconButtonDTO) other;
        return Intrinsics.d(this.icon, navBarIconButtonDTO.icon) && Intrinsics.d(this.action, navBarIconButtonDTO.action) && Intrinsics.d(this.trackingInfo, navBarIconButtonDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = a.b(this.action, this.icon.hashCode() * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        AtomActionDTO atomActionDTO = this.action;
        return P.f(c.c("NavBarIconButtonDTO(icon=", str, ", action=", atomActionDTO, ", trackingInfo="), this.trackingInfo, ")");
    }
}
