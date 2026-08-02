package ru.ozon.app.android.tabbar.data;

import NZ.h;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/tabbar/data/TabConfig;", "Landroid/os/Parcelable;", "<init>", "()V", "LNZ/h;", "getTabNavigatorConfig", "()LNZ/h;", "tabNavigatorConfig", "Lru/ozon/app/android/tabbar/data/LocalTabConfig;", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TabConfig implements Parcelable {
    public /* synthetic */ TabConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract h getTabNavigatorConfig();

    private TabConfig() {
    }
}
