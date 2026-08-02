package io.intercom.android.sdk.m5.navigation;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.compose.NavGraphBuilderKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTicketDestination.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"TICKET_TYPE_ID", "", "CONVERSATION_ID", "createTicketDestination", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "rootActivity", "Landroidx/activity/ComponentActivity;", "intercom-sdk-base_release", "uiState", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateTicketDestinationKt {
    public static final String CONVERSATION_ID = "conversation_id";
    public static final String TICKET_TYPE_ID = "ticket_type_id";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTicketDestination$navigateUp(NavHostController navHostController, ComponentActivity componentActivity) {
        if (navHostController.navigateUp()) {
            return;
        }
        componentActivity.finish();
    }

    public static final void createTicketDestination(NavGraphBuilder navGraphBuilder, NavHostController navController, ComponentActivity rootActivity) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        NavGraphBuilderKt.composable$default(navGraphBuilder, "CREATE_TICKET/{ticket_type_id}?conversation_id={conversation_id}?from={from}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument(TICKET_TYPE_ID, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit createTicketDestination$lambda$0;
                createTicketDestination$lambda$0 = CreateTicketDestinationKt.createTicketDestination$lambda$0((NavArgumentBuilder) obj);
                return createTicketDestination$lambda$0;
            }
        }), NamedNavArgumentKt.navArgument(CONVERSATION_ID, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit createTicketDestination$lambda$1;
                createTicketDestination$lambda$1 = CreateTicketDestinationKt.createTicketDestination$lambda$1((NavArgumentBuilder) obj);
                return createTicketDestination$lambda$1;
            }
        }), NamedNavArgumentKt.navArgument("from", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit createTicketDestination$lambda$2;
                createTicketDestination$lambda$2 = CreateTicketDestinationKt.createTicketDestination$lambda$2((NavArgumentBuilder) obj);
                return createTicketDestination$lambda$2;
            }
        })}), (List) null, IntercomTransitionsKt.getSlideUpEnterTransition(), IntercomTransitionsKt.getSlideDownExitTransition(), (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-521503931, true, new CreateTicketDestinationKt$createTicketDestination$4(rootActivity, navController)), 228, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTicketDestination$lambda$0(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.IntType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTicketDestination$lambda$1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        navArgument.setNullable(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTicketDestination$lambda$2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }
}
