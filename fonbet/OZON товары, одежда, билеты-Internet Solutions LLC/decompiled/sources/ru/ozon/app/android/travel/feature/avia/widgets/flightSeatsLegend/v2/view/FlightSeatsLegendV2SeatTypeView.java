package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.view;

import Am.C2438a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.presentation.FlightSeatsLegendV2VI;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/view/FlightSeatsLegendV2SeatTypeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp8", "dp16", "dp24", "dpf2", "", "dpf6", "defaultColor", "seatBackground", "Landroid/graphics/drawable/ShapeDrawable;", "backrestBackground", "seatBgView", "Landroid/view/View;", "seatBackrestView", "seatTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getSeatTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "seatTextView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "getCellView", "()Lru/ozon/uni/android/cell/CellView;", "cellView$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v2/presentation/FlightSeatsLegendV2VI$SeatTypeV2VI;", "addViews", "setupConstraints", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsLegendV2SeatTypeView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightSeatsLegendV2SeatTypeView.class, "seatTextView", "getSeatTextView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(FlightSeatsLegendV2SeatTypeView.class, "cellView", "getCellView()Lru/ozon/uni/android/cell/CellView;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final ShapeDrawable backrestBackground;

    /* renamed from: cellView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate cellView;
    private final int defaultColor;
    private final int dp16;
    private final int dp2;
    private final int dp24;
    private final int dp8;
    private final float dpf2;
    private final float dpf6;

    @NotNull
    private final ShapeDrawable seatBackground;

    @NotNull
    private final View seatBackrestView;

    @NotNull
    private final View seatBgView;

    /* renamed from: seatTextView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate seatTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsLegendV2SeatTypeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.dp2 = px;
        this.dp8 = ResourceExtKt.toPx(8, context);
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        int px3 = ResourceExtKt.toPx(24, context);
        this.dp24 = px3;
        float pxF = ResourceExtKt.toPxF(2, context);
        this.dpf2 = pxF;
        float pxF2 = ResourceExtKt.toPxF(6, context);
        this.dpf6 = pxF2;
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(this.defaultColor, pxF2, pxF2, pxF, pxF);
        this.seatBackground = produce;
        ShapeDrawable produce$default = RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), this.defaultColor, pxF, pxF, 0.0f, 0.0f, 24, null);
        this.backrestBackground = produce$default;
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(px3, px3));
        this.seatBgView = view;
        View view2 = new View(context);
        view2.setId(View.generateViewId());
        view2.setLayoutParams(new ConstraintLayout.b(px2, px));
        this.seatBackrestView = view2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.seatTextView = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new FlightSeatsLegendV2SeatTypeView$special$$inlined$preCreationViewPool$default$1(this), new FlightSeatsLegendV2SeatTypeView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.cellView = new PreCreationViewPoolDelegate(context3, N.b(CellView.class), new FlightSeatsLegendV2SeatTypeView$special$$inlined$preCreationViewPool$default$3(this), new FlightSeatsLegendV2SeatTypeView$special$$inlined$preCreationViewPool$default$4());
        view.setBackground(produce);
        view2.setBackground(produce$default);
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(this.seatBgView);
        addView(this.seatBackrestView);
        addView(getSeatTextView());
        addView(getCellView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CellView getCellView() {
        return (CellView) this.cellView.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getSeatTextView() {
        return (TextAtomV2View) this.seatTextView.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new FlightSeatsLegendV2SeatTypeView$setupConstraints$1(this));
    }

    public final void bind(@NotNull FlightSeatsLegendV2VI.SeatTypeV2VI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Paint paint = this.seatBackground.getPaint();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getSeatBackgroundColor());
        paint.setColor(parseColor != null ? parseColor.intValue() : this.defaultColor);
        Paint paint2 = this.backrestBackground.getPaint();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context2, item.getSeatBackrestColor());
        paint2.setColor(parseColor2 != null ? parseColor2.intValue() : this.defaultColor);
        TextHolderKt.bindOrGone$default(getSeatTextView(), item.getSeatText(), null, 2, null);
        CellHolderKt.bind$default(getCellView(), item.getCell(), null, 2, null);
    }
}
