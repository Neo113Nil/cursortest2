package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation;

import AA.d;
import An.C2439a;
import BT.b;
import Bc.f;
import Bc.i;
import Bc.r;
import Kk.c;
import Mc.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorApi;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorRequest;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorViewModel;
import ru.ozon.app.android.travel.molecules.view.quantityCell.QuantityCellVO;
import ru.ozon.app.android.uikit.dialog.sort.SortItem;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001IB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010!\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b(\u0010'J\u0015\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u0012048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002090.8\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00103R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020<0.8\u0006¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b>\u00103R\u0016\u0010?\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\f0E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010H¨\u0006J"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorApi;", "touristCountSelectorApi", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorApi;)V", "Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;", "cell", "", "oldCells", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;", "ageSelectors", "", "valueDiff", "", "changeCellAndSelectors", "(Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;Ljava/util/List;Ljava/util/List;I)V", "", "", "isExceedMaxPeopleCount", "sendRestriction", "(Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;Ljava/util/List;Z)V", "checkMaxPeopleCount", "()Z", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;", "item", "onBindNewItem", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;)V", "selector", "", "ageCategories", "Lkotlin/Function1;", "modifyValue", "onSelectorClicked", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "selectedValuePosition", "onSelectorValueSelected", "(I)V", "onMinusButtonClicked", "(Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;)V", "onPlusButtonClicked", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "submitRequest", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorApi;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action;", "actionLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "progressLiveData", "Landroidx/lifecycle/V;", "getProgressLiveData", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/UpdateCountSelectors;", "cellsUpdateLiveData", "getCellsUpdateLiveData", "Lru/ozon/uni/android/flashbar/model/Restriction;", "restrictionLiveData", "getRestrictionLiveData", "indexClickedSelector", "I", "requestedSelectorInput", "Ljava/util/List;", "requestedSelectorInputModifyAction", "Lkotlin/jvm/functions/Function1;", "", "touristCount", "Ljava/util/Map;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;", "Action", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;

    @NotNull
    private final SingleLiveEvent<UpdateCountSelectors> cellsUpdateLiveData;
    private int indexClickedSelector;
    private TouristCountSelectorVO item;

    @NotNull
    private final V<Boolean> progressLiveData;
    private List<String> requestedSelectorInput;
    private Function1<? super String, Unit> requestedSelectorInputModifyAction;

    @NotNull
    private final SingleLiveEvent<Restriction> restrictionLiveData;

    @NotNull
    private Map<String, Integer> touristCount;

    @NotNull
    private final TouristCountSelectorApi touristCountSelectorApi;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action;", "", "Error", "HandleAction", "ShowSelector", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action$HandleAction;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action$ShowSelector;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 1694821040;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action$HandleAction;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HandleAction implements Action {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction atomAction;

            public HandleAction(@NotNull AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(atomAction, "atomAction");
                this.atomAction = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandleAction) && Intrinsics.d(this.atomAction, ((HandleAction) other).atomAction);
            }

            @NotNull
            public final AtomAction getAtomAction() {
                return this.atomAction;
            }

            public int hashCode() {
                return this.atomAction.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("HandleAction(atomAction=", ")", this.atomAction);
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action$ShowSelector;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action;", "", "selectorTitle", "", "Lru/ozon/app/android/uikit/dialog/sort/SortItem;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectorTitle", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowSelector implements Action {

            @NotNull
            private final List<SortItem> items;
            private final String selectorTitle;

            public ShowSelector(String str, @NotNull List<SortItem> items) {
                Intrinsics.checkNotNullParameter(items, "items");
                this.selectorTitle = str;
                this.items = items;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowSelector)) {
                    return false;
                }
                ShowSelector showSelector = (ShowSelector) other;
                return Intrinsics.d(this.selectorTitle, showSelector.selectorTitle) && Intrinsics.d(this.items, showSelector.items);
            }

            @NotNull
            public final List<SortItem> getItems() {
                return this.items;
            }

            public int hashCode() {
                String str = this.selectorTitle;
                return this.items.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @NotNull
            public String toString() {
                return C2439a.a("ShowSelector(selectorTitle=", this.selectorTitle, ", items=", ")", this.items);
            }
        }
    }

    public TouristCountSelectorViewModel(@NotNull TouristCountSelectorApi touristCountSelectorApi) {
        Intrinsics.checkNotNullParameter(touristCountSelectorApi, "touristCountSelectorApi");
        this.touristCountSelectorApi = touristCountSelectorApi;
        this.actionLiveData = new SingleLiveEvent<>();
        this.progressLiveData = new V<>();
        this.cellsUpdateLiveData = new SingleLiveEvent<>();
        this.restrictionLiveData = new SingleLiveEvent<>();
        this.indexClickedSelector = -1;
        this.touristCount = U.c();
    }

    private final void changeCellAndSelectors(QuantityCellVO cell, List<QuantityCellVO> oldCells, List<TouristCountSelectorVO.AgeSelectorVO> ageSelectors, int valueDiff) {
        Iterator<QuantityCellVO> it = oldCells.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.d(it.next().getId(), cell.getId())) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            QuantityCellVO quantityCellVO = oldCells.get(i11);
            int value = quantityCellVO.getValue() + valueDiff;
            QuantityCellVO copy$default = QuantityCellVO.copy$default(quantityCellVO, null, null, null, value, 0, 0, value > cell.getMinValue(), value < cell.getMaxValue(), null, 311, null);
            oldCells.set(i11, copy$default);
            if (Intrinsics.d(copy$default.getId(), "children")) {
                if (valueDiff == -1) {
                    ageSelectors.remove(C7714v.P(ageSelectors));
                } else if (valueDiff == 1) {
                    ageSelectors.add(new TouristCountSelectorVO.AgeSelectorVO(ageSelectors.size(), null, null, false));
                }
            }
            List<QuantityCellVO> list = oldCells;
            int h11 = U.h(C7714v.z(list, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
            for (QuantityCellVO quantityCellVO2 : list) {
                Pair pair = new Pair(quantityCellVO2.getId(), Integer.valueOf(quantityCellVO2.getValue()));
                linkedHashMap.put(pair.e(), pair.f());
            }
            this.touristCount = linkedHashMap;
            this.cellsUpdateLiveData.setValue(new UpdateCountSelectors(C7714v.U0(list), C7714v.U0(ageSelectors), !ageSelectors.isEmpty()));
        }
    }

    private final boolean checkMaxPeopleCount() {
        TouristCountSelectorVO touristCountSelectorVO = this.item;
        if (touristCountSelectorVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        Iterator<T> it = touristCountSelectorVO.getCells().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((QuantityCellVO) it.next()).getValue();
        }
        TouristCountSelectorVO touristCountSelectorVO2 = this.item;
        if (touristCountSelectorVO2 != null) {
            return i11 >= touristCountSelectorVO2.getMaxSumValue();
        }
        Intrinsics.n("item");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendRestriction(QuantityCellVO cell, List<QuantityCellVO> oldCells, boolean isExceedMaxPeopleCount) {
        Restriction restriction;
        Iterator<QuantityCellVO> it;
        int i11;
        Object obj;
        Object obj2;
        Object obj3;
        Restriction restriction2 = null;
        if (isExceedMaxPeopleCount) {
            TouristCountSelectorVO touristCountSelectorVO = this.item;
            if (touristCountSelectorVO == null) {
                Intrinsics.n("item");
                throw null;
            }
            Iterator<T> it2 = touristCountSelectorVO.getAlerts().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = it2.next();
                    if (((TouristCountSelectorVO.AlertVO) obj3).getBrokenRule() == TouristCountSelectorDTO.AlertDTO.BrokenRuleDTO.BROKEN_RULE_TOURISTS_SUM) {
                        break;
                    }
                }
            }
            TouristCountSelectorVO.AlertVO alertVO = (TouristCountSelectorVO.AlertVO) obj3;
            if (alertVO != null) {
                restriction = alertVO.getRestriction();
                it = oldCells.iterator();
                i11 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i11 = -1;
                        break;
                    } else if (Intrinsics.d(it.next().getId(), cell.getId())) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    String id2 = oldCells.get(i11).getId();
                    if (Intrinsics.d(id2, "adult")) {
                        TouristCountSelectorVO touristCountSelectorVO2 = this.item;
                        if (touristCountSelectorVO2 == null) {
                            Intrinsics.n("item");
                            throw null;
                        }
                        Iterator<T> it3 = touristCountSelectorVO2.getAlerts().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            } else {
                                obj2 = it3.next();
                                if (((TouristCountSelectorVO.AlertVO) obj2).getBrokenRule() == TouristCountSelectorDTO.AlertDTO.BrokenRuleDTO.BROKEN_RULE_ADULTS_SUM) {
                                    break;
                                }
                            }
                        }
                        TouristCountSelectorVO.AlertVO alertVO2 = (TouristCountSelectorVO.AlertVO) obj2;
                        if (alertVO2 != null) {
                            restriction2 = alertVO2.getRestriction();
                        }
                    } else if (Intrinsics.d(id2, "children")) {
                        TouristCountSelectorVO touristCountSelectorVO3 = this.item;
                        if (touristCountSelectorVO3 == null) {
                            Intrinsics.n("item");
                            throw null;
                        }
                        Iterator<T> it4 = touristCountSelectorVO3.getAlerts().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it4.next();
                                if (((TouristCountSelectorVO.AlertVO) obj).getBrokenRule() == TouristCountSelectorDTO.AlertDTO.BrokenRuleDTO.BROKEN_RULE_CHILDREN_SUM) {
                                    break;
                                }
                            }
                        }
                        TouristCountSelectorVO.AlertVO alertVO3 = (TouristCountSelectorVO.AlertVO) obj;
                        if (alertVO3 != null) {
                            restriction2 = alertVO3.getRestriction();
                        }
                    }
                    restriction = restriction2;
                }
                if (restriction == null) {
                    this.restrictionLiveData.setValue(restriction);
                    return;
                }
                return;
            }
        }
        restriction = null;
        it = oldCells.iterator();
        i11 = 0;
        while (true) {
            if (it.hasNext()) {
            }
            i11++;
        }
        if (i11 != -1) {
        }
        if (restriction == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtomAction submitRequest$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AtomAction) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitRequest$lambda$6(TouristCountSelectorViewModel touristCountSelectorViewModel) {
        touristCountSelectorViewModel.progressLiveData.setValue(Boolean.FALSE);
    }

    @NotNull
    public final SingleLiveEvent<Action> getActionLiveData() {
        return this.actionLiveData;
    }

    @NotNull
    public final SingleLiveEvent<UpdateCountSelectors> getCellsUpdateLiveData() {
        return this.cellsUpdateLiveData;
    }

    @NotNull
    public final V<Boolean> getProgressLiveData() {
        return this.progressLiveData;
    }

    @NotNull
    public final SingleLiveEvent<Restriction> getRestrictionLiveData() {
        return this.restrictionLiveData;
    }

    public final void onBindNewItem(@NotNull TouristCountSelectorVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        List<QuantityCellVO> cells = item.getCells();
        int h11 = U.h(C7714v.z(cells, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (QuantityCellVO quantityCellVO : cells) {
            Pair pair = new Pair(quantityCellVO.getId(), Integer.valueOf(quantityCellVO.getValue()));
            linkedHashMap.put(pair.e(), pair.f());
        }
        this.touristCount = linkedHashMap;
    }

    public final void onMinusButtonClicked(@NotNull QuantityCellVO cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        if (cell.getMinusButtonEnabled()) {
            TouristCountSelectorVO touristCountSelectorVO = this.item;
            if (touristCountSelectorVO == null) {
                Intrinsics.n("item");
                throw null;
            }
            ArrayList W02 = C7714v.W0(touristCountSelectorVO.getCells());
            TouristCountSelectorVO touristCountSelectorVO2 = this.item;
            if (touristCountSelectorVO2 != null) {
                changeCellAndSelectors(cell, W02, C7714v.W0(touristCountSelectorVO2.getAgeSelectors()), -1);
            } else {
                Intrinsics.n("item");
                throw null;
            }
        }
    }

    public final void onPlusButtonClicked(@NotNull QuantityCellVO cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        boolean checkMaxPeopleCount = checkMaxPeopleCount();
        if (checkMaxPeopleCount || !cell.getPlusButtonEnabled()) {
            TouristCountSelectorVO touristCountSelectorVO = this.item;
            if (touristCountSelectorVO != null) {
                sendRestriction(cell, touristCountSelectorVO.getCells(), checkMaxPeopleCount);
                return;
            } else {
                Intrinsics.n("item");
                throw null;
            }
        }
        TouristCountSelectorVO touristCountSelectorVO2 = this.item;
        if (touristCountSelectorVO2 == null) {
            Intrinsics.n("item");
            throw null;
        }
        ArrayList W02 = C7714v.W0(touristCountSelectorVO2.getCells());
        TouristCountSelectorVO touristCountSelectorVO3 = this.item;
        if (touristCountSelectorVO3 != null) {
            changeCellAndSelectors(cell, W02, C7714v.W0(touristCountSelectorVO3.getAgeSelectors()), 1);
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    public final void onSelectorClicked(@NotNull TouristCountSelectorVO.AgeSelectorVO selector, @NotNull List<String> ageCategories, @NotNull Function1<? super String, Unit> modifyValue) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(ageCategories, "ageCategories");
        Intrinsics.checkNotNullParameter(modifyValue, "modifyValue");
        this.indexClickedSelector = selector.getIndex();
        List<String> list = ageCategories;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(new SortItem((String) obj, Intrinsics.d(ageCategories.get(i11), selector.getValue())));
            i11 = i12;
        }
        this.requestedSelectorInput = ageCategories;
        this.requestedSelectorInputModifyAction = modifyValue;
        this.actionLiveData.setValue(new Action.ShowSelector(null, arrayList));
    }

    public final void onSelectorValueSelected(int selectedValuePosition) {
        String str;
        List<String> list = this.requestedSelectorInput;
        if (list == null || (str = (String) C7714v.Q(selectedValuePosition, list)) == null || this.indexClickedSelector == -1) {
            return;
        }
        TouristCountSelectorVO touristCountSelectorVO = this.item;
        if (touristCountSelectorVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        ArrayList W02 = C7714v.W0(touristCountSelectorVO.getAgeSelectors());
        TouristCountSelectorVO.AgeSelectorVO ageSelectorVO = (TouristCountSelectorVO.AgeSelectorVO) C7714v.Q(this.indexClickedSelector, W02);
        if (ageSelectorVO == null) {
            return;
        }
        W02.set(this.indexClickedSelector, TouristCountSelectorVO.AgeSelectorVO.copy$default(ageSelectorVO, 0, str, null, false, 1, null));
        TouristCountSelectorVO touristCountSelectorVO2 = this.item;
        if (touristCountSelectorVO2 == null) {
            Intrinsics.n("item");
            throw null;
        }
        this.item = TouristCountSelectorVO.copy$default(touristCountSelectorVO2, 0L, null, 0, null, null, null, C7714v.U0(W02), null, false, null, 959, null);
        Function1<? super String, Unit> function1 = this.requestedSelectorInputModifyAction;
        if (function1 != null) {
            function1.invoke(str);
        }
        this.requestedSelectorInput = null;
        this.requestedSelectorInputModifyAction = null;
    }

    public final void submitRequest(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.ComposerAction) {
            Map<String, Integer> map = this.touristCount;
            TouristCountSelectorVO touristCountSelectorVO = this.item;
            if (touristCountSelectorVO == null) {
                Intrinsics.n("item");
                throw null;
            }
            List<TouristCountSelectorVO.AgeSelectorVO> ageSelectors = touristCountSelectorVO.getAgeSelectors();
            ArrayList arrayList = new ArrayList(C7714v.z(ageSelectors, 10));
            Iterator<T> it = ageSelectors.iterator();
            while (it.hasNext()) {
                arrayList.add(((TouristCountSelectorVO.AgeSelectorVO) it.next()).getValue());
            }
            TouristCountSelectorRequest touristCountSelectorRequest = new TouristCountSelectorRequest(map, arrayList);
            C5415f.a(this).d();
            C5415f.a(this).a(new f(new i(new r(this.touristCountSelectorApi.performAction(((AtomAction.ComposerAction) action).getActionName(), touristCountSelectorRequest).j(a.b()), new AA.c(TouristCountSelectorViewModel$submitRequest$1.INSTANCE, 1)).g(C8125a.a()), new d(new TouristCountSelectorViewModel$submitRequest$2(this), 1)), new InterfaceC9019a() { // from class: BT.a
                @Override // qc.InterfaceC9019a
                public final void run() {
                    TouristCountSelectorViewModel.submitRequest$lambda$6(TouristCountSelectorViewModel.this);
                }
            }).h(new b(new TouristCountSelectorViewModel$submitRequest$4(this), 0), new BT.c(new TouristCountSelectorViewModel$submitRequest$5(this), 0)));
        }
    }
}
