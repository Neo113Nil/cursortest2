package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AddFileButton.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$AddFileButtonKt {
    public static final ComposableSingletons$AddFileButtonKt INSTANCE = new ComposableSingletons$AddFileButtonKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f335lambda1 = ComposableLambdaKt.composableLambdaInstance(-1360176596, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$AddFileButtonKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                AddFileButtonKt.AddFileButton(null, R.string.intercom_tickets_add_file, composer, 0, 1);
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12746getLambda1$intercom_sdk_base_release() {
        return f335lambda1;
    }
}
