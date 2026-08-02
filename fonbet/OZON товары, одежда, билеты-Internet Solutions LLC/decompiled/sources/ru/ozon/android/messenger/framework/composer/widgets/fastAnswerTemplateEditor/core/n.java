package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core;

import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.t;

/* loaded from: classes10.dex */
final class n extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.overlay.f<t>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86852b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2) {
        super(1);
        this.f86852b = aVar;
        this.f86853c = aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.overlay.f<t> fVar) {
        ru.ozon.composer.compose.widget.overlay.f<t> widgetSpec = fVar;
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(new C4912a(true, 3232417, new m(this.f86852b, this.f86853c)));
        return Unit.f71690a;
    }
}
