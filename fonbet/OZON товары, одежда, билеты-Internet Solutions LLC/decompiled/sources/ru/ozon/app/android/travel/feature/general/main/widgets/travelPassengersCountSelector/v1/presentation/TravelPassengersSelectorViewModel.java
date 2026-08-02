package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import De.C2859b;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersCountSelectorVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views.TravelQuantityCellVO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 >2\u00020\u0001:\u0002>?B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u0011\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010*R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020(048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020+048F¢\u0006\u0006\u001a\u0004\b8\u00106R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0010048F¢\u0006\u0006\u001a\u0004\b:\u00106R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020.048F¢\u0006\u0006\u001a\u0004\b<\u00106¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "api", "<init>", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;", "modifiedCell", "", "oldCells", "", "maxSumValue", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$AlertVO;", "alerts", "valueDiff", "Lkotlin/Pair;", "Lru/ozon/uni/android/flashbar/model/Restriction;", "processQuantityCellOperation", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;Ljava/util/List;ILjava/util/List;I)Lkotlin/Pair;", "", "onCleared", "()V", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "item", "onBindNewItem", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;)V", "cellVo", "onMinusButtonClicked", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;)V", "onPlusButtonClicked", "", "newTravelClassId", "onTravelClassSelected", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "sendFormData", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/UpdateSelectedTravelClass;", "_travelClassUpdateLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/UpdateTravelQuantityCells;", "_cellsUpdateLiveData", "_restrictionLiveData", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action;", "_actionLiveData", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "Lxe/B0;", "actionJob", "Lxe/B0;", "Landroidx/lifecycle/P;", "getTravelClassUpdateLiveData", "()Landroidx/lifecycle/P;", "travelClassUpdateLiveData", "getCellsUpdateLiveData", "cellsUpdateLiveData", "getRestrictionLiveData", "restrictionLiveData", "getActionLiveData", "actionLiveData", "Companion", "Action", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPassengersSelectorViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> _actionLiveData;

    @NotNull
    private final SingleLiveEvent<UpdateTravelQuantityCells> _cellsUpdateLiveData;

    @NotNull
    private final SingleLiveEvent<Restriction> _restrictionLiveData;

    @NotNull
    private final SingleLiveEvent<UpdateSelectedTravelClass> _travelClassUpdateLiveData;
    private B0 actionJob;

    @NotNull
    private final TravelCommonActionResultApi api;
    private TravelPassengersCountSelectorVO item;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action;", "", "ShowProgress", "HideProgress", "Error", "DismissAndRefresh", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action$DismissAndRefresh;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action$HideProgress;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action$ShowProgress;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action$DismissAndRefresh;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DismissAndRefresh implements Action {

            @NotNull
            private final AtomActionDTO action;

            public DismissAndRefresh(@NotNull AtomActionDTO action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DismissAndRefresh) && Intrinsics.d(this.action, ((DismissAndRefresh) other).action);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return C2859b.f("DismissAndRefresh(action=", ")", this.action);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 1505296295;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action$HideProgress;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HideProgress implements Action {

            @NotNull
            public static final HideProgress INSTANCE = new HideProgress();

            private HideProgress() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof HideProgress);
            }

            public int hashCode() {
                return 287421200;
            }

            @NotNull
            public String toString() {
                return "HideProgress";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action$ShowProgress;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowProgress implements Action {

            @NotNull
            public static final ShowProgress INSTANCE = new ShowProgress();

            private ShowProgress() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowProgress);
            }

            public int hashCode() {
                return -1126775349;
            }

            @NotNull
            public String toString() {
                return "ShowProgress";
            }
        }
    }

    public TravelPassengersSelectorViewModel(@NotNull TravelCommonActionResultApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this._travelClassUpdateLiveData = new SingleLiveEvent<>();
        this._cellsUpdateLiveData = new SingleLiveEvent<>();
        this._restrictionLiveData = new SingleLiveEvent<>();
        this._actionLiveData = new SingleLiveEvent<>();
    }

    private final Pair<List<TravelQuantityCellVO>, Restriction> processQuantityCellOperation(TravelQuantityCellVO modifiedCell, List<TravelQuantityCellVO> oldCells, int maxSumValue, List<TravelPassengersCountSelectorVO.AlertVO> alerts, int valueDiff) {
        Integer num;
        Integer num2;
        Object obj;
        int currentValue;
        Object obj2;
        int currentValue2;
        List<TravelQuantityCellVO.CellRule> dependsOn = modifiedCell.getDependsOn();
        if (dependsOn.isEmpty()) {
            dependsOn = null;
        }
        if (dependsOn != null) {
            int i11 = 0;
            for (TravelQuantityCellVO travelQuantityCellVO : oldCells) {
                List<TravelQuantityCellVO.CellRule> tags = travelQuantityCellVO.getTags();
                if (!(tags instanceof Collection) || !tags.isEmpty()) {
                    Iterator<T> it = tags.iterator();
                    while (it.hasNext()) {
                        if (dependsOn.contains((TravelQuantityCellVO.CellRule) it.next())) {
                            currentValue2 = travelQuantityCellVO.getCurrentValue();
                            break;
                        }
                    }
                }
                currentValue2 = 0;
                i11 += currentValue2;
            }
            num = Integer.valueOf(i11);
        } else {
            num = null;
        }
        if (num != null && modifiedCell.getCurrentValue() + valueDiff > num.intValue()) {
            Iterator<T> it2 = alerts.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((TravelPassengersCountSelectorVO.AlertVO) obj2).getRestrictionCase() == TravelPassengersCountSelectorVO.AlertVO.RestrictionCase.DEPENDING_RELATION_SATISFIED) {
                    break;
                }
            }
            TravelPassengersCountSelectorVO.AlertVO alertVO = (TravelPassengersCountSelectorVO.AlertVO) obj2;
            return new Pair<>(oldCells, alertVO != null ? alertVO.getRestriction() : null);
        }
        List<TravelQuantityCellVO.CellRule> sumDependsOn = modifiedCell.getSumDependsOn();
        if (sumDependsOn.isEmpty()) {
            sumDependsOn = null;
        }
        if (sumDependsOn != null) {
            int i12 = 0;
            for (TravelQuantityCellVO travelQuantityCellVO2 : oldCells) {
                List<TravelQuantityCellVO.CellRule> tags2 = travelQuantityCellVO2.getTags();
                if (!(tags2 instanceof Collection) || !tags2.isEmpty()) {
                    Iterator<T> it3 = tags2.iterator();
                    while (it3.hasNext()) {
                        if (sumDependsOn.contains((TravelQuantityCellVO.CellRule) it3.next())) {
                            currentValue = travelQuantityCellVO2.getCurrentValue();
                            break;
                        }
                    }
                }
                currentValue = 0;
                i12 += currentValue;
            }
            num2 = Integer.valueOf(i12);
        } else {
            num2 = null;
        }
        if (num2 != null && num2.intValue() + valueDiff > maxSumValue) {
            Iterator<T> it4 = alerts.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                if (((TravelPassengersCountSelectorVO.AlertVO) obj).getRestrictionCase() == TravelPassengersCountSelectorVO.AlertVO.RestrictionCase.SUM_DEPENDING_RELATION_SATISFIED) {
                    break;
                }
            }
            TravelPassengersCountSelectorVO.AlertVO alertVO2 = (TravelPassengersCountSelectorVO.AlertVO) obj;
            return new Pair<>(oldCells, alertVO2 != null ? alertVO2.getRestriction() : null);
        }
        if ((modifiedCell.getCurrentValue() == modifiedCell.getMinValue() && valueDiff < 0) || (modifiedCell.getCurrentValue() == modifiedCell.getMaxValue() && valueDiff > 0)) {
            return new Pair<>(oldCells, null);
        }
        int currentValue3 = modifiedCell.getCurrentValue() + valueDiff;
        ArrayList arrayList = new ArrayList();
        List<TravelQuantityCellVO> list = oldCells;
        for (TravelQuantityCellVO travelQuantityCellVO3 : list) {
            int currentValue4 = Intrinsics.d(travelQuantityCellVO3.getId(), modifiedCell.getId()) ? currentValue3 : travelQuantityCellVO3.getCurrentValue();
            int i13 = 0;
            int i14 = 0;
            for (TravelQuantityCellVO travelQuantityCellVO4 : list) {
                int currentValue5 = Intrinsics.d(travelQuantityCellVO4.getId(), modifiedCell.getId()) ? currentValue3 : travelQuantityCellVO4.getCurrentValue();
                Iterator<T> it5 = travelQuantityCellVO3.getDependsOn().iterator();
                while (it5.hasNext()) {
                    if (travelQuantityCellVO4.getTags().contains((TravelQuantityCellVO.CellRule) it5.next())) {
                        i13 += currentValue5;
                    }
                }
                Iterator<T> it6 = travelQuantityCellVO3.getSumDependsOn().iterator();
                while (it6.hasNext()) {
                    if (travelQuantityCellVO4.getTags().contains((TravelQuantityCellVO.CellRule) it6.next())) {
                        i14 += currentValue5;
                    }
                }
            }
            int i15 = (travelQuantityCellVO3.getDependsOn().isEmpty() || currentValue4 <= i13) ? currentValue4 : i13;
            arrayList.add(TravelQuantityCellVO.copy$default(travelQuantityCellVO3, null, null, null, i15, 0, 0, IconButtonV3DTO.copy$default(travelQuantityCellVO3.getMinusButton(), null, null, null, null, Boolean.valueOf(!(i15 > travelQuantityCellVO3.getMinValue())), null, null, null, null, null, null, null, null, null, 16367, null), IconButtonV3DTO.copy$default(travelQuantityCellVO3.getPlusButton(), null, null, null, null, Boolean.valueOf(!(i15 < travelQuantityCellVO3.getMaxValue() && (travelQuantityCellVO3.getDependsOn().isEmpty() || i15 < i13) && (travelQuantityCellVO3.getSumDependsOn().isEmpty() || i14 < maxSumValue))), null, null, null, null, null, null, null, null, null, 16367, null), null, null, null, 1847, null));
        }
        return new Pair<>(arrayList, null);
    }

    @NotNull
    public final P<Action> getActionLiveData() {
        return this._actionLiveData;
    }

    @NotNull
    public final P<UpdateTravelQuantityCells> getCellsUpdateLiveData() {
        return this._cellsUpdateLiveData;
    }

    @NotNull
    public final P<Restriction> getRestrictionLiveData() {
        return this._restrictionLiveData;
    }

    @NotNull
    public final P<UpdateSelectedTravelClass> getTravelClassUpdateLiveData() {
        return this._travelClassUpdateLiveData;
    }

    public final void onBindNewItem(@NotNull TravelPassengersCountSelectorVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        B0 b02 = this.actionJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.actionJob = null;
    }

    public final void onMinusButtonClicked(@NotNull TravelQuantityCellVO cellVo) {
        Intrinsics.checkNotNullParameter(cellVo, "cellVo");
        TravelPassengersCountSelectorVO travelPassengersCountSelectorVO = this.item;
        if (travelPassengersCountSelectorVO == null) {
            return;
        }
        Pair<List<TravelQuantityCellVO>, Restriction> processQuantityCellOperation = processQuantityCellOperation(cellVo, travelPassengersCountSelectorVO.getQuantityCells(), travelPassengersCountSelectorVO.getMaxSumValue(), travelPassengersCountSelectorVO.getAlerts(), -1);
        List<TravelQuantityCellVO> a11 = processQuantityCellOperation.a();
        Restriction b11 = processQuantityCellOperation.b();
        this._cellsUpdateLiveData.setValue(new UpdateTravelQuantityCells(a11));
        if (b11 != null) {
            this._restrictionLiveData.setValue(b11);
        }
    }

    public final void onPlusButtonClicked(@NotNull TravelQuantityCellVO cellVo) {
        Intrinsics.checkNotNullParameter(cellVo, "cellVo");
        TravelPassengersCountSelectorVO travelPassengersCountSelectorVO = this.item;
        if (travelPassengersCountSelectorVO == null) {
            return;
        }
        Pair<List<TravelQuantityCellVO>, Restriction> processQuantityCellOperation = processQuantityCellOperation(cellVo, travelPassengersCountSelectorVO.getQuantityCells(), travelPassengersCountSelectorVO.getMaxSumValue(), travelPassengersCountSelectorVO.getAlerts(), 1);
        List<TravelQuantityCellVO> a11 = processQuantityCellOperation.a();
        Restriction b11 = processQuantityCellOperation.b();
        this._cellsUpdateLiveData.setValue(new UpdateTravelQuantityCells(a11));
        if (b11 != null) {
            this._restrictionLiveData.setValue(b11);
        }
    }

    public final void onTravelClassSelected(@NotNull String newTravelClassId) {
        Intrinsics.checkNotNullParameter(newTravelClassId, "newTravelClassId");
        this._travelClassUpdateLiveData.setValue(new UpdateSelectedTravelClass(newTravelClassId));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[LOOP:1: B:28:0x007b->B:30:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendFormData(@NotNull AtomAction.ComposerAction action) {
        String str;
        int h11;
        Map<String, String> params;
        List<ChipDTO> chips;
        Object obj;
        CommonControlSettings common;
        AtomActionDTO action2;
        Intrinsics.checkNotNullParameter(action, "action");
        TravelPassengersCountSelectorVO travelPassengersCountSelectorVO = this.item;
        if (travelPassengersCountSelectorVO == null) {
            return;
        }
        TravelPassengersCountSelectorVO.TravelClassSelectorVO travelClassSelector = travelPassengersCountSelectorVO.getTravelClassSelector();
        if (travelClassSelector != null && (chips = travelClassSelector.getChips()) != null) {
            Iterator<T> it = chips.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ChipDTO) obj).getState() == ChipState.SELECTED) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ChipDTO chipDTO = (ChipDTO) obj;
            if (chipDTO != null && (common = chipDTO.getCommon()) != null && (action2 = common.getAction()) != null) {
                str = action2.getLink();
                if (str == null) {
                    str = "";
                }
                LinkedHashMap l11 = U.l(new Pair("selectedTravelClass", str));
                List<TravelQuantityCellVO> quantityCells = travelPassengersCountSelectorVO.getQuantityCells();
                h11 = U.h(C7714v.z(quantityCells, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                for (TravelQuantityCellVO travelQuantityCellVO : quantityCells) {
                    Pair pair = new Pair(travelQuantityCellVO.getId(), Integer.valueOf(travelQuantityCellVO.getCurrentValue()));
                    linkedHashMap.put(pair.e(), pair.f());
                }
                Map n11 = U.n(l11, new Pair("values", linkedHashMap));
                params = action.getParams();
                if (params == null) {
                    params = U.c();
                }
                this.actionJob = C10727i.c(x0.a(this), null, null, new TravelPassengersSelectorViewModel$sendFormData$1(this, action, U.m(n11, params), null), 3);
            }
        }
        str = null;
        if (str == null) {
        }
        LinkedHashMap l112 = U.l(new Pair("selectedTravelClass", str));
        List<TravelQuantityCellVO> quantityCells2 = travelPassengersCountSelectorVO.getQuantityCells();
        h11 = U.h(C7714v.z(quantityCells2, 10));
        if (h11 < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h11);
        while (r0.hasNext()) {
        }
        Map n112 = U.n(l112, new Pair("values", linkedHashMap2));
        params = action.getParams();
        if (params == null) {
        }
        this.actionJob = C10727i.c(x0.a(this), null, null, new TravelPassengersSelectorViewModel$sendFormData$1(this, action, U.m(n112, params), null), 3);
    }
}
