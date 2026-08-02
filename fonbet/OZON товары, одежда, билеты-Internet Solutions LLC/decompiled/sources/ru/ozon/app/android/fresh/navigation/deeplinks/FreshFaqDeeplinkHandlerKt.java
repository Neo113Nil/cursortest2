package ru.ozon.app.android.fresh.navigation.deeplinks;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isUrlFaqExpress", "", "", "navigation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshFaqDeeplinkHandlerKt {
    public static final boolean isUrlFaqExpress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return h.t(str, "https://docs.ozon.ru/common-mobile/fresh/", false) || h.t(str, "https://docs.ozon.ru/common-mobile/express/", false);
    }
}
