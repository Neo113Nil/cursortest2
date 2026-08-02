package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.data;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.messenger.utils.c;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final IconButtonV3DTO f87007a = new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_500, ButtonV3DTO.StyleTypes.CUSTOM, null, "ic_m_disclosure_back_filled", null, "graphicTertiary", "clearLightKey0", new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, 14, null), null, null, 6, null), null, null, null, null, null, null, 16148, null);

    @NotNull
    public static final MessengerNavBarDTO a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(c.d(R$string.messenger_fast_answers, context));
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.NONE;
        return new MessengerNavBarDTO(f87007a, null, new TextDTO(ozonSpannableString, TextDTO.TextAlignment.CENTER, layoutPadding, layoutPadding, null, null, textPreset, "compact-control-500-medium", "textPrimary", 1, null, null, null, false, null, null, null, null, null, 523312, null), null, StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR, CornerRadius.RADIUS_600);
    }

    @NotNull
    public static final MessengerNavBarDTO b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(c.d(R$string.messenger_fast_answer_template, context));
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.NONE;
        return new MessengerNavBarDTO(f87007a, null, new TextDTO(ozonSpannableString, TextDTO.TextAlignment.CENTER, layoutPadding, layoutPadding, null, null, textPreset, "compact-control-500-medium", "textPrimary", 1, null, null, null, false, null, null, null, null, null, 523312, null), null, StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR, CornerRadius.RADIUS_600);
    }
}
