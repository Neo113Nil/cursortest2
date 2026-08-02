package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view;

import Sc.o;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import gk0.q;
import hd.C6915b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatView;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeContent;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeContentRow;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeEmptyContent;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeSeatContent;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeTextContent;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010!R0\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeContentRowView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeTextContent;", "item", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "addTextContent", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeTextContent;)Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeSeatContent;", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatView;", "addSeatContent", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeSeatContent;)Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatView;", "", "changed", "", "left", "top", "right", "bottom", "", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContentRow;", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContentRow;)V", "updateSingleSeat", "", "seatNumber", "shouldDelay", "highlightSeat", "(Ljava/lang/String;Z)V", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "onSeatClickListener", "Lkotlin/jvm/functions/Function1;", "getOnSeatClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnSeatClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContentRow;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeContentRowView extends FrameLayout {
    private FlightSchemeContentRow item;
    private Function1<? super AirplaneSeatVO, Unit> onSeatClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeContentRowView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AirplaneSeatView addSeatContent(FlightSchemeSeatContent item) {
        Function1<? super AirplaneSeatVO, Unit> function1 = this.onSeatClickListener;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AirplaneSeatView airplaneSeatView = new AirplaneSeatView(context, null, 2, 0 == true ? 1 : 0);
        airplaneSeatView.setLayoutParams(new FrameLayout.LayoutParams(item.getWidth(), item.getHeight()));
        AirplaneSeatView.bind$default(airplaneSeatView, item.getSeat(), false, 2, null);
        airplaneSeatView.setOnSeatClickListener(function1);
        return airplaneSeatView;
    }

    private final TextAtomView addTextContent(FlightSchemeTextContent item) {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomView.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomView textAtomView = (TextAtomView) qVar.g(b11, context);
        textAtomView.setLayoutParams(new FrameLayout.LayoutParams(item.getWidth(), item.getHeight()));
        textAtomView.setGravity(17);
        TextAtomHolderKt.bind$default(textAtomView, item.getText(), null, 2, null);
        textAtomView.setTextSize(1, 14.0f);
        return textAtomView;
    }

    public final void bind(@NotNull FlightSchemeContentRow item) {
        View addSeatContent;
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        removeAllViews();
        setPadding(getPaddingLeft(), item.getTopOffset(), getPaddingRight(), getPaddingBottom());
        for (FlightSchemeContent flightSchemeContent : item.getContentList()) {
            if (!(flightSchemeContent instanceof FlightSchemeEmptyContent)) {
                if (flightSchemeContent instanceof FlightSchemeTextContent) {
                    addSeatContent = addTextContent((FlightSchemeTextContent) flightSchemeContent);
                } else {
                    if (!(flightSchemeContent instanceof FlightSchemeSeatContent)) {
                        throw new o();
                    }
                    addSeatContent = addSeatContent((FlightSchemeSeatContent) flightSchemeContent);
                }
                addView(addSeatContent);
            }
        }
        requestLayout();
        invalidate();
    }

    public final void highlightSeat(@NotNull String seatNumber, boolean shouldDelay) {
        Intrinsics.checkNotNullParameter(seatNumber, "seatNumber");
        FlightSchemeContentRow flightSchemeContentRow = this.item;
        if (flightSchemeContentRow == null) {
            return;
        }
        int i11 = 0;
        for (FlightSchemeContent flightSchemeContent : flightSchemeContentRow.getContentList()) {
            if ((flightSchemeContent instanceof FlightSchemeSeatContent) && Intrinsics.d(((FlightSchemeSeatContent) flightSchemeContent).getSeat().getNumber(), seatNumber)) {
                View childAt = getChildAt(i11);
                AirplaneSeatView airplaneSeatView = childAt instanceof AirplaneSeatView ? (AirplaneSeatView) childAt : null;
                if (airplaneSeatView == null) {
                    return;
                }
                airplaneSeatView.highlight(shouldDelay ? 100L : 0L);
                return;
            }
            if (!(flightSchemeContent instanceof FlightSchemeEmptyContent)) {
                i11++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        FlightSchemeContentRow flightSchemeContentRow = this.item;
        if (flightSchemeContentRow == null) {
            super.onLayout(changed, left, top, right, bottom);
            return;
        }
        int paddingTop = getPaddingTop();
        int c11 = C6915b.c(((right - left) / 2.0f) - (flightSchemeContentRow.getSchemeWidth() / 2.0f));
        List<FlightSchemeContent> contentList = flightSchemeContentRow.getContentList();
        int P11 = C7714v.P(contentList);
        int i11 = 0;
        int i12 = 0;
        for (Object obj : contentList) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FlightSchemeContent flightSchemeContent = (FlightSchemeContent) obj;
            if (!(flightSchemeContent instanceof FlightSchemeEmptyContent)) {
                getChildAt(i12).layout(c11, paddingTop, flightSchemeContent.getWidth() + c11, flightSchemeContent.getHeight() + paddingTop);
                i12++;
            }
            int width = flightSchemeContent.getWidth() + c11;
            c11 = i11 < P11 ? flightSchemeContentRow.getItemsOffset() + width : width;
            i11 = i13;
        }
    }

    public final void setOnSeatClickListener(Function1<? super AirplaneSeatVO, Unit> function1) {
        this.onSeatClickListener = function1;
    }

    public final void updateSingleSeat(@NotNull FlightSchemeContentRow item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FlightSchemeContentRow flightSchemeContentRow = this.item;
        if (flightSchemeContentRow == null) {
            bind(item);
            return;
        }
        Iterator<FlightSchemeContent> it = flightSchemeContentRow.getContentList().iterator();
        Iterator<FlightSchemeContent> it2 = item.getContentList().iterator();
        int i11 = 0;
        while (it.hasNext() && it2.hasNext()) {
            FlightSchemeContent next = it.next();
            FlightSchemeContent next2 = it2.next();
            boolean d11 = Intrinsics.d(next, next2);
            if (!d11 || !(next instanceof FlightSchemeEmptyContent)) {
                if (!d11 && (next2 instanceof FlightSchemeSeatContent)) {
                    View childAt = getChildAt(i11);
                    AirplaneSeatView airplaneSeatView = childAt instanceof AirplaneSeatView ? (AirplaneSeatView) childAt : null;
                    if (airplaneSeatView != null) {
                        airplaneSeatView.bind(((FlightSchemeSeatContent) next2).getSeat(), true);
                    }
                }
                i11++;
            }
        }
        this.item = item;
    }
}
