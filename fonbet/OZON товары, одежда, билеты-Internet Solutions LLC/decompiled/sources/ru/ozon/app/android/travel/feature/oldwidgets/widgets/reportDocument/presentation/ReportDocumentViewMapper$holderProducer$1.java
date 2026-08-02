package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ReportDocumentViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ReportDocumentWidgetViewHolder> {
    final /* synthetic */ ReportDocumentViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportDocumentViewMapper$holderProducer$1(ReportDocumentViewMapper reportDocumentViewMapper) {
        super(2);
        this.this$0 = reportDocumentViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ReportDocumentWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final ReportDocumentViewMapper reportDocumentViewMapper = this.this$0;
        return new ReportDocumentWidgetViewHolder(view, refs, (FileDownloaderViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation.ReportDocumentViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FileDownloaderViewModel fileDownloaderViewModel = ReportDocumentViewMapper.this.component().getFileDownloaderViewModel();
                Intrinsics.g(fileDownloaderViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return fileDownloaderViewModel;
            }
        }).a(FileDownloaderViewModel.class));
    }
}
