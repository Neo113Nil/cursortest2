package ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.mapper;

import Vg.d;
import WZ.l;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.BoxListViewModel;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.view.BoxListView;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.viewHolder.BoxListWidgetViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/viewHolder/BoxListWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BoxListViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, BoxListWidgetViewHolder> {
    final /* synthetic */ BoxListViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BoxListViewMapper$holderProducer$1(BoxListViewMapper boxListViewMapper) {
        super(2);
        this.this$0 = boxListViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final BoxListWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        BoxListView boxListView = (BoxListView) view;
        d actionHandlersStoreFactory = this.this$0.component().getActionHandlersStoreFactory();
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final BoxListViewMapper boxListViewMapper = this.this$0;
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.mapper.BoxListViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                BoxListViewModel boxListViewModel = BoxListViewMapper.this.component().getBoxListViewModelProvider().get();
                Intrinsics.g(boxListViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return boxListViewModel;
            }
        }).a(BoxListViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new BoxListWidgetViewHolder(actionHandlersStoreFactory, boxListView, refs, tokenizedAnalytics, (BoxListViewModel) a11);
    }
}
