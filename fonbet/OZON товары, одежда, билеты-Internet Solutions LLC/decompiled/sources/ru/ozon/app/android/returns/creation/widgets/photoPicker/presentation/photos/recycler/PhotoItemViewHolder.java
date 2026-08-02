package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler;

import Au.b;
import CX.a;
import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import jk0.j;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.returns.creation.databinding.PhotoPickerPhotoItemBinding;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItemViewHolder;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItemViewState;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/returns/creation/databinding/PhotoPickerPhotoItemBinding;", "binding", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/PhotoPickerPhotoItemBinding;Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;)V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;", "viewState", "", "applyState", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;)V", "showLoaded", "()V", "showLoading", "showRetry", "onAttach", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "item", "bind", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;)V", "Lru/ozon/app/android/returns/creation/databinding/PhotoPickerPhotoItemBinding;", "getBinding", "()Lru/ozon/app/android/returns/creation/databinding/PhotoPickerPhotoItemBinding;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;", "getViewModel", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;", "boundedData", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class PhotoItemViewHolder extends j {

    @NotNull
    private final PhotoPickerPhotoItemBinding binding;
    private PhotoItem boundedData;

    @NotNull
    private final PhotosViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float ROUND_RADIUS = UiExtKt.toPxF(16);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewHolder$Companion;", "", "<init>", "()V", "ROUND_RADIUS", "", "getROUND_RADIUS", "()F", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getROUND_RADIUS() {
            return PhotoItemViewHolder.ROUND_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PhotoItemViewHolder(@NotNull PhotoPickerPhotoItemBinding binding, @NotNull PhotosViewModel viewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        ConstraintLayout constraintLayout2 = binding.getConstraintLayout();
        constraintLayout2.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItemViewHolder$1$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                PhotoItemViewHolder.Companion companion;
                Intrinsics.checkNotNullParameter(view, "view");
                if (outline != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    companion = PhotoItemViewHolder.Companion;
                    outline.setRoundRect(0, 0, width, height, companion.getROUND_RADIUS());
                }
            }
        });
        constraintLayout2.setClipToOutline(true);
        binding.deletePhotoIbv.setOnTouchListener(new b(this, 1));
        binding.retryLoadingIv.setOnClickListener(new a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyState(PhotoItemViewState viewState) {
        if (viewState instanceof PhotoItemViewState.Loading) {
            showLoading();
        } else if (viewState instanceof PhotoItemViewState.Success) {
            showLoaded();
        } else if (viewState instanceof PhotoItemViewState.Error) {
            showRetry();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$3$lambda$1(PhotoItemViewHolder photoItemViewHolder, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        photoItemViewHolder.viewModel.deletePhotoClicked(photoItemViewHolder.boundedData);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(PhotoItemViewHolder photoItemViewHolder, View view) {
        photoItemViewHolder.viewModel.retryLoading(photoItemViewHolder.boundedData);
    }

    private final void showLoaded() {
        PhotoPickerPhotoItemBinding photoPickerPhotoItemBinding = this.binding;
        View overlayView = photoPickerPhotoItemBinding.overlayView;
        Intrinsics.checkNotNullExpressionValue(overlayView, "overlayView");
        ViewExtKt.gone(overlayView);
        LoaderView photoLoaderLv = photoPickerPhotoItemBinding.photoLoaderLv;
        Intrinsics.checkNotNullExpressionValue(photoLoaderLv, "photoLoaderLv");
        ViewExtKt.gone(photoLoaderLv);
        IconView retryLoadingIv = photoPickerPhotoItemBinding.retryLoadingIv;
        Intrinsics.checkNotNullExpressionValue(retryLoadingIv, "retryLoadingIv");
        ViewExtKt.gone(retryLoadingIv);
    }

    private final void showLoading() {
        PhotoPickerPhotoItemBinding photoPickerPhotoItemBinding = this.binding;
        View overlayView = photoPickerPhotoItemBinding.overlayView;
        Intrinsics.checkNotNullExpressionValue(overlayView, "overlayView");
        ViewExtKt.show(overlayView);
        LoaderView photoLoaderLv = photoPickerPhotoItemBinding.photoLoaderLv;
        Intrinsics.checkNotNullExpressionValue(photoLoaderLv, "photoLoaderLv");
        ViewExtKt.show(photoLoaderLv);
        IconView retryLoadingIv = photoPickerPhotoItemBinding.retryLoadingIv;
        Intrinsics.checkNotNullExpressionValue(retryLoadingIv, "retryLoadingIv");
        ViewExtKt.gone(retryLoadingIv);
    }

    private final void showRetry() {
        PhotoPickerPhotoItemBinding photoPickerPhotoItemBinding = this.binding;
        View overlayView = photoPickerPhotoItemBinding.overlayView;
        Intrinsics.checkNotNullExpressionValue(overlayView, "overlayView");
        ViewExtKt.show(overlayView);
        LoaderView photoLoaderLv = photoPickerPhotoItemBinding.photoLoaderLv;
        Intrinsics.checkNotNullExpressionValue(photoLoaderLv, "photoLoaderLv");
        ViewExtKt.gone(photoLoaderLv);
        IconView retryLoadingIv = photoPickerPhotoItemBinding.retryLoadingIv;
        Intrinsics.checkNotNullExpressionValue(retryLoadingIv, "retryLoadingIv");
        ViewExtKt.show(retryLoadingIv);
    }

    public final void bind(@NotNull PhotoItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item;
        PhotoPickerPhotoItemBinding photoPickerPhotoItemBinding = this.binding;
        AppCompatImageView photoIv = photoPickerPhotoItemBinding.photoIv;
        Intrinsics.checkNotNullExpressionValue(photoIv, "photoIv");
        ImageViewExtKt.load$default(photoIv, item.getLink().getUrl(), C7714v.a0(ImageTransformation.CenterCrop.INSTANCE), null, null, null, false, null, 124, null);
        IconButtonV3View deletePhotoIbv = photoPickerPhotoItemBinding.deletePhotoIbv;
        Intrinsics.checkNotNullExpressionValue(deletePhotoIbv, "deletePhotoIbv");
        IconButtonV3HolderKt.bind$default(deletePhotoIbv, item.getDeleteButton(), null, 2, null);
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        PhotosViewModel photosViewModel = this.viewModel;
        PhotoItem photoItem = this.boundedData;
        photosViewModel.observePhotoItemViewState(photoItem != null ? photoItem.getId() : -1L).observe(this, new PhotoItemViewHolder$sam$androidx_lifecycle_Observer$0(new PhotoItemViewHolder$onAttach$1(this)));
    }
}
