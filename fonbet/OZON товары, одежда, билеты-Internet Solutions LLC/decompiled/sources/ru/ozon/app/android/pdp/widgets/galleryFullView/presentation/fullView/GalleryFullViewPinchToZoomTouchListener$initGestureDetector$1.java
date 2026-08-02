package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.dynamicanimation.animation.b;
import androidx.dynamicanimation.animation.c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.GalleryFullViewPinchToZoomTouchListener;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.GalleryFullViewPinchToZoomTouchListener$initGestureDetector$1;
import ru.ozon.app.android.uikit.utils.SimpleOnGestureListenerWithNullable;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J,\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"ru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewPinchToZoomTouchListener$initGestureDetector$1", "Lru/ozon/app/android/uikit/utils/SimpleOnGestureListenerWithNullable;", "onFling", "", "event1", "Landroid/view/MotionEvent;", "event2", "velocityX", "", "velocityY", "onDown", "e", "onScroll", "distanceX", "distanceY", "onDoubleTap", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewPinchToZoomTouchListener$initGestureDetector$1 extends SimpleOnGestureListenerWithNullable {
    final /* synthetic */ GalleryFullViewPinchToZoomTouchListener this$0;

    GalleryFullViewPinchToZoomTouchListener$initGestureDetector$1(GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener) {
        this.this$0 = galleryFullViewPinchToZoomTouchListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r0 = r0.verticalAnimation;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onFling$lambda$4$lambda$1(GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener, ImageView imageView, b bVar, float f7, float f11) {
        Point absoluteCordsOf;
        float f12;
        c cVar;
        absoluteCordsOf = galleryFullViewPinchToZoomTouchListener.absoluteCordsOf(imageView);
        f12 = galleryFullViewPinchToZoomTouchListener.scaleFactor;
        float height = (f12 * imageView.getHeight()) - Math.abs(absoluteCordsOf.y);
        if ((absoluteCordsOf.y <= 0 && height > imageView.getHeight()) || cVar == null) {
            return;
        }
        cVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFling$lambda$4$lambda$3(GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener, ImageView imageView, b bVar, boolean z11, float f7, float f11) {
        Point absoluteCordsOf;
        float f12;
        absoluteCordsOf = galleryFullViewPinchToZoomTouchListener.absoluteCordsOf(imageView);
        if (absoluteCordsOf.y > 0) {
            galleryFullViewPinchToZoomTouchListener.moveToVerticalAnimation(imageView, imageView.getY() - Math.abs(absoluteCordsOf.y));
            return;
        }
        f12 = galleryFullViewPinchToZoomTouchListener.scaleFactor;
        float height = f12 * imageView.getHeight();
        if (C6915b.c(height - Math.abs(absoluteCordsOf.y)) <= imageView.getHeight()) {
            galleryFullViewPinchToZoomTouchListener.moveToVerticalAnimation(imageView, -((height - imageView.getHeight()) - (Math.abs(absoluteCordsOf.y) - Math.abs(imageView.getY()))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        r0 = r0.horizontalAnimation;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onFling$lambda$9$lambda$6(GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener, ImageView imageView, b bVar, float f7, float f11) {
        Point absoluteCordsOf;
        float f12;
        c cVar;
        absoluteCordsOf = galleryFullViewPinchToZoomTouchListener.absoluteCordsOf(imageView);
        f12 = galleryFullViewPinchToZoomTouchListener.scaleFactor;
        int c11 = C6915b.c((f12 * imageView.getWidth()) - Math.abs(absoluteCordsOf.x));
        if ((absoluteCordsOf.x <= 0 && c11 >= imageView.getResources().getDisplayMetrics().widthPixels) || cVar == null) {
            return;
        }
        cVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFling$lambda$9$lambda$8(GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener, ImageView imageView, b bVar, boolean z11, float f7, float f11) {
        Point absoluteCordsOf;
        float f12;
        absoluteCordsOf = galleryFullViewPinchToZoomTouchListener.absoluteCordsOf(imageView);
        if (absoluteCordsOf.x > 0) {
            galleryFullViewPinchToZoomTouchListener.moveToHorizontalAnimation(imageView, imageView.getX() - Math.abs(absoluteCordsOf.x));
            return;
        }
        f12 = galleryFullViewPinchToZoomTouchListener.scaleFactor;
        float width = f12 * imageView.getWidth();
        if (C6915b.c(width - Math.abs(absoluteCordsOf.x)) < imageView.getResources().getDisplayMetrics().widthPixels) {
            galleryFullViewPinchToZoomTouchListener.moveToHorizontalAnimation(imageView, -((width - imageView.getResources().getDisplayMetrics().widthPixels) - (Math.abs(absoluteCordsOf.x) - Math.abs(imageView.getX()))));
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent e11) {
        ImageView imageView;
        ImageView imageView2;
        View view;
        View view2;
        ImageView imageView3;
        BottomSheetBehavior bottomSheetBehavior;
        Intrinsics.checkNotNullParameter(e11, "e");
        imageView = this.this$0.zoomableView;
        if (imageView == null) {
            view = this.this$0.mainView;
            if (view != null) {
                this.this$0.startZooming(view);
            }
            view2 = this.this$0.shadowView;
            if (view2 != null) {
                this.this$0.fadeInShadowAnimation(view2);
            }
            imageView3 = this.this$0.zoomableView;
            if (imageView3 != null) {
                this.this$0.scaleToFullScreen(imageView3, e11.getX(), e11.getY());
            }
            bottomSheetBehavior = this.this$0.bottomSheetBehavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setDraggable(false);
            }
        } else {
            imageView2 = this.this$0.zoomableView;
            if (imageView2 != null) {
                GalleryFullViewPinchToZoomTouchListener.moveToOriginPosition$default(this.this$0, imageView2, false, 1, null);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e11) {
        c cVar;
        c cVar2;
        Intrinsics.checkNotNullParameter(e11, "e");
        cVar = this.this$0.verticalAnimation;
        if (cVar != null) {
            cVar.d();
        }
        cVar2 = this.this$0.horizontalAnimation;
        if (cVar2 == null) {
            return true;
        }
        cVar2.d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {
        final ImageView imageView;
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        imageView = this.this$0.zoomableView;
        if (imageView != null) {
            cVar = this.this$0.verticalAnimation;
            if (cVar == null) {
                GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener = this.this$0;
                c cVar5 = new c(imageView, b.f42644n);
                final GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener2 = this.this$0;
                cVar5.c(new b.r() { // from class: KD.d
                    @Override // androidx.dynamicanimation.animation.b.r
                    public final void a(androidx.dynamicanimation.animation.b bVar, float f7, float f11) {
                        GalleryFullViewPinchToZoomTouchListener$initGestureDetector$1.onFling$lambda$4$lambda$1(GalleryFullViewPinchToZoomTouchListener.this, imageView, bVar, f7, f11);
                    }
                });
                cVar5.b(new b.q() { // from class: KD.e
                    @Override // androidx.dynamicanimation.animation.b.q
                    public final void a(androidx.dynamicanimation.animation.b bVar, boolean z11, float f7, float f11) {
                        GalleryFullViewPinchToZoomTouchListener$initGestureDetector$1.onFling$lambda$4$lambda$3(GalleryFullViewPinchToZoomTouchListener.this, imageView, bVar, z11, f7, f11);
                    }
                });
                galleryFullViewPinchToZoomTouchListener.verticalAnimation = cVar5;
            }
            cVar2 = this.this$0.horizontalAnimation;
            if (cVar2 == null) {
                GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener3 = this.this$0;
                c cVar6 = new c(imageView, b.f42643m);
                final GalleryFullViewPinchToZoomTouchListener galleryFullViewPinchToZoomTouchListener4 = this.this$0;
                cVar6.c(new b.r() { // from class: KD.f
                    @Override // androidx.dynamicanimation.animation.b.r
                    public final void a(androidx.dynamicanimation.animation.b bVar, float f7, float f11) {
                        GalleryFullViewPinchToZoomTouchListener$initGestureDetector$1.onFling$lambda$9$lambda$6(GalleryFullViewPinchToZoomTouchListener.this, imageView, bVar, f7, f11);
                    }
                });
                cVar6.b(new b.q() { // from class: KD.g
                    @Override // androidx.dynamicanimation.animation.b.q
                    public final void a(androidx.dynamicanimation.animation.b bVar, boolean z11, float f7, float f11) {
                        GalleryFullViewPinchToZoomTouchListener$initGestureDetector$1.onFling$lambda$9$lambda$8(GalleryFullViewPinchToZoomTouchListener.this, imageView, bVar, z11, f7, f11);
                    }
                });
                galleryFullViewPinchToZoomTouchListener3.horizontalAnimation = cVar6;
            }
            cVar3 = this.this$0.horizontalAnimation;
            if (cVar3 != null) {
                cVar3.o(velocityX);
                cVar3.n(1.1f);
                cVar3.l();
            }
            cVar4 = this.this$0.verticalAnimation;
            if (cVar4 != null) {
                cVar4.o(velocityY);
                cVar4.n(1.1f);
                cVar4.l();
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
    
        r3 = r1.this$0.zoomableView;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX, float distanceY) {
        ImageView imageView;
        if (event2 == null || event2.getPointerCount() != 1 || imageView == null) {
            return true;
        }
        this.this$0.absoluteCordsOf(imageView);
        imageView.setX(imageView.getX() - distanceX);
        imageView.setY(imageView.getY() - distanceY);
        return true;
    }
}
