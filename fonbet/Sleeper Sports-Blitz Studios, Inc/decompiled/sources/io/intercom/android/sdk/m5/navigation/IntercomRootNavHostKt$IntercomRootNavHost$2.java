package io.intercom.android.sdk.m5.navigation;

import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IntercomRootNavHost.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class IntercomRootNavHostKt$IntercomRootNavHost$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ IntercomRootActivityArgs $intercomRootActivityArgs;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ ComponentActivity $rootActivity;
    final /* synthetic */ CoroutineScope $scope;

    IntercomRootNavHostKt$IntercomRootNavHost$2(NavHostController navHostController, IntercomRootActivityArgs intercomRootActivityArgs, ComponentActivity componentActivity, CoroutineScope coroutineScope) {
        this.$navController = navHostController;
        this.$intercomRootActivityArgs = intercomRootActivityArgs;
        this.$rootActivity = componentActivity;
        this.$scope = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            final NavHostController navHostController = this.$navController;
            final IntercomRootActivityArgs intercomRootActivityArgs = this.$intercomRootActivityArgs;
            final ComponentActivity componentActivity = this.$rootActivity;
            final CoroutineScope coroutineScope = this.$scope;
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(composer);
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            NavHostKt.NavHost(navHostController, intercomRootActivityArgs.getRoute(), null, null, null, null, null, null, null, null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt$IntercomRootNavHost$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = IntercomRootNavHostKt$IntercomRootNavHost$2.invoke$lambda$1$lambda$0(NavHostController.this, componentActivity, coroutineScope, intercomRootActivityArgs, (NavGraphBuilder) obj);
                    return invoke$lambda$1$lambda$0;
                }
            }, composer, 8, 0, 1020);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(NavHostController navController, ComponentActivity rootActivity, CoroutineScope scope, IntercomRootActivityArgs intercomRootActivityArgs, NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(intercomRootActivityArgs, "$intercomRootActivityArgs");
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        HomeScreenDestinationKt.homeScreen(NavHost, navController, rootActivity, scope);
        MessagesDestinationKt.messagesDestination(NavHost, navController, rootActivity);
        HelpCenterDestinationKt.helpCenterDestination(NavHost, rootActivity, navController, intercomRootActivityArgs);
        TicketDetailDestinationKt.ticketDetailDestination(NavHost, navController, rootActivity);
        ConversationDestinationKt.conversationDestination(NavHost, navController, rootActivity);
        TicketsDestinationKt.ticketsDestination(NavHost, navController, rootActivity);
        CreateTicketDestinationKt.createTicketDestination(NavHost, navController, rootActivity);
        return Unit.INSTANCE;
    }
}
