package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views;

import Pk0.h;
import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarTeethVO;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 h2\u00020\u0001:\u0002hiB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u0011*\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010\u000eJ/\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010%J7\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u000fH\u0016¢\u0006\u0004\b2\u0010\u0013J\u0019\u00103\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b3\u0010\u0013J\u0019\u00106\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000208H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010Z\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R.\u0010b\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010`8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006j"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewWidth", "viewHeight", "", "updatePaths", "(II)V", "Landroid/view/MotionEvent;", "event", "", "isCutoutClick", "(Landroid/view/MotionEvent;)Z", "dispatchTouchDownToContent", "(Landroid/view/MotionEvent;)V", "dispatchTouchEventToTarget", "Landroid/view/View;", "dispatchSelfTouchEvent", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "view", "blockNavBarTouchInterception", "(Landroid/view/View;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "ev", "onInterceptTouchEvent", "onTouchEvent", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "alpha", "setAlpha", "(F)V", "getAlpha", "()F", "color", "setBackgroundColor", "(I)V", "Landroid/graphics/Path;", "teethPath", "Landroid/graphics/Path;", "Landroid/graphics/Region;", "teethRegion", "Landroid/graphics/Region;", "isFromCutout", "Z", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView$CutoutTouchTarget;", "cutoutTouchTarget", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView$CutoutTouchTarget;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "bgPaint", "Landroid/widget/ImageView;", "imageBg", "Landroid/widget/ImageView;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerComposer", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerComposer", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerComposer", "(Landroidx/recyclerview/widget/RecyclerView;)V", "stickyWidgetsContainer", "Landroid/view/ViewGroup;", "getStickyWidgetsContainer", "()Landroid/view/ViewGroup;", "setStickyWidgetsContainer", "(Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "teeth", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", "getTeeth", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", "setTeeth", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;)V", "Companion", "CutoutTouchTarget", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarBgView extends ViewGroup {

    @NotNull
    private final Paint bgPaint;
    private CutoutTouchTarget cutoutTouchTarget;

    @NotNull
    private final ImageView imageBg;
    private boolean isFromCutout;

    @NotNull
    private final Paint paint;
    private RecyclerView recyclerComposer;
    private ViewGroup stickyWidgetsContainer;
    private ShellNavBarTeethVO teeth;

    @NotNull
    private final Path teethPath;

    @NotNull
    private final Region teethRegion;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView$Companion;", "", "<init>", "()V", "POINT_ZERO", "", "CONTAINER_ALPHA", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView$CutoutTouchTarget;", "", "<init>", "(Ljava/lang/String;I)V", "STICKY", "RECYCLER", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class CutoutTouchTarget {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CutoutTouchTarget[] $VALUES;
        public static final CutoutTouchTarget STICKY = new CutoutTouchTarget("STICKY", 0);
        public static final CutoutTouchTarget RECYCLER = new CutoutTouchTarget("RECYCLER", 1);

        private static final /* synthetic */ CutoutTouchTarget[] $values() {
            return new CutoutTouchTarget[]{STICKY, RECYCLER};
        }

        static {
            CutoutTouchTarget[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CutoutTouchTarget(String str, int i11) {
        }

        public static CutoutTouchTarget valueOf(String str) {
            return (CutoutTouchTarget) Enum.valueOf(CutoutTouchTarget.class, str);
        }

        public static CutoutTouchTarget[] values() {
            return (CutoutTouchTarget[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CutoutTouchTarget.values().length];
            try {
                iArr[CutoutTouchTarget.STICKY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CutoutTouchTarget.RECYCLER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ShellNavBarBgView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void blockNavBarTouchInterception(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof CollapsingToolbarLayout) || (parent instanceof AppBarLayout)) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private final boolean dispatchSelfTouchEvent(View view, MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        getLocationOnScreen(new int[2]);
        view.getLocationOnScreen(new int[2]);
        obtain.offsetLocation(r1[0] - r0[0], r1[1] - r0[1]);
        boolean dispatchTouchEvent = view.dispatchTouchEvent(obtain);
        obtain.recycle();
        return dispatchTouchEvent;
    }

    private final void dispatchTouchDownToContent(MotionEvent event) {
        ViewGroup viewGroup = this.stickyWidgetsContainer;
        if (viewGroup != null && dispatchSelfTouchEvent(viewGroup, event)) {
            this.cutoutTouchTarget = CutoutTouchTarget.STICKY;
            return;
        }
        RecyclerView recyclerView = this.recyclerComposer;
        if (recyclerView != null) {
            dispatchSelfTouchEvent(recyclerView, event);
        }
        this.cutoutTouchTarget = CutoutTouchTarget.RECYCLER;
    }

    private final void dispatchTouchEventToTarget(MotionEvent event) {
        CutoutTouchTarget cutoutTouchTarget = this.cutoutTouchTarget;
        int i11 = cutoutTouchTarget == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cutoutTouchTarget.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                ViewGroup viewGroup = this.stickyWidgetsContainer;
                if (viewGroup != null) {
                    dispatchSelfTouchEvent(viewGroup, event);
                    return;
                }
                return;
            }
            if (i11 != 2) {
                throw new o();
            }
            RecyclerView recyclerView = this.recyclerComposer;
            if (recyclerView != null) {
                dispatchSelfTouchEvent(recyclerView, event);
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

    @Override // android.view.View
    public float getAlpha() {
        return this.imageBg.getAlpha();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        this.isFromCutout = false;
        if (!isCutoutClick(ev)) {
            return super.onInterceptTouchEvent(ev);
        }
        if (ev.getActionMasked() != 0) {
            return false;
        }
        blockNavBarTouchInterception(this);
        this.isFromCutout = true;
        dispatchTouchDownToContent(ev);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        LayoutExtKt.layoutLeftTop(this.imageBg, 0, 0);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.imageBg.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
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
                dispatchTouchEventToTarget(event);
                return true;
            }
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                dispatchTouchEventToTarget(event);
                this.cutoutTouchTarget = null;
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void setAlpha(float alpha) {
        this.imageBg.setAlpha(alpha);
        super.setAlpha(1.0f);
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        this.imageBg.setBackground(background);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.bgPaint.setColor(color);
    }

    public final void setRecyclerComposer(RecyclerView recyclerView) {
        this.recyclerComposer = recyclerView;
    }

    public final void setStickyWidgetsContainer(ViewGroup viewGroup) {
        this.stickyWidgetsContainer = viewGroup;
    }

    public final void setTeeth(ShellNavBarTeethVO shellNavBarTeethVO) {
        this.teeth = shellNavBarTeethVO;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShellNavBarBgView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.teethPath = new Path();
        this.teethRegion = new Region();
        Paint a11 = h.a(true);
        Paint.Style style = Paint.Style.FILL;
        a11.setStyle(style);
        a11.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.paint = a11;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(style);
        this.bgPaint = paint;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(imageView);
        this.imageBg = imageView;
        setClickable(true);
        setFocusable(true);
    }
}
