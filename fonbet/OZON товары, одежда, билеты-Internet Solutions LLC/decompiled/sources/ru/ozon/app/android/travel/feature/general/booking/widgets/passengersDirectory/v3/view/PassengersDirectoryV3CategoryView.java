package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.view;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.category.PassengersDirectoryV3CategoryVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.category.adapter.PassengersDirectoryV3PassengerAdapter;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/view/PassengersDirectoryV3CategoryView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp16", "dpf24", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "passengerAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/adapter/PassengersDirectoryV3PassengerAdapter;", "titleTV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "passengersRV", "Landroidx/recyclerview/widget/RecyclerView;", "bind", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/PassengersDirectoryV3CategoryVO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV3CategoryView extends LinearLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private final int dp16;
    private final int dp4;
    private final float dpf24;

    @NotNull
    private final PassengersDirectoryV3PassengerAdapter passengerAdapter;

    @NotNull
    private final RecyclerView passengersRV;

    @NotNull
    private final TextAtomV2View titleTV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersDirectoryV3CategoryView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = UiExtKt.toPx(16, context);
        this.dp16 = px2;
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dpf24 = pxF;
        PassengersDirectoryV3PassengerAdapter passengersDirectoryV3PassengerAdapter = new PassengersDirectoryV3PassengerAdapter(new PassengersDirectoryV3CategoryView$passengerAdapter$1(this));
        this.passengerAdapter = passengersDirectoryV3PassengerAdapter;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = px;
        textAtomV2View.setLayoutParams(layoutParams);
        this.titleTV = textAtomV2View;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        this.passengersRV = recyclerView;
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), pxF));
        setPadding(px2, px2, px2, px2);
        setOrientation(1);
        addView(textAtomV2View);
        addView(recyclerView);
        recyclerView.setAdapter(passengersDirectoryV3PassengerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    public final void bind(@NotNull PassengersDirectoryV3CategoryVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        TextHolderKt.bindOrGone$default(this.titleTV, item.getTitle(), null, 2, null);
        this.passengerAdapter.submitList(item.getPassengers());
    }
}
