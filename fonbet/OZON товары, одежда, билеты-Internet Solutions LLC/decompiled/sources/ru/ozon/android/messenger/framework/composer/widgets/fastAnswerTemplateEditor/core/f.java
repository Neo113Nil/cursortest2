package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.data.FastAnswerTemplateEditorDTO;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.t;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<FastAnswerTemplateEditorDTO, l20.d, t> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f86841b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(q qVar) {
        super(2);
        this.f86841b = qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final t invoke(FastAnswerTemplateEditorDTO fastAnswerTemplateEditorDTO, l20.d dVar) {
        FastAnswerTemplateEditorDTO dto = fastAnswerTemplateEditorDTO;
        l20.d info = dVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.f86841b.a(dto, info);
    }
}
