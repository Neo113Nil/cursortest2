package ru.ozon.app.android.fresh.navigation.deeplinks;

import B0.C2454a;
import C.J;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.fresh.navigation.configurators.AddressPopUpStateConfigurator;
import ru.ozon.app.android.fresh.navigation.configurators.ConfirmDeleteResultConfigurator;
import ru.ozon.app.android.fresh.navigation.configurators.DismissOnAddressUpdateConfigurator;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/navigation/deeplinks/AddressPopupDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressPopupDeeplinkHandler implements a {
    private static final int BOTTOM_SHEET_DEF_HEIGHT = ResourceExtKt.toPx(100);

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (Intrinsics.d(b11.getAuthority(), "cart")) {
            List<String> pathSegments = b11.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (pathSegments.size() == 1 && C2454a.h(b11, "accuracy_delivery_address", 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        LinkedHashSet e11 = e0.e(ConfirmDeleteResultConfigurator.class);
        if (Intrinsics.d(route.b().getQueryParameter(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME), "addressSelect")) {
            e11.add(DismissOnAddressUpdateConfigurator.class);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (Intrinsics.d(route.b().getQueryParameter(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME), "addToCart")) {
            linkedHashSet.add(AddressPopUpStateConfigurator.class);
        }
        return new BottomSheetComposerFragmentDestination(a11, new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(null, 0, 2, 0 == true ? 1 : 0), false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, BOTTOM_SHEET_DEF_HEIGHT, false, false, false, false, false, false, 2030, null), false, false, false, false, null, false, false, false, e11, linkedHashSet, null, null, false, null, null, null, false, false, null, null, 16764916, null), null, null, null, null, 60, null);
    }
}
