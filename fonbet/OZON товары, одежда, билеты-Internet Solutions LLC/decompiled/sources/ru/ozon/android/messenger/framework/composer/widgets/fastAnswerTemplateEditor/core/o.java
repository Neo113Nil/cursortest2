package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.data.FastAnswerTemplateEditorDTO;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.t;
import ru.ozon.composer.compose.widget.overlay.d;

/* loaded from: classes10.dex */
final class o extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.overlay.e<FastAnswerTemplateEditorDTO, t>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f86854b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86855c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(q qVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2) {
        super(1);
        this.f86854b = qVar;
        this.f86855c = aVar;
        this.f86856d = aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.overlay.e<FastAnswerTemplateEditorDTO, t> eVar) {
        ru.ozon.composer.compose.widget.overlay.e<FastAnswerTemplateEditorDTO, t> overlayViewMapper = eVar;
        Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
        overlayViewMapper.k(i.f86844b, new j(this.f86854b));
        overlayViewMapper.s(d.a.f94674b, new n(this.f86855c, this.f86856d));
        return Unit.f71690a;
    }
}
