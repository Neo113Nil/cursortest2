package ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.background.systemalarm.d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.R$id;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.HorizontalAutoScrollView;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.rv.HorizontalAutoScrollRV;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000fJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cJ\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "horizontalAutoScrollRV", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/rv/HorizontalAutoScrollRV;", "clickableView", "Landroid/view/View;", "handler", "Landroid/os/Handler;", "gestureDetectorRunnable", "Ljava/lang/Runnable;", "clickListener", "Landroid/view/View$OnClickListener;", "detector", "Landroid/view/GestureDetector;", "onDetachedFromWindow", "", "bind", "item", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO;", "restartAnimation", "", "setOnWidgetClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getScrollState", "Landroid/os/Parcelable;", "setScrollState", "state", "initGestureDetector", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HorizontalAutoScrollView extends FrameLayout {
    private View.OnClickListener clickListener;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View clickableView;
    private GestureDetector detector;

    @NotNull
    private final Runnable gestureDetectorRunnable;

    @NotNull
    private final Handler handler;

    @NotNull
    private final HorizontalAutoScrollRV horizontalAutoScrollRV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalAutoScrollView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        HorizontalAutoScrollRV horizontalAutoScrollRV = (HorizontalAutoScrollRV) qVar.i(N.b(HorizontalAutoScrollRV.class), context);
        horizontalAutoScrollRV = horizontalAutoScrollRV == null ? new HorizontalAutoScrollRV(context) : horizontalAutoScrollRV;
        horizontalAutoScrollRV.setId(R$id.horizontalAutoScroll_RecyclerView);
        Dp dp = Dp.INSTANCE;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, dp.getDp14());
        layoutParams.topMargin = dp.getDp3();
        layoutParams.bottomMargin = dp.getDp3();
        horizontalAutoScrollRV.setLayoutParams(layoutParams);
        this.horizontalAutoScrollRV = horizontalAutoScrollRV;
        final View i11 = qVar.i(N.b(View.class), context);
        i11 = i11 == null ? new View(context) : i11;
        i11.setId(R$id.horizontalAutoScroll_ClickableView);
        i11.setLayoutParams(new FrameLayout.LayoutParams(-1, dp.getDp20()));
        i11.setOnTouchListener(new View.OnTouchListener() { // from class: xK.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean clickableView$lambda$3$lambda$2;
                clickableView$lambda$3$lambda$2 = HorizontalAutoScrollView.clickableView$lambda$3$lambda$2(HorizontalAutoScrollView.this, i11, view, motionEvent);
                return clickableView$lambda$3$lambda$2;
            }
        });
        this.clickableView = i11;
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        d dVar = new d(this, 3);
        this.gestureDetectorRunnable = dVar;
        setId(R$id.horizontalAutoScroll_Root);
        addView(horizontalAutoScrollRV);
        addView(i11);
        handler.post(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clickableView$lambda$3$lambda$2(HorizontalAutoScrollView horizontalAutoScrollView, View view, View view2, MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        GestureDetector gestureDetector = horizontalAutoScrollView.detector;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent) && (onClickListener = horizontalAutoScrollView.clickListener) != null) {
            onClickListener.onClick(view);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initGestureDetector() {
        this.detector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.HorizontalAutoScrollView$initGestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX, float distanceY) {
                Intrinsics.checkNotNullParameter(event2, "event2");
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                return true;
            }
        });
    }

    public final void bind(@NotNull HorizontalAutoScrollVO item, boolean restartAnimation) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.horizontalAutoScrollRV.submitList(item.getImages(), restartAnimation);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColorToken(), UniColors.LAYER_FLOOR_1.getResId()));
    }

    public final Parcelable getScrollState() {
        RecyclerView.o layoutManager = this.horizontalAutoScrollRV.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.onSaveInstanceState();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.handler.removeCallbacks(this.gestureDetectorRunnable);
    }

    public final void setOnWidgetClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setOnClickListener(listener);
        this.clickListener = listener;
    }

    public final void setScrollState(Parcelable state) {
        RecyclerView.o layoutManager;
        if (state == null || (layoutManager = this.horizontalAutoScrollRV.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(state);
    }
}
