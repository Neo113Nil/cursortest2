package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000 &2\u00020\u0001:\u0002&'B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "e", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "prevX", "F", "getPrevX", "()F", "setPrevX", "(F)V", "prevY", "getPrevY", "setPrevY", "canIntercept", "Z", "getCanIntercept", "()Z", "setCanIntercept", "(Z)V", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView$HorizontalRecyclerViewPullListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView$HorizontalRecyclerViewPullListener;", "getListener", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView$HorizontalRecyclerViewPullListener;", "setListener", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView$HorizontalRecyclerViewPullListener;)V", "Companion", "HorizontalRecyclerViewPullListener", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public class PullableHorizontalRecyclerView extends RecyclerView {
    private boolean canIntercept;
    private HorizontalRecyclerViewPullListener listener;
    private float prevX;
    private float prevY;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/PullableHorizontalRecyclerView$HorizontalRecyclerViewPullListener;", "", "onPull", "", "displacementPx", "", "isMovingToStart", "", "onRelease", "onFastScrolledToEnd", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface HorizontalRecyclerViewPullListener {
        void onFastScrolledToEnd();

        void onPull(float displacementPx, boolean isMovingToStart);

        void onRelease();
    }

    public /* synthetic */ PullableHorizontalRecyclerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final HorizontalRecyclerViewPullListener getListener() {
        return this.listener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r0 != 3) goto L38;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent e11) {
        HorizontalRecyclerViewPullListener horizontalRecyclerViewPullListener;
        Intrinsics.checkNotNullParameter(e11, "e");
        if (!this.canIntercept) {
            return super.onTouchEvent(e11);
        }
        int actionMasked = e11.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float abs = Math.abs(e11.getX() - this.prevX);
                    if (abs <= Math.abs(e11.getY() - this.prevY)) {
                        this.prevX = e11.getX();
                        this.prevY = e11.getY();
                        return super.onTouchEvent(e11);
                    }
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    HorizontalRecyclerViewPullListener horizontalRecyclerViewPullListener2 = this.listener;
                    if (horizontalRecyclerViewPullListener2 != null) {
                        horizontalRecyclerViewPullListener2.onPull(abs, e11.getX() > this.prevX);
                    }
                    this.prevX = e11.getX();
                    this.prevY = e11.getY();
                }
            }
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            this.prevX = 0.0f;
            this.prevY = 0.0f;
            if (actionMasked == 1 && (horizontalRecyclerViewPullListener = this.listener) != null) {
                horizontalRecyclerViewPullListener.onRelease();
            }
        } else {
            this.prevX = e11.getX();
            this.prevY = e11.getY();
        }
        if (isAttachedToWindow()) {
            return super.onTouchEvent(e11);
        }
        return true;
    }

    public final void setCanIntercept(boolean z11) {
        this.canIntercept = z11;
    }

    public final void setListener(HorizontalRecyclerViewPullListener horizontalRecyclerViewPullListener) {
        this.listener = horizontalRecyclerViewPullListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullableHorizontalRecyclerView(@NotNull final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setEdgeEffectFactory(new RecyclerView.k() { // from class: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.k
            protected EdgeEffect createEdgeEffect(RecyclerView view, int direction) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (PullableHorizontalRecyclerView.this.getListener() == null || direction != 2) {
                    return new EdgeEffect(view.getContext());
                }
                final Context context2 = context;
                final PullableHorizontalRecyclerView pullableHorizontalRecyclerView = PullableHorizontalRecyclerView.this;
                return new EdgeEffect(context2) { // from class: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView$1$createEdgeEffect$1
                    @Override // android.widget.EdgeEffect
                    public void onAbsorb(int velocity) {
                        PullableHorizontalRecyclerView.HorizontalRecyclerViewPullListener listener = pullableHorizontalRecyclerView.getListener();
                        if (listener != null) {
                            listener.onFastScrolledToEnd();
                        }
                        super.onAbsorb(velocity);
                    }
                };
            }
        });
    }
}
