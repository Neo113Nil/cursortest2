package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.common.C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÏ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#\u001aÃ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%\u001aã\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0004\b*\u0010+\u001aÙ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010,\u001a(\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020!2\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u000104¢\u0006\u0002\b5H\u0007¢\u0006\u0002\u00106\u001a\u0018\u00107\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020&2\u0006\u00108\u001a\u000209H\u0002\u001a\r\u0010:\u001a\u000209H\u0003¢\u0006\u0002\u0010;\"\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020!0.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006<"}, d2 = {"Text", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", ViewProps.LETTER_SPACING, TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", ViewProps.LINE_HEIGHT, ViewProps.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Landroidx/compose/ui/text/TextStyle;", "Text--4IGK_g", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContent", "", "Landroidx/compose/foundation/text/InlineTextContent;", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "createTextWithLinkStyles", "linkStyles", "Landroidx/compose/ui/text/TextLinkStyles;", "rememberTextLinkStyles", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextLinkStyles;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: androidx.compose.material.TextKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TextStyle defaultTextStyle;
            defaultTextStyle = TypographyKt.getDefaultTextStyle();
            return defaultTextStyle;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideTextStyle$lambda$14(TextStyle textStyle, Function2 function2, int i, Composer composer, int i2) {
        ProvideTextStyle(textStyle, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_IbK3jfQ$lambda$9(AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map map, Function1 function1, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m2563TextIbK3jfQ(annotatedString, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, i3, map, function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text__4IGK_g$lambda$1(String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1 function1, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m2562Text4IGK_g(str, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, i3, (Function1<? super TextLayoutResult, Unit>) function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text__4IGK_g$lambda$12(AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, Function1 function1, TextStyle textStyle, int i3, int i4, int i5, Composer composer, int i6) {
        m2561Text4IGK_g(annotatedString, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, map, function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_fLXpl1I$lambda$4(String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, int i3, int i4, int i5, Composer composer, int i6) {
        m2564TextfLXpl1I(str, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2562Text4IGK_g(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        long j5;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Composer composer2;
        Modifier.Companion companion;
        final long j6;
        final TextDecoration textDecoration2;
        TextAlign textAlign2;
        final int i27;
        final int i28;
        final int i29;
        Function1<? super TextLayoutResult, Unit> function12;
        final TextStyle textStyle2;
        final boolean z3;
        final FontStyle fontStyle3;
        final long j7;
        final FontFamily fontFamily3;
        final long j8;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        long m6075getUnspecified0d7_KjU;
        int m8705getClipgIe3tQ8;
        int i30;
        int i31;
        Function1<? super TextLayoutResult, Unit> function13;
        TextStyle textStyle3;
        TextDecoration textDecoration3;
        FontStyle fontStyle4;
        long j10;
        FontWeight fontWeight3;
        FontFamily fontFamily4;
        long j11;
        int i32;
        long j12;
        final long m6038copywmQWz5c$default;
        Composer startRestartGroup = composer.startRestartGroup(1028090691);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,modifier,color:c#ui.graphics.Color,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,minLines,onTextLayout,style)133@7187L7,134@7241L7,163@8145L30,144@7500L682:Text.kt#jmzs0o");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i33 = i6 & 2;
        if (i33 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & 3072) == 0) {
                    i7 |= startRestartGroup.changed(j5) ? 2048 : 1024;
                }
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                fontStyle2 = fontStyle;
                i7 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i7 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i4 & 1572864) == 0) {
                        i7 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i14 = i6 & 256;
                if (i14 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    i7 |= startRestartGroup.changed(textDecoration) ? 67108864 : 33554432;
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    i16 = i15;
                    i7 |= startRestartGroup.changed(textAlign) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    i17 = i6 & 1024;
                    if (i17 == 0) {
                        i18 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        i18 = i5 | (startRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i18 = i5;
                    }
                    i19 = i6 & 2048;
                    if (i19 == 0) {
                        i18 |= 48;
                        i20 = i19;
                    } else if ((i5 & 48) == 0) {
                        i20 = i19;
                        i18 |= startRestartGroup.changed(i) ? 32 : 16;
                    } else {
                        i20 = i19;
                    }
                    int i34 = i18;
                    i21 = i6 & 4096;
                    if (i21 == 0) {
                        i34 |= 384;
                    } else if ((i5 & 384) == 0) {
                        z2 = z;
                        i34 |= startRestartGroup.changed(z2) ? 256 : 128;
                        i22 = i6 & 8192;
                        if (i22 != 0) {
                            i23 = i34 | 3072;
                        } else {
                            int i35 = i34;
                            if ((i5 & 3072) == 0) {
                                i23 = i35 | (startRestartGroup.changed(i2) ? 2048 : 1024);
                            } else {
                                i23 = i35;
                            }
                        }
                        i24 = i6 & 16384;
                        if (i24 != 0) {
                            i25 = i23 | 24576;
                        } else {
                            i25 = i23;
                            if ((i5 & 24576) == 0) {
                                i25 |= startRestartGroup.changed(i3) ? 16384 : 8192;
                                i26 = i6 & 32768;
                                if (i26 == 0) {
                                    i25 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i25 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                                }
                                if ((i5 & 1572864) == 0) {
                                    i25 |= ((i6 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                                }
                                if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 599187) != 599186, i7 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "114@5974L7");
                                    if ((i4 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i6 & 65536) != 0) {
                                            i25 &= -3670017;
                                        }
                                        companion = modifier;
                                        m6075getUnspecified0d7_KjU = j;
                                        j11 = j3;
                                        textDecoration3 = textDecoration;
                                        textAlign2 = textAlign;
                                        j12 = j4;
                                        m8705getClipgIe3tQ8 = i;
                                        i30 = i2;
                                        i31 = i3;
                                        function13 = function1;
                                        textStyle3 = textStyle;
                                        fontStyle4 = fontStyle2;
                                        j10 = j5;
                                        fontWeight3 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        i32 = i25;
                                    } else {
                                        companion = i33 != 0 ? Modifier.INSTANCE : modifier;
                                        m6075getUnspecified0d7_KjU = i8 != 0 ? Color.INSTANCE.m6075getUnspecified0d7_KjU() : j;
                                        if (i9 != 0) {
                                            j5 = TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE();
                                        }
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long m9003getUnspecifiedXSAIIZE = i13 != 0 ? TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i14 != 0 ? null : textDecoration;
                                        textAlign2 = i16 != 0 ? null : textAlign;
                                        long m9003getUnspecifiedXSAIIZE2 = i17 != 0 ? TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE() : j4;
                                        m8705getClipgIe3tQ8 = i20 != 0 ? TextOverflow.INSTANCE.m8705getClipgIe3tQ8() : i;
                                        if (i21 != 0) {
                                            z2 = true;
                                        }
                                        i30 = i22 != 0 ? Integer.MAX_VALUE : i2;
                                        i31 = i24 == 0 ? i3 : 1;
                                        function13 = i26 == 0 ? function1 : null;
                                        if ((i6 & 65536) != 0) {
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i25 &= -3670017;
                                            textStyle3 = (TextStyle) consume;
                                        } else {
                                            textStyle3 = textStyle;
                                        }
                                        textDecoration3 = textDecoration4;
                                        fontStyle4 = fontStyle2;
                                        j10 = j5;
                                        fontWeight3 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j11 = m9003getUnspecifiedXSAIIZE;
                                        i32 = i25;
                                        j12 = m9003getUnspecifiedXSAIIZE2;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1028090691, i7, i32, "androidx.compose.material.Text (Text.kt:115)");
                                    }
                                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    long m6049unboximpl = ((Color) consume2).m6049unboximpl();
                                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume3 = startRestartGroup.consume(localContentAlpha);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    float floatValue = ((Number) consume3).floatValue();
                                    if (m6075getUnspecified0d7_KjU != 16) {
                                        m6038copywmQWz5c$default = m6075getUnspecified0d7_KjU;
                                    } else if (textStyle3.m8262getColor0d7_KjU() != 16) {
                                        m6038copywmQWz5c$default = textStyle3.m8262getColor0d7_KjU();
                                    } else {
                                        m6038copywmQWz5c$default = Color.m6038copywmQWz5c$default(m6049unboximpl, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    TextStyle m8252mergedA7vx0o$default = TextStyle.m8252mergedA7vx0o$default(textStyle3, 0L, j10, fontWeight3, fontStyle4, null, fontFamily4, null, j11, null, null, null, 0L, textDecoration3, null, null, textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m8660getUnspecifiede0LSkKk(), 0, j12, null, null, 0, 0, null, null, 16609105, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 152767073, "CC(remember):Text.kt#9igjgp");
                                    boolean changed = startRestartGroup.changed(m6038copywmQWz5c$default);
                                    ColorProducer rememberedValue = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new ColorProducer() { // from class: androidx.compose.material.TextKt$Text$1$1
                                            @Override // androidx.compose.ui.graphics.ColorProducer
                                            /* renamed from: invoke-0d7_KjU */
                                            public final long mo2305invoke0d7_KjU() {
                                                return m6038copywmQWz5c$default;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i36 = i32 << 9;
                                    BasicTextKt.m1557BasicTextRWo7tUw(str, companion, m8252mergedA7vx0o$default, function13, m8705getClipgIe3tQ8, z2, i30, i31, (ColorProducer) rememberedValue, (TextAutoSize) null, startRestartGroup, (i7 & 126) | ((i32 >> 6) & 7168) | (57344 & i36) | (458752 & i36) | (3670016 & i36) | (i36 & 29360128), 512);
                                    composer2 = startRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    function12 = function13;
                                    i28 = i30;
                                    i29 = i31;
                                    i27 = m8705getClipgIe3tQ8;
                                    j6 = m6075getUnspecified0d7_KjU;
                                    textStyle2 = textStyle3;
                                    fontWeight2 = fontWeight3;
                                    fontStyle3 = fontStyle4;
                                    fontFamily3 = fontFamily4;
                                    j8 = j11;
                                    textDecoration2 = textDecoration3;
                                    j9 = j12;
                                    z3 = z2;
                                    j7 = j10;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    companion = modifier;
                                    j6 = j;
                                    textDecoration2 = textDecoration;
                                    textAlign2 = textAlign;
                                    i27 = i;
                                    i28 = i2;
                                    i29 = i3;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    fontStyle3 = fontStyle2;
                                    j7 = j5;
                                    fontFamily3 = fontFamily2;
                                    j8 = j3;
                                    j9 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    final Modifier modifier2 = companion;
                                    final FontWeight fontWeight4 = fontWeight2;
                                    final TextAlign textAlign3 = textAlign2;
                                    final Function1<? super TextLayoutResult, Unit> function14 = function12;
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Text__4IGK_g$lambda$1;
                                            Text__4IGK_g$lambda$1 = TextKt.Text__4IGK_g$lambda$1(str, modifier2, j6, j7, fontStyle3, fontWeight4, fontFamily3, j8, textDecoration2, textAlign3, j9, i27, z3, i28, i29, function14, textStyle2, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                            return Text__4IGK_g$lambda$1;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        }
                        i26 = i6 & 32768;
                        if (i26 == 0) {
                        }
                        if ((i5 & 1572864) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 599187) != 599186, i7 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z2 = z;
                    i22 = i6 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i6 & 16384;
                    if (i24 != 0) {
                    }
                    i26 = i6 & 32768;
                    if (i26 == 0) {
                    }
                    if ((i5 & 1572864) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 599187) != 599186, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i16 = i15;
                i17 = i6 & 1024;
                if (i17 == 0) {
                }
                i19 = i6 & 2048;
                if (i19 == 0) {
                }
                int i342 = i18;
                i21 = i6 & 4096;
                if (i21 == 0) {
                }
                z2 = z;
                i22 = i6 & 8192;
                if (i22 != 0) {
                }
                i24 = i6 & 16384;
                if (i24 != 0) {
                }
                i26 = i6 & 32768;
                if (i26 == 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 599187) != 599186, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i6 & 256;
            if (i14 != 0) {
            }
            i15 = i6 & 512;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i6 & 1024;
            if (i17 == 0) {
            }
            i19 = i6 & 2048;
            if (i19 == 0) {
            }
            int i3422 = i18;
            i21 = i6 & 4096;
            if (i21 == 0) {
            }
            z2 = z;
            i22 = i6 & 8192;
            if (i22 != 0) {
            }
            i24 = i6 & 16384;
            if (i24 != 0) {
            }
            i26 = i6 & 32768;
            if (i26 == 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 599187) != 599186, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i6 & 256;
        if (i14 != 0) {
        }
        i15 = i6 & 512;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i6 & 1024;
        if (i17 == 0) {
        }
        i19 = i6 & 2048;
        if (i19 == 0) {
        }
        int i34222 = i18;
        i21 = i6 & 4096;
        if (i21 == 0) {
        }
        z2 = z;
        i22 = i6 & 8192;
        if (i22 != 0) {
        }
        i24 = i6 & 16384;
        if (i24 != 0) {
        }
        i26 = i6 & 32768;
        if (i26 == 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 599187) != 599186, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_fLXpl1I$lambda$3$lambda$2(TextLayoutResult textLayoutResult) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2564TextfLXpl1I(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long j5;
        int i8;
        int i9;
        long j6;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
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
        boolean z2;
        int i25;
        int i26;
        int i27;
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int i28;
        final int i29;
        final Function1 function12;
        final TextStyle textStyle2;
        final boolean z3;
        final long j7;
        final FontStyle fontStyle3;
        final long j8;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j9;
        final TextDecoration textDecoration2;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        Function1 function13;
        Modifier modifier4;
        TextAlign textAlign3;
        boolean z4;
        long j11;
        Function1 function14;
        TextStyle textStyle3;
        int i30;
        int i31;
        long j12;
        TextDecoration textDecoration3;
        long j13;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long j14;
        Composer startRestartGroup = composer.startRestartGroup(-366126944);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,modifier,color:c#ui.graphics.Color,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,onTextLayout,style)190@8980L323:Text.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i32 = i5 & 2;
        if (i32 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i8 = i6 | 384;
                j5 = j;
            } else {
                int i33 = i6;
                j5 = j;
                if ((i3 & 384) == 0) {
                    i33 |= startRestartGroup.changed(j5) ? 256 : 128;
                }
                i8 = i33;
            }
            i9 = i5 & 8;
            if (i9 == 0) {
                i8 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i3 & 3072) == 0) {
                    i8 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i8 |= 24576;
            } else if ((i3 & 24576) == 0) {
                fontStyle2 = fontStyle;
                i8 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                i11 = i5 & 32;
                int i34 = 65536;
                if (i11 != 0) {
                    i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i8 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                    i8 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 1572864) == 0) {
                        i8 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                    i8 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i14 = i8 | (startRestartGroup.changed(j3) ? 8388608 : 4194304);
                    i15 = i5 & 256;
                    if (i15 == 0) {
                        i14 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i16 = i15;
                        i14 |= startRestartGroup.changed(textDecoration) ? 67108864 : 33554432;
                        i17 = i5 & 512;
                        if (i17 != 0) {
                            i14 |= 805306368;
                            i18 = i17;
                        } else if ((i3 & 805306368) == 0) {
                            i18 = i17;
                            i14 |= startRestartGroup.changed(textAlign) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        } else {
                            i18 = i17;
                        }
                        i19 = i14;
                        i20 = i5 & 1024;
                        if (i20 != 0) {
                            i21 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i21 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i21 = i4;
                        }
                        i22 = i5 & 2048;
                        if (i22 != 0) {
                            i21 |= 48;
                            i23 = i22;
                        } else if ((i4 & 48) == 0) {
                            i23 = i22;
                            i21 |= startRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i23 = i22;
                        }
                        int i35 = i21;
                        i24 = i5 & 4096;
                        if (i24 != 0) {
                            i35 |= 384;
                        } else if ((i4 & 384) == 0) {
                            z2 = z;
                            i35 |= startRestartGroup.changed(z2) ? 256 : 128;
                            i25 = i5 & 8192;
                            if (i25 == 0) {
                                i26 = i35 | 3072;
                            } else {
                                int i36 = i35;
                                if ((i4 & 3072) == 0) {
                                    i26 = i36 | (startRestartGroup.changed(i2) ? 2048 : 1024);
                                } else {
                                    i26 = i36;
                                }
                            }
                            i27 = i5 & 16384;
                            if (i27 == 0) {
                                i26 |= 24576;
                            } else if ((i4 & 24576) == 0) {
                                i26 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    if ((i5 & 32768) == 0 && startRestartGroup.changed(textStyle)) {
                                        i34 = 131072;
                                    }
                                    i26 |= i34;
                                }
                                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "187@8921L2,188@8963L7");
                                    if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 32768) != 0) {
                                            i26 &= -458753;
                                        }
                                        modifier4 = modifier;
                                        textAlign3 = textAlign;
                                        j11 = j4;
                                        i30 = i;
                                        i31 = i2;
                                        function14 = function1;
                                        textStyle3 = textStyle;
                                        z4 = z2;
                                        j12 = j5;
                                        j13 = j6;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j14 = j3;
                                        textDecoration3 = textDecoration;
                                    } else {
                                        Modifier.Companion companion = i32 != 0 ? Modifier.INSTANCE : modifier;
                                        if (i7 != 0) {
                                            j5 = Color.INSTANCE.m6075getUnspecified0d7_KjU();
                                        }
                                        if (i9 != 0) {
                                            j6 = TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE();
                                        }
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long m9003getUnspecifiedXSAIIZE = i13 != 0 ? TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i16 != 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i18 == 0 ? textAlign : null;
                                        long m9003getUnspecifiedXSAIIZE2 = i20 != 0 ? TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE() : j4;
                                        int m8705getClipgIe3tQ8 = i23 != 0 ? TextOverflow.INSTANCE.m8705getClipgIe3tQ8() : i;
                                        boolean z5 = i24 == 0 ? z2 : true;
                                        int i37 = i25 != 0 ? Integer.MAX_VALUE : i2;
                                        if (i27 != 0) {
                                            modifier3 = companion;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 339348610, "CC(remember):Text.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function1() { // from class: androidx.compose.material.TextKt$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit Text_fLXpl1I$lambda$3$lambda$2;
                                                        Text_fLXpl1I$lambda$3$lambda$2 = TextKt.Text_fLXpl1I$lambda$3$lambda$2((TextLayoutResult) obj);
                                                        return Text_fLXpl1I$lambda$3$lambda$2;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            function13 = (Function1) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            modifier3 = companion;
                                            function13 = function1;
                                        }
                                        if ((i5 & 32768) != 0) {
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            Function1 function15 = function13;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i26 &= -458753;
                                            modifier4 = modifier3;
                                            textAlign3 = textAlign4;
                                            z4 = z5;
                                            j11 = m9003getUnspecifiedXSAIIZE2;
                                            function14 = function15;
                                            textStyle3 = (TextStyle) consume;
                                        } else {
                                            modifier4 = modifier3;
                                            textAlign3 = textAlign4;
                                            z4 = z5;
                                            j11 = m9003getUnspecifiedXSAIIZE2;
                                            function14 = function13;
                                            textStyle3 = textStyle;
                                        }
                                        i30 = m8705getClipgIe3tQ8;
                                        long j15 = m9003getUnspecifiedXSAIIZE;
                                        i31 = i37;
                                        j12 = j5;
                                        FontFamily fontFamily5 = fontFamily2;
                                        textDecoration3 = textDecoration4;
                                        j13 = j6;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily5;
                                        j14 = j15;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-366126944, i19, i26, "androidx.compose.material.Text (Text.kt:189)");
                                    }
                                    int i38 = i26 << 3;
                                    composer2 = startRestartGroup;
                                    m2562Text4IGK_g(str, modifier4, j12, j13, fontStyle2, fontWeight4, fontFamily4, j14, textDecoration3, textAlign3, j11, i30, z4, i31, 1, (Function1<? super TextLayoutResult, Unit>) function14, textStyle3, composer2, i19 & 2147483646, (i26 & 14) | 24576 | (i26 & 112) | (i26 & 896) | (i26 & 7168) | (458752 & i38) | (i38 & 3670016), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier4;
                                    j7 = j12;
                                    j8 = j13;
                                    fontStyle3 = fontStyle2;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j14;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign3;
                                    j10 = j11;
                                    i28 = i30;
                                    z3 = z4;
                                    i29 = i31;
                                    function12 = function14;
                                    textStyle2 = textStyle3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    i28 = i;
                                    i29 = i2;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    j7 = j5;
                                    fontStyle3 = fontStyle2;
                                    j8 = j6;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j9 = j3;
                                    textDecoration2 = textDecoration;
                                    j10 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Text_fLXpl1I$lambda$4;
                                            Text_fLXpl1I$lambda$4 = TextKt.Text_fLXpl1I$lambda$4(str, modifier2, j7, j8, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, i28, z3, i29, function12, textStyle2, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                            return Text_fLXpl1I$lambda$4;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i25 = i5 & 8192;
                        if (i25 == 0) {
                        }
                        i27 = i5 & 16384;
                        if (i27 == 0) {
                        }
                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i5 & 512;
                    if (i17 != 0) {
                    }
                    i19 = i14;
                    i20 = i5 & 1024;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                    }
                    int i352 = i21;
                    i24 = i5 & 4096;
                    if (i24 != 0) {
                    }
                    z2 = z;
                    i25 = i5 & 8192;
                    if (i25 == 0) {
                    }
                    i27 = i5 & 16384;
                    if (i27 == 0) {
                    }
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i14 = i8;
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i5 & 512;
                if (i17 != 0) {
                }
                i19 = i14;
                i20 = i5 & 1024;
                if (i20 != 0) {
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                }
                int i3522 = i21;
                i24 = i5 & 4096;
                if (i24 != 0) {
                }
                z2 = z;
                i25 = i5 & 8192;
                if (i25 == 0) {
                }
                i27 = i5 & 16384;
                if (i27 == 0) {
                }
                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i5 & 32;
            int i342 = 65536;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i8;
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i5 & 512;
            if (i17 != 0) {
            }
            i19 = i14;
            i20 = i5 & 1024;
            if (i20 != 0) {
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
            }
            int i35222 = i21;
            i24 = i5 & 4096;
            if (i24 != 0) {
            }
            z2 = z;
            i25 = i5 & 8192;
            if (i25 == 0) {
            }
            i27 = i5 & 16384;
            if (i27 == 0) {
            }
            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i5 & 32;
        int i3422 = 65536;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i8;
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i5 & 512;
        if (i17 != 0) {
        }
        i19 = i14;
        i20 = i5 & 1024;
        if (i20 != 0) {
        }
        i22 = i5 & 2048;
        if (i22 != 0) {
        }
        int i352222 = i21;
        i24 = i5 & 4096;
        if (i24 != 0) {
        }
        z2 = z;
        i25 = i5 & 8192;
        if (i25 == 0) {
        }
        i27 = i5 & 16384;
        if (i27 == 0) {
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_IbK3jfQ$lambda$6$lambda$5(TextLayoutResult textLayoutResult) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0275  */
    /* renamed from: Text-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2563TextIbK3jfQ(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        long j5;
        int i9;
        long j6;
        int i10;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
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
        int i28;
        int i29;
        int i30;
        Composer composer2;
        final TextDecoration textDecoration2;
        final int i31;
        final boolean z2;
        final int i32;
        final int i33;
        final Map<String, InlineTextContent> map2;
        final Function1<? super TextLayoutResult, Unit> function12;
        final TextStyle textStyle2;
        final long j7;
        final Modifier modifier3;
        final long j8;
        final FontWeight fontWeight3;
        final long j9;
        final TextAlign textAlign2;
        final long j10;
        final FontFamily fontFamily3;
        final FontStyle fontStyle2;
        ScopeUpdateScope endRestartGroup;
        int m8705getClipgIe3tQ8;
        boolean z3;
        int i34;
        int i35;
        Map<String, InlineTextContent> emptyMap;
        FontStyle fontStyle3;
        Function1<? super TextLayoutResult, Unit> function13;
        TextAlign textAlign3;
        FontStyle fontStyle4;
        Function1<? super TextLayoutResult, Unit> function14;
        TextStyle textStyle3;
        FontFamily fontFamily4;
        TextDecoration textDecoration3;
        long j11;
        FontWeight fontWeight4;
        long j12;
        long j13;
        final long m6038copywmQWz5c$default;
        Composer startRestartGroup = composer.startRestartGroup(744129681);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,modifier,color:c#ui.graphics.Color,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,minLines,inlineContent,onTextLayout,style)306@15065L7,307@15119L7,317@15388L24,319@15458L73,341@16243L30,321@15537L743:Text.kt#jmzs0o");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i36 = i6 & 2;
        if (i36 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
                j5 = j;
            } else {
                j5 = j;
                if ((i4 & 384) == 0) {
                    i7 |= startRestartGroup.changed(j5) ? 256 : 128;
                }
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i4 & 3072) == 0) {
                    i7 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i7 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i7 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i4 & 1572864) == 0) {
                        i7 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i14 = i7 | (startRestartGroup.changed(j3) ? 8388608 : 4194304);
                    i15 = i6 & 256;
                    if (i15 == 0) {
                        i14 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i16 = i15;
                        i14 |= startRestartGroup.changed(textDecoration) ? 67108864 : 33554432;
                        i17 = i6 & 512;
                        if (i17 != 0) {
                            i14 |= 805306368;
                            i18 = i17;
                        } else if ((i4 & 805306368) == 0) {
                            i18 = i17;
                            i14 |= startRestartGroup.changed(textAlign) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        } else {
                            i18 = i17;
                        }
                        i19 = i14;
                        i20 = i6 & 1024;
                        if (i20 != 0) {
                            i21 = i20;
                            i22 = i5 | 6;
                        } else {
                            i21 = i20;
                            if ((i5 & 6) == 0) {
                                i22 = i5 | (startRestartGroup.changed(j4) ? 4 : 2);
                            } else {
                                i22 = i5;
                            }
                        }
                        i23 = i6 & 2048;
                        if (i23 != 0) {
                            i22 |= 48;
                        } else if ((i5 & 48) == 0) {
                            i22 |= startRestartGroup.changed(i) ? 32 : 16;
                            int i37 = i22;
                            i24 = i6 & 4096;
                            if (i24 == 0) {
                                i25 = i37 | 384;
                            } else {
                                int i38 = i37;
                                if ((i5 & 384) == 0) {
                                    i38 |= startRestartGroup.changed(z) ? 256 : 128;
                                }
                                i25 = i38;
                            }
                            i26 = i6 & 8192;
                            if (i26 == 0) {
                                i27 = i25 | 3072;
                            } else {
                                int i39 = i25;
                                if ((i5 & 3072) == 0) {
                                    i27 = i39 | (startRestartGroup.changed(i2) ? 2048 : 1024);
                                } else {
                                    i27 = i39;
                                }
                            }
                            i28 = i6 & 16384;
                            if (i28 == 0) {
                                i27 |= 24576;
                            } else if ((i5 & 24576) == 0) {
                                i27 |= startRestartGroup.changed(i3) ? 16384 : 8192;
                                i29 = i6 & 32768;
                                if (i29 != 0) {
                                    i27 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i27 |= startRestartGroup.changedInstance(map) ? 131072 : 65536;
                                }
                                i30 = i6 & 65536;
                                if (i30 != 0) {
                                    i27 |= 1572864;
                                } else if ((i5 & 1572864) == 0) {
                                    i27 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                                }
                                if ((i5 & 12582912) == 0) {
                                    i27 |= ((i6 & 131072) == 0 && startRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
                                }
                                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (4793491 & i27) != 4793490, i19 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "286@13810L2,287@13852L7");
                                    if ((i4 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i6 & 131072) != 0) {
                                            i27 &= -29360129;
                                        }
                                        fontStyle4 = fontStyle;
                                        j12 = j3;
                                        textDecoration3 = textDecoration;
                                        textAlign3 = textAlign;
                                        j13 = j4;
                                        m8705getClipgIe3tQ8 = i;
                                        z3 = z;
                                        i34 = i2;
                                        i35 = i3;
                                        emptyMap = map;
                                        function14 = function1;
                                        textStyle3 = textStyle;
                                        fontFamily4 = fontFamily2;
                                        j11 = j6;
                                        fontWeight4 = fontWeight2;
                                    } else {
                                        if (i36 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i8 != 0) {
                                            j5 = Color.INSTANCE.m6075getUnspecified0d7_KjU();
                                        }
                                        if (i9 != 0) {
                                            j6 = TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE();
                                        }
                                        FontStyle fontStyle5 = i10 != 0 ? null : fontStyle;
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long m9003getUnspecifiedXSAIIZE = i13 != 0 ? TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i16 != 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i18 == 0 ? textAlign : null;
                                        long m9003getUnspecifiedXSAIIZE2 = i21 != 0 ? TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE() : j4;
                                        m8705getClipgIe3tQ8 = i23 != 0 ? TextOverflow.INSTANCE.m8705getClipgIe3tQ8() : i;
                                        z3 = i24 != 0 ? true : z;
                                        i34 = i26 != 0 ? Integer.MAX_VALUE : i2;
                                        i35 = i28 != 0 ? 1 : i3;
                                        emptyMap = i29 != 0 ? MapsKt.emptyMap() : map;
                                        TextAlign textAlign5 = textAlign4;
                                        if (i30 != 0) {
                                            fontStyle3 = fontStyle5;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2144074643, "CC(remember):Text.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function1() { // from class: androidx.compose.material.TextKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit Text_IbK3jfQ$lambda$6$lambda$5;
                                                        Text_IbK3jfQ$lambda$6$lambda$5 = TextKt.Text_IbK3jfQ$lambda$6$lambda$5((TextLayoutResult) obj);
                                                        return Text_IbK3jfQ$lambda$6$lambda$5;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            function13 = (Function1) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            fontStyle3 = fontStyle5;
                                            function13 = function1;
                                        }
                                        if ((i6 & 131072) != 0) {
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            Function1<? super TextLayoutResult, Unit> function15 = function13;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i27 &= -29360129;
                                            fontStyle4 = fontStyle3;
                                            function14 = function15;
                                            textStyle3 = (TextStyle) consume;
                                            fontFamily4 = fontFamily2;
                                            textDecoration3 = textDecoration4;
                                            j11 = j6;
                                            fontWeight4 = fontWeight2;
                                            j12 = m9003getUnspecifiedXSAIIZE;
                                            j13 = m9003getUnspecifiedXSAIIZE2;
                                            textAlign3 = textAlign5;
                                        } else {
                                            Function1<? super TextLayoutResult, Unit> function16 = function13;
                                            textAlign3 = textAlign5;
                                            fontStyle4 = fontStyle3;
                                            function14 = function16;
                                            textStyle3 = textStyle;
                                            fontFamily4 = fontFamily2;
                                            textDecoration3 = textDecoration4;
                                            j11 = j6;
                                            fontWeight4 = fontWeight2;
                                            j12 = m9003getUnspecifiedXSAIIZE;
                                            j13 = m9003getUnspecifiedXSAIIZE2;
                                        }
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(744129681, i19, i27, "androidx.compose.material.Text (Text.kt:288)");
                                    }
                                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    long m6049unboximpl = ((Color) consume2).m6049unboximpl();
                                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume3 = startRestartGroup.consume(localContentAlpha);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    float floatValue = ((Number) consume3).floatValue();
                                    if (j5 != 16) {
                                        m6038copywmQWz5c$default = j5;
                                    } else if (textStyle3.m8262getColor0d7_KjU() != 16) {
                                        m6038copywmQWz5c$default = textStyle3.m8262getColor0d7_KjU();
                                    } else {
                                        m6038copywmQWz5c$default = Color.m6038copywmQWz5c$default(m6049unboximpl, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    TextLinkStyles rememberTextLinkStyles = rememberTextLinkStyles(startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2144127450, "CC(remember):Text.kt#9igjgp");
                                    boolean changed = ((i19 & 14) == 4) | startRestartGroup.changed(rememberTextLinkStyles);
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = createTextWithLinkStyles(annotatedString, rememberTextLinkStyles);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    AnnotatedString annotatedString2 = (AnnotatedString) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    TextStyle m8252mergedA7vx0o$default = TextStyle.m8252mergedA7vx0o$default(textStyle3, 0L, j11, fontWeight4, fontStyle4, null, fontFamily4, null, j12, null, null, null, 0L, textDecoration3, null, null, textAlign3 != null ? textAlign3.getValue() : TextAlign.INSTANCE.m8660getUnspecifiede0LSkKk(), 0, j13, null, null, 0, 0, null, null, 16609105, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2144152527, "CC(remember):Text.kt#9igjgp");
                                    boolean changed2 = startRestartGroup.changed(m6038copywmQWz5c$default);
                                    ColorProducer rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new ColorProducer() { // from class: androidx.compose.material.TextKt$Text$6$1
                                            @Override // androidx.compose.ui.graphics.ColorProducer
                                            /* renamed from: invoke-0d7_KjU */
                                            public final long mo2305invoke0d7_KjU() {
                                                return m6038copywmQWz5c$default;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i40 = (i19 & 112) | ((i27 >> 9) & 7168);
                                    int i41 = i27 << 9;
                                    BasicTextKt.m1555BasicTextCL7eQgs(annotatedString2, modifier2, m8252mergedA7vx0o$default, function14, m8705getClipgIe3tQ8, z3, i34, i35, emptyMap, (ColorProducer) rememberedValue3, null, startRestartGroup, i40 | (57344 & i41) | (458752 & i41) | (3670016 & i41) | (29360128 & i41) | (i41 & 234881024), 0, 1024);
                                    composer2 = startRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    textAlign2 = textAlign3;
                                    function12 = function14;
                                    i33 = i35;
                                    j7 = j5;
                                    modifier3 = modifier2;
                                    map2 = emptyMap;
                                    textStyle2 = textStyle3;
                                    j8 = j11;
                                    fontWeight3 = fontWeight4;
                                    fontStyle2 = fontStyle4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j12;
                                    j10 = j13;
                                    i32 = i34;
                                    z2 = z3;
                                    i31 = m8705getClipgIe3tQ8;
                                    textDecoration2 = textDecoration3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    textDecoration2 = textDecoration;
                                    i31 = i;
                                    z2 = z;
                                    i32 = i2;
                                    i33 = i3;
                                    map2 = map;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    j7 = j5;
                                    modifier3 = modifier2;
                                    j8 = j6;
                                    fontWeight3 = fontWeight2;
                                    j9 = j3;
                                    textAlign2 = textAlign;
                                    j10 = j4;
                                    fontFamily3 = fontFamily2;
                                    fontStyle2 = fontStyle;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Text_IbK3jfQ$lambda$9;
                                            Text_IbK3jfQ$lambda$9 = TextKt.Text_IbK3jfQ$lambda$9(AnnotatedString.this, modifier3, j7, j8, fontStyle2, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, i31, z2, i32, i33, map2, function12, textStyle2, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                            return Text_IbK3jfQ$lambda$9;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i29 = i6 & 32768;
                            if (i29 != 0) {
                            }
                            i30 = i6 & 65536;
                            if (i30 != 0) {
                            }
                            if ((i5 & 12582912) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (4793491 & i27) != 4793490, i19 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        int i372 = i22;
                        i24 = i6 & 4096;
                        if (i24 == 0) {
                        }
                        i26 = i6 & 8192;
                        if (i26 == 0) {
                        }
                        i28 = i6 & 16384;
                        if (i28 == 0) {
                        }
                        i29 = i6 & 32768;
                        if (i29 != 0) {
                        }
                        i30 = i6 & 65536;
                        if (i30 != 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (4793491 & i27) != 4793490, i19 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i6 & 512;
                    if (i17 != 0) {
                    }
                    i19 = i14;
                    i20 = i6 & 1024;
                    if (i20 != 0) {
                    }
                    i23 = i6 & 2048;
                    if (i23 != 0) {
                    }
                    int i3722 = i22;
                    i24 = i6 & 4096;
                    if (i24 == 0) {
                    }
                    i26 = i6 & 8192;
                    if (i26 == 0) {
                    }
                    i28 = i6 & 16384;
                    if (i28 == 0) {
                    }
                    i29 = i6 & 32768;
                    if (i29 != 0) {
                    }
                    i30 = i6 & 65536;
                    if (i30 != 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (4793491 & i27) != 4793490, i19 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i14 = i7;
                i15 = i6 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i6 & 512;
                if (i17 != 0) {
                }
                i19 = i14;
                i20 = i6 & 1024;
                if (i20 != 0) {
                }
                i23 = i6 & 2048;
                if (i23 != 0) {
                }
                int i37222 = i22;
                i24 = i6 & 4096;
                if (i24 == 0) {
                }
                i26 = i6 & 8192;
                if (i26 == 0) {
                }
                i28 = i6 & 16384;
                if (i28 == 0) {
                }
                i29 = i6 & 32768;
                if (i29 != 0) {
                }
                i30 = i6 & 65536;
                if (i30 != 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (4793491 & i27) != 4793490, i19 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i7;
            i15 = i6 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i6 & 512;
            if (i17 != 0) {
            }
            i19 = i14;
            i20 = i6 & 1024;
            if (i20 != 0) {
            }
            i23 = i6 & 2048;
            if (i23 != 0) {
            }
            int i372222 = i22;
            i24 = i6 & 4096;
            if (i24 == 0) {
            }
            i26 = i6 & 8192;
            if (i26 == 0) {
            }
            i28 = i6 & 16384;
            if (i28 == 0) {
            }
            i29 = i6 & 32768;
            if (i29 != 0) {
            }
            i30 = i6 & 65536;
            if (i30 != 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (4793491 & i27) != 4793490, i19 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i7;
        i15 = i6 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i6 & 512;
        if (i17 != 0) {
        }
        i19 = i14;
        i20 = i6 & 1024;
        if (i20 != 0) {
        }
        i23 = i6 & 2048;
        if (i23 != 0) {
        }
        int i3722222 = i22;
        i24 = i6 & 4096;
        if (i24 == 0) {
        }
        i26 = i6 & 8192;
        if (i26 == 0) {
        }
        i28 = i6 & 16384;
        if (i28 == 0) {
        }
        i29 = i6 & 32768;
        if (i29 != 0) {
        }
        i30 = i6 & 65536;
        if (i30 != 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (4793491 & i27) != 4793490, i19 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text__4IGK_g$lambda$11$lambda$10(TextLayoutResult textLayoutResult) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2561Text4IGK_g(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long j5;
        int i8;
        int i9;
        long j6;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
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
        boolean z2;
        int i25;
        int i26;
        int i27;
        int i28;
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int i29;
        final int i30;
        final Map map2;
        final Function1 function12;
        final TextStyle textStyle2;
        final boolean z3;
        final long j7;
        final FontStyle fontStyle3;
        final long j8;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j9;
        final TextDecoration textDecoration2;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        TextAlign textAlign3;
        Function1 function13;
        Function1 function14;
        TextAlign textAlign4;
        TextStyle textStyle3;
        int i31;
        long j11;
        Function1 function15;
        Map map3;
        Modifier modifier3;
        int i32;
        long j12;
        TextDecoration textDecoration3;
        long j13;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long j14;
        Composer startRestartGroup = composer.startRestartGroup(-422393234);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,modifier,color:c#ui.graphics.Color,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,inlineContent,onTextLayout,style)369@17148L346:Text.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i33 = i5 & 2;
        if (i33 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i8 = i6 | 384;
                j5 = j;
            } else {
                int i34 = i6;
                j5 = j;
                if ((i3 & 384) == 0) {
                    i34 |= startRestartGroup.changed(j5) ? 256 : 128;
                }
                i8 = i34;
            }
            i9 = i5 & 8;
            if (i9 == 0) {
                i8 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i3 & 3072) == 0) {
                    i8 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i8 |= 24576;
            } else if ((i3 & 24576) == 0) {
                fontStyle2 = fontStyle;
                i8 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                i11 = i5 & 32;
                if (i11 != 0) {
                    i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i8 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                    i8 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 1572864) == 0) {
                        i8 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                    i8 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i14 = i8 | (startRestartGroup.changed(j3) ? 8388608 : 4194304);
                    i15 = i5 & 256;
                    if (i15 == 0) {
                        i14 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i16 = i15;
                        i14 |= startRestartGroup.changed(textDecoration) ? 67108864 : 33554432;
                        i17 = i5 & 512;
                        if (i17 != 0) {
                            i14 |= 805306368;
                            i18 = i17;
                        } else if ((i3 & 805306368) == 0) {
                            i18 = i17;
                            i14 |= startRestartGroup.changed(textAlign) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        } else {
                            i18 = i17;
                        }
                        i19 = i14;
                        i20 = i5 & 1024;
                        if (i20 != 0) {
                            i21 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i21 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i21 = i4;
                        }
                        i22 = i5 & 2048;
                        if (i22 != 0) {
                            i21 |= 48;
                            i23 = i22;
                        } else if ((i4 & 48) == 0) {
                            i23 = i22;
                            i21 |= startRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i23 = i22;
                        }
                        int i35 = i21;
                        i24 = i5 & 4096;
                        if (i24 != 0) {
                            i35 |= 384;
                        } else if ((i4 & 384) == 0) {
                            z2 = z;
                            i35 |= startRestartGroup.changed(z2) ? 256 : 128;
                            i25 = i5 & 8192;
                            if (i25 == 0) {
                                i26 = i35 | 3072;
                            } else {
                                int i36 = i35;
                                if ((i4 & 3072) == 0) {
                                    i26 = i36 | (startRestartGroup.changed(i2) ? 2048 : 1024);
                                } else {
                                    i26 = i36;
                                }
                            }
                            i27 = i5 & 16384;
                            if (i27 == 0) {
                                i26 |= 24576;
                            } else if ((i4 & 24576) == 0) {
                                i26 |= startRestartGroup.changedInstance(map) ? 16384 : 8192;
                                i28 = i5 & 32768;
                                if (i28 != 0) {
                                    i26 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i26 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                                }
                                if ((i4 & 1572864) == 0) {
                                    i26 |= ((i5 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                                }
                                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "366@17089L2,367@17131L7");
                                    if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 65536) != 0) {
                                            i26 &= -3670017;
                                        }
                                        modifier3 = modifier;
                                        textAlign4 = textAlign;
                                        j11 = j4;
                                        i31 = i;
                                        i32 = i2;
                                        map3 = map;
                                        function15 = function1;
                                        textStyle3 = textStyle;
                                        z4 = z2;
                                        j12 = j5;
                                        j13 = j6;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j14 = j3;
                                        textDecoration3 = textDecoration;
                                    } else {
                                        Modifier.Companion companion = i33 != 0 ? Modifier.INSTANCE : modifier;
                                        if (i7 != 0) {
                                            j5 = Color.INSTANCE.m6075getUnspecified0d7_KjU();
                                        }
                                        if (i9 != 0) {
                                            j6 = TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE();
                                        }
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long m9003getUnspecifiedXSAIIZE = i13 != 0 ? TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i16 != 0 ? null : textDecoration;
                                        TextAlign textAlign5 = i18 == 0 ? textAlign : null;
                                        long m9003getUnspecifiedXSAIIZE2 = i20 != 0 ? TextUnit.INSTANCE.m9003getUnspecifiedXSAIIZE() : j4;
                                        int m8705getClipgIe3tQ8 = i23 != 0 ? TextOverflow.INSTANCE.m8705getClipgIe3tQ8() : i;
                                        z4 = i24 == 0 ? z2 : true;
                                        int i37 = i25 != 0 ? Integer.MAX_VALUE : i2;
                                        Map emptyMap = i27 != 0 ? MapsKt.emptyMap() : map;
                                        Modifier modifier4 = companion;
                                        if (i28 != 0) {
                                            textAlign3 = textAlign5;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2102021008, "CC(remember):Text.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function1() { // from class: androidx.compose.material.TextKt$$ExternalSyntheticLambda6
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit Text__4IGK_g$lambda$11$lambda$10;
                                                        Text__4IGK_g$lambda$11$lambda$10 = TextKt.Text__4IGK_g$lambda$11$lambda$10((TextLayoutResult) obj);
                                                        return Text__4IGK_g$lambda$11$lambda$10;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            function13 = (Function1) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            textAlign3 = textAlign5;
                                            function13 = function1;
                                        }
                                        if ((i5 & 65536) != 0) {
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            function14 = function13;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i26 &= -3670017;
                                            textAlign4 = textAlign3;
                                            textStyle3 = (TextStyle) consume;
                                        } else {
                                            function14 = function13;
                                            textAlign4 = textAlign3;
                                            textStyle3 = textStyle;
                                        }
                                        i31 = m8705getClipgIe3tQ8;
                                        j11 = m9003getUnspecifiedXSAIIZE2;
                                        function15 = function14;
                                        map3 = emptyMap;
                                        modifier3 = modifier4;
                                        long j15 = m9003getUnspecifiedXSAIIZE;
                                        i32 = i37;
                                        j12 = j5;
                                        FontFamily fontFamily5 = fontFamily2;
                                        textDecoration3 = textDecoration4;
                                        j13 = j6;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily5;
                                        j14 = j15;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-422393234, i19, i26, "androidx.compose.material.Text (Text.kt:368)");
                                    }
                                    int i38 = i26 << 3;
                                    composer2 = startRestartGroup;
                                    m2563TextIbK3jfQ(annotatedString, modifier3, j12, j13, fontStyle2, fontWeight4, fontFamily4, j14, textDecoration3, textAlign4, j11, i31, z4, i32, 1, map3, function15, textStyle3, composer2, i19 & 2147483646, (i26 & 14) | 24576 | (i26 & 112) | (i26 & 896) | (i26 & 7168) | (458752 & i38) | (3670016 & i38) | (i38 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                    j7 = j12;
                                    j8 = j13;
                                    fontStyle3 = fontStyle2;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j14;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign4;
                                    j10 = j11;
                                    i29 = i31;
                                    z3 = z4;
                                    i30 = i32;
                                    map2 = map3;
                                    function12 = function15;
                                    textStyle2 = textStyle3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    i29 = i;
                                    i30 = i2;
                                    map2 = map;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    j7 = j5;
                                    fontStyle3 = fontStyle2;
                                    j8 = j6;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j9 = j3;
                                    textDecoration2 = textDecoration;
                                    j10 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Text__4IGK_g$lambda$12;
                                            Text__4IGK_g$lambda$12 = TextKt.Text__4IGK_g$lambda$12(AnnotatedString.this, modifier2, j7, j8, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, i29, z3, i30, map2, function12, textStyle2, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                            return Text__4IGK_g$lambda$12;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i28 = i5 & 32768;
                            if (i28 != 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i25 = i5 & 8192;
                        if (i25 == 0) {
                        }
                        i27 = i5 & 16384;
                        if (i27 == 0) {
                        }
                        i28 = i5 & 32768;
                        if (i28 != 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i5 & 512;
                    if (i17 != 0) {
                    }
                    i19 = i14;
                    i20 = i5 & 1024;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                    }
                    int i352 = i21;
                    i24 = i5 & 4096;
                    if (i24 != 0) {
                    }
                    z2 = z;
                    i25 = i5 & 8192;
                    if (i25 == 0) {
                    }
                    i27 = i5 & 16384;
                    if (i27 == 0) {
                    }
                    i28 = i5 & 32768;
                    if (i28 != 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i14 = i8;
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i5 & 512;
                if (i17 != 0) {
                }
                i19 = i14;
                i20 = i5 & 1024;
                if (i20 != 0) {
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                }
                int i3522 = i21;
                i24 = i5 & 4096;
                if (i24 != 0) {
                }
                z2 = z;
                i25 = i5 & 8192;
                if (i25 == 0) {
                }
                i27 = i5 & 16384;
                if (i27 == 0) {
                }
                i28 = i5 & 32768;
                if (i28 != 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i8;
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i5 & 512;
            if (i17 != 0) {
            }
            i19 = i14;
            i20 = i5 & 1024;
            if (i20 != 0) {
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
            }
            int i35222 = i21;
            i24 = i5 & 4096;
            if (i24 != 0) {
            }
            z2 = z;
            i25 = i5 & 8192;
            if (i25 == 0) {
            }
            i27 = i5 & 16384;
            if (i27 == 0) {
            }
            i28 = i5 & 32768;
            if (i28 != 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i8;
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i5 & 512;
        if (i17 != 0) {
        }
        i19 = i14;
        i20 = i5 & 1024;
        if (i20 != 0) {
        }
        i22 = i5 & 2048;
        if (i22 != 0) {
        }
        int i352222 = i21;
        i24 = i5 & 4096;
        if (i24 != 0) {
        }
        z2 = z;
        i25 = i5 & 8192;
        if (i25 == 0) {
        }
        i27 = i5 & 16384;
        if (i27 == 0) {
        }
        i28 = i5 & 32768;
        if (i28 != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-13499697);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyle)N(value,content)410@18449L7,411@18474L80:Text.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-13499697, i2, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:409)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) consume).merge(textStyle)), function2, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ProvideTextStyle$lambda$14;
                    ProvideTextStyle$lambda$14 = TextKt.ProvideTextStyle$lambda$14(TextStyle.this, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ProvideTextStyle$lambda$14;
                }
            });
        }
    }

    private static final AnnotatedString createTextWithLinkStyles(AnnotatedString annotatedString, final TextLinkStyles textLinkStyles) {
        return annotatedString.mapAnnotations(new Function1() { // from class: androidx.compose.material.TextKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AnnotatedString.Range createTextWithLinkStyles$lambda$15;
                createTextWithLinkStyles$lambda$15 = TextKt.createTextWithLinkStyles$lambda$15(TextLinkStyles.this, (AnnotatedString.Range) obj);
                return createTextWithLinkStyles$lambda$15;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString.Range createTextWithLinkStyles$lambda$15(TextLinkStyles textLinkStyles, AnnotatedString.Range range) {
        AnnotatedString.Annotation annotation = (AnnotatedString.Annotation) range.getItem();
        if (annotation instanceof LinkAnnotation.Url) {
            LinkAnnotation.Url url = (LinkAnnotation.Url) annotation;
            if (url.getStyles() == null) {
                Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Url>");
                return AnnotatedString.Range.copy$default(range, LinkAnnotation.Url.copy$default(url, null, textLinkStyles, null, 5, null), 0, 0, null, 14, null);
            }
        }
        if (annotation instanceof LinkAnnotation.Clickable) {
            LinkAnnotation.Clickable clickable = (LinkAnnotation.Clickable) annotation;
            if (clickable.getStyles() == null) {
                Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Clickable>");
                return AnnotatedString.Range.copy$default(range, LinkAnnotation.Clickable.copy$default(clickable, null, textLinkStyles, null, 5, null), 0, 0, null, 14, null);
            }
        }
        return range;
    }

    private static final TextLinkStyles rememberTextLinkStyles(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 853203714, "C(rememberTextLinkStyles)432@19253L6,433@19279L159:Text.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(853203714, i, -1, "androidx.compose.material.rememberTextLinkStyles (Text.kt:431)");
        }
        long m2273getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composer, 6).m2273getPrimary0d7_KjU();
        ComposerKt.sourceInformationMarkerStart(composer, -409980063, "CC(remember):Text.kt#9igjgp");
        boolean changed = composer.changed(m2273getPrimary0d7_KjU);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(m2273getPrimary0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null), null, null, null, 14, null);
            composer.updateRememberedValue(textLinkStyles);
            rememberedValue = textLinkStyles;
        }
        TextLinkStyles textLinkStyles2 = (TextLinkStyles) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textLinkStyles2;
    }
}
