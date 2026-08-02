package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.internal.d;
import com.moloco.sdk.internal.ortb.model.k;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class a {
    public static final Unit a(k kVar, int i, int i2, Function0 function0, int i3, Composer composer, int i4) {
        a(kVar, i, i2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit b(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final void a(final k countDownTimer, final int i, final int i2, final Function0<Unit> onTimerFinish, Composer composer, final int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(countDownTimer, "countDownTimer");
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Composer startRestartGroup = composer.startRestartGroup(-1599911995);
        if ((i3 & 6) == 0) {
            i4 = (startRestartGroup.changed(countDownTimer) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(onTimerFinish) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1599911995, i4, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.AggregateRewardedCountDownTimer (AggregateRewardedCountDownTimer.kt:18)");
            }
            float m4440constructorimpl = Dp.m4440constructorimpl(countDownTimer.getCircleSize());
            long m4462DpSizeYgX7TsA = DpKt.m4462DpSizeYgX7TsA(m4440constructorimpl, m4440constructorimpl);
            Alignment a = d.a(countDownTimer.getHorizontalAlignment(), countDownTimer.getVerticalAlignment());
            long j = countDownTimer.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR java.lang.String();
            long foregroundColor = countDownTimer.getForegroundColor();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(a, false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
            int i5 = i4;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1642constructorimpl.getInserting() || !Intrinsics.areEqual(m1642constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (countDownTimer.getIsDefaultTimer()) {
                startRestartGroup.startReplaceableGroup(2067666933);
                startRestartGroup.startReplaceableGroup(-210384916);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final String str = "rewarded_countdown_timer";
                    rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return a.a(str, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                int i6 = i5 << 18;
                c.a(j, foregroundColor, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), 0.0f, DpSize.m4538getWidthD9Ej5fM(m4462DpSizeYgX7TsA), onTimerFinish, null, i, i2, startRestartGroup, ((i5 << 6) & 458752) | (29360128 & i6) | (i6 & 234881024), 72);
                startRestartGroup.endReplaceableGroup();
            } else {
                String customTimerDesc = countDownTimer.getCustomTimerDesc();
                if (customTimerDesc == null || customTimerDesc.length() <= 0) {
                    startRestartGroup.startReplaceableGroup(2069220715);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(2068452876);
                    String customTimerDesc2 = countDownTimer.getCustomTimerDesc();
                    startRestartGroup.startReplaceableGroup(-210357300);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final String str2 = "rewarded_countdown_timer_custom";
                        rememberedValue2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return a.b(str2, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    int i7 = i5 << 21;
                    b.a(j, foregroundColor, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue2, 1, null), 0.0f, DpSize.m4538getWidthD9Ej5fM(m4462DpSizeYgX7TsA), onTimerFinish, customTimerDesc2, null, i, i2, startRestartGroup, (458752 & (i5 << 6)) | (i7 & 234881024) | (i7 & 1879048192), Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
                    startRestartGroup = startRestartGroup;
                    startRestartGroup.endReplaceableGroup();
                }
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a.a(k.this, i, i2, onTimerFinish, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final float a(int i, int i2) {
        int compare;
        compare = Integer.compare(i2 ^ Integer.MIN_VALUE, 1 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            return i == 0 ? 0.0f : 1.0f;
        }
        return (((float) UnsignedKt.uintToDouble(i)) - 1.0f) / (((float) UnsignedKt.uintToDouble(i2)) - 1.0f);
    }
}
