package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image;

import B90.p0;
import M2.c;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v5.GalleryV5Const;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.R$color;
import y7.k;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001SBO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u000b*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u000b*\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u0012J\u000f\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\u0012J\u001b\u0010$\u001a\u00020\u0013*\u00020\u00132\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-H\u0017¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0013¢\u0006\u0004\b2\u0010\u0015J\r\u00103\u001a\u00020\u000b¢\u0006\u0004\b3\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00107R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00108R*\u00109\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00106\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00106\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5PinchToZoomTouchListener;", "Landroid/view/View$OnTouchListener;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Landroid/view/ViewGroup;", "decorViewGroup", "Landroid/widget/ImageView;", "imageView", "Lkotlin/Function0;", "", "isViewFullVisible", "Lkotlin/Function1;", "", "onGalleryElementsVisible", "onClick", "isSelect", "<init>", "(Landroid/view/ViewGroup;Landroid/widget/ImageView;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Z)V", "startZooming", "()V", "Landroid/graphics/drawable/Drawable;", "copyTopCornersToBottom", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/view/View;", "view", "Landroid/graphics/PointF;", "absoluteCordsOf", "(Landroid/view/View;)Landroid/graphics/PointF;", "moveToOriginPosition", "(Landroid/view/View;)V", "Landroid/view/GestureDetector;", "initGestureDetector", "(Landroid/view/View;)Landroid/view/GestureDetector;", "clearShadowView", "clearZoom", "Landroid/content/res/Resources;", "resources", "toIndependentCopy", "(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;", "Landroid/view/ScaleGestureDetector;", "detector", "onScale", "(Landroid/view/ScaleGestureDetector;)Z", "onScaleBegin", "onScaleEnd", "(Landroid/view/ScaleGestureDetector;)V", "Landroid/view/MotionEvent;", "event", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "image", "updateImage", "onDestroy", "Landroid/view/ViewGroup;", "Landroid/widget/ImageView;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Z", "onZoomStarted", "getOnZoomStarted", "()Lkotlin/jvm/functions/Function0;", "setOnZoomStarted", "(Lkotlin/jvm/functions/Function0;)V", "onZoomFinish", "getOnZoomFinish", "setOnZoomFinish", "rootView", "Landroid/view/View;", "shadowView", "Lcom/google/android/material/imageview/ShapeableImageView;", "zoomableView", "Lcom/google/android/material/imageview/ShapeableImageView;", "viewCoordinates", "Landroid/graphics/PointF;", "", "scaleFactor", "F", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Landroid/animation/ObjectAnimator;", "alphaBgAnimator", "Landroid/animation/ObjectAnimator;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5PinchToZoomTouchListener implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener {
    private ObjectAnimator alphaBgAnimator;

    @NotNull
    private final ViewGroup decorViewGroup;
    private GestureDetector gestureDetector;

    @NotNull
    private final ImageView imageView;
    private final boolean isSelect;

    @NotNull
    private final Function0<Boolean> isViewFullVisible;

    @NotNull
    private final Function0<Unit> onClick;

    @NotNull
    private final Function1<Boolean, Unit> onGalleryElementsVisible;
    private Function0<Unit> onZoomFinish;
    private Function0<Unit> onZoomStarted;
    private View rootView;
    private float scaleFactor;
    private ScaleGestureDetector scaleGestureDetector;
    private View shadowView;
    private PointF viewCoordinates;
    private ShapeableImageView zoomableView;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV5PinchToZoomTouchListener(@NotNull ViewGroup decorViewGroup, @NotNull ImageView imageView, @NotNull Function0<Boolean> isViewFullVisible, @NotNull Function1<? super Boolean, Unit> onGalleryElementsVisible, @NotNull Function0<Unit> onClick, boolean z11) {
        Intrinsics.checkNotNullParameter(decorViewGroup, "decorViewGroup");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(isViewFullVisible, "isViewFullVisible");
        Intrinsics.checkNotNullParameter(onGalleryElementsVisible, "onGalleryElementsVisible");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.decorViewGroup = decorViewGroup;
        this.imageView = imageView;
        this.isViewFullVisible = isViewFullVisible;
        this.onGalleryElementsVisible = onGalleryElementsVisible;
        this.onClick = onClick;
        this.isSelect = z11;
        this.scaleFactor = 1.0f;
    }

    private final PointF absoluteCordsOf(View view) {
        view.getLocationInWindow(new int[2]);
        return new PointF(r0[0], r0[1]);
    }

    private final void clearShadowView() {
        this.decorViewGroup.removeView(this.shadowView);
        this.shadowView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearZoom() {
        this.onGalleryElementsVisible.invoke(Boolean.TRUE);
        this.decorViewGroup.removeView(this.zoomableView);
        this.zoomableView = null;
        this.scaleGestureDetector = null;
        this.gestureDetector = null;
        this.viewCoordinates = null;
        this.scaleFactor = 1.0f;
        View view = this.rootView;
        if (view != null) {
            view.setVisibility(0);
        }
        this.rootView = null;
    }

    private final void copyTopCornersToBottom(Drawable drawable) {
        float selectBgTopRadius;
        float[] cornerRadii;
        Float D11;
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable != null) {
            try {
                cornerRadii = gradientDrawable.getCornerRadii();
            } catch (Exception unused) {
                selectBgTopRadius = this.isSelect ? GalleryV5Const.INSTANCE.getSelectBgTopRadius() : GalleryV5Const.INSTANCE.getDefaultBgTopRadius();
            }
            if (cornerRadii == null || (D11 = C7705l.D(cornerRadii)) == null) {
                return;
            }
            selectBgTopRadius = D11.floatValue();
            gradientDrawable.setCornerRadius(selectBgTopRadius);
        }
    }

    private final GestureDetector initGestureDetector(View view) {
        return new GestureDetector(view.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.GalleryV5PinchToZoomTouchListener$initGestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX, float distanceY) {
                ShapeableImageView shapeableImageView;
                Intrinsics.checkNotNullParameter(event2, "event2");
                shapeableImageView = GalleryV5PinchToZoomTouchListener.this.zoomableView;
                if (shapeableImageView == null) {
                    return true;
                }
                shapeableImageView.setX(shapeableImageView.getX() - distanceX);
                shapeableImageView.setY(shapeableImageView.getY() - distanceY);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e11) {
                Function0 function0;
                Intrinsics.checkNotNullParameter(e11, "e");
                function0 = GalleryV5PinchToZoomTouchListener.this.onClick;
                function0.invoke();
                return true;
            }
        });
    }

    private final void moveToOriginPosition(View view) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator x11;
        ViewPropertyAnimator y11;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator withEndAction;
        PointF pointF = this.viewCoordinates;
        if (pointF == null) {
            return;
        }
        ShapeableImageView shapeableImageView = this.zoomableView;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeableImageView != null ? shapeableImageView.getBackground() : null, "alpha", 0, 255);
        ofInt.setDuration(450L);
        ofInt.start();
        this.alphaBgAnimator = ofInt;
        ViewPropertyAnimator animate2 = view.animate();
        if (animate2 != null && (x11 = animate2.x(pointF.x)) != null && (y11 = x11.y(pointF.y)) != null && (scaleX = y11.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (duration = scaleY.setDuration(450L)) != null && (interpolator = duration.setInterpolator(new AccelerateDecelerateInterpolator())) != null && (withEndAction = interpolator.withEndAction(new p0(this, 2))) != null) {
            withEndAction.start();
        }
        View view2 = this.shadowView;
        if (view2 == null || (animate = view2.animate()) == null) {
            return;
        }
        animate.alpha(0.0f);
        animate.setDuration(450L);
        animate.setInterpolator(new LinearInterpolator());
        animate.withEndAction(new c(3, view, this)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToOriginPosition$lambda$15$lambda$14(View view, GalleryV5PinchToZoomTouchListener galleryV5PinchToZoomTouchListener) {
        view.setVisibility(8);
        galleryV5PinchToZoomTouchListener.clearShadowView();
        Function0<Unit> function0 = galleryV5PinchToZoomTouchListener.onZoomFinish;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void startZooming() {
        Drawable drawable;
        Function0<Unit> function0;
        Drawable.ConstantState constantState;
        this.onGalleryElementsVisible.invoke(Boolean.FALSE);
        View view = new View(this.imageView.getContext());
        view.setBackgroundResource(R$color.layer_overlay_dimming);
        view.setClickable(true);
        this.shadowView = view;
        ShapeableImageView shapeableImageView = new ShapeableImageView(this.imageView.getContext());
        shapeableImageView.setLayoutParams(new ViewGroup.LayoutParams(this.imageView.getWidth(), this.imageView.getHeight()));
        shapeableImageView.setClickable(true);
        Drawable drawable2 = this.imageView.getDrawable();
        if (drawable2 != null) {
            Resources resources = shapeableImageView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            drawable = toIndependentCopy(drawable2, resources);
        } else {
            drawable = null;
        }
        shapeableImageView.setImageDrawable(drawable);
        shapeableImageView.setClipToOutline(this.imageView.getClipToOutline());
        Drawable background = this.imageView.getBackground();
        shapeableImageView.setBackground((background == null || (constantState = background.getConstantState()) == null) ? null : constantState.newDrawable());
        ImageView imageView = this.imageView;
        ShapeableImageView shapeableImageView2 = imageView instanceof ShapeableImageView ? (ShapeableImageView) imageView : null;
        if (shapeableImageView2 != null) {
            k.a aVar = new k.a(new k());
            if (this.isSelect) {
                aVar.o(0, shapeableImageView2.getShapeAppearanceModel().k());
                aVar.s(0, shapeableImageView2.getShapeAppearanceModel().k());
            } else {
                aVar.d(shapeableImageView2.getShapeAppearanceModel().k());
            }
            shapeableImageView.setShapeAppearanceModel(aVar.a());
        } else {
            Drawable background2 = shapeableImageView.getBackground();
            if (background2 != null) {
                copyTopCornersToBottom(background2);
            }
        }
        this.zoomableView = shapeableImageView;
        PointF absoluteCordsOf = absoluteCordsOf(this.imageView);
        ShapeableImageView shapeableImageView3 = this.zoomableView;
        if (shapeableImageView3 != null) {
            shapeableImageView3.setX(absoluteCordsOf.x);
        }
        ShapeableImageView shapeableImageView4 = this.zoomableView;
        if (shapeableImageView4 != null) {
            shapeableImageView4.setY(absoluteCordsOf.y);
        }
        this.viewCoordinates = absoluteCordsOf;
        View view2 = this.rootView;
        if (view2 != null) {
            ViewExtKt.invisible(view2);
        }
        this.decorViewGroup.addView(this.shadowView);
        this.decorViewGroup.addView(this.zoomableView);
        if (this.zoomableView != null && (function0 = this.onZoomStarted) != null) {
            function0.invoke();
        }
        ShapeableImageView shapeableImageView5 = this.zoomableView;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeableImageView5 != null ? shapeableImageView5.getBackground() : null, "alpha", 255, 0);
        ofInt.setDuration(450L);
        ofInt.start();
        this.alphaBgAnimator = ofInt;
    }

    private final Drawable toIndependentCopy(Drawable drawable, Resources resources) {
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap == null || bitmap.isRecycled()) {
            return drawable;
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap copy = bitmap.copy(config, false);
        Intrinsics.checkNotNullExpressionValue(copy, "copy(...)");
        return new BitmapDrawable(resources, copy);
    }

    public final void onDestroy() {
        ObjectAnimator objectAnimator = this.alphaBgAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.alphaBgAnimator = null;
        clearZoom();
        clearShadowView();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(@NotNull ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        if (this.zoomableView == null) {
            return true;
        }
        float scaleFactor = detector.getScaleFactor() * this.scaleFactor;
        this.scaleFactor = scaleFactor;
        float d11 = h.d(scaleFactor, 1.0f, 6.0f);
        this.scaleFactor = d11;
        ShapeableImageView shapeableImageView = this.zoomableView;
        if (shapeableImageView != null) {
            shapeableImageView.setScaleX(d11);
        }
        ShapeableImageView shapeableImageView2 = this.zoomableView;
        if (shapeableImageView2 == null) {
            return true;
        }
        shapeableImageView2.setScaleY(this.scaleFactor);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(@NotNull ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        if (!this.isViewFullVisible.invoke().booleanValue() || this.zoomableView != null || this.rootView == null) {
            return true;
        }
        startZooming();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(@NotNull ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        ShapeableImageView shapeableImageView;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getPointerCount() > 1) {
            if (this.zoomableView == null) {
                this.rootView = view;
            }
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (this.scaleGestureDetector == null) {
            this.scaleGestureDetector = new ScaleGestureDetector(view.getContext().getApplicationContext(), this);
        }
        if (this.gestureDetector == null) {
            this.gestureDetector = initGestureDetector(view);
        }
        ScaleGestureDetector scaleGestureDetector = this.scaleGestureDetector;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(event);
        }
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(event);
        }
        if (event.getAction() == 1 && (shapeableImageView = this.zoomableView) != null && shapeableImageView != null) {
            moveToOriginPosition(shapeableImageView);
        }
        return true;
    }

    public final void setOnZoomFinish(Function0<Unit> function0) {
        this.onZoomFinish = function0;
    }

    public final void setOnZoomStarted(Function0<Unit> function0) {
        this.onZoomStarted = function0;
    }

    public final void updateImage(@NotNull Drawable image) {
        Intrinsics.checkNotNullParameter(image, "image");
        ShapeableImageView shapeableImageView = this.zoomableView;
        if (shapeableImageView != null) {
            Resources resources = shapeableImageView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            shapeableImageView.setImageDrawable(toIndependentCopy(image, resources));
        }
    }
}
