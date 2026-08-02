package ru.ozon.app.android.tabbar;

import Ae.M0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.TabConfig;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/tabbar/TabConfigViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "id", "", "onSelectedTabIdChanged", "(I)V", "", "miniAppName", "Lru/ozon/app/android/tabbar/data/TabConfig;", "getTabConfig", "(Ljava/lang/String;)Lru/ozon/app/android/tabbar/data/TabConfig;", "getTabConfigOrDefault", "LAe/M0;", "getTabConfigState", "()LAe/M0;", "tabConfigState", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TabConfigViewModel extends w0 {
    public abstract TabConfig getTabConfig(@NotNull String miniAppName);

    @NotNull
    public abstract TabConfig getTabConfigOrDefault(@NotNull String miniAppName);

    @NotNull
    public abstract M0<TabConfig> getTabConfigState();

    public abstract void onSelectedTabIdChanged(int id2);
}
