package ru.ozon.app.android.geo.common;

import UZ.a;
import WZ.d;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.common.AnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LWZ/l;", "LWZ/t;", "event", "", "", "", "params", "", "processEventsSystemBack", "(LWZ/l;LWZ/t;Ljava/util/Map;)Lkotlin/Unit;", "geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AnalyticsExtensionsKt {
    public static final Unit processEventsSystemBack(@NotNull l lVar, t tVar, final Map<String, Integer> map) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (tVar == null) {
            return null;
        }
        lVar.f(tVar, new d(AnalyticsExtensionsKt$processEventsSystemBack$1$1.INSTANCE), new e() { // from class: zy.a
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g processEventsSystemBack$lambda$1$lambda$0;
                processEventsSystemBack$lambda$1$lambda$0 = AnalyticsExtensionsKt.processEventsSystemBack$lambda$1$lambda$0(map, (UZ.d) aVar, gVar);
                return processEventsSystemBack$lambda$1$lambda$0;
            }
        });
        return Unit.f71690a;
    }

    public static /* synthetic */ Unit processEventsSystemBack$default(l lVar, t tVar, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        return processEventsSystemBack(lVar, tVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g processEventsSystemBack$lambda$1$lambda$0(Map map, a aVar, g customParams) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        return g.a(customParams, map, null, 2);
    }
}
