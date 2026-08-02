package ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ik0.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0002/6\b\u0001\u0018\u0000 92\u00020\u0001:\u00019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0015J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001eR\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u001eR\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselFramesAdapter;", "framesAdapter", "Lkotlin/Function1;", "", "", "onFrameScrollStateChanged", "onFrameSelected", "initFrameRecyclerView", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselFramesAdapter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "newPosition", "swipeFrameTo", "(I)V", "getScrollState", "()I", "newFramesCount", "setup", "isCompactSize", "setBannerHeight", "(Z)V", "bannerHeight", "I", "Lkotlin/jvm/functions/Function1;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/x;", "snapHelper", "Landroidx/recyclerview/widget/x;", "Landroidx/recyclerview/widget/RecyclerView;", "frameRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/FrameIndicatorView;", "frameIndicatorView", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/FrameIndicatorView;", "getFrameIndicatorView", "()Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/FrameIndicatorView;", "snapPosition", "ru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardView$onScrollListener$1", "onScrollListener", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardView$onScrollListener$1;", "Landroid/graphics/PointF;", "lastPoint", "Landroid/graphics/PointF;", "scaledTouchSlop", "ru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardView$horizontalSwipeHelperTouchListener$1", "horizontalSwipeHelperTouchListener", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardView$horizontalSwipeHelperTouchListener$1;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselCardView extends FrameLayout {
    private int bannerHeight;

    @NotNull
    private final FrameIndicatorView frameIndicatorView;

    @NotNull
    private final RecyclerView frameRecyclerView;

    @NotNull
    private final CarouselCardView$horizontalSwipeHelperTouchListener$1 horizontalSwipeHelperTouchListener;

    @NotNull
    private final PointF lastPoint;

    @NotNull
    private final LinearLayoutManager linearLayoutManager;
    private Function1<? super Boolean, Unit> onFrameScrollStateChanged;
    private Function1<? super Integer, Unit> onFrameSelected;

    @NotNull
    private final CarouselCardView$onScrollListener$1 onScrollListener;
    private final int scaledTouchSlop;

    @NotNull
    private final x snapHelper;
    private int snapPosition;
    public static final int $stable = 8;
    private static final int dp2 = ResourceExtKt.toPx(2);
    private static final int dp12 = ResourceExtKt.toPx(12);
    private static final float frameCornerRadius = ResourceExtKt.toPxF(16);
    private static final int blockHeightLarge = ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN);
    private static final int blockHeightCompact = ResourceExtKt.toPx(108);

    public /* synthetic */ CarouselCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final FrameIndicatorView getFrameIndicatorView() {
        return this.frameIndicatorView;
    }

    public final int getScrollState() {
        return this.frameRecyclerView.getScrollState();
    }

    public final void initFrameRecyclerView(@NotNull CarouselFramesAdapter framesAdapter, @NotNull Function1<? super Boolean, Unit> onFrameScrollStateChanged, @NotNull Function1<? super Integer, Unit> onFrameSelected) {
        Intrinsics.checkNotNullParameter(framesAdapter, "framesAdapter");
        Intrinsics.checkNotNullParameter(onFrameScrollStateChanged, "onFrameScrollStateChanged");
        Intrinsics.checkNotNullParameter(onFrameSelected, "onFrameSelected");
        this.frameRecyclerView.setAdapter(framesAdapter);
        this.onFrameScrollStateChanged = onFrameScrollStateChanged;
        this.onFrameSelected = onFrameSelected;
    }

    public final void setBannerHeight(boolean isCompactSize) {
        this.bannerHeight = isCompactSize ? blockHeightCompact : blockHeightLarge;
        this.frameRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.bannerHeight));
    }

    public final void setup(int newFramesCount) {
        this.snapPosition = 0;
        this.frameIndicatorView.setFramesCount(newFramesCount);
        swipeFrameTo(this.snapPosition);
        this.frameRecyclerView.setOverScrollMode(newFramesCount <= 1 ? 2 : 1);
    }

    public final void swipeFrameTo(int newPosition) {
        this.frameRecyclerView.smoothScrollToPosition(newPosition);
        this.frameIndicatorView.setCurrentFramePosition(newPosition);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardView$onScrollListener$1] */
    /* JADX WARN: Type inference failed for: r12v8, types: [androidx.recyclerview.widget.RecyclerView$s, ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardView$horizontalSwipeHelperTouchListener$1] */
    public CarouselCardView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.linearLayoutManager = linearLayoutManager;
        x xVar = new x();
        this.snapHelper = xVar;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setClipToOutline(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(frameCornerRadius);
        recyclerView.setBackground(gradientDrawable);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        xVar.attachToRecyclerView(recyclerView);
        this.frameRecyclerView = recyclerView;
        FrameIndicatorView frameIndicatorView = new FrameIndicatorView(context, null, 0, 6, null);
        frameIndicatorView.setId(R$id.frameIndicatorView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, dp2);
        layoutParams.gravity = 80;
        int i12 = dp12;
        layoutParams.setMargins(i12, 0, i12, i12);
        frameIndicatorView.setLayoutParams(layoutParams);
        this.frameIndicatorView = frameIndicatorView;
        this.snapPosition = -1;
        ?? r11 = new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardView$onScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Function1 function1;
                x xVar2;
                RecyclerView recyclerView3;
                int i13;
                Function1 function12;
                boolean z11;
                LinearLayoutManager linearLayoutManager2;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                function1 = CarouselCardView.this.onFrameScrollStateChanged;
                if (function1 != null) {
                    if (newState == 0) {
                        linearLayoutManager2 = CarouselCardView.this.linearLayoutManager;
                        if (linearLayoutManager2.findFirstCompletelyVisibleItemPosition() != -1) {
                            z11 = true;
                            function1.invoke(Boolean.valueOf(z11));
                        }
                    }
                    z11 = false;
                    function1.invoke(Boolean.valueOf(z11));
                }
                if (newState == 0) {
                    xVar2 = CarouselCardView.this.snapHelper;
                    recyclerView3 = CarouselCardView.this.frameRecyclerView;
                    Integer a11 = b.a(xVar2, recyclerView3);
                    int intValue = a11 != null ? a11.intValue() : -1;
                    i13 = CarouselCardView.this.snapPosition;
                    if (intValue != i13 && intValue != -1) {
                        CarouselCardView.this.getFrameIndicatorView().setCurrentFramePosition(intValue);
                        function12 = CarouselCardView.this.onFrameSelected;
                        if (function12 != null) {
                            function12.invoke(Integer.valueOf(intValue));
                        }
                    }
                    CarouselCardView.this.snapPosition = intValue;
                }
            }
        };
        this.onScrollListener = r11;
        this.lastPoint = new PointF(0.0f, 0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ?? r12 = new RecyclerView.y() { // from class: ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardView$horizontalSwipeHelperTouchListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView recyclerView2, MotionEvent event) {
                PointF pointF;
                PointF pointF2;
                PointF pointF3;
                PointF pointF4;
                int i13;
                Boolean bool;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                Intrinsics.checkNotNullParameter(event, "event");
                int action = event.getAction() & 255;
                if (action == 0) {
                    recyclerView2.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (action == 2) {
                    float x11 = event.getX();
                    pointF2 = CarouselCardView.this.lastPoint;
                    float abs = Math.abs(x11 - pointF2.x);
                    float y11 = event.getY();
                    pointF3 = CarouselCardView.this.lastPoint;
                    if (abs > Math.abs(y11 - pointF3.y)) {
                        bool = Boolean.TRUE;
                    } else {
                        float y12 = event.getY();
                        pointF4 = CarouselCardView.this.lastPoint;
                        float abs2 = Math.abs(y12 - pointF4.y);
                        i13 = CarouselCardView.this.scaledTouchSlop;
                        bool = abs2 > ((float) i13) ? Boolean.FALSE : null;
                    }
                    if (bool != null) {
                        recyclerView2.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    }
                }
                pointF = CarouselCardView.this.lastPoint;
                pointF.set(event.getX(), event.getY());
                return false;
            }
        };
        this.horizontalSwipeHelperTouchListener = r12;
        addView(recyclerView);
        addView(frameIndicatorView);
        recyclerView.addOnScrollListener(r11);
        recyclerView.addOnItemTouchListener(r12);
    }
}
