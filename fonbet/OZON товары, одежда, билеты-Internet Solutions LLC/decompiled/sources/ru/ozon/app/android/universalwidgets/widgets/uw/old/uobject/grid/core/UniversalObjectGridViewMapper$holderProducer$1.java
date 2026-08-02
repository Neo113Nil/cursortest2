package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.core;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.UniversalObjectGridViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.pixel.PixelAnalyticsViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/UniversalObjectGridViewHolder;", "v", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class UniversalObjectGridViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, UniversalObjectGridViewHolder> {
    final /* synthetic */ UniversalObjectGridViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniversalObjectGridViewMapper$holderProducer$1(UniversalObjectGridViewMapper universalObjectGridViewMapper) {
        super(2);
        this.this$0 = universalObjectGridViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final UniversalObjectGridViewHolder invoke(View v11, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(ref, "ref");
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final UniversalObjectGridViewMapper universalObjectGridViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.core.UniversalObjectGridViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PixelAnalyticsViewModel pixelAnalyticsViewModel = UniversalObjectGridViewMapper.this.component().getPixelAnalyticsViewModelProvider().get();
                Intrinsics.g(pixelAnalyticsViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pixelAnalyticsViewModel;
            }
        }).a(PixelAnalyticsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        return new UniversalObjectGridViewHolder(v11, ref, (PixelAnalyticsViewModel) a12);
    }
}
