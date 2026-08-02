package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: ReactionsComponent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.helpcenter.articles.ComposableSingletons$ReactionsComponentKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$ReactionsComponentKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ReactionsComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$ReactionsComponentKt$lambda1$1();

    ComposableSingletons$ReactionsComponentKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            ReactionsComponentKt.ReactionsComponent(null, ArticleViewState.ReactionState.INSTANCE.getDefaultReactionState(), new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.ComposableSingletons$ReactionsComponentKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.ComposableSingletons$ReactionsComponentKt$lambda-1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.ComposableSingletons$ReactionsComponentKt$lambda-1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 28080, 1);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
