package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HelpCenterDestination.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class HelpCenterDestinationKt$helpCenterDestination$7 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ IntercomRootActivityArgs $intercomRootActivityArgs;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ ComponentActivity $rootActivity;

    HelpCenterDestinationKt$helpCenterDestination$7(ComponentActivity componentActivity, IntercomRootActivityArgs intercomRootActivityArgs, NavHostController navHostController) {
        this.$rootActivity = componentActivity;
        this.$intercomRootActivityArgs = intercomRootActivityArgs;
        this.$navController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        List<String> emptyList;
        int i2;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle arguments = it.getArguments();
        boolean z = arguments != null ? arguments.getBoolean("isLaunchedProgrammatically") : false;
        HelpCenterViewModel.Companion companion = HelpCenterViewModel.INSTANCE;
        ComponentActivity componentActivity = this.$rootActivity;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        Intrinsics.checkNotNullExpressionValue(helpCenterApi, "getHelpCenterApi(...)");
        HelpCenterViewModel create = companion.create(componentActivity, helpCenterApi, MetricTracker.Place.COLLECTION_LIST);
        composer.startReplaceGroup(-102150257);
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
        MutableIntState mutableIntState = (MutableIntState) rememberedValue;
        composer.endReplaceGroup();
        IntercomRootActivityArgs intercomRootActivityArgs = this.$intercomRootActivityArgs;
        if (intercomRootActivityArgs instanceof IntercomRootActivityArgs.HelpCenterCollectionsArgs) {
            emptyList = ((IntercomRootActivityArgs.HelpCenterCollectionsArgs) intercomRootActivityArgs).getCollectionIds();
        } else if (intercomRootActivityArgs instanceof IntercomRootActivityArgs.HelpCenterCollectionArgs) {
            emptyList = CollectionsKt.listOf(((IntercomRootActivityArgs.HelpCenterCollectionArgs) intercomRootActivityArgs).getCollectionId());
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        List<String> list = emptyList;
        final NavHostController navHostController2 = this.$navController;
        final ComponentActivity componentActivity2 = this.$rootActivity;
        HelpCenterScreenKt.HelpCenterScreen(create, list, new Function0() { // from class: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$1;
                invoke$lambda$1 = HelpCenterDestinationKt$helpCenterDestination$7.invoke$lambda$1(NavHostController.this, componentActivity2);
                return invoke$lambda$1;
            }
        }, mutableIntState.getIntValue(), composer, 72);
        EffectsKt.LaunchedEffect("", new AnonymousClass2(null), composer, 70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(NavHostController navController, ComponentActivity rootActivity) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
        if (navController.getPreviousBackStackEntry() == null) {
            rootActivity.finish();
        } else {
            navController.navigateUp();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HelpCenterDestination.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7$2", f = "HelpCenterDestination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Injector.get().getMetricTracker().viewedSpace("help");
            return Unit.INSTANCE;
        }
    }
}
