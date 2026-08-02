package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views;

import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarTeethVO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 C2\u00020\u0001:\u0001CB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u0013J\u0019\u0010$\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b$\u0010\u0013J\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R.\u0010=\u001a\u0004\u0018\u00010<2\b\u0010&\u001a\u0004\u0018\u00010<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarScrollFloorView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewWidth", "viewHeight", "", "updatePaths", "(II)V", "Landroid/view/MotionEvent;", "event", "", "isCutoutClick", "(Landroid/view/MotionEvent;)Z", "Landroid/view/View;", "view", "blockNavBarTouchInterception", "(Landroid/view/View;)V", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "ev", "onInterceptTouchEvent", "onTouchEvent", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateChildTranslationY", "(F)V", "Landroid/graphics/Path;", "teethPath", "Landroid/graphics/Path;", "Landroid/graphics/Region;", "teethRegion", "Landroid/graphics/Region;", "isFromCutout", "Z", "Landroid/graphics/Paint;", "bgPaint", "Landroid/graphics/Paint;", "paint", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerComposer", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerComposer", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerComposer", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", "teeth", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", "getTeeth", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", "setTeeth", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;)V", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarScrollFloorView extends FrameLayout {

    @NotNull
    private final Paint bgPaint;
    private boolean isFromCutout;

    @NotNull
    private final Paint paint;
    private RecyclerView recyclerComposer;
    private ShellNavBarTeethVO teeth;

    @NotNull
    private final Path teethPath;

    @NotNull
    private final Region teethRegion;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarScrollFloorView$Companion;", "", "<init>", "()V", "POINT_ZERO", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShellNavBarScrollFloorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void blockNavBarTouchInterception(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof CollapsingToolbarLayout) || (parent instanceof AppBarLayout)) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private final boolean isCutoutClick(MotionEvent event) {
        if (event == null) {
            return false;
        }
        return this.teethRegion.contains((int) event.getX(), (int) event.getY());
    }

    private final void updatePaths(int viewWidth, int viewHeight) {
        ShellNavBarTeethVO shellNavBarTeethVO = this.teeth;
        if (shellNavBarTeethVO == null) {
            return;
        }
        float f7 = viewWidth;
        float f11 = viewHeight;
        float teethHeight = shellNavBarTeethVO.getTeethHeight();
        Path path = this.teethPath;
        path.reset();
        path.moveTo(0.0f, f11);
        float f12 = f11 - teethHeight;
        path.quadTo(0.0f, f12, teethHeight, f12);
        path.lineTo(f7 - teethHeight, f12);
        path.quadTo(f7, f12, f7, f11);
        path.close();
        RectF rectF = new RectF();
        this.teethPath.computeBounds(rectF, true);
        Region region = this.teethRegion;
        Path path2 = this.teethPath;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        region.setPath(path2, new Region(rect));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.bgPaint);
        super.dispatchDraw(canvas);
        if (this.teeth != null) {
            canvas.drawPath(this.teethPath, this.paint);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        boolean z11 = false;
        this.isFromCutout = false;
        if (!isCutoutClick(ev)) {
            return super.onInterceptTouchEvent(ev);
        }
        if (ev.getActionMasked() == 0) {
            blockNavBarTouchInterception(this);
            z11 = true;
            this.isFromCutout = true;
            RecyclerView recyclerView = this.recyclerComposer;
            if (recyclerView != null) {
                recyclerView.dispatchTouchEvent(ev);
            }
        }
        return z11;
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        if (width == oldw && height == oldh) {
            return;
        }
        updatePaths(width, height);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (isCutoutClick(event) || this.isFromCutout) {
            Integer valueOf = event != null ? Integer.valueOf(event.getActionMasked()) : null;
            if (valueOf != null && valueOf.intValue() == 2) {
                RecyclerView recyclerView = this.recyclerComposer;
                if (recyclerView != null) {
                    recyclerView.dispatchTouchEvent(event);
                }
                return true;
            }
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                RecyclerView recyclerView2 = this.recyclerComposer;
                if (recyclerView2 != null) {
                    recyclerView2.dispatchTouchEvent(event);
                }
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setRecyclerComposer(RecyclerView recyclerView) {
        this.recyclerComposer = recyclerView;
    }

    public final void setTeeth(ShellNavBarTeethVO shellNavBarTeethVO) {
        this.teeth = shellNavBarTeethVO;
        invalidate();
    }

    public final void updateChildTranslationY(float value) {
        View view = (View) l.l(C5316f0.b(this));
        if (view != null) {
            view.setTranslationY(value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShellNavBarScrollFloorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.teethPath = new Path();
        this.teethRegion = new Region();
        Paint a11 = h.a(true);
        Paint.Style style = Paint.Style.FILL;
        a11.setStyle(style);
        this.bgPaint = a11;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.paint = paint;
        setClickable(true);
        setFocusable(true);
    }
}
