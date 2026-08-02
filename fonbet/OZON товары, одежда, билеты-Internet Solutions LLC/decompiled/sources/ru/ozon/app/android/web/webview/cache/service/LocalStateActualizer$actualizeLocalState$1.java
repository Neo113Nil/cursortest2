package ru.ozon.app.android.web.webview.cache.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u00022\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u00022\u000b\u0010\u0005\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer$ActualizingResult;", "Lkotlin/jvm/internal/EnhancedNullability;", "<unused var>", "", "loadResourcesResult", "invoke-ui7WQlw", "(Lkotlin/Unit;I)I"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LocalStateActualizer$actualizeLocalState$1 extends AbstractC7737t implements Function2<Unit, LocalStateActualizer.ActualizingResult, LocalStateActualizer.ActualizingResult> {
    public static final LocalStateActualizer$actualizeLocalState$1 INSTANCE = new LocalStateActualizer$actualizeLocalState$1();

    LocalStateActualizer$actualizeLocalState$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ LocalStateActualizer.ActualizingResult invoke(Unit unit, LocalStateActualizer.ActualizingResult actualizingResult) {
        return LocalStateActualizer.ActualizingResult.m1578boximpl(m1584invokeui7WQlw(unit, actualizingResult.getErrorCount()));
    }

    /* renamed from: invoke-ui7WQlw, reason: not valid java name */
    public final int m1584invokeui7WQlw(Unit unit, int i11) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        return i11;
    }
}
