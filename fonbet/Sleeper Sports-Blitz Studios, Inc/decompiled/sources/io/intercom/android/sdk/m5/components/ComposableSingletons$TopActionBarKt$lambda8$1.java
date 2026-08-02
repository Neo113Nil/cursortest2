package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopActionBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-8$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$TopActionBarKt$lambda8$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$TopActionBarKt$lambda8$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda8$1();

    ComposableSingletons$TopActionBarKt$lambda8$1() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope TopActionBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TopActionBar, "$this$TopActionBar");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            IconButtonKt.IconButton(new Function0() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-8$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, null, false, null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m12098getLambda7$intercom_sdk_base_release(), composer, 1572870, 62);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
