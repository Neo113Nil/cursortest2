package ru.ozon.app.android.actionHandlers.monetization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"refreshPageFragmentRequestKey", "", "path", "action-handlers_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RefreshPageByFragmentResultKt {
    @NotNull
    public static final String refreshPageFragmentRequestKey(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return "REFRESH_PAGE_REQUEST:" + path;
    }
}
