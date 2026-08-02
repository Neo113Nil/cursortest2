package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: HelpCenterTopBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$HelpCenterTopBarKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$HelpCenterTopBarKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HelpCenterTopBarKt$lambda1$1 INSTANCE = new ComposableSingletons$HelpCenterTopBarKt$lambda1$1();

    ComposableSingletons$HelpCenterTopBarKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            HelpCenterTopBarKt.HelpCenterTopBar(new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$HelpCenterTopBarKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$HelpCenterTopBarKt$lambda-1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, 0, null, composer, 54, 12);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
