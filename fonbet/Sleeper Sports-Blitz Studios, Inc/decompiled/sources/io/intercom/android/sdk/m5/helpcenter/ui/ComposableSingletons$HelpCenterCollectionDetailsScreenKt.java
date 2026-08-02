package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterCollectionDetailsScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$HelpCenterCollectionDetailsScreenKt {
    public static final ComposableSingletons$HelpCenterCollectionDetailsScreenKt INSTANCE = new ComposableSingletons$HelpCenterCollectionDetailsScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f236lambda1 = ComposableLambdaKt.composableLambdaInstance(904350452, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionDetailsScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(null, composer, 0, 1);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f237lambda2 = ComposableLambdaKt.composableLambdaInstance(-1111496463, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionDetailsScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 14) == 0) {
                i |= composer.changed(item) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                HelpCenterEmptyScreenKt.HelpCenterEmptyScreen(LazyItemScope.fillParentMaxHeight$default(item, Modifier.INSTANCE, 0.0f, 1, null), composer, 0, 0);
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f238lambda3 = ComposableLambdaKt.composableLambdaInstance(999489967, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionDetailsScreenKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(24), 0.0f, 0.0f, 13, null), composer, 6, 0);
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12414getLambda1$intercom_sdk_base_release() {
        return f236lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12415getLambda2$intercom_sdk_base_release() {
        return f237lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12416getLambda3$intercom_sdk_base_release() {
        return f238lambda3;
    }
}
