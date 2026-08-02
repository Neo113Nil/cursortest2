package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InboxScreen.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"InboxScreen", "", "viewModel", "Lio/intercom/android/sdk/m5/inbox/InboxViewModel;", "onSendMessageButtonClick", "Lkotlin/Function0;", "onBrowseHelpCenterButtonClick", "onBackButtonClick", "onConversationClicked", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects$NavigateToConversation;", "navIcon", "", "(Lio/intercom/android/sdk/m5/inbox/InboxViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)V", "InboxLoadingRow", "(Landroidx/compose/runtime/Composer;I)V", "InboxErrorRow", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "(Lio/intercom/android/sdk/m5/components/ErrorState;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InboxScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxErrorRow$lambda$8(ErrorState errorState, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(errorState, "$errorState");
        InboxErrorRow(errorState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxLoadingRow$lambda$5(int i, Composer composer, int i2) {
        InboxLoadingRow(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxScreen$lambda$3(InboxViewModel viewModel, Function0 onSendMessageButtonClick, Function0 onBrowseHelpCenterButtonClick, Function0 onBackButtonClick, Function1 onConversationClicked, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(onSendMessageButtonClick, "$onSendMessageButtonClick");
        Intrinsics.checkNotNullParameter(onBrowseHelpCenterButtonClick, "$onBrowseHelpCenterButtonClick");
        Intrinsics.checkNotNullParameter(onBackButtonClick, "$onBackButtonClick");
        Intrinsics.checkNotNullParameter(onConversationClicked, "$onConversationClicked");
        InboxScreen(viewModel, onSendMessageButtonClick, onBrowseHelpCenterButtonClick, onBackButtonClick, onConversationClicked, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void InboxScreen(final InboxViewModel viewModel, final Function0<Unit> onSendMessageButtonClick, final Function0<Unit> onBrowseHelpCenterButtonClick, final Function0<Unit> onBackButtonClick, final Function1<? super InboxUiEffects.NavigateToConversation, Unit> onConversationClicked, final int i, Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onSendMessageButtonClick, "onSendMessageButtonClick");
        Intrinsics.checkNotNullParameter(onBrowseHelpCenterButtonClick, "onBrowseHelpCenterButtonClick");
        Intrinsics.checkNotNullParameter(onBackButtonClick, "onBackButtonClick");
        Intrinsics.checkNotNullParameter(onConversationClicked, "onConversationClicked");
        Composer startRestartGroup = composer.startRestartGroup(988563388);
        final LazyPagingItems collectAsLazyPagingItems = LazyPagingItemsKt.collectAsLazyPagingItems(viewModel.getInboxPagingData(), null, startRestartGroup, 8, 1);
        final InboxUiState reduceToInboxUiState = InboxPagingItemsReducerKt.reduceToInboxUiState(collectAsLazyPagingItems, viewModel.getEmptyState(), null, i, startRestartGroup, LazyPagingItems.$stable | ((i2 >> 6) & 7168), 2);
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) consume;
        EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new Function1() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult InboxScreen$lambda$2;
                InboxScreen$lambda$2 = InboxScreenKt.InboxScreen$lambda$2(LifecycleOwner.this, collectAsLazyPagingItems, (DisposableEffectScope) obj);
                return InboxScreen$lambda$2;
            }
        }, startRestartGroup, 8);
        EffectsKt.LaunchedEffect((Object) null, new InboxScreenKt$InboxScreen$2(viewModel, onConversationClicked, collectAsLazyPagingItems, null), startRestartGroup, 70);
        ScaffoldKt.m3518ScaffoldTvnljyQ(WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m582backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), WindowInsets_androidKt.getDisplayCutout(WindowInsets.INSTANCE, startRestartGroup, 8)), ComposableLambdaKt.rememberComposableLambda(-682199168, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    String title = InboxUiState.this.getIntercomTopBarState().getTitle();
                    if (title == null) {
                        title = "";
                    }
                    Function0<Unit> function0 = onBackButtonClick;
                    Integer navIcon = InboxUiState.this.getIntercomTopBarState().getNavIcon();
                    Color m12886getBackgroundColorQN2ZGVo = InboxUiState.this.getIntercomTopBarState().m12886getBackgroundColorQN2ZGVo();
                    composer2.startReplaceGroup(1816943163);
                    long m13106getHeader0d7_KjU = m12886getBackgroundColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13106getHeader0d7_KjU() : m12886getBackgroundColorQN2ZGVo.m6049unboximpl();
                    composer2.endReplaceGroup();
                    Color m12887getContentColorQN2ZGVo = InboxUiState.this.getIntercomTopBarState().m12887getContentColorQN2ZGVo();
                    composer2.startReplaceGroup(1816946586);
                    long m13113getOnHeader0d7_KjU = m12887getContentColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13113getOnHeader0d7_KjU() : m12887getContentColorQN2ZGVo.m6049unboximpl();
                    composer2.endReplaceGroup();
                    TopActionBarKt.m12131TopActionBarNpQZenA(null, title, null, null, null, function0, navIcon, false, m13106getHeader0d7_KjU, m13113getOnHeader0d7_KjU, 0L, null, null, composer2, 0, 0, 7325);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), null, null, ComposableLambdaKt.rememberComposableLambda(958560707, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    InboxUiState inboxUiState = InboxUiState.this;
                    if ((inboxUiState instanceof InboxUiState.Content) && ((InboxUiState.Content) inboxUiState).getShowSendMessageFab()) {
                        FloatingActionButtonKt.m3137FloatingActionButtonXz6DiA(onSendMessageButtonClick, PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m8798constructorimpl(16), 7, null), RoundedCornerShapeKt.getCircleShape(), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13089getAction0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13110getOnAction0d7_KjU(), null, null, ComposableSingletons$InboxScreenKt.INSTANCE.m12539getLambda1$intercom_sdk_base_release(), composer2, 12582960, 96);
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1682074485, true, new InboxScreenKt$InboxScreen$5(reduceToInboxUiState, viewModel, onSendMessageButtonClick, onBrowseHelpCenterButtonClick), startRestartGroup, 54), startRestartGroup, 805330992, 492);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InboxScreen$lambda$3;
                    InboxScreen$lambda$3 = InboxScreenKt.InboxScreen$lambda$3(InboxViewModel.this, onSendMessageButtonClick, onBrowseHelpCenterButtonClick, onBackButtonClick, onConversationClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return InboxScreen$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult InboxScreen$lambda$2(final LifecycleOwner lifecycleOwner, final LazyPagingItems lazyPagingItems, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                InboxScreenKt.InboxScreen$lambda$2$lambda$0(LazyPagingItems.this, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InboxScreen$lambda$2$lambda$0(LazyPagingItems lazyPagingItems, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_RESUME && (lazyPagingItems.getLoadState().getRefresh() instanceof LoadState.NotLoading)) {
            lazyPagingItems.refresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InboxLoadingRow(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1843849504);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(16), 1, null), 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProgressIndicatorKt.m3476CircularProgressIndicator4lLiAd8(null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13090getActionContrastWhite0d7_KjU(), 0.0f, 0L, 0, 0.0f, startRestartGroup, 0, 61);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InboxLoadingRow$lambda$5;
                    InboxLoadingRow$lambda$5 = InboxScreenKt.InboxLoadingRow$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return InboxLoadingRow$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InboxErrorRow(final ErrorState errorState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-126725909);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(errorState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(16), 1, null), 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(errorState.getMessageResId(), startRestartGroup, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, 0, 0, 262142);
            startRestartGroup = startRestartGroup;
            startRestartGroup.startReplaceGroup(-868881931);
            if (errorState instanceof ErrorState.WithCTA) {
                ButtonKt.TextButton(((ErrorState.WithCTA) errorState).getOnCtaClick(), null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-282010049, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxErrorRow$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope TextButton, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                        if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                            TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(((ErrorState.WithCTA) ErrorState.this).getCtaResId(), composer2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131070);
                        } else {
                            composer2.skipToGroupEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InboxErrorRow$lambda$8;
                    InboxErrorRow$lambda$8 = InboxScreenKt.InboxErrorRow$lambda$8(ErrorState.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return InboxErrorRow$lambda$8;
                }
            });
        }
    }
}
