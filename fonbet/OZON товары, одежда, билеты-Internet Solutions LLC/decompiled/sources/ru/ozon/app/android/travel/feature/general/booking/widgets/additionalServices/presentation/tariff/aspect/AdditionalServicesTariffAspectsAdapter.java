package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.aspect;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.databinding.ItemAdditionalServicesTariffBinding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffAspectVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffItemVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffItemsCallback;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0014\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/aspect/AdditionalServicesTariffAspectsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/aspect/AdditionalServicesTariffAspectViewHolder;", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffActionWrapper;", "", "onTariffActionWrapperClicked", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/aspect/AdditionalServicesTariffAspectViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/aspect/AdditionalServicesTariffAspectViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/aspect/AdditionalServicesTariffAspectViewHolder;ILjava/util/List;)V", "cellId", "setCellId", "(I)V", "Lkotlin/jvm/functions/Function1;", "I", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesTariffAspectsAdapter extends t<AdditionalServicesTariffItemVO, AdditionalServicesTariffAspectViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private int cellId;

    @NotNull
    private final Function1<AdditionalServicesTariffActionWrapper, Unit> onTariffActionWrapperClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdditionalServicesTariffAspectsAdapter(@NotNull Function1<? super AdditionalServicesTariffActionWrapper, Unit> onTariffActionWrapperClicked, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new AdditionalServicesTariffItemsCallback());
        Intrinsics.checkNotNullParameter(onTariffActionWrapperClicked, "onTariffActionWrapperClicked");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.onTariffActionWrapperClicked = onTariffActionWrapperClicked;
        this.actionHandler = actionHandler;
        this.cellId = -1;
    }

    public final void setCellId(int cellId) {
        this.cellId = cellId;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((AdditionalServicesTariffAspectViewHolder) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AdditionalServicesTariffAspectViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemAdditionalServicesTariffBinding inflate = ItemAdditionalServicesTariffBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new AdditionalServicesTariffAspectViewHolder(inflate, this.onTariffActionWrapperClicked, this.cellId, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AdditionalServicesTariffAspectViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AdditionalServicesTariffItemVO item = getItem(position);
        Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffAspectVO");
        holder.bind((AdditionalServicesTariffAspectVO) item);
    }

    public void onBindViewHolder(@NotNull AdditionalServicesTariffAspectViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Object M11 = C7714v.M(payloads);
        List list = M11 instanceof List ? (List) M11 : null;
        if (list == null) {
            super.onBindViewHolder((AdditionalServicesTariffAspectsAdapter) holder, position, payloads);
            return;
        }
        AdditionalServicesTariffItemVO item = getItem(position);
        Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffAspectVO");
        AdditionalServicesTariffAspectVO additionalServicesTariffAspectVO = (AdditionalServicesTariffAspectVO) item;
        for (Object obj : list) {
            if (obj == AdditionalServicesTariffAspectPayload.ASPECT) {
                holder.bindAspect(additionalServicesTariffAspectVO);
            } else if (obj == AdditionalServicesTariffAspectPayload.TITLE) {
                holder.bindTitle(additionalServicesTariffAspectVO.getTitle());
            } else if (obj == AdditionalServicesTariffAspectPayload.SUBTITLE) {
                holder.bindSubtitle(additionalServicesTariffAspectVO.getSubtitle());
            }
        }
    }
}
