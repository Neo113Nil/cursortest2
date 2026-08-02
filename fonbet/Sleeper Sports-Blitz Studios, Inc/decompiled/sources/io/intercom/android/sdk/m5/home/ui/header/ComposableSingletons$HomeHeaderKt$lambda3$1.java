package io.intercom.android.sdk.m5.home.ui.header;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: HomeHeader.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$HomeHeaderKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HomeHeaderKt$lambda3$1 INSTANCE = new ComposableSingletons$HomeHeaderKt$lambda3$1();

    ComposableSingletons$HomeHeaderKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            HomeHeaderKt.HomeErrorHeader(null, new HomeUiState.Error.ErrorHeader("#FFFFFF", "#000000"), new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 384, 1);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
