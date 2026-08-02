package ru.ozon.app.android.tabbar.ui.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.ActiveTabConfig;
import ru.ozon.app.android.tabbar.ui.ActiveColorsConfig;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"mapActiveTabConfig", "Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "Lru/ozon/app/android/tabbar/data/ActiveTabConfig;", "iconAltColor", "", "titleAltColor", "(Lru/ozon/app/android/tabbar/data/ActiveTabConfig;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "tabbar_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapperActiveTabConfigKt {
    @NotNull
    public static final ActiveColorsConfig mapActiveTabConfig(ActiveTabConfig activeTabConfig, Integer num, Integer num2) {
        return new ActiveColorsConfig(activeTabConfig != null ? activeTabConfig.getTitleColor() : null, activeTabConfig != null ? activeTabConfig.getIconColor() : null, num, num2);
    }

    public static /* synthetic */ ActiveColorsConfig mapActiveTabConfig$default(ActiveTabConfig activeTabConfig, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        return mapActiveTabConfig(activeTabConfig, num, num2);
    }
}
