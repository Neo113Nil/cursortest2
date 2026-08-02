package ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation;

import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation.viewmodel.HideTabBarOnScrollViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/HideTabBarOnScrollViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HideTabBarOnScrollViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, HideTabBarOnScrollViewHolder> {
    public static final HideTabBarOnScrollViewMapper$holderProducer$1 INSTANCE = new HideTabBarOnScrollViewMapper$holderProducer$1();

    HideTabBarOnScrollViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final HideTabBarOnScrollViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new HideTabBarOnScrollViewHolder(view, refs, (HideTabBarOnScrollViewModel) new z0(refs.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation.HideTabBarOnScrollViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new HideTabBarOnScrollViewModel();
            }
        }).a(HideTabBarOnScrollViewModel.class));
    }
}
