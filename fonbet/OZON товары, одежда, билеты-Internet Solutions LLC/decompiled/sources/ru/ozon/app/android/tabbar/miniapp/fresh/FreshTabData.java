package ru.ozon.app.android.tabbar.miniapp.fresh;

import NZ.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.ActiveColorsConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "", "", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "bottomNavigationTabs", "LNZ/h;", "tabNavigatorConfig", "Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "activeTabConfig", "<init>", "(Ljava/util/List;LNZ/h;Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBottomNavigationTabs", "()Ljava/util/List;", "LNZ/h;", "getTabNavigatorConfig", "()LNZ/h;", "Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "getActiveTabConfig", "()Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FreshTabData {

    @NotNull
    private final ActiveColorsConfig activeTabConfig;

    @NotNull
    private final List<BottomNavigationItem> bottomNavigationTabs;

    @NotNull
    private final h tabNavigatorConfig;

    public FreshTabData(@NotNull List<BottomNavigationItem> bottomNavigationTabs, @NotNull h tabNavigatorConfig, @NotNull ActiveColorsConfig activeTabConfig) {
        Intrinsics.checkNotNullParameter(bottomNavigationTabs, "bottomNavigationTabs");
        Intrinsics.checkNotNullParameter(tabNavigatorConfig, "tabNavigatorConfig");
        Intrinsics.checkNotNullParameter(activeTabConfig, "activeTabConfig");
        this.bottomNavigationTabs = bottomNavigationTabs;
        this.tabNavigatorConfig = tabNavigatorConfig;
        this.activeTabConfig = activeTabConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshTabData)) {
            return false;
        }
        FreshTabData freshTabData = (FreshTabData) other;
        return Intrinsics.d(this.bottomNavigationTabs, freshTabData.bottomNavigationTabs) && Intrinsics.d(this.tabNavigatorConfig, freshTabData.tabNavigatorConfig) && Intrinsics.d(this.activeTabConfig, freshTabData.activeTabConfig);
    }

    @NotNull
    public final ActiveColorsConfig getActiveTabConfig() {
        return this.activeTabConfig;
    }

    @NotNull
    public final List<BottomNavigationItem> getBottomNavigationTabs() {
        return this.bottomNavigationTabs;
    }

    @NotNull
    public final h getTabNavigatorConfig() {
        return this.tabNavigatorConfig;
    }

    public int hashCode() {
        return this.activeTabConfig.hashCode() + ((this.tabNavigatorConfig.hashCode() + (this.bottomNavigationTabs.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FreshTabData(bottomNavigationTabs=" + this.bottomNavigationTabs + ", tabNavigatorConfig=" + this.tabNavigatorConfig + ", activeTabConfig=" + this.activeTabConfig + ")";
    }
}
