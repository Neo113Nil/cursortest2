package ru.ozon.app.android.gallery.details;

import GZ.g;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.ItemVO;
import ru.ozon.app.android.gallery.databinding.FragmentGalleryPhoto360ScreenBinding;
import ru.ozon.app.android.gallery.details.Photo360GalleryFragmentComponent;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ozon/app/android/gallery/details/Photo360GalleryFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "Lru/ozon/app/android/gallery/databinding/FragmentGalleryPhoto360ScreenBinding;", "_binding", "Lru/ozon/app/android/gallery/databinding/FragmentGalleryPhoto360ScreenBinding;", "getBinding", "()Lru/ozon/app/android/gallery/databinding/FragmentGalleryPhoto360ScreenBinding;", "binding", "Companion", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Photo360GalleryFragment extends ComponentCallbacksC5392m {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private FragmentGalleryPhoto360ScreenBinding _binding;
    public g router;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/gallery/details/Photo360GalleryFragment$Companion;", "", "<init>", "()V", "ITEM_ARG", "", "newInstance", "Lru/ozon/app/android/gallery/details/Photo360GalleryFragment;", "item", "Lru/ozon/app/android/gallery/ItemVO$Photo360;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Photo360GalleryFragment newInstance(@NotNull ItemVO.Photo360 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            Photo360GalleryFragment photo360GalleryFragment = new Photo360GalleryFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ITEM_ARG", item);
            photo360GalleryFragment.setArguments(bundle);
            return photo360GalleryFragment;
        }

        private Companion() {
        }
    }

    private final FragmentGalleryPhoto360ScreenBinding getBinding() {
        FragmentGalleryPhoto360ScreenBinding fragmentGalleryPhoto360ScreenBinding = this._binding;
        Intrinsics.f(fragmentGalleryPhoto360ScreenBinding);
        return fragmentGalleryPhoto360ScreenBinding;
    }

    @NotNull
    public final g getRouter() {
        g gVar = this.router;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Photo360GalleryFragmentComponent.Factory factory = DaggerPhoto360GalleryFragmentComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        factory.create((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentGalleryPhoto360ScreenBinding.inflate(inflater, container, false);
        LinearLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        ItemVO.Photo360 photo360;
        Parcelable parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentGalleryPhoto360ScreenBinding binding = getBinding();
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("ITEM_ARG", ItemVO.Photo360.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = arguments.getParcelable("ITEM_ARG");
            }
            photo360 = (ItemVO.Photo360) parcelable;
        } else {
            photo360 = null;
        }
        ImageView image = binding.image;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        ImageViewExtKt.loadOriginal$default(image, photo360 != null ? photo360.getImageUrl() : null, null, null, null, false, null, 62, null);
        SmallButtonView open360PhotoButton = binding.open360PhotoButton;
        Intrinsics.checkNotNullExpressionValue(open360PhotoButton, "open360PhotoButton");
        WrappedButtonHolderKt.bindOrGone(open360PhotoButton, photo360 != null ? photo360.getButton() : null, new Photo360GalleryFragment$onViewCreated$1$1(this, photo360));
        binding.open360PhotoButton.setEllipsize(null);
        binding.photo360Description.setText(photo360 != null ? photo360.getDescription() : null);
    }
}
