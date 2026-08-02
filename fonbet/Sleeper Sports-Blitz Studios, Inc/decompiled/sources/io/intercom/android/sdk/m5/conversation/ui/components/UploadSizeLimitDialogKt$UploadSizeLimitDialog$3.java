package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: UploadSizeLimitDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class UploadSizeLimitDialogKt$UploadSizeLimitDialog$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onDismiss;

    UploadSizeLimitDialogKt$UploadSizeLimitDialog$3(Function0<Unit> function0) {
        this.$onDismiss = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            composer.startReplaceGroup(-891282084);
            boolean changed = composer.changed(this.$onDismiss);
            final Function0<Unit> function0 = this.$onDismiss;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = UploadSizeLimitDialogKt$UploadSizeLimitDialog$3.invoke$lambda$1$lambda$0(Function0.this);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.TextButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$UploadSizeLimitDialogKt.INSTANCE.m12211getLambda1$intercom_sdk_base_release(), composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
