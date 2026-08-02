package ru.ozon.android.messenger.framework.composer.navigation.config.providers;

import B0.C2454a;
import android.net.Uri;
import i10.h;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.screen.e;
import ru.ozon.uni.R$color;

/* loaded from: classes10.dex */
public final class b implements ru.ozon.android.messenger.framework.composer.navigation.config.b {
    @Override // ru.ozon.android.messenger.framework.composer.navigation.config.b
    @NotNull
    public final e a(@NotNull ru.ozon.android.messenger.framework.composer.navigation.config.a page) {
        Intrinsics.checkNotNullParameter(page, "page");
        return new e(new h.c.a(page.b(), (String) null, (String) null, 14), null, null, e0.h(new ru.ozon.android.messenger.framework.composer.navigation.interceptors.a(page.a())), R$color.bg_primary, ru.ozon.android.messenger.framework.composer.emptyscreen.b.class, 18044);
    }

    @Override // ru.ozon.android.messenger.framework.composer.navigation.config.b
    public final boolean b(@NotNull ru.ozon.android.messenger.framework.composer.navigation.config.a page) {
        Intrinsics.checkNotNullParameter(page, "page");
        Uri parse = Uri.parse(page.b());
        return Intrinsics.d(parse.getAuthority(), "messenger") && parse.getPathSegments().size() == 2 && C2454a.h(parse, "sx", 0) && C2454a.h(parse, "fastAnswerTemplateList", 1);
    }
}
