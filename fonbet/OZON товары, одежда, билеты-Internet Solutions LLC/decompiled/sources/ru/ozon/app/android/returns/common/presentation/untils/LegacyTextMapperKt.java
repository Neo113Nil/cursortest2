package ru.ozon.app.android.returns.common.presentation.untils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toTextDTO", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "details_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LegacyTextMapperKt {
    @NotNull
    public static final TextDTO toTextDTO(@NotNull TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(textAtom, "<this>");
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        OzonSpannableString text = textAtom.getText();
        String textStyle = textAtom.getTextStyle();
        String textColor = textAtom.getTextColor();
        Integer maxLines = textAtom.getMaxLines();
        return new TextDTO(text, null, null, null, null, null, textPreset, textStyle, textColor, null, textAtom.getTestInfo(), textAtom.getContext(), textAtom.getTrackingInfo(), false, null, null, null, null, Integer.valueOf(maxLines != null ? maxLines.intValue() : Integer.MAX_VALUE), 254526, null);
    }
}
