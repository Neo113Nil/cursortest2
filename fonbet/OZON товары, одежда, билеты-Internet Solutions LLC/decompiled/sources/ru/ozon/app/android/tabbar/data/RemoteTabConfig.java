package ru.ozon.app.android.tabbar.data;

import Ak.b;
import NZ.h;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.ActiveColorsConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "Lru/ozon/app/android/tabbar/data/TabConfig;", "", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "tabItems", "Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "activeColorsConfig", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationConfig;", "bottomNavigationConfig", "LNZ/h;", "tabNavigatorConfig", "<init>", "(Ljava/util/List;Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;Lru/ozon/app/android/tabbar/ui/model/BottomNavigationConfig;LNZ/h;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/util/List;Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;Lru/ozon/app/android/tabbar/ui/model/BottomNavigationConfig;LNZ/h;)Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTabItems", "()Ljava/util/List;", "Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "getActiveColorsConfig", "()Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationConfig;", "getBottomNavigationConfig", "()Lru/ozon/app/android/tabbar/ui/model/BottomNavigationConfig;", "LNZ/h;", "getTabNavigatorConfig", "()LNZ/h;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RemoteTabConfig extends TabConfig {

    @NotNull
    public static final Parcelable.Creator<RemoteTabConfig> CREATOR = new Creator();

    @NotNull
    private final ActiveColorsConfig activeColorsConfig;

    @NotNull
    private final BottomNavigationConfig bottomNavigationConfig;

    @NotNull
    private final List<BottomNavigationItem> tabItems;

    @NotNull
    private final h tabNavigatorConfig;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RemoteTabConfig> {
        @Override // android.os.Parcelable.Creator
        public final RemoteTabConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(BottomNavigationItem.CREATOR, parcel, arrayList, i11, 1);
            }
            return new RemoteTabConfig(arrayList, ActiveColorsConfig.CREATOR.createFromParcel(parcel), BottomNavigationConfig.valueOf(parcel.readString()), (h) parcel.readParcelable(RemoteTabConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RemoteTabConfig[] newArray(int i11) {
            return new RemoteTabConfig[i11];
        }
    }

    public /* synthetic */ RemoteTabConfig(List list, ActiveColorsConfig activeColorsConfig, BottomNavigationConfig bottomNavigationConfig, h hVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, activeColorsConfig, (i11 & 4) != 0 ? BottomNavigationConfig.DEFAULT : bottomNavigationConfig, hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteTabConfig copy$default(RemoteTabConfig remoteTabConfig, List list, ActiveColorsConfig activeColorsConfig, BottomNavigationConfig bottomNavigationConfig, h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = remoteTabConfig.tabItems;
        }
        if ((i11 & 2) != 0) {
            activeColorsConfig = remoteTabConfig.activeColorsConfig;
        }
        if ((i11 & 4) != 0) {
            bottomNavigationConfig = remoteTabConfig.bottomNavigationConfig;
        }
        if ((i11 & 8) != 0) {
            hVar = remoteTabConfig.tabNavigatorConfig;
        }
        return remoteTabConfig.copy(list, activeColorsConfig, bottomNavigationConfig, hVar);
    }

    @NotNull
    public final RemoteTabConfig copy(@NotNull List<BottomNavigationItem> tabItems, @NotNull ActiveColorsConfig activeColorsConfig, @NotNull BottomNavigationConfig bottomNavigationConfig, @NotNull h tabNavigatorConfig) {
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        Intrinsics.checkNotNullParameter(activeColorsConfig, "activeColorsConfig");
        Intrinsics.checkNotNullParameter(bottomNavigationConfig, "bottomNavigationConfig");
        Intrinsics.checkNotNullParameter(tabNavigatorConfig, "tabNavigatorConfig");
        return new RemoteTabConfig(tabItems, activeColorsConfig, bottomNavigationConfig, tabNavigatorConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteTabConfig)) {
            return false;
        }
        RemoteTabConfig remoteTabConfig = (RemoteTabConfig) other;
        return Intrinsics.d(this.tabItems, remoteTabConfig.tabItems) && Intrinsics.d(this.activeColorsConfig, remoteTabConfig.activeColorsConfig) && this.bottomNavigationConfig == remoteTabConfig.bottomNavigationConfig && Intrinsics.d(this.tabNavigatorConfig, remoteTabConfig.tabNavigatorConfig);
    }

    @NotNull
    public final ActiveColorsConfig getActiveColorsConfig() {
        return this.activeColorsConfig;
    }

    @NotNull
    public final BottomNavigationConfig getBottomNavigationConfig() {
        return this.bottomNavigationConfig;
    }

    @NotNull
    public final List<BottomNavigationItem> getTabItems() {
        return this.tabItems;
    }

    @Override // ru.ozon.app.android.tabbar.data.TabConfig
    @NotNull
    public h getTabNavigatorConfig() {
        return this.tabNavigatorConfig;
    }

    public int hashCode() {
        return this.tabNavigatorConfig.hashCode() + ((this.bottomNavigationConfig.hashCode() + ((this.activeColorsConfig.hashCode() + (this.tabItems.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "RemoteTabConfig(tabItems=" + this.tabItems + ", activeColorsConfig=" + this.activeColorsConfig + ", bottomNavigationConfig=" + this.bottomNavigationConfig + ", tabNavigatorConfig=" + this.tabNavigatorConfig + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = Bi.a.c(this.tabItems, dest);
        while (c11.hasNext()) {
            ((BottomNavigationItem) c11.next()).writeToParcel(dest, flags);
        }
        this.activeColorsConfig.writeToParcel(dest, flags);
        dest.writeString(this.bottomNavigationConfig.name());
        dest.writeParcelable(this.tabNavigatorConfig, flags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteTabConfig(@NotNull List<BottomNavigationItem> tabItems, @NotNull ActiveColorsConfig activeColorsConfig, @NotNull BottomNavigationConfig bottomNavigationConfig, @NotNull h tabNavigatorConfig) {
        super(null);
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        Intrinsics.checkNotNullParameter(activeColorsConfig, "activeColorsConfig");
        Intrinsics.checkNotNullParameter(bottomNavigationConfig, "bottomNavigationConfig");
        Intrinsics.checkNotNullParameter(tabNavigatorConfig, "tabNavigatorConfig");
        this.tabItems = tabItems;
        this.activeColorsConfig = activeColorsConfig;
        this.bottomNavigationConfig = bottomNavigationConfig;
        this.tabNavigatorConfig = tabNavigatorConfig;
    }
}
