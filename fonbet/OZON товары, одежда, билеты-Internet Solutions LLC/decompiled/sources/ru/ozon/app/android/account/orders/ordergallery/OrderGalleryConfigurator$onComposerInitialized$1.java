package ru.ozon.app.android.account.orders.ordergallery;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderGalleryConfigurator$onComposerInitialized$1 extends AbstractC7737t implements Function1<FileDownloaderViewModel.Action, Unit> {
    final /* synthetic */ OrderGalleryConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderGalleryConfigurator$onComposerInitialized$1(OrderGalleryConfigurator orderGalleryConfigurator) {
        super(1);
        this.this$0 = orderGalleryConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FileDownloaderViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FileDownloaderViewModel.Action action) {
        if (action instanceof FileDownloaderViewModel.Action.Loading) {
            this.this$0.showLoading(((FileDownloaderViewModel.Action.Loading) action).getShow());
        } else if (action instanceof FileDownloaderViewModel.Action.DownloadError) {
            this.this$0.showDefaultErrorSnackBar();
        } else if (action instanceof FileDownloaderViewModel.Action.NoArchiveProgramError) {
            this.this$0.showSnackBar();
        }
    }
}
