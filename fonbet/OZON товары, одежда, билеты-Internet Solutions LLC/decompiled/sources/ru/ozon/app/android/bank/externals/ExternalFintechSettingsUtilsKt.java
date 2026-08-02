package ru.ozon.app.android.bank.externals;

import L30.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "appVersionStr", "", "getAppVersion", "(Ljava/lang/String;)J", "ozonbank_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExternalFintechSettingsUtilsKt {
    public static final long getAppVersion(@NotNull String appVersionStr) {
        Intrinsics.checkNotNullParameter(appVersionStr, "appVersionStr");
        if (h.t(appVersionStr, "-", false)) {
            appVersionStr = appVersionStr.substring(0, h.J(appVersionStr, "-", 0, false, 6));
            Intrinsics.checkNotNullExpressionValue(appVersionStr, "substring(...)");
        }
        return Long.parseLong(o.a(appVersionStr));
    }
}
