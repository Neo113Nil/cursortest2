package ru.ozon.id.common.disclaimer;

import Jb0.y;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.common.disclaimer.DisclaimerDTO;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.cell.iconCell.IconTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.UncontainedButtonHolderKt;
import ru.ozon.uni.core.UniColors;

/* loaded from: classes3.dex */
public final class a {
    public static final void a(@NotNull y yVar, DisclaimerDTO disclaimerDTO, @NotNull Function1<? super DisclaimerDTO.DisclaimerButtonDTO, Unit> onButtonClick) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        LinearLayout linearLayout = yVar.f14574d;
        int i11 = 8;
        if (disclaimerDTO != null) {
            IconTitleSubtitleCellView disclaimerBodyView = yVar.f14572b;
            Intrinsics.checkNotNullExpressionValue(disclaimerBodyView, "disclaimerBodyView");
            DisclaimerDTO.DisclaimerBodyDTO body = disclaimerDTO.getBody();
            IconTitleSubtitleCellDTO.IconTitleSubtitleCellPreset iconTitleSubtitleCellPreset = IconTitleSubtitleCellDTO.IconTitleSubtitleCellPreset.NO_SHAPE_500_TOP_START_500_DEFAULT_500;
            CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
            IconTitleSubtitleCellHolderKt.bind$default(disclaimerBodyView, new IconTitleSubtitleCellDTO(iconTitleSubtitleCellPreset, new CommonCellSettings(layoutPadding, layoutPadding, null, null, null, null, null, 12, null), new CommonAtomLabelDTO(body.getText(), UniColors.TEXT_SECONDARY.getToken(), null, null, null, null, null, false, null, 508, null), null, new IconDTO(null, Boolean.FALSE, null, null, new CommonAtomIconDTO("ic_m_info_filled", UniColors.GRAPHIC_TERTIARY.getToken()), null, null, null, null, null, null, null, null, null, null, null, 65517, null)), null, 2, null);
            List<DisclaimerDTO.DisclaimerButtonDTO> buttons = disclaimerDTO.getButtons();
            DisclaimerDTO.DisclaimerButtonDTO disclaimerButtonDTO = buttons != null ? (DisclaimerDTO.DisclaimerButtonDTO) C7714v.M(buttons) : null;
            UncontainedButtonView disclaimerButton = yVar.f14573c;
            Intrinsics.checkNotNullExpressionValue(disclaimerButton, "disclaimerButton");
            if (disclaimerButtonDTO != null) {
                UncontainedButtonHolderKt.bind$default(disclaimerButton, new UncontainedButtonDTO(UncontainedButtonDTO.Preset.SIZE_400, Style.ACTION_SECONDARY, null, new CommonAtomLabelDTO(OzonSpannableStringKt.toOzonSpannableString(disclaimerButtonDTO.getText()), null, null, null, null, null, null, false, null, 510, null), null, null, 4, null), null, 2, null);
                disclaimerButton.setOnClickListener(new Eb0.a(onButtonClick, disclaimerButtonDTO));
                i11 = 0;
            }
            disclaimerButton.setVisibility(i11);
            i11 = 0;
        }
        linearLayout.setVisibility(i11);
    }
}
