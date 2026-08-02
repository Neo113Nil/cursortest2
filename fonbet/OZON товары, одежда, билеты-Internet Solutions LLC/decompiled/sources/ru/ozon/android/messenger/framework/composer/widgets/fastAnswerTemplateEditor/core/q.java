package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core;

import Q1.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.data.FastAnswerTemplateEditorDTO;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.data.TextAreaDTO;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.t;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.y;

/* loaded from: classes10.dex */
public final class q {
    @NotNull
    public final t a(@NotNull FastAnswerTemplateEditorDTO dto, @NotNull l20.d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAreaDTO dto2 = dto.getFastAnswerInput();
        Intrinsics.checkNotNullParameter(dto2, "dto");
        String placeholder = dto2.getPlaceholder();
        String placeholder2 = dto2.getPlaceholder();
        String notEmptyCaption = dto2.getNotEmptyCaption();
        String text = dto2.getText();
        if (text == null) {
            text = "";
        }
        return new t(hashCode, new y(true, placeholder, placeholder2, notEmptyCaption, new K(6, 0L, text), dto2.getMaxLen(), 1), dto.getButton());
    }
}
