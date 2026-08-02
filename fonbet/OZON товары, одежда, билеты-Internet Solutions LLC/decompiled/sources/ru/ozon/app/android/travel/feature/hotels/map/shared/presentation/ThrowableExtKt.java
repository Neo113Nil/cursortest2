package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation;

import G.g;
import Lm0.a;
import Nk.a;
import U7.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "", "msg", "", "log", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "map_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThrowableExtKt {
    public static final void log(@NotNull Throwable th2, @NotNull String msg) {
        Throwable th3;
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (th2 instanceof ActionV2RepositoryError) {
            String b11 = a.b("TRAVEL_MAPS_", msg);
            if (th2 != null) {
                TravelActionLogger.INSTANCE.logException(th2, b11);
                th3 = th2;
            } else {
                LoggerExtKt.sendNonFatal$default(th2, null, b11, null, 10, null);
                th3 = th2;
            }
            BuildUtils buildUtils = BuildUtils.INSTANCE;
            if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                a.b bVar = Lm0.a.f17149a;
                bVar.b(b11);
                bVar.e(th3);
            }
        } else {
            th3 = th2;
            if (th3.getMessage() == null) {
                LoggerExtKt.sendNonFatal$default(th3, d.e(msg, ", throwable_message was null"), "TRAVEL_MAPS", null, 8, null);
            } else {
                LoggerExtKt.sendNonFatal$default(th3, g.c(msg, ", throwable_message = ", th3.getMessage()), "TRAVEL_MAPS", null, 8, null);
            }
        }
        BuildUtils buildUtils2 = BuildUtils.INSTANCE;
        if (buildUtils2.isQaFlavor() || buildUtils2.isDebug()) {
            a.b bVar2 = Lm0.a.f17149a;
            bVar2.b("TRAVEL_MAPS");
            bVar2.e(th3 + " " + msg, new Object[0]);
        }
    }
}
