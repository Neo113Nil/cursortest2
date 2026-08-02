package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import androidx.navigation.PopUpToBuilder;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class HelpCenterScreenKt$HelpCenterNavGraph$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ List<String> $collectionIds;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    HelpCenterScreenKt$HelpCenterNavGraph$1$1(HelpCenterViewModel helpCenterViewModel, List<String> list, NavHostController navHostController) {
        this.$viewModel = helpCenterViewModel;
        this.$collectionIds = list;
        this.$navController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        HelpCenterViewModel helpCenterViewModel = this.$viewModel;
        List<String> list = this.$collectionIds;
        final NavHostController navHostController = this.$navController;
        Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterNavGraph$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$0;
                invoke$lambda$0 = HelpCenterScreenKt$HelpCenterNavGraph$1$1.invoke$lambda$0(NavHostController.this, (String) obj);
                return invoke$lambda$0;
            }
        };
        final NavHostController navHostController2 = this.$navController;
        HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen(helpCenterViewModel, list, function1, new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterNavGraph$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$3;
                invoke$lambda$3 = HelpCenterScreenKt$HelpCenterNavGraph$1$1.invoke$lambda$3(NavHostController.this, (String) obj);
                return invoke$lambda$3;
            }
        }, composer, 72);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(NavHostController navController, String collectionId) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        NavController.navigate$default((NavController) navController, "COLLECTION_DETAILS/" + collectionId, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(NavHostController navController, String collectionId) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        navController.navigate("COLLECTION_DETAILS/" + collectionId + "?startDestination=true", new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterNavGraph$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$3$lambda$2;
                invoke$lambda$3$lambda$2 = HelpCenterScreenKt$HelpCenterNavGraph$1$1.invoke$lambda$3$lambda$2((NavOptionsBuilder) obj);
                return invoke$lambda$3$lambda$2;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo("COLLECTIONS", new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterNavGraph$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$3$lambda$2$lambda$1;
                invoke$lambda$3$lambda$2$lambda$1 = HelpCenterScreenKt$HelpCenterNavGraph$1$1.invoke$lambda$3$lambda$2$lambda$1((PopUpToBuilder) obj);
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
}
