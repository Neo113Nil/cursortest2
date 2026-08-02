package ru.ozon.app.android.product.utils;

import Xc.a;
import Xc.b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.core.graphics.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.utils.PinchToZoomTouchListener;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002KLB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020 *\u00020 2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010\u001bJ\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010\u001bJ\u0013\u0010'\u001a\u00020\u0007*\u00020\u000bH\u0002¢\u0006\u0004\b'\u0010\u001bJ\u001b\u0010(\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020,2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lru/ozon/app/android/product/utils/PinchToZoomTouchListener;", "Landroid/view/View$OnTouchListener;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Landroid/view/ViewGroup;", "decorViewGroup", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "", "onZoomStarted", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "view", "Landroid/view/GestureDetector;", "initGestureDetector", "(Landroid/view/View;)Landroid/view/GestureDetector;", "Landroid/view/MotionEvent;", "motionEvent", "onActionDown", "(Landroid/view/MotionEvent;Landroid/view/View;)V", "resetPreZoomState", "()V", "Landroid/graphics/PointF;", "event", "setMiddlePointTo", "(Landroid/graphics/PointF;Landroid/view/MotionEvent;)Landroid/graphics/PointF;", "startZooming", "(Landroid/view/View;)V", "", "alpha", "applyAlpha", "(II)I", "Landroid/graphics/Point;", "setAbsoluteCordsOf", "(Landroid/graphics/Point;Landroid/view/View;)Landroid/graphics/Point;", "onActionMove", "(Landroid/view/MotionEvent;)V", "onActionFinish", "endZooming", "fadeOut", "moveToOriginPosition", "(Landroid/view/View;Landroid/view/View;)V", "Landroid/view/ScaleGestureDetector;", "detector", "", "onScaleBegin", "(Landroid/view/ScaleGestureDetector;)Z", "onScale", "onScaleEnd", "(Landroid/view/ScaleGestureDetector;)V", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Landroid/view/ViewGroup;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/product/utils/PinchToZoomTouchListener$ZoomState;", "zoomState", "Lru/ozon/app/android/product/utils/PinchToZoomTouchListener$ZoomState;", "", "scaleFactor", "F", "shadowView", "Landroid/view/View;", "zoomableView", "Landroid/widget/ImageView;", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "initialMiddlePoint", "Landroid/graphics/PointF;", "currentMiddlePoint", "viewCoordinates", "Landroid/graphics/Point;", "isAnimatingZoomEnd", "Z", "Companion", "ZoomState", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PinchToZoomTouchListener implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private PointF currentMiddlePoint;

    @NotNull
    private final ViewGroup decorViewGroup;
    private GestureDetector gestureDetector;
    private PointF initialMiddlePoint;
    private boolean isAnimatingZoomEnd;
    private final Function1<ImageView, Unit> onZoomStarted;
    private float scaleFactor;
    private ScaleGestureDetector scaleGestureDetector;
    private View shadowView;
    private Point viewCoordinates;

    @NotNull
    private ZoomState zoomState;
    private ImageView zoomableView;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/product/utils/PinchToZoomTouchListener$Companion;", "", "<init>", "()V", "MAX_SCALE_FACTOR", "", "SHADOW_ALPHA", "", "ZOOMABLE_VIEW_TAG", "", "getBitmapFrom", "Landroid/graphics/Bitmap;", "view", "Landroid/view/View;", "getClipToOutlinePath", "Landroid/graphics/Path;", "bitmap", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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

        @NotNull
        public final Bitmap getBitmapFrom(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(createBitmap);
            if (view.getClipToOutline()) {
                canvas.clipPath(getClipToOutlinePath(view, createBitmap));
            }
            view.draw(canvas);
            return createBitmap;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/product/utils/PinchToZoomTouchListener$ZoomState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "POINTER_DOWN", "ZOOMING", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ZoomState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ZoomState[] $VALUES;
        public static final ZoomState IDLE = new ZoomState("IDLE", 0);
        public static final ZoomState POINTER_DOWN = new ZoomState("POINTER_DOWN", 1);
        public static final ZoomState ZOOMING = new ZoomState("ZOOMING", 2);

        private static final /* synthetic */ ZoomState[] $values() {
            return new ZoomState[]{IDLE, POINTER_DOWN, ZOOMING};
        }

        static {
            ZoomState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ZoomState(String str, int i11) {
        }

        public static ZoomState valueOf(String str) {
            return (ZoomState) Enum.valueOf(ZoomState.class, str);
        }

        public static ZoomState[] values() {
            return (ZoomState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PinchToZoomTouchListener(@NotNull ViewGroup decorViewGroup, Function1<? super ImageView, Unit> function1) {
        Intrinsics.checkNotNullParameter(decorViewGroup, "decorViewGroup");
        this.decorViewGroup = decorViewGroup;
        this.onZoomStarted = function1;
        this.zoomState = ZoomState.IDLE;
        this.scaleFactor = 1.0f;
    }

    private final int applyAlpha(int i11, int i12) {
        return c.f(i11, i12);
    }

    private final void endZooming(View view) {
        this.isAnimatingZoomEnd = true;
        View view2 = this.shadowView;
        if (view2 != null) {
            fadeOut(view2);
        }
        ImageView imageView = this.zoomableView;
        if (imageView != null) {
            moveToOriginPosition(imageView, view);
        }
    }

    private final void fadeOut(View view) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator animate = view.animate();
        if (animate == null || (alpha = animate.alpha(0.0f)) == null || (interpolator = alpha.setInterpolator(new AccelerateDecelerateInterpolator())) == null) {
            return;
        }
        interpolator.start();
    }

    private final GestureDetector initGestureDetector(final View view) {
        return new GestureDetector(view.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.product.utils.PinchToZoomTouchListener$initGestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                if (!view.isAttachedToWindow()) {
                    return true;
                }
                view.performClick();
                return true;
            }
        });
    }

    private final void moveToOriginPosition(View view, View view2) {
        ViewPropertyAnimator x11;
        ViewPropertyAnimator y11;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator withEndAction;
        Point point = this.viewCoordinates;
        if (point == null) {
            point = setAbsoluteCordsOf(new Point(), view2);
        }
        ViewPropertyAnimator animate = view.animate();
        if (animate == null || (x11 = animate.x(point.x)) == null || (y11 = x11.y(point.y)) == null || (scaleX = y11.scaleX(1.0f)) == null || (scaleY = scaleX.scaleY(1.0f)) == null || (interpolator = scaleY.setInterpolator(new AccelerateDecelerateInterpolator())) == null || (withEndAction = interpolator.withEndAction(new L2.b(1, this, view2))) == null) {
            return;
        }
        withEndAction.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToOriginPosition$lambda$12(PinchToZoomTouchListener pinchToZoomTouchListener, View view) {
        pinchToZoomTouchListener.decorViewGroup.removeView(pinchToZoomTouchListener.shadowView);
        pinchToZoomTouchListener.decorViewGroup.removeView(pinchToZoomTouchListener.zoomableView);
        pinchToZoomTouchListener.shadowView = null;
        pinchToZoomTouchListener.zoomableView = null;
        pinchToZoomTouchListener.scaleGestureDetector = null;
        pinchToZoomTouchListener.gestureDetector = null;
        pinchToZoomTouchListener.initialMiddlePoint = null;
        pinchToZoomTouchListener.currentMiddlePoint = null;
        pinchToZoomTouchListener.viewCoordinates = null;
        pinchToZoomTouchListener.scaleFactor = 1.0f;
        pinchToZoomTouchListener.zoomState = ZoomState.IDLE;
        view.setVisibility(0);
        pinchToZoomTouchListener.isAnimatingZoomEnd = false;
    }

    private final void onActionDown(MotionEvent motionEvent, View view) {
        if (this.zoomableView == null) {
            View last = ViewGroupExtKt.last(this.decorViewGroup);
            if (Intrinsics.d(last != null ? last.getTag() : null, "PinchToZoom.zoomableViewTag")) {
                resetPreZoomState();
                return;
            }
        }
        ZoomState zoomState = this.zoomState;
        if (zoomState == ZoomState.IDLE) {
            this.zoomState = ZoomState.POINTER_DOWN;
        } else if (zoomState == ZoomState.POINTER_DOWN) {
            this.zoomState = ZoomState.ZOOMING;
            this.initialMiddlePoint = setMiddlePointTo(new PointF(), motionEvent);
            startZooming(view);
        }
    }

    private final void onActionFinish(View view) {
        if (this.zoomState == ZoomState.ZOOMING) {
            endZooming(view);
        } else {
            resetPreZoomState();
        }
    }

    private final void onActionMove(MotionEvent motionEvent) {
        PointF pointF = this.currentMiddlePoint;
        if (pointF == null) {
            pointF = new PointF();
            this.currentMiddlePoint = pointF;
        }
        setMiddlePointTo(pointF, motionEvent);
        PointF pointF2 = this.initialMiddlePoint;
        if (pointF2 != null) {
            pointF.x -= pointF2.x;
            pointF.y -= pointF2.y;
        }
        if (this.viewCoordinates != null) {
            pointF.x += r4.x;
            pointF.y += r4.y;
        }
        ImageView imageView = this.zoomableView;
        if (imageView != null) {
            imageView.setX(pointF.x);
        }
        ImageView imageView2 = this.zoomableView;
        if (imageView2 != null) {
            imageView2.setY(pointF.y);
        }
    }

    private final void resetPreZoomState() {
        this.zoomState = ZoomState.IDLE;
        this.scaleGestureDetector = null;
        this.gestureDetector = null;
    }

    private final Point setAbsoluteCordsOf(Point point, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        point.set(iArr[0], iArr[1]);
        return point;
    }

    private final PointF setMiddlePointTo(PointF pointF, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            float f7 = 2;
            pointF.set((motionEvent.getX(1) + motionEvent.getX(0)) / f7, (motionEvent.getY(1) + motionEvent.getY(0)) / f7);
        }
        return pointF;
    }

    private final void startZooming(View view) {
        Function1<ImageView, Unit> function1;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final ColorDrawable colorDrawable = new ColorDrawable(applyAlpha(ThemeExtKt.themeColor(context, R$attr.layerOverlayDimming), 0));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 61);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: MF.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinchToZoomTouchListener.startZooming$lambda$2$lambda$1(colorDrawable, this, valueAnimator);
            }
        });
        View view2 = new View(view.getContext());
        view2.setClickable(true);
        view2.setBackground(colorDrawable);
        this.shadowView = view2;
        ImageView imageView = new ImageView(view.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(view.getWidth(), view.getHeight()));
        imageView.setTag("PinchToZoom.zoomableViewTag");
        imageView.setImageBitmap(INSTANCE.getBitmapFrom(view));
        this.zoomableView = imageView;
        Point absoluteCordsOf = setAbsoluteCordsOf(new Point(), view);
        ImageView imageView2 = this.zoomableView;
        if (imageView2 != null) {
            imageView2.setX(absoluteCordsOf.x);
        }
        ImageView imageView3 = this.zoomableView;
        if (imageView3 != null) {
            imageView3.setY(absoluteCordsOf.y);
        }
        this.viewCoordinates = absoluteCordsOf;
        view.setVisibility(4);
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.decorViewGroup.addView(this.shadowView);
        this.decorViewGroup.addView(this.zoomableView);
        ofInt.start();
        ImageView imageView4 = this.zoomableView;
        if (imageView4 == null || (function1 = this.onZoomStarted) == null) {
            return;
        }
        function1.invoke(imageView4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startZooming$lambda$2$lambda$1(ColorDrawable colorDrawable, PinchToZoomTouchListener pinchToZoomTouchListener, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int color = colorDrawable.getColor();
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        colorDrawable.setColor(pinchToZoomTouchListener.applyAlpha(color, ((Integer) animatedValue).intValue()));
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(@NotNull ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        ImageView imageView = this.zoomableView;
        if (imageView == null) {
            return false;
        }
        float scaleFactor = detector.getScaleFactor() * this.scaleFactor;
        this.scaleFactor = scaleFactor;
        float d11 = h.d(scaleFactor, 1.0f, 6.0f);
        this.scaleFactor = d11;
        imageView.setScaleX(d11);
        imageView.setScaleY(this.scaleFactor);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(@NotNull ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        return this.zoomableView != null;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(@NotNull ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.scaleFactor = 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (r0 != 6) goto L40;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.isAnimatingZoomEnd) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        boolean z11 = action == 5 || action == 0;
        if (this.scaleGestureDetector == null && z11) {
            this.scaleGestureDetector = new ScaleGestureDetector(view.getContext().getApplicationContext(), this);
        }
        if (this.gestureDetector == null && z11) {
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
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                        }
                    }
                } else if (this.zoomState == ZoomState.ZOOMING) {
                    onActionMove(motionEvent);
                }
                return true;
            }
            onActionFinish(view);
            return true;
        }
        onActionDown(motionEvent, view);
        return true;
    }
}
