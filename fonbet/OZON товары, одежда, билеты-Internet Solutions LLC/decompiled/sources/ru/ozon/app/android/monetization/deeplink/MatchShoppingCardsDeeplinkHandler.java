package ru.ozon.app.android.monetization.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshAfterDismissAndPopPageConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeToEdgeConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.TopEdgeConfigurator;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/monetization/deeplink/MatchShoppingCardsDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teenStorage", "<init>", "(Lru/ozon/app/android/storage/teensMode/TeensModeStorage;)V", "", "deeplink", "Landroid/content/Context;", "context", "Lru/ozon/app/android/composer/navigations/destinations/ComposerTabFragmentDestination;", "getTabFragmentDestination", "(Ljava/lang/String;Landroid/content/Context;)Lru/ozon/app/android/composer/navigations/destinations/ComposerTabFragmentDestination;", "Lru/ozon/app/android/composer/navigations/destinations/ComposerFragmentDestination;", "getFragmentDestination", "(Ljava/lang/String;Landroid/content/Context;)Lru/ozon/app/android/composer/navigations/destinations/ComposerFragmentDestination;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MatchShoppingCardsDeeplinkHandler implements a {

    @NotNull
    private final TeensModeStorage teenStorage;

    public MatchShoppingCardsDeeplinkHandler(@NotNull TeensModeStorage teenStorage) {
        Intrinsics.checkNotNullParameter(teenStorage, "teenStorage");
        this.teenStorage = teenStorage;
    }

    private final ComposerFragmentDestination getFragmentDestination(String deeplink, Context context) {
        h.c.a aVar = new h.c.a(deeplink, (String) null, (String) null, 14);
        Class[] elements = {EdgeToEdgeConfigurator.class, RefreshAfterDismissAndPopPageConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerFragmentDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, C7705l.j0(elements), null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.bgDarkKey)), false, new ComposerScreenConfig.AppearanceConfig(new l.a.C1079a(0L, Integer.valueOf(context.getColor(R$color.transparent)), 1)), null, null, false, false, null, null, 16607164, null), deeplink, null, false, false, null, false, false, null, 508, null);
    }

    private final ComposerTabFragmentDestination getTabFragmentDestination(String deeplink, Context context) {
        h.c.a aVar = new h.c.a(deeplink, (String) null, (String) null, 14);
        Class[] elements = {TopEdgeConfigurator.class, RefreshAfterDismissAndPopPageConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerTabFragmentDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, false, C7705l.j0(elements), null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.bgDarkKey)), false, new ComposerScreenConfig.AppearanceConfig(new l.a.C1079a(0L, Integer.valueOf(context.getColor(R$color.transparent)), 1)), null, null, false, false, null, null, 16609180, null), deeplink, R$id.menu_teen_swipes, null, false, true, null, 88, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "matchShopping") && route.b().getPathSegments().isEmpty();
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return this.teenStorage.isTeensModeEnabled() ? getTabFragmentDestination(a11, context) : getFragmentDestination(a11, context);
    }
}
