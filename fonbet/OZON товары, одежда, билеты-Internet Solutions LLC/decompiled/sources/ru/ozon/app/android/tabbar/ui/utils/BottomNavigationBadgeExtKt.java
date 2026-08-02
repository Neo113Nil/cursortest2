package ru.ozon.app.android.tabbar.ui.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "", "count", "", "updateBadgeCount", "(Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;I)V", "showEmptyBadge", "(Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;)V", "", "countAsString", "(I)Ljava/lang/String;", "tabbar_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BottomNavigationBadgeExtKt {
    @NotNull
    public static final String countAsString(int i11) {
        return i11 > 99 ? "99+" : String.valueOf(i11);
    }

    public static final void showEmptyBadge(@NotNull BaseOzonBottomTabView baseOzonBottomTabView) {
        Intrinsics.checkNotNullParameter(baseOzonBottomTabView, "<this>");
        BaseOzonBottomTabView.bindBadge$default(baseOzonBottomTabView, new IndicatorDTO("", null, IndicatorDTO.IndicatorSize.SIZE_450, null, null, IndicatorDTO.IndicatorContent.NONE, null, null, null, IndicatorDTO.Style.ACCENT, null, 1498, null), null, 2, null);
    }

    public static final void updateBadgeCount(@NotNull BaseOzonBottomTabView baseOzonBottomTabView, int i11) {
        Intrinsics.checkNotNullParameter(baseOzonBottomTabView, "<this>");
        if (i11 == 0) {
            baseOzonBottomTabView.removeBadge("");
        } else {
            baseOzonBottomTabView.bindBadge(new IndicatorDTO(countAsString(i11), null, null, null, null, IndicatorDTO.IndicatorContent.TEXT, null, null, null, IndicatorDTO.Style.ACCENT, null, 1502, null), String.valueOf(i11));
        }
    }
}
