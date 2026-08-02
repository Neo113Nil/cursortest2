package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.core;

import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.overlay.f<ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87001b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(ru.ozon.android.messenger.framework.composer.navigation.router.a aVar) {
        super(1);
        this.f87001b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.overlay.f<ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e> fVar) {
        ru.ozon.composer.compose.widget.overlay.f<ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e> widgetSpec = fVar;
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(new C4912a(true, 541720705, new f(this.f87001b)));
        return Unit.f71690a;
    }
}
