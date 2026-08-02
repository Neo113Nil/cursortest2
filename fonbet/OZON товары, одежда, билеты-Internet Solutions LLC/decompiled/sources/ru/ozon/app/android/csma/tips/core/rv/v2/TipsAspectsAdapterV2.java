package ru.ozon.app.android.csma.tips.core.rv.v2;

import Sc.o;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.R$layout;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.BaseCourierTipVI;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsMapper;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleListAdapter;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/csma/tips/core/rv/v2/TipsAspectsAdapterV2;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleListAdapter;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI;", "Lru/ozon/app/android/csma/tips/core/rv/v2/BaseTipsVH;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;", "viewModel", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;", "mapper", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/csma/tips/core/rv/v2/BaseTipsVH;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Lru/ozon/app/android/csma/tips/core/rv/v2/BaseTipsVH;I)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModel;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipsAspectsAdapterV2 extends LifecycleListAdapter<BaseCourierTipVI, BaseTipsVH> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TipCourierDetailsMapper mapper;

    @NotNull
    private final TipCourierDetailsViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TipsAspectsAdapterV2(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull TipCourierDetailsViewModel viewModel, @NotNull TipCourierDetailsMapper mapper, @NotNull J containerViewLifecycleOwner) {
        super(new TipsDiffCallback(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        this.actionHandler = actionHandler;
        this.viewModel = viewModel;
        this.mapper = mapper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        BaseCourierTipVI item = getItem(position);
        if (item instanceof BaseCourierTipVI.CourierTipVariant) {
            return TipsItemType.TIP.getType();
        }
        if (item instanceof BaseCourierTipVI.CourierTipInputStub) {
            return TipsItemType.INPUT.getType();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseTipsVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BaseCourierTipVI item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseTipsVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return viewType == TipsItemType.INPUT.getType() ? new TipItemInputV2ViewHolder(ViewGroupExtKt.inflate(parent, R$layout.item_tips_input), this.viewModel, this.mapper) : new TipItemV2ViewHolder(ViewGroupExtKt.inflate(parent, R$layout.item_tips_text), this.actionHandler);
    }
}
