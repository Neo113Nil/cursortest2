package ru.ozon.app.android.travel.molecules.extensions;

import WZ.d;
import WZ.e;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "modifier", "", "processEventsWithFilterNonView", "(LWZ/l;LWZ/t;LWZ/e;)V", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TokenizedAnalyticsExtensionsKt {
    public static final void processEventsWithFilterNonView(@NotNull l lVar, @NotNull t event, e eVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        lVar.f(event, new d(TokenizedAnalyticsExtensionsKt$processEventsWithFilterNonView$1.INSTANCE), eVar);
    }

    public static /* synthetic */ void processEventsWithFilterNonView$default(l lVar, t tVar, e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        processEventsWithFilterNonView(lVar, tVar, eVar);
    }
}
