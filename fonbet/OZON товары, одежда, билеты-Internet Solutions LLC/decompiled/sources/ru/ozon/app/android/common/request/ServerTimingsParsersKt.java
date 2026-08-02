package ru.ozon.app.android.common.request;

import L00.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.ServerTimingsParser;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/tracker/performance/ServerTimingsParser;", "LL00/j;", "response", "", "getRequestId", "(Lru/ozon/tracker/performance/ServerTimingsParser;LL00/j;)Ljava/lang/String;", "prefetch_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ServerTimingsParsersKt {
    public static final String getRequestId(@NotNull ServerTimingsParser serverTimingsParser, @NotNull j response) {
        Intrinsics.checkNotNullParameter(serverTimingsParser, "<this>");
        Intrinsics.checkNotNullParameter(response, "response");
        for (String str : response.c().headers("server-timing")) {
            ServerTimingsParser.ServerTimeKeys serverTimeKeys = ServerTimingsParser.ServerTimeKeys.REQUEST_ID;
            serverTimingsParser.getClass();
            String a11 = ServerTimingsParser.a(str, serverTimeKeys);
            if (a11 != null) {
                return a11;
            }
        }
        return null;
    }
}
