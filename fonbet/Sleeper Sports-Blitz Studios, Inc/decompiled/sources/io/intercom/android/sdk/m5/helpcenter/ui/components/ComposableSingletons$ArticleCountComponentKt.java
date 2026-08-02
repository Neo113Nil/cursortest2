package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ArticleCountComponent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$ArticleCountComponentKt {
    public static final ComposableSingletons$ArticleCountComponentKt INSTANCE = new ComposableSingletons$ArticleCountComponentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f246lambda1 = ComposableLambdaKt.composableLambdaInstance(-464668656, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleCountComponentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ArticleCountComponentKt.ArticleCountComponent(BackgroundKt.m582backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), 12, composer, 48, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f247lambda2 = ComposableLambdaKt.composableLambdaInstance(-481008008, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleCountComponentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ArticleCountComponentKt.ArticleCountComponent(BackgroundKt.m582backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), 1, composer, 48, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12441getLambda1$intercom_sdk_base_release() {
        return f246lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12442getLambda2$intercom_sdk_base_release() {
        return f247lambda2;
    }
}
