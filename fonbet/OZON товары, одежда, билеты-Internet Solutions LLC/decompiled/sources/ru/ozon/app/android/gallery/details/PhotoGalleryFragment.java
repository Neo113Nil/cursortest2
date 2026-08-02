package ru.ozon.app.android.gallery.details;

import E6.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.github.chrisbanes.photoview.PhotoView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.FullScreenListener;
import ru.ozon.app.android.gallery.ItemVO;
import ru.ozon.app.android.gallery.databinding.FragmentGalleryPhotoScreenBinding;
import ru.ozon.app.android.gallery.details.PhotoGalleryFragment;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/gallery/details/PhotoGalleryFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lru/ozon/app/android/gallery/FullScreenListener;", "fullScreenListener", "Lru/ozon/app/android/gallery/FullScreenListener;", "", "zoomed", "Z", "Lru/ozon/app/android/gallery/databinding/FragmentGalleryPhotoScreenBinding;", "_binding", "Lru/ozon/app/android/gallery/databinding/FragmentGalleryPhotoScreenBinding;", "getBinding", "()Lru/ozon/app/android/gallery/databinding/FragmentGalleryPhotoScreenBinding;", "binding", "Companion", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PhotoGalleryFragment extends ComponentCallbacksC5392m {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private FragmentGalleryPhotoScreenBinding _binding;
    private FullScreenListener fullScreenListener;
    private boolean zoomed;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/gallery/details/PhotoGalleryFragment$Companion;", "", "<init>", "()V", "PHOTO", "", "PHOTO_SCALE", "", "newInstance", "Lru/ozon/app/android/gallery/details/PhotoGalleryFragment;", "photo", "Lru/ozon/app/android/gallery/ItemVO$Image;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PhotoGalleryFragment newInstance(@NotNull ItemVO.Image photo) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            PhotoGalleryFragment photoGalleryFragment = new PhotoGalleryFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("photo", photo);
            photoGalleryFragment.setArguments(bundle);
            return photoGalleryFragment;
        }

        private Companion() {
        }
    }

    private final FragmentGalleryPhotoScreenBinding getBinding() {
        FragmentGalleryPhotoScreenBinding fragmentGalleryPhotoScreenBinding = this._binding;
        Intrinsics.f(fragmentGalleryPhotoScreenBinding);
        return fragmentGalleryPhotoScreenBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2$lambda$1(FragmentGalleryPhotoScreenBinding fragmentGalleryPhotoScreenBinding, PhotoGalleryFragment photoGalleryFragment, float f7, float f11, float f12) {
        boolean z11 = fragmentGalleryPhotoScreenBinding.previewPv.g() >= 1.1f;
        if (z11 != photoGalleryFragment.zoomed) {
            photoGalleryFragment.zoomed = z11;
            FullScreenListener fullScreenListener = photoGalleryFragment.fullScreenListener;
            if (fullScreenListener != null) {
                fullScreenListener.onZoomChanged(z11);
            } else {
                Intrinsics.n("fullScreenListener");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.fullScreenListener = (FullScreenListener) context;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentGalleryPhotoScreenBinding.inflate(inflater, container, false);
        PhotoView constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        ItemVO.Image image;
        Parcelable parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(view, "view");
        final FragmentGalleryPhotoScreenBinding binding = getBinding();
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("photo", ItemVO.Image.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = arguments.getParcelable("photo");
            }
            image = (ItemVO.Image) parcelable;
        } else {
            image = null;
        }
        PhotoView previewPv = binding.previewPv;
        Intrinsics.checkNotNullExpressionValue(previewPv, "previewPv");
        ImageViewExtKt.loadOriginal$default(previewPv, image != null ? image.getImageUrl() : null, null, null, null, false, null, 62, null);
        Context context = getContext();
        if (context != null) {
            binding.previewPv.setImageTintList(ThemeExtKt.isDarkThemeActive(context) ? ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.layerOverlayParanja)) : null);
        }
        binding.previewPv.l(new d() { // from class: ey.d
            @Override // E6.d
            public final void b(float f7, float f11, float f12) {
                PhotoGalleryFragment.onViewCreated$lambda$2$lambda$1(FragmentGalleryPhotoScreenBinding.this, this, f7, f11, f12);
            }
        });
    }
}
