package ru.ozon.app.android.uploadPhotos.delegate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UploadPhotosDelegate$uploadPhotosAdapter$3 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ UploadPhotosDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadPhotosDelegate$uploadPhotosAdapter$3(UploadPhotosDelegate uploadPhotosDelegate) {
        super(1);
        this.this$0 = uploadPhotosDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        UploadPhotosViewModel uploadPhotosViewModel;
        uploadPhotosViewModel = this.this$0.viewModel;
        if (uploadPhotosViewModel != null) {
            uploadPhotosViewModel.removeAttachedClick(j11);
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }
}
