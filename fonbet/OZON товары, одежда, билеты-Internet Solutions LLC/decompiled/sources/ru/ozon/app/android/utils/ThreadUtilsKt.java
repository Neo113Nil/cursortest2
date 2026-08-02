package ru.ozon.app.android.utils;

import android.os.Looper;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"isCurrentThreadMain", "", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThreadUtilsKt {
    public static final boolean isCurrentThreadMain() {
        return Looper.getMainLooper().isCurrentThread();
    }
}
