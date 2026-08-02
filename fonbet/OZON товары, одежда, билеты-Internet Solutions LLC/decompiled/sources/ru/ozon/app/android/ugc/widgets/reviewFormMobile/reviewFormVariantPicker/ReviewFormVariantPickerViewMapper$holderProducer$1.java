package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVH;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ReviewFormVariantPickerViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, VariantPickerVH> {
    final /* synthetic */ ReviewFormVariantPickerViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormVariantPickerViewMapper$holderProducer$1(ReviewFormVariantPickerViewMapper reviewFormVariantPickerViewMapper) {
        super(2);
        this.this$0 = reviewFormVariantPickerViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final VariantPickerVH invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final ReviewFormVariantPickerViewMapper reviewFormVariantPickerViewMapper = this.this$0;
        return new VariantPickerVH((ReviewFormVariantPickerView) view, (ReviewFormViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.ReviewFormVariantPickerViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ReviewFormViewModel formViewModel = ReviewFormVariantPickerViewMapper.this.component().getFormViewModel();
                Intrinsics.g(formViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return formViewModel;
            }
        }).a(ReviewFormViewModel.class), refs);
    }
}
