package ru.ozon.app.android.common.filterWidgets.filters.presentation.islandSeparator;

import B0.C2454a;
import Kk.C3532b;
import Lh.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0000\u0018\u0000 62\u00020\u0001:\u000267B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0015J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0015J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0002J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002JL\u0010-\u001a\u00020\u0018*\u00020\u00152\u0006\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultBackgroundColor", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorView$ViewState;", "viewState", "getViewState", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorView$ViewState;", "setViewState", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorView$ViewState;)V", "paint", "Landroid/graphics/Paint;", "topCornersPath", "Landroid/graphics/Path;", "bottomCornersPath", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "newW", "newH", "oldW", "oldH", "onDraw", "canvas", "Landroid/graphics/Canvas;", "updateWithViewState", "calculateDesiredHeight", "updatePaths", "viewWidth", "viewHeight", "drawTopCorners", "width", "", "drawBottomCorners", "height", "drawCorner", "moveX", "moveY", "quadX1", "quadY1", "quadX2", "quadY2", "lineToX", "lineToY", "Companion", "ViewState", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FiltersIslandSeparatorView extends View {

    @NotNull
    private final Path bottomCornersPath;
    private final int defaultBackgroundColor;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path topCornersPath;

    @NotNull
    private ViewState viewState;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int cornersHeightPx = ResourceExtKt.toPx(40);
    private static final float cornersHeightPxF = UiExtKt.toPxF(40);
    private static final float cornerArcOffset = UiExtKt.toPxF(10);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorView$Companion;", "", "<init>", "()V", "DEFAULT_SEPARATOR_HEIGHT", "", "CORNER_HEIGHT_DP", "ACCURACY", "", "cornersHeightPx", "getCornersHeightPx", "()I", "cornersHeightPxF", "cornerArcOffset", "FILTERS_ISLAND_SEPARATOR_TAG", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCornersHeightPx() {
            return FiltersIslandSeparatorView.cornersHeightPx;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FiltersIslandSeparatorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int calculateDesiredHeight(ViewState viewState) {
        int physicalPartHeightPx = viewState.getPhysicalPartHeightPx();
        if (viewState.getHasTopCorners()) {
            physicalPartHeightPx += cornersHeightPx;
        }
        return viewState.getHasBottomCorners() ? physicalPartHeightPx + cornersHeightPx : physicalPartHeightPx;
    }

    private final void drawBottomCorners(float width, float height) {
        Path path = this.bottomCornersPath;
        path.reset();
        float pxF = UiExtKt.toPxF(this.viewState.getPhysicalPartHeightDp()) - 1.0f;
        if (this.viewState.getHasTopCorners()) {
            pxF += cornersHeightPxF;
        }
        float f7 = pxF;
        float f11 = cornersHeightPxF;
        float f12 = cornerArcOffset;
        drawCorner(path, f11 - f12, f7, 0.0f, f7, 0.0f, height - f12, 0.0f, f7);
        drawCorner(path, (width - f11) + f12, f7, width, f7, width, height - f12, width, f7);
    }

    private final void drawCorner(Path path, float f7, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        path.moveTo(f7, f11);
        path.quadTo(f12, f13, f14, f15);
        path.lineTo(f16, f17);
        path.close();
    }

    private final void drawTopCorners(float width) {
        Path path = this.topCornersPath;
        path.reset();
        float f7 = cornersHeightPxF + 1.0f;
        float f11 = cornerArcOffset;
        drawCorner(path, 0.0f, f11, 0.0f, f7, f7 - f11, f7, 0.0f, f7);
        drawCorner(path, width, f11, width, f7, (width - f7) + f11, f7, width, f7);
    }

    private final void updatePaths(int viewWidth, int viewHeight) {
        float f7 = viewWidth;
        drawTopCorners(f7);
        drawBottomCorners(f7, viewHeight);
    }

    private final void updateWithViewState(ViewState viewState) {
        this.paint.setColor(viewState.getBackgroundColor());
        if (getWidth() != 0 && getHeight() != 0) {
            updatePaths(getWidth(), getHeight());
        }
        requestLayout();
    }

    @NotNull
    public final ViewState getViewState() {
        return this.viewState;
    }

    @Override // android.view.View
    @SuppressLint({"LifecycleMethodsOrder"})
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ViewState viewState = this.viewState;
        canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        Integer separatorColor = this.viewState.getSeparatorColor();
        if (viewState.getHasTopCorners()) {
            canvas.drawPath(this.topCornersPath, this.paint);
        }
        if (viewState.getHasBottomCorners()) {
            canvas.drawPath(this.bottomCornersPath, this.paint);
        }
        if (separatorColor != null) {
            this.paint.setColor(separatorColor.intValue());
        }
        if (viewState.getPhysicalPartHeightPx() > 0) {
            float f7 = viewState.getHasTopCorners() ? cornersHeightPxF : 0.0f;
            canvas.drawRect(0.0f, f7, getWidth(), f7 + viewState.getPhysicalPartHeightPx(), this.paint);
        }
        canvas.restore();
        this.paint.setColor(this.viewState.getBackgroundColor());
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(calculateDesiredHeight(this.viewState), 1073741824));
    }

    @Override // android.view.View
    @SuppressLint({"LifecycleMethodsOrder"})
    protected void onSizeChanged(int newW, int newH, int oldW, int oldH) {
        if (newW == oldW && newH == oldH) {
            return;
        }
        updatePaths(newW, newH);
    }

    public final void setViewState(@NotNull ViewState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.viewState, value)) {
            return;
        }
        this.viewState = value;
        updateWithViewState(value);
    }

    public /* synthetic */ FiltersIslandSeparatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersIslandSeparatorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor0);
        this.defaultBackgroundColor = themeColor;
        this.viewState = new ViewState(false, false, 0, themeColor, null, 23, null);
        Paint paint = new Paint();
        paint.setColor(this.viewState.getBackgroundColor());
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.paint = paint;
        this.topCornersPath = new Path();
        this.bottomCornersPath = new Path();
        setTag("filters_island_separator");
        setClickable(false);
        setFocusable(false);
        setBackgroundColor(0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorView$ViewState;", "", "", "hasTopCorners", "hasBottomCorners", "", "physicalPartHeightDp", "backgroundColor", "separatorColor", "<init>", "(ZZIILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasTopCorners", "()Z", "getHasBottomCorners", "I", "getPhysicalPartHeightDp", "getBackgroundColor", "Ljava/lang/Integer;", "getSeparatorColor", "()Ljava/lang/Integer;", "getPhysicalPartHeightPx", "physicalPartHeightPx", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewState {
        private final int backgroundColor;
        private final boolean hasBottomCorners;
        private final boolean hasTopCorners;
        private final int physicalPartHeightDp;
        private final Integer separatorColor;

        public ViewState(boolean z11, boolean z12, int i11, int i12, Integer num) {
            this.hasTopCorners = z11;
            this.hasBottomCorners = z12;
            this.physicalPartHeightDp = i11;
            this.backgroundColor = i12;
            this.separatorColor = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.hasTopCorners == viewState.hasTopCorners && this.hasBottomCorners == viewState.hasBottomCorners && this.physicalPartHeightDp == viewState.physicalPartHeightDp && this.backgroundColor == viewState.backgroundColor && Intrinsics.d(this.separatorColor, viewState.separatorColor);
        }

        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final boolean getHasBottomCorners() {
            return this.hasBottomCorners;
        }

        public final boolean getHasTopCorners() {
            return this.hasTopCorners;
        }

        public final int getPhysicalPartHeightDp() {
            return this.physicalPartHeightDp;
        }

        public final int getPhysicalPartHeightPx() {
            return ResourceExtKt.toPx(this.physicalPartHeightDp);
        }

        public final Integer getSeparatorColor() {
            return this.separatorColor;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.backgroundColor, C2454a.a(this.physicalPartHeightDp, C3532b.a(Boolean.hashCode(this.hasTopCorners) * 31, 31, this.hasBottomCorners), 31), 31);
            Integer num = this.separatorColor;
            return a11 + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            boolean z11 = this.hasTopCorners;
            boolean z12 = this.hasBottomCorners;
            int i11 = this.physicalPartHeightDp;
            int i12 = this.backgroundColor;
            Integer num = this.separatorColor;
            StringBuilder d11 = a.d("ViewState(hasTopCorners=", ", hasBottomCorners=", ", physicalPartHeightDp=", z11, z12);
            Ek.a.f(i11, i12, ", backgroundColor=", ", separatorColor=", d11);
            return Ep.a.c(d11, num, ")");
        }

        public /* synthetic */ ViewState(boolean z11, boolean z12, int i11, int i12, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? true : z11, (i13 & 2) != 0 ? true : z12, (i13 & 4) != 0 ? 4 : i11, i12, (i13 & 16) != 0 ? null : num);
        }
    }
}
