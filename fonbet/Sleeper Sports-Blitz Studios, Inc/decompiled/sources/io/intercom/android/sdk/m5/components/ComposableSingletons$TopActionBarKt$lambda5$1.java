package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: TopActionBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-5$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$TopActionBarKt$lambda5$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TopActionBarKt$lambda5$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda5$1();

    ComposableSingletons$TopActionBarKt$lambda5$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            TopActionBarKt.m12131TopActionBarNpQZenA(null, "Hannah", null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-5$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, null, false, 0L, 0L, 0L, null, null, composer, 196656, 0, 8157);
        }
    }
}
