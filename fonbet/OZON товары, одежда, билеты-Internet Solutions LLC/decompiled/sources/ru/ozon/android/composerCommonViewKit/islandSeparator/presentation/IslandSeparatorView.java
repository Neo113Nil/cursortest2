package ru.ozon.android.composerCommonViewKit.islandSeparator.presentation;

import B0.C2454a;
import J0.P;
import Kk.C3532b;
import Lh.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002'(B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0014J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u0007H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0002R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView$ViewState;", "viewState", "getViewState", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView$ViewState;", "setViewState", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView$ViewState;)V", "paint", "Landroid/graphics/Paint;", "islandPath", "Landroid/graphics/Path;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "getDefaultBackgroundColor", "updateWithViewState", "calculateDesiredHeight", "updatePaths", "viewWidth", "viewHeight", "Companion", "ViewState", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IslandSeparatorView extends View {

    @NotNull
    private final Path islandPath;

    @NotNull
    private final Paint paint;

    @NotNull
    private ViewState viewState;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final float CORNER_HEIGHT_PX = UiExtKt.toPxF(40);
    private static final float CORNER_ARC_OFFSET = UiExtKt.toPxF(10);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView$Companion;", "", "<init>", "()V", "CORNER_HEIGHT_PX", "", "getCORNER_HEIGHT_PX", "()F", "CORNER_ARC_OFFSET", "getCORNER_ARC_OFFSET", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCORNER_ARC_OFFSET() {
            return IslandSeparatorView.CORNER_ARC_OFFSET;
        }

        public final float getCORNER_HEIGHT_PX() {
            return IslandSeparatorView.CORNER_HEIGHT_PX;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IslandSeparatorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int calculateDesiredHeight(ViewState viewState) {
        int physicalPartHeight = viewState.getPhysicalPartHeight();
        if (viewState.getHasTopCorners()) {
            physicalPartHeight += (int) CORNER_HEIGHT_PX;
        }
        return viewState.getHasBottomCorners() ? physicalPartHeight + ((int) CORNER_HEIGHT_PX) : physicalPartHeight;
    }

    private final int getDefaultBackgroundColor() {
        if (isInEditMode()) {
            return -7829368;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ThemeExtKt.themeColor(context, R$attr.oz_semantic_bg_primary);
    }

    private final void updatePaths(int viewWidth, int viewHeight) {
        float f7;
        float f11 = viewWidth;
        float f12 = viewHeight;
        this.islandPath.reset();
        ViewState viewState = this.viewState;
        if (viewState.getHasTopCorners()) {
            Path path = this.islandPath;
            float f13 = CORNER_ARC_OFFSET;
            path.moveTo(0.0f, f13);
            Path path2 = this.islandPath;
            f7 = CORNER_HEIGHT_PX;
            path2.quadTo(0.0f, f7, f7 - f13, f7);
            this.islandPath.lineTo((f11 - f7) + f13, f7);
            this.islandPath.quadTo(f11, f7, f11, f13);
        } else {
            this.islandPath.moveTo(0.0f, 0.0f);
            this.islandPath.lineTo(f11, 0.0f);
            f7 = 0.0f;
        }
        float physicalPartHeight = f7 + viewState.getPhysicalPartHeight();
        this.islandPath.lineTo(f11, physicalPartHeight);
        if (viewState.getHasBottomCorners()) {
            Path path3 = this.islandPath;
            float f14 = CORNER_ARC_OFFSET;
            path3.lineTo(f11, f12 - f14);
            Path path4 = this.islandPath;
            float f15 = CORNER_HEIGHT_PX;
            path4.quadTo(f11, f12 - f15, (f11 - f15) + f14, f12 - f15);
            this.islandPath.lineTo(f15 - f14, f12 - f15);
            this.islandPath.quadTo(0.0f, f12 - f15, 0.0f, f12 - f14);
            this.islandPath.lineTo(0.0f, physicalPartHeight);
        } else {
            this.islandPath.lineTo(f11, f12);
            this.islandPath.lineTo(0.0f, f12);
            this.islandPath.lineTo(0.0f, physicalPartHeight);
        }
        this.islandPath.lineTo(0.0f, viewState.getHasTopCorners() ? CORNER_ARC_OFFSET : 0.0f);
        this.islandPath.close();
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
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.islandPath, this.paint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(calculateDesiredHeight(this.viewState), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        if (w11 == oldw && h11 == oldh) {
            return;
        }
        updatePaths(w11, h11);
    }

    public final void setViewState(@NotNull ViewState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.viewState, value)) {
            return;
        }
        this.viewState = value;
        updateWithViewState(value);
    }

    public /* synthetic */ IslandSeparatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IslandSeparatorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewState = new ViewState(false, false, 0, getDefaultBackgroundColor(), 7, null);
        Paint paint = new Paint();
        paint.setColor(this.viewState.getBackgroundColor());
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        this.islandPath = new Path();
        setClickable(false);
        setFocusable(false);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView$ViewState;", "", "", "hasTopCorners", "hasBottomCorners", "", "physicalPartHeight", "backgroundColor", "<init>", "(ZZII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasTopCorners", "()Z", "getHasBottomCorners", "I", "getPhysicalPartHeight", "getBackgroundColor", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewState {
        private final int backgroundColor;
        private final boolean hasBottomCorners;
        private final boolean hasTopCorners;
        private final int physicalPartHeight;

        public ViewState(boolean z11, boolean z12, int i11, int i12) {
            this.hasTopCorners = z11;
            this.hasBottomCorners = z12;
            this.physicalPartHeight = i11;
            this.backgroundColor = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.hasTopCorners == viewState.hasTopCorners && this.hasBottomCorners == viewState.hasBottomCorners && this.physicalPartHeight == viewState.physicalPartHeight && this.backgroundColor == viewState.backgroundColor;
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

        public final int getPhysicalPartHeight() {
            return this.physicalPartHeight;
        }

        public int hashCode() {
            return Integer.hashCode(this.backgroundColor) + C2454a.a(this.physicalPartHeight, C3532b.a(Boolean.hashCode(this.hasTopCorners) * 31, 31, this.hasBottomCorners), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.physicalPartHeight, this.backgroundColor, ", backgroundColor=", ")", a.d("ViewState(hasTopCorners=", ", hasBottomCorners=", ", physicalPartHeight=", this.hasTopCorners, this.hasBottomCorners));
        }

        public /* synthetic */ ViewState(boolean z11, boolean z12, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? true : z11, (i13 & 2) != 0 ? true : z12, (i13 & 4) != 0 ? UiExtKt.toPx(8) : i11, i12);
        }
    }
}
