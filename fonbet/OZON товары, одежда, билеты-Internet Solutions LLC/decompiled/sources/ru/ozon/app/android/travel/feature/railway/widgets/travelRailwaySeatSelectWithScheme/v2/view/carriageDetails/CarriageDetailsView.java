package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.carriageDetails;

import Bs.ViewOnClickListenerC2671b;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.CarriageDetailsVO;
import ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons.ShiftedPreviewIconsView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\"\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000fJ\u0006\u0010!\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/carriageDetails/CarriageDetailsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "hitRect", "Landroid/graphics/Rect;", "carriageDetailsIconsAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/carriageDetails/CarriageDetailsIconsAdapter;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function1;", "", "iconsRV", "Landroidx/recyclerview/widget/RecyclerView;", "shiftedPreviewIcons", "Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsView;", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/CarriageDetailsVO;", "onAction", "setConstrains", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CarriageDetailsView extends ConstraintLayout {
    private AtomAction action;
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final Barrier barrier;

    @NotNull
    private final CarriageDetailsIconsAdapter carriageDetailsIconsAdapter;
    private final int dp8;

    @NotNull
    private final Rect hitRect;

    @NotNull
    private final RecyclerView iconsRV;

    @NotNull
    private final ShiftedPreviewIconsView shiftedPreviewIcons;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarriageDetailsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(Paddings.PADDING_300.getPx(), context);
        this.hitRect = new Rect();
        CarriageDetailsIconsAdapter carriageDetailsIconsAdapter = new CarriageDetailsIconsAdapter();
        this.carriageDetailsIconsAdapter = carriageDetailsIconsAdapter;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        recyclerView.setAdapter(carriageDetailsIconsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        addView(recyclerView);
        this.iconsRV = recyclerView;
        ShiftedPreviewIconsView shiftedPreviewIconsView = new ShiftedPreviewIconsView(context, null, 0, 6, null);
        shiftedPreviewIconsView.setId(View.generateViewId());
        shiftedPreviewIconsView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(shiftedPreviewIconsView);
        this.shiftedPreviewIcons = shiftedPreviewIconsView;
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.f(6);
        barrier.setReferencedIds(new int[]{recyclerView.getId(), shiftedPreviewIconsView.getId()});
        addView(barrier);
        this.barrier = barrier;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41616W = true;
        badgeView.setLayoutParams(bVar);
        addView(badgeView);
        this.badgeView = badgeView;
        setConstrains();
        setOnClickListener(new ViewOnClickListenerC2671b(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(CarriageDetailsView carriageDetailsView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = carriageDetailsView.action;
        if (atomAction == null || (function1 = carriageDetailsView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    public final void bind(@NotNull CarriageDetailsVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.carriageDetailsIconsAdapter.submitList(item.getServicesIcon());
        this.iconsRV.setVisibility(item.getIsServicesIconVisible() ? 0 : 8);
        this.shiftedPreviewIcons.bindOrGone(item.getShiftedPreviewIcons());
        BadgeHolderKt.bind(this.badgeView, item.getDetailsBadge(), onAction);
        this.action = item.getAction();
        this.actionHandler = onAction;
        setClickable(item.getAction() != null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (!isClickable()) {
            return super.onInterceptTouchEvent(ev);
        }
        if (this.badgeView.getVisibility() != 0) {
            return true;
        }
        this.badgeView.getHitRect(this.hitRect);
        return !this.hitRect.contains((int) ev.getX(), (int) ev.getY());
    }

    public final void setConstrains() {
        ConstraintLayoutExtKt.updateConstraints(this, new CarriageDetailsView$setConstrains$1(this));
    }
}
