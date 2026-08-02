package ru.ozon.app.android.tabbar;

import android.view.MenuItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/tabbar/NavigationItemListener;", "", "onNavigationItemSelected", "", "item", "Landroid/view/MenuItem;", "badge", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NavigationItemListener {
    boolean onNavigationItemSelected(@NotNull MenuItem item, IndicatorDTO badge);
}
