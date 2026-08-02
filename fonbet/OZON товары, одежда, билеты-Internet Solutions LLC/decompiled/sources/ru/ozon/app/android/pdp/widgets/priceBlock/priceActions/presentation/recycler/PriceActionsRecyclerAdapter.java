package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.recycler;

import Lw.ViewOnClickListenerC3598a;
import WZ.t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.databinding.PdpItemPriceActionsCellBinding;
import ru.ozon.app.android.pdp.ui.configurators.base.LifecycleListAdapter;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.ListItemHolder;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.PriceActionsVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0091\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007\u0012 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\r\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\r\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\"\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R.\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/recycler/PriceActionsRecyclerAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/base/LifecycleListAdapter;", "Lru/ozon/app/android/pdp/utils/ListItemHolder;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Action;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/recycler/PriceActionItemViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onItemAction", "LWZ/t;", "onBlockInVisibleBounds", "Lkotlin/Function2;", "", "Lkotlin/Function0;", "visibilityStateAlert", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Landroid/view/View;", "onOnboardingShow", "actionHandler", "isSelect", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/recycler/PriceActionItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/recycler/PriceActionItemViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceActionsRecyclerAdapter extends LifecycleListAdapter<ListItemHolder<PriceActionsVO.Action>, PriceActionItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final boolean isSelect;

    @NotNull
    private final Function1<t, Unit> onBlockInVisibleBounds;

    @NotNull
    private final Function1<AtomAction, Unit> onItemAction;

    @NotNull
    private final Function2<OnBoardingDTO, View, Unit> onOnboardingShow;

    @NotNull
    private final Function2<Boolean, Function0<Unit>, Unit> visibilityStateAlert;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PriceActionsRecyclerAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> onItemAction, @NotNull Function1<? super t, Unit> onBlockInVisibleBounds, @NotNull Function2<? super Boolean, ? super Function0<Unit>, Unit> visibilityStateAlert, @NotNull Function2<? super OnBoardingDTO, ? super View, Unit> onOnboardingShow, @NotNull Function1<? super AtomAction, Unit> actionHandler, boolean z11) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onItemAction, "onItemAction");
        Intrinsics.checkNotNullParameter(onBlockInVisibleBounds, "onBlockInVisibleBounds");
        Intrinsics.checkNotNullParameter(visibilityStateAlert, "visibilityStateAlert");
        Intrinsics.checkNotNullParameter(onOnboardingShow, "onOnboardingShow");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.onItemAction = onItemAction;
        this.onBlockInVisibleBounds = onBlockInVisibleBounds;
        this.visibilityStateAlert = visibilityStateAlert;
        this.onOnboardingShow = onOnboardingShow;
        this.actionHandler = actionHandler;
        this.isSelect = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1$lambda$0(PriceActionsRecyclerAdapter priceActionsRecyclerAdapter, PriceActionsVO.Action action, View view) {
        priceActionsRecyclerAdapter.onItemAction.invoke(action.getAction());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PriceActionItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        PriceActionsVO.Action action = (PriceActionsVO.Action) ((ListItemHolder) getItem(position)).getValue();
        holder.bind(action);
        holder.itemView.setOnClickListener(action.getAction() != null ? new ViewOnClickListenerC3598a(5, this, action) : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PriceActionItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PdpItemPriceActionsCellBinding inflate = PdpItemPriceActionsCellBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        ConstraintLayout constraintLayout = inflate.getConstraintLayout();
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintLayout.setBackground(ContextExtKt.createRoundRectShape$default(context, UiExtKt.toPxF((this.isSelect ? CornerRadius.RADIUS_500 : CornerRadius.RADIUS_400).getPx()), CornersConfig.ALL, R$color.bg_primary, 0, null, 24, null));
        return new PriceActionItemViewHolder(inflate, this.onBlockInVisibleBounds, this.visibilityStateAlert, this.onOnboardingShow, this.actionHandler);
    }
}
