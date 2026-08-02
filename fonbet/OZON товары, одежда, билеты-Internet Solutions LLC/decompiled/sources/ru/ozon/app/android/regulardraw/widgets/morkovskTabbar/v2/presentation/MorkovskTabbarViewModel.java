package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation;

import androidx.lifecycle.w0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab.MorkovskTabbarTabController;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "widgetId", "", "tabIndex", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/tab/MorkovskTabbarTabController;", "getTabController", "(JI)Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/tab/MorkovskTabbarTabController;", "", "", "controllers", "Ljava/util/Map;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarViewModel extends w0 {

    @NotNull
    private final Map<String, MorkovskTabbarTabController> controllers = new LinkedHashMap();

    @NotNull
    public final MorkovskTabbarTabController getTabController(long widgetId, int tabIndex) {
        Map<String, MorkovskTabbarTabController> map = this.controllers;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(widgetId);
        sb2.append(tabIndex);
        String sb3 = sb2.toString();
        MorkovskTabbarTabController morkovskTabbarTabController = map.get(sb3);
        if (morkovskTabbarTabController == null) {
            morkovskTabbarTabController = new MorkovskTabbarTabController();
            map.put(sb3, morkovskTabbarTabController);
        }
        return morkovskTabbarTabController;
    }
}
