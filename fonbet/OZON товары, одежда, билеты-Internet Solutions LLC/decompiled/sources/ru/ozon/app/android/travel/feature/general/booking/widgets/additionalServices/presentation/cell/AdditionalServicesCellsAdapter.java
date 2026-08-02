package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.databinding.ItemAdditionalServicesCellBinding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffItemDecoration;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B}\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\b\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016¢\u0006\u0004\b\u001f\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;", "Ljk0/j;", "Landroid/content/Context;", "context", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesControlActionWrapper;", "onControlActionWrapperClicked", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesInfoActionWrapper;", "onInfoActionWrapperClicked", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffActionWrapper;", "onTariffActionWrapperClicked", "", "", "Landroid/os/Parcelable;", "tariffScrollStates", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/Map;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "holder", "position", "onBindViewHolder", "(Ljk0/j;I)V", "", "", "payloads", "(Ljk0/j;ILjava/util/List;)V", "onViewRecycled", "(Ljk0/j;)V", "Lkotlin/jvm/functions/Function1;", "Ljava/util/Map;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemDecoration;", "tariffItemDecoration", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemDecoration;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesCellsAdapter extends i<AdditionalServicesCellVO, j> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function1<AdditionalServicesControlActionWrapper, Unit> onControlActionWrapperClicked;

    @NotNull
    private final Function1<AdditionalServicesInfoActionWrapper, Unit> onInfoActionWrapperClicked;

    @NotNull
    private final Function1<AdditionalServicesTariffActionWrapper, Unit> onTariffActionWrapperClicked;

    @NotNull
    private final AdditionalServicesTariffItemDecoration tariffItemDecoration;

    @NotNull
    private final Map<Integer, Parcelable> tariffScrollStates;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdditionalServicesCellsAdapter(@NotNull Context context, @NotNull J containerViewLifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super AdditionalServicesControlActionWrapper, Unit> onControlActionWrapperClicked, @NotNull Function1<? super AdditionalServicesInfoActionWrapper, Unit> onInfoActionWrapperClicked, @NotNull Function1<? super AdditionalServicesTariffActionWrapper, Unit> onTariffActionWrapperClicked, @NotNull Map<Integer, Parcelable> tariffScrollStates) {
        super(new AdditionalServicesCellCallback(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onControlActionWrapperClicked, "onControlActionWrapperClicked");
        Intrinsics.checkNotNullParameter(onInfoActionWrapperClicked, "onInfoActionWrapperClicked");
        Intrinsics.checkNotNullParameter(onTariffActionWrapperClicked, "onTariffActionWrapperClicked");
        Intrinsics.checkNotNullParameter(tariffScrollStates, "tariffScrollStates");
        this.actionHandler = actionHandler;
        this.onControlActionWrapperClicked = onControlActionWrapperClicked;
        this.onInfoActionWrapperClicked = onInfoActionWrapperClicked;
        this.onTariffActionWrapperClicked = onTariffActionWrapperClicked;
        this.tariffScrollStates = tariffScrollStates;
        this.tariffItemDecoration = new AdditionalServicesTariffItemDecoration(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((j) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemAdditionalServicesCellBinding inflate = ItemAdditionalServicesCellBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new AdditionalServicesCellViewHolder(inflate, this.actionHandler, this.onControlActionWrapperClicked, this.onInfoActionWrapperClicked, this.onTariffActionWrapperClicked, this.tariffItemDecoration, this.tariffScrollStates);
    }

    @Override // jk0.i, androidx.recyclerview.widget.RecyclerView.g
    public void onViewRecycled(@NotNull j holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled((AdditionalServicesCellsAdapter) holder);
        AdditionalServicesCellViewHolder additionalServicesCellViewHolder = holder instanceof AdditionalServicesCellViewHolder ? (AdditionalServicesCellViewHolder) holder : null;
        if (additionalServicesCellViewHolder != null) {
            additionalServicesCellViewHolder.saveTariffsScroll();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof AdditionalServicesCellViewHolder) {
            AdditionalServicesCellViewHolder additionalServicesCellViewHolder = (AdditionalServicesCellViewHolder) holder;
            AdditionalServicesCellVO item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            additionalServicesCellViewHolder.bind(item);
            additionalServicesCellViewHolder.restoreTariffsScroll();
        }
    }

    public void onBindViewHolder(@NotNull j holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (holder instanceof AdditionalServicesCellViewHolder) {
            Object M11 = C7714v.M(payloads);
            List list = M11 instanceof List ? (List) M11 : null;
            if (list == null) {
                super.onBindViewHolder((AdditionalServicesCellsAdapter) holder, position, payloads);
                return;
            }
            AdditionalServicesCellVO item = getItem(position);
            for (Object obj : list) {
                if (obj == AdditionalServicesCellPayload.IMAGE) {
                    ((AdditionalServicesCellViewHolder) holder).bindImage(item.getImage());
                } else if (obj == AdditionalServicesCellPayload.TITLE) {
                    ((AdditionalServicesCellViewHolder) holder).bindTitle(item.getTitle());
                } else if (obj == AdditionalServicesCellPayload.TITLE_INFO_BUTTON) {
                    ((AdditionalServicesCellViewHolder) holder).bindTitleInfoButton(item.getTitleInfoButton(), this.actionHandler, item.getControl(), item.getId());
                } else if (obj == AdditionalServicesCellPayload.SUBTITLE) {
                    ((AdditionalServicesCellViewHolder) holder).bindSubtitle(item.getSubtitle());
                } else if (obj == AdditionalServicesCellPayload.CONTROL) {
                    ((AdditionalServicesCellViewHolder) holder).bindControl(item.getControl(), item.getId());
                } else if (obj == AdditionalServicesCellPayload.CELL_TYPE) {
                    ((AdditionalServicesCellViewHolder) holder).bindCellType(item.getCellType(), item.getId());
                } else if (obj == AdditionalServicesCellPayload.TARIFFS_VISIBILITY) {
                    ((AdditionalServicesCellViewHolder) holder).bindTariffsVisibility(item.getIsTariffsVisible());
                } else if (obj == AdditionalServicesCellPayload.SEPARATOR) {
                    ((AdditionalServicesCellViewHolder) holder).bindSeparator(item.getHideSeparator());
                } else if (obj == AdditionalServicesCellPayload.SUBTITLE_SKELETON) {
                    ((AdditionalServicesCellViewHolder) holder).bindSubtitleSkeleton(item.getIsSubtitleSkeletonVisible());
                } else if (obj == AdditionalServicesCellPayload.TARIFF_SKELETONS) {
                    ((AdditionalServicesCellViewHolder) holder).bindTariffSkeletons(item.getIsTariffSkeletonsVisible());
                }
            }
        }
    }
}
