package ru.ozon.app.android.tabbar.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "", "activeTabConfig", "Lru/ozon/app/android/tabbar/data/ActiveTabConfig;", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/tabbar/data/TabConfigDTO;", "<init>", "(Lru/ozon/app/android/tabbar/data/ActiveTabConfig;Ljava/util/List;)V", "getActiveTabConfig", "()Lru/ozon/app/android/tabbar/data/ActiveTabConfig;", "getTabs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TabConfigResponse {
    private final ActiveTabConfig activeTabConfig;

    @NotNull
    private final List<TabConfigDTO> tabs;

    public TabConfigResponse(ActiveTabConfig activeTabConfig, @NotNull List<TabConfigDTO> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.activeTabConfig = activeTabConfig;
        this.tabs = tabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabConfigResponse copy$default(TabConfigResponse tabConfigResponse, ActiveTabConfig activeTabConfig, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            activeTabConfig = tabConfigResponse.activeTabConfig;
        }
        if ((i11 & 2) != 0) {
            list = tabConfigResponse.tabs;
        }
        return tabConfigResponse.copy(activeTabConfig, list);
    }

    /* renamed from: component1, reason: from getter */
    public final ActiveTabConfig getActiveTabConfig() {
        return this.activeTabConfig;
    }

    @NotNull
    public final List<TabConfigDTO> component2() {
        return this.tabs;
    }

    @NotNull
    public final TabConfigResponse copy(ActiveTabConfig activeTabConfig, @NotNull List<TabConfigDTO> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new TabConfigResponse(activeTabConfig, tabs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabConfigResponse)) {
            return false;
        }
        TabConfigResponse tabConfigResponse = (TabConfigResponse) other;
        return Intrinsics.d(this.activeTabConfig, tabConfigResponse.activeTabConfig) && Intrinsics.d(this.tabs, tabConfigResponse.tabs);
    }

    public final ActiveTabConfig getActiveTabConfig() {
        return this.activeTabConfig;
    }

    @NotNull
    public final List<TabConfigDTO> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        ActiveTabConfig activeTabConfig = this.activeTabConfig;
        return this.tabs.hashCode() + ((activeTabConfig == null ? 0 : activeTabConfig.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "TabConfigResponse(activeTabConfig=" + this.activeTabConfig + ", tabs=" + this.tabs + ")";
    }
}
