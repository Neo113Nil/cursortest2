package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.view;

import Ef0.c;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.adapter.FlightSeatsSchemePassengersBlockAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.adapter.FlightSeatsSchemePassengersBlockItemDecoration;
import ru.ozon.app.android.travel.utils.CenterSmoothScroller;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import xe.M;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J)\u0010\u0017\u001a\u00020\u000f2\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u0011J\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010\u0011J\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010#\u001a\u0004\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R,\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/view/FlightSeatsSchemePassengersBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "createTitle", "(Landroid/content/Context;)Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Landroidx/recyclerview/widget/RecyclerView;", "createRecyclerView", "(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/view/FlightSeatsSchemePassengersBlockShimmerView;", "createShimmerView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/view/FlightSeatsSchemePassengersBlockShimmerView;", "", "addChildren", "()V", "hideContent", "Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "onPassengerSelectedListener", "setUp", "(Lkotlin/jvm/functions/Function2;)V", "Lxe/M;", "scope", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;", "item", "showContent", "(Lxe/M;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;)V", "showShimmerView", "hideShimmerView", "showTitle", "position", "getItemOrNull", "(I)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "", "payload", "updateItem", "(ILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;Ljava/lang/Object;)V", "scrollToPassengerTab", "(I)V", "dp16", "I", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/adapter/FlightSeatsSchemePassengersBlockAdapter;", "passengersAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/adapter/FlightSeatsSchemePassengersBlockAdapter;", "titleTextView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "passengersRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "shimmerView", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/view/FlightSeatsSchemePassengersBlockShimmerView;", "Lkotlin/jvm/functions/Function2;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemePassengersBlockView extends ConstraintLayout {
    private final int dp16;
    private Function2<? super Integer, ? super FlightSeatsSchemePassengersBlockVO.Passenger, Unit> onPassengerSelectedListener;

    @NotNull
    private final FlightSeatsSchemePassengersBlockAdapter passengersAdapter;

    @NotNull
    private final RecyclerView passengersRecyclerView;

    @NotNull
    private final FlightSeatsSchemePassengersBlockShimmerView shimmerView;

    @NotNull
    private final TextAtomView titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemePassengersBlockView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.passengersAdapter = new FlightSeatsSchemePassengersBlockAdapter(new FlightSeatsSchemePassengersBlockView$passengersAdapter$1(this));
        this.titleTextView = createTitle(context);
        this.passengersRecyclerView = createRecyclerView(context);
        this.shimmerView = createShimmerView(context);
        addChildren();
    }

    private final void addChildren() {
        addView(this.titleTextView);
        addView(this.passengersRecyclerView);
        addView(this.shimmerView);
    }

    private final RecyclerView createRecyclerView(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(13143);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41638j = 13142;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = this.dp16;
        recyclerView.setLayoutParams(bVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(this.passengersAdapter);
        recyclerView.addItemDecoration(new FlightSeatsSchemePassengersBlockItemDecoration(context));
        return recyclerView;
    }

    private final FlightSeatsSchemePassengersBlockShimmerView createShimmerView(Context context) {
        FlightSeatsSchemePassengersBlockShimmerView flightSeatsSchemePassengersBlockShimmerView = new FlightSeatsSchemePassengersBlockShimmerView(context);
        flightSeatsSchemePassengersBlockShimmerView.setId(13144);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        flightSeatsSchemePassengersBlockShimmerView.setLayoutParams(bVar);
        int i11 = this.dp16;
        flightSeatsSchemePassengersBlockShimmerView.setPadding(i11, 0, i11, 0);
        flightSeatsSchemePassengersBlockShimmerView.setVisibility(8);
        return flightSeatsSchemePassengersBlockShimmerView;
    }

    private final TextAtomView createTitle(Context context) {
        TextAtomView textAtomView = (TextAtomView) q.f64554a.g(N.b(TextAtomView.class), context);
        ConstraintLayout.b b11 = c.b(textAtomView, 13142, 0, -2);
        b11.setMarginStart(this.dp16);
        b11.setMarginEnd(this.dp16);
        b11.f41656t = 0;
        b11.f41636i = 0;
        b11.f41658v = 0;
        textAtomView.setLayoutParams(b11);
        return textAtomView;
    }

    private final void hideContent() {
        this.titleTextView.setVisibility(8);
        this.passengersRecyclerView.setVisibility(8);
    }

    public final FlightSeatsSchemePassengersBlockVO.Passenger getItemOrNull(int position) {
        return this.passengersAdapter.getItemOrNull(position);
    }

    public final void hideShimmerView() {
        this.shimmerView.setVisibility(8);
    }

    public final void scrollToPassengerTab(int position) {
        RecyclerView.o layoutManager = this.passengersRecyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(context);
        centerSmoothScroller.setTargetPosition(position);
        layoutManager.startSmoothScroll(centerSmoothScroller);
    }

    public final void setUp(@NotNull Function2<? super Integer, ? super FlightSeatsSchemePassengersBlockVO.Passenger, Unit> onPassengerSelectedListener) {
        Intrinsics.checkNotNullParameter(onPassengerSelectedListener, "onPassengerSelectedListener");
        this.onPassengerSelectedListener = onPassengerSelectedListener;
    }

    public final void showContent(@NotNull M scope, @NotNull FlightSeatsSchemePassengersBlockVO item) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(item, "item");
        showTitle();
        TextAtomHolderKt.bind$default(this.titleTextView, item.getCompoundTitle(), null, 2, null);
        this.passengersRecyclerView.setVisibility(item.getAreTabsVisible() ? 0 : 8);
        this.passengersAdapter.submitList(scope, item.getPassengers(), new FlightSeatsSchemePassengersBlockView$showContent$1(this, item));
        hideShimmerView();
    }

    public final void showShimmerView() {
        this.shimmerView.setVisibility(0);
        hideContent();
    }

    public final void showTitle() {
        this.titleTextView.setVisibility(0);
    }

    public final void updateItem(int position, @NotNull FlightSeatsSchemePassengersBlockVO.Passenger item, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.passengersAdapter.updateItem(position, new FlightSeatsSchemePassengersBlockView$updateItem$1(item), payload);
    }
}
