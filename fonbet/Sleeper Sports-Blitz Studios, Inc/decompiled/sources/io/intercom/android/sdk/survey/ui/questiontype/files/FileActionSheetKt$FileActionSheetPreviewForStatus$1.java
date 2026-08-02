package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.media3.common.MimeTypes;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileActionSheet.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class FileActionSheetKt$FileActionSheetPreviewForStatus$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Answer.MediaAnswer.FileUploadStatus $uploadStatus;

    FileActionSheetKt$FileActionSheetPreviewForStatus$1(Answer.MediaAnswer.FileUploadStatus fileUploadStatus) {
        this.$uploadStatus = fileUploadStatus;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Uri EMPTY = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            Answer.MediaAnswer.MediaItem mediaItem = new Answer.MediaAnswer.MediaItem(new MediaData.Media.Image(MimeTypes.IMAGE_PNG, 0, 0, 0L, "google.png", EMPTY, null, 64, null));
            mediaItem.setUploadStatus(this.$uploadStatus);
            FileActionSheetKt.FileActionSheet(mediaItem, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$FileActionSheetPreviewForStatus$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$FileActionSheetPreviewForStatus$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$FileActionSheetPreviewForStatus$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$FileActionSheetPreviewForStatus$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 28080);
            return;
        }
        composer.skipToGroupEnd();
    }
}
