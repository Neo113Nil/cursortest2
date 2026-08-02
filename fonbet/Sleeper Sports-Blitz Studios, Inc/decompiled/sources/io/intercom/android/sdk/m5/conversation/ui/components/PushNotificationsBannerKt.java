package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
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
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PushNotificationsBanner.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\u001a)\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"PushNotificationsBanner", "", "onEnable", "Lkotlin/Function0;", "onClose", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ContextualPushNotificationsReminderPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release", "isVisible", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PushNotificationsBannerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContextualPushNotificationsReminderPreview$lambda$5(int i, Composer composer, int i2) {
        ContextualPushNotificationsReminderPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PushNotificationsBanner$lambda$4(Function0 onEnable, Function0 onClose, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onEnable, "$onEnable");
        Intrinsics.checkNotNullParameter(onClose, "$onClose");
        PushNotificationsBanner(onEnable, onClose, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PushNotificationsBanner(final Function0<Unit> onEnable, final Function0<Unit> onClose, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onEnable, "onEnable");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer startRestartGroup = composer.startRestartGroup(-2004591797);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(onEnable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onClose) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startReplaceGroup(-633266491);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(-633262429);
            PushNotificationsBannerKt$PushNotificationsBanner$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new PushNotificationsBannerKt$PushNotificationsBanner$1$1(mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 70);
            AnimatedVisibilityKt.AnimatedVisibility(PushNotificationsBanner$lambda$1(mutableState), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, EasingFunctionsKt.getEaseOut(), 2, null), 0.0f, 2, null), (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(1923339635, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.PushNotificationsBannerKt$PushNotificationsBanner$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    Function0<Unit> function0 = onEnable;
                    long m13117getReminderBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13117getReminderBackgroundColor0d7_KjU();
                    final Function0<Unit> function02 = onClose;
                    SurfaceKt.m3732Surfaceo_FOJdg(function0, null, false, null, m13117getReminderBackgroundColor0d7_KjU, 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.rememberComposableLambda(-1181560824, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.PushNotificationsBannerKt$PushNotificationsBanner$2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            AnnotatedString annotatedString;
                            if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                float f = 16;
                                Modifier m1161paddingqDBjuR0$default = PaddingKt.m1161paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null);
                                Function0<Unit> function03 = function02;
                                ComposerKt.sourceInformationMarkerStart(composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m1161paddingqDBjuR0$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m5333constructorimpl = Updater.m5333constructorimpl(composer3);
                                Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                                }
                                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ticket_notification, composer3, 0), (String) null, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13118getReminderTextColor0d7_KjU(), composer3, 440, 0);
                                Spanned fromHtml = HtmlCompat.fromHtml(StringResources_androidKt.stringResource(R.string.intercom_notification_enable_prompt, composer3, 0), 0);
                                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = composer3.consume(localContext);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                annotatedString = BlockExtensionsKt.toAnnotatedString(fromHtml, (Context) consume, (r27 & 2) != 0 ? new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null) : null);
                                TextKt.m3902TextZ58ophY(annotatedString, PaddingKt.m1157padding3ABfNKs(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m8798constructorimpl(8)), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13118getReminderTextColor0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04Point5(), composer3, 0, 0, 262136);
                                IconButtonKt.IconButton(function03, null, false, null, null, null, ComposableSingletons$PushNotificationsBannerKt.INSTANCE.m12207getLambda1$intercom_sdk_base_release(), composer3, 1572864, 62);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composer2, 54), composer2, 0, 6, 1006);
                }
            }, startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.PushNotificationsBannerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PushNotificationsBanner$lambda$4;
                    PushNotificationsBanner$lambda$4 = PushNotificationsBannerKt.PushNotificationsBanner$lambda$4(Function0.this, onClose, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PushNotificationsBanner$lambda$4;
                }
            });
        }
    }

    private static final boolean PushNotificationsBanner$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PushNotificationsBanner$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @IntercomPreviews
    public static final void ContextualPushNotificationsReminderPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-119534126);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PushNotificationsBannerKt.INSTANCE.m12208getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.PushNotificationsBannerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ContextualPushNotificationsReminderPreview$lambda$5;
                    ContextualPushNotificationsReminderPreview$lambda$5 = PushNotificationsBannerKt.ContextualPushNotificationsReminderPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ContextualPushNotificationsReminderPreview$lambda$5;
                }
            });
        }
    }
}
