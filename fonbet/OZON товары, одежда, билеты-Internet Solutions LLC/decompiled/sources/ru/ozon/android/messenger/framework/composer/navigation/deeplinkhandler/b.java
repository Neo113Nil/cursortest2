package ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler;

import B0.C2454a;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.screen.b;

/* loaded from: classes10.dex */
public final class b implements a {
    @Override // ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a
    @NotNull
    public final ru.ozon.android.messenger.framework.composer.navigation.e a(@NotNull String deeplink, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(params, "params");
        return new ru.ozon.android.messenger.framework.composer.navigation.f(new ru.ozon.android.messenger.framework.composer.navigation.config.a(deeplink, params), b.a.REGULAR);
    }

    @Override // ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a
    public final boolean b(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Uri parse = Uri.parse(deeplink);
        return parse.getPathSegments().size() == 3 && C2454a.h(parse, "messenger", 0) && C2454a.h(parse, "sx", 1) && C2454a.h(parse, "fastAnswerTemplateEdit", 2);
    }
}
