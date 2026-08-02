package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.scrollable.k<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.analytics.i f87033b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(ru.ozon.android.messenger.framework.analytics.i iVar) {
        super(1);
        this.f87033b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.scrollable.k<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> kVar) {
        ru.ozon.composer.compose.widget.scrollable.k<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> widgetSpec = kVar;
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(new C4912a(true, -326172951, new g(this.f87033b)));
        return Unit.f71690a;
    }
}
