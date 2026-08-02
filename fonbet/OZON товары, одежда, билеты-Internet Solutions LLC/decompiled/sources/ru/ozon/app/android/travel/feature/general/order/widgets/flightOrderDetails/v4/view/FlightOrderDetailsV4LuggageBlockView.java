package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view;

import Am.C2438a;
import De.s;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.lifecycle.C0;
import androidx.lifecycle.D;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.presentation.FlightOrderDetailsV4VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u0015J\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u0015J\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u0015J\u0013\u0010#\u001a\u00020\r*\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\r*\u00020\"H\u0002¢\u0006\u0004\b%\u0010$J\u0013\u0010&\u001a\u00020\r*\u00020\"H\u0002¢\u0006\u0004\b&\u0010$R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u0014\u0010/\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010H\u001a\u0012\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\r0Ej\u0002`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00105R\u0014\u0010K\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00105R\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010D¨\u0006R"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/FlightOrderDetailsV4LuggageBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "left", "top", "right", "bottom", "", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "()V", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO;", "data", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO;)V", "processBasicLuggageLayout", "isSingleRow", "updateConstraints", "(Z)V", "bindBasicLuggage", "addTemporaryViews", "removeTemporaryViews", "setupConstraints", "Landroidx/constraintlayout/widget/d;", "basicLuggageInRow", "(Landroidx/constraintlayout/widget/d;)V", "basicLuggageInColumn", "basicLuggageClearConstraints", "", "lineWidth", "F", "dp4", "I", "dp8", "dp10", "dp16", "yPosition", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/FlightOrderDetailsV4LuggageView;", "handCarryLV", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/FlightOrderDetailsV4LuggageView;", "luggageLV", "extraLuggageLV", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "buttonIBV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getButtonIBV", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "buttonIBV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV$delegate", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV", "isTextVisible", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "Lkotlin/jvm/functions/Function1;", "measureHandCarryLV", "measureLuggageLV", "Lxe/B0;", "job", "Lxe/B0;", "cachedData", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO;", "isSingleRowLayout", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV4LuggageBlockView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightOrderDetailsV4LuggageBlockView.class, "buttonIBV", "getButtonIBV()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0), C2438a.c(FlightOrderDetailsV4LuggageBlockView.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;

    /* renamed from: buttonIBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate buttonIBV;
    private FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO cachedData;
    private final int dp10;
    private final int dp16;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final FlightOrderDetailsV4LuggageView extraLuggageLV;

    @NotNull
    private final FlightOrderDetailsV4LuggageView handCarryLV;
    private boolean isSingleRowLayout;
    private boolean isTextVisible;
    private B0 job;
    private final float lineWidth;

    @NotNull
    private final FlightOrderDetailsV4LuggageView luggageLV;

    @NotNull
    private final FlightOrderDetailsV4LuggageView measureHandCarryLV;

    @NotNull
    private final FlightOrderDetailsV4LuggageView measureLuggageLV;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;
    private final float yPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightOrderDetailsV4LuggageBlockView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(1, context);
        this.lineWidth = pxF;
        this.dp4 = UiExtKt.toPx(4, context);
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp10 = UiExtKt.toPx(10, context);
        this.dp16 = UiExtKt.toPx(16, context);
        this.yPosition = pxF / 2.0f;
        Paint paint = new Paint();
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicTertiary));
        paint.setStrokeWidth(pxF);
        paint.setPathEffect(new DashPathEffect(new float[]{ResourceExtKt.toPxF(2, context), ResourceExtKt.toPxF(3, context)}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        this.paint = paint;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView = new FlightOrderDetailsV4LuggageView(context);
        flightOrderDetailsV4LuggageView.setId(R$id.flightOrderDetailsV4HandCarryLV);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41598E = 0.0f;
        bVar.f41603J = 2;
        bVar.f41616W = true;
        flightOrderDetailsV4LuggageView.setLayoutParams(bVar);
        this.handCarryLV = flightOrderDetailsV4LuggageView;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView2 = new FlightOrderDetailsV4LuggageView(context);
        flightOrderDetailsV4LuggageView2.setId(R$id.flightOrderDetailsV4LuggageLV);
        flightOrderDetailsV4LuggageView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.luggageLV = flightOrderDetailsV4LuggageView2;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView3 = new FlightOrderDetailsV4LuggageView(context);
        flightOrderDetailsV4LuggageView3.setId(R$id.flightOrderDetailsV4ExtraLuggageLV);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41598E = 0.0f;
        flightOrderDetailsV4LuggageView3.setLayoutParams(bVar2);
        this.extraLuggageLV = flightOrderDetailsV4LuggageView3;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.buttonIBV = new PreCreationViewPoolDelegate(context2, N.b(IconButtonV3View.class), new FlightOrderDetailsV4LuggageBlockView$special$$inlined$preCreationViewPool$default$1(this), new FlightOrderDetailsV4LuggageBlockView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new FlightOrderDetailsV4LuggageBlockView$special$$inlined$preCreationViewPool$default$3(this), new FlightOrderDetailsV4LuggageBlockView$special$$inlined$preCreationViewPool$default$4());
        this.processedActionHandler = new FlightOrderDetailsV4LuggageBlockView$processedActionHandler$1(this);
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView4 = new FlightOrderDetailsV4LuggageView(context);
        flightOrderDetailsV4LuggageView4.setLayoutParams(new ConstraintLayout.b(-2, -2));
        flightOrderDetailsV4LuggageView4.setVisibility(4);
        this.measureHandCarryLV = flightOrderDetailsV4LuggageView4;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView5 = new FlightOrderDetailsV4LuggageView(context);
        flightOrderDetailsV4LuggageView5.setLayoutParams(new ConstraintLayout.b(-2, -2));
        flightOrderDetailsV4LuggageView5.setVisibility(4);
        this.measureLuggageLV = flightOrderDetailsV4LuggageView5;
        this.isSingleRowLayout = true;
        addView(flightOrderDetailsV4LuggageView);
        addView(flightOrderDetailsV4LuggageView2);
        addView(flightOrderDetailsV4LuggageView3);
        addView(getButtonIBV());
        addView(getTitleTAV());
        setupConstraints();
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addTemporaryViews() {
        if (this.measureHandCarryLV.getParent() == null) {
            addView(this.measureHandCarryLV);
        }
        if (this.measureLuggageLV.getParent() == null) {
            addView(this.measureLuggageLV);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void basicLuggageClearConstraints(d dVar) {
        ConstraintLayoutExtensionsKt.clear(dVar, this.handCarryLV);
        ConstraintLayoutExtensionsKt.clear(dVar, this.luggageLV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void basicLuggageInColumn(d dVar) {
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.handCarryLV, this.dp16);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.handCarryLV);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.handCarryLV, getButtonIBV(), this.dp10);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.luggageLV, this.handCarryLV, this.dp4);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.luggageLV);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.luggageLV, getButtonIBV(), this.dp10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void basicLuggageInRow(d dVar) {
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.handCarryLV, this.dp16);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.handCarryLV);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.handCarryLV, this.luggageLV);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.luggageLV, this.dp16);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, this.luggageLV, this.handCarryLV, this.dp8);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.luggageLV, getButtonIBV(), this.dp10);
    }

    private final void bindBasicLuggage(FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO data) {
        this.handCarryLV.bind(data.getHandCarry());
        this.luggageLV.bind(data.getLuggage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconButtonV3View getButtonIBV() {
        return (IconButtonV3View) this.buttonIBV.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTitleTAV() {
        return (TextAtomV2View) this.titleTAV.getValue(this, $$delegatedProperties[1]);
    }

    private final void processBasicLuggageLayout(final FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO data) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view.FlightOrderDetailsV4LuggageBlockView$processBasicLuggageLayout$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int width = (FlightOrderDetailsV4LuggageBlockView.this.getWidth() - FlightOrderDetailsV4LuggageBlockView.this.getButtonIBV().getWidth()) - FlightOrderDetailsV4LuggageBlockView.this.dp10;
                    B0 b02 = FlightOrderDetailsV4LuggageBlockView.this.job;
                    B0 b03 = null;
                    if (b02 != null) {
                        b02.j(null);
                    }
                    FlightOrderDetailsV4LuggageBlockView flightOrderDetailsV4LuggageBlockView = FlightOrderDetailsV4LuggageBlockView.this;
                    J a11 = C0.a(flightOrderDetailsV4LuggageBlockView);
                    if (a11 != null) {
                        D a12 = K.a(a11);
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        b03 = C10727i.c(a12, s.f6650a, null, new FlightOrderDetailsV4LuggageBlockView$processBasicLuggageLayout$1$1(FlightOrderDetailsV4LuggageBlockView.this, data, width, null), 2);
                    }
                    flightOrderDetailsV4LuggageBlockView.job = b03;
                }
            });
            return;
        }
        int width = (getWidth() - getButtonIBV().getWidth()) - this.dp10;
        B0 b02 = this.job;
        B0 b03 = null;
        if (b02 != null) {
            b02.j(null);
        }
        J a11 = C0.a(this);
        if (a11 != null) {
            D a12 = K.a(a11);
            C10720e0 c10720e0 = C10720e0.f105451a;
            b03 = C10727i.c(a12, s.f6650a, null, new FlightOrderDetailsV4LuggageBlockView$processBasicLuggageLayout$1$1(this, data, width, null), 2);
        }
        this.job = b03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeTemporaryViews() {
        if (this.measureHandCarryLV.getParent() != null) {
            removeView(this.measureHandCarryLV);
        }
        if (this.measureLuggageLV.getParent() != null) {
            removeView(this.measureLuggageLV);
        }
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new FlightOrderDetailsV4LuggageBlockView$setupConstraints$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConstraints(boolean isSingleRow) {
        if (isSingleRow == this.isSingleRowLayout) {
            return;
        }
        this.isSingleRowLayout = isSingleRow;
        if (isSingleRow) {
            ConstraintLayoutExtKt.updateConstraints(this, new FlightOrderDetailsV4LuggageBlockView$updateConstraints$1(this));
        } else {
            ConstraintLayoutExtKt.updateConstraints(this, new FlightOrderDetailsV4LuggageBlockView$updateConstraints$2(this));
        }
    }

    public final void bind(@NotNull FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.cachedData = data;
        this.isTextVisible = data.getIsExpanded();
        IconButtonV3HolderKt.bind(getButtonIBV(), data.getButton(), this.processedActionHandler);
        this.extraLuggageLV.bindOrGone(data.getExtraLuggage());
        TextAtomV2View titleTAV = getTitleTAV();
        TextHolderKt.bindOrGone$default(getTitleTAV(), data.getTitle(), null, 2, null);
        titleTAV.setVisibility(data.getIsExpanded() ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
        removeTemporaryViews();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawLine(0.0f, this.yPosition, getWidth(), this.yPosition, this.paint);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO luggageBlockVO = this.cachedData;
        if (luggageBlockVO != null) {
            processBasicLuggageLayout(luggageBlockVO);
            bindBasicLuggage(luggageBlockVO);
            this.cachedData = null;
        }
    }
}
