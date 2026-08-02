package ru.ozon.app.android.pdp.view.photo360.presentation;

import Dc0.j;
import NC.b;
import NC.c;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.g;
import androidx.core.view.GestureDetectorCompat;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.actions.SearchIntents;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.databinding.PdpActivityPhoto360viewerBinding;
import ru.ozon.app.android.pdp.di.components.DaggerPhoto360ActivityComponent;
import ru.ozon.app.android.pdp.di.components.Photo360ActivityComponent;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360ViewModel;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003R(\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360Activity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "setupGestureDetector", "setupCloseButton", "Lru/ozon/app/android/uikit/screenstate/ScreenStateViewWidget;", "setupScreenStateView", "()Lru/ozon/app/android/uikit/screenstate/ScreenStateViewWidget;", "setupImage", "observeChanges", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$NewPhoto;", "action", "onNewPhoto", "(Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$NewPhoto;)V", "onEnterZoomMode", "onEnter360Mode", "onShowZoomDescription", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$Ready;", "onReady", "(Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$Ready;)V", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$Error;", "onError", "(Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$Error;)V", "onLoading", "LPc/a;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel;", "pViewModel", "LPc/a;", "getPViewModel$pdp_prodGoogleAllVendorsRelease", "()LPc/a;", "setPViewModel$pdp_prodGoogleAllVendorsRelease", "(LPc/a;)V", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel;", "viewModel", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360GestureDetectorListener;", "imageGestureDetectorListener$delegate", "getImageGestureDetectorListener", "()Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360GestureDetectorListener;", "imageGestureDetectorListener", "Landroidx/core/view/GestureDetectorCompat;", "gestureDetector$delegate", "getGestureDetector", "()Landroidx/core/view/GestureDetectorCompat;", "gestureDetector", "Landroid/view/View$OnTouchListener;", "photo360TouchListener", "Landroid/view/View$OnTouchListener;", "zoomTouchListener", "Lru/ozon/app/android/pdp/databinding/PdpActivityPhoto360viewerBinding;", "_binding", "Lru/ozon/app/android/pdp/databinding/PdpActivityPhoto360viewerBinding;", "getBinding", "()Lru/ozon/app/android/pdp/databinding/PdpActivityPhoto360viewerBinding;", "binding", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class Photo360Activity extends g {
    private PdpActivityPhoto360viewerBinding _binding;
    public a<Photo360ViewModel> pViewModel;

    @NotNull
    private final View.OnTouchListener photo360TouchListener;

    @NotNull
    private final View.OnTouchListener zoomTouchListener;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.b(new Photo360Activity$viewModel$2(this));

    /* renamed from: imageGestureDetectorListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageGestureDetectorListener = k.b(new Photo360Activity$imageGestureDetectorListener$2(this));

    /* renamed from: gestureDetector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gestureDetector = k.b(new Photo360Activity$gestureDetector$2(this));

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360Activity$Companion;", "", "<init>", "()V", "PARAM_QUERY", "", "DEFAULT_SCALE", "", "getNewIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", SearchIntents.EXTRA_QUERY, "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent getNewIntent(@NotNull Context context, @NotNull String query) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(query, "query");
            Intent intent = new Intent(context, (Class<?>) Photo360Activity.class);
            intent.putExtra("PARAM_QUERY", query);
            return intent;
        }

        private Companion() {
        }
    }

    public Photo360Activity() {
        int i11 = 0;
        this.photo360TouchListener = new NC.a(this, i11);
        this.zoomTouchListener = new b(this, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PdpActivityPhoto360viewerBinding getBinding() {
        PdpActivityPhoto360viewerBinding pdpActivityPhoto360viewerBinding = this._binding;
        Intrinsics.f(pdpActivityPhoto360viewerBinding);
        return pdpActivityPhoto360viewerBinding;
    }

    private final GestureDetectorCompat getGestureDetector() {
        return (GestureDetectorCompat) this.gestureDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Photo360GestureDetectorListener getImageGestureDetectorListener() {
        return (Photo360GestureDetectorListener) this.imageGestureDetectorListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Photo360ViewModel getViewModel() {
        Object value = this.viewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Photo360ViewModel) value;
    }

    private final void observeChanges() {
        getViewModel().getLiveData().observe(this, new Photo360Activity$sam$androidx_lifecycle_Observer$0(new Photo360Activity$observeChanges$1(this)));
    }

    private final void onEnter360Mode() {
        PdpActivityPhoto360viewerBinding binding = getBinding();
        TextView descriptionTv = binding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        ViewExtKt.gone(descriptionTv);
        TextView zoomDescriptionTv = binding.zoomDescriptionTv;
        Intrinsics.checkNotNullExpressionValue(zoomDescriptionTv, "zoomDescriptionTv");
        ViewExtKt.show(zoomDescriptionTv);
        binding.imagePv.setOnTouchListener(this.photo360TouchListener);
    }

    private final void onEnterZoomMode() {
        PdpActivityPhoto360viewerBinding binding = getBinding();
        TextView descriptionTv = binding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        ViewExtKt.gone(descriptionTv);
        TextView zoomDescriptionTv = binding.zoomDescriptionTv;
        Intrinsics.checkNotNullExpressionValue(zoomDescriptionTv, "zoomDescriptionTv");
        ViewExtKt.gone(zoomDescriptionTv);
        binding.imagePv.setOnTouchListener(this.zoomTouchListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Photo360ViewModel.Action.Error action) {
        PdpActivityPhoto360viewerBinding binding = getBinding();
        binding.screenStateView.showState(ScreenStateExtKt.toScreenState$default(action.getError(), null, false, 3, null));
        TextView descriptionTv = binding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        ViewExtKt.invisible(descriptionTv);
        PhotoView imagePv = binding.imagePv;
        Intrinsics.checkNotNullExpressionValue(imagePv, "imagePv");
        ViewExtKt.invisible(imagePv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoading() {
        PdpActivityPhoto360viewerBinding binding = getBinding();
        binding.screenStateView.showState(new ScreenState.Loading());
        PhotoView imagePv = binding.imagePv;
        Intrinsics.checkNotNullExpressionValue(imagePv, "imagePv");
        ViewExtKt.invisible(imagePv);
        TextView descriptionTv = binding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        ViewExtKt.invisible(descriptionTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewPhoto(Photo360ViewModel.Action.NewPhoto action) {
        PhotoView photoView = getBinding().imagePv;
        float g10 = photoView.g();
        Matrix matrix = new Matrix();
        photoView.h(matrix);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        matrix.getValues(fArr);
        photoView.setImageDrawable(action.getDrawable());
        if (action.getIsOriginal()) {
            float f7 = photoView.f();
            if (g10 > photoView.d() || f7 > g10) {
                return;
            }
            photoView.m(g10);
            photoView.o(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReady(Photo360ViewModel.Action.Ready action) {
        PdpActivityPhoto360viewerBinding binding = getBinding();
        binding.screenStateView.showState(new ScreenState.NoScreen());
        binding.descriptionTv.setText(action.getDescription());
        binding.zoomDescriptionTv.setText(action.getZoomDescription());
        TextView descriptionTv = binding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        ViewExtKt.show(descriptionTv);
        PhotoView imagePv = binding.imagePv;
        Intrinsics.checkNotNullExpressionValue(imagePv, "imagePv");
        ViewExtKt.show(imagePv);
        getImageGestureDetectorListener().setOnScrollChanged(new Photo360Activity$onReady$1$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShowZoomDescription() {
        PdpActivityPhoto360viewerBinding binding = getBinding();
        TextView descriptionTv = binding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        ViewExtKt.gone(descriptionTv);
        TextView zoomDescriptionTv = binding.zoomDescriptionTv;
        Intrinsics.checkNotNullExpressionValue(zoomDescriptionTv, "zoomDescriptionTv");
        ViewExtKt.show(zoomDescriptionTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean photo360TouchListener$lambda$0(Photo360Activity photo360Activity, View view, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1 && photo360Activity.getGestureDetector().a(motionEvent)) {
            return true;
        }
        return photo360Activity.getBinding().imagePv.c().onTouch(view, motionEvent);
    }

    private final void setupCloseButton() {
        getBinding().closeIv.setOnClickListener(new j(this, 2));
    }

    private final void setupGestureDetector() {
        getImageGestureDetectorListener().setOnUserFirstTouch(new Photo360Activity$setupGestureDetector$1(getViewModel()));
    }

    private final void setupImage() {
        final PhotoView photoView = getBinding().imagePv;
        photoView.setOnTouchListener(this.photo360TouchListener);
        photoView.l(new c(photoView, this));
        photoView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.view.photo360.presentation.Photo360Activity$setupImage$lambda$7$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                Photo360ViewModel viewModel;
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                viewModel = Photo360Activity.this.getViewModel();
                viewModel.loadInitialState(photoView.getWidth(), photoView.getHeight());
            }
        });
        photoView.setImageTintList(ThemeExtKt.isDarkThemeActive(this) ? ColorStateList.valueOf(ThemeExtKt.themeColor(this, R$attr.layerOverlayParanja)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupImage$lambda$7$lambda$5(PhotoView photoView, Photo360Activity photo360Activity, float f7, float f11, float f12) {
        if (photoView.g() < 1.1f) {
            photo360Activity.onEnter360Mode();
        } else {
            photo360Activity.onEnterZoomMode();
            photo360Activity.getViewModel().loadImageOriginalSize();
        }
    }

    private final ScreenStateViewWidget setupScreenStateView() {
        PdpActivityPhoto360viewerBinding binding = getBinding();
        ScreenStateViewWidget screenStateViewWidget = binding.screenStateView;
        screenStateViewWidget.setListener(new Photo360Activity$setupScreenStateView$1$1$1(this, binding));
        screenStateViewWidget.showState(new ScreenState.Loading());
        Intrinsics.checkNotNullExpressionValue(screenStateViewWidget, "with(...)");
        return screenStateViewWidget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zoomTouchListener$lambda$1(Photo360Activity photo360Activity, View view, MotionEvent motionEvent) {
        return photo360Activity.getBinding().imagePv.c().onTouch(view, motionEvent);
    }

    @NotNull
    public final a<Photo360ViewModel> getPViewModel$pdp_prodGoogleAllVendorsRelease() {
        a<Photo360ViewModel> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R$style.OzonTheme);
        Photo360ActivityComponent.Factory factory = DaggerPhoto360ActivityComponent.factory();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        factory.create(this, networkComponentApi, (ContextComponentDependencies) dependencyStorage2.b(ContextComponentDependencies.class)).inject(this);
        super.onCreate(savedInstanceState);
        this._binding = PdpActivityPhoto360viewerBinding.inflate(getLayoutInflater());
        setContentView(getBinding().getConstraintLayout());
        setupGestureDetector();
        setupCloseButton();
        setupScreenStateView();
        setupImage();
        observeChanges();
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected void onDestroy() {
        this._binding = null;
        super.onDestroy();
    }
}
