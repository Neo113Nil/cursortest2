package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.data.ReportAbuseFormDTO;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* loaded from: classes10.dex */
public final class a {
    @NotNull
    public static ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o a(@NotNull ReportAbuseFormDTO dto, @NotNull l20.d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<CellDTO> elementsCell = dto.getElementsCell();
        ReportAbuseFormDTO.TextArea textArea = dto.getTextArea();
        o.a aVar = textArea != null ? new o.a(textArea.getPlaceholder(), textArea.getNotEmptyCaption(), textArea.getMaxLength()) : null;
        ButtonV3DTO complainButton = dto.getComplainButton();
        String backgroundColor = dto.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR;
        }
        return new ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o(hashCode, elementsCell, aVar, complainButton, backgroundColor, dto.getTrackingInfo());
    }
}
