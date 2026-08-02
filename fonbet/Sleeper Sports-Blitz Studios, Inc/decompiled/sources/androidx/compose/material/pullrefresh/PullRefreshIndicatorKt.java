package androidx.compose.material.pullrefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.internal.ViewUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PullRefreshIndicator.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a;\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u000e\u0010 \u001a\u00020!X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%\"\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010(\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%\"\u0010\u0010)\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%\"\u0010\u0010*\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%\"\u0010\u0010+\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%\"\u0010\u0010,\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%\"\u000e\u0010-\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001500X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061²\u0006\n\u00102\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u00020\u0015X\u008a\u0084\u0002"}, d2 = {"PullRefreshIndicator", "", "refreshing", "", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "scale", "PullRefreshIndicator-jB83MbM", "(ZLandroidx/compose/material/pullrefresh/PullRefreshState;Landroidx/compose/ui/Modifier;JJZLandroidx/compose/runtime/Composer;II)V", "CircularArrowIndicator", "color", "CircularArrowIndicator-iJQMabo", "(Landroidx/compose/material/pullrefresh/PullRefreshState;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "ArrowValues", "Landroidx/compose/material/pullrefresh/ArrowValues;", "progress", "", "drawArrow", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "arrow", "Landroidx/compose/ui/graphics/Path;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "alpha", "values", "drawArrow-Bx497Mc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material/pullrefresh/ArrowValues;)V", "CrossfadeDurationMs", "", "MaxProgressArc", "IndicatorSize", "Landroidx/compose/ui/unit/Dp;", "F", "SpinnerShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "ArcRadius", "StrokeWidth", "ArrowWidth", "ArrowHeight", "Elevation", "MinAlpha", "MaxAlpha", "AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "material", "showElevation", "targetAlpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullRefreshIndicatorKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float IndicatorSize = Dp.m8798constructorimpl(40);
    private static final RoundedCornerShape SpinnerShape = RoundedCornerShapeKt.getCircleShape();
    private static final float ArcRadius = Dp.m8798constructorimpl((float) 7.5d);
    private static final float StrokeWidth = Dp.m8798constructorimpl((float) 2.5d);
    private static final float ArrowWidth = Dp.m8798constructorimpl(10);
    private static final float ArrowHeight = Dp.m8798constructorimpl(5);
    private static final float Elevation = Dp.m8798constructorimpl(6);
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularArrowIndicator_iJQMabo$lambda$15(PullRefreshState pullRefreshState, long j, Modifier modifier, int i, Composer composer, int i2) {
        m2577CircularArrowIndicatoriJQMabo(pullRefreshState, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PullRefreshIndicator_jB83MbM$lambda$4(boolean z, PullRefreshState pullRefreshState, Modifier modifier, long j, long j2, boolean z2, int i, int i2, Composer composer, int i3) {
        m2578PullRefreshIndicatorjB83MbM(z, pullRefreshState, modifier, j, j2, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0141  */
    /* renamed from: PullRefreshIndicator-jB83MbM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2578PullRefreshIndicatorjB83MbM(final boolean z, final PullRefreshState pullRefreshState, Modifier modifier, long j, long j2, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        int i4;
        boolean z3;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i5;
        final long j7;
        boolean z5;
        boolean changed;
        Object rememberedValue;
        ElevationOverlay elevationOverlay;
        long j8;
        Color m6029boximpl;
        int currentCompositeKeyHash;
        Composer m5333constructorimpl;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(308716636);
        ComposerKt.sourceInformation(startRestartGroup, "C(PullRefreshIndicator)N(refreshing,state,modifier,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,scale)83@3565L86,88@3936L7,92@4064L1050:PullRefreshIndicator.kt#t44y28");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(pullRefreshState) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    j4 = j2;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                j4 = j2;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "78@3424L6,79@3466L32");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2277getSurface0d7_KjU();
                        }
                        if ((i2 & 16) != 0) {
                            long m2291contentColorForek8zF_U = ColorsKt.m2291contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                            i3 &= -57345;
                            j4 = m2291contentColorForek8zF_U;
                        }
                        if (i4 != 0) {
                            long j9 = j4;
                            i5 = i3;
                            j7 = j9;
                            z5 = false;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(308716636, i5, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 323960178, "CC(remember):PullRefreshIndicator.kt#9igjgp");
                            int i9 = i5 & 14;
                            changed = (i9 != 4) | startRestartGroup.changed(pullRefreshState);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        boolean PullRefreshIndicator_jB83MbM$lambda$1$lambda$0;
                                        PullRefreshIndicator_jB83MbM$lambda$1$lambda$0 = PullRefreshIndicatorKt.PullRefreshIndicator_jB83MbM$lambda$1$lambda$0(z, pullRefreshState);
                                        return Boolean.valueOf(PullRefreshIndicator_jB83MbM$lambda$1$lambda$0);
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            State state = (State) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localElevationOverlay);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            elevationOverlay = (ElevationOverlay) consume;
                            if (elevationOverlay != null) {
                                startRestartGroup.startReplaceGroup(1453247536);
                                startRestartGroup.endReplaceGroup();
                                j8 = j3;
                                m6029boximpl = null;
                            } else {
                                startRestartGroup.startReplaceGroup(323973617);
                                ComposerKt.sourceInformation(startRestartGroup, "90@3986L53");
                                long j10 = j3;
                                long mo2304apply7g2Lkgo = elevationOverlay.mo2304apply7g2Lkgo(j10, Elevation, startRestartGroup, ((i5 >> 9) & 14) | 48);
                                j8 = j10;
                                startRestartGroup.endReplaceGroup();
                                m6029boximpl = Color.m6029boximpl(mo2304apply7g2Lkgo);
                            }
                            long m6049unboximpl = m6029boximpl == null ? m6029boximpl.m6049unboximpl() : j8;
                            Modifier pullRefreshIndicatorTransform = PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform(SizeKt.m1209size3ABfNKs(modifier2, IndicatorSize), pullRefreshState, z5);
                            float m8798constructorimpl = !PullRefreshIndicator_jB83MbM$lambda$2(state) ? Elevation : Dp.m8798constructorimpl(0);
                            RoundedCornerShape roundedCornerShape = SpinnerShape;
                            Modifier m581backgroundbw27NRU = BackgroundKt.m581backgroundbw27NRU(ShadowKt.m5618shadows4CzXII$default(pullRefreshIndicatorTransform, m8798constructorimpl, roundedCornerShape, true, 0L, 0L, 24, null), m6049unboximpl, roundedCornerShape);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m581backgroundbw27NRU);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1424656180, "C103@4511L597,100@4379L729:PullRefreshIndicator.kt#t44y28");
                            CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, AnimationSpecKt.tween$default(100, 0, null, 6, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1853731063, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                                    invoke(bool.booleanValue(), composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z6, Composer composer2, int i10) {
                                    int i11;
                                    float f;
                                    float f2;
                                    float f3;
                                    ComposerKt.sourceInformation(composer2, "CN(refreshing)104@4539L559:PullRefreshIndicator.kt#t44y28");
                                    if ((i10 & 6) == 0) {
                                        i11 = (composer2.changed(z6) ? 4 : 2) | i10;
                                    } else {
                                        i11 = i10;
                                    }
                                    if (!composer2.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1853731063, i11, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:104)");
                                    }
                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    long j11 = j7;
                                    PullRefreshState pullRefreshState2 = pullRefreshState;
                                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer2);
                                    Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m5333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1916688881, "C:PullRefreshIndicator.kt#t44y28");
                                    f = PullRefreshIndicatorKt.ArcRadius;
                                    f2 = PullRefreshIndicatorKt.StrokeWidth;
                                    float m8798constructorimpl2 = Dp.m8798constructorimpl(Dp.m8798constructorimpl(f + f2) * 2);
                                    if (z6) {
                                        composer2.startReplaceGroup(-1916609863);
                                        ComposerKt.sourceInformation(composer2, "108@4741L208");
                                        f3 = PullRefreshIndicatorKt.StrokeWidth;
                                        ProgressIndicatorKt.m2422CircularProgressIndicatorLxG7B9w(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl2), j11, f3, 0L, 0, composer2, 390, 24);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(-1916362142);
                                        ComposerKt.sourceInformation(composer2, "114@4995L71");
                                        PullRefreshIndicatorKt.m2577CircularArrowIndicatoriJQMabo(pullRefreshState2, j11, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl2), composer2, 384);
                                        composer2.endReplaceGroup();
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, i9 | 24960, 10);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            long j11 = j7;
                            modifier3 = modifier2;
                            j6 = j11;
                            z4 = z5;
                            j5 = j8;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    }
                    long j12 = j4;
                    i5 = i3;
                    j7 = j12;
                    z5 = z3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 323960178, "CC(remember):PullRefreshIndicator.kt#9igjgp");
                    int i92 = i5 & 14;
                    changed = (i92 != 4) | startRestartGroup.changed(pullRefreshState);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean PullRefreshIndicator_jB83MbM$lambda$1$lambda$0;
                            PullRefreshIndicator_jB83MbM$lambda$1$lambda$0 = PullRefreshIndicatorKt.PullRefreshIndicator_jB83MbM$lambda$1$lambda$0(z, pullRefreshState);
                            return Boolean.valueOf(PullRefreshIndicator_jB83MbM$lambda$1$lambda$0);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    State state2 = (State) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay2 = ElevationOverlayKt.getLocalElevationOverlay();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localElevationOverlay2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    elevationOverlay = (ElevationOverlay) consume2;
                    if (elevationOverlay != null) {
                    }
                    if (m6029boximpl == null) {
                    }
                    Modifier pullRefreshIndicatorTransform2 = PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform(SizeKt.m1209size3ABfNKs(modifier2, IndicatorSize), pullRefreshState, z5);
                    float m8798constructorimpl2 = !PullRefreshIndicator_jB83MbM$lambda$2(state2) ? Elevation : Dp.m8798constructorimpl(0);
                    RoundedCornerShape roundedCornerShape2 = SpinnerShape;
                    Modifier m581backgroundbw27NRU2 = BackgroundKt.m581backgroundbw27NRU(ShadowKt.m5618shadows4CzXII$default(pullRefreshIndicatorTransform2, m8798constructorimpl2, roundedCornerShape2, true, 0L, 0L, 24, null), m6049unboximpl, roundedCornerShape2);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m581backgroundbw27NRU2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                    Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5333constructorimpl.getInserting()) {
                    }
                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1424656180, "C103@4511L597,100@4379L729:PullRefreshIndicator.kt#t44y28");
                    CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, AnimationSpecKt.tween$default(100, 0, null, 6, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1853731063, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                            invoke(bool.booleanValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z6, Composer composer2, int i10) {
                            int i11;
                            float f;
                            float f2;
                            float f3;
                            ComposerKt.sourceInformation(composer2, "CN(refreshing)104@4539L559:PullRefreshIndicator.kt#t44y28");
                            if ((i10 & 6) == 0) {
                                i11 = (composer2.changed(z6) ? 4 : 2) | i10;
                            } else {
                                i11 = i10;
                            }
                            if (!composer2.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1853731063, i11, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:104)");
                            }
                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            long j112 = j7;
                            PullRefreshState pullRefreshState2 = pullRefreshState;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor22);
                            } else {
                                composer2.useNode();
                            }
                            Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer2);
                            Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m5333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                            }
                            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, -1916688881, "C:PullRefreshIndicator.kt#t44y28");
                            f = PullRefreshIndicatorKt.ArcRadius;
                            f2 = PullRefreshIndicatorKt.StrokeWidth;
                            float m8798constructorimpl22 = Dp.m8798constructorimpl(Dp.m8798constructorimpl(f + f2) * 2);
                            if (z6) {
                                composer2.startReplaceGroup(-1916609863);
                                ComposerKt.sourceInformation(composer2, "108@4741L208");
                                f3 = PullRefreshIndicatorKt.StrokeWidth;
                                ProgressIndicatorKt.m2422CircularProgressIndicatorLxG7B9w(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl22), j112, f3, 0L, 0, composer2, 390, 24);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1916362142);
                                ComposerKt.sourceInformation(composer2, "114@4995L71");
                                PullRefreshIndicatorKt.m2577CircularArrowIndicatoriJQMabo(pullRefreshState2, j112, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl22), composer2, 384);
                                composer2.endReplaceGroup();
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, i92 | 24960, 10);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    long j112 = j7;
                    modifier3 = modifier2;
                    j6 = j112;
                    z4 = z5;
                    j5 = j8;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                    z4 = z3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit PullRefreshIndicator_jB83MbM$lambda$4;
                            PullRefreshIndicator_jB83MbM$lambda$4 = PullRefreshIndicatorKt.PullRefreshIndicator_jB83MbM$lambda$4(z, pullRefreshState, modifier3, j5, j6, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return PullRefreshIndicator_jB83MbM$lambda$4;
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z3 = z2;
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PullRefreshIndicator_jB83MbM$lambda$1$lambda$0(boolean z, PullRefreshState pullRefreshState) {
        return z || pullRefreshState.getPosition$material() > 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularArrowIndicator-iJQMabo, reason: not valid java name */
    public static final void m2577CircularArrowIndicatoriJQMabo(final PullRefreshState pullRefreshState, final long j, final Modifier modifier, Composer composer, final int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-486016981);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularArrowIndicator)N(state,color:c#ui.graphics.Color,modifier)125@5306L61,128@5400L87,130@5510L74,133@5649L2,133@5653L950,133@5623L980:PullRefreshIndicator.kt#t44y28");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(pullRefreshState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-486016981, i2, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:124)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1089121320, "CC(remember):PullRefreshIndicator.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            Object obj = rememberedValue;
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo5906setFillTypeoQ8Xj4U(PathFillType.INSTANCE.m6333getEvenOddRgk1Os());
                startRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1089124354, "CC(remember):PullRefreshIndicator.kt#9igjgp");
            boolean changed = startRestartGroup.changed(pullRefreshState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float CircularArrowIndicator_iJQMabo$lambda$8$lambda$7;
                        CircularArrowIndicator_iJQMabo$lambda$8$lambda$7 = PullRefreshIndicatorKt.CircularArrowIndicator_iJQMabo$lambda$8$lambda$7(PullRefreshState.this);
                        return Float.valueOf(CircularArrowIndicator_iJQMabo$lambda$8$lambda$7);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowIndicator_iJQMabo$lambda$9((State) rememberedValue2), AlphaTween, 0.0f, null, null, startRestartGroup, 48, 28);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1089132237, "CC(remember):PullRefreshIndicator.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit CircularArrowIndicator_iJQMabo$lambda$11$lambda$10;
                        CircularArrowIndicator_iJQMabo$lambda$11$lambda$10 = PullRefreshIndicatorKt.CircularArrowIndicator_iJQMabo$lambda$11$lambda$10((SemanticsPropertyReceiver) obj2);
                        return CircularArrowIndicator_iJQMabo$lambda$11$lambda$10;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue3, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1089133313, "CC(remember):PullRefreshIndicator.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(pullRefreshState) | startRestartGroup.changed(animateFloatAsState) | ((i2 & 112) == 32) | startRestartGroup.changedInstance(path);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                i3 = 0;
                Function1 function1 = new Function1() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit CircularArrowIndicator_iJQMabo$lambda$14$lambda$13;
                        CircularArrowIndicator_iJQMabo$lambda$14$lambda$13 = PullRefreshIndicatorKt.CircularArrowIndicator_iJQMabo$lambda$14$lambda$13(PullRefreshState.this, animateFloatAsState, j, path, (DrawScope) obj2);
                        return CircularArrowIndicator_iJQMabo$lambda$14$lambda$13;
                    }
                };
                startRestartGroup.updateRememberedValue(function1);
                rememberedValue4 = function1;
            } else {
                i3 = 0;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(semantics$default, (Function1) rememberedValue4, startRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit CircularArrowIndicator_iJQMabo$lambda$15;
                    CircularArrowIndicator_iJQMabo$lambda$15 = PullRefreshIndicatorKt.CircularArrowIndicator_iJQMabo$lambda$15(PullRefreshState.this, j, modifier, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return CircularArrowIndicator_iJQMabo$lambda$15;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularArrowIndicator_iJQMabo$lambda$8$lambda$7(PullRefreshState pullRefreshState) {
        if (pullRefreshState.getProgress() >= 1.0f) {
            return 1.0f;
        }
        return MinAlpha;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularArrowIndicator_iJQMabo$lambda$11$lambda$10(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularArrowIndicator_iJQMabo$lambda$14$lambda$13(PullRefreshState pullRefreshState, State state, long j, Path path, DrawScope drawScope) {
        DrawContext drawContext;
        long j2;
        ArrowValues ArrowValues = ArrowValues(pullRefreshState.getProgress());
        float floatValue = ((Number) state.getValue()).floatValue();
        float rotation = ArrowValues.getRotation();
        long mo6617getCenterF1C5BW0 = drawScope.mo6617getCenterF1C5BW0();
        DrawContext drawContext2 = drawScope.getDrawContext();
        long mo6539getSizeNHjbRc = drawContext2.mo6539getSizeNHjbRc();
        drawContext2.getCanvas().save();
        try {
            drawContext2.getTransform().mo6545rotateUv8p0NA(rotation, mo6617getCenterF1C5BW0);
            float f = drawScope.mo744toPx0680j_4(ArcRadius);
            float f2 = StrokeWidth;
            float f3 = f + (drawScope.mo744toPx0680j_4(f2) / 2.0f);
            Rect rect = new Rect(Float.intBitsToFloat((int) (androidx.compose.ui.geometry.SizeKt.m5850getCenteruvyYCjk(drawScope.mo6618getSizeNHjbRc()) >> 32)) - f3, Float.intBitsToFloat((int) (androidx.compose.ui.geometry.SizeKt.m5850getCenteruvyYCjk(drawScope.mo6618getSizeNHjbRc()) & 4294967295L)) - f3, Float.intBitsToFloat((int) (androidx.compose.ui.geometry.SizeKt.m5850getCenteruvyYCjk(drawScope.mo6618getSizeNHjbRc()) >> 32)) + f3, Float.intBitsToFloat((int) (androidx.compose.ui.geometry.SizeKt.m5850getCenteruvyYCjk(drawScope.mo6618getSizeNHjbRc()) & 4294967295L)) + f3);
            try {
                j2 = mo6539getSizeNHjbRc;
                try {
                    try {
                        DrawScope.m6597drawArcyD3GUKo$default(drawScope, j, ArrowValues.getStartAngle(), ArrowValues.getEndAngle() - ArrowValues.getStartAngle(), false, rect.m5806getTopLeftF1C5BW0(), rect.m5804getSizeNHjbRc(), floatValue, new Stroke(drawScope.mo744toPx0680j_4(f2), 0.0f, StrokeCap.INSTANCE.m6411getSquareKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
                        m2580drawArrowBx497Mc(drawScope, path, rect, j, floatValue, ArrowValues);
                        drawContext2.getCanvas().restore();
                        drawContext2.mo6540setSizeuvyYCjk(j2);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        drawContext = drawContext2;
                        j2 = j2;
                        drawContext.getCanvas().restore();
                        drawContext.mo6540setSizeuvyYCjk(j2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    drawContext = drawContext2;
                }
            } catch (Throwable th3) {
                th = th3;
                drawContext = drawContext2;
                j2 = mo6539getSizeNHjbRc;
            }
        } catch (Throwable th4) {
            th = th4;
            drawContext = drawContext2;
            j2 = mo6539getSizeNHjbRc;
        }
    }

    private static final ArrowValues ArrowValues(float f) {
        float max = (Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * 5) / 3;
        float abs = Math.abs(f) - 1.0f;
        float f2 = abs >= 0.0f ? abs : 0.0f;
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        float pow = (((0.4f * max) - 0.25f) + (f2 - (((float) Math.pow(f2, 2)) / 4))) * 0.5f;
        float f3 = 360;
        return new ArrowValues(pow, pow * f3, ((0.8f * max) + pow) * f3, Math.min(1.0f, max));
    }

    /* renamed from: drawArrow-Bx497Mc, reason: not valid java name */
    private static final void m2580drawArrowBx497Mc(DrawScope drawScope, Path path, Rect rect, long j, float f, ArrowValues arrowValues) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f2 = ArrowWidth;
        path.lineTo(drawScope.mo744toPx0680j_4(f2) * arrowValues.getScale(), 0.0f);
        path.lineTo((drawScope.mo744toPx0680j_4(f2) * arrowValues.getScale()) / 2, drawScope.mo744toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        float min = ((Math.min(rect.getRight() - rect.getLeft(), rect.getBottom() - rect.getTop()) / 2.0f) + Float.intBitsToFloat((int) (rect.m5801getCenterF1C5BW0() >> 32))) - ((drawScope.mo744toPx0680j_4(f2) * arrowValues.getScale()) / 2.0f);
        float intBitsToFloat = Float.intBitsToFloat((int) (rect.m5801getCenterF1C5BW0() & 4294967295L)) + (drawScope.mo744toPx0680j_4(StrokeWidth) / 2.0f);
        path.mo5908translatek4lQ0M(Offset.m5763constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(min) << 32)));
        path.close();
        float endAngle = arrowValues.getEndAngle();
        long mo6617getCenterF1C5BW0 = drawScope.mo6617getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo6539getSizeNHjbRc = drawContext.mo6539getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6545rotateUv8p0NA(endAngle, mo6617getCenterF1C5BW0);
            DrawScope.m6608drawPathLG529CI$default(drawScope, path, j, f, null, null, 0, 56, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6540setSizeuvyYCjk(mo6539getSizeNHjbRc);
        }
    }

    private static final boolean PullRefreshIndicator_jB83MbM$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final float CircularArrowIndicator_iJQMabo$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }
}
