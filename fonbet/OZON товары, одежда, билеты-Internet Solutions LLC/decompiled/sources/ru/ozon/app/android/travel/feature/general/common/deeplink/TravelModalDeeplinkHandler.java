package ru.ozon.app.android.travel.feature.general.common.deeplink;

import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.travel.pageconfigurator.modalParentRefresh.ModalParentRefreshConfigurator;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import ru.ozon.uni.core.UniColors;
import uZ.C9992d;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/deeplink/TravelModalDeeplinkHandler;", "LIZ/a;", "LHZ/a;", "deeplinkHandlersCache", "<init>", "(LHZ/a;)V", "Landroid/net/Uri;", "deeplink", "LuZ/d$b;", "getNavigationMode", "(Landroid/net/Uri;)LuZ/d$b;", "", "getMinimumHeight", "(Landroid/net/Uri;)I", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "getDisplayMode", "(Landroid/net/Uri;)Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "", "isSearchPoints", "(Landroid/net/Uri;)Z", "isDismissActivityResultEnabled", "Lru/ozon/app/android/composer/universalscreen/view/BackgroundColorAttr;", "getBackgroundColor-CG0atzM", "getBackgroundColor", "getAnimationEnabled", "Lru/ozon/uni/android/component/sheet/SheetSoftInputMode;", "getSoftInput", "(Landroid/net/Uri;)Lru/ozon/uni/android/component/sheet/SheetSoftInputMode;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "LHZ/a;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelModalDeeplinkHandler implements a {

    @NotNull
    private final HZ.a deeplinkHandlersCache;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/deeplink/TravelModalDeeplinkHandler$Companion;", "", "<init>", "()V", "KEY_FULL_SCREEN", "", "VALUE_FULL_SCREEN", "KEY_MINIMUM_HEIGHT", "KEY_NAVIGATION_MODE", "VALUE_NAVIGATION_MODE", "KEY_IS_REFRESH_AFTER_DISMISS_ENABLED", "KEY_IS_ONBOARDING_AFTER_DISMISS_ENABLED", "KEY_BACKGROUND_COLOR", "KEY_ANIMATION_ENABLED", "KEY_IS_SOFT_INPUT_ENABLED", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TravelModalDeeplinkHandler(@NotNull HZ.a deeplinkHandlersCache) {
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        this.deeplinkHandlersCache = deeplinkHandlersCache;
    }

    private final boolean getAnimationEnabled(Uri deeplink) {
        Boolean t02;
        String queryParameter = deeplink.getQueryParameter("animationEnabled");
        if (queryParameter == null || (t02 = h.t0(queryParameter)) == null) {
            return true;
        }
        return t02.booleanValue();
    }

    /* renamed from: getBackgroundColor-CG0atzM, reason: not valid java name */
    private final int m1181getBackgroundColorCG0atzM(Uri deeplink) {
        return BackgroundColorAttr.m673constructorimpl(Intrinsics.d(deeplink.getQueryParameter("backgroundColor"), UniColors.LAYER_FLOOR_0.getToken()) ? R$attr.layerFloor0 : R$attr.layerFloor1);
    }

    private final ComposerFragment.DisplayMode getDisplayMode(Uri deeplink) {
        String str;
        String queryParameter = deeplink.getQueryParameter("screenSizeType");
        if (queryParameter != null) {
            str = queryParameter.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        return Intrinsics.d(str, "full") ? ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL : ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP;
    }

    private final int getMinimumHeight(Uri deeplink) {
        String queryParameter = deeplink.getQueryParameter("minimumHeight");
        return queryParameter != null ? Integer.parseInt(queryParameter) : ComposerScreenConfig.BottomSheetConfig.INSTANCE.getMIN_HEIGHT_DEFAULT();
    }

    private final C9992d.b getNavigationMode(Uri deeplink) {
        return Intrinsics.d(deeplink.getQueryParameter("navigationMode"), "keep") ? C9992d.b.c.f100438a : C9992d.b.a.f100436a;
    }

    private final SheetSoftInputMode getSoftInput(Uri deeplink) {
        return Boolean.parseBoolean(deeplink.getQueryParameter("isSoftInputEnabled")) ? SheetSoftInputMode.ADJUST_RESIZE : SheetSoftInputMode.UNSPECIFIED;
    }

    private final boolean isDismissActivityResultEnabled(Uri deeplink) {
        return Boolean.parseBoolean(deeplink.getQueryParameter("isRefreshAfterDismissEnabled")) || Boolean.parseBoolean(deeplink.getQueryParameter("isOnboardingAfterDismissEnabled"));
    }

    private final boolean isSearchPoints(Uri deeplink) {
        return e0.a("aviaSearchPoints", "hotelsSearchPoints", "railwaySearchPoints", "tourSearchPoints").contains(deeplink.getPathSegments().get(1));
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        if (Intrinsics.d(b11.getAuthority(), "travel") && pathSegments.size() == 2 && Intrinsics.d(C7714v.K(pathSegments), "modal")) {
            return !this.deeplinkHandlersCache.c(route, this);
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        String uri = b11.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        String uri2 = b11.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return new BottomSheetComposerFragmentDestination(uri, new ComposerScreenConfig(new h.c.a(uri2, (String) null, (String) null, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(getDisplayMode(b11), true, false, getSoftInput(b11), getMinimumHeight(b11), false, isDismissActivityResultEnabled(b11), false, false, false, false, 1956, null), false, getAnimationEnabled(b11), false, false, null, false, false, false, e0.h(ModalParentRefreshConfigurator.class), e0.h(LongPollingPageComposerInterceptor.class), null, BackgroundColorAttr.m672boximpl(m1181getBackgroundColorCG0atzM(b11)), false, null, null, null, isSearchPoints(b11), false, null, null, 15683542, null), getNavigationMode(b11), null, 9001, null, 40, null);
    }
}
