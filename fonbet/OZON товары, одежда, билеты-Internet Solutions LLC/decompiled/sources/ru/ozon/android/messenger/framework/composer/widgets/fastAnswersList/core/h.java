package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core;

import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.scrollable.k<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86953b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2) {
        super(1);
        this.f86953b = aVar;
        this.f86954c = aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.scrollable.k<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d> kVar) {
        ru.ozon.composer.compose.widget.scrollable.k<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d> widgetSpec = kVar;
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(new C4912a(true, 2122536017, new g(this.f86953b, this.f86954c)));
        return Unit.f71690a;
    }
}
