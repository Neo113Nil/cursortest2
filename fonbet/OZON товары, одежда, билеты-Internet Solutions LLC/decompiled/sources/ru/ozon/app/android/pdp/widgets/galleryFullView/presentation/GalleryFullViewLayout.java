package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.databinding.PdpWidgetRedesignGalleryFullViewBinding;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewLayout;", "", "<init>", "()V", "id", "", "getId", "()I", "bind", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewLayout$ViewBinding;", "view", "Landroid/view/View;", "ViewBinding", "ViewBindingImpl", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewLayout {
    private final int id = R$layout.pdp_widget_redesign_gallery_full_view;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewLayout$ViewBinding;", "", "previewRv", "Landroidx/recyclerview/widget/RecyclerView;", "getPreviewRv", "()Landroidx/recyclerview/widget/RecyclerView;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "galleryContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getGalleryContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "hidePreviewRv", "", "showPreviewRv", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ViewBinding {
        @NotNull
        ConstraintLayout getGalleryContainer();

        @NotNull
        RecyclerView getPreviewRv();

        @NotNull
        ViewPager2 getViewPager();

        void hidePreviewRv();

        void showPreviewRv();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewLayout$ViewBindingImpl;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewLayout$ViewBinding;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "binding", "Lru/ozon/app/android/pdp/databinding/PdpWidgetRedesignGalleryFullViewBinding;", "previewRv", "Landroidx/recyclerview/widget/RecyclerView;", "getPreviewRv", "()Landroidx/recyclerview/widget/RecyclerView;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "galleryContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getGalleryContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "hidePreviewRv", "", "showPreviewRv", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ViewBindingImpl implements ViewBinding {

        @NotNull
        private final PdpWidgetRedesignGalleryFullViewBinding binding;

        @NotNull
        private final ConstraintLayout galleryContainer;

        @NotNull
        private final RecyclerView previewRv;

        @NotNull
        private final ViewPager2 viewPager;

        public ViewBindingImpl(@NotNull View containerView) {
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            PdpWidgetRedesignGalleryFullViewBinding bind = PdpWidgetRedesignGalleryFullViewBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
            RecyclerView previewRv = bind.previewRv;
            Intrinsics.checkNotNullExpressionValue(previewRv, "previewRv");
            this.previewRv = previewRv;
            ViewPager2 viewPager = bind.viewPager;
            Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
            this.viewPager = viewPager;
            ConstraintLayout root = bind.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            this.galleryContainer = root;
        }

        @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewLayout.ViewBinding
        @NotNull
        public ConstraintLayout getGalleryContainer() {
            return this.galleryContainer;
        }

        @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewLayout.ViewBinding
        @NotNull
        public RecyclerView getPreviewRv() {
            return this.previewRv;
        }

        @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewLayout.ViewBinding
        @NotNull
        public ViewPager2 getViewPager() {
            return this.viewPager;
        }

        @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewLayout.ViewBinding
        public void hidePreviewRv() {
            ViewExtKt.gone(getPreviewRv());
            ViewPager2 viewPager = getViewPager();
            ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            int i11 = marginLayoutParams.topMargin;
            int i12 = marginLayoutParams.rightMargin;
            int i13 = marginLayoutParams.bottomMargin;
            marginLayoutParams.bottomMargin = 0;
            ViewGroup.LayoutParams layoutParams2 = viewPager.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i11 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = viewPager.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i12 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = viewPager.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i13 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                        return;
                    }
                }
            }
            viewPager.setLayoutParams(marginLayoutParams);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        
            if (r6 != (r4 != null ? r4.bottomMargin : 0)) goto L33;
         */
        @Override // ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewLayout.ViewBinding
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void showPreviewRv() {
            ViewExtKt.show(getPreviewRv());
            ConstraintLayout galleryContainer = getGalleryContainer();
            ViewGroup.LayoutParams layoutParams = galleryContainer.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i11 = marginLayoutParams.topMargin;
                int i12 = marginLayoutParams.rightMargin;
                int i13 = marginLayoutParams.bottomMargin;
                marginLayoutParams.height = -1;
                ViewGroup.LayoutParams layoutParams2 = galleryContainer.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i11 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = galleryContainer.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i12 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = galleryContainer.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
                galleryContainer.setLayoutParams(marginLayoutParams);
            }
            ViewPager2 viewPager = getViewPager();
            ViewGroup.LayoutParams layoutParams5 = viewPager.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            if (marginLayoutParams5 == null) {
                return;
            }
            int i14 = marginLayoutParams5.leftMargin;
            int i15 = marginLayoutParams5.topMargin;
            int i16 = marginLayoutParams5.rightMargin;
            int i17 = marginLayoutParams5.bottomMargin;
            marginLayoutParams5.bottomMargin = Dimens.INSTANCE.getDP_16();
            if (i14 == marginLayoutParams5.leftMargin) {
                ViewGroup.LayoutParams layoutParams6 = viewPager.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                if (i15 == (marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams7 = viewPager.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                    if (i16 == (marginLayoutParams7 != null ? marginLayoutParams7.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams8 = viewPager.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                        if (i17 == (marginLayoutParams8 != null ? marginLayoutParams8.bottomMargin : 0)) {
                            return;
                        }
                    }
                }
            }
            viewPager.setLayoutParams(marginLayoutParams5);
        }
    }

    @NotNull
    public final ViewBinding bind(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewBindingImpl(view);
    }

    public final int getId() {
        return this.id;
    }
}
