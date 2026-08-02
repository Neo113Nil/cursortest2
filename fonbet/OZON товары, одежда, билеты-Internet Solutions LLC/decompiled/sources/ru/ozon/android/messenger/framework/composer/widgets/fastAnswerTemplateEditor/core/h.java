package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.data.FastAnswerTemplateEditorDTO;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.t;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.scrollable.j<FastAnswerTemplateEditorDTO, t>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f86843b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(q qVar) {
        super(1);
        this.f86843b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.scrollable.j<FastAnswerTemplateEditorDTO, t> jVar) {
        ru.ozon.composer.compose.widget.scrollable.j<FastAnswerTemplateEditorDTO, t> viewMapper = jVar;
        Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
        viewMapper.k(e.f86840b, new f(this.f86843b));
        viewMapper.G(g.f86842b);
        return Unit.f71690a;
    }
}
