package io.intercom.android.sdk.survey.ui.questiontype.choice;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import com.facebook.imageutils.JfifUtil;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ChoicePill.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$ChoicePillKt {
    public static final ComposableSingletons$ChoicePillKt INSTANCE = new ComposableSingletons$ChoicePillKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f324lambda1 = ComposableLambdaKt.composableLambdaInstance(1290931139, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$ChoicePillKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ChoicePillKt.m12723ChoicePillUdaoDFU(false, null, "Option 1", 0L, 0.0f, 0L, null, 0L, composer, 390, 250);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f325lambda2 = ComposableLambdaKt.composableLambdaInstance(614841349, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$ChoicePillKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ChoicePillKt.m12723ChoicePillUdaoDFU(true, null, "Option 1", 0L, 0.0f, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)).m12628getButton0d7_KjU(), null, 0L, composer, 390, JfifUtil.MARKER_SOS);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f326lambda3 = ComposableLambdaKt.composableLambdaInstance(238848687, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$ChoicePillKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ChoicePillKt.m12723ChoicePillUdaoDFU(true, null, "Option 1", 0L, 0.0f, Color.INSTANCE.m6066getBlue0d7_KjU(), null, 0L, composer, 196998, JfifUtil.MARKER_SOS);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f327lambda4 = ComposableLambdaKt.composableLambdaInstance(-2037921924, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$ChoicePillKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ChoicePillKt.m12723ChoicePillUdaoDFU(true, null, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", 0L, 0.0f, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)).m12628getButton0d7_KjU(), null, 0L, composer, 390, JfifUtil.MARKER_SOS);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12724getLambda1$intercom_sdk_base_release() {
        return f324lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12725getLambda2$intercom_sdk_base_release() {
        return f325lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12726getLambda3$intercom_sdk_base_release() {
        return f326lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12727getLambda4$intercom_sdk_base_release() {
        return f327lambda4;
    }
}
