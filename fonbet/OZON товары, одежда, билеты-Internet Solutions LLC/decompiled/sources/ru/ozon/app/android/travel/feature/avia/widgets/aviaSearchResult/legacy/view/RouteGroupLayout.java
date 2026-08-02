package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPool;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeVO;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeView;
import ru.ozon.app.android.travel.molecules.view.tripRoute.TripRouteView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J,\u0010\u0015\u001a\u00020\u00142\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0018j\u0002`\u00190\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001bJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/view/RouteGroupLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp4", "dp8", "dpf8", "", "dp12", "dp32", "pool", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPool;", "setPool", "", "bind", "items", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$RouteBlockVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/RouteBlockVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "newTripRouteView", "Lru/ozon/app/android/travel/molecules/view/tripRoute/TripRouteView;", "margin", "newInfoBadgeView", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeView;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RouteGroupLayout extends LinearLayout {
    private final int dp12;
    private final int dp32;
    private final int dp4;
    private final int dp8;
    private final float dpf8;
    private AviaSearchResultViewPool pool;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RouteGroupLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final InfoBadgeView newInfoBadgeView(AviaSearchResultViewPool pool) {
        InfoBadgeView infoBadgeView;
        if (pool == null || (infoBadgeView = (InfoBadgeView) pool.acquire(N.b(InfoBadgeView.class))) == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            infoBadgeView = new InfoBadgeView(context, null, 0, 0, 14, null);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = this.dp4;
        layoutParams.leftMargin = this.dp32;
        infoBadgeView.setLayoutParams(layoutParams);
        infoBadgeView.setBorderRadius(this.dpf8);
        int i11 = this.dp4;
        infoBadgeView.setCustomPadding(i11, i11, this.dp8, i11);
        return infoBadgeView;
    }

    private final TripRouteView newTripRouteView(AviaSearchResultViewPool pool, int margin) {
        TripRouteView tripRouteView;
        if (pool == null || (tripRouteView = (TripRouteView) pool.acquire(N.b(TripRouteView.class))) == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            tripRouteView = new TripRouteView(context, null, 0, 0, 14, null);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = margin;
        tripRouteView.setLayoutParams(layoutParams);
        return tripRouteView;
    }

    public final void bind(@NotNull List<AviaSearchResultVO.AviaSearchResultItemVO.RouteBlockVO> items, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        removeAllViews();
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AviaSearchResultVO.AviaSearchResultItemVO.RouteBlockVO routeBlockVO = (AviaSearchResultVO.AviaSearchResultItemVO.RouteBlockVO) obj;
            TripRouteView newTripRouteView = newTripRouteView(this.pool, i11 != 0 ? this.dp12 : 0);
            newTripRouteView.bind(routeBlockVO.getRoute());
            addView(newTripRouteView);
            List<InfoBadgeVO> badges = routeBlockVO.getBadges();
            if (badges != null) {
                List<InfoBadgeVO> list = badges;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                for (InfoBadgeVO infoBadgeVO : list) {
                    InfoBadgeView newInfoBadgeView = newInfoBadgeView(this.pool);
                    newInfoBadgeView.bind(infoBadgeVO, onAction);
                    arrayList.add(newInfoBadgeView);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    addView((View) it.next());
                }
            }
            i11 = i12;
        }
    }

    public final void setPool(@NotNull AviaSearchResultViewPool pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.pool = pool;
    }

    public /* synthetic */ RouteGroupLayout(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteGroupLayout(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dpf8 = ResourceExtKt.toPxF(8, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp32 = ResourceExtKt.toPx(32, context);
        setOrientation(1);
        setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.view.RouteGroupLayout.1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View parent, View child) {
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View parent, View child) {
                AviaSearchResultViewPool aviaSearchResultViewPool;
                if (child instanceof TripRouteView) {
                    AviaSearchResultViewPool aviaSearchResultViewPool2 = RouteGroupLayout.this.pool;
                    if (aviaSearchResultViewPool2 != null) {
                        aviaSearchResultViewPool2.release(N.b(TripRouteView.class), child);
                        return;
                    }
                    return;
                }
                if (!(child instanceof InfoBadgeView) || (aviaSearchResultViewPool = RouteGroupLayout.this.pool) == null) {
                    return;
                }
                aviaSearchResultViewPool.release(N.b(InfoBadgeView.class), child);
            }
        });
    }
}
