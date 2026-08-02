package ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler;

import android.net.Uri;
import c8.C5766e;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.screen.b;

/* loaded from: classes10.dex */
public final class h implements a {
    @Override // ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a
    @NotNull
    public final ru.ozon.android.messenger.framework.composer.navigation.e a(@NotNull String deeplink, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(params, "params");
        return new ru.ozon.android.messenger.framework.composer.navigation.c(new ru.ozon.android.messenger.framework.composer.navigation.config.a(deeplink, params), b.a.BOTTOM_SHEET_WRAP);
    }

    @Override // ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a
    public final boolean b(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Uri parse = Uri.parse(deeplink);
        return Intrinsics.d(parse.getAuthority(), "modal") && C5766e.c(parse, "getPathSegments(...)", 0, "complaintModal");
    }
}
