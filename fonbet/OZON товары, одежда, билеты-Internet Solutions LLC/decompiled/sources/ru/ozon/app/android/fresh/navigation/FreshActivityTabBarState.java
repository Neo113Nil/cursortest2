package ru.ozon.app.android.fresh.navigation;

import Bi.a;
import Bi.b;
import NZ.h;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.tabbar.ui.ActiveColorsConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/navigation/FreshActivityTabBarState;", "Landroid/os/Parcelable;", "", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", DynamicElementDTO.TABS, "LNZ/h;", "tabsConfig", "Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "activeColorsConfig", "<init>", "(Ljava/util/List;LNZ/h;Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "LNZ/h;", "getTabsConfig", "()LNZ/h;", "Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "getActiveColorsConfig", "()Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshActivityTabBarState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreshActivityTabBarState> CREATOR = new Creator();

    @NotNull
    private final ActiveColorsConfig activeColorsConfig;

    @NotNull
    private final List<BottomNavigationItem> tabs;

    @NotNull
    private final h tabsConfig;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FreshActivityTabBarState> {
        @Override // android.os.Parcelable.Creator
        public final FreshActivityTabBarState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.a(FreshActivityTabBarState.class, parcel, arrayList, i11, 1);
            }
            return new FreshActivityTabBarState(arrayList, (h) parcel.readParcelable(FreshActivityTabBarState.class.getClassLoader()), (ActiveColorsConfig) parcel.readParcelable(FreshActivityTabBarState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FreshActivityTabBarState[] newArray(int i11) {
            return new FreshActivityTabBarState[i11];
        }
    }

    public FreshActivityTabBarState(@NotNull List<BottomNavigationItem> tabs, @NotNull h tabsConfig, @NotNull ActiveColorsConfig activeColorsConfig) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(tabsConfig, "tabsConfig");
        Intrinsics.checkNotNullParameter(activeColorsConfig, "activeColorsConfig");
        this.tabs = tabs;
        this.tabsConfig = tabsConfig;
        this.activeColorsConfig = activeColorsConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshActivityTabBarState)) {
            return false;
        }
        FreshActivityTabBarState freshActivityTabBarState = (FreshActivityTabBarState) other;
        return Intrinsics.d(this.tabs, freshActivityTabBarState.tabs) && Intrinsics.d(this.tabsConfig, freshActivityTabBarState.tabsConfig) && Intrinsics.d(this.activeColorsConfig, freshActivityTabBarState.activeColorsConfig);
    }

    @NotNull
    public final ActiveColorsConfig getActiveColorsConfig() {
        return this.activeColorsConfig;
    }

    @NotNull
    public final List<BottomNavigationItem> getTabs() {
        return this.tabs;
    }

    @NotNull
    public final h getTabsConfig() {
        return this.tabsConfig;
    }

    public int hashCode() {
        return this.activeColorsConfig.hashCode() + ((this.tabsConfig.hashCode() + (this.tabs.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FreshActivityTabBarState(tabs=" + this.tabs + ", tabsConfig=" + this.tabsConfig + ", activeColorsConfig=" + this.activeColorsConfig + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = a.c(this.tabs, dest);
        while (c11.hasNext()) {
            dest.writeParcelable((Parcelable) c11.next(), flags);
        }
        dest.writeParcelable(this.tabsConfig, flags);
        dest.writeParcelable(this.activeColorsConfig, flags);
    }
}
