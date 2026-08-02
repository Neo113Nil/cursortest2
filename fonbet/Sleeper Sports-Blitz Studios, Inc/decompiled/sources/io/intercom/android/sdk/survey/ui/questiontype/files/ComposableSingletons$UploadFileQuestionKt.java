package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: UploadFileQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$UploadFileQuestionKt {
    public static final ComposableSingletons$UploadFileQuestionKt INSTANCE = new ComposableSingletons$UploadFileQuestionKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f346lambda1 = ComposableLambdaKt.composableLambdaInstance(1435343954, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$UploadFileQuestionKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f347lambda2 = ComposableLambdaKt.composableLambdaInstance(-112786639, false, ComposableSingletons$UploadFileQuestionKt$lambda2$1.INSTANCE);

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12760getLambda1$intercom_sdk_base_release() {
        return f346lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12761getLambda2$intercom_sdk_base_release() {
        return f347lambda2;
    }
}
