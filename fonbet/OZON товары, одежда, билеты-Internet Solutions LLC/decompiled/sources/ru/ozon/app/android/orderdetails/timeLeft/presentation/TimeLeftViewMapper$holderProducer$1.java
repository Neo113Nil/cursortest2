package ru.ozon.app.android.orderdetails.timeLeft.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.WidgetTimeLeftLayoutBinding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimeLeftWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TimeLeftViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TimeLeftWidgetViewHolder> {
    final /* synthetic */ TimeLeftViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimeLeftViewMapper$holderProducer$1(TimeLeftViewMapper timeLeftViewMapper) {
        super(2);
        this.this$0 = timeLeftViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TimeLeftWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetTimeLeftLayoutBinding bind = WidgetTimeLeftLayoutBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        InterfaceC7851b controller = ref.getController();
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final TimeLeftViewMapper timeLeftViewMapper = this.this$0;
        return new TimeLeftWidgetViewHolder(bind, controller, ref, (CreateAndPayViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.orderdetails.timeLeft.presentation.TimeLeftViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CreateAndPayViewModel createAndPayViewModel = TimeLeftViewMapper.this.component().getCreateAndPayViewModel();
                Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel;
            }
        }).a(CreateAndPayViewModel.class), this.this$0.component().getStartupArgsService());
    }
}
