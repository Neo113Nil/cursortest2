package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.objectweb.asm.Opcodes;

/* compiled from: PreviewTopBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.preview.ui.ComposableSingletons$PreviewTopBarKt$lambda-5$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$PreviewTopBarKt$lambda5$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PreviewTopBarKt$lambda5$1 INSTANCE = new ComposableSingletons$PreviewTopBarKt$lambda5$1();

    ComposableSingletons$PreviewTopBarKt$lambda5$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            PreviewTopBarKt.PreviewTopBar(null, true, true, true, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.ComposableSingletons$PreviewTopBarKt$lambda-5$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.ComposableSingletons$PreviewTopBarKt$lambda-5$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, null, null, composer, 224688, Opcodes.INSTANCEOF);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
