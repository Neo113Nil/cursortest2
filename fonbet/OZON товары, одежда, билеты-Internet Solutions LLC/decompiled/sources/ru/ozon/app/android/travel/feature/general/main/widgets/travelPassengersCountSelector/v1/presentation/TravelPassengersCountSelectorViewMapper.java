package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data.TravelPassengersCountSelectorDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data.TravelPassengersCountSelectorMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views.TravelPassengersCountSelectorView;
import ru.ozon.app.android.travel.feature.general.widgets.travelPassengersCountSelector.v1.di.TravelPassengersCountSelectorComponent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R<\u0010'\u001a$\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040%j\b\u0012\u0004\u0012\u00020\u0004`&0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/widgets/travelPassengersCountSelector/v1/di/TravelPassengersCountSelectorComponent;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "<init>", "()V", "vo", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/UpdateSelectedTravelClass;", "update", "updateTabs", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/UpdateSelectedTravelClass;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/UpdateTravelQuantityCells;", "updateCells", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/UpdateTravelQuantityCells;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "LA00/a$J$a;", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorMapper;", "mapper", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelPassengersCountSelectorViewMapper extends WidgetViewMapper2<TravelPassengersCountSelectorComponent, TravelPassengersCountSelectorDTO, TravelPassengersCountSelectorVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<TravelPassengersCountSelectorVO>> holderProducer = new TravelPassengersCountSelectorViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(UpdateSelectedTravelClass.class, UpdateTravelQuantityCells.class);

    private final TravelPassengersCountSelectorVO updateCells(TravelPassengersCountSelectorVO vo, UpdateTravelQuantityCells update) {
        return TravelPassengersCountSelectorVO.copy$default(vo, 0L, update.getUpdatedCells(), 0, null, null, null, null, null, null, 509, null);
    }

    private final TravelPassengersCountSelectorVO updateTabs(TravelPassengersCountSelectorVO vo, UpdateSelectedTravelClass update) {
        AtomActionDTO action;
        if (vo.getTravelClassSelector() == null) {
            return null;
        }
        List<ChipDTO> chips = vo.getTravelClassSelector().getChips();
        ArrayList arrayList = new ArrayList(C7714v.z(chips, 10));
        for (ChipDTO chipDTO : chips) {
            CommonControlSettings common = chipDTO.getCommon();
            arrayList.add(ChipDTO.copy$default(chipDTO, null, null, Intrinsics.d((common == null || (action = common.getAction()) == null) ? null : action.getLink(), update.getNewSelectedTravelClassId()) ? ChipState.SELECTED : ChipState.ENABLED, null, null, null, null, 123, null));
        }
        return TravelPassengersCountSelectorVO.copy$default(vo, 0L, null, 0, null, vo.getTravelClassSelector().copy(arrayList), null, null, null, null, 495, null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelPassengersCountSelectorView travelPassengersCountSelectorView = new TravelPassengersCountSelectorView(context);
        travelPassengersCountSelectorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return travelPassengersCountSelectorView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TravelPassengersCountSelectorVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TravelPassengersCountSelectorComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TravelPassengersCountSelectorComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public TravelPassengersCountSelectorMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull TravelPassengersCountSelectorVO oldItem, @NotNull TravelPassengersCountSelectorVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getQuantityCells(), newItem.getQuantityCells())) {
            arrayList.add(SelectorPayloads.CELLS);
        }
        if (!Intrinsics.d(oldItem.getTravelClassSelector(), newItem.getTravelClassSelector())) {
            arrayList.add(SelectorPayloads.TRAVEL_CLASS_SELECTOR);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public TravelPassengersCountSelectorVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TravelPassengersCountSelectorVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof UpdateTravelQuantityCells) {
            return updateCells(oldItem, (UpdateTravelQuantityCells) update);
        }
        if (update instanceof UpdateSelectedTravelClass) {
            return updateTabs(oldItem, (UpdateSelectedTravelClass) update);
        }
        return null;
    }
}
