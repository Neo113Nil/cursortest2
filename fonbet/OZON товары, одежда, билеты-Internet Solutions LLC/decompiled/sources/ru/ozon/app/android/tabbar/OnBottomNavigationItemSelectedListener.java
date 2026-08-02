package ru.ozon.app.android.tabbar;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/tabbar/OnBottomNavigationItemSelectedListener;", "", "onItemSelectedItem", "", "currentItem", "Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;", "oldItem", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OnBottomNavigationItemSelectedListener {
    boolean onItemSelectedItem(@NotNull BottomMenuItem currentItem, @NotNull BottomMenuItem oldItem);
}
