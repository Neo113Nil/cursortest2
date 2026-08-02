package ru.ozon.app.android.search.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import Kk.c;
import Kk.d;
import android.content.Context;
import android.net.Uri;
import i10.h;
import i10.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.common.filterWidgets.filters.configurators.FiltersKeyboardInsetConfigurator;
import ru.ozon.app.android.common.filterWidgets.filters.configurators.MainFilterConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.domain.flags.FullWindowFiltersEnabledFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.widgets.utils.SelectUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/deeplink/FiltersDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "", "topFiltersMinHeight", "I", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FiltersDeeplinkHandler implements a {

    @NotNull
    private final FeatureChecker featureChecker;
    private final int topFiltersMinHeight;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/deeplink/FiltersDeeplinkHandler$Companion;", "", "<init>", "()V", "TOP_FILTERS_MIN_HEIGHT", "", "FAVORITE_FILTERS", "", "TOP_FILTERS", "LOADER_DELAY", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FiltersDeeplinkHandler(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
        this.topFiltersMinHeight = ResourceExtKt.toPx(100);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (Intrinsics.d(b11.getAuthority(), "modal")) {
            List<String> pathSegments = b11.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (!pathSegments.isEmpty()) {
                List<String> pathSegments2 = b11.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                String str = (String) C7714v.Q(0, pathSegments2);
                if (str != null && (str.equals("filters") || str.equals("favoriteFilters") || str.equals("topFilters"))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        boolean c11 = d.c(route, "getPathSegments(...)", 0, "topFilters");
        boolean isEnabled = this.featureChecker.isEnabled(FullWindowFiltersEnabledFlag.INSTANCE);
        h.c.a aVar = new h.c.a(c.c(route, "toString(...)"), (String) null, (String) null, 14);
        ComposerScreenConfig.ToolbarConfig.DefaultState defaultState = new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, null, null, 63, null);
        if (isEnabled) {
            defaultState = null;
        }
        ComposerScreenConfig.ToolbarConfig toolbarConfig = new ComposerScreenConfig.ToolbarConfig(defaultState, 0, 2, null);
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig = (!isEnabled || c11) ? new ComposerScreenConfig.BottomSheetConfig(c11 ? ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP : ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, false, false, c11 ? SheetSoftInputMode.ADJUST_RESIZE : SheetSoftInputMode.UNSPECIFIED, c11 ? this.topFiltersMinHeight : ComposerScreenConfig.BottomSheetConfig.INSTANCE.getMIN_HEIGHT_DEFAULT(), false, false, false, false, false, false, 2022, null) : null;
        ComposerScreenConfig.AppearanceConfig appearanceConfig = new ComposerScreenConfig.AppearanceConfig(new l.a.b(100L, Integer.valueOf(ResourceExtKt.color(context, R$color.transparent))));
        boolean z11 = !SelectUtilsKt.isSelect(context);
        Class[] elements = {MainFilterConfigurator.class, FiltersKeyboardInsetConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerFlowDestination(new ComposerScreenConfig(aVar, toolbarConfig, false, bottomSheetConfig, false, false, false, false, null, false, false, true, C7705l.j0(elements), null, null, BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1)), z11, appearanceConfig, null, 16, false, false, null, null, 16017296, null), a11, null, null, false, 28, null);
    }
}
