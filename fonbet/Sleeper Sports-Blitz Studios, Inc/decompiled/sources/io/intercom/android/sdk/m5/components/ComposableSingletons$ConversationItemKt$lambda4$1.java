package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: ConversationItem.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationItemKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$ConversationItemKt$lambda4$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ConversationItemKt$lambda4$1 INSTANCE = new ComposableSingletons$ConversationItemKt$lambda4$1();

    ComposableSingletons$ConversationItemKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            float f = 16;
            ConversationItemKt.ConversationItem(ConversationItemKt.sampleConversationWithBot$default(null, 1, null), BackgroundKt.m582backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), PaddingKt.m1151PaddingValuesYgX7TsA(Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(f)), false, new Function0() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationItemKt$lambda-4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 24584, 8);
            return;
        }
        composer.skipToGroupEnd();
    }
}
