package ru.ozon.app.android.returns.actionModal.di;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$5$1 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ UploadPhotosViewModelComposeImpl $photosViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$5$1(UploadPhotosViewModelComposeImpl uploadPhotosViewModelComposeImpl) {
        super(1);
        this.$photosViewModel = uploadPhotosViewModelComposeImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        this.$photosViewModel.removeAttachedClick(j11);
    }
}
