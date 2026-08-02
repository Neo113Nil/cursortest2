package ru.ozon.android.messenger.framework.composer.navigation.config.providers;

import B0.C2454a;
import android.net.Uri;
import i10.h;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.screen.b;
import ru.ozon.android.messenger.framework.composer.screen.e;
import ru.ozon.uni.R$color;

/* loaded from: classes10.dex */
public final class c implements ru.ozon.android.messenger.framework.composer.navigation.config.b {
    @Override // ru.ozon.android.messenger.framework.composer.navigation.config.b
    @NotNull
    public final e a(@NotNull ru.ozon.android.messenger.framework.composer.navigation.config.a page) {
        Intrinsics.checkNotNullParameter(page, "page");
        h.c.a aVar = new h.c.a(page.b(), (String) null, (String) null, 14);
        int i11 = R$color.layer_floor_1;
        return new e(aVar, null, new e.a(b.a.BOTTOM_SHEET_WRAP, null, ru.ozon.android.messenger.utils.h.c(400), 622), e0.h(new ru.ozon.android.messenger.framework.composer.navigation.interceptors.a(page.a())), i11, null, 26228);
    }

    @Override // ru.ozon.android.messenger.framework.composer.navigation.config.b
    public final boolean b(@NotNull ru.ozon.android.messenger.framework.composer.navigation.config.a page) {
        Intrinsics.checkNotNullParameter(page, "page");
        Uri parse = Uri.parse(page.b());
        return parse.getPathSegments().size() == 3 && C2454a.h(parse, "messenger", 0) && C2454a.h(parse, "sx", 1) && C2454a.h(parse, "fastAnswerTemplateRemove", 2);
    }
}
