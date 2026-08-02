package ru.ozon.app.android.universalwidgets.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/universalwidgets/deeplink/SetDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "set");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        String str = null;
        return new ComposerFlowDestination(new ComposerScreenConfig(new h.c.a(a11, str, str, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, 0, false, false, false, false, false, false, 2046, null), false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777206, null), a11, null, null, false, 28, null);
    }
}
