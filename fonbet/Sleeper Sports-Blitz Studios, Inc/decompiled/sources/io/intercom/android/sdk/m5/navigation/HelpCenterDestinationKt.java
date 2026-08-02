package io.intercom.android.sdk.m5.navigation;

import androidx.activity.ComponentActivity;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.compose.NavGraphBuilderKt;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterDestination.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, d2 = {"helpCenterDestination", "", "Landroidx/navigation/NavGraphBuilder;", "rootActivity", "Landroidx/activity/ComponentActivity;", "navController", "Landroidx/navigation/NavHostController;", "intercomRootActivityArgs", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HelpCenterDestinationKt {
    public static final void helpCenterDestination(NavGraphBuilder navGraphBuilder, ComponentActivity rootActivity, NavHostController navController, IntercomRootActivityArgs intercomRootActivityArgs) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(intercomRootActivityArgs, "intercomRootActivityArgs");
        NavGraphBuilderKt.composable$default(navGraphBuilder, "HELP_CENTER?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("transitionArgs", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit helpCenterDestination$lambda$0;
                helpCenterDestination$lambda$0 = HelpCenterDestinationKt.helpCenterDestination$lambda$0((NavArgumentBuilder) obj);
                return helpCenterDestination$lambda$0;
            }
        }), NamedNavArgumentKt.navArgument("isLaunchedProgrammatically", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit helpCenterDestination$lambda$1;
                helpCenterDestination$lambda$1 = HelpCenterDestinationKt.helpCenterDestination$lambda$1((NavArgumentBuilder) obj);
                return helpCenterDestination$lambda$1;
            }
        })}), (List) null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnterTransition helpCenterDestination$lambda$2;
                helpCenterDestination$lambda$2 = HelpCenterDestinationKt.helpCenterDestination$lambda$2((AnimatedContentTransitionScope) obj);
                return helpCenterDestination$lambda$2;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ExitTransition helpCenterDestination$lambda$3;
                helpCenterDestination$lambda$3 = HelpCenterDestinationKt.helpCenterDestination$lambda$3((AnimatedContentTransitionScope) obj);
                return helpCenterDestination$lambda$3;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnterTransition helpCenterDestination$lambda$4;
                helpCenterDestination$lambda$4 = HelpCenterDestinationKt.helpCenterDestination$lambda$4((AnimatedContentTransitionScope) obj);
                return helpCenterDestination$lambda$4;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ExitTransition helpCenterDestination$lambda$5;
                helpCenterDestination$lambda$5 = HelpCenterDestinationKt.helpCenterDestination$lambda$5((AnimatedContentTransitionScope) obj);
                return helpCenterDestination$lambda$5;
            }
        }, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-2139595832, true, new HelpCenterDestinationKt$helpCenterDestination$7(rootActivity, intercomRootActivityArgs, navController)), 132, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit helpCenterDestination$lambda$0(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(TransitionStyleKt.getTransitionArgNavType());
        navArgument.setDefaultValue(new TransitionArgs(null, null, null, null, 15, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit helpCenterDestination$lambda$1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        navArgument.setNullable(false);
        navArgument.setDefaultValue(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition helpCenterDestination$lambda$2(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getTargetState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition helpCenterDestination$lambda$3(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getInitialState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition helpCenterDestination$lambda$4(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getTargetState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition helpCenterDestination$lambda$5(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getInitialState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }
}
