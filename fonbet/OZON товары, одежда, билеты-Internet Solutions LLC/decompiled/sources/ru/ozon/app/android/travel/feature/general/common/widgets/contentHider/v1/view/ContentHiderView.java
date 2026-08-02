package ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.view;

import Am.C2438a;
import B0.C2454a;
import K00.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0002R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/view/ContentHiderView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/view/ContentHiderView$ViewState;", "viewState", "getViewState", "()Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/view/ContentHiderView$ViewState;", "setViewState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/view/ContentHiderView$ViewState;)V", "paint", "Landroid/graphics/Paint;", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "updateWithViewState", "ViewState", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentHiderView extends View {

    @NotNull
    private final Paint paint;

    @NotNull
    private ViewState viewState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentHiderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewState = new ViewState(0, 0, ThemeExtKt.themeColor(context, R$attr.layerFloor1), 3, null);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        setClickable(false);
        setFocusable(false);
        setElevation(1.0f);
        setOutlineProvider(null);
    }

    private final void updateWithViewState(ViewState viewState) {
        this.paint.setColor(viewState.getBackgroundColor());
        requestLayout();
    }

    @NotNull
    public final ViewState getViewState() {
        return this.viewState;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPaint(this.paint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.viewState.getBottomOpticalPartHeight() + this.viewState.getTopOpticalPartHeight(), 1073741824));
    }

    public final void setViewState(@NotNull ViewState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.viewState, value)) {
            return;
        }
        this.viewState = value;
        updateWithViewState(value);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/view/ContentHiderView$ViewState;", "", "", "topOpticalPartHeight", "bottomOpticalPartHeight", "backgroundColor", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTopOpticalPartHeight", "getBottomOpticalPartHeight", "getBackgroundColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewState {
        private final int backgroundColor;
        private final int bottomOpticalPartHeight;
        private final int topOpticalPartHeight;

        public ViewState(int i11, int i12, int i13) {
            this.topOpticalPartHeight = i11;
            this.bottomOpticalPartHeight = i12;
            this.backgroundColor = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.topOpticalPartHeight == viewState.topOpticalPartHeight && this.bottomOpticalPartHeight == viewState.bottomOpticalPartHeight && this.backgroundColor == viewState.backgroundColor;
        }

        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int getBottomOpticalPartHeight() {
            return this.bottomOpticalPartHeight;
        }

        public final int getTopOpticalPartHeight() {
            return this.topOpticalPartHeight;
        }

        public int hashCode() {
            return Integer.hashCode(this.backgroundColor) + C2454a.a(this.bottomOpticalPartHeight, Integer.hashCode(this.topOpticalPartHeight) * 31, 31);
        }

        @NotNull
        public String toString() {
            return b.e(this.backgroundColor, ")", C2438a.a("ViewState(topOpticalPartHeight=", this.topOpticalPartHeight, ", bottomOpticalPartHeight=", ", backgroundColor=", this.bottomOpticalPartHeight));
        }

        public /* synthetic */ ViewState(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, i13);
        }
    }
}
