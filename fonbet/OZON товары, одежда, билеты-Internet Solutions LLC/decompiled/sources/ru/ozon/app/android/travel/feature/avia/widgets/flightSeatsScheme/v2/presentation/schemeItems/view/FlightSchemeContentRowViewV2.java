package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view;

import Sc.o;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import hd.C6915b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeViewV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentRowV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeEmptyContentV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeSeatContentV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeTextContentV2;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\r2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e¢\u0006\u0004\b!\u0010 J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\b%\u0010&R0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R6\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010)\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0013018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\n018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContentRowViewV2;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeTextContentV2;", "item", "", "isSticky", "Landroidx/appcompat/widget/AppCompatTextView;", "getTextContent", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeTextContentV2;Z)Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeSeatContentV2;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "emergencySeatsActionHandler", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeViewV2;", "getSeatContent", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeSeatContentV2;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeViewV2;", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;)V", "updateSingleSeat", "", "seatNumber", "shouldDelay", "highlightSeat", "(Ljava/lang/String;Z)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "onSeatClickListener", "Lkotlin/jvm/functions/Function1;", "getOnSeatClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnSeatClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getEmergencySeatsActionHandler", "setEmergencySeatsActionHandler", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "", "seatViewPool", "Ljava/util/List;", "textViewPool", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeContentRowViewV2 extends FrameLayout {
    private Function1<? super AtomAction, Unit> emergencySeatsActionHandler;
    private FlightSchemeContentRowV2 item;
    private Function1<? super AirplaneSeatTypeV2VI, Unit> onSeatClickListener;

    @NotNull
    private final List<AirplaneSeatTypeViewV2> seatViewPool;

    @NotNull
    private final List<AppCompatTextView> textViewPool;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeContentRowViewV2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.seatViewPool = new ArrayList();
        this.textViewPool = new ArrayList();
    }

    private final AirplaneSeatTypeViewV2 getSeatContent(FlightSchemeSeatContentV2 item, Function1<? super AtomAction, Unit> emergencySeatsActionHandler) {
        AirplaneSeatTypeViewV2 airplaneSeatTypeViewV2 = (AirplaneSeatTypeViewV2) C7714v.x0(this.seatViewPool);
        if (airplaneSeatTypeViewV2 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            airplaneSeatTypeViewV2 = new AirplaneSeatTypeViewV2(context);
        }
        airplaneSeatTypeViewV2.setLayoutParams(new FrameLayout.LayoutParams(item.getWidth(), item.getHeight()));
        AirplaneSeatTypeViewV2.bind$default(airplaneSeatTypeViewV2, item.getSeat(), false, 2, null);
        if (item.getAction() != null) {
            airplaneSeatTypeViewV2.setOnSeatClickListener(new FlightSchemeContentRowViewV2$getSeatContent$1$1(item, emergencySeatsActionHandler));
            return airplaneSeatTypeViewV2;
        }
        airplaneSeatTypeViewV2.setOnSeatClickListener(this.onSeatClickListener);
        return airplaneSeatTypeViewV2;
    }

    private final AppCompatTextView getTextContent(FlightSchemeTextContentV2 item, boolean isSticky) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) C7714v.x0(this.textViewPool);
        if (appCompatTextView == null) {
            appCompatTextView = new AppCompatTextView(getContext());
        }
        float f7 = isSticky ? 20.0f : item.getFuselageType() == AirplaneSeatTypeV2VI.FuselageType.WIDE ? 12.0f : 14.0f;
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(item.getWidth(), item.getHeight()));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(item.getText().getText());
        appCompatTextView.setTextAppearance(UniTextStyles.BODY_500_MEDIUM.getResId());
        appCompatTextView.setTextSize(1, f7);
        return appCompatTextView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bind(@NotNull FlightSchemeContentRowV2 item) {
        View seatContent;
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        setPadding(getPaddingLeft(), item.getTopOffset(), getPaddingRight(), getPaddingBottom());
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                break;
            }
            View view = (View) c5314e0.next();
            if (view instanceof AirplaneSeatTypeViewV2) {
                this.seatViewPool.add(view);
            } else if (view instanceof AppCompatTextView) {
                this.textViewPool.add(view);
            }
        }
        removeAllViews();
        for (FlightSchemeContentV2 flightSchemeContentV2 : item.getContentList()) {
            if (!(flightSchemeContentV2 instanceof FlightSchemeEmptyContentV2)) {
                if (flightSchemeContentV2 instanceof FlightSchemeTextContentV2) {
                    seatContent = getTextContent((FlightSchemeTextContentV2) flightSchemeContentV2, item.getIsSticky());
                } else {
                    if (!(flightSchemeContentV2 instanceof FlightSchemeSeatContentV2)) {
                        throw new o();
                    }
                    seatContent = getSeatContent((FlightSchemeSeatContentV2) flightSchemeContentV2, this.emergencySeatsActionHandler);
                }
                addView(seatContent);
            }
        }
        requestLayout();
        invalidate();
    }

    public final void highlightSeat(@NotNull String seatNumber, boolean shouldDelay) {
        Intrinsics.checkNotNullParameter(seatNumber, "seatNumber");
        FlightSchemeContentRowV2 flightSchemeContentRowV2 = this.item;
        if (flightSchemeContentRowV2 == null) {
            return;
        }
        int i11 = 0;
        for (FlightSchemeContentV2 flightSchemeContentV2 : flightSchemeContentRowV2.getContentList()) {
            if ((flightSchemeContentV2 instanceof FlightSchemeSeatContentV2) && Intrinsics.d(((FlightSchemeSeatContentV2) flightSchemeContentV2).getSeat().getNumber(), seatNumber)) {
                View childAt = getChildAt(i11);
                AirplaneSeatTypeViewV2 airplaneSeatTypeViewV2 = childAt instanceof AirplaneSeatTypeViewV2 ? (AirplaneSeatTypeViewV2) childAt : null;
                if (airplaneSeatTypeViewV2 == null) {
                    return;
                }
                airplaneSeatTypeViewV2.highlight(shouldDelay ? 100L : 0L);
                return;
            }
            if (!(flightSchemeContentV2 instanceof FlightSchemeEmptyContentV2)) {
                i11++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        FlightSchemeContentRowV2 flightSchemeContentRowV2 = this.item;
        if (flightSchemeContentRowV2 == null) {
            super.onLayout(changed, left, top, right, bottom);
            return;
        }
        int paddingTop = getPaddingTop();
        int c11 = C6915b.c(((right - left) / 2.0f) - (flightSchemeContentRowV2.getSchemeWidth() / 2.0f));
        List<FlightSchemeContentV2> contentList = flightSchemeContentRowV2.getContentList();
        int P11 = C7714v.P(contentList);
        int i11 = 0;
        int i12 = 0;
        for (Object obj : contentList) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FlightSchemeContentV2 flightSchemeContentV2 = (FlightSchemeContentV2) obj;
            if (!(flightSchemeContentV2 instanceof FlightSchemeEmptyContentV2)) {
                getChildAt(i12).layout(c11, paddingTop, flightSchemeContentV2.getWidth() + c11, flightSchemeContentV2.getHeight() + paddingTop);
                i12++;
            }
            int width = flightSchemeContentV2.getWidth() + c11;
            c11 = i11 < P11 ? flightSchemeContentRowV2.getItemsOffset() + width : width;
            i11 = i13;
        }
    }

    public final void setEmergencySeatsActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.emergencySeatsActionHandler = function1;
    }

    public final void setOnSeatClickListener(Function1<? super AirplaneSeatTypeV2VI, Unit> function1) {
        this.onSeatClickListener = function1;
    }

    public final void updateSingleSeat(@NotNull FlightSchemeContentRowV2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FlightSchemeContentRowV2 flightSchemeContentRowV2 = this.item;
        if (flightSchemeContentRowV2 == null) {
            bind(item);
            return;
        }
        Iterator<FlightSchemeContentV2> it = flightSchemeContentRowV2.getContentList().iterator();
        Iterator<FlightSchemeContentV2> it2 = item.getContentList().iterator();
        int i11 = 0;
        while (it.hasNext() && it2.hasNext()) {
            FlightSchemeContentV2 next = it.next();
            FlightSchemeContentV2 next2 = it2.next();
            boolean d11 = Intrinsics.d(next, next2);
            if (!d11 || !(next instanceof FlightSchemeEmptyContentV2)) {
                if (!d11 && (next2 instanceof FlightSchemeSeatContentV2)) {
                    View childAt = getChildAt(i11);
                    AirplaneSeatTypeViewV2 airplaneSeatTypeViewV2 = childAt instanceof AirplaneSeatTypeViewV2 ? (AirplaneSeatTypeViewV2) childAt : null;
                    if (airplaneSeatTypeViewV2 != null) {
                        airplaneSeatTypeViewV2.bind(((FlightSchemeSeatContentV2) next2).getSeat(), true);
                    }
                }
                i11++;
            }
        }
        this.item = item;
    }
}
