package io.intercom.android.sdk.m5.home.ui;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.WindowCompat;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001aÇ\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u000bH\u0001¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0018H\u0002\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"ANIMATION_DURATION", "", "HomeScreen", "", "homeViewModel", "Lio/intercom/android/sdk/m5/home/HomeViewModel;", "onMessagesClicked", "Lkotlin/Function0;", "onHelpClicked", "onTicketsClicked", "onTicketItemClicked", "Lkotlin/Function1;", "", "navigateToMessages", "navigateToNewConversation", "navigateToExistingConversation", "onNewConversationClicked", "onConversationClicked", "Lio/intercom/android/sdk/models/Conversation;", "onCloseClick", "onTicketLinkClicked", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "(Lio/intercom/android/sdk/m5/home/HomeViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "getHeaderContentOpacity", "", "scrollValue", "headerHeight", "isDarkContentEnabled", "", "Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HomeScreenKt {
    private static final int ANIMATION_DURATION = 600;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$12(HomeViewModel homeViewModel, Function0 onMessagesClicked, Function0 onHelpClicked, Function0 onTicketsClicked, Function1 onTicketItemClicked, Function0 navigateToMessages, Function0 navigateToNewConversation, Function1 navigateToExistingConversation, Function0 onNewConversationClicked, Function1 onConversationClicked, Function0 onCloseClick, Function1 onTicketLinkClicked, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(homeViewModel, "$homeViewModel");
        Intrinsics.checkNotNullParameter(onMessagesClicked, "$onMessagesClicked");
        Intrinsics.checkNotNullParameter(onHelpClicked, "$onHelpClicked");
        Intrinsics.checkNotNullParameter(onTicketsClicked, "$onTicketsClicked");
        Intrinsics.checkNotNullParameter(onTicketItemClicked, "$onTicketItemClicked");
        Intrinsics.checkNotNullParameter(navigateToMessages, "$navigateToMessages");
        Intrinsics.checkNotNullParameter(navigateToNewConversation, "$navigateToNewConversation");
        Intrinsics.checkNotNullParameter(navigateToExistingConversation, "$navigateToExistingConversation");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "$onNewConversationClicked");
        Intrinsics.checkNotNullParameter(onConversationClicked, "$onConversationClicked");
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        Intrinsics.checkNotNullParameter(onTicketLinkClicked, "$onTicketLinkClicked");
        HomeScreen(homeViewModel, onMessagesClicked, onHelpClicked, onTicketsClicked, onTicketItemClicked, navigateToMessages, navigateToNewConversation, navigateToExistingConversation, onNewConversationClicked, onConversationClicked, onCloseClick, onTicketLinkClicked, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    public static final void HomeScreen(final HomeViewModel homeViewModel, final Function0<Unit> onMessagesClicked, final Function0<Unit> onHelpClicked, final Function0<Unit> onTicketsClicked, final Function1<? super String, Unit> onTicketItemClicked, final Function0<Unit> navigateToMessages, final Function0<Unit> navigateToNewConversation, final Function1<? super String, Unit> navigateToExistingConversation, final Function0<Unit> onNewConversationClicked, final Function1<? super Conversation, Unit> onConversationClicked, final Function0<Unit> onCloseClick, final Function1<? super TicketType, Unit> onTicketLinkClicked, Composer composer, final int i, final int i2) {
        String str;
        int i3;
        int i4;
        BoxScopeInstance boxScopeInstance;
        String str2;
        String str3;
        int i5;
        int i6;
        Composer composer2;
        Composer composer3;
        String foregroundColor;
        Intrinsics.checkNotNullParameter(homeViewModel, "homeViewModel");
        Intrinsics.checkNotNullParameter(onMessagesClicked, "onMessagesClicked");
        Intrinsics.checkNotNullParameter(onHelpClicked, "onHelpClicked");
        Intrinsics.checkNotNullParameter(onTicketsClicked, "onTicketsClicked");
        Intrinsics.checkNotNullParameter(onTicketItemClicked, "onTicketItemClicked");
        Intrinsics.checkNotNullParameter(navigateToMessages, "navigateToMessages");
        Intrinsics.checkNotNullParameter(navigateToNewConversation, "navigateToNewConversation");
        Intrinsics.checkNotNullParameter(navigateToExistingConversation, "navigateToExistingConversation");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "onNewConversationClicked");
        Intrinsics.checkNotNullParameter(onConversationClicked, "onConversationClicked");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onTicketLinkClicked, "onTicketLinkClicked");
        Composer startRestartGroup = composer.startRestartGroup(1138475448);
        final State collectAsState = SnapshotStateKt.collectAsState(homeViewModel.getUiState(), null, startRestartGroup, 8, 1);
        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
        startRestartGroup.startReplaceGroup(853956620);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect((Object) null, new HomeScreenKt$HomeScreen$1(homeViewModel, navigateToMessages, navigateToNewConversation, navigateToExistingConversation, null), startRestartGroup, 70);
        ProvidableCompositionLocal<Activity> localActivity = LocalActivityKt.getLocalActivity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localActivity);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Activity activity = (Activity) consume;
        final Window window = activity != null ? activity.getWindow() : null;
        startRestartGroup.startReplaceGroup(853971572);
        if (window != null) {
            EffectsKt.SideEffect(new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit HomeScreen$lambda$2$lambda$1;
                    HomeScreen$lambda$2$lambda$1 = HomeScreenKt.HomeScreen$lambda$2$lambda$1(window, collectAsState);
                    return HomeScreen$lambda$2$lambda$1;
                }
            }, startRestartGroup, 0);
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        AnimatedVisibilityKt.AnimatedVisibility(collectAsState.getValue() instanceof HomeUiState.Content, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.rememberComposableLambda(750386582, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                invoke(animatedVisibilityScope, composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i7) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                HomeUiState value = collectAsState.getValue();
                if (value instanceof HomeUiState.Content) {
                    HomeUiState.Content content = (HomeUiState.Content) value;
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle = content.getHeader().getHeaderBackdropStyle();
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleDark = content.getHeader().getHeaderBackdropStyleDark();
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = composer4.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    HomeHeaderBackdropKt.m12523HomeHeaderBackdropAjpBEmI(((Density) consume2).mo740toDpu2uoSUM(mutableFloatState.getFloatValue()), headerBackdropStyle, headerBackdropStyleDark, new AnonymousClass2(homeViewModel), composer4, 0, 0);
                }
            }

            /* compiled from: HomeScreen.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$1$2, reason: invalid class name */
            /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
                AnonymousClass2(Object obj) {
                    super(0, obj, HomeViewModel.class, "onHeaderImageLoaded", "onHeaderImageLoaded()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((HomeViewModel) this.receiver).onHeaderImageLoaded();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, 200064, 18);
        final HomeUiState homeUiState = (HomeUiState) collectAsState.getValue();
        Modifier verticalScroll$default = ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.safeDrawingPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), rememberScrollState, false, null, false, 14, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, homeUiState instanceof HomeUiState.Error, columnScopeInstance.weight(Modifier.INSTANCE, 1.0f, true), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1537640308, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$2$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                invoke(animatedVisibilityScope, composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i7) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                HomeUiState homeUiState2 = HomeUiState.this;
                if (homeUiState2 instanceof HomeUiState.Error) {
                    Function0<Unit> function0 = onCloseClick;
                    ComposerKt.sourceInformationMarkerStart(composer4, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                    ComposerKt.sourceInformationMarkerStart(composer4, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, companion2);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer4.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer m5333constructorimpl3 = Updater.m5333constructorimpl(composer4);
                    Updater.m5340setimpl(m5333constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                        m5333constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                        m5333constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                    }
                    Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer4, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    HomeUiState.Error error = (HomeUiState.Error) homeUiState2;
                    HomeHeaderKt.HomeErrorHeader(null, error.getHeader(), function0, composer4, 0, 1);
                    HomeErrorContentKt.HomeErrorContent(error.getErrorState(), null, composer4, 0, 2);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer4.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                }
            }
        }, startRestartGroup, 54), startRestartGroup, 1572870, 28);
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, homeUiState instanceof HomeUiState.Loading, (Modifier) null, (EnterTransition) null, ExitTransition.INSTANCE.getNone(), (String) null, ComposableSingletons$HomeScreenKt.INSTANCE.m12481getLambda1$intercom_sdk_base_release(), startRestartGroup, 1572870, 22);
        boolean z = homeUiState instanceof HomeUiState.Content;
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(600, 600, null, 4, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.rememberComposableLambda(21007876, true, new HomeScreenKt$HomeScreen$3$2$2(homeUiState, rememberScrollState, mutableFloatState, onMessagesClicked, onHelpClicked, onTicketsClicked, onTicketItemClicked, onNewConversationClicked, onConversationClicked, onTicketLinkClicked), startRestartGroup, 54), startRestartGroup, 1600518, 18);
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(100)), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume2;
        final PoweredBy poweredBy = ((HomeUiState) collectAsState.getValue()).getPoweredBy();
        startRestartGroup.startReplaceGroup(748845448);
        if (poweredBy != null) {
            Modifier align = boxScopeInstance2.align(WindowInsetsPadding_androidKt.safeDrawingPadding(Modifier.INSTANCE), Alignment.INSTANCE.getBottomCenter());
            String text = poweredBy.getText();
            PoweredBy.PoweredByIconType icon = poweredBy.getIcon();
            Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit HomeScreen$lambda$11$lambda$5$lambda$4;
                    HomeScreen$lambda$11$lambda$5$lambda$4 = HomeScreenKt.HomeScreen$lambda$11$lambda$5$lambda$4(PoweredBy.this, context);
                    return HomeScreen$lambda$11$lambda$5$lambda$4;
                }
            };
            str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            i3 = 4;
            i4 = 1042775818;
            boxScopeInstance = boxScopeInstance2;
            str2 = "C72@3469L9:Box.kt#2w3rfo";
            str3 = "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo";
            i5 = 6;
            i6 = 1833054614;
            PoweredByBadgeKt.m12121PoweredByBadgewBJOh4Y(text, icon, function0, align, 0L, 0L, startRestartGroup, 0, 48);
            composer2 = startRestartGroup;
            Unit unit3 = Unit.INSTANCE;
            Unit unit4 = Unit.INSTANCE;
        } else {
            boxScopeInstance = boxScopeInstance2;
            i5 = 6;
            str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            i3 = 4;
            i6 = 1833054614;
            str2 = "C72@3469L9:Box.kt#2w3rfo";
            str3 = "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo";
            composer2 = startRestartGroup;
            i4 = 1042775818;
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(748866511);
        if (z) {
            final HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor = ((HomeUiState.Content) homeUiState).getHeader().getCloseButtonColor();
            composer2.startReplaceGroup(748872238);
            if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(composer2, i5) && closeButtonColor.getForegroundColorDark() != null) {
                foregroundColor = closeButtonColor.getForegroundColorDark();
            } else {
                foregroundColor = closeButtonColor.getForegroundColor();
            }
            composer2.endReplaceGroup();
            Modifier m1209size3ABfNKs = SizeKt.m1209size3ABfNKs(ClipKt.clip(boxScopeInstance.align(OffsetKt.m1111offsetVpY3zN4(WindowInsetsPadding_androidKt.safeDrawingPadding(Modifier.INSTANCE), Dp.m8798constructorimpl(-16), Dp.m8798constructorimpl(14)), Alignment.INSTANCE.getTopEnd()), RoundedCornerShapeKt.getCircleShape()), Dp.m8798constructorimpl(30));
            composer2.startReplaceGroup(-1050612040);
            boolean z2 = (((i2 & 14) ^ i5) > i3 && composer2.changed(onCloseClick)) || (i2 & 6) == i3;
            Object rememberedValue2 = composer2.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit HomeScreen$lambda$11$lambda$10$lambda$8$lambda$7;
                        HomeScreen$lambda$11$lambda$10$lambda$8$lambda$7 = HomeScreenKt.HomeScreen$lambda$11$lambda$10$lambda$8$lambda$7(Function0.this);
                        return HomeScreen$lambda$11$lambda$10$lambda$8$lambda$7;
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            composer2.endReplaceGroup();
            Modifier m623clickableoSLSa3U$default = ClickableKt.m623clickableoSLSa3U$default(m1209size3ABfNKs, false, null, null, null, (Function0) rememberedValue2, 15, null);
            ComposerKt.sourceInformationMarkerStart(composer2, i4, str3);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m623clickableoSLSa3U$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer m5333constructorimpl3 = Updater.m5333constructorimpl(composer2);
            Updater.m5340setimpl(m5333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                m5333constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                m5333constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
            }
            Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, i6, str2);
            final BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            Composer composer4 = composer2;
            AnimatedVisibilityKt.AnimatedVisibility(((double) rememberScrollState.getValue()) > ((double) mutableFloatState.getFloatValue()) * 0.6d, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1722206090, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$4$2$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                    invoke(animatedVisibilityScope, composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i7) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    BoxKt.Box(BackgroundKt.m582backgroundbw27NRU$default(BoxScope.this.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), ColorExtensionsKt.toComposeColor(closeButtonColor.getBackgroundColor(), closeButtonColor.getBackgroundOpacity()), null, 2, null), composer5, 0);
                }
            }, composer2, 54), composer4, 200064, 18);
            IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_close, composer4, 0), StringResources_androidKt.stringResource(io.intercom.android.sdk.R.string.intercom_close, composer4, 0), boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), ColorExtensionsKt.toComposeColor$default(foregroundColor, 0.0f, 1, null), composer4, 8, 0);
            composer3 = composer4;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            Unit unit5 = Unit.INSTANCE;
        } else {
            composer3 = composer2;
        }
        composer3.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeScreen$lambda$12;
                    HomeScreen$lambda$12 = HomeScreenKt.HomeScreen$lambda$12(HomeViewModel.this, onMessagesClicked, onHelpClicked, onTicketsClicked, onTicketItemClicked, navigateToMessages, navigateToNewConversation, navigateToExistingConversation, onNewConversationClicked, onConversationClicked, onCloseClick, onTicketLinkClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeScreen$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$2$lambda$1(Window it, State uiState) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        WindowCompat.getInsetsController(it, it.getDecorView()).setAppearanceLightStatusBars(isDarkContentEnabled((HomeUiState) uiState.getValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$11$lambda$5$lambda$4(PoweredBy poweredBy, Context context) {
        Intrinsics.checkNotNullParameter(poweredBy, "$poweredBy");
        Intrinsics.checkNotNullParameter(context, "$context");
        Injector.get().getMetricTracker().clickedPoweredBy("home");
        LinkOpener.handleUrl(poweredBy.getLinkUrl(), context, Injector.get().getApi());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$11$lambda$10$lambda$8$lambda$7(Function0 onCloseClick) {
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        onCloseClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHeaderContentOpacity(int i, float f) {
        return RangesKt.coerceIn((f - i) / f, 0.0f, 1.0f);
    }

    private static final boolean isDarkContentEnabled(HomeUiState homeUiState) {
        if (homeUiState instanceof HomeUiState.Content) {
            return ColorExtensionsKt.m13186isDarkColor8_81llA(ColorExtensionsKt.toComposeColor$default(((HomeUiState.Content) homeUiState).getHeader().getIntro().getTextColorLight(), 0.0f, 1, null));
        }
        if (homeUiState instanceof HomeUiState.Error) {
            return ColorExtensionsKt.m13186isDarkColor8_81llA(ColorExtensionsKt.toComposeColor$default(((HomeUiState.Error) homeUiState).getHeader().getForegroundColor(), 0.0f, 1, null));
        }
        return true;
    }
}
