package ru.ozon.app.android.core.navigation.page;

import GZ.a;
import GZ.j;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/core/navigation/page/CommonPageProviderImpl;", "LGZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "deeplink", "LpZ/f;", "getDestination", "(LGZ/j;Ljava/lang/String;)LpZ/f;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonPageProviderImpl implements a {
    @Override // GZ.a
    @NotNull
    public f getDestination(@NotNull j route, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(deeplink, (String) null, (String) null, 14), null, false, null, true, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777198, null), deeplink, null, false, false, null, false, false, null, 508, null);
    }
}
