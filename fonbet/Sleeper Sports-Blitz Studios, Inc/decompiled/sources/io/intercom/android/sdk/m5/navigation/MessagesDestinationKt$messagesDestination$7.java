package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavOptionsBuilderKt;
import androidx.navigation.Navigator;
import androidx.navigation.PopUpToBuilder;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.ui.R;
import kotlin.Metadata;
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

/* compiled from: MessagesDestination.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class MessagesDestinationKt$messagesDestination$7 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ ComponentActivity $rootActivity;

    MessagesDestinationKt$messagesDestination$7(ComponentActivity componentActivity, NavHostController navHostController) {
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
        InboxViewModel.Companion companion = InboxViewModel.INSTANCE;
        ComponentActivity current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            current = this.$rootActivity;
        }
        InboxViewModel create = companion.create(current);
        Bundle arguments = it.getArguments();
        final boolean z = arguments != null ? arguments.getBoolean("isLaunchedProgrammatically") : false;
        composer.startReplaceGroup(596908281);
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
        Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$3;
                invoke$lambda$3 = MessagesDestinationKt$messagesDestination$7.invoke$lambda$3(NavHostController.this, z);
                return invoke$lambda$3;
            }
        };
        final NavHostController navHostController3 = this.$navController;
        Function0 function02 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$4;
                invoke$lambda$4 = MessagesDestinationKt$messagesDestination$7.invoke$lambda$4(NavHostController.this);
                return invoke$lambda$4;
            }
        };
        final NavHostController navHostController4 = this.$navController;
        final ComponentActivity componentActivity = this.$rootActivity;
        Function0 function03 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$5;
                invoke$lambda$5 = MessagesDestinationKt$messagesDestination$7.invoke$lambda$5(NavHostController.this, componentActivity);
                return invoke$lambda$5;
            }
        };
        final NavHostController navHostController5 = this.$navController;
        InboxScreenKt.InboxScreen(create, function0, function02, function03, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$8;
                invoke$lambda$8 = MessagesDestinationKt$messagesDestination$7.invoke$lambda$8(z, navHostController5, (InboxUiEffects.NavigateToConversation) obj);
                return invoke$lambda$8;
            }
        }, ((MutableIntState) rememberedValue).getIntValue(), composer, 8);
        EffectsKt.LaunchedEffect("", new AnonymousClass5(null), composer, 70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(NavHostController navController, boolean z) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Injector.get().getMetricTracker().viewedNewConversation("messages");
        IntercomRouterKt.openNewConversation$default(navController, z, NavOptionsBuilderKt.navOptions(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$3$lambda$2;
                invoke$lambda$3$lambda$2 = MessagesDestinationKt$messagesDestination$7.invoke$lambda$3$lambda$2((NavOptionsBuilder) obj);
                return invoke$lambda$3$lambda$2;
            }
        }), null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(NavOptionsBuilder navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.popUpTo("CONVERSATION", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$3$lambda$2$lambda$1;
                invoke$lambda$3$lambda$2$lambda$1 = MessagesDestinationKt$messagesDestination$7.invoke$lambda$3$lambda$2$lambda$1((PopUpToBuilder) obj);
                return invoke$lambda$3$lambda$2$lambda$1;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4(NavHostController navController) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        NavController.navigate$default((NavController) navController, "HELP_CENTER", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5(NavHostController navController, ComponentActivity rootActivity) {
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
    public static final Unit invoke$lambda$8(boolean z, NavHostController navController, InboxUiEffects.NavigateToConversation it) {
        TransitionArgs transitionArgs;
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(it, "it");
        Injector.get().getMetricTracker().viewedConversation("messages", it.getConversation().getId());
        if (z) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        } else {
            transitionArgs = new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT);
        }
        IntercomRouterKt.openConversation$default(navController, it.getConversation().getId(), null, z, null, NavOptionsBuilderKt.navOptions(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$8$lambda$7;
                invoke$lambda$8$lambda$7 = MessagesDestinationKt$messagesDestination$7.invoke$lambda$8$lambda$7((NavOptionsBuilder) obj);
                return invoke$lambda$8$lambda$7;
            }
        }), transitionArgs, 10, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(NavOptionsBuilder navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.popUpTo("CONVERSATION", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$8$lambda$7$lambda$6;
                invoke$lambda$8$lambda$7$lambda$6 = MessagesDestinationKt$messagesDestination$7.invoke$lambda$8$lambda$7$lambda$6((PopUpToBuilder) obj);
                return invoke$lambda$8$lambda$7$lambda$6;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$6(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(true);
        return Unit.INSTANCE;
    }

    /* compiled from: MessagesDestination.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$5", f = "MessagesDestination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$5, reason: invalid class name */
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
            Injector.get().getMetricTracker().viewedSpace("messages");
            return Unit.INSTANCE;
        }
    }
}
