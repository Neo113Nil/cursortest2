package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image;

import Dc0.j;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.GalleryV5ViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.BaseGalleryV5ImageVH;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R(\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n\u0018\u00010)8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R*\u00103\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010.8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b3\u00100\u001a\u0004\b4\u00102\"\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u00010\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u0018R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010B\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\n\u0018\u00010)8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bA\u0010-¨\u0006C"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/BaseGalleryV5ImageVH;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item$Image;", "Landroid/view/View;", "rootView", "Landroid/widget/ImageView;", "imageView", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "", "onItemClick", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5ZoomConfig;", "zoomConfig", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Landroid/widget/ImageView;Lkotlin/jvm/functions/Function2;LWZ/l;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5ZoomConfig;Lru/ozon/app/android/composer/ComposerReferences;)V", "onImageClick", "()V", "item", "updateVh", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item$Image;)V", "", "width", "height", "updateView", "(II)V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5PinchToZoomTouchListener;", "pinchToZoomListener", "loadOriginalImageForZoom", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5PinchToZoomTouchListener;)V", "bind", "onAttach", "onDetach", "Landroid/widget/ImageView;", "Lkotlin/jvm/functions/Function2;", "LWZ/l;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5ZoomConfig;", "Lkotlin/Function1;", "onWidthUpdate", "Lkotlin/jvm/functions/Function1;", "getOnWidthUpdate", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "onSuccessLoadImage", "Lkotlin/jvm/functions/Function0;", "getOnSuccessLoadImage", "()Lkotlin/jvm/functions/Function0;", "onFirstTouch", "getOnFirstTouch", "setOnFirstTouch", "(Lkotlin/jvm/functions/Function0;)V", "boundData", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item$Image;", "getBoundData", "()Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item$Image;", "setBoundData", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5PinchToZoomTouchListener;", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "", "getOnGalleryElementsVisible", "onGalleryElementsVisible", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public abstract class BaseGalleryV5ImageVH extends GalleryV5ViewHolder<GalleryV5VO.Item.Image> {
    private GalleryV5VO.Item.Image boundData;

    @NotNull
    private final ImageView imageView;

    @NotNull
    private final G lifecycleObserver;
    private Function0<Unit> onFirstTouch;

    @NotNull
    private final Function2<AtomAction, GallerySyncModel, Unit> onItemClick;
    private final Function0<Unit> onSuccessLoadImage;
    private final Function1<Integer, Unit> onWidthUpdate;
    private GalleryV5PinchToZoomTouchListener pinchToZoomListener;

    @NotNull
    private final l tokenizedAnalytics;
    private final GalleryV5ZoomConfig zoomConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseGalleryV5ImageVH(@NotNull View rootView, @NotNull ImageView imageView, @NotNull Function2<? super AtomAction, ? super GallerySyncModel, Unit> onItemClick, @NotNull l tokenizedAnalytics, GalleryV5ZoomConfig galleryV5ZoomConfig, @NotNull ComposerReferences refs) {
        super(rootView);
        ImageView imageView2;
        Unit unit;
        ViewGroup rootView2;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.imageView = imageView;
        this.onItemClick = onItemClick;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.zoomConfig = galleryV5ZoomConfig;
        this.lifecycleObserver = new G() { // from class: dE.a
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                BaseGalleryV5ImageVH.lifecycleObserver$lambda$0(BaseGalleryV5ImageVH.this, j11, aVar);
            }
        };
        if (galleryV5ZoomConfig != null) {
            ComponentCallbacksC5392m c11 = refs.getContainer().c();
            if (c11 == null || (rootView2 = ContextExtKt.getRootView(c11)) == null) {
                imageView2 = imageView;
                unit = null;
            } else {
                imageView2 = imageView;
                final GalleryV5PinchToZoomTouchListener galleryV5PinchToZoomTouchListener = new GalleryV5PinchToZoomTouchListener(rootView2, imageView2, new BaseGalleryV5ImageVH$1$1$2(this), new BaseGalleryV5ImageVH$1$1$3(this), new BaseGalleryV5ImageVH$1$1$1(this), galleryV5ZoomConfig.getIsSelect());
                galleryV5PinchToZoomTouchListener.setOnZoomStarted(new BaseGalleryV5ImageVH$1$1$4$1(this, galleryV5PinchToZoomTouchListener));
                galleryV5PinchToZoomTouchListener.setOnZoomFinish(new BaseGalleryV5ImageVH$1$1$4$2(this));
                rootView.setOnTouchListener(new View.OnTouchListener() { // from class: dE.b
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean lambda$6$lambda$5$lambda$4$lambda$3;
                        lambda$6$lambda$5$lambda$4$lambda$3 = BaseGalleryV5ImageVH.lambda$6$lambda$5$lambda$4$lambda$3(BaseGalleryV5ImageVH.this, galleryV5PinchToZoomTouchListener, view, motionEvent);
                        return lambda$6$lambda$5$lambda$4$lambda$3;
                    }
                });
                this.pinchToZoomListener = galleryV5PinchToZoomTouchListener;
                unit = Unit.f71690a;
            }
            if (unit != null) {
                return;
            }
        } else {
            imageView2 = imageView;
        }
        imageView2.setOnClickListener(new j(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$6$lambda$5$lambda$4$lambda$3(BaseGalleryV5ImageVH baseGalleryV5ImageVH, GalleryV5PinchToZoomTouchListener galleryV5PinchToZoomTouchListener, View view, MotionEvent motionEvent) {
        Function0<Unit> onFirstTouch = baseGalleryV5ImageVH.getOnFirstTouch();
        if (onFirstTouch != null) {
            onFirstTouch.invoke();
            Unit unit = Unit.f71690a;
        }
        baseGalleryV5ImageVH.setOnFirstTouch(null);
        Intrinsics.f(view);
        Intrinsics.f(motionEvent);
        return galleryV5PinchToZoomTouchListener.onTouch(view, motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$0(BaseGalleryV5ImageVH baseGalleryV5ImageVH, J j11, AbstractC5434v.a event) {
        GalleryV5PinchToZoomTouchListener galleryV5PinchToZoomTouchListener;
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC5434v.a.ON_STOP || (galleryV5PinchToZoomTouchListener = baseGalleryV5ImageVH.pinchToZoomListener) == null) {
            return;
        }
        galleryV5PinchToZoomTouchListener.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadOriginalImageForZoom(final GalleryV5PinchToZoomTouchListener pinchToZoomListener) {
        GalleryV5VO.Item.Image image = this.boundData;
        if (image != null) {
            ImageViewExtKt.loadOriginal$default(this.imageView, image.getUrl(), C7714v.a0(ImageTransformation.CenterCrop.INSTANCE), new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.BaseGalleryV5ImageVH$loadOriginalImageForZoom$1$1
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception exc) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    if (resource != null) {
                        GalleryV5PinchToZoomTouchListener.this.updateImage(resource);
                    }
                }
            }, null, false, null, 56, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImageClick() {
        t event;
        AtomAction action;
        GalleryV5VO.Item.Image image = this.boundData;
        if (image != null && (action = image.getAction()) != null) {
            this.onItemClick.invoke(action, new GallerySyncModel(getAdapterPosition(), null));
        }
        GalleryV5VO.Item.Image image2 = this.boundData;
        if (image2 == null || (event = image2.getEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, event, null, 2, null);
    }

    private final void updateVh(GalleryV5VO.Item.Image item) {
        GalleryV5VO.ContainerConfig containerConfig = item.getContainerConfig();
        ImageViewExtKt.load$default(this.imageView, item.getUrl(), null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.BaseGalleryV5ImageVH$updateVh$1$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                Function0<Unit> onSuccessLoadImage = BaseGalleryV5ImageVH.this.getOnSuccessLoadImage();
                if (onSuccessLoadImage != null) {
                    onSuccessLoadImage.invoke();
                }
            }
        }, null, new ImageSize(containerConfig.getContainerWidth(), containerConfig.getContainerHeight()), false, null, 106, null);
        updateView(containerConfig.getContainerWidth(), containerConfig.getContainerHeight());
    }

    private final void updateView(int width, int height) {
        Function1<Integer, Unit> onWidthUpdate = getOnWidthUpdate();
        if (onWidthUpdate != null) {
            onWidthUpdate.invoke(Integer.valueOf(width));
        }
        ImageView imageView = this.imageView;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = layoutParams.width;
        layoutParams.width = width;
        layoutParams.height = height;
        if (i11 == height && i12 == width) {
            return;
        }
        imageView.setLayoutParams(layoutParams);
    }

    protected final GalleryV5VO.Item.Image getBoundData() {
        return this.boundData;
    }

    protected Function0<Unit> getOnFirstTouch() {
        return this.onFirstTouch;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Function1<Boolean, Unit> getOnGalleryElementsVisible() {
        Function1<Boolean, Unit> onGalleryElementsVisible;
        GalleryV5ZoomConfig galleryV5ZoomConfig = this.zoomConfig;
        return (galleryV5ZoomConfig == null || (onGalleryElementsVisible = galleryV5ZoomConfig.getOnGalleryElementsVisible()) == null) ? BaseGalleryV5ImageVH$onGalleryElementsVisible$1.INSTANCE : onGalleryElementsVisible;
    }

    protected Function0<Unit> getOnSuccessLoadImage() {
        return this.onSuccessLoadImage;
    }

    protected Function1<Integer, Unit> getOnWidthUpdate() {
        return this.onWidthUpdate;
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        getLifecycle().a(this.lifecycleObserver);
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        getLifecycle().e(this.lifecycleObserver);
        GalleryV5PinchToZoomTouchListener galleryV5PinchToZoomTouchListener = this.pinchToZoomListener;
        if (galleryV5PinchToZoomTouchListener != null) {
            galleryV5PinchToZoomTouchListener.onDestroy();
        }
        this.pinchToZoomListener = null;
    }

    protected void setOnFirstTouch(Function0<Unit> function0) {
        this.onFirstTouch = function0;
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.GalleryV5ViewHolder
    public void bind(@NotNull final GalleryV5VO.Item.Image item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundData = item;
        updateVh(item);
        final AbstractC5434v lifecycle = getLifecycle();
        if (lifecycle.b().a(AbstractC5434v.b.RESUMED)) {
            TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getEvent());
        } else {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.BaseGalleryV5ImageVH$bind$$inlined$whenResumed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    AbstractC5434v.this.e(this);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getEvent());
                    AbstractC5434v.this.e(this);
                }
            });
        }
    }
}
