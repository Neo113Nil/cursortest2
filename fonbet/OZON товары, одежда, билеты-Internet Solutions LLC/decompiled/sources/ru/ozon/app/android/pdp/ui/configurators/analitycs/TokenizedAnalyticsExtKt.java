package ru.ozon.app.android.pdp.ui.configurators.analitycs;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"LWZ/l;", "LWZ/t;", "event", "", "processClickEvents", "(LWZ/l;LWZ/t;)Lkotlin/Unit;", "processViewEvents", "processNonViewEvents", "configurators_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TokenizedAnalyticsExtKt {
    public static final Unit processClickEvents(@NotNull l lVar, t tVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (tVar == null) {
            return null;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tVar, null, 2, null);
        return Unit.f71690a;
    }

    public static final Unit processNonViewEvents(@NotNull l lVar, t tVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (tVar == null) {
            return null;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(lVar, tVar, null, 2, null);
        return Unit.f71690a;
    }

    public static final Unit processViewEvents(@NotNull l lVar, t tVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (tVar == null) {
            return null;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tVar, null, 2, null);
        return Unit.f71690a;
    }
}
