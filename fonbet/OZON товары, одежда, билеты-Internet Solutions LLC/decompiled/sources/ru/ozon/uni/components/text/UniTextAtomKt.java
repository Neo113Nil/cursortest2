package ru.ozon.uni.components.text;

import K1.C3422b;
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
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomMappersKt;
import ru.ozon.uni.android.ds.compose.html.SpannedAnnotateConvertorKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.components.text.UniTextPreset;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.models.UniTypographyToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.UniTestInfoTestTagKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0014\u001a\u00020\u000e*\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/atoms/data/text/TextDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/components/text/UniTextResizing;", "resizing", "", "UniTextAtom", "(Lru/ozon/uni/atoms/data/text/TextDTO;Landroidx/compose/ui/e;Lru/ozon/uni/components/text/UniTextResizing;LS0/k;II)V", "", "typographyToken", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topPadding", "bottomPadding", "Lru/ozon/uni/components/text/UniTextPreset;", "getCustomPreset", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Lru/ozon/uni/components/text/UniTextPreset;", "Lru/ozon/uni/atoms/data/text/TextPreset;", "getTextPreset", "(Lru/ozon/uni/atoms/data/text/TextPreset;)Lru/ozon/uni/components/text/UniTextPreset;", "textPreset", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniTextAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextPreset.values().length];
            try {
                iArr[TextPreset.f97930H1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextPreset.f97931H2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextPreset.f97932H3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextPreset.f97933H4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextPreset.PARAGRAPH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TextPreset.PARAGRAPH_COMPACT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TextPreset.UI_H2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TextPreset.UI_H2_COMPACT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TextPreset.UI_H1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TextPreset.PRESET_CUSTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniTextAtom(@NotNull TextDTO dto, e eVar, UniTextResizing uniTextResizing, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        UniTextResizing uniTextResizing2;
        e eVar3;
        AbstractC7799Q k02;
        TestInfo testInfo;
        C3969l c3969l;
        UniTextResizing uniTextResizing3;
        UniTextResizing uniTextResizing4;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(1621499323);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                uniTextResizing2 = uniTextResizing;
                i13 |= u11.n(uniTextResizing2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    eVar3 = i15 != 0 ? e.f40358c0 : eVar2;
                    UniTextResizing uniTextResizing5 = i14 != 0 ? UniTextResizing.Fill : uniTextResizing2;
                    e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
                    int align = DsTextAtomMappersKt.getAlign(dto.getTextAlignment());
                    C7807Z c7807z = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
                    k02 = c7807z != null ? new K0(c7807z.w()) : null;
                    u11.o(-1269126195);
                    if (k02 == null) {
                        k02 = TokenParserKt.tokenToGradient(dto.getTextColor(), u11, 0);
                    }
                    u11.k();
                    u11.o(-1269126144);
                    if (k02 == null) {
                        k02 = new K0(UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextPrimary());
                    }
                    AbstractC7799Q abstractC7799Q = k02;
                    u11.k();
                    int truncateMode = DsTextAtomMappersKt.getTruncateMode(dto.getTruncatingMode());
                    Integer maxLines = dto.getMaxLines();
                    int intValue = maxLines != null ? maxLines.intValue() : 1;
                    UniTextPreset customPreset = dto.getPreset() == TextPreset.PRESET_CUSTOM ? getCustomPreset(dto.getTypographyToken(), dto.getTopPadding(), dto.getBottomPadding()) : getTextPreset(dto.getPreset());
                    h parsePaddingToken = TokenParserKt.parsePaddingToken(String.valueOf(dto.getLeftPadding()));
                    float d11 = parsePaddingToken != null ? parsePaddingToken.d() : UniTheme.INSTANCE.getPaddings().getNone();
                    h parsePaddingToken2 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getRightPadding()));
                    float d12 = parsePaddingToken2 != null ? parsePaddingToken2.d() : UniTheme.INSTANCE.getPaddings().getNone();
                    u11.o(-1269103524);
                    testInfo = dto.getTestInfo();
                    if (testInfo != null) {
                        viewAnalytics = UniTestInfoTestTagKt.uniTestTag(viewAnalytics, testInfo, u11, 0);
                    }
                    e eVar4 = viewAnalytics;
                    u11.k();
                    if (dto.getTagSupported()) {
                        u11.o(-687418669);
                        c3969l = u11;
                        uniTextResizing3 = uniTextResizing5;
                        UniTextKt.m1948UniText28lkidg(SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(dto.getText(), 0L, u11, 0, 1), eVar4, customPreset, align, uniTextResizing3, d11, d12, truncateMode, abstractC7799Q, intValue, false, null, c3969l, (i13 << 6) & 57344, 0, 3072);
                        c3969l.k();
                    } else {
                        u11.o(-686998774);
                        c3969l = u11;
                        String obj = dto.getText().toString();
                        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                        uniTextResizing3 = uniTextResizing5;
                        UniTextKt.m1948UniText28lkidg(new C3422b(6, obj, null), eVar4, customPreset, align, uniTextResizing3, d11, d12, truncateMode, abstractC7799Q, intValue, false, null, c3969l, (i13 << 6) & 57344, 0, 3072);
                        c3969l.k();
                    }
                    uniTextResizing4 = uniTextResizing3;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                    uniTextResizing4 = uniTextResizing2;
                    c3969l = u11;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new UniTextAtomKt$UniTextAtom$1(dto, eVar3, uniTextResizing4, i11, i12));
                    return;
                }
                return;
            }
            uniTextResizing2 = uniTextResizing;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
            int align2 = DsTextAtomMappersKt.getAlign(dto.getTextAlignment());
            C7807Z c7807z2 = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
            if (c7807z2 != null) {
            }
            u11.o(-1269126195);
            if (k02 == null) {
            }
            u11.k();
            u11.o(-1269126144);
            if (k02 == null) {
            }
            AbstractC7799Q abstractC7799Q2 = k02;
            u11.k();
            int truncateMode2 = DsTextAtomMappersKt.getTruncateMode(dto.getTruncatingMode());
            Integer maxLines2 = dto.getMaxLines();
            int intValue2 = maxLines2 != null ? maxLines2.intValue() : 1;
            UniTextPreset customPreset2 = dto.getPreset() == TextPreset.PRESET_CUSTOM ? getCustomPreset(dto.getTypographyToken(), dto.getTopPadding(), dto.getBottomPadding()) : getTextPreset(dto.getPreset());
            h parsePaddingToken3 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getLeftPadding()));
            float d112 = parsePaddingToken3 != null ? parsePaddingToken3.d() : UniTheme.INSTANCE.getPaddings().getNone();
            h parsePaddingToken22 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getRightPadding()));
            float d122 = parsePaddingToken22 != null ? parsePaddingToken22.d() : UniTheme.INSTANCE.getPaddings().getNone();
            u11.o(-1269103524);
            testInfo = dto.getTestInfo();
            if (testInfo != null) {
            }
            e eVar42 = viewAnalytics2;
            u11.k();
            if (dto.getTagSupported()) {
            }
            uniTextResizing4 = uniTextResizing3;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        uniTextResizing2 = uniTextResizing;
        if ((i13 & 147) == 146) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
        int align22 = DsTextAtomMappersKt.getAlign(dto.getTextAlignment());
        C7807Z c7807z22 = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
        if (c7807z22 != null) {
        }
        u11.o(-1269126195);
        if (k02 == null) {
        }
        u11.k();
        u11.o(-1269126144);
        if (k02 == null) {
        }
        AbstractC7799Q abstractC7799Q22 = k02;
        u11.k();
        int truncateMode22 = DsTextAtomMappersKt.getTruncateMode(dto.getTruncatingMode());
        Integer maxLines22 = dto.getMaxLines();
        int intValue22 = maxLines22 != null ? maxLines22.intValue() : 1;
        UniTextPreset customPreset22 = dto.getPreset() == TextPreset.PRESET_CUSTOM ? getCustomPreset(dto.getTypographyToken(), dto.getTopPadding(), dto.getBottomPadding()) : getTextPreset(dto.getPreset());
        h parsePaddingToken32 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getLeftPadding()));
        float d1122 = parsePaddingToken32 != null ? parsePaddingToken32.d() : UniTheme.INSTANCE.getPaddings().getNone();
        h parsePaddingToken222 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getRightPadding()));
        float d1222 = parsePaddingToken222 != null ? parsePaddingToken222.d() : UniTheme.INSTANCE.getPaddings().getNone();
        u11.o(-1269103524);
        testInfo = dto.getTestInfo();
        if (testInfo != null) {
        }
        e eVar422 = viewAnalytics22;
        u11.k();
        if (dto.getTagSupported()) {
        }
        uniTextResizing4 = uniTextResizing3;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final UniTextPreset getCustomPreset(String str, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2) {
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
                return new UniTextPreset.Custom(t2, 0L, hVar == null ? hVar.d() : UniTheme.INSTANCE.getPaddings().getNone(), hVar2 == null ? hVar2.d() : UniTheme.INSTANCE.getPaddings().getNone(), z12, 2, null);
            }
        }
        z11 = false;
        boolean z122 = z11;
        h hVar3 = TokenParserKt.tokenToPadding(String.valueOf(layoutPadding));
        h hVar22 = TokenParserKt.tokenToPadding(String.valueOf(layoutPadding2));
        return new UniTextPreset.Custom(t2, 0L, hVar3 == null ? hVar3.d() : UniTheme.INSTANCE.getPaddings().getNone(), hVar22 == null ? hVar22.d() : UniTheme.INSTANCE.getPaddings().getNone(), z122, 2, null);
    }

    private static final UniTextPreset getTextPreset(TextPreset textPreset) {
        switch (textPreset == null ? -1 : WhenMappings.$EnumSwitchMapping$0[textPreset.ordinal()]) {
            case -1:
            case 5:
                return UniTextPreset.Paragraph.INSTANCE;
            case 0:
            default:
                throw new o();
            case 1:
                return UniTextPreset.H1.INSTANCE;
            case 2:
                return UniTextPreset.H2.INSTANCE;
            case 3:
                return UniTextPreset.H3.INSTANCE;
            case 4:
                return UniTextPreset.H4.INSTANCE;
            case 6:
                return UniTextPreset.ParagraphCompact.INSTANCE;
            case 7:
                return UniTextPreset.UiH2.INSTANCE;
            case 8:
                return UniTextPreset.UiH2Compact.INSTANCE;
            case 9:
                return UniTextPreset.UiH1.INSTANCE;
            case 10:
                return new UniTextPreset.Custom(null, 0L, 0.0f, 0.0f, false, 31, null);
        }
    }
}
