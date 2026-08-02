package io.intercom.android.sdk.m5.navigation;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavOptionsBuilderKt;
import androidx.navigation.NavType;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketDetailViewModel;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketDetailDestination.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001aU\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"SHOW_SUBMISSION_CARD", "", "TICKET_ID", "LAUNCHED_FROM", "ticketDetailDestination", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "rootActivity", "Landroidx/activity/ComponentActivity;", "TicketDetailScreen", "ticketDetailState", "Lio/intercom/android/sdk/tickets/TicketDetailState;", "onBackClicked", "Lkotlin/Function0;", "onConversationCTAClicked", "Lkotlin/Function2;", "", "showSubmissionCard", "isLaunchedProgrammatically", "(Lio/intercom/android/sdk/tickets/TicketDetailState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/runtime/Composer;II)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TicketDetailDestinationKt {
    public static final String LAUNCHED_FROM = "from";
    public static final String SHOW_SUBMISSION_CARD = "show_submission_card";
    public static final String TICKET_ID = "ticket_id";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDetailScreen$lambda$19(TicketDetailState ticketDetailState, Function0 function0, Function2 function2, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(ticketDetailState, "$ticketDetailState");
        TicketDetailScreen(ticketDetailState, function0, function2, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ticketDetailDestination$onBackClicked(NavHostController navHostController, ComponentActivity componentActivity) {
        if (navHostController.getPreviousBackStackEntry() == null) {
            componentActivity.getOnBackPressedDispatcher().onBackPressed();
        } else {
            navHostController.navigateUp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ticketDetailDestination$onConversationCTAClicked(NavHostController navHostController, String str, boolean z) {
        IntercomRouterKt.openConversation$default(navHostController, str, null, z, null, NavOptionsBuilderKt.navOptions(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ticketDetailDestination$onConversationCTAClicked$lambda$1;
                ticketDetailDestination$onConversationCTAClicked$lambda$1 = TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked$lambda$1((NavOptionsBuilder) obj);
                return ticketDetailDestination$onConversationCTAClicked$lambda$1;
            }
        }), null, 42, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$onConversationCTAClicked$lambda$1(NavOptionsBuilder navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.popUpTo("CONVERSATION", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0;
                ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0 = TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0((PopUpToBuilder) obj);
                return ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(true);
        return Unit.INSTANCE;
    }

    public static final void ticketDetailDestination(NavGraphBuilder navGraphBuilder, final NavHostController navController, final ComponentActivity rootActivity) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        NavGraphBuilderKt.composable$default(navGraphBuilder, "TICKET_DETAIL?show_submission_card={show_submission_card}&transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument(SHOW_SUBMISSION_CARD, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ticketDetailDestination$lambda$2;
                ticketDetailDestination$lambda$2 = TicketDetailDestinationKt.ticketDetailDestination$lambda$2((NavArgumentBuilder) obj);
                return ticketDetailDestination$lambda$2;
            }
        }), NamedNavArgumentKt.navArgument("transitionArgs", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ticketDetailDestination$lambda$3;
                ticketDetailDestination$lambda$3 = TicketDetailDestinationKt.ticketDetailDestination$lambda$3((NavArgumentBuilder) obj);
                return ticketDetailDestination$lambda$3;
            }
        }), NamedNavArgumentKt.navArgument("isLaunchedProgrammatically", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ticketDetailDestination$lambda$4;
                ticketDetailDestination$lambda$4 = TicketDetailDestinationKt.ticketDetailDestination$lambda$4((NavArgumentBuilder) obj);
                return ticketDetailDestination$lambda$4;
            }
        })}), (List) null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnterTransition ticketDetailDestination$lambda$5;
                ticketDetailDestination$lambda$5 = TicketDetailDestinationKt.ticketDetailDestination$lambda$5((AnimatedContentTransitionScope) obj);
                return ticketDetailDestination$lambda$5;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ExitTransition ticketDetailDestination$lambda$6;
                ticketDetailDestination$lambda$6 = TicketDetailDestinationKt.ticketDetailDestination$lambda$6((AnimatedContentTransitionScope) obj);
                return ticketDetailDestination$lambda$6;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnterTransition ticketDetailDestination$lambda$7;
                ticketDetailDestination$lambda$7 = TicketDetailDestinationKt.ticketDetailDestination$lambda$7((AnimatedContentTransitionScope) obj);
                return ticketDetailDestination$lambda$7;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ExitTransition ticketDetailDestination$lambda$8;
                ticketDetailDestination$lambda$8 = TicketDetailDestinationKt.ticketDetailDestination$lambda$8((AnimatedContentTransitionScope) obj);
                return ticketDetailDestination$lambda$8;
            }
        }, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1948427665, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$8
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                Bundle arguments = it.getArguments();
                boolean z = arguments != null ? arguments.getBoolean(TicketDetailDestinationKt.SHOW_SUBMISSION_CARD) : false;
                Bundle arguments2 = it.getArguments();
                boolean z2 = arguments2 != null ? arguments2.getBoolean("isLaunchedProgrammatically") : false;
                TicketDetailViewModel.Companion companion = TicketDetailViewModel.INSTANCE;
                ComponentActivity current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    current = ComponentActivity.this;
                }
                TicketDetailDestinationKt.TicketDetailScreen((TicketDetailState) SnapshotStateKt.collectAsState(companion.create(current, new TicketLaunchedFrom.Conversation(null, 1, null)).getStateFlow(), null, composer, 8, 1).getValue(), new AnonymousClass1(navController, ComponentActivity.this), new AnonymousClass2(navController), z, z2, composer, 0, 0);
            }

            /* compiled from: TicketDetailDestination.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$8$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
                final /* synthetic */ NavHostController $navController;
                final /* synthetic */ ComponentActivity $rootActivity;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(NavHostController navHostController, ComponentActivity componentActivity) {
                    super(0, Intrinsics.Kotlin.class, "onBackClicked", "ticketDetailDestination$onBackClicked(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
                    this.$navController = navHostController;
                    this.$rootActivity = componentActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TicketDetailDestinationKt.ticketDetailDestination$onBackClicked(this.$navController, this.$rootActivity);
                }
            }

            /* compiled from: TicketDetailDestination.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$8$2, reason: invalid class name */
            /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<String, Boolean, Unit> {
                final /* synthetic */ NavHostController $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(NavHostController navHostController) {
                    super(2, Intrinsics.Kotlin.class, "onConversationCTAClicked", "ticketDetailDestination$onConversationCTAClicked(Landroidx/navigation/NavHostController;Ljava/lang/String;Z)V", 0);
                    this.$navController = navHostController;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                    invoke(str, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(String str, boolean z) {
                    TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked(this.$navController, str, z);
                }
            }
        }), 132, (Object) null);
        NavGraphBuilderKt.composable$default(navGraphBuilder, "TICKET_DETAIL/{ticket_id}?from={from}&transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument(TICKET_ID, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ticketDetailDestination$lambda$9;
                ticketDetailDestination$lambda$9 = TicketDetailDestinationKt.ticketDetailDestination$lambda$9((NavArgumentBuilder) obj);
                return ticketDetailDestination$lambda$9;
            }
        }), NamedNavArgumentKt.navArgument("from", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ticketDetailDestination$lambda$10;
                ticketDetailDestination$lambda$10 = TicketDetailDestinationKt.ticketDetailDestination$lambda$10((NavArgumentBuilder) obj);
                return ticketDetailDestination$lambda$10;
            }
        }), NamedNavArgumentKt.navArgument("transitionArgs", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ticketDetailDestination$lambda$11;
                ticketDetailDestination$lambda$11 = TicketDetailDestinationKt.ticketDetailDestination$lambda$11((NavArgumentBuilder) obj);
                return ticketDetailDestination$lambda$11;
            }
        }), NamedNavArgumentKt.navArgument("isLaunchedProgrammatically", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ticketDetailDestination$lambda$12;
                ticketDetailDestination$lambda$12 = TicketDetailDestinationKt.ticketDetailDestination$lambda$12((NavArgumentBuilder) obj);
                return ticketDetailDestination$lambda$12;
            }
        })}), (List) null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnterTransition ticketDetailDestination$lambda$13;
                ticketDetailDestination$lambda$13 = TicketDetailDestinationKt.ticketDetailDestination$lambda$13((AnimatedContentTransitionScope) obj);
                return ticketDetailDestination$lambda$13;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ExitTransition ticketDetailDestination$lambda$14;
                ticketDetailDestination$lambda$14 = TicketDetailDestinationKt.ticketDetailDestination$lambda$14((AnimatedContentTransitionScope) obj);
                return ticketDetailDestination$lambda$14;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnterTransition ticketDetailDestination$lambda$15;
                ticketDetailDestination$lambda$15 = TicketDetailDestinationKt.ticketDetailDestination$lambda$15((AnimatedContentTransitionScope) obj);
                return ticketDetailDestination$lambda$15;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ExitTransition ticketDetailDestination$lambda$16;
                ticketDetailDestination$lambda$16 = TicketDetailDestinationKt.ticketDetailDestination$lambda$16((AnimatedContentTransitionScope) obj);
                return ticketDetailDestination$lambda$16;
            }
        }, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1365826072, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$17
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
                String str;
                String str2;
                TicketLaunchedFrom.Other other;
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                Bundle arguments = it.getArguments();
                if (arguments == null || (str = arguments.getString(TicketDetailDestinationKt.TICKET_ID)) == null) {
                    str = "";
                }
                Bundle arguments2 = it.getArguments();
                boolean z = arguments2 != null ? arguments2.getBoolean("isLaunchedProgrammatically") : false;
                Bundle arguments3 = it.getArguments();
                if (arguments3 == null || (str2 = arguments3.getString("from")) == null) {
                    str2 = MetricTracker.Context.FROM_TICKETS_SPACE;
                }
                if (NavHostController.this.getPreviousBackStackEntry() == null) {
                    Intent intent = rootActivity.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                    IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
                    if (argsForIntent instanceof IntercomRootActivityArgs.TicketDetailsScreenArgs) {
                        IntercomRootActivityArgs.TicketDetailsScreenArgs ticketDetailsScreenArgs = (IntercomRootActivityArgs.TicketDetailsScreenArgs) argsForIntent;
                        str = ticketDetailsScreenArgs.getTicketId();
                        str2 = ticketDetailsScreenArgs.getFrom();
                    }
                }
                TicketDetailViewModel.Companion companion = TicketDetailViewModel.INSTANCE;
                ComponentActivity current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    current = rootActivity;
                }
                if (Intrinsics.areEqual(str2, "conversation")) {
                    other = new TicketLaunchedFrom.Conversation(null, 1, null);
                } else {
                    other = new TicketLaunchedFrom.Other(str, str2);
                }
                TicketDetailDestinationKt.TicketDetailScreen((TicketDetailState) SnapshotStateKt.collectAsState(companion.create(current, other).getStateFlow(), null, composer, 8, 1).getValue(), new AnonymousClass1(NavHostController.this, rootActivity), new AnonymousClass2(NavHostController.this), false, z, composer, 3072, 0);
            }

            /* compiled from: TicketDetailDestination.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$17$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
                final /* synthetic */ NavHostController $navController;
                final /* synthetic */ ComponentActivity $rootActivity;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(NavHostController navHostController, ComponentActivity componentActivity) {
                    super(0, Intrinsics.Kotlin.class, "onBackClicked", "ticketDetailDestination$onBackClicked(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
                    this.$navController = navHostController;
                    this.$rootActivity = componentActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TicketDetailDestinationKt.ticketDetailDestination$onBackClicked(this.$navController, this.$rootActivity);
                }
            }

            /* compiled from: TicketDetailDestination.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$17$2, reason: invalid class name */
            /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<String, Boolean, Unit> {
                final /* synthetic */ NavHostController $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(NavHostController navHostController) {
                    super(2, Intrinsics.Kotlin.class, "onConversationCTAClicked", "ticketDetailDestination$onConversationCTAClicked(Landroidx/navigation/NavHostController;Ljava/lang/String;Z)V", 0);
                    this.$navController = navHostController;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
                    invoke(str, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(String str, boolean z) {
                    TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked(this.$navController, str, z);
                }
            }
        }), 132, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$3(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(TransitionStyleKt.getTransitionArgNavType());
        navArgument.setDefaultValue(new TransitionArgs(null, null, null, null, 15, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$4(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        navArgument.setDefaultValue(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition ticketDetailDestination$lambda$5(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getTargetState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition ticketDetailDestination$lambda$6(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getInitialState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition ticketDetailDestination$lambda$7(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getTargetState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition ticketDetailDestination$lambda$8(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getInitialState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$9(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$10(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        navArgument.setNullable(true);
        navArgument.setDefaultValue(MetricTracker.Context.FROM_TICKETS_SPACE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$11(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(TransitionStyleKt.getTransitionArgNavType());
        navArgument.setDefaultValue(new TransitionArgs(null, null, null, null, 15, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketDetailDestination$lambda$12(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        navArgument.setDefaultValue(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition ticketDetailDestination$lambda$13(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getTargetState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition ticketDetailDestination$lambda$14(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getInitialState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition ticketDetailDestination$lambda$15(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getTargetState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition ticketDetailDestination$lambda$16(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getInitialState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDetailScreen$lambda$18(String str, boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TicketDetailScreen(final TicketDetailState ticketDetailState, Function0<Unit> function0, Function2<? super String, ? super Boolean, Unit> function2, boolean z, final boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        Function2<? super String, ? super Boolean, Unit> function22;
        int i5;
        boolean z3;
        final Function0<Unit> function03;
        final Function2<? super String, ? super Boolean, Unit> function23;
        final boolean z4;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(ticketDetailState, "ticketDetailState");
        Composer startRestartGroup = composer.startRestartGroup(226165078);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(ticketDetailState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    if ((i3 & 46811) == 9362 || !startRestartGroup.getSkipping()) {
                        function03 = i6 == 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        } : function02;
                        function23 = i4 == 0 ? new Function2() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TicketDetailScreen$lambda$18;
                                TicketDetailScreen$lambda$18 = TicketDetailDestinationKt.TicketDetailScreen$lambda$18((String) obj, ((Boolean) obj2).booleanValue());
                                return TicketDetailScreen$lambda$18;
                            }
                        } : function22;
                        z4 = i5 == 0 ? false : z3;
                        composer2 = startRestartGroup;
                        ScaffoldKt.m3518ScaffoldTvnljyQ(TestTagKt.testTag(WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m582backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), WindowInsets_androidKt.getDisplayCutout(WindowInsets.INSTANCE, startRestartGroup, 8)), "ticket_detail_screen"), ComposableLambdaKt.rememberComposableLambda(-2018170598, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                String str;
                                if ((i7 & 11) != 2 || !composer3.getSkipping()) {
                                    TicketDetailState ticketDetailState2 = TicketDetailState.this;
                                    TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                                    if (ticketDetailContentState == null || (str = ticketDetailContentState.getTicketName()) == null) {
                                        str = "";
                                    }
                                    TopActionBarKt.m12131TopActionBarNpQZenA(null, str, null, null, null, function03, Integer.valueOf(R.drawable.intercom_ic_close), false, IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13094getBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0L, null, null, composer3, 0, 0, 7325);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1401868325, true, new TicketDetailDestinationKt$TicketDetailScreen$4(ticketDetailState, function23, z2, z4), startRestartGroup, 54), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        function03 = function02;
                        function23 = function22;
                        z4 = z3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TicketDetailScreen$lambda$19;
                                TicketDetailScreen$lambda$19 = TicketDetailDestinationKt.TicketDetailScreen$lambda$19(TicketDetailState.this, function03, function23, z4, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TicketDetailScreen$lambda$19;
                            }
                        });
                        return;
                    }
                    return;
                }
                z3 = z;
                if ((i2 & 16) == 0) {
                }
                if ((i3 & 46811) == 9362) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                composer2 = startRestartGroup;
                ScaffoldKt.m3518ScaffoldTvnljyQ(TestTagKt.testTag(WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m582backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), WindowInsets_androidKt.getDisplayCutout(WindowInsets.INSTANCE, startRestartGroup, 8)), "ticket_detail_screen"), ComposableLambdaKt.rememberComposableLambda(-2018170598, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        String str;
                        if ((i7 & 11) != 2 || !composer3.getSkipping()) {
                            TicketDetailState ticketDetailState2 = TicketDetailState.this;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (str = ticketDetailContentState.getTicketName()) == null) {
                                str = "";
                            }
                            TopActionBarKt.m12131TopActionBarNpQZenA(null, str, null, null, null, function03, Integer.valueOf(R.drawable.intercom_ic_close), false, IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13094getBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0L, null, null, composer3, 0, 0, 7325);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1401868325, true, new TicketDetailDestinationKt$TicketDetailScreen$4(ticketDetailState, function23, z2, z4), startRestartGroup, 54), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function22 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z3 = z;
            if ((i2 & 16) == 0) {
            }
            if ((i3 & 46811) == 9362) {
            }
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            composer2 = startRestartGroup;
            ScaffoldKt.m3518ScaffoldTvnljyQ(TestTagKt.testTag(WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m582backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), WindowInsets_androidKt.getDisplayCutout(WindowInsets.INSTANCE, startRestartGroup, 8)), "ticket_detail_screen"), ComposableLambdaKt.rememberComposableLambda(-2018170598, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    String str;
                    if ((i7 & 11) != 2 || !composer3.getSkipping()) {
                        TicketDetailState ticketDetailState2 = TicketDetailState.this;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (str = ticketDetailContentState.getTicketName()) == null) {
                            str = "";
                        }
                        TopActionBarKt.m12131TopActionBarNpQZenA(null, str, null, null, null, function03, Integer.valueOf(R.drawable.intercom_ic_close), false, IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13094getBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0L, null, null, composer3, 0, 0, 7325);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1401868325, true, new TicketDetailDestinationKt$TicketDetailScreen$4(ticketDetailState, function23, z2, z4), startRestartGroup, 54), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function02 = function0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z3 = z;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 46811) == 9362) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        composer2 = startRestartGroup;
        ScaffoldKt.m3518ScaffoldTvnljyQ(TestTagKt.testTag(WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m582backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), WindowInsets_androidKt.getDisplayCutout(WindowInsets.INSTANCE, startRestartGroup, 8)), "ticket_detail_screen"), ComposableLambdaKt.rememberComposableLambda(-2018170598, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i7) {
                String str;
                if ((i7 & 11) != 2 || !composer3.getSkipping()) {
                    TicketDetailState ticketDetailState2 = TicketDetailState.this;
                    TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                    if (ticketDetailContentState == null || (str = ticketDetailContentState.getTicketName()) == null) {
                        str = "";
                    }
                    TopActionBarKt.m12131TopActionBarNpQZenA(null, str, null, null, null, function03, Integer.valueOf(R.drawable.intercom_ic_close), false, IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13094getBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0L, null, null, composer3, 0, 0, 7325);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1401868325, true, new TicketDetailDestinationKt$TicketDetailScreen$4(ticketDetailState, function23, z2, z4), startRestartGroup, 54), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
