package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews;

import Ej.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.FreshPremiumPointsTrainMultipleVO;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.HeadCarriageViewHolder;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.SignViewHolder;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.TailCarriageViewHolder;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/TrainMultipleManualViewsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/recyclerview/widget/i$d;", "diffCallback", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/recyclerview/widget/i$d;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Lkotlin/jvm/functions/Function1;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TrainMultipleManualViewsAdapter extends t<FreshPremiumPointsTrainMultipleVO.PremiumPointsItem, RecyclerView.C> {
    private static final int DP_12 = UiExtKt.toPx(12);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrainMultipleManualViewsAdapter(@NotNull i.d<FreshPremiumPointsTrainMultipleVO.PremiumPointsItem> diffCallback, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        FreshPremiumPointsTrainMultipleVO.PremiumPointsItem item = getItem(position);
        if (item instanceof FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.HeadCarriage) {
            return 0;
        }
        if (item instanceof FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.TailCarriage) {
            return ((FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.TailCarriage) item).getStatusIcon() != null ? 1 : 3;
        }
        if (item instanceof FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.SignItem) {
            return 2;
        }
        throw new IllegalArgumentException(b.a(position, "Illegal item on position: "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof HeadCarriageViewHolder) {
            FreshPremiumPointsTrainMultipleVO.PremiumPointsItem item = getItem(position);
            FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.HeadCarriage headCarriage = item instanceof FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.HeadCarriage ? (FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.HeadCarriage) item : null;
            if (headCarriage != null) {
                ((HeadCarriageViewHolder) holder).bind(headCarriage);
                return;
            }
            return;
        }
        if (holder instanceof TailCarriageViewHolder) {
            FreshPremiumPointsTrainMultipleVO.PremiumPointsItem item2 = getItem(position);
            FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.TailCarriage tailCarriage = item2 instanceof FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.TailCarriage ? (FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.TailCarriage) item2 : null;
            if (tailCarriage != null) {
                ((TailCarriageViewHolder) holder).bind(tailCarriage);
                return;
            }
            return;
        }
        if (holder instanceof SignViewHolder) {
            FreshPremiumPointsTrainMultipleVO.PremiumPointsItem item3 = getItem(position);
            FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.SignItem signItem = item3 instanceof FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.SignItem ? (FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.SignItem) item3 : null;
            if (signItem != null) {
                ((SignViewHolder) holder).bind(signItem);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View i11 = q.f64554a.i(N.b(HeadCarriageView.class), context);
            if (i11 == null) {
                i11 = new HeadCarriageView(context, null, 0, 0, 14, null);
            }
            return new HeadCarriageViewHolder((HeadCarriageView) i11, this.actionHandler);
        }
        if (viewType == 1) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            View i12 = q.f64554a.i(N.b(StatusTailCarriageViewFresh.class), context2);
            if (i12 == null) {
                i12 = new StatusTailCarriageViewFresh(context2, null, 0, 0, 14, null);
            }
            return new TailCarriageViewHolder((StatusTailCarriageViewFresh) i12, this.actionHandler);
        }
        if (viewType == 2) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            View i13 = q.f64554a.i(N.b(SignManualView.class), context3);
            if (i13 == null) {
                i13 = new SignManualView(context3, null, 0, 0, 14, null);
            }
            return new SignViewHolder((SignManualView) i13);
        }
        if (viewType != 3) {
            throw new IllegalArgumentException(b.a(viewType, "No such view type: "));
        }
        Context context4 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        View i14 = q.f64554a.i(N.b(TailCarriageViewFresh.class), context4);
        if (i14 == null) {
            i14 = new TailCarriageViewFresh(context4, null, 0, 0, 14, null);
        }
        TailCarriageViewFresh tailCarriageViewFresh = (TailCarriageViewFresh) i14;
        ViewGroup.LayoutParams layoutParams = tailCarriageViewFresh.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            int i15 = DP_12;
            marginLayoutParams2.setMargins(0, i15, 0, i15);
            marginLayoutParams = marginLayoutParams2;
        }
        tailCarriageViewFresh.setLayoutParams(marginLayoutParams);
        return new TailCarriageViewHolder(tailCarriageViewFresh, this.actionHandler);
    }
}
