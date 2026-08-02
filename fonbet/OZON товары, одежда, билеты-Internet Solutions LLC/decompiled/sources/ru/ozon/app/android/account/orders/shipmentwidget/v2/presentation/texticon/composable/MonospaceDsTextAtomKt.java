package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.composable;

import I1.o;
import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.h;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import e3.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.ds.compose.component.text.DsTextKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextPreset;
import ru.ozon.uni.android.ds.compose.html.SpannedAnnotateConvertorKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.models.UniTypographyToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0017\u001a\u00020\u0014*\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001b\u001a\u00020\f*\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/atoms/data/text/TextDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "MonospaceDsTextAtom", "(Lru/ozon/uni/atoms/data/text/TextDTO;Landroidx/compose/ui/e;LS0/k;II)V", "", "typographyToken", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topPadding", "bottomPadding", "Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "getCustomPreset", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getViewAnalyticsInfo", "(Ljava/util/Map;)Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;", "LV1/h;", "getAlign", "(Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;)I", "align", "Lru/ozon/uni/atoms/data/text/TextPreset;", "getTextPreset", "(Lru/ozon/uni/atoms/data/text/TextPreset;)Lru/ozon/uni/android/ds/compose/component/text/DsTextPreset;", "textPreset", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MonospaceDsTextAtomKt {

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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MonospaceDsTextAtom(@NotNull TextDTO dto, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        e eVar3;
        boolean n11;
        Object C11;
        boolean F11;
        Object C12;
        Object C13;
        TestInfo testInfo;
        C3969l c3969l;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-302336267);
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
            if ((i13 & 19) == 18 || !u11.b()) {
                eVar3 = i14 == 0 ? e.f40358c0 : eVar2;
                Function1 function1 = (Function1) u11.m(AnalyticsModifierKt.getLocalDSViewAnalyticsProvider());
                int align = getAlign(dto.getTextAlignment());
                C7807Z c7807z = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
                u11.o(-202029117);
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
                Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
                u11.o(-202006770);
                n11 = u11.n(trackingInfo);
                C11 = u11.C();
                if (!n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = getViewAnalyticsInfo(dto.getTrackingInfo());
                    u11.x(C11);
                }
                TokenizedTrackingInfo tokenizedTrackingInfo = (TokenizedTrackingInfo) C11;
                u11.k();
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-202002800);
                F11 = u11.F(tokenizedTrackingInfo) | u11.n(function1);
                C12 = u11.C();
                if (!F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new MonospaceDsTextAtomKt$MonospaceDsTextAtom$1$1(tokenizedTrackingInfo, function1);
                    u11.x(C12);
                }
                u11.k();
                i.a(aVar, null, (Function0) C12, u11, 6);
                u11.o(-201998841);
                C13 = u11.C();
                if (C13 == InterfaceC3967k.a.a()) {
                    C13 = MonospaceDsTextAtomKt$MonospaceDsTextAtom$textModifier$1$1.INSTANCE;
                    u11.x(C13);
                }
                u11.k();
                e c11 = o.c(eVar3, false, (Function1) C13);
                testInfo = dto.getTestInfo();
                if (testInfo != null || (r5 = testInfo.getAutomatizationId()) == null) {
                    String str = "text";
                }
                e a11 = Q1.a(c11, str);
                if (dto.getTagSupported()) {
                    u11.o(-1966188727);
                    String obj = dto.getText().toString();
                    Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                    c3969l = u11;
                    DsTextKt.m1815DsTextkme9oNY(obj, a11, align, textPrimary, 2, intValue, T.c(customPreset.getTextStyle(), 0L, 0L, null, null, "tnum", 0L, null, null, 0L, null, null, 16777151), customPreset.getParagraphSpacing(), customPreset.getAllCaps(), paddingTop, d11, d12, paddingBottom, c3969l, 24576, 0, 0);
                    c3969l.k();
                } else {
                    u11.o(-1966854111);
                    c3969l = u11;
                    DsTextKt.m1814DsTextkme9oNY(SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(dto.getText(), 0L, u11, OzonSpannableString.$stable, 1), a11, align, textPrimary, 2, intValue, T.c(customPreset.getTextStyle(), 0L, 0L, null, null, "tnum", 0L, null, null, 0L, null, null, 16777151), customPreset.getParagraphSpacing(), customPreset.getAllCaps(), paddingTop, d11, d12, paddingBottom, c3969l, 24576, 0, 0);
                    c3969l.k();
                }
            } else {
                u11.j();
                eVar3 = eVar2;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new MonospaceDsTextAtomKt$MonospaceDsTextAtom$2(dto, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 19) == 18) {
        }
        if (i14 == 0) {
        }
        Function1 function12 = (Function1) u11.m(AnalyticsModifierKt.getLocalDSViewAnalyticsProvider());
        int align2 = getAlign(dto.getTextAlignment());
        C7807Z c7807z2 = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
        u11.o(-202029117);
        long textPrimary2 = c7807z2 != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextPrimary() : c7807z2.w();
        u11.k();
        Integer maxLines2 = dto.getMaxLines();
        int intValue2 = maxLines2 == null ? maxLines2.intValue() : 1;
        DsTextPreset customPreset2 = dto.getPreset() != TextPreset.PRESET_CUSTOM ? getCustomPreset(dto.getTypographyToken(), dto.getTopPadding(), dto.getBottomPadding()) : getTextPreset(dto.getPreset());
        float paddingTop2 = customPreset2.getPaddingTop();
        float paddingBottom2 = customPreset2.getPaddingBottom();
        h parsePaddingToken3 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getLeftPadding()));
        float d112 = parsePaddingToken3 == null ? parsePaddingToken3.d() : UniTheme.INSTANCE.getPaddings().getNone();
        h parsePaddingToken22 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getRightPadding()));
        float d122 = parsePaddingToken22 == null ? parsePaddingToken22.d() : UniTheme.INSTANCE.getPaddings().getNone();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = dto.getTrackingInfo();
        u11.o(-202006770);
        n11 = u11.n(trackingInfo2);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = getViewAnalyticsInfo(dto.getTrackingInfo());
        u11.x(C11);
        TokenizedTrackingInfo tokenizedTrackingInfo2 = (TokenizedTrackingInfo) C11;
        u11.k();
        AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_RESUME;
        u11.o(-202002800);
        F11 = u11.F(tokenizedTrackingInfo2) | u11.n(function12);
        C12 = u11.C();
        if (!F11) {
        }
        C12 = new MonospaceDsTextAtomKt$MonospaceDsTextAtom$1$1(tokenizedTrackingInfo2, function12);
        u11.x(C12);
        u11.k();
        i.a(aVar2, null, (Function0) C12, u11, 6);
        u11.o(-201998841);
        C13 = u11.C();
        if (C13 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        e c112 = o.c(eVar3, false, (Function1) C13);
        testInfo = dto.getTestInfo();
        if (testInfo != null) {
        }
        String str2 = "text";
        e a112 = Q1.a(c112, str2);
        if (dto.getTagSupported()) {
        }
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
        throw new Sc.o();
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
                throw new Sc.o();
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

    private static final TokenizedTrackingInfo getViewAnalyticsInfo(Map<String, TokenizedTrackingInfo> map) {
        if (map != null) {
            return map.get("view");
        }
        return null;
    }
}
