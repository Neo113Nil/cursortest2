package ru.ozon.app.android.travel.utils.compose;

import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import Z1.h;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.text.DsTextKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextPreset;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.models.UniTypographyToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0016\u001a\u00020\u0013*\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u001a\u001a\u00020\u000f*\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/atoms/data/text/TextDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "textColor", "", "CustomColorTextAtom-gKt5lHk", "(Lru/ozon/uni/atoms/data/text/TextDTO;Landroidx/compose/ui/e;Ll1/Z;LS0/k;II)V", "CustomColorTextAtom", "", "typographyToken", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topPadding", "bottomPadding", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "getCustomPreset", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;", "LV1/h;", "getAlign", "(Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;)I", "align", "Lru/ozon/uni/atoms/data/text/TextPreset;", "getTextPreset", "(Lru/ozon/uni/atoms/data/text/TextPreset;)Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "textPreset", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomColorTextAtomKt {

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

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004d  */
    /* renamed from: CustomColorTextAtom-gKt5lHk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1447CustomColorTextAtomgKt5lHk(@NotNull TextDTO dto, e eVar, C7807Z c7807z, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        C3969l c3969l;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(1143921568);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.n(c7807z) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i13 & 147) == 146 || !u11.b()) {
                if (i14 != 0) {
                    eVar2 = e.f40358c0;
                }
                int align = getAlign(dto.getTextAlignment());
                u11.o(1980350320);
                long textPrimary = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextPrimary() : c7807z.w();
                u11.k();
                Integer maxLines = dto.getMaxLines();
                int intValue = maxLines == null ? maxLines.intValue() : 1;
                DsTextPreset customPreset = dto.getPreset() != TextPreset.PRESET_CUSTOM ? getCustomPreset(dto.getTypographyToken(), dto.getTopPadding(), dto.getBottomPadding()) : getTextPreset(dto.getPreset());
                float paddingTop = customPreset.getPaddingTop();
                float paddingBottom = customPreset.getPaddingBottom();
                h parsePaddingToken = TokenParserKt.parsePaddingToken(String.valueOf(dto.getLeftPadding()));
                float d11 = parsePaddingToken == null ? parsePaddingToken.d() : UniTheme.INSTANCE.getPaddings().getNone();
                h parsePaddingToken2 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getRightPadding()));
                float d12 = parsePaddingToken2 == null ? parsePaddingToken2.d() : UniTheme.INSTANCE.getPaddings().getNone();
                String obj = dto.getText().toString();
                Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                c3969l = u11;
                DsTextKt.m1815DsTextkme9oNY(obj, eVar2, align, textPrimary, 2, intValue, customPreset.getTextStyle(), customPreset.getParagraphSpacing(), customPreset.getAllCaps(), paddingTop, d11, d12, paddingBottom, c3969l, (i13 & 112) | 24576, 0, 0);
            } else {
                u11.j();
                c3969l = u11;
            }
            e eVar3 = eVar2;
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new CustomColorTextAtomKt$CustomColorTextAtom$1(dto, eVar3, c7807z, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i13 & 147) == 146) {
        }
        if (i14 != 0) {
        }
        int align2 = getAlign(dto.getTextAlignment());
        u11.o(1980350320);
        if (c7807z != null) {
        }
        u11.k();
        Integer maxLines2 = dto.getMaxLines();
        int intValue2 = maxLines2 == null ? maxLines2.intValue() : 1;
        if (dto.getPreset() != TextPreset.PRESET_CUSTOM) {
        }
        float paddingTop2 = customPreset.getPaddingTop();
        float paddingBottom2 = customPreset.getPaddingBottom();
        h parsePaddingToken3 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getLeftPadding()));
        float d112 = parsePaddingToken3 == null ? parsePaddingToken3.d() : UniTheme.INSTANCE.getPaddings().getNone();
        h parsePaddingToken22 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getRightPadding()));
        float d122 = parsePaddingToken22 == null ? parsePaddingToken22.d() : UniTheme.INSTANCE.getPaddings().getNone();
        String obj2 = dto.getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        c3969l = u11;
        DsTextKt.m1815DsTextkme9oNY(obj2, eVar2, align2, textPrimary, 2, intValue2, customPreset.getTextStyle(), customPreset.getParagraphSpacing(), customPreset.getAllCaps(), paddingTop2, d112, d122, paddingBottom2, c3969l, (i13 & 112) | 24576, 0, 0);
        e eVar32 = eVar2;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    private static final int getAlign(TextDTO.TextAlignment textAlignment) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final DsTextPreset getCustomPreset(String str, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2) {
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

    private static final DsTextPreset getTextPreset(TextPreset textPreset) {
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
}
