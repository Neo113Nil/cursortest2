package ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.view;

import Bi.b;
import Im.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.presentation.TravelSortingV2VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.presentation.adapter.TravelSortingV2Adapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.presentation.adapter.TravelSortingV2Decoration;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ\b\u0010\u001f\u001a\u00020\u000eH\u0002J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/view/TravelSortingV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "dpf24", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "travelSortingAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/presentation/adapter/TravelSortingV2Adapter;", "trainOptionTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "sortingButton", "Lru/ozon/uni/android/atom/badge/BadgeView;", "fastSortingButtonsRV", "Landroidx/recyclerview/widget/RecyclerView;", "skeletonTSV", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/view/TravelSortingV2SkeletonView;", "verticalBarrier", "Landroidx/constraintlayout/widget/Barrier;", "fontScale", "bind", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/presentation/TravelSortingV2VO;", "addViews", "setConstraints", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class TravelSortingV2View extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private final int dp16;
    private final int dp8;
    private final float dpf24;

    @NotNull
    private final RecyclerView fastSortingButtonsRV;
    private final float fontScale;

    @NotNull
    private final TravelSortingV2SkeletonView skeletonTSV;

    @NotNull
    private final BadgeView sortingButton;

    @NotNull
    private final TextAtomV2View trainOptionTAV;

    @NotNull
    private final TravelSortingV2Adapter travelSortingAdapter;

    @NotNull
    private final Barrier verticalBarrier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelSortingV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dpf24 = pxF;
        TravelSortingV2Adapter travelSortingV2Adapter = new TravelSortingV2Adapter(new TravelSortingV2View$travelSortingAdapter$1(this));
        this.travelSortingAdapter = travelSortingV2Adapter;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.travelSortingV2trainOptionTAV, -2, -2);
        d11.f41616W = true;
        textAtomV2View.setLayoutParams(d11);
        this.trainOptionTAV = textAtomV2View;
        BadgeView badgeView = (BadgeView) qVar.g(N.b(BadgeView.class), context);
        a.c(badgeView, R$id.travelSortingV2sortingButton, -2, -2);
        this.sortingButton = badgeView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.travelSortingV2fastSortingButtonsRV);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setAdapter(travelSortingV2Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.addItemDecoration(new TravelSortingV2Decoration(context));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        this.fastSortingButtonsRV = recyclerView;
        TravelSortingV2SkeletonView travelSortingV2SkeletonView = new TravelSortingV2SkeletonView(context);
        travelSortingV2SkeletonView.setId(R$id.travelSortingV2skeletonTSV);
        travelSortingV2SkeletonView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.skeletonTSV = travelSortingV2SkeletonView;
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.travelSortingV2Barrier);
        barrier.f(3);
        barrier.setReferencedIds(new int[]{textAtomV2View.getId(), badgeView.getId()});
        this.verticalBarrier = barrier;
        this.fontScale = getResources().getConfiguration().fontScale;
        setPadding(0, px, 0, px2);
        setBackground(RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), ThemeExtKt.themeColor(context, R$attr.layerFloor1), 0.0f, 0.0f, pxF, pxF, 6, null));
        addViews();
        setConstraints();
    }

    private final void addViews() {
        addView(this.trainOptionTAV);
        addView(this.sortingButton);
        addView(this.verticalBarrier);
        addView(this.fastSortingButtonsRV);
        addView(this.skeletonTSV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$6(TravelSortingV2View travelSortingV2View) {
        View view = (View) l.l(C5316f0.b(travelSortingV2View.fastSortingButtonsRV));
        if (view != null) {
            view.requestLayout();
        }
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new TravelSortingV2View$setConstraints$1(this));
    }

    public final void bind(@NotNull TravelSortingV2VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        TextHolderKt.bind$default(this.trainOptionTAV, item.getTrainOption(), null, 2, null);
        BadgeHolderKt.bind(this.sortingButton, item.getSortingButton(), actionHandler);
        this.fastSortingButtonsRV.setVisibility(item.getIsFastSortingButtonsVisible() ? 0 : 8);
        this.skeletonTSV.setVisibility(item.getIsFastSortingButtonsVisible() ? 8 : 0);
        this.travelSortingAdapter.submitList(item.getFastSortingButtons());
        if (this.fontScale >= 2.0f) {
            this.fastSortingButtonsRV.post(new Ec0.b(this, 3));
        }
    }
}
