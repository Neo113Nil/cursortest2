package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class n extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.overlay.f<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87044b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f87045c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f87046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2, ru.ozon.android.messenger.framework.navigation.controller.a aVar3) {
        super(1);
        this.f87044b = aVar;
        this.f87045c = aVar2;
        this.f87046d = aVar3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.overlay.f<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> fVar) {
        ru.ozon.composer.compose.widget.overlay.f<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> widgetSpec = fVar;
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(new C4912a(true, 1479202589, new m(this.f87044b, this.f87045c, this.f87046d)));
        return Unit.f71690a;
    }
}
