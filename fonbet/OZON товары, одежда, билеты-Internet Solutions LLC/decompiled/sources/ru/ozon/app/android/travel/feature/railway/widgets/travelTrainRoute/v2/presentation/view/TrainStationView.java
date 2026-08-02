package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TrainStationItem;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/view/TrainStationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "arrivalTimeTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "departureTimeTav", "stopTimeTav", "dashView", "Landroid/view/View;", "stationNameTav", "flow", "Landroidx/constraintlayout/helper/widget/Flow;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainStationItem;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrainStationView extends ConstraintLayout {

    @NotNull
    private final TextAtomView arrivalTimeTav;

    @NotNull
    private final View dashView;

    @NotNull
    private final TextAtomView departureTimeTav;

    @NotNull
    private final Flow flow;

    @NotNull
    private final TextAtomView stationNameTav;

    @NotNull
    private final TextAtomView stopTimeTav;

    public /* synthetic */ TrainStationView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bind(@NotNull TrainStationItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomHolderKt.bindOrInvisible$default(this.departureTimeTav, item.getDepartureTime(), null, 2, null);
        TextAtomHolderKt.bindOrInvisible$default(this.stopTimeTav, item.getStopTime(), null, 2, null);
        TextAtomHolderKt.bindOrInvisible$default(this.arrivalTimeTav, item.getArrivalTime(), null, 2, null);
        this.dashView.setVisibility(item.getIsDashVisible() ? 0 : 8);
        TextAtomHolderKt.bind$default(this.stationNameTav, item.getStation(), null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainStationView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView.setId(R$id.travelTrainRouteTrainStationArrivalTimeTav);
        textAtomView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomView.setIncludeFontPadding(false);
        this.arrivalTimeTav = textAtomView;
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView2.setId(R$id.travelTrainRouteTrainStationDepartureTimeTav);
        textAtomView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomView2.setIncludeFontPadding(false);
        this.departureTimeTav = textAtomView2;
        TextAtomView textAtomView3 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView3.setId(R$id.travelTrainRouteTrainStationStopTimeTav);
        textAtomView3.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomView3.setIncludeFontPadding(false);
        int px = ResourceExtKt.toPx(2, context);
        textAtomView3.setPadding(px, textAtomView3.getPaddingTop(), px, textAtomView3.getPaddingBottom());
        textAtomView3.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        this.stopTimeTav = textAtomView3;
        View view = new View(context);
        view.setId(R$id.travelTrainRouteTrainStationDashView);
        view.setLayoutParams(new ConstraintLayout.b(0, ResourceExtKt.toPx(1, context)));
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicTertiary));
        this.dashView = view;
        TextAtomView textAtomView4 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        C2438a.e(textAtomView4, R$id.travelTrainRouteTrainStationStationNameTav, -2, -2);
        this.stationNameTav = textAtomView4;
        Flow flow = new Flow(context);
        flow.setId(R$id.travelTrainRouteTrainStationFlow);
        flow.setLayoutParams(new ConstraintLayout.b(ResourceExtKt.toSp(124), -2));
        flow.setWrapMode(1);
        flow.setOrientation(0);
        flow.setHorizontalStyle(1);
        flow.setVerticalAlign(2);
        this.flow = flow;
        addView(view);
        addView(flow);
        addView(textAtomView);
        addView(textAtomView3);
        addView(textAtomView2);
        addView(textAtomView4);
        flow.setReferencedIds(new int[]{textAtomView.getId(), textAtomView3.getId(), textAtomView2.getId()});
        d dVar = new d();
        dVar.p(this);
        int px2 = ResourceExtKt.toPx(4, context);
        ConstraintSetExtKt.topToTop$default(dVar, flow.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, flow.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToEnd(dVar, view.getId(), textAtomView.getId(), px2);
        ConstraintSetExtKt.endToStart(dVar, view.getId(), textAtomView2.getId(), px2);
        ConstraintSetExtKt.topToTop$default(dVar, view.getId(), textAtomView3.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, view.getId(), textAtomView3.getId(), 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, textAtomView4.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToEnd(dVar, textAtomView4.getId(), textAtomView2.getId(), ResourceExtKt.toPx(16, context));
        ConstraintSetExtKt.endToEnd$default(dVar, textAtomView4.getId(), 0, 0, 4, null);
        dVar.C(textAtomView4.getId(), true);
        dVar.c0(0.0f, textAtomView4.getId());
        dVar.f(this);
    }
}
