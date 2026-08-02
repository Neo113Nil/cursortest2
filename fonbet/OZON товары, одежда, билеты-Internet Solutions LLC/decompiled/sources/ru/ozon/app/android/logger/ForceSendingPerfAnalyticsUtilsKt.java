package ru.ozon.app.android.logger;

import T7.E;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"printForcedSendingAnalyticsLog", "", "count", "", "logger_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ForceSendingPerfAnalyticsUtilsKt {
    public static final void printForcedSendingAnalyticsLog(int i11) {
        BxLogger.INSTANCE.log(4, "AutoTest", E.a(i11, "RUM metrics have been sent (count=", ")"));
    }
}
