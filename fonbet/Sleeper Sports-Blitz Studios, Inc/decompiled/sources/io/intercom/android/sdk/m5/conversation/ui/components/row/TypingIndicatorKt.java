package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.StartOffsetType;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypingIndicator.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a+\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u0014\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"AnimateDuration", "", "TypingIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "typingIndicatorData", "Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "avatarSize", "Landroidx/compose/ui/unit/Dp;", "TypingIndicator-6a0pyJM", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;FLandroidx/compose/runtime/Composer;II)V", "TeammateTypingIndicator", "(Landroidx/compose/runtime/Composer;I)V", "animateDotAlpha", "Landroidx/compose/runtime/State;", "", "delayMillis", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "TypingIndicatorPreview", "TypingIndicatorWithoutAvatarPreview", "intercom-sdk-base_release", "alpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TypingIndicatorKt {
    private static final int AnimateDuration = 600;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeammateTypingIndicator$lambda$10(int i, Composer composer, int i2) {
        TeammateTypingIndicator(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TypingIndicatorPreview$lambda$11(int i, Composer composer, int i2) {
        TypingIndicatorPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TypingIndicatorWithoutAvatarPreview$lambda$12(int i, Composer composer, int i2) {
        TypingIndicatorWithoutAvatarPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TypingIndicator_6a0pyJM$lambda$1(Modifier modifier, CurrentlyTypingState typingIndicatorData, float f, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(typingIndicatorData, "$typingIndicatorData");
        m12403TypingIndicator6a0pyJM(modifier, typingIndicatorData, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: TypingIndicator-6a0pyJM, reason: not valid java name */
    public static final void m12403TypingIndicator6a0pyJM(Modifier modifier, final CurrentlyTypingState typingIndicatorData, float f, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(typingIndicatorData, "typingIndicatorData");
        Composer startRestartGroup = composer.startRestartGroup(1574154580);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        float m8798constructorimpl = (i2 & 4) != 0 ? Dp.m8798constructorimpl(36) : f;
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1016spacedBy0680j_4 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1016spacedBy0680j_4, centerVertically, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1949038310);
        if (typingIndicatorData.getShowAvatar()) {
            AvatarIconKt.m12134AvatarIconRd90Nhg(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, m8798constructorimpl), typingIndicatorData.getAvatarWrapper(), null, false, 0L, null, startRestartGroup, 64, 60);
        }
        startRestartGroup.endReplaceGroup();
        TeammateTypingIndicator(startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final float f2 = m8798constructorimpl;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TypingIndicator_6a0pyJM$lambda$1;
                    TypingIndicator_6a0pyJM$lambda$1 = TypingIndicatorKt.TypingIndicator_6a0pyJM$lambda$1(Modifier.this, typingIndicatorData, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TypingIndicator_6a0pyJM$lambda$1;
                }
            });
        }
    }

    private static final void TeammateTypingIndicator(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(349650241);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            final TypingIndicatorStyle typingIndicatorStyle = new TypingIndicatorStyle(RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(20)), BorderStrokeKt.m612BorderStrokecXLIe8U(Dp.m8798constructorimpl(1), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13093getAdminBorder0d7_KjU()), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13092getAdminBackground0d7_KjU(), null);
            Modifier m581backgroundbw27NRU = BackgroundKt.m581backgroundbw27NRU(Modifier.INSTANCE, typingIndicatorStyle.m12407getColor0d7_KjU(), typingIndicatorStyle.getShape());
            boolean z = typingIndicatorStyle.getBorderStroke() != null;
            startRestartGroup.startReplaceGroup(-676457367);
            boolean changed = startRestartGroup.changed(typingIndicatorStyle);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Modifier TeammateTypingIndicator$lambda$4$lambda$3;
                        TeammateTypingIndicator$lambda$4$lambda$3 = TypingIndicatorKt.TeammateTypingIndicator$lambda$4$lambda$3(TypingIndicatorStyle.this, (Modifier) obj);
                        return TeammateTypingIndicator$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1158paddingVpY3zN4 = PaddingKt.m1158paddingVpY3zN4(ModifierExtensionsKt.ifTrue(m581backgroundbw27NRU, z, (Function1) rememberedValue), Dp.m8798constructorimpl(16), Dp.m8798constructorimpl(18));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical m1016spacedBy0680j_4 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1016spacedBy0680j_4, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1158paddingVpY3zN4);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            List listOf = CollectionsKt.listOf((Object[]) new Integer[]{0, 200, 400});
            startRestartGroup.startReplaceGroup(-2125336505);
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                final State<Float> animateDotAlpha = animateDotAlpha(((Number) it.next()).intValue(), startRestartGroup, 0);
                final long m13125isTyping0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13125isTyping0d7_KjU();
                Modifier m1209size3ABfNKs = SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8));
                startRestartGroup.startReplaceGroup(-1598002378);
                boolean changed2 = startRestartGroup.changed(m13125isTyping0d7_KjU) | startRestartGroup.changed(animateDotAlpha);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit TeammateTypingIndicator$lambda$9$lambda$8$lambda$7$lambda$6;
                            TeammateTypingIndicator$lambda$9$lambda$8$lambda$7$lambda$6 = TypingIndicatorKt.TeammateTypingIndicator$lambda$9$lambda$8$lambda$7$lambda$6(m13125isTyping0d7_KjU, animateDotAlpha, (DrawScope) obj);
                            return TeammateTypingIndicator$lambda$9$lambda$8$lambda$7$lambda$6;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                CanvasKt.Canvas(m1209size3ABfNKs, (Function1) rememberedValue2, startRestartGroup, 6);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TeammateTypingIndicator$lambda$10;
                    TeammateTypingIndicator$lambda$10 = TypingIndicatorKt.TeammateTypingIndicator$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TeammateTypingIndicator$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier TeammateTypingIndicator$lambda$4$lambda$3(TypingIndicatorStyle style, Modifier ifTrue) {
        Modifier border;
        Intrinsics.checkNotNullParameter(style, "$style");
        Intrinsics.checkNotNullParameter(ifTrue, "$this$ifTrue");
        BorderStroke borderStroke = style.getBorderStroke();
        return (borderStroke == null || (border = BorderKt.border(ifTrue, borderStroke, style.getShape())) == null) ? ifTrue : border;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeammateTypingIndicator$lambda$9$lambda$8$lambda$7$lambda$6(long j, State alpha$delegate, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(alpha$delegate, "$alpha$delegate");
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6599drawCircleVaOC9Bg$default(Canvas, Color.m6038copywmQWz5c$default(j, TeammateTypingIndicator$lambda$9$lambda$8$lambda$5(alpha$delegate), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0L, 0.0f, null, null, 0, 126, null);
        return Unit.INSTANCE;
    }

    private static final State<Float> animateDotAlpha(int i, Composer composer, int i2) {
        composer.startReplaceGroup(-1913274997);
        State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("IsTypingInfiniteTransition", composer, 6, 0), 1.0f, 0.1f, AnimationSpecKt.m475infiniteRepeatable9IiC70o(AnimationSpecKt.tween$default(600, 0, null, 6, null), RepeatMode.Reverse, StartOffset.m509constructorimpl(i, StartOffsetType.INSTANCE.m526getDelayEo1U57Q())), "IsTypingAnimation", composer, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
        composer.endReplaceGroup();
        return animateFloat;
    }

    @IntercomPreviews
    public static final void TypingIndicatorPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-955207145);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m12368getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TypingIndicatorPreview$lambda$11;
                    TypingIndicatorPreview$lambda$11 = TypingIndicatorKt.TypingIndicatorPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TypingIndicatorPreview$lambda$11;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TypingIndicatorWithoutAvatarPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-544244118);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m12370getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TypingIndicatorWithoutAvatarPreview$lambda$12;
                    TypingIndicatorWithoutAvatarPreview$lambda$12 = TypingIndicatorKt.TypingIndicatorWithoutAvatarPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TypingIndicatorWithoutAvatarPreview$lambda$12;
                }
            });
        }
    }

    private static final float TeammateTypingIndicator$lambda$9$lambda$8$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }
}
