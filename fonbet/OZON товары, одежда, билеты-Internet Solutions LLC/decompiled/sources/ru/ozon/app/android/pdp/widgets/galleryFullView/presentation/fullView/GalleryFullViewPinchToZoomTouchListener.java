package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView;

import Hy.RunnableC3170a;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.core.view.Y;
import androidx.dynamicanimation.animation.c;
import androidx.fragment.app.ComponentCallbacksC5392m;
import c3.C5739a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.GalleryFullViewPinchToZoomTouchListener;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0001VB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020\b*\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010-J#\u00102\u001a\u00020\b*\u00020\u00142\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J\u001b\u00105\u001a\u00020\b*\u00020\u00142\u0006\u00104\u001a\u00020/H\u0002¢\u0006\u0004\b5\u00106J\u001b\u00108\u001a\u00020\b*\u00020\u00142\u0006\u00107\u001a\u00020/H\u0002¢\u0006\u0004\b8\u00106J\u0013\u00109\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b9\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010:R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010=R\u0016\u0010F\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u001c\u0010T\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewPinchToZoomTouchListener;", "Landroid/view/View$OnTouchListener;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Landroid/view/ViewGroup;", "decorViewGroup", "Landroidx/fragment/app/m;", "fragment", "Lkotlin/Function0;", "", "onClose", "<init>", "(Landroid/view/ViewGroup;Landroidx/fragment/app/m;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ScaleGestureDetector;", "detector", "", "onScaleBegin", "(Landroid/view/ScaleGestureDetector;)Z", "onScale", "onScaleEnd", "(Landroid/view/ScaleGestureDetector;)V", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "motionEvent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Landroid/graphics/Bitmap;", "getBitmapFrom", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Path;", "getClipToOutlinePath", "(Landroid/view/View;Landroid/graphics/Bitmap;)Landroid/graphics/Path;", "Landroid/view/GestureDetector;", "initGestureDetector", "(Landroid/view/View;)Landroid/view/GestureDetector;", "startZooming", "(Landroid/view/View;)V", "Landroid/graphics/Point;", "absoluteCordsOf", "(Landroid/view/View;)Landroid/graphics/Point;", "isClickClose", "moveToOriginPosition", "(Landroid/view/View;Z)V", "clearDecorView", "()V", "clearZoom", "", "touchX", "touchY", "scaleToFullScreen", "(Landroid/view/View;FF)V", "x", "moveToHorizontalAnimation", "(Landroid/view/View;F)V", "y", "moveToVerticalAnimation", "fadeInShadowAnimation", "Landroid/view/ViewGroup;", "Lkotlin/jvm/functions/Function0;", "shadowView", "Landroid/view/View;", "Landroid/widget/ImageView;", "zoomableView", "Landroid/widget/ImageView;", "closeView", "Landroid/graphics/PointF;", "viewCoordinates", "Landroid/graphics/PointF;", "mainView", "scaleFactor", "F", "canShowShadowAnimation", "Z", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Landroidx/dynamicanimation/animation/c;", "verticalAnimation", "Landroidx/dynamicanimation/animation/c;", "horizontalAnimation", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewPinchToZoomTouchListener implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener {
    private final BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior;
    private boolean canShowShadowAnimation;
    private ImageView closeView;

    @NotNull
    private final ViewGroup decorViewGroup;
    private GestureDetector gestureDetector;
    private c horizontalAnimation;
    private View mainView;

    @NotNull
    private final Function0<Unit> onClose;
    private float scaleFactor;
    private ScaleGestureDetector scaleGestureDetector;
    private View shadowView;
    private c verticalAnimation;
    private PointF viewCoordinates;
    private ImageView zoomableView;
    public static final int $stable = 8;

    public GalleryFullViewPinchToZoomTouchListener(@NotNull ViewGroup decorViewGroup, ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(decorViewGroup, "decorViewGroup");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.decorViewGroup = decorViewGroup;
        this.onClose = onClose;
        this.scaleFactor = 1.0f;
        this.canShowShadowAnimation = true;
        b bVar = componentCallbacksC5392m instanceof b ? (b) componentCallbacksC5392m : null;
        Dialog dialog = bVar != null ? bVar.getDialog() : null;
        SheetDialog sheetDialog = dialog instanceof SheetDialog ? (SheetDialog) dialog : null;
        this.bottomSheetBehavior = sheetDialog != null ? sheetDialog.getBehavior() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Point absoluteCordsOf(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    private final void clearDecorView() {
        this.decorViewGroup.removeView(this.shadowView);
        this.shadowView = null;
        this.canShowShadowAnimation = true;
        this.decorViewGroup.removeView(this.closeView);
        this.closeView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearZoom() {
        this.decorViewGroup.removeView(this.zoomableView);
        this.zoomableView = null;
        this.scaleGestureDetector = null;
        this.gestureDetector = null;
        this.viewCoordinates = null;
        this.scaleFactor = 1.0f;
        View view = this.mainView;
        if (view != null) {
            view.setVisibility(0);
        }
        this.mainView = null;
        this.horizontalAnimation = null;
        this.verticalAnimation = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fadeInShadowAnimation(View view) {
        if (ViewExtKt.isVisible(view) || !this.canShowShadowAnimation) {
            return;
        }
        this.canShowShadowAnimation = false;
        view.setAlpha(0.0f);
        view.setVisibility(0);
        ViewPropertyAnimator animate = view.animate();
        animate.alpha(1.0f);
        animate.setDuration(450L);
        animate.setInterpolator(new C5739a());
        animate.withEndAction(new RunnableC3170a(this, 1));
    }

    private final Bitmap getBitmapFrom(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        if (view.getClipToOutline()) {
            canvas.clipPath(getClipToOutlinePath(view, createBitmap));
        }
        view.draw(canvas);
        return createBitmap;
    }

    private final Path getClipToOutlinePath(View view, Bitmap bitmap) {
        Outline outline = new Outline();
        view.getOutlineProvider().getOutline(view, outline);
        if (outline.isEmpty()) {
            view.draw(new Canvas(bitmap.copy(Bitmap.Config.ARGB_8888, true)));
            view.getOutlineProvider().getOutline(view, outline);
        }
        Rect rect = new Rect();
        outline.getRect(rect);
        RectF rectF = new RectF(rect);
        Path path = new Path();
        path.addRoundRect(rectF, outline.getRadius(), outline.getRadius(), Path.Direction.CW);
        return path;
    }

    private final GestureDetector initGestureDetector(View view) {
        return new GestureDetector(view.getContext(), new GalleryFullViewPinchToZoomTouchListener$initGestureDetector$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveToHorizontalAnimation(View view, float f7) {
        ViewPropertyAnimator x11;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate = view.animate();
        if (animate == null || (x11 = animate.x(f7)) == null || (interpolator = x11.setInterpolator(new AccelerateDecelerateInterpolator())) == null || (duration = interpolator.setDuration(450L)) == null) {
            return;
        }
        duration.start();
    }

    private final void moveToOriginPosition(final View view, final boolean z11) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator x11;
        ViewPropertyAnimator y11;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator withEndAction;
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setDraggable(true);
        }
        PointF pointF = this.viewCoordinates;
        if (pointF == null) {
            View view2 = this.mainView;
            if (view2 == null) {
                return;
            } else {
                pointF = new PointF(absoluteCordsOf(view2));
            }
        }
        c cVar = this.horizontalAnimation;
        if (cVar != null) {
            cVar.d();
        }
        c cVar2 = this.verticalAnimation;
        if (cVar2 != null) {
            cVar2.d();
        }
        ViewPropertyAnimator animate2 = view.animate();
        if (animate2 != null && (x11 = animate2.x(pointF.x)) != null && (y11 = x11.y(pointF.y)) != null && (scaleX = y11.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (duration = scaleY.setDuration(450L)) != null && (interpolator = duration.setInterpolator(new AccelerateDecelerateInterpolator())) != null && (withEndAction = interpolator.withEndAction(new KD.b(this, 0))) != null) {
            withEndAction.start();
        }
        View view3 = this.shadowView;
        if (view3 == null || (animate = view3.animate()) == null) {
            return;
        }
        animate.alpha(0.0f);
        animate.setDuration(450L);
        animate.setInterpolator(new LinearInterpolator());
        animate.withEndAction(new Runnable() { // from class: KD.c
            @Override // java.lang.Runnable
            public final void run() {
                GalleryFullViewPinchToZoomTouchListener.moveToOriginPosition$lambda$16$lambda$15(view, this, z11);
            }
        }).start();
    }

    static /* synthetic */ void moveToOriginPosition$default(GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener, View view, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        galleryFullViewPinchToZoomTouchListener.moveToOriginPosition(view, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToOriginPosition$lambda$16$lambda$15(View view, GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener, boolean z11) {
        if (view != null) {
            view.setVisibility(8);
            galleryFullViewPinchToZoomTouchListener.clearDecorView();
            if (z11) {
                galleryFullViewPinchToZoomTouchListener.onClose.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveToVerticalAnimation(View view, float f7) {
        ViewPropertyAnimator y11;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate = view.animate();
        if (animate == null || (y11 = animate.y(f7)) == null || (interpolator = y11.setInterpolator(new AccelerateDecelerateInterpolator())) == null || (duration = interpolator.setDuration(450L)) == null) {
            return;
        }
        duration.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scaleToFullScreen(View view, float f7, float f11) {
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        if (this.mainView == null) {
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int statusBarHeight = ResourceExtKt.getStatusBarHeight(context);
        Intrinsics.checkNotNullExpressionValue(view.getContext(), "getContext(...)");
        float navigationBarHeight = ((view.getResources().getDisplayMetrics().heightPixels + statusBarHeight) + ResourceExtKt.getNavigationBarHeight(r3)) / r0.getHeight();
        this.scaleFactor = navigationBarHeight;
        view.setPivotY(f11);
        view.setPivotX(f7);
        ViewPropertyAnimator animate = view.animate();
        if (animate == null || (scaleX = animate.scaleX(navigationBarHeight)) == null || (scaleY = scaleX.scaleY(navigationBarHeight)) == null || (interpolator = scaleY.setInterpolator(new AccelerateDecelerateInterpolator())) == null || (duration = interpolator.setDuration(450L)) == null) {
            return;
        }
        duration.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void startZooming(View view) {
        View view2 = new View(view.getContext());
        view2.setClickable(true);
        view2.setBackgroundResource(R$color.bg_dark_key);
        ViewExtKt.invisible(view2);
        view2.setOnTouchListener(new View.OnTouchListener() { // from class: KD.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                boolean startZooming$lambda$7$lambda$6;
                startZooming$lambda$7$lambda$6 = GalleryFullViewPinchToZoomTouchListener.startZooming$lambda$7$lambda$6(GalleryFullViewPinchToZoomTouchListener.this, view3, motionEvent);
                return startZooming$lambda$7$lambda$6;
            }
        });
        this.shadowView = view2;
        ImageView imageView = new ImageView(view.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(view.getWidth(), view.getHeight()));
        imageView.setImageBitmap(getBitmapFrom(view));
        this.zoomableView = imageView;
        ImageView imageView2 = new ImageView(view.getContext());
        imageView2.setBackground(a.getDrawable(imageView2.getContext(), R$drawable.ic_close_circle_gallery_full_view));
        Dimens dimens = Dimens.INSTANCE;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(dimens.getDP_32(), dimens.getDP_32());
        imageView2.setX(imageView2.getResources().getDisplayMetrics().widthPixels - (dimens.getDP_10() + dimens.getDP_32()));
        imageView2.setY(dimens.getDP_10());
        imageView2.setLayoutParams(layoutParams);
        imageView2.setOnClickListener(new Ar.c(this, 2));
        this.closeView = imageView2;
        view.setVisibility(4);
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.decorViewGroup.addView(this.shadowView);
        this.decorViewGroup.addView(this.zoomableView);
        this.decorViewGroup.addView(this.closeView);
        ImageView imageView3 = this.zoomableView;
        if (imageView3 != null) {
            int i11 = Y.f42258g;
            if (!imageView3.isLaidOut() || imageView3.isLayoutRequested()) {
                imageView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.GalleryFullViewPinchToZoomTouchListener$startZooming$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view3, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view3, "view");
                        view3.removeOnLayoutChangeListener(this);
                        GalleryFullViewPinchToZoomTouchListener.this.viewCoordinates = new PointF(view3.getX(), view3.getY());
                    }
                });
            } else {
                this.viewCoordinates = new PointF(imageView3.getX(), imageView3.getY());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startZooming$lambda$11$lambda$10(GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener, View view) {
        ImageView imageView = galleryFullViewPinchToZoomTouchListener.zoomableView;
        if (imageView != null) {
            galleryFullViewPinchToZoomTouchListener.moveToOriginPosition(imageView, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean startZooming$lambda$7$lambda$6(GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener, View view, MotionEvent motionEvent) {
        ImageView imageView;
        c cVar;
        ScaleGestureDetector scaleGestureDetector = galleryFullViewPinchToZoomTouchListener.scaleGestureDetector;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        GestureDetector gestureDetector = galleryFullViewPinchToZoomTouchListener.gestureDetector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1 && (imageView = galleryFullViewPinchToZoomTouchListener.zoomableView) != null && (cVar = galleryFullViewPinchToZoomTouchListener.horizontalAnimation) != null && !cVar.g()) {
            Point absoluteCordsOf = galleryFullViewPinchToZoomTouchListener.absoluteCordsOf(imageView);
            float width = galleryFullViewPinchToZoomTouchListener.scaleFactor * imageView.getWidth();
            int c11 = C6915b.c(width - Math.abs(absoluteCordsOf.x));
            float height = galleryFullViewPinchToZoomTouchListener.scaleFactor * imageView.getHeight();
            float abs = height - Math.abs(absoluteCordsOf.y);
            if (absoluteCordsOf.x > 0 && imageView.getX() > 0.0f) {
                galleryFullViewPinchToZoomTouchListener.moveToHorizontalAnimation(imageView, imageView.getX() - Math.abs(absoluteCordsOf.x));
            }
            if (absoluteCordsOf.x < 0 && imageView.getX() < 0.0f && c11 < imageView.getResources().getDisplayMetrics().widthPixels) {
                galleryFullViewPinchToZoomTouchListener.moveToHorizontalAnimation(imageView, -((width - imageView.getResources().getDisplayMetrics().widthPixels) - (Math.abs(absoluteCordsOf.x) - Math.abs(imageView.getX()))));
            }
            if (absoluteCordsOf.y > 0) {
                galleryFullViewPinchToZoomTouchListener.moveToVerticalAnimation(imageView, imageView.getY() - Math.abs(absoluteCordsOf.y));
            }
            if (abs <= imageView.getHeight()) {
                galleryFullViewPinchToZoomTouchListener.moveToVerticalAnimation(imageView, -((height - imageView.getHeight()) - (Math.abs(absoluteCordsOf.y) - Math.abs(imageView.getY()))));
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(@NotNull ScaleGestureDetector detector) {
        View view;
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.decorViewGroup.requestDisallowInterceptTouchEvent(true);
        ImageView imageView = this.zoomableView;
        if (imageView == null) {
            return false;
        }
        float scaleFactor = detector.getScaleFactor() * this.scaleFactor;
        this.scaleFactor = scaleFactor;
        float d11 = h.d(scaleFactor, 0.7f, 6.0f);
        this.scaleFactor = d11;
        imageView.setScaleX(d11);
        imageView.setScaleY(this.scaleFactor);
        if (this.scaleFactor > 1.0f && (view = this.shadowView) != null) {
            fadeInShadowAnimation(view);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(@NotNull ScaleGestureDetector detector) {
        View view;
        Intrinsics.checkNotNullParameter(detector, "detector");
        BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setDraggable(false);
        }
        this.decorViewGroup.requestDisallowInterceptTouchEvent(true);
        if (this.zoomableView == null && (view = this.mainView) != null) {
            startZooming(view);
        }
        ImageView imageView = this.zoomableView;
        if (imageView != null) {
            float focusX = detector.getFocusX() - imageView.getTranslationX();
            float pivotX = imageView.getPivotX();
            float f7 = this.scaleFactor;
            float f11 = 1;
            float f12 = (((f7 - f11) * pivotX) + focusX) / f7;
            float focusY = detector.getFocusY() - imageView.getTranslationY();
            float pivotY = imageView.getPivotY();
            float f13 = this.scaleFactor;
            PointF pointF = new PointF(f12, (((f13 - f11) * pivotY) + focusY) / f13);
            imageView.setTranslationX(imageView.getTranslationX() - ((this.scaleFactor - f11) * (imageView.getPivotX() - pointF.x)));
            imageView.setTranslationY(imageView.getTranslationY() - ((this.scaleFactor - f11) * (imageView.getPivotY() - pointF.y)));
            imageView.setPivotX(pointF.x);
            imageView.setPivotY(pointF.y);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(@NotNull ScaleGestureDetector detector) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.decorViewGroup.requestDisallowInterceptTouchEvent(false);
        c cVar = this.horizontalAnimation;
        if (cVar != null) {
            cVar.d();
        }
        c cVar2 = this.verticalAnimation;
        if (cVar2 != null) {
            cVar2.d();
        }
        if (this.scaleFactor >= 1.3f || (imageView = this.zoomableView) == null) {
            return;
        }
        moveToOriginPosition$default(this, imageView, false, 1, null);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.mainView = view;
        if (motionEvent.getPointerCount() > 1) {
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
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        return true;
    }
}
