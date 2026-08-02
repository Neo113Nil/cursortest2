package ru.ozon.uni.android.ds.compose.component.text;

import K1.T;
import Sc.o;
import Z1.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.text.DsTextPreset;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.models.UniTypographyToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\u0011\u001a\u00020\u000e*\u0004\u0018\u00010\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0015\u001a\u00020\u0005*\u0004\u0018\u00010\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"", "typographyToken", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topPadding", "bottomPadding", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "getCustomPreset", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;", "LV1/h;", "getAlign", "(Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;)I", "align", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "LV1/r;", "getTruncateMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)I", "truncateMode", "Lru/ozon/uni/atoms/data/text/TextPreset;", "getTextPreset", "(Lru/ozon/uni/atoms/data/text/TextPreset;)Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "textPreset", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTextAtomMappersKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextDTO.TextAlignment.values().length];
            try {
                iArr[TextDTO.TextAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextDTO.TextAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextDTO.TextAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TextPreset.values().length];
            try {
                iArr2[TextPreset.f97930H1.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TextPreset.f97931H2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TextPreset.f97932H3.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TextPreset.f97933H4.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TextPreset.PARAGRAPH.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TextPreset.PARAGRAPH_COMPACT.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[TextPreset.UI_H2.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[TextPreset.UI_H2_COMPACT.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[TextPreset.UI_H1.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[TextPreset.PRESET_CUSTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getAlign(TextDTO.TextAlignment textAlignment) {
        int i11 = textAlignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[textAlignment.ordinal()];
        if (i11 == -1 || i11 == 1) {
            return 5;
        }
        if (i11 == 2) {
            return 3;
        }
        if (i11 == 3) {
            return 6;
        }
        throw new o();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final DsTextPreset getCustomPreset(String str, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2) {
        T body500Medium;
        boolean z11;
        if (str == null || (body500Medium = TokenParserKt.tokenToTextStyle(str)) == null) {
            body500Medium = UniTheme.INSTANCE.getTypography().getBody500Medium();
        }
        T t2 = body500Medium;
        if (str != null) {
            UniTypographyToken byId = UniTheme.INSTANCE.getTypographyTokens().getById(str);
            Boolean valueOf = byId != null ? Boolean.valueOf(byId.getIsAllCaps()) : null;
            if (valueOf != null) {
                z11 = valueOf.booleanValue();
                boolean z12 = z11;
                h hVar = TokenParserKt.tokenToPadding(String.valueOf(layoutPadding));
                h hVar2 = TokenParserKt.tokenToPadding(String.valueOf(layoutPadding2));
                return new DsTextPreset.Custom(t2, 0L, hVar == null ? hVar.d() : UniTheme.INSTANCE.getPaddings().getNone(), hVar2 == null ? hVar2.d() : UniTheme.INSTANCE.getPaddings().getNone(), z12, 2, null);
            }
        }
        z11 = false;
        boolean z122 = z11;
        h hVar3 = TokenParserKt.tokenToPadding(String.valueOf(layoutPadding));
        h hVar22 = TokenParserKt.tokenToPadding(String.valueOf(layoutPadding2));
        return new DsTextPreset.Custom(t2, 0L, hVar3 == null ? hVar3.d() : UniTheme.INSTANCE.getPaddings().getNone(), hVar22 == null ? hVar22.d() : UniTheme.INSTANCE.getPaddings().getNone(), z122, 2, null);
    }

    @NotNull
    public static final DsTextPreset getTextPreset(TextPreset textPreset) {
        switch (textPreset == null ? -1 : WhenMappings.$EnumSwitchMapping$1[textPreset.ordinal()]) {
            case -1:
            case 5:
                return DsTextPreset.Paragraph.INSTANCE;
            case 0:
            default:
                throw new o();
            case 1:
                return DsTextPreset.H1.INSTANCE;
            case 2:
                return DsTextPreset.H2.INSTANCE;
            case 3:
                return DsTextPreset.H3.INSTANCE;
            case 4:
                return DsTextPreset.H4.INSTANCE;
            case 6:
                return DsTextPreset.ParagraphCompact.INSTANCE;
            case 7:
                return DsTextPreset.UiH2.INSTANCE;
            case 8:
                return DsTextPreset.UiH2Compact.INSTANCE;
            case 9:
                return DsTextPreset.UiH1.INSTANCE;
            case 10:
                return new DsTextPreset.Custom(null, 0L, 0.0f, 0.0f, false, 31, null);
        }
    }

    public static final int getTruncateMode(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        return 2;
    }
}
