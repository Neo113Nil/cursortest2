package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DropDownQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$DropDownQuestionKt {
    public static final ComposableSingletons$DropDownQuestionKt INSTANCE = new ComposableSingletons$DropDownQuestionKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f331lambda1 = ComposableLambdaKt.composableLambdaInstance(-1681097297, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.ComposableSingletons$DropDownQuestionKt$lambda-1$1
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
    public static Function2<Composer, Integer, Unit> f332lambda2 = ComposableLambdaKt.composableLambdaInstance(1247370603, false, ComposableSingletons$DropDownQuestionKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f333lambda3 = ComposableLambdaKt.composableLambdaInstance(1532619110, false, ComposableSingletons$DropDownQuestionKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f334lambda4 = ComposableLambdaKt.composableLambdaInstance(157266840, false, ComposableSingletons$DropDownQuestionKt$lambda4$1.INSTANCE);

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12738getLambda1$intercom_sdk_base_release() {
        return f331lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12739getLambda2$intercom_sdk_base_release() {
        return f332lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12740getLambda3$intercom_sdk_base_release() {
        return f333lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12741getLambda4$intercom_sdk_base_release() {
        return f334lambda4;
    }
}
