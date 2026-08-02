package ru.ozon.app.android.ugc.core.widgets.singlereview.buttons;

import a00.h;
import a00.j;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewViewModel;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewViewModelImpl;
import ru.ozon.app.android.ugc.core.databinding.ItemSingleReviewButtonsBinding;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/singlereview/buttons/ButtonsViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ButtonsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ButtonsViewHolder> {
    final /* synthetic */ ButtonsViewMapper this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.ButtonsViewMapper$holderProducer$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<UgcCachedActionsSharedViewModel> {
        final /* synthetic */ ButtonsViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ButtonsViewMapper buttonsViewMapper) {
            super(0);
            this.this$0 = buttonsViewMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UgcCachedActionsSharedViewModel invoke() {
            return this.this$0.component().ugcCachedActionsSharedViewModelProvider().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonsViewMapper$holderProducer$1(ButtonsViewMapper buttonsViewMapper) {
        super(2);
        this.this$0 = buttonsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ButtonsViewHolder invoke(View view, ComposerReferences ref) {
        Map map;
        Map map2;
        ButtonsViewMapper$buttonsDecorator$1 buttonsViewMapper$buttonsDecorator$1;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        ItemSingleReviewButtonsBinding bind = ItemSingleReviewButtonsBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final ButtonsViewMapper buttonsViewMapper = this.this$0;
        Object a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.ButtonsViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SingleReviewViewModelImpl singleReviewViewModelImpl = ButtonsViewMapper.this.component().viewModelProvider().get();
                Intrinsics.g(singleReviewViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return singleReviewViewModelImpl;
            }
        }).a(SingleReviewViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
        SingleReviewViewModel singleReviewViewModel = (SingleReviewViewModel) a12;
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        w0 w0Var = (w0) j.a(viewModelOwnerProvider.b(), N.b(UgcCachedActionsSharedViewModel.class), new AnonymousClass2(this.this$0)).getValue();
        Intrinsics.checkNotNullExpressionValue(w0Var, "sharedViewModel(...)");
        UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel = (UgcCachedActionsSharedViewModel) w0Var;
        map = this.this$0.leftButtonConfigs;
        map2 = this.this$0.rightButtonConfigs;
        buttonsViewMapper$buttonsDecorator$1 = this.this$0.buttonsDecorator;
        return new ButtonsViewHolder(bind, singleReviewViewModel, ref, ugcCachedActionsSharedViewModel, map, map2, buttonsViewMapper$buttonsDecorator$1);
    }
}
