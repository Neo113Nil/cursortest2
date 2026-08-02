package ru.ozon.app.android.favorites.deeplink;

import B0.C2454a;
import C.J;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.configurators.CreateShoppingListInputInsetsConfigurator;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/favorites/deeplink/FavoritesListsSelectDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "insetsAvailable", "()Z", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesListsSelectDeeplinkHandler implements a {
    private final boolean insetsAvailable() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (Intrinsics.d(b11.getAuthority(), "modal")) {
            List<String> pathSegments = b11.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (pathSegments.size() == 1 && C2454a.h(b11, "favoritesListsSelect", 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return new BottomSheetComposerFragmentDestination(a11, new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, !insetsAvailable() ? SheetSoftInputMode.ADJUST_RESIZE : SheetSoftInputMode.UNSPECIFIED, 0, false, false, false, false, false, false, 2038, null), false, false, false, false, null, false, false, false, insetsAvailable() ? e0.h(CreateShoppingListInputInsetsConfigurator.class) : M.f71699a, null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, false, false, null, null, 16740342, null), null, null, null, null, 60, null);
    }
}
