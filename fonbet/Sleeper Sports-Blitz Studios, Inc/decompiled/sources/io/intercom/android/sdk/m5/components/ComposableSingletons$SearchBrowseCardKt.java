package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchBrowseCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$SearchBrowseCardKt {
    public static final ComposableSingletons$SearchBrowseCardKt INSTANCE = new ComposableSingletons$SearchBrowseCardKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f119lambda1 = ComposableLambdaKt.composableLambdaInstance(1563709076, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, CollectionsKt.listOf((Object[]) new SuggestedArticle[]{new SuggestedArticle("", "How to restart recording", ""), new SuggestedArticle("", "How to track your recording time", ""), new SuggestedArticle("", "How to correct your transcript", "")}));
                Avatar create = Avatar.create("", "VR");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Avatar create2 = Avatar.create("", "PR");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                Avatar create3 = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create3, "create(...)");
                List listOf = CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(create, false, 2, null), new AvatarWrapper(create2, false, 2, null), new AvatarWrapper(create3, false, 2, null)});
                MetricTracker metricTracker = Injector.get().getMetricTracker();
                Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
                SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, true, listOf, true, metricTracker, composer, 36408);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f120lambda2 = ComposableLambdaKt.composableLambdaInstance(-1740562678, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, CollectionsKt.emptyList());
                Avatar create = Avatar.create("", "VR");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Avatar create2 = Avatar.create("", "PR");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                Avatar create3 = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create3, "create(...)");
                List listOf = CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(create, false, 2, null), new AvatarWrapper(create2, false, 2, null), new AvatarWrapper(create3, false, 2, null)});
                MetricTracker metricTracker = Injector.get().getMetricTracker();
                Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
                SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, true, listOf, true, metricTracker, composer, 36408);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f121lambda3 = ComposableLambdaKt.composableLambdaInstance(130670641, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, CollectionsKt.listOf((Object[]) new SuggestedArticle[]{new SuggestedArticle("", "How to restart recording", ""), new SuggestedArticle("", "How to track your recording time", ""), new SuggestedArticle("", "How to correct your transcript", "")}));
                Avatar create = Avatar.create("", "VR");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Avatar create2 = Avatar.create("", "PR");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                Avatar create3 = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create3, "create(...)");
                List listOf = CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(create, false, 2, null), new AvatarWrapper(create2, false, 2, null), new AvatarWrapper(create3, false, 2, null)});
                MetricTracker metricTracker = Injector.get().getMetricTracker();
                Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
                SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, false, listOf, true, metricTracker, composer, 36408);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f122lambda4 = ComposableLambdaKt.composableLambdaInstance(1883897723, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, CollectionsKt.emptyList());
                Avatar create = Avatar.create("", "VR");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Avatar create2 = Avatar.create("", "PR");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                Avatar create3 = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create3, "create(...)");
                List listOf = CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(create, false, 2, null), new AvatarWrapper(create2, false, 2, null), new AvatarWrapper(create3, false, 2, null)});
                MetricTracker metricTracker = Injector.get().getMetricTracker();
                Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
                SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, false, listOf, true, metricTracker, composer, 36408);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12083getLambda1$intercom_sdk_base_release() {
        return f119lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12084getLambda2$intercom_sdk_base_release() {
        return f120lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12085getLambda3$intercom_sdk_base_release() {
        return f121lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12086getLambda4$intercom_sdk_base_release() {
        return f122lambda4;
    }
}
