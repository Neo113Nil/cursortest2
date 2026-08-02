package ru.ozon.app.android.analytics.modules.tokenized;

import Sc.InterfaceC3999a;
import WZ.a;
import WZ.b;
import WZ.c;
import WZ.e;
import WZ.j;
import WZ.l;
import WZ.t;
import WZ.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u001a3\u0010\t\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000b\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u000b\u0010\n\u001a5\u0010\f\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0007¢\u0006\u0004\b\f\u0010\n\u001a3\u0010\r\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\r\u0010\n\u001a3\u0010\u000e\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u000e\u0010\n\u001a3\u0010\u000f\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "modifier", "", "processViewEvents", "(LWZ/l;LWZ/t;LWZ/e;)V", "processIgnoreViewPoolViewEvents", "processNonViewEvents", "processClickEvents", "processComposerEvents", "processAnyEvents", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TokenizedAnalyticsExtensionsKt {
    public static final void processAnyEvents(@NotNull l lVar, @NotNull t event, e eVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        lVar.f(event, a.f33353a, eVar);
    }

    public static /* synthetic */ void processAnyEvents$default(l lVar, t tVar, e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        processAnyEvents(lVar, tVar, eVar);
    }

    public static final void processClickEvents(@NotNull l lVar, @NotNull t event, e eVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        lVar.f(event, b.f33354a, eVar);
    }

    public static /* synthetic */ void processClickEvents$default(l lVar, t tVar, e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        processClickEvents(lVar, tVar, eVar);
    }

    public static final void processComposerEvents(@NotNull l lVar, @NotNull t event, e eVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        lVar.f(event, c.f33355a, eVar);
    }

    public static /* synthetic */ void processComposerEvents$default(l lVar, t tVar, e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        processComposerEvents(lVar, tVar, eVar);
    }

    public static final void processIgnoreViewPoolViewEvents(@NotNull l lVar, @NotNull t event, e eVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        lVar.f(event, j.f33360a, eVar);
    }

    public static /* synthetic */ void processIgnoreViewPoolViewEvents$default(l lVar, t tVar, e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        processIgnoreViewPoolViewEvents(lVar, tVar, eVar);
    }

    @InterfaceC3999a
    public static final void processNonViewEvents(@NotNull l lVar, @NotNull t event, e eVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        lVar.f(event, NonViewFilter.INSTANCE, eVar);
    }

    public static /* synthetic */ void processNonViewEvents$default(l lVar, t tVar, e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        processNonViewEvents(lVar, tVar, eVar);
    }

    public static final void processViewEvents(@NotNull l lVar, @NotNull t event, e eVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        lVar.f(event, y.f33404a, eVar);
    }

    public static /* synthetic */ void processViewEvents$default(l lVar, t tVar, e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        processViewEvents(lVar, tVar, eVar);
    }
}
