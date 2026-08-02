package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ConversationEndedCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$ConversationEndedCardKt {
    public static final ComposableSingletons$ConversationEndedCardKt INSTANCE = new ComposableSingletons$ConversationEndedCardKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f78lambda1 = ComposableLambdaKt.composableLambdaInstance(-867938680, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ConversationEndedCardKt.ConversationEndedCard(null, null, new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, null, 2, null), null, 2, null), composer, (StringProvider.$stable | StringProvider.$stable) << 6, 3);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f79lambda2 = ComposableLambdaKt.composableLambdaInstance(-1449960304, false, ComposableSingletons$ConversationEndedCardKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f80lambda3 = ComposableLambdaKt.composableLambdaInstance(-156696201, false, ComposableSingletons$ConversationEndedCardKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f81lambda4 = ComposableLambdaKt.composableLambdaInstance(-324942016, false, ComposableSingletons$ConversationEndedCardKt$lambda4$1.INSTANCE);

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12036getLambda1$intercom_sdk_base_release() {
        return f78lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12037getLambda2$intercom_sdk_base_release() {
        return f79lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12038getLambda3$intercom_sdk_base_release() {
        return f80lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12039getLambda4$intercom_sdk_base_release() {
        return f81lambda4;
    }
}
