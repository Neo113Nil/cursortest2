package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.core;

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
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.regulardraw.databinding.WidgetMainDrawMajorScreenBinding;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenViewHolder;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class MainDrawMajorScreenViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, MainDrawMajorScreenViewHolder> {
    final /* synthetic */ MainDrawMajorScreenViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainDrawMajorScreenViewMapper$holderProducer$1(MainDrawMajorScreenViewMapper mainDrawMajorScreenViewMapper) {
        super(2);
        this.this$0 = mainDrawMajorScreenViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MainDrawMajorScreenViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetMainDrawMajorScreenBinding bind = WidgetMainDrawMajorScreenBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        MorkovskOnboardingDelegate onboardingDelegate = this.this$0.component().getOnboardingDelegate();
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final MainDrawMajorScreenViewMapper mainDrawMajorScreenViewMapper = this.this$0;
        return new MainDrawMajorScreenViewHolder(refs, bind, tokenizedAnalytics, onboardingDelegate, customActionHandlersStoreFactory, (MainDrawMajorScreenViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.core.MainDrawMajorScreenViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                MainDrawMajorScreenViewModel mainDrawMajorScreenViewModel = MainDrawMajorScreenViewMapper.this.component().getMainDrawMajorScreenViewModel();
                Intrinsics.g(mainDrawMajorScreenViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return mainDrawMajorScreenViewModel;
            }
        }).a(MainDrawMajorScreenViewModel.class));
    }
}
