package ru.ozon.app.android.travel.molecules.view.tripLeg.v3;

import De.C2860c;
import F3.G;
import Sc.s;
import Wc.a;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.Y;
import androidx.lifecycle.C0;
import androidx.lifecycle.D;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v3.TripLegV3DTO;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J,\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\r*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\r*\u00020!H\u0002¢\u0006\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010/R\u0014\u00105\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010/R\u0014\u00106\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010/R\u0014\u00107\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102R\u0014\u00108\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00102R\u0014\u00109\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010/R\u0014\u0010:\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010/R\u0014\u0010;\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010/R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010<R\u0014\u0010\u0017\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0014\u0010\u0018\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/tripLeg/v3/TripLegV3View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "left", "top", "right", "bottom", "", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;", "data", "bind", "(Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;)V", "processAirportLayout", "columnWidth", "Lru/ozon/uni/atoms/data/text/TextDTO;", "airportName", "airportCode", "checkAirportWidth", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "isLongAirportRow", "updateAirportsConstraints", "(Z)V", "bindAirports", "setupConstraints", "()V", "Landroidx/constraintlayout/widget/d;", "airportInRow", "(Landroidx/constraintlayout/widget/d;)V", "airportInColumn", "dp1", "I", "dp4", "dp8", "Landroid/view/View;", "durationLeftSeparator", "Landroid/view/View;", "durationRightSeparator", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "duration", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "departureDate", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "departureTime", "departureCity", "departureAirportName", "departureAirportCode", "arrivalDate", "arrivalTime", "arrivalCity", "arrivalAirportName", "arrivalAirportCode", "Z", "Lxe/B0;", "job", "Lxe/B0;", "cachedData", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TripLegV3View extends ConstraintLayout {

    @NotNull
    private final TextAtomV2View airportCode;

    @NotNull
    private final TextAtomV2View airportName;

    @NotNull
    private final TextAtomV2View arrivalAirportCode;

    @NotNull
    private final TextAtomV2View arrivalAirportName;

    @NotNull
    private final TextAtomV2View arrivalCity;

    @NotNull
    private final PriceAtomView arrivalDate;

    @NotNull
    private final PriceAtomView arrivalTime;
    private TripLegV3DTO cachedData;

    @NotNull
    private final TextAtomV2View departureAirportCode;

    @NotNull
    private final TextAtomV2View departureAirportName;

    @NotNull
    private final TextAtomV2View departureCity;

    @NotNull
    private final PriceAtomView departureDate;

    @NotNull
    private final PriceAtomView departureTime;
    private final int dp1;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final TextAtomV2View duration;

    @NotNull
    private final View durationLeftSeparator;

    @NotNull
    private final View durationRightSeparator;
    private boolean isLongAirportRow;
    private B0 job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripLegV3View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp4 = UiExtKt.toPx(4, context);
        this.dp8 = UiExtKt.toPx(8, context);
        View view = new View(context);
        view.setId(R$id.tripLegV3DurationLeftSeparator);
        view.setLayoutParams(new ConstraintLayout.b(0, px));
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        addView(view);
        this.durationLeftSeparator = view;
        View view2 = new View(context);
        view2.setId(R$id.tripLegV3DurationRightSeparator);
        view2.setLayoutParams(new ConstraintLayout.b(0, px));
        view2.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        addView(view2);
        this.durationRightSeparator = view2;
        q qVar = q.f64554a;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        G.g(textAtomV2View, R$id.tripLegV3Duration, -2, -2);
        addView(g10);
        this.duration = textAtomV2View;
        PriceAtomView priceAtomView = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        priceAtomView = priceAtomView == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView;
        priceAtomView.setId(R$id.tripLegV3DepartureDate);
        priceAtomView.setLayoutParams(new ConstraintLayout.b(0, -2));
        addView(priceAtomView);
        this.departureDate = priceAtomView;
        PriceAtomView priceAtomView2 = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        priceAtomView2 = priceAtomView2 == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView2;
        priceAtomView2.setId(R$id.tripLegV3DepartureTime);
        priceAtomView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        addView(priceAtomView2);
        this.departureTime = priceAtomView2;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g11;
        G.g(textAtomV2View2, R$id.tripLegV3DepartureCity, 0, -2);
        addView(g11);
        this.departureCity = textAtomV2View2;
        View g12 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) g12;
        G.g(textAtomV2View3, R$id.tripLegV3DepartureAirportName, 0, -2);
        addView(g12);
        this.departureAirportName = textAtomV2View3;
        View g13 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View4 = (TextAtomV2View) g13;
        G.g(textAtomV2View4, R$id.tripLegV3DepartureAirportCode, 0, -2);
        addView(g13);
        this.departureAirportCode = textAtomV2View4;
        PriceAtomView priceAtomView3 = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        priceAtomView3 = priceAtomView3 == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView3;
        ConstraintLayout.b b11 = C2860c.b(priceAtomView3, R$id.tripLegV3ArrivalDate, -2, -2);
        b11.f41598E = 1.0f;
        priceAtomView3.setLayoutParams(b11);
        addView(priceAtomView3);
        this.arrivalDate = priceAtomView3;
        PriceAtomView priceAtomView4 = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        priceAtomView4 = priceAtomView4 == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView4;
        priceAtomView4.setId(R$id.tripLegV6ArrivalTime);
        priceAtomView4.setLayoutParams(new ConstraintLayout.b(0, -2));
        addView(priceAtomView4);
        this.arrivalTime = priceAtomView4;
        View g14 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View5 = (TextAtomV2View) g14;
        G.g(textAtomV2View5, R$id.tripLegV3ArrivalCity, 0, -2);
        addView(g14);
        this.arrivalCity = textAtomV2View5;
        View g15 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View6 = (TextAtomV2View) g15;
        G.g(textAtomV2View6, R$id.tripLegV3ArrivalAirportName, 0, -2);
        addView(g15);
        this.arrivalAirportName = textAtomV2View6;
        View g16 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View7 = (TextAtomV2View) g16;
        G.g(textAtomV2View7, R$id.tripLegV3ArrivalAirportCode, 0, -2);
        addView(g16);
        this.arrivalAirportCode = textAtomV2View7;
        TextAtomV2View textAtomV2View8 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        textAtomV2View8.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View8.setVisibility(4);
        this.airportName = textAtomV2View8;
        TextAtomV2View textAtomV2View9 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        textAtomV2View9.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View9.setVisibility(4);
        this.airportCode = textAtomV2View9;
        setupConstraints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void airportInColumn(d dVar) {
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.departureAirportName, this.departureCity);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.departureAirportName);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.departureAirportName, this.arrivalAirportName, this.dp4);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.departureAirportCode, this.departureAirportName);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.departureAirportCode);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.departureAirportCode, this.arrivalAirportCode, this.dp4);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.arrivalAirportName, this.arrivalCity);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.arrivalAirportName);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, this.arrivalAirportName, this.departureAirportName, this.dp4);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.arrivalAirportCode, this.arrivalAirportName);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.arrivalAirportCode);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, this.arrivalAirportCode, this.departureAirportCode, this.dp4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void airportInRow(d dVar) {
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.departureAirportName, this.departureCity);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.departureAirportName);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.departureAirportCode, this.departureCity);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, this.departureAirportCode, this.departureAirportName, this.dp4);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.arrivalAirportName, this.arrivalCity);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.arrivalAirportName, this.arrivalAirportCode, this.dp4);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.arrivalAirportCode, this.arrivalCity);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.arrivalAirportCode);
    }

    private final void bindAirports(TripLegV3DTO data) {
        TextHolderKt.bindOrGone$default(this.arrivalAirportName, data.getArrival().getAirportName(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.arrivalAirportCode, data.getArrival().getAirportCode(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.departureAirportName, data.getDeparture().getAirportName(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.departureAirportCode, data.getDeparture().getAirportCode(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkAirportWidth(int i11, TextDTO textDTO, TextDTO textDTO2, kotlin.coroutines.d<? super Boolean> dVar) {
        TripLegV3View$checkAirportWidth$1 tripLegV3View$checkAirportWidth$1;
        Object obj;
        a aVar;
        int i12;
        TripLegV3View tripLegV3View;
        int i13;
        int i14;
        if (dVar instanceof TripLegV3View$checkAirportWidth$1) {
            tripLegV3View$checkAirportWidth$1 = (TripLegV3View$checkAirportWidth$1) dVar;
            int i15 = tripLegV3View$checkAirportWidth$1.label;
            if ((i15 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                tripLegV3View$checkAirportWidth$1.label = i15 - LinearLayoutManager.INVALID_OFFSET;
                obj = tripLegV3View$checkAirportWidth$1.result;
                aVar = a.COROUTINE_SUSPENDED;
                i12 = tripLegV3View$checkAirportWidth$1.label;
                if (i12 != 0) {
                    s.b(obj);
                    TextHolderKt.bindOrGone$default(this.airportName, textDTO, null, 2, null);
                    TextHolderKt.bindOrGone$default(this.airportCode, textDTO2, null, 2, null);
                    TextAtomV2View textAtomV2View = this.airportName;
                    tripLegV3View$checkAirportWidth$1.L$0 = this;
                    tripLegV3View$checkAirportWidth$1.I$0 = i11;
                    tripLegV3View$checkAirportWidth$1.label = 1;
                    obj = ViewExtensionsKt.getWidthAfterLayout(textAtomV2View, tripLegV3View$checkAirportWidth$1);
                    if (obj != aVar) {
                        tripLegV3View = this;
                    }
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i14 = tripLegV3View$checkAirportWidth$1.I$1;
                    i13 = tripLegV3View$checkAirportWidth$1.I$0;
                    tripLegV3View = (TripLegV3View) tripLegV3View$checkAirportWidth$1.L$0;
                    s.b(obj);
                    return Boolean.valueOf((((Number) obj).intValue() + i14) + tripLegV3View.dp8 > i13);
                }
                i11 = tripLegV3View$checkAirportWidth$1.I$0;
                TripLegV3View tripLegV3View2 = (TripLegV3View) tripLegV3View$checkAirportWidth$1.L$0;
                s.b(obj);
                tripLegV3View = tripLegV3View2;
                int intValue = ((Number) obj).intValue();
                TextAtomV2View textAtomV2View2 = tripLegV3View.airportCode;
                tripLegV3View$checkAirportWidth$1.L$0 = tripLegV3View;
                tripLegV3View$checkAirportWidth$1.I$0 = i11;
                tripLegV3View$checkAirportWidth$1.I$1 = intValue;
                tripLegV3View$checkAirportWidth$1.label = 2;
                obj = ViewExtensionsKt.getWidthAfterLayout(textAtomV2View2, tripLegV3View$checkAirportWidth$1);
                if (obj != aVar) {
                    i13 = i11;
                    i14 = intValue;
                    return Boolean.valueOf((((Number) obj).intValue() + i14) + tripLegV3View.dp8 > i13);
                }
                return aVar;
            }
        }
        tripLegV3View$checkAirportWidth$1 = new TripLegV3View$checkAirportWidth$1(this, dVar);
        obj = tripLegV3View$checkAirportWidth$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i12 = tripLegV3View$checkAirportWidth$1.label;
        if (i12 != 0) {
        }
        int intValue2 = ((Number) obj).intValue();
        TextAtomV2View textAtomV2View22 = tripLegV3View.airportCode;
        tripLegV3View$checkAirportWidth$1.L$0 = tripLegV3View;
        tripLegV3View$checkAirportWidth$1.I$0 = i11;
        tripLegV3View$checkAirportWidth$1.I$1 = intValue2;
        tripLegV3View$checkAirportWidth$1.label = 2;
        obj = ViewExtensionsKt.getWidthAfterLayout(textAtomV2View22, tripLegV3View$checkAirportWidth$1);
        if (obj != aVar) {
        }
        return aVar;
    }

    private final void processAirportLayout(final TripLegV3DTO data) {
        int i11 = Y.f42258g;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.molecules.view.tripLeg.v3.TripLegV3View$processAirportLayout$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    int width = TripLegV3View.this.getWidth() / 2;
                    B0 b02 = TripLegV3View.this.job;
                    B0 b03 = null;
                    if (b02 != null) {
                        b02.j(null);
                    }
                    TripLegV3View tripLegV3View = TripLegV3View.this;
                    J a11 = C0.a(tripLegV3View);
                    if (a11 != null) {
                        D a12 = K.a(a11);
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        b03 = C10727i.c(a12, De.s.f6650a, null, new TripLegV3View$processAirportLayout$1$1(TripLegV3View.this, width, data, null), 2);
                    }
                    tripLegV3View.job = b03;
                }
            });
            return;
        }
        int width = getWidth() / 2;
        B0 b02 = this.job;
        B0 b03 = null;
        if (b02 != null) {
            b02.j(null);
        }
        J a11 = C0.a(this);
        if (a11 != null) {
            D a12 = K.a(a11);
            C10720e0 c10720e0 = C10720e0.f105451a;
            b03 = C10727i.c(a12, De.s.f6650a, null, new TripLegV3View$processAirportLayout$1$1(this, width, data, null), 2);
        }
        this.job = b03;
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new TripLegV3View$setupConstraints$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAirportsConstraints(boolean isLongAirportRow) {
        if (isLongAirportRow == this.isLongAirportRow) {
            return;
        }
        this.isLongAirportRow = isLongAirportRow;
        if (isLongAirportRow) {
            ConstraintLayoutExtKt.updateConstraints(this, new TripLegV3View$updateAirportsConstraints$1(this));
        } else {
            ConstraintLayoutExtKt.updateConstraints(this, new TripLegV3View$updateAirportsConstraints$2(this));
        }
    }

    public final void bind(@NotNull TripLegV3DTO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.cachedData = data;
        TextHolderKt.bind$default(this.duration, data.getDuration(), null, 2, null);
        PriceAtomHolderKt.bind$default(this.departureDate, data.getDeparture().getDate(), null, 2, null);
        PriceAtomHolderKt.bind$default(this.departureTime, data.getDeparture().getTime(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.departureCity, data.getDeparture().getCity(), null, 2, null);
        PriceAtomHolderKt.bind$default(this.arrivalDate, data.getArrival().getDate(), null, 2, null);
        PriceAtomHolderKt.bind$default(this.arrivalTime, data.getArrival().getTime(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.arrivalCity, data.getArrival().getCity(), null, 2, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        TripLegV3DTO tripLegV3DTO = this.cachedData;
        if (tripLegV3DTO != null) {
            processAirportLayout(tripLegV3DTO);
            bindAirports(tripLegV3DTO);
            this.cachedData = null;
        }
    }
}
