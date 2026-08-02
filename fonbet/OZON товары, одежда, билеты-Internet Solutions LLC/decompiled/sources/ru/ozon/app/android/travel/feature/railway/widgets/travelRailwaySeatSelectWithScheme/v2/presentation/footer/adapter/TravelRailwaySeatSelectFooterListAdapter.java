package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.adapter;

import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.AdditionalServiceVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.AlternativePriceBlockVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.AtomDTOHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.BlockDividerVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.BonusVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.CarriageDetailsVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.IslandVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.LineDividerVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.PriceBlockVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.RailwayServicesVOHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.RoundedCellHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.SelectedSeatVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TariffVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.additionalService.AdditionalServiceViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.alternativePriceBlock.AlternativePriceBlockViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.atom.SingleAtomViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.bonus.BonusViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.carriageDetails.CarriageDetailsViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.divider.BlockDividerViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.divider.LineDividerViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.island.IslandViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.priceBlock.PriceBlockViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.railwayServices.RailwayServicesViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.roundedCell.RoundedCellViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.selectedSeat.SelectedSeatViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.tariff.TariffLineViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/adapter/TravelRailwaySeatSelectFooterListAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO$FooterItem;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/adapter/TravelRailwaySeatSelectFooterListItemViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/adapter/TravelRailwaySeatSelectFooterListItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/adapter/TravelRailwaySeatSelectFooterListItemViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "Companion", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectFooterListAdapter extends i<TravelRailwaySeatSelectFooterVO.FooterItem, TravelRailwaySeatSelectFooterListItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TravelRailwaySeatSelectFooterListAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<TravelRailwaySeatSelectFooterVO.FooterItem>() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.adapter.TravelRailwaySeatSelectFooterListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TravelRailwaySeatSelectFooterVO.FooterItem oldItem, TravelRailwaySeatSelectFooterVO.FooterItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TravelRailwaySeatSelectFooterVO.FooterItem oldItem, TravelRailwaySeatSelectFooterVO.FooterItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getClass().equals(newItem.getClass()) && oldItem.getId() == newItem.getId();
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        TravelRailwaySeatSelectFooterVO.FooterItem item = getItem(position);
        if (item instanceof AdditionalServiceVO) {
            return 1;
        }
        if (item instanceof AlternativePriceBlockVO) {
            return 2;
        }
        if (item instanceof AtomDTOHolder) {
            return 3;
        }
        if (Intrinsics.d(item, BlockDividerVO.INSTANCE)) {
            return 4;
        }
        if (item instanceof BonusVO) {
            return 5;
        }
        if (item instanceof IslandVO) {
            return 6;
        }
        if (Intrinsics.d(item, LineDividerVO.INSTANCE)) {
            return 7;
        }
        if (item instanceof PriceBlockVO) {
            return 8;
        }
        if (item instanceof RailwayServicesVOHolder) {
            return 9;
        }
        if (item instanceof RoundedCellHolder) {
            return 10;
        }
        if (item instanceof SelectedSeatVO) {
            return 11;
        }
        if (item instanceof TariffVO) {
            return 12;
        }
        if (item instanceof CarriageDetailsVO) {
            return 13;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TravelRailwaySeatSelectFooterListItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TravelRailwaySeatSelectFooterVO.FooterItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TravelRailwaySeatSelectFooterListItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 1:
                AdditionalServiceViewHolder.Companion companion = AdditionalServiceViewHolder.INSTANCE;
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new AdditionalServiceViewHolder(companion.createView(context));
            case 2:
                AlternativePriceBlockViewHolder.Companion companion2 = AlternativePriceBlockViewHolder.INSTANCE;
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new AlternativePriceBlockViewHolder(companion2.createView(context2));
            case 3:
                SingleAtomViewHolder.Companion companion3 = SingleAtomViewHolder.INSTANCE;
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return new SingleAtomViewHolder(companion3.createView(context3));
            case 4:
                BlockDividerViewHolder.Companion companion4 = BlockDividerViewHolder.INSTANCE;
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                return new BlockDividerViewHolder(companion4.createView(context4));
            case 5:
                BonusViewHolder.Companion companion5 = BonusViewHolder.INSTANCE;
                Context context5 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                return new BonusViewHolder(companion5.createView(context5));
            case 6:
                IslandViewHolder.Companion companion6 = IslandViewHolder.INSTANCE;
                Context context6 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                return new IslandViewHolder(companion6.createView(context6));
            case 7:
                LineDividerViewHolder.Companion companion7 = LineDividerViewHolder.INSTANCE;
                Context context7 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                return new LineDividerViewHolder(companion7.createView(context7));
            case 8:
                PriceBlockViewHolder.Companion companion8 = PriceBlockViewHolder.INSTANCE;
                Context context8 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                return new PriceBlockViewHolder(companion8.createView(context8));
            case 9:
                RailwayServicesViewHolder.Companion companion9 = RailwayServicesViewHolder.INSTANCE;
                Context context9 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                return new RailwayServicesViewHolder(companion9.createView(context9));
            case 10:
                RoundedCellViewHolder.Companion companion10 = RoundedCellViewHolder.INSTANCE;
                Context context10 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                return new RoundedCellViewHolder(companion10.createView(context10));
            case 11:
                SelectedSeatViewHolder.Companion companion11 = SelectedSeatViewHolder.INSTANCE;
                Context context11 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                return new SelectedSeatViewHolder(companion11.createView(context11));
            case 12:
                TariffLineViewHolder.Companion companion12 = TariffLineViewHolder.INSTANCE;
                Context context12 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                return new TariffLineViewHolder(companion12.createView(context12));
            case 13:
                CarriageDetailsViewHolder.Companion companion13 = CarriageDetailsViewHolder.INSTANCE;
                Context context13 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
                return new CarriageDetailsViewHolder(companion13.createView(context13));
            default:
                throw new IllegalStateException(("Unknown view type: " + viewType).toString());
        }
    }
}
