package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.mapper;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.EmptyStateV3ViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.EmptyStateV3WidgetViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.view.EmptyStateV3View;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3WidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class EmptyStateV3FullWidgetViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, EmptyStateV3WidgetViewHolder> {
    final /* synthetic */ EmptyStateV3FullWidgetViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateV3FullWidgetViewMapper$holderProducer$1(EmptyStateV3FullWidgetViewMapper emptyStateV3FullWidgetViewMapper) {
        super(2);
        this.this$0 = emptyStateV3FullWidgetViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final EmptyStateV3WidgetViewHolder invoke(View view, ComposerReferences references) {
        WeakReference weakReference;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        EmptyStateV3View emptyStateV3View = (EmptyStateV3View) view;
        weakReference = this.this$0.composerScreenUiContainer;
        i iVar = weakReference != null ? (i) weakReference.get() : null;
        h viewModelOwnerProvider = references.getViewModelOwnerProvider();
        final EmptyStateV3FullWidgetViewMapper emptyStateV3FullWidgetViewMapper = this.this$0;
        return new EmptyStateV3WidgetViewHolder(emptyStateV3View, iVar, (EmptyStateV3ViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.mapper.EmptyStateV3FullWidgetViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                EmptyStateV3ViewModel emptyStateV3ViewModel = EmptyStateV3FullWidgetViewMapper.this.component().getEmptyStateV3ViewModel();
                Intrinsics.g(emptyStateV3ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return emptyStateV3ViewModel;
            }
        }).a(EmptyStateV3ViewModel.class), references);
    }
}
