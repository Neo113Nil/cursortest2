package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.core;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpCouponListV2ViewHolder;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpCouponListV2ViewModel;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpCouponListV2ViewModelImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpCouponListV2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PdpCouponListV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, PdpCouponListV2ViewHolder> {
    final /* synthetic */ PdpCouponListV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdpCouponListV2ViewMapper$holderProducer$1(PdpCouponListV2ViewMapper pdpCouponListV2ViewMapper) {
        super(2);
        this.this$0 = pdpCouponListV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final PdpCouponListV2ViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final PdpCouponListV2ViewMapper pdpCouponListV2ViewMapper = this.this$0;
        Object a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.pdpCouponListV2.core.PdpCouponListV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PdpCouponListV2ViewModelImpl pdpCouponListV2ViewModelImpl = PdpCouponListV2ViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(pdpCouponListV2ViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pdpCouponListV2ViewModelImpl;
            }
        }).a(PdpCouponListV2ViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new PdpCouponListV2ViewHolder(view, refs, (PdpCouponListV2ViewModel) a11);
    }
}
