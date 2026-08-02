package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core;

import j20.C7244b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.data.FastAnswerTemplateEditorDTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<C7244b, FastAnswerTemplateEditorDTO> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ JsonParser f86838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(JsonParser jsonParser) {
        super(1);
        this.f86838b = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FastAnswerTemplateEditorDTO invoke(C7244b c7244b) {
        C7244b state = c7244b;
        Intrinsics.checkNotNullParameter(state, "state");
        return (FastAnswerTemplateEditorDTO) this.f86838b.fromJson(state.b(), FastAnswerTemplateEditorDTO.class);
    }
}
