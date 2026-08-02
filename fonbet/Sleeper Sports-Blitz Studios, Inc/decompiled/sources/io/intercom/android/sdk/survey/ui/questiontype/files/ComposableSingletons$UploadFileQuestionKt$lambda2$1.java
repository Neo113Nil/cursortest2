package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.runtime.Composer;
import androidx.media3.common.MimeTypes;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadFileQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$UploadFileQuestionKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$UploadFileQuestionKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$UploadFileQuestionKt$lambda2$1 INSTANCE = new ComposableSingletons$UploadFileQuestionKt$lambda2$1();

    ComposableSingletons$UploadFileQuestionKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            UploadFileQuestionKt.UploadFileQuestion(null, new SurveyData.Step.Question.UploadFileQuestionModel("", CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Attachments")), null, false, 1, SetsKt.setOf((Object[]) new String[]{"image/jpeg", MimeTypes.IMAGE_PNG}), 4, null), null, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$UploadFileQuestionKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$UploadFileQuestionKt$lambda2$1.invoke$lambda$0((Answer) obj);
                    return invoke$lambda$0;
                }
            }, null, null, composer, 3136, 53);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Answer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
