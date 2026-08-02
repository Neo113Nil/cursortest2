package ru.ozon.app.android.orders.cml.parcelTimeline.core;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: ru.ozon.app.android.orders.cml.parcelTimeline.core.ComposableSingletons$ParcelTimelineComposeWidgetCoreKt$lambda-1$1$1$1, reason: invalid class name */
/* loaded from: classes13.dex */
/* synthetic */ class ComposableSingletons$ParcelTimelineComposeWidgetCoreKt$lambda1$1$1$1 extends C7735q implements Function1<a.J.InterfaceC0007a, Unit> {
    ComposableSingletons$ParcelTimelineComposeWidgetCoreKt$lambda1$1$1$1(Object obj) {
        super(1, obj, InterfaceC7851b.class, "update", "update(Lru/ozon/composer/event/ComposerEvent$Update$UpdateKey;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a.J.InterfaceC0007a interfaceC0007a) {
        invoke2(interfaceC0007a);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a.J.InterfaceC0007a p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((InterfaceC7851b) this.receiver).update(p02);
    }
}
