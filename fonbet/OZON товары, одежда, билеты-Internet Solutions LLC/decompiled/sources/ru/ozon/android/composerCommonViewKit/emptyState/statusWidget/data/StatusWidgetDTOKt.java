package ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.EmptyStateV2DTO;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.EmptyStateV2ButtonsModel;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.EmptyStateV2TopPartModel;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"extractEmptyStateV2TopPartModel", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2TopPartModel;", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO;", "extractEmptyStateV2ButtonsModel", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2ButtonsModel;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StatusWidgetDTOKt {
    @NotNull
    public static final EmptyStateV2ButtonsModel extractEmptyStateV2ButtonsModel(@NotNull StatusWidgetDTO statusWidgetDTO) {
        Intrinsics.checkNotNullParameter(statusWidgetDTO, "<this>");
        List<ButtonV3DTO> newButtons = statusWidgetDTO.getNewButtons();
        StatusWidgetDTO.ButtonLayout buttonLayout = statusWidgetDTO.getButtonLayout();
        if (buttonLayout == null) {
            buttonLayout = StatusWidgetDTO.ButtonLayout.BUTTON_LAYOUT_HORIZONTAL;
        }
        boolean z11 = statusWidgetDTO.getSize() == StatusWidgetDTO.StatusWidgetSize.FULLSCREEN;
        String backgroundColor = statusWidgetDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR;
        }
        return new EmptyStateV2ButtonsModel(newButtons, buttonLayout, z11, backgroundColor);
    }

    @NotNull
    public static final EmptyStateV2TopPartModel extractEmptyStateV2TopPartModel(@NotNull StatusWidgetDTO statusWidgetDTO) {
        Intrinsics.checkNotNullParameter(statusWidgetDTO, "<this>");
        TextDTO messageAtom = statusWidgetDTO.getMessageAtom();
        TextDTO titleAtom = statusWidgetDTO.getTitleAtom();
        ImageDTO imageAtom = statusWidgetDTO.getImageAtom();
        EmptyStateV2DTO.EmptyStateSize emptyStateSize = statusWidgetDTO.getSize() == StatusWidgetDTO.StatusWidgetSize.FULLSCREEN ? EmptyStateV2DTO.EmptyStateSize.FULLSCREEN : EmptyStateV2DTO.EmptyStateSize.WRAP;
        String backgroundColor = statusWidgetDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR;
        }
        return new EmptyStateV2TopPartModel(messageAtom, titleAtom, imageAtom, 0, emptyStateSize, backgroundColor);
    }
}
