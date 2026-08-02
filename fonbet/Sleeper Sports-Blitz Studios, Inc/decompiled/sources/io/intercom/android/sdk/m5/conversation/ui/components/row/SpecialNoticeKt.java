package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.core.text.HtmlCompat;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpecialNotice.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"SpecialNotice", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SpecialNoticePreview", "(Landroidx/compose/runtime/Composer;I)V", "SpecialNoticeShortTextPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SpecialNoticeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpecialNotice$lambda$1(String text, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(text, "$text");
        SpecialNotice(text, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpecialNoticePreview$lambda$2(int i, Composer composer, int i2) {
        SpecialNoticePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpecialNoticeShortTextPreview$lambda$3(int i, Composer composer, int i2) {
        SpecialNoticeShortTextPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SpecialNotice(final String text, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier.Companion companion;
        int hashCode;
        Composer m5333constructorimpl;
        AnnotatedString annotatedString;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1272749637);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 91) == 18 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                RoundedCornerShape m1522RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(20));
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Vertical top = Alignment.INSTANCE.getTop();
                RoundedCornerShape roundedCornerShape = m1522RoundedCornerShape0680j_4;
                float f = 16;
                Modifier m1158paddingVpY3zN4 = PaddingKt.m1158paddingVpY3zN4(BorderKt.m594borderxT4_qwU(BackgroundKt.m581backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13121getSpecialNoticeBackground0d7_KjU(), roundedCornerShape), Dp.m8798constructorimpl(1), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13122getSpecialNoticeBorder0d7_KjU(), roundedCornerShape), Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, top, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1158paddingVpY3zN4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_info_filled, startRestartGroup, 0), (String) null, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13090getActionContrastWhite0d7_KjU(), startRestartGroup, 440, 0);
                SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
                Modifier align = rowScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically());
                Spanned fromHtml = HtmlCompat.fromHtml(text, 0);
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                annotatedString = BlockExtensionsKt.toAnnotatedString(fromHtml, (Context) consume, (r27 & 2) != 0 ? new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null) : null);
                composer2 = startRestartGroup;
                TextKt.m3902TextZ58ophY(annotatedString, align, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), composer2, 0, 0, 262140);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SpecialNotice$lambda$1;
                        SpecialNotice$lambda$1 = SpecialNoticeKt.SpecialNotice$lambda$1(text, companion, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SpecialNotice$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 91) == 18) {
        }
        if (i4 == 0) {
        }
        RoundedCornerShape m1522RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(20));
        Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
        Alignment.Vertical top2 = Alignment.INSTANCE.getTop();
        RoundedCornerShape roundedCornerShape2 = m1522RoundedCornerShape0680j_42;
        float f2 = 16;
        Modifier m1158paddingVpY3zN42 = PaddingKt.m1158paddingVpY3zN4(BorderKt.m594borderxT4_qwU(BackgroundKt.m581backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13121getSpecialNoticeBackground0d7_KjU(), roundedCornerShape2), Dp.m8798constructorimpl(1), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13122getSpecialNoticeBorder0d7_KjU(), roundedCornerShape2), Dp.m8798constructorimpl(f2), Dp.m8798constructorimpl(12));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, top2, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1158paddingVpY3zN42);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_info_filled, startRestartGroup, 0), (String) null, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13090getActionContrastWhite0d7_KjU(), startRestartGroup, 440, 0);
        SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
        Modifier align2 = rowScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically());
        Spanned fromHtml2 = HtmlCompat.fromHtml(text, 0);
        Intrinsics.checkNotNullExpressionValue(fromHtml2, "fromHtml(...)");
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        annotatedString = BlockExtensionsKt.toAnnotatedString(fromHtml2, (Context) consume2, (r27 & 2) != 0 ? new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null) : null);
        composer2 = startRestartGroup;
        TextKt.m3902TextZ58ophY(annotatedString, align2, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), composer2, 0, 0, 262140);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @IntercomPreviews
    public static final void SpecialNoticePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1291680485);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SpecialNoticeKt.INSTANCE.m12360getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SpecialNoticePreview$lambda$2;
                    SpecialNoticePreview$lambda$2 = SpecialNoticeKt.SpecialNoticePreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SpecialNoticePreview$lambda$2;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void SpecialNoticeShortTextPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(841465410);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SpecialNoticeKt.INSTANCE.m12362getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SpecialNoticeShortTextPreview$lambda$3;
                    SpecialNoticeShortTextPreview$lambda$3 = SpecialNoticeKt.SpecialNoticeShortTextPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SpecialNoticeShortTextPreview$lambda$3;
                }
            });
        }
    }
}
