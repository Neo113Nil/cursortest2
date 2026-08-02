package ru.ozon.android.messenger.blocks.messagetext;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class a {
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.internal.DefaultConstructorMarker, ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO$FitType] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @NotNull
    public static final ru.ozon.android.messenger.blocks.order.b a(@NotNull CustomBlockDTO customBlockDTO, @NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId) {
        ?? r42;
        ProductMediaDTO productMediaDTO;
        Intrinsics.checkNotNullParameter(customBlockDTO, "<this>");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        OzonSpannableString text = customBlockDTO.getTitle().getText();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.NONE;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        TextDTO textDTO = null;
        TextDTO textDTO2 = new TextDTO(text, null, null, null, layoutPadding, layoutPadding, textPreset, "tsCompactControl500Medium", "textPrimary", null, null, null, null, false, null, null, null, null, 2, 261646, null);
        TextDTO subtitle = customBlockDTO.getSubtitle();
        if (subtitle != null) {
            OzonSpannableString text2 = subtitle.getText();
            r42 = 0;
            textDTO = new TextDTO(text2, null, null, null, layoutPadding, layoutPadding, textPreset, "tsCompact400Small", "textSecondary", null, null, null, null, false, null, null, null, null, 2, 261646, null);
        } else {
            r42 = 0;
        }
        IconDTO image = customBlockDTO.getImage();
        if (image != null) {
            ProductMediaDTO.Ratio ratio = ProductMediaDTO.Ratio.RATIO_1_1;
            String backgroundImage = image.getBackgroundImage();
            if (backgroundImage == null) {
                backgroundImage = "";
            }
            productMediaDTO = new ProductMediaDTO(null, new ProductMediaDTO.Image(backgroundImage, r42, 2, r42), ProductMediaDTO.Width.WIDTH_700, ratio, null, "bgSecondary", null, Boolean.TRUE, null, null, null, null, null, null, null, null, 65361, null);
        } else {
            productMediaDTO = r42;
        }
        return new ru.ozon.android.messenger.blocks.order.b(blockId, textDTO2, textDTO, null, null, ru.ozon.android.messenger.utils.view.f.a(customBlockDTO.getLabeledIcon()), productMediaDTO);
    }
}
