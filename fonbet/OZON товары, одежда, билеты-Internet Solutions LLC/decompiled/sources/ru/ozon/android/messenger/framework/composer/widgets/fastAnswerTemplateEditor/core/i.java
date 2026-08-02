package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.data.FastAnswerTemplateEditorDTO;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function1<Object, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final i f86844b = new i(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof FastAnswerTemplateEditorDTO);
    }
}
