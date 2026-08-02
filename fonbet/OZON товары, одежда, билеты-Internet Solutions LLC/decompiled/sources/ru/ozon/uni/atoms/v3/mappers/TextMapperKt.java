package ru.ozon.uni.atoms.v3.mappers;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u001a"}, d2 = {"dsTextAtom", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDsTextAtom", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textAlignment", "Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;", "leftPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "rightPadding", "topPadding", "bottomPadding", "preset", "Lru/ozon/uni/atoms/data/text/TextPreset;", "typographyToken", "", "textColor", "maxLines", "", "truncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "tagSupported", "", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/text/TextPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;Z)Lru/ozon/uni/atoms/data/text/TextDTO;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextMapperKt {
    @NotNull
    public static final TextDTO dsTextAtom(@NotNull TextAtom textAtom, @NotNull OzonSpannableString text, TextDTO.TextAlignment textAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, TextPreset textPreset, String str, String str2, Integer num, CommonAtomLabelDTO.TruncatingMode truncatingMode, boolean z11) {
        Intrinsics.checkNotNullParameter(textAtom, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextDTO(text, textAlignment, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, textPreset, str, str2, null, textAtom.getTestInfo(), textAtom.getContext(), textAtom.getTrackingInfo(), z11, truncatingMode, null, null, null, num, 229888, null);
    }

    public static /* synthetic */ TextDTO dsTextAtom$default(TextAtom textAtom, OzonSpannableString ozonSpannableString, TextDTO.TextAlignment textAlignment, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, TextPreset textPreset, String str, String str2, Integer num, CommonAtomLabelDTO.TruncatingMode truncatingMode, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = textAtom.getText();
        }
        if ((i11 & 2) != 0) {
            textAlignment = null;
        }
        if ((i11 & 4) != 0) {
            layoutPadding = CommonCellSettings.LayoutPadding.NONE;
        }
        if ((i11 & 8) != 0) {
            layoutPadding2 = CommonCellSettings.LayoutPadding.NONE;
        }
        if ((i11 & 16) != 0) {
            layoutPadding3 = CommonCellSettings.LayoutPadding.NONE;
        }
        if ((i11 & 32) != 0) {
            layoutPadding4 = CommonCellSettings.LayoutPadding.NONE;
        }
        if ((i11 & 64) != 0) {
            textPreset = TextPreset.PRESET_CUSTOM;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str = textAtom.getTextStyle();
        }
        if ((i11 & 256) != 0) {
            str2 = textAtom.getTextColor();
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            Integer maxLines = textAtom.getMaxLines();
            num = Integer.valueOf(maxLines != null ? maxLines.intValue() : Integer.MAX_VALUE);
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        }
        if ((i11 & 2048) != 0) {
            z11 = false;
        }
        CommonAtomLabelDTO.TruncatingMode truncatingMode2 = truncatingMode;
        boolean z12 = z11;
        String str3 = str2;
        Integer num2 = num;
        TextPreset textPreset2 = textPreset;
        String str4 = str;
        return dsTextAtom(textAtom, ozonSpannableString, textAlignment, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, textPreset2, str4, str3, num2, truncatingMode2, z12);
    }

    @NotNull
    public static final TextDTO getDsTextAtom(@NotNull TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(textAtom, "<this>");
        OzonSpannableString text = textAtom.getText();
        String textColor = textAtom.getTextColor();
        Integer maxLines = textAtom.getMaxLines();
        int intValue = maxLines != null ? maxLines.intValue() : Integer.MAX_VALUE;
        return new TextDTO(text, null, null, null, null, null, TextPreset.PRESET_CUSTOM, textAtom.getTextStyle(), textColor, null, textAtom.getTestInfo(), textAtom.getContext(), textAtom.getTrackingInfo(), false, null, null, null, null, Integer.valueOf(intValue), 254526, null);
    }
}
