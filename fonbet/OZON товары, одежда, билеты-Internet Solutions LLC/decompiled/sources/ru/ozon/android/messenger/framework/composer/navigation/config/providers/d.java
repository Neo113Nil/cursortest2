package ru.ozon.android.messenger.framework.composer.navigation.config.providers;

import T7.Z;
import android.net.Uri;
import c8.C5766e;
import i10.h;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.u;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.messenger.framework.composer.screen.b;
import ru.ozon.android.messenger.framework.composer.screen.e;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;

/* loaded from: classes10.dex */
public final class d implements ru.ozon.android.messenger.framework.composer.navigation.config.b {
    @Override // ru.ozon.android.messenger.framework.composer.navigation.config.b
    @NotNull
    public final e a(@NotNull ru.ozon.android.messenger.framework.composer.navigation.config.a page) {
        Intrinsics.checkNotNullParameter(page, "page");
        String b11 = page.b();
        Map<String, String> a11 = page.a();
        if (!a11.isEmpty()) {
            String jSONObject = new JSONObject(a11).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            b11 = Z.a(b11, h.u(b11, '?') ? "&" : "?", "data=", jSONObject);
        }
        h.c.a aVar = new h.c.a(b11, (String) null, (String) null, 14);
        int i11 = R$color.layer_floor_1;
        return new e(aVar, new u(0), new e.a(b.a.BOTTOM_SHEET_WRAP, SheetSoftInputMode.ADJUST_RESIZE, ru.ozon.android.messenger.utils.h.c(400), 614), e0.h(new ru.ozon.android.messenger.framework.composer.navigation.interceptors.a(page.a())), i11, null, 26228);
    }

    @Override // ru.ozon.android.messenger.framework.composer.navigation.config.b
    public final boolean b(@NotNull ru.ozon.android.messenger.framework.composer.navigation.config.a page) {
        Intrinsics.checkNotNullParameter(page, "page");
        Uri parse = Uri.parse(page.b());
        return Intrinsics.d(parse.getAuthority(), "modal") && C5766e.c(parse, "getPathSegments(...)", 0, "complaintModal");
    }
}
