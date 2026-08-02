package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadSizeLimitDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$UploadSizeLimitDialogKt {
    public static final ComposableSingletons$UploadSizeLimitDialogKt INSTANCE = new ComposableSingletons$UploadSizeLimitDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f174lambda1 = ComposableLambdaKt.composableLambdaInstance(133212014, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$UploadSizeLimitDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_ok, composer, 0), null, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13090getActionContrastWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04SemiBold(), composer, 0, 0, 131066);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f175lambda2 = ComposableLambdaKt.composableLambdaInstance(1891807555, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$UploadSizeLimitDialogKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                UploadSizeLimitDialogKt.UploadSizeLimitDialog("Couldn't send", "Can't send files over 100MB", null, composer, 54, 4);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m12211getLambda1$intercom_sdk_base_release() {
        return f174lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12212getLambda2$intercom_sdk_base_release() {
        return f175lambda2;
    }
}
