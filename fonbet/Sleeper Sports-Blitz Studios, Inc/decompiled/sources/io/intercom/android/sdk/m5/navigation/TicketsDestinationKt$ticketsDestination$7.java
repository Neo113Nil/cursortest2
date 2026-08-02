package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenEffects;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel;
import io.intercom.android.sdk.ui.R;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: TicketsDestination.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class TicketsDestinationKt$ticketsDestination$7 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ ComponentActivity $rootActivity;

    TicketsDestinationKt$ticketsDestination$7(ComponentActivity componentActivity, NavHostController navHostController) {
        this.$rootActivity = componentActivity;
        this.$navController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        TicketsScreenViewModel.Companion companion = TicketsScreenViewModel.INSTANCE;
        ComponentActivity current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            current = this.$rootActivity;
        }
        TicketsScreenViewModel create = companion.create(current);
        Bundle arguments = it.getArguments();
        final boolean z = arguments != null ? arguments.getBoolean("isLaunchedProgrammatically") : false;
        final LazyPagingItems collectAsLazyPagingItems = LazyPagingItemsKt.collectAsLazyPagingItems(create.getPagerFlow(), null, composer, 8, 1);
        TicketsScreenUiState reduceToTicketsScreenUiState = TicketsListReducerKt.reduceToTicketsScreenUiState(collectAsLazyPagingItems, null, composer, LazyPagingItems.$stable, 1);
        EffectsKt.LaunchedEffect((Object) null, new AnonymousClass1(create, collectAsLazyPagingItems, null), composer, 70);
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) consume;
        EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult invoke$lambda$2;
                invoke$lambda$2 = TicketsDestinationKt$ticketsDestination$7.invoke$lambda$2(LifecycleOwner.this, collectAsLazyPagingItems, (DisposableEffectScope) obj);
                return invoke$lambda$2;
            }
        }, composer, 8);
        composer.startReplaceGroup(834702382);
        NavHostController navHostController = this.$navController;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            if (navHostController.getPreviousBackStackEntry() == null) {
                i2 = R.drawable.intercom_ic_close;
            } else if (z) {
                i2 = R.drawable.intercom_ic_chevron_down;
            } else {
                i2 = R.drawable.intercom_ic_back;
            }
            rememberedValue = SnapshotIntStateKt.mutableIntStateOf(i2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        final NavHostController navHostController2 = this.$navController;
        final ComponentActivity componentActivity = this.$rootActivity;
        Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$4;
                invoke$lambda$4 = TicketsDestinationKt$ticketsDestination$7.invoke$lambda$4(NavHostController.this, componentActivity);
                return invoke$lambda$4;
            }
        };
        final NavHostController navHostController3 = this.$navController;
        TicketsScreenKt.TicketsScreen(reduceToTicketsScreenUiState, function0, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$5;
                invoke$lambda$5 = TicketsDestinationKt$ticketsDestination$7.invoke$lambda$5(z, navHostController3, (String) obj);
                return invoke$lambda$5;
            }
        }, ((MutableIntState) rememberedValue).getIntValue(), composer, 0, 0);
        EffectsKt.LaunchedEffect("", new AnonymousClass5(null), composer, 70);
    }

    /* compiled from: TicketsDestination.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$1", f = "TicketsDestination.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LazyPagingItems<TicketRowData> $lazyPagingItems;
        final /* synthetic */ TicketsScreenViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TicketsScreenViewModel ticketsScreenViewModel, LazyPagingItems<TicketRowData> lazyPagingItems, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$viewModel = ticketsScreenViewModel;
            this.$lazyPagingItems = lazyPagingItems;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$viewModel, this.$lazyPagingItems, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<TicketsScreenEffects> effect = this.$viewModel.getEffect();
                final LazyPagingItems<TicketRowData> lazyPagingItems = this.$lazyPagingItems;
                this.label = 1;
                if (effect.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt.ticketsDestination.7.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((TicketsScreenEffects) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(TicketsScreenEffects ticketsScreenEffects, Continuation<? super Unit> continuation) {
                        if (!Intrinsics.areEqual(ticketsScreenEffects, TicketsScreenEffects.RefreshTickets.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lazyPagingItems.refresh();
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult invoke$lambda$2(final LifecycleOwner lifecycleOwner, final LazyPagingItems lazyPagingItems, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                TicketsDestinationKt$ticketsDestination$7.invoke$lambda$2$lambda$0(LazyPagingItems.this, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$invoke$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$0(LazyPagingItems lazyPagingItems, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_RESUME && (lazyPagingItems.getLoadState().getRefresh() instanceof LoadState.NotLoading)) {
            lazyPagingItems.refresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4(NavHostController navController, ComponentActivity rootActivity) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
        if (navController.getPreviousBackStackEntry() == null) {
            rootActivity.finish();
        } else {
            navController.navigateUp();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5(boolean z, NavHostController navController, String ticketId) {
        TransitionArgs transitionArgs;
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        if (z) {
            transitionArgs = new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_DOWN, EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT);
        } else {
            transitionArgs = new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN);
        }
        IntercomRouterKt.openTicketDetailScreen$default(navController, ticketId, MetricTracker.Context.FROM_TICKETS_SPACE, transitionArgs, false, 8, null);
        return Unit.INSTANCE;
    }

    /* compiled from: TicketsDestination.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$5", f = "TicketsDestination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Injector.get().getMetricTracker().viewedSpace("tickets");
            return Unit.INSTANCE;
        }
    }
}
