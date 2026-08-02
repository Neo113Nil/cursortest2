package ru.ozon.app.android.returns.cancels.deeplink;

import C.J;
import De.C2860c;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.returns.cancels.modalConstructor.presentation.configurators.NestedScrollingDisabledConfigurator;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/cancels/deeplink/SelectCancelReasonDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "buildScreenConfig", "(Ljava/lang/String;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "", "pathSegments", "", "isSelectCancelReason", "(Ljava/util/List;)Z", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectCancelReasonDeeplinkHandler implements a {
    private final ComposerScreenConfig buildScreenConfig(String deeplink) {
        String str = null;
        return new ComposerScreenConfig(new h.c.a(deeplink, str, str, 14), null, false, null, false, false, false, false, null, false, false, false, e0.h(NestedScrollingDisabledConfigurator.class), null, Integer.valueOf(UniColors.LAYER_FLOOR_0.getResId()), null, false, null, null, 16, false, false, null, null, 16232382, null);
    }

    private final boolean isSelectCancelReason(List<String> pathSegments) {
        String str = (String) C7714v.M(pathSegments);
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("selectCancelReason") || str.equalsIgnoreCase("selectCancelReasonRms");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "my") && !C2860c.c(route, "getPathSegments(...)").isEmpty() && isSelectCancelReason(C2860c.c(route, "getPathSegments(...)"));
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return new ComposerFragmentDestination(buildScreenConfig(a11), a11, null, false, false, null, false, false, null, 508, null);
    }
}
