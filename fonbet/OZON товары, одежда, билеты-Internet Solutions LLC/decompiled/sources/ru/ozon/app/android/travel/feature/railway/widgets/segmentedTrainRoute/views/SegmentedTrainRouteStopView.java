package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.views;

import D40.a;
import F3.G;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.stop.SegmentedTrainRouteStopVI;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010%\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\u001fR\u0016\u0010D\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010\u001f¨\u0006E"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/views/SegmentedTrainRouteStopView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "setConstrains", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/stop/SegmentedTrainRouteStopVI;", "stop", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/stop/SegmentedTrainRouteStopVI;)V", "dp2", "I", "", "dpf4", "F", "dpf6", "dpf8", "dp12", "dpf16", "dpf20", "pdf26", "dp40", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "arrivalTimeTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "departureTimeTAV", "cityTAV", "stationTAV", "Landroidx/constraintlayout/widget/Guideline;", "guidelineG", "Landroidx/constraintlayout/widget/Guideline;", "Landroid/graphics/Paint;", "linePaint", "Landroid/graphics/Paint;", "circlePaintFill", "circlePaintStroke", "Landroid/graphics/drawable/ShapeDrawable;", "roundedBackground$delegate", "LSc/j;", "getRoundedBackground", "()Landroid/graphics/drawable/ShapeDrawable;", "roundedBackground", "Landroid/graphics/drawable/ColorDrawable;", "defaultBackground", "Landroid/graphics/drawable/ColorDrawable;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/stop/SegmentedTrainRouteStopVI$StopPosition;", "stopPosition", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/stop/SegmentedTrainRouteStopVI$StopPosition;", "isBoardingStop", "Z", "centerLineX", "circleY", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteStopView extends ConstraintLayout {

    @NotNull
    private final TextAtomV2View arrivalTimeTAV;
    private float centerLineX;

    @NotNull
    private final Paint circlePaintFill;

    @NotNull
    private final Paint circlePaintStroke;
    private float circleY;

    @NotNull
    private final TextAtomV2View cityTAV;

    @NotNull
    private final ColorDrawable defaultBackground;

    @NotNull
    private final TextAtomV2View departureTimeTAV;
    private final int dp12;
    private final int dp2;
    private final int dp40;
    private final float dpf16;
    private final float dpf20;
    private final float dpf4;
    private final float dpf6;
    private final float dpf8;

    @NotNull
    private final Guideline guidelineG;
    private boolean isBoardingStop;

    @NotNull
    private final Paint linePaint;
    private final float pdf26;

    /* renamed from: roundedBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j roundedBackground;

    @NotNull
    private final TextAtomV2View stationTAV;
    private SegmentedTrainRouteStopVI.StopPosition stopPosition;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentedTrainRouteStopVI.StopPosition.values().length];
            try {
                iArr[SegmentedTrainRouteStopVI.StopPosition.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentedTrainRouteStopVI.StopPosition.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentedTrainRouteStopVI.StopPosition.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedTrainRouteStopView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dpf4 = ResourceExtKt.toPxF(4, context);
        this.dpf6 = ResourceExtKt.toPxF(6, context);
        this.dpf8 = ResourceExtKt.toPxF(8, context);
        int px = ResourceExtKt.toPx(12, context);
        this.dp12 = px;
        this.dpf16 = ResourceExtKt.toPxF(16, context);
        this.dpf20 = ResourceExtKt.toPxF(20, context);
        this.pdf26 = ResourceExtKt.toPxF(26, context);
        this.dp40 = ResourceExtKt.toPx(40, context);
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View, R$id.segmentedTrainRouteArrivalTimeTAV, 0, -2);
        this.arrivalTimeTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View2, R$id.segmentedTrainRouteDepartureTimeTAV, 0, -2);
        this.departureTimeTAV = textAtomV2View2;
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View3, R$id.segmentedTrainRouteCityTAV, 0, -2);
        this.cityTAV = textAtomV2View3;
        TextAtomV2View textAtomV2View4 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View4, R$id.segmentedTrainRouteStationTAV, 0, -2);
        this.stationTAV = textAtomV2View4;
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = a.a(guideline, R$id.segmentedTrainRouteGuidelineG, -2, -2);
        a11.f41615V = 1;
        a11.f41624c = 0.4f;
        guideline.setLayoutParams(a11);
        this.guidelineG = guideline;
        Paint paint = new Paint();
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(ResourceExtKt.toPxF(2, context));
        this.linePaint = paint;
        Paint paint2 = new Paint(paint);
        paint2.setStyle(Paint.Style.FILL);
        this.circlePaintFill = paint2;
        Paint paint3 = new Paint(paint);
        paint3.setStyle(style);
        this.circlePaintStroke = paint3;
        this.roundedBackground = LazyUtilsKt.unsafeLazy(new SegmentedTrainRouteStopView$roundedBackground$2(context, this));
        ColorDrawable colorDrawable = new ColorDrawable(ThemeExtKt.themeColor(context, R$attr.bgPrimary));
        this.defaultBackground = colorDrawable;
        setWillNotDraw(false);
        setPadding(px, px, px, 0);
        addViews();
        setConstrains();
        setBackground(colorDrawable);
    }

    private final void addViews() {
        addView(this.arrivalTimeTAV);
        addView(this.departureTimeTAV);
        addView(this.cityTAV);
        addView(this.stationTAV);
        addView(this.guidelineG);
    }

    private final ShapeDrawable getRoundedBackground() {
        return (ShapeDrawable) this.roundedBackground.getValue();
    }

    private final void setConstrains() {
        ConstraintLayoutExtKt.updateConstraints(this, new SegmentedTrainRouteStopView$setConstrains$1(this));
    }

    public final void bind(@NotNull SegmentedTrainRouteStopVI stop) {
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextHolderKt.bindOrGone$default(this.arrivalTimeTAV, stop.getArrivalTime(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.departureTimeTAV, stop.getDepartureTime(), null, 2, null);
        TextHolderKt.bind$default(this.cityTAV, stop.getCity(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.stationTAV, stop.getStation(), null, 2, null);
        this.stopPosition = stop.getStopPosition();
        this.isBoardingStop = stop.getIsBoardingStop();
        setBackground(this.stopPosition == SegmentedTrainRouteStopVI.StopPosition.START ? getRoundedBackground() : this.defaultBackground);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Paint paint = this.isBoardingStop ? this.circlePaintFill : this.circlePaintStroke;
        SegmentedTrainRouteStopVI.StopPosition stopPosition = this.stopPosition;
        int i11 = stopPosition == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stopPosition.ordinal()];
        if (i11 == 1) {
            canvas.drawCircle(this.centerLineX, this.dpf20, this.dpf4, paint);
            float f7 = this.centerLineX;
            canvas.drawLine(f7, this.pdf26, f7, getHeight(), this.linePaint);
        } else if (i11 == 2) {
            canvas.drawCircle(this.centerLineX, this.circleY, this.dpf4, paint);
            float f11 = this.centerLineX;
            canvas.drawLine(f11, 0.0f, f11, this.circleY - this.dpf6, this.linePaint);
        } else {
            if (i11 != 3) {
                return;
            }
            float f12 = this.centerLineX;
            canvas.drawLine(f12, 0.0f, f12, this.circleY - this.dpf8, this.linePaint);
            canvas.drawCircle(this.centerLineX, this.circleY, this.dpf4, paint);
            float f13 = this.centerLineX;
            canvas.drawLine(f13, this.circleY + this.dpf8, f13, getHeight(), this.linePaint);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        float width = getWidth();
        ViewGroup.LayoutParams layoutParams = this.guidelineG.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        this.centerLineX = width * ((ConstraintLayout.b) layoutParams).f41624c;
        this.circleY = this.cityTAV.getY() + (this.cityTAV.getHeight() / 2);
    }
}
