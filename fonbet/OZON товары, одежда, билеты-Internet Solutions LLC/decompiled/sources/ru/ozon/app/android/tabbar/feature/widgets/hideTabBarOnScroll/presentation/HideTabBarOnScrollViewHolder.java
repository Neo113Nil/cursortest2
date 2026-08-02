package ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation.viewmodel.HideTabBarOnScrollViewModel;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0019\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/HideTabBarOnScrollViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/HideTabBarOnScrollVO;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/viewmodel/HideTabBarOnScrollViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/viewmodel/HideTabBarOnScrollViewModel;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/HideTabBarOnScrollVO;Ll20/d;)V", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "onAttach", "onDetach", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/viewmodel/HideTabBarOnScrollViewModel;", "ru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/HideTabBarOnScrollViewHolder$onScrollListener$1", "onScrollListener", "Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/HideTabBarOnScrollViewHolder$onScrollListener$1;", "Landroidx/recyclerview/widget/RecyclerView;", "getComposerRv", "()Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HideTabBarOnScrollViewHolder extends k<HideTabBarOnScrollVO> {

    @NotNull
    private final HideTabBarOnScrollViewHolder$onScrollListener$1 onScrollListener;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final HideTabBarOnScrollViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation.HideTabBarOnScrollViewHolder$onScrollListener$1] */
    public HideTabBarOnScrollViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull HideTabBarOnScrollViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.refs = refs;
        this.viewModel = viewModel;
        this.onScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation.HideTabBarOnScrollViewHolder$onScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                HideTabBarOnScrollViewModel hideTabBarOnScrollViewModel;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                hideTabBarOnScrollViewModel = HideTabBarOnScrollViewHolder.this.viewModel;
                hideTabBarOnScrollViewModel.onScrolled(dy);
            }
        };
    }

    private final RecyclerView getComposerRv() {
        View view;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerRecyclerViewOrNull(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HideTabBarOnScrollVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        RecyclerView composerRv = getComposerRv();
        if (composerRv != null) {
            composerRv.addOnScrollListener(this.onScrollListener);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        RecyclerView composerRv = getComposerRv();
        if (composerRv != null) {
            composerRv.removeOnScrollListener(this.onScrollListener);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.viewModel.onViewInVisibleBounds();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        this.viewModel.onViewOutOfVisibleBounds();
    }
}
