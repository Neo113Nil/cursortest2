package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.ui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: IntercomButton.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$IntercomButtonKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$IntercomButtonKt$lambda2$1 INSTANCE = new ComposableSingletons$IntercomButtonKt$lambda2$1();

    ComposableSingletons$IntercomButtonKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m12907primaryStyleKlgxPg(0L, 0L, null, composer, 3072, 7), "Button", Integer.valueOf(R.drawable.intercom_send), new Function0() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 24960, 1);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
