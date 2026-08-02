package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import io.intercom.android.sdk.ui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: IntercomTopBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$IntercomTopBarKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$IntercomTopBarKt$lambda1$1 INSTANCE = new ComposableSingletons$IntercomTopBarKt$lambda1$1();

    ComposableSingletons$IntercomTopBarKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            IntercomTopBarKt.m12930IntercomTopBarbogVsAg(null, "TopBar Title", new IntercomTopBarIcon(R.drawable.intercom_ic_back, null, new Function0() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }), Alignment.INSTANCE.getCenterHorizontally(), 0L, 0L, null, null, composer, 3120, 241);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
