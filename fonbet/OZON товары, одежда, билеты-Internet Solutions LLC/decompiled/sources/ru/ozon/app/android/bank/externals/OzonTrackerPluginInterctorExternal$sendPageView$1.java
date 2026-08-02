package ru.ozon.app.android.bank.externals;

import Rg.a;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.extensions.AnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LRg/a;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsScreen;", "screen", "Lei0/b;", "tracker", "", "invoke", "(LRg/a;Lei0/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class OzonTrackerPluginInterctorExternal$sendPageView$1 extends AbstractC7737t implements Function2<a, InterfaceC6369b, Unit> {
    public static final OzonTrackerPluginInterctorExternal$sendPageView$1 INSTANCE = new OzonTrackerPluginInterctorExternal$sendPageView$1();

    OzonTrackerPluginInterctorExternal$sendPageView$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(a aVar, InterfaceC6369b interfaceC6369b) {
        invoke2(aVar, interfaceC6369b);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a screen, InterfaceC6369b tracker) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        tracker.sendPageView(AnalyticsExtensionsKt.toPage(screen));
    }
}
