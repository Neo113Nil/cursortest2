package ru.ozon.app.android.widgets.commonTextWidget.cellList.core;

import Vg.d;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.actionHandlers.applySorting.ApplySortingViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.widgets.commonTextWidget.cellList.presentation.CellV2ViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class CellListV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CellV2ViewHolder> {
    final /* synthetic */ CellListV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellListV2ViewMapper$holderProducer$1(CellListV2ViewMapper cellListV2ViewMapper) {
        super(2);
        this.this$0 = cellListV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CellV2ViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final CellListV2ViewMapper cellListV2ViewMapper = this.this$0;
        return new CellV2ViewHolder(view, refs, customActionHandlersStoreFactory, (ApplySortingViewModel) new z0(viewModelOwnerProvider.b(), new z0.c() { // from class: ru.ozon.app.android.widgets.commonTextWidget.cellList.core.CellListV2ViewMapper$holderProducer$1$invoke$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ApplySortingViewModel applySortingViewModel = CellListV2ViewMapper.this.component().getApplySortingViewModel();
                Intrinsics.g(applySortingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return applySortingViewModel;
            }
        }).a(ApplySortingViewModel.class));
    }
}
