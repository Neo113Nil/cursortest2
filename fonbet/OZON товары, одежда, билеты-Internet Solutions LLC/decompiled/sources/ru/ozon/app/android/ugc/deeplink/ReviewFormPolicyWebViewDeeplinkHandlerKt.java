package ru.ozon.app.android.ugc.deeplink;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isUrlPolicy", "", "", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormPolicyWebViewDeeplinkHandlerKt {
    public static final boolean isUrlPolicy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return h.t(str, "https://docs.ozon.ru/legal/terms-of-use/site/content-policy", false);
    }
}
