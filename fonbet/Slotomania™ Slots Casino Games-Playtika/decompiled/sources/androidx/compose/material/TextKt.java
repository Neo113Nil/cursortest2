package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aß\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001aÉ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020)2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextStyle invoke() {
            return TextStyle.INSTANCE.getDefault();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:100:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0414 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b9  */
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1591TextfLXpl1I(final String text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long j5;
        int i8;
        long j6;
        int i9;
        FontStyle fontStyle2;
        int i10;
        FontWeight fontWeight2;
        int i11;
        FontFamily fontFamily2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Modifier.Companion companion;
        int m4381getClipgIe3tQ8;
        boolean z2;
        int i26;
        TextKt$Text$1 textKt$Text$1;
        TextStyle textStyle2;
        FontStyle fontStyle3;
        long j7;
        TextAlign textAlign2;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j8;
        TextDecoration textDecoration2;
        long j9;
        long j10;
        Composer composer2;
        final TextStyle textStyle3;
        final long j11;
        final Modifier modifier2;
        final int i27;
        final int i28;
        final Function1<? super TextLayoutResult, Unit> function12;
        final boolean z3;
        final long j12;
        final FontWeight fontWeight4;
        final FontStyle fontStyle4;
        final FontFamily fontFamily4;
        final long j13;
        final TextDecoration textDecoration3;
        final TextAlign textAlign3;
        final long j14;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-366126944);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)106@5548L7,129@6306L145:Text.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i29 = i5 & 2;
        if (i29 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= RendererCapabilities.MODE_SUPPORT_MASK;
                j5 = j;
            } else {
                j5 = j;
                if ((i3 & 896) == 0) {
                    i6 |= startRestartGroup.changed(j5) ? 256 : 128;
                }
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i3 & 7168) == 0) {
                    i6 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= 24576;
                fontStyle2 = fontStyle;
            } else {
                fontStyle2 = fontStyle;
                if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
            }
            i10 = i5 & 32;
            if (i10 == 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                fontWeight2 = fontWeight;
            } else {
                fontWeight2 = fontWeight;
                if ((i3 & 458752) == 0) {
                    i6 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                }
            }
            i11 = i5 & 64;
            if (i11 == 0) {
                i6 |= 1572864;
                fontFamily2 = fontFamily;
            } else {
                fontFamily2 = fontFamily;
                if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                }
            }
            i12 = i5 & 128;
            if (i12 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i13 = i5 & 256;
            if (i13 == 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                i6 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                i14 = i5 & 512;
                if (i14 != 0) {
                    i6 |= C.ENCODING_PCM_32BIT;
                } else if ((i3 & 1879048192) == 0) {
                    i15 = i14;
                    i6 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    i16 = i5 & 1024;
                    if (i16 == 0) {
                        i18 = i4 | 6;
                        i17 = i16;
                    } else if ((i4 & 14) == 0) {
                        i17 = i16;
                        i18 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i17 = i16;
                        i18 = i4;
                    }
                    i19 = i5 & 2048;
                    if (i19 == 0) {
                        i18 |= 48;
                    } else if ((i4 & 112) == 0) {
                        i18 |= startRestartGroup.changed(i) ? 32 : 16;
                        int i30 = i18;
                        i20 = i5 & 4096;
                        if (i20 != 0) {
                            i21 = i30 | RendererCapabilities.MODE_SUPPORT_MASK;
                        } else {
                            int i31 = i30;
                            if ((i4 & 896) == 0) {
                                i31 |= startRestartGroup.changed(z) ? 256 : 128;
                            }
                            i21 = i31;
                        }
                        i22 = i5 & 8192;
                        if (i22 != 0) {
                            i23 = i21 | 3072;
                        } else {
                            int i32 = i21;
                            if ((i4 & 7168) == 0) {
                                i23 = i32 | (startRestartGroup.changed(i2) ? 2048 : 1024);
                            } else {
                                i23 = i32;
                            }
                        }
                        i24 = i5 & 16384;
                        if (i24 != 0) {
                            i23 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i25 = i23 | (startRestartGroup.changed(function1) ? 16384 : 8192);
                            if ((i4 & 458752) == 0) {
                                i25 |= ((i5 & 32768) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                            }
                            if ((i6 & 1533916891) == 306783378 || (i25 & 374491) != 74898 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i29 == 0 ? Modifier.INSTANCE : modifier;
                                    if (i7 != 0) {
                                        j5 = Color.INSTANCE.m2148getUnspecified0d7_KjU();
                                    }
                                    if (i8 != 0) {
                                        j6 = TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE();
                                    }
                                    if (i9 != 0) {
                                        fontStyle2 = null;
                                    }
                                    if (i10 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i11 != 0) {
                                        fontFamily2 = null;
                                    }
                                    long m4642getUnspecifiedXSAIIZE = i12 == 0 ? TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE() : j3;
                                    TextDecoration textDecoration4 = i13 == 0 ? null : textDecoration;
                                    TextAlign textAlign4 = i15 == 0 ? textAlign : null;
                                    long m4642getUnspecifiedXSAIIZE2 = i17 == 0 ? TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE() : j4;
                                    m4381getClipgIe3tQ8 = i19 == 0 ? TextOverflow.INSTANCE.m4381getClipgIe3tQ8() : i;
                                    z2 = i20 == 0 ? true : z;
                                    i26 = i22 == 0 ? Integer.MAX_VALUE : i2;
                                    textKt$Text$1 = i24 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextLayoutResult it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            invoke2(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }
                                    } : function1;
                                    if ((i5 & 32768) == 0) {
                                        ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(providableCompositionLocal);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        textStyle2 = (TextStyle) consume;
                                        i25 &= -458753;
                                    } else {
                                        textStyle2 = textStyle;
                                    }
                                    fontStyle3 = fontStyle2;
                                    j7 = j6;
                                    textAlign2 = textAlign4;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j8 = m4642getUnspecifiedXSAIIZE;
                                    textDecoration2 = textDecoration4;
                                    j9 = m4642getUnspecifiedXSAIIZE2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i5 & 32768) != 0) {
                                        i25 &= -458753;
                                    }
                                    companion = modifier;
                                    j8 = j3;
                                    textDecoration2 = textDecoration;
                                    textAlign2 = textAlign;
                                    j9 = j4;
                                    m4381getClipgIe3tQ8 = i;
                                    z2 = z;
                                    i26 = i2;
                                    textKt$Text$1 = function1;
                                    textStyle2 = textStyle;
                                    fontStyle3 = fontStyle2;
                                    j7 = j6;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                }
                                startRestartGroup.endDefaults();
                                startRestartGroup.startReplaceableGroup(1557613088);
                                ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
                                if (j5 == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                                    j10 = j5;
                                } else {
                                    long m3969getColor0d7_KjU = textStyle2.m3969getColor0d7_KjU();
                                    if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume2 = startRestartGroup.consume(localContentColor);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        long m2122unboximpl = ((Color) consume2).m2122unboximpl();
                                        ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = startRestartGroup.consume(localContentAlpha);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        m3969getColor0d7_KjU = Color.m2111copywmQWz5c$default(m2122unboximpl, ((Number) consume3).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    j10 = m3969getColor0d7_KjU;
                                }
                                startRestartGroup.endReplaceableGroup();
                                int i33 = (i6 & 126) | ((i25 >> 3) & 7168);
                                int i34 = i25 << 9;
                                BasicTextKt.m862BasicTextBpD7jsM(text, companion, textStyle2.merge(new TextStyle(j10, j7, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j8, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j9, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), textKt$Text$1, m4381getClipgIe3tQ8, z2, i26, startRestartGroup, i33 | (i34 & 57344) | (i34 & 458752) | (i34 & 3670016), 0);
                                composer2 = startRestartGroup;
                                textStyle3 = textStyle2;
                                j11 = j5;
                                modifier2 = companion;
                                i27 = i26;
                                i28 = m4381getClipgIe3tQ8;
                                function12 = textKt$Text$1;
                                z3 = z2;
                                j12 = j7;
                                fontWeight4 = fontWeight3;
                                fontStyle4 = fontStyle3;
                                fontFamily4 = fontFamily3;
                                j13 = j8;
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                j14 = j9;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                textDecoration3 = textDecoration;
                                i28 = i;
                                z3 = z;
                                i27 = i2;
                                function12 = function1;
                                textStyle3 = textStyle;
                                composer2 = startRestartGroup;
                                j11 = j5;
                                fontStyle4 = fontStyle2;
                                j12 = j6;
                                fontWeight4 = fontWeight2;
                                fontFamily4 = fontFamily2;
                                j13 = j3;
                                textAlign3 = textAlign;
                                j14 = j4;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i35) {
                                    TextKt.m1591TextfLXpl1I(text, modifier2, j11, j12, fontStyle4, fontWeight4, fontFamily4, j13, textDecoration3, textAlign3, j14, i28, z3, i27, function12, textStyle3, composer3, i3 | 1, i4, i5);
                                }
                            });
                            return;
                        }
                        i25 = i23;
                        if ((i4 & 458752) == 0) {
                        }
                        if ((i6 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i29 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if ((i5 & 32768) == 0) {
                        }
                        fontStyle3 = fontStyle2;
                        j7 = j6;
                        textAlign2 = textAlign4;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j8 = m4642getUnspecifiedXSAIIZE;
                        textDecoration2 = textDecoration4;
                        j9 = m4642getUnspecifiedXSAIIZE2;
                        startRestartGroup.endDefaults();
                        startRestartGroup.startReplaceableGroup(1557613088);
                        ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
                        if (j5 == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        int i332 = (i6 & 126) | ((i25 >> 3) & 7168);
                        int i342 = i25 << 9;
                        BasicTextKt.m862BasicTextBpD7jsM(text, companion, textStyle2.merge(new TextStyle(j10, j7, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j8, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j9, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), textKt$Text$1, m4381getClipgIe3tQ8, z2, i26, startRestartGroup, i332 | (i342 & 57344) | (i342 & 458752) | (i342 & 3670016), 0);
                        composer2 = startRestartGroup;
                        textStyle3 = textStyle2;
                        j11 = j5;
                        modifier2 = companion;
                        i27 = i26;
                        i28 = m4381getClipgIe3tQ8;
                        function12 = textKt$Text$1;
                        z3 = z2;
                        j12 = j7;
                        fontWeight4 = fontWeight3;
                        fontStyle4 = fontStyle3;
                        fontFamily4 = fontFamily3;
                        j13 = j8;
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        j14 = j9;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    int i302 = i18;
                    i20 = i5 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i5 & 16384;
                    if (i24 != 0) {
                    }
                    i25 = i23;
                    if ((i4 & 458752) == 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i29 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if ((i5 & 32768) == 0) {
                    }
                    fontStyle3 = fontStyle2;
                    j7 = j6;
                    textAlign2 = textAlign4;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j8 = m4642getUnspecifiedXSAIIZE;
                    textDecoration2 = textDecoration4;
                    j9 = m4642getUnspecifiedXSAIIZE2;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1557613088);
                    ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
                    if (j5 == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    int i3322 = (i6 & 126) | ((i25 >> 3) & 7168);
                    int i3422 = i25 << 9;
                    BasicTextKt.m862BasicTextBpD7jsM(text, companion, textStyle2.merge(new TextStyle(j10, j7, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j8, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j9, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), textKt$Text$1, m4381getClipgIe3tQ8, z2, i26, startRestartGroup, i3322 | (i3422 & 57344) | (i3422 & 458752) | (i3422 & 3670016), 0);
                    composer2 = startRestartGroup;
                    textStyle3 = textStyle2;
                    j11 = j5;
                    modifier2 = companion;
                    i27 = i26;
                    i28 = m4381getClipgIe3tQ8;
                    function12 = textKt$Text$1;
                    z3 = z2;
                    j12 = j7;
                    fontWeight4 = fontWeight3;
                    fontStyle4 = fontStyle3;
                    fontFamily4 = fontFamily3;
                    j13 = j8;
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    j14 = j9;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i15 = i14;
                i16 = i5 & 1024;
                if (i16 == 0) {
                }
                i19 = i5 & 2048;
                if (i19 == 0) {
                }
                int i3022 = i18;
                i20 = i5 & 4096;
                if (i20 != 0) {
                }
                i22 = i5 & 8192;
                if (i22 != 0) {
                }
                i24 = i5 & 16384;
                if (i24 != 0) {
                }
                i25 = i23;
                if ((i4 & 458752) == 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i29 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                if (i20 == 0) {
                }
                if (i22 == 0) {
                }
                if (i24 == 0) {
                }
                if ((i5 & 32768) == 0) {
                }
                fontStyle3 = fontStyle2;
                j7 = j6;
                textAlign2 = textAlign4;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                j8 = m4642getUnspecifiedXSAIIZE;
                textDecoration2 = textDecoration4;
                j9 = m4642getUnspecifiedXSAIIZE2;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(1557613088);
                ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
                if (j5 == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                int i33222 = (i6 & 126) | ((i25 >> 3) & 7168);
                int i34222 = i25 << 9;
                BasicTextKt.m862BasicTextBpD7jsM(text, companion, textStyle2.merge(new TextStyle(j10, j7, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j8, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j9, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), textKt$Text$1, m4381getClipgIe3tQ8, z2, i26, startRestartGroup, i33222 | (i34222 & 57344) | (i34222 & 458752) | (i34222 & 3670016), 0);
                composer2 = startRestartGroup;
                textStyle3 = textStyle2;
                j11 = j5;
                modifier2 = companion;
                i27 = i26;
                i28 = m4381getClipgIe3tQ8;
                function12 = textKt$Text$1;
                z3 = z2;
                j12 = j7;
                fontWeight4 = fontWeight3;
                fontStyle4 = fontStyle3;
                fontFamily4 = fontFamily3;
                j13 = j8;
                textDecoration3 = textDecoration2;
                textAlign3 = textAlign2;
                j14 = j9;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i14 = i5 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i5 & 1024;
            if (i16 == 0) {
            }
            i19 = i5 & 2048;
            if (i19 == 0) {
            }
            int i30222 = i18;
            i20 = i5 & 4096;
            if (i20 != 0) {
            }
            i22 = i5 & 8192;
            if (i22 != 0) {
            }
            i24 = i5 & 16384;
            if (i24 != 0) {
            }
            i25 = i23;
            if ((i4 & 458752) == 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i29 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i19 == 0) {
            }
            if (i20 == 0) {
            }
            if (i22 == 0) {
            }
            if (i24 == 0) {
            }
            if ((i5 & 32768) == 0) {
            }
            fontStyle3 = fontStyle2;
            j7 = j6;
            textAlign2 = textAlign4;
            fontWeight3 = fontWeight2;
            fontFamily3 = fontFamily2;
            j8 = m4642getUnspecifiedXSAIIZE;
            textDecoration2 = textDecoration4;
            j9 = m4642getUnspecifiedXSAIIZE2;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(1557613088);
            ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
            if (j5 == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            int i332222 = (i6 & 126) | ((i25 >> 3) & 7168);
            int i342222 = i25 << 9;
            BasicTextKt.m862BasicTextBpD7jsM(text, companion, textStyle2.merge(new TextStyle(j10, j7, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j8, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j9, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), textKt$Text$1, m4381getClipgIe3tQ8, z2, i26, startRestartGroup, i332222 | (i342222 & 57344) | (i342222 & 458752) | (i342222 & 3670016), 0);
            composer2 = startRestartGroup;
            textStyle3 = textStyle2;
            j11 = j5;
            modifier2 = companion;
            i27 = i26;
            i28 = m4381getClipgIe3tQ8;
            function12 = textKt$Text$1;
            z3 = z2;
            j12 = j7;
            fontWeight4 = fontWeight3;
            fontStyle4 = fontStyle3;
            fontFamily4 = fontFamily3;
            j13 = j8;
            textDecoration3 = textDecoration2;
            textAlign3 = textAlign2;
            j14 = j9;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i5 & 1024;
        if (i16 == 0) {
        }
        i19 = i5 & 2048;
        if (i19 == 0) {
        }
        int i302222 = i18;
        i20 = i5 & 4096;
        if (i20 != 0) {
        }
        i22 = i5 & 8192;
        if (i22 != 0) {
        }
        i24 = i5 & 16384;
        if (i24 != 0) {
        }
        i25 = i23;
        if ((i4 & 458752) == 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i29 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i19 == 0) {
        }
        if (i20 == 0) {
        }
        if (i22 == 0) {
        }
        if (i24 == 0) {
        }
        if ((i5 & 32768) == 0) {
        }
        fontStyle3 = fontStyle2;
        j7 = j6;
        textAlign2 = textAlign4;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        j8 = m4642getUnspecifiedXSAIIZE;
        textDecoration2 = textDecoration4;
        j9 = m4642getUnspecifiedXSAIIZE2;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(1557613088);
        ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
        if (j5 == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        int i3322222 = (i6 & 126) | ((i25 >> 3) & 7168);
        int i3422222 = i25 << 9;
        BasicTextKt.m862BasicTextBpD7jsM(text, companion, textStyle2.merge(new TextStyle(j10, j7, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j8, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j9, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), textKt$Text$1, m4381getClipgIe3tQ8, z2, i26, startRestartGroup, i3322222 | (i3422222 & 57344) | (i3422222 & 458752) | (i3422222 & 3670016), 0);
        composer2 = startRestartGroup;
        textStyle3 = textStyle2;
        j11 = j5;
        modifier2 = companion;
        i27 = i26;
        i28 = m4381getClipgIe3tQ8;
        function12 = textKt$Text$1;
        z3 = z2;
        j12 = j7;
        fontWeight4 = fontWeight3;
        fontStyle4 = fontStyle3;
        fontFamily4 = fontFamily3;
        j13 = j8;
        textDecoration3 = textDecoration2;
        textAlign3 = textAlign2;
        j14 = j9;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0446 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bf  */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1590Text4IGK_g(final AnnotatedString text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long j5;
        int i8;
        long j6;
        int i9;
        FontStyle fontStyle2;
        int i10;
        FontWeight fontWeight2;
        int i11;
        FontFamily fontFamily2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Modifier.Companion companion;
        final int m4381getClipgIe3tQ8;
        boolean z2;
        int i28;
        Map<String, InlineTextContent> map2;
        TextKt$Text$3 textKt$Text$3;
        TextStyle textStyle2;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        FontStyle fontStyle3;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j7;
        long j8;
        long j9;
        long j10;
        Composer composer2;
        final int i29;
        final boolean z3;
        final Map<String, InlineTextContent> map3;
        final Function1<? super TextLayoutResult, Unit> function12;
        final TextStyle textStyle3;
        final long j11;
        final Modifier modifier2;
        final long j12;
        final FontWeight fontWeight4;
        final FontStyle fontStyle4;
        final FontFamily fontFamily4;
        final long j13;
        final TextDecoration textDecoration3;
        final TextAlign textAlign3;
        final long j14;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-422393234);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)210@10653L7,232@11410L167:Text.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i30 = i5 & 2;
        if (i30 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= RendererCapabilities.MODE_SUPPORT_MASK;
                j5 = j;
            } else {
                j5 = j;
                if ((i3 & 896) == 0) {
                    i6 |= startRestartGroup.changed(j5) ? 256 : 128;
                }
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i3 & 7168) == 0) {
                    i6 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= 24576;
                fontStyle2 = fontStyle;
            } else {
                fontStyle2 = fontStyle;
                if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
            }
            i10 = i5 & 32;
            if (i10 == 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                fontWeight2 = fontWeight;
            } else {
                fontWeight2 = fontWeight;
                if ((i3 & 458752) == 0) {
                    i6 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                }
            }
            i11 = i5 & 64;
            if (i11 == 0) {
                i6 |= 1572864;
                fontFamily2 = fontFamily;
            } else {
                fontFamily2 = fontFamily;
                if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                }
            }
            i12 = i5 & 128;
            if (i12 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i13 = i5 & 256;
            if (i13 == 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                i6 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                i14 = i5 & 512;
                if (i14 != 0) {
                    i6 |= C.ENCODING_PCM_32BIT;
                } else if ((i3 & 1879048192) == 0) {
                    i15 = i14;
                    i6 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    i16 = i5 & 1024;
                    if (i16 == 0) {
                        i18 = i4 | 6;
                        i17 = i16;
                    } else if ((i4 & 14) == 0) {
                        i17 = i16;
                        i18 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i17 = i16;
                        i18 = i4;
                    }
                    i19 = i5 & 2048;
                    if (i19 == 0) {
                        i18 |= 48;
                    } else if ((i4 & 112) == 0) {
                        i18 |= startRestartGroup.changed(i) ? 32 : 16;
                        int i31 = i18;
                        i20 = i5 & 4096;
                        if (i20 != 0) {
                            i21 = i31 | RendererCapabilities.MODE_SUPPORT_MASK;
                        } else {
                            int i32 = i31;
                            if ((i4 & 896) == 0) {
                                i32 |= startRestartGroup.changed(z) ? 256 : 128;
                            }
                            i21 = i32;
                        }
                        i22 = i5 & 8192;
                        if (i22 != 0) {
                            i23 = i21 | 3072;
                        } else {
                            int i33 = i21;
                            if ((i4 & 7168) == 0) {
                                i23 = i33 | (startRestartGroup.changed(i2) ? 2048 : 1024);
                            } else {
                                i23 = i33;
                            }
                        }
                        i24 = i5 & 16384;
                        if (i24 != 0) {
                            i23 |= 8192;
                        }
                        i25 = i5 & 32768;
                        if (i25 != 0) {
                            i26 = i23 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else {
                            int i34 = i23;
                            if ((i4 & 458752) == 0) {
                                i26 = i34 | (startRestartGroup.changed(function1) ? 131072 : 65536);
                            } else {
                                i26 = i34;
                            }
                        }
                        if ((i4 & 3670016) == 0) {
                            i26 |= ((i5 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                        }
                        if (i24 == 16384) {
                            i27 = i24;
                            if ((1533916891 & i6) == 306783378 && (i26 & 2995931) == 599186 && startRestartGroup.getSkipping()) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                textDecoration3 = textDecoration;
                                m4381getClipgIe3tQ8 = i;
                                z3 = z;
                                i29 = i2;
                                map3 = map;
                                function12 = function1;
                                textStyle3 = textStyle;
                                composer2 = startRestartGroup;
                                j11 = j5;
                                j12 = j6;
                                fontStyle4 = fontStyle2;
                                fontWeight4 = fontWeight2;
                                fontFamily4 = fontFamily2;
                                j13 = j3;
                                textAlign3 = textAlign;
                                j14 = j4;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i35) {
                                        TextKt.m1590Text4IGK_g(AnnotatedString.this, modifier2, j11, j12, fontStyle4, fontWeight4, fontFamily4, j13, textDecoration3, textAlign3, j14, m4381getClipgIe3tQ8, z3, i29, map3, function12, textStyle3, composer3, i3 | 1, i4, i5);
                                    }
                                });
                                return;
                            }
                        } else {
                            i27 = i24;
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i30 != 0 ? Modifier.INSTANCE : modifier;
                            if (i7 != 0) {
                                j5 = Color.INSTANCE.m2148getUnspecified0d7_KjU();
                            }
                            if (i8 != 0) {
                                j6 = TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE();
                            }
                            if (i9 != 0) {
                                fontStyle2 = null;
                            }
                            if (i10 != 0) {
                                fontWeight2 = null;
                            }
                            if (i11 != 0) {
                                fontFamily2 = null;
                            }
                            long m4642getUnspecifiedXSAIIZE = i12 != 0 ? TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE() : j3;
                            TextDecoration textDecoration4 = i13 != 0 ? null : textDecoration;
                            TextAlign textAlign4 = i15 == 0 ? textAlign : null;
                            long m4642getUnspecifiedXSAIIZE2 = i17 != 0 ? TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE() : j4;
                            m4381getClipgIe3tQ8 = i19 != 0 ? TextOverflow.INSTANCE.m4381getClipgIe3tQ8() : i;
                            z2 = i20 != 0 ? true : z;
                            i28 = i22 != 0 ? Integer.MAX_VALUE : i2;
                            if (i27 != 0) {
                                map2 = MapsKt.emptyMap();
                                i26 &= -57345;
                            } else {
                                map2 = map;
                            }
                            textKt$Text$3 = i25 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            } : function1;
                            if ((i5 & 65536) != 0) {
                                ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(providableCompositionLocal);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                textStyle2 = (TextStyle) consume;
                                i26 &= -3670017;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration2 = textDecoration4;
                            textAlign2 = textAlign4;
                            fontStyle3 = fontStyle2;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j7 = m4642getUnspecifiedXSAIIZE;
                            j8 = m4642getUnspecifiedXSAIIZE2;
                            j9 = j6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if (i27 != 0) {
                                i26 &= -57345;
                            }
                            if ((i5 & 65536) != 0) {
                                i26 &= -3670017;
                            }
                            companion = modifier;
                            j7 = j3;
                            textDecoration2 = textDecoration;
                            textAlign2 = textAlign;
                            j8 = j4;
                            m4381getClipgIe3tQ8 = i;
                            z2 = z;
                            i28 = i2;
                            map2 = map;
                            textKt$Text$3 = function1;
                            textStyle2 = textStyle;
                            j9 = j6;
                            fontStyle3 = fontStyle2;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                        }
                        startRestartGroup.endDefaults();
                        startRestartGroup.startReplaceableGroup(1557618192);
                        ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
                        if (j5 != Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                            j10 = j5;
                        } else {
                            long m3969getColor0d7_KjU = textStyle2.m3969getColor0d7_KjU();
                            if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                                ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localContentColor);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                long m2122unboximpl = ((Color) consume2).m2122unboximpl();
                                ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = startRestartGroup.consume(localContentAlpha);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                m3969getColor0d7_KjU = Color.m2111copywmQWz5c$default(m2122unboximpl, ((Number) consume3).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            j10 = m3969getColor0d7_KjU;
                        }
                        startRestartGroup.endReplaceableGroup();
                        int i35 = 16777216 | (i6 & 14) | (i6 & 112) | ((i26 >> 6) & 7168);
                        int i36 = i26 << 9;
                        BasicTextKt.m860BasicText4YKlhWE(text, companion, textStyle2.merge(new TextStyle(j10, j9, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j7, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j8, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), textKt$Text$3, m4381getClipgIe3tQ8, z2, i28, map2, startRestartGroup, i35 | (57344 & i36) | (i36 & 458752) | (i36 & 3670016), 0);
                        composer2 = startRestartGroup;
                        Function1<? super TextLayoutResult, Unit> function13 = textKt$Text$3;
                        i29 = i28;
                        z3 = z2;
                        map3 = map2;
                        function12 = function13;
                        textStyle3 = textStyle2;
                        j11 = j5;
                        modifier2 = companion;
                        j12 = j9;
                        fontWeight4 = fontWeight3;
                        fontStyle4 = fontStyle3;
                        fontFamily4 = fontFamily3;
                        j13 = j7;
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        j14 = j8;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    int i312 = i18;
                    i20 = i5 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i5 & 16384;
                    if (i24 != 0) {
                    }
                    i25 = i5 & 32768;
                    if (i25 != 0) {
                    }
                    if ((i4 & 3670016) == 0) {
                    }
                    if (i24 == 16384) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i30 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if ((i5 & 65536) != 0) {
                    }
                    textDecoration2 = textDecoration4;
                    textAlign2 = textAlign4;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j7 = m4642getUnspecifiedXSAIIZE;
                    j8 = m4642getUnspecifiedXSAIIZE2;
                    j9 = j6;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1557618192);
                    ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
                    if (j5 != Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    int i352 = 16777216 | (i6 & 14) | (i6 & 112) | ((i26 >> 6) & 7168);
                    int i362 = i26 << 9;
                    BasicTextKt.m860BasicText4YKlhWE(text, companion, textStyle2.merge(new TextStyle(j10, j9, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j7, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j8, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), textKt$Text$3, m4381getClipgIe3tQ8, z2, i28, map2, startRestartGroup, i352 | (57344 & i362) | (i362 & 458752) | (i362 & 3670016), 0);
                    composer2 = startRestartGroup;
                    Function1<? super TextLayoutResult, Unit> function132 = textKt$Text$3;
                    i29 = i28;
                    z3 = z2;
                    map3 = map2;
                    function12 = function132;
                    textStyle3 = textStyle2;
                    j11 = j5;
                    modifier2 = companion;
                    j12 = j9;
                    fontWeight4 = fontWeight3;
                    fontStyle4 = fontStyle3;
                    fontFamily4 = fontFamily3;
                    j13 = j7;
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    j14 = j8;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i15 = i14;
                i16 = i5 & 1024;
                if (i16 == 0) {
                }
                i19 = i5 & 2048;
                if (i19 == 0) {
                }
                int i3122 = i18;
                i20 = i5 & 4096;
                if (i20 != 0) {
                }
                i22 = i5 & 8192;
                if (i22 != 0) {
                }
                i24 = i5 & 16384;
                if (i24 != 0) {
                }
                i25 = i5 & 32768;
                if (i25 != 0) {
                }
                if ((i4 & 3670016) == 0) {
                }
                if (i24 == 16384) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i30 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 == 0) {
                }
                if (i17 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                if (i22 != 0) {
                }
                if (i27 != 0) {
                }
                if (i25 != 0) {
                }
                if ((i5 & 65536) != 0) {
                }
                textDecoration2 = textDecoration4;
                textAlign2 = textAlign4;
                fontStyle3 = fontStyle2;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                j7 = m4642getUnspecifiedXSAIIZE;
                j8 = m4642getUnspecifiedXSAIIZE2;
                j9 = j6;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(1557618192);
                ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
                if (j5 != Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                int i3522 = 16777216 | (i6 & 14) | (i6 & 112) | ((i26 >> 6) & 7168);
                int i3622 = i26 << 9;
                BasicTextKt.m860BasicText4YKlhWE(text, companion, textStyle2.merge(new TextStyle(j10, j9, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j7, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j8, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), textKt$Text$3, m4381getClipgIe3tQ8, z2, i28, map2, startRestartGroup, i3522 | (57344 & i3622) | (i3622 & 458752) | (i3622 & 3670016), 0);
                composer2 = startRestartGroup;
                Function1<? super TextLayoutResult, Unit> function1322 = textKt$Text$3;
                i29 = i28;
                z3 = z2;
                map3 = map2;
                function12 = function1322;
                textStyle3 = textStyle2;
                j11 = j5;
                modifier2 = companion;
                j12 = j9;
                fontWeight4 = fontWeight3;
                fontStyle4 = fontStyle3;
                fontFamily4 = fontFamily3;
                j13 = j7;
                textDecoration3 = textDecoration2;
                textAlign3 = textAlign2;
                j14 = j8;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i14 = i5 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i5 & 1024;
            if (i16 == 0) {
            }
            i19 = i5 & 2048;
            if (i19 == 0) {
            }
            int i31222 = i18;
            i20 = i5 & 4096;
            if (i20 != 0) {
            }
            i22 = i5 & 8192;
            if (i22 != 0) {
            }
            i24 = i5 & 16384;
            if (i24 != 0) {
            }
            i25 = i5 & 32768;
            if (i25 != 0) {
            }
            if ((i4 & 3670016) == 0) {
            }
            if (i24 == 16384) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i30 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 == 0) {
            }
            if (i17 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if (i22 != 0) {
            }
            if (i27 != 0) {
            }
            if (i25 != 0) {
            }
            if ((i5 & 65536) != 0) {
            }
            textDecoration2 = textDecoration4;
            textAlign2 = textAlign4;
            fontStyle3 = fontStyle2;
            fontWeight3 = fontWeight2;
            fontFamily3 = fontFamily2;
            j7 = m4642getUnspecifiedXSAIIZE;
            j8 = m4642getUnspecifiedXSAIIZE2;
            j9 = j6;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(1557618192);
            ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
            if (j5 != Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            int i35222 = 16777216 | (i6 & 14) | (i6 & 112) | ((i26 >> 6) & 7168);
            int i36222 = i26 << 9;
            BasicTextKt.m860BasicText4YKlhWE(text, companion, textStyle2.merge(new TextStyle(j10, j9, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j7, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j8, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), textKt$Text$3, m4381getClipgIe3tQ8, z2, i28, map2, startRestartGroup, i35222 | (57344 & i36222) | (i36222 & 458752) | (i36222 & 3670016), 0);
            composer2 = startRestartGroup;
            Function1<? super TextLayoutResult, Unit> function13222 = textKt$Text$3;
            i29 = i28;
            z3 = z2;
            map3 = map2;
            function12 = function13222;
            textStyle3 = textStyle2;
            j11 = j5;
            modifier2 = companion;
            j12 = j9;
            fontWeight4 = fontWeight3;
            fontStyle4 = fontStyle3;
            fontFamily4 = fontFamily3;
            j13 = j7;
            textDecoration3 = textDecoration2;
            textAlign3 = textAlign2;
            j14 = j8;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i5 & 1024;
        if (i16 == 0) {
        }
        i19 = i5 & 2048;
        if (i19 == 0) {
        }
        int i312222 = i18;
        i20 = i5 & 4096;
        if (i20 != 0) {
        }
        i22 = i5 & 8192;
        if (i22 != 0) {
        }
        i24 = i5 & 16384;
        if (i24 != 0) {
        }
        i25 = i5 & 32768;
        if (i25 != 0) {
        }
        if ((i4 & 3670016) == 0) {
        }
        if (i24 == 16384) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i30 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 == 0) {
        }
        if (i17 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if (i22 != 0) {
        }
        if (i27 != 0) {
        }
        if (i25 != 0) {
        }
        if ((i5 & 65536) != 0) {
        }
        textDecoration2 = textDecoration4;
        textAlign2 = textAlign4;
        fontStyle3 = fontStyle2;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        j7 = m4642getUnspecifiedXSAIIZE;
        j8 = m4642getUnspecifiedXSAIIZE2;
        j9 = j6;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(1557618192);
        ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
        if (j5 != Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        int i352222 = 16777216 | (i6 & 14) | (i6 & 112) | ((i26 >> 6) & 7168);
        int i362222 = i26 << 9;
        BasicTextKt.m860BasicText4YKlhWE(text, companion, textStyle2.merge(new TextStyle(j10, j9, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j7, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j8, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), textKt$Text$3, m4381getClipgIe3tQ8, z2, i28, map2, startRestartGroup, i352222 | (57344 & i362222) | (i362222 & 458752) | (i362222 & 3670016), 0);
        composer2 = startRestartGroup;
        Function1<? super TextLayoutResult, Unit> function132222 = textKt$Text$3;
        i29 = i28;
        z3 = z2;
        map3 = map2;
        function12 = function132222;
        textStyle3 = textStyle2;
        j11 = j5;
        modifier2 = companion;
        j12 = j9;
        fontWeight4 = fontWeight3;
        fontStyle4 = fontStyle3;
        fontFamily4 = fontFamily3;
        j13 = j7;
        textDecoration3 = textDecoration2;
        textAlign3 = textAlign2;
        j14 = j8;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final TextStyle value, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1772272796);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyle)P(1)263@12533L7,264@12558L80:Text.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providableCompositionLocal.provides(((TextStyle) consume).merge(value))}, content, startRestartGroup, (i2 & 112) | 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                TextKt.ProvideTextStyle(TextStyle.this, content, composer2, i | 1);
            }
        });
    }
}
