package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.layoutManager.scroll.ScrollExtKt;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryNoUiV2VO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryOnScrollListener;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel;
import v10.C10183a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u0018!\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryNoUiViewHolder;", "Ld20/b;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryNoUiV2VO;", "Ll10/i;", "container", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModel;", "viewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModel;)V", "", "position", "Ll10/b;", "controller", "", "scrollToPosition", "(ILl10/b;)V", "item", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryNoUiV2VO;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2MainViewModel;", "ru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryNoUiViewHolder$layoutChangeListener$1", "layoutChangeListener", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryNoUiViewHolder$layoutChangeListener$1;", "Landroidx/recyclerview/widget/x;", "snapHelper", "Landroidx/recyclerview/widget/x;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener;", "onScrollListener", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryOnScrollListener;", "ru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryNoUiViewHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewHolders/ReviewGalleryNoUiViewHolder$lifecycleObserver$1;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView;", "getComposerRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "composerRecycler", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryNoUiViewHolder extends AbstractC6065b<ReviewGalleryNoUiV2VO> {

    @NotNull
    private final i container;

    @NotNull
    private final ReviewGalleryNoUiViewHolder$layoutChangeListener$1 layoutChangeListener;

    @NotNull
    private final ReviewGalleryNoUiViewHolder$lifecycleObserver$1 lifecycleObserver;
    private final View metricView;

    @NotNull
    private ReviewGalleryOnScrollListener onScrollListener;

    @NotNull
    private final x snapHelper;

    @NotNull
    private final ReviewGalleryV2MainViewModel viewModel;

    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryNoUiViewHolder$layoutChangeListener$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryNoUiViewHolder$lifecycleObserver$1] */
    public ReviewGalleryNoUiViewHolder(@NotNull i container, @NotNull ReviewGalleryV2MainViewModel viewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.container = container;
        this.viewModel = viewModel;
        this.layoutChangeListener = new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryNoUiViewHolder$layoutChangeListener$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                ReviewGalleryV2MainViewModel reviewGalleryV2MainViewModel;
                RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
                if (recyclerView == null) {
                    return;
                }
                reviewGalleryV2MainViewModel = ReviewGalleryNoUiViewHolder.this.viewModel;
                Integer value = reviewGalleryV2MainViewModel.getCurrentItemPosition().getValue();
                recyclerView.scrollToPosition(value != null ? value.intValue() : 0);
                if (ReviewGalleryOnScrollListener.INSTANCE.getPosition(recyclerView) != null) {
                    recyclerView.removeOnLayoutChangeListener(this);
                }
            }
        };
        this.snapHelper = new x();
        this.onScrollListener = new ReviewGalleryOnScrollListener(new ReviewGalleryNoUiViewHolder$onScrollListener$1(this));
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryNoUiViewHolder$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                RecyclerView composerRecycler;
                ReviewGalleryNoUiViewHolder$layoutChangeListener$1 reviewGalleryNoUiViewHolder$layoutChangeListener$1;
                Intrinsics.checkNotNullParameter(owner, "owner");
                ReviewGalleryNoUiViewHolder.this.getLifecycle().e(this);
                composerRecycler = ReviewGalleryNoUiViewHolder.this.getComposerRecycler();
                if (composerRecycler != null) {
                    reviewGalleryNoUiViewHolder$layoutChangeListener$1 = ReviewGalleryNoUiViewHolder.this.layoutChangeListener;
                    composerRecycler.removeOnLayoutChangeListener(reviewGalleryNoUiViewHolder$layoutChangeListener$1);
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                ReviewGalleryV2MainViewModel reviewGalleryV2MainViewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                reviewGalleryV2MainViewModel = ReviewGalleryNoUiViewHolder.this.viewModel;
                reviewGalleryV2MainViewModel.updatePlaybackState(false);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                RecyclerView composerRecycler;
                ReviewGalleryV2MainViewModel reviewGalleryV2MainViewModel;
                ReviewGalleryNoUiViewHolder$layoutChangeListener$1 reviewGalleryNoUiViewHolder$layoutChangeListener$1;
                Intrinsics.checkNotNullParameter(owner, "owner");
                composerRecycler = ReviewGalleryNoUiViewHolder.this.getComposerRecycler();
                if (composerRecycler != null) {
                    reviewGalleryNoUiViewHolder$layoutChangeListener$1 = ReviewGalleryNoUiViewHolder.this.layoutChangeListener;
                    composerRecycler.addOnLayoutChangeListener(reviewGalleryNoUiViewHolder$layoutChangeListener$1);
                }
                reviewGalleryV2MainViewModel = ReviewGalleryNoUiViewHolder.this.viewModel;
                reviewGalleryV2MainViewModel.updatePlaybackState(true);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getComposerRecycler() {
        return C10183a.j(this.container.Z());
    }

    private final void scrollToPosition(int position, InterfaceC7851b controller) {
        this.onScrollListener.setInitialPosition(position);
        controller.l(position);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        int i11;
        this.container.Q().g().getLifecycle().a(this.lifecycleObserver);
        RecyclerView composerRecycler = getComposerRecycler();
        if (composerRecycler != null) {
            composerRecycler.addOnScrollListener(this.onScrollListener);
            this.snapHelper.attachToRecyclerView(composerRecycler);
        }
        Integer value = this.viewModel.getCurrentItemPosition().getValue();
        if (value == null) {
            ReviewGalleryNoUiV2VO boundData = getBoundData();
            value = boundData != null ? boundData.getSelectedIndex() : null;
            if (value == null) {
                i11 = 0;
                this.viewModel.setCurrentItemPosition(i11);
                scrollToPosition(i11, this.container.M());
            }
        }
        i11 = value.intValue();
        this.viewModel.setCurrentItemPosition(i11);
        scrollToPosition(i11, this.container.M());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.snapHelper.attachToRecyclerView(null);
        RecyclerView composerRecycler = getComposerRecycler();
        if (composerRecycler != null) {
            composerRecycler.removeOnScrollListener(this.onScrollListener);
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ReviewGalleryNoUiV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.setOrientation(item.getOrientation());
        this.viewModel.checkIfOnBackActionRequired(item.getOnBackConfigKey());
        ScrollExtKt.scrollEnable(ComposerViewExtensionKt.composerRecyclerView(this.container.Z()), item.getOrientation() == 1);
    }
}
