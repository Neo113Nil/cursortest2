package ru.ozon.uni.android.ds.compose.component.text;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.h;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.html.SpannedAnnotateConvertorKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"&\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/atoms/data/text/TextDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "DsTextAtom", "(Lru/ozon/uni/atoms/data/text/TextDTO;Landroidx/compose/ui/e;LS0/k;II)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "Lru/ozon/uni/android/ds/compose/modifier/AtomLocator;", "textLocator", "Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTextAtomKt {

    @NotNull
    private static final Function1<TestInfo, Locator> textLocator = DsTextAtomKt$textLocator$1.INSTANCE;

    /* JADX WARN: Removed duplicated region for block: B:15:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsTextAtom(@NotNull TextDTO dto, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        e eVar3;
        C3969l c3969l;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(641136774);
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
                e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
                int align = DsTextAtomMappersKt.getAlign(dto.getTextAlignment());
                C7807Z c7807z = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
                u11.o(-850815885);
                long textPrimary = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextPrimary() : c7807z.w();
                u11.k();
                int truncateMode = DsTextAtomMappersKt.getTruncateMode(dto.getTruncatingMode());
                Integer maxLines = dto.getMaxLines();
                int intValue = maxLines == null ? maxLines.intValue() : 1;
                DsTextPreset customPreset = dto.getPreset() != TextPreset.PRESET_CUSTOM ? DsTextAtomMappersKt.getCustomPreset(dto.getTypographyToken(), dto.getTopPadding(), dto.getBottomPadding()) : DsTextAtomMappersKt.getTextPreset(dto.getPreset());
                float paddingTop = customPreset.getPaddingTop();
                float paddingBottom = customPreset.getPaddingBottom();
                h parsePaddingToken = TokenParserKt.parsePaddingToken(String.valueOf(dto.getLeftPadding()));
                float d11 = parsePaddingToken == null ? parsePaddingToken.d() : UniTheme.INSTANCE.getPaddings().getNone();
                h parsePaddingToken2 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getRightPadding()));
                float d12 = parsePaddingToken2 == null ? parsePaddingToken2.d() : UniTheme.INSTANCE.getPaddings().getNone();
                e testTag = AtomLocatorKt.testTag(viewAnalytics, textLocator.invoke(dto.getTestInfo()));
                if (dto.getTagSupported()) {
                    u11.o(-604126796);
                    String obj = dto.getText().toString();
                    Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                    c3969l = u11;
                    DsTextKt.m1815DsTextkme9oNY(obj, testTag, align, textPrimary, truncateMode, intValue, customPreset.getTextStyle(), customPreset.getParagraphSpacing(), customPreset.getAllCaps(), paddingTop, d11, d12, paddingBottom, c3969l, 0, 0, 0);
                    c3969l.k();
                } else {
                    u11.o(-604701908);
                    c3969l = u11;
                    DsTextKt.m1814DsTextkme9oNY(SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(dto.getText(), 0L, u11, 0, 1), testTag, align, textPrimary, truncateMode, intValue, customPreset.getTextStyle(), customPreset.getParagraphSpacing(), customPreset.getAllCaps(), paddingTop, d11, d12, paddingBottom, c3969l, 0, 0, 0);
                    c3969l.k();
                }
            } else {
                u11.j();
                eVar3 = eVar2;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new DsTextAtomKt$DsTextAtom$1(dto, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 19) == 18) {
        }
        if (i14 == 0) {
        }
        e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
        int align2 = DsTextAtomMappersKt.getAlign(dto.getTextAlignment());
        C7807Z c7807z2 = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
        u11.o(-850815885);
        long textPrimary2 = c7807z2 != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextPrimary() : c7807z2.w();
        u11.k();
        int truncateMode2 = DsTextAtomMappersKt.getTruncateMode(dto.getTruncatingMode());
        Integer maxLines2 = dto.getMaxLines();
        int intValue2 = maxLines2 == null ? maxLines2.intValue() : 1;
        DsTextPreset customPreset2 = dto.getPreset() != TextPreset.PRESET_CUSTOM ? DsTextAtomMappersKt.getCustomPreset(dto.getTypographyToken(), dto.getTopPadding(), dto.getBottomPadding()) : DsTextAtomMappersKt.getTextPreset(dto.getPreset());
        float paddingTop2 = customPreset2.getPaddingTop();
        float paddingBottom2 = customPreset2.getPaddingBottom();
        h parsePaddingToken3 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getLeftPadding()));
        float d112 = parsePaddingToken3 == null ? parsePaddingToken3.d() : UniTheme.INSTANCE.getPaddings().getNone();
        h parsePaddingToken22 = TokenParserKt.parsePaddingToken(String.valueOf(dto.getRightPadding()));
        float d122 = parsePaddingToken22 == null ? parsePaddingToken22.d() : UniTheme.INSTANCE.getPaddings().getNone();
        e testTag2 = AtomLocatorKt.testTag(viewAnalytics2, textLocator.invoke(dto.getTestInfo()));
        if (dto.getTagSupported()) {
        }
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
