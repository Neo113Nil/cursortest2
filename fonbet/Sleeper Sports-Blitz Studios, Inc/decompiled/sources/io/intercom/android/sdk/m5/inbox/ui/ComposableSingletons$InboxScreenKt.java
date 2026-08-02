package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import io.intercom.android.sdk.ui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InboxScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$InboxScreenKt {
    public static final ComposableSingletons$InboxScreenKt INSTANCE = new ComposableSingletons$InboxScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f297lambda1 = ComposableLambdaKt.composableLambdaInstance(-455897824, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_edit, composer, 0), (String) null, (Modifier) null, 0L, composer, 56, 12);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f298lambda2 = ComposableLambdaKt.composableLambdaInstance(877667555, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-2$1
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
                InboxScreenKt.InboxLoadingRow(composer, 0);
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f299lambda3 = ComposableLambdaKt.composableLambdaInstance(64179351, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxScreenKt$lambda-3$1
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
                InboxLoadingScreenKt.InboxLoadingScreen(composer, 0);
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12539getLambda1$intercom_sdk_base_release() {
        return f297lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12540getLambda2$intercom_sdk_base_release() {
        return f298lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m12541getLambda3$intercom_sdk_base_release() {
        return f299lambda3;
    }
}
