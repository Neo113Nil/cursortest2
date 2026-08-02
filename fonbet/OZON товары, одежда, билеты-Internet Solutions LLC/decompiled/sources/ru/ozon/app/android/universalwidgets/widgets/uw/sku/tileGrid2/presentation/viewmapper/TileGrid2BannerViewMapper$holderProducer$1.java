package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModelImpl;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.TileGrid2BannerView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BannerViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2BannerViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TileGrid2BannerViewHolder> {
    final /* synthetic */ TileGrid2BannerViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2BannerViewMapper$holderProducer$1(TileGrid2BannerViewMapper tileGrid2BannerViewMapper) {
        super(2);
        this.this$0 = tileGrid2BannerViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TileGrid2BannerViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        TileGrid2BannerView tileGrid2BannerView = (TileGrid2BannerView) view;
        FrameBinder frameBinder = this.this$0.component().getFrameBinder();
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final TileGrid2BannerViewMapper tileGrid2BannerViewMapper = this.this$0;
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TileGrid2BannerViewModelImpl tileGrid2BannerViewModelImpl = TileGrid2BannerViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(tileGrid2BannerViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return tileGrid2BannerViewModelImpl;
            }
        }).a(TileGrid2BannerViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new TileGrid2BannerViewHolder(tileGrid2BannerView, frameBinder, (TileGrid2BannerViewModelImpl) a11, this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getTileBackgroundHolder(), refs);
    }
}
