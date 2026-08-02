package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.data;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.data.PassengersLuggageSelectionDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.PassengersLuggageSelectionVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0010\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u001b\u0010\u0010\u001a\u00020\u0018*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0010\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\r¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;", "<init>", "()V", "state", "extractState", "(Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO;", "toVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO$LuggageDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO;", "(Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO$LuggageDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO$LuggageDTO$TariffDTO;", "", "index", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$TariffVO;", "(Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO$PassengerDTO$LuggageDTO$TariffDTO;I)Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$TariffVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$SkeletonVO;", "getListOfSkeletons", "()Ljava/util/List;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/data/PassengersLuggageSelectionDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PassengersLuggageSelectionMapper implements Function2<PassengersLuggageSelectionDTO, d, List<? extends PassengersLuggageSelectionVO>>, AsyncWidgetStateMapper<PassengersLuggageSelectionDTO, PassengersLuggageSelectionVO.State> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PassengersLuggageSelectionDTO.AsyncBehaviorType.values().length];
            try {
                iArr[PassengersLuggageSelectionDTO.AsyncBehaviorType.FETCH_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PassengersLuggageSelectionDTO.AsyncBehaviorType.REFRESH_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PassengersLuggageSelectionDTO.AsyncBehaviorType.NO_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final PassengersLuggageSelectionVO.State extractState(PassengersLuggageSelectionDTO state) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.getAsyncBehaviorType().ordinal()];
        if (i11 == 1) {
            List<PassengersLuggageSelectionDTO.PassengerDTO> passengers = state.getPassengers();
            ArrayList arrayList = new ArrayList(C7714v.z(passengers, 10));
            Iterator<T> it = passengers.iterator();
            while (it.hasNext()) {
                arrayList.add(toVO((PassengersLuggageSelectionDTO.PassengerDTO) it.next()));
            }
            return new PassengersLuggageSelectionVO.State.FetchState(arrayList, state.getAsyncParams());
        }
        if (i11 == 2) {
            return PassengersLuggageSelectionVO.State.RefreshState.INSTANCE;
        }
        if (i11 != 3) {
            throw new o();
        }
        List<PassengersLuggageSelectionDTO.PassengerDTO> passengers2 = state.getPassengers();
        ArrayList arrayList2 = new ArrayList(C7714v.z(passengers2, 10));
        Iterator<T> it2 = passengers2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toVO((PassengersLuggageSelectionDTO.PassengerDTO) it2.next()));
        }
        return new PassengersLuggageSelectionVO.State.LoadedState(arrayList2);
    }

    private final List<PassengersLuggageSelectionVO.PassengerVO.LuggageVO.SkeletonVO> getListOfSkeletons() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 1; i11 < 5; i11++) {
            arrayList.add(new PassengersLuggageSelectionVO.PassengerVO.LuggageVO.SkeletonVO(i11));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r9 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PassengersLuggageSelectionVO.PassengerVO toVO(PassengersLuggageSelectionDTO.PassengerDTO passengerDTO) {
        TextDTO textDTO;
        PassengersLuggageSelectionVO.PassengerVO.LuggageVO luggageVO;
        boolean z11;
        TextDTO textDTO2;
        boolean z12;
        int id2 = passengerDTO.getId();
        CellDTO cell = passengerDTO.getCell();
        PassengersLuggageSelectionDTO.PassengerDTO.LuggageDTO luggageThere = passengerDTO.getLuggageThere();
        PassengersLuggageSelectionVO.PassengerVO.LuggageVO vo = luggageThere != null ? toVO(luggageThere) : null;
        PassengersLuggageSelectionDTO.PassengerDTO.LuggageDTO luggageBack = passengerDTO.getLuggageBack();
        PassengersLuggageSelectionVO.PassengerVO.LuggageVO vo2 = luggageBack != null ? toVO(luggageBack) : null;
        boolean z13 = false;
        if (passengerDTO.getLuggageThere() != null) {
            textDTO = null;
            luggageVO = vo2;
            z11 = true;
        } else {
            textDTO = null;
            luggageVO = vo2;
            z11 = false;
        }
        if (passengerDTO.getLuggageBack() != null) {
            textDTO2 = textDTO;
            z12 = true;
        } else {
            textDTO2 = textDTO;
            z12 = false;
        }
        PassengersLuggageSelectionDTO.PassengerDTO.LuggageDTO luggageThere2 = passengerDTO.getLuggageThere();
        if ((luggageThere2 != null ? luggageThere2.getTitle() : textDTO2) == null) {
            PassengersLuggageSelectionDTO.PassengerDTO.LuggageDTO luggageBack2 = passengerDTO.getLuggageBack();
            if (luggageBack2 != null) {
                textDTO2 = luggageBack2.getTitle();
            }
        }
        z13 = true;
        return new PassengersLuggageSelectionVO.PassengerVO(id2, cell, vo, luggageVO, z11, z12, z13, passengerDTO.getBonusCardBadge());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PassengersLuggageSelectionVO> invoke(@NotNull PassengersLuggageSelectionDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new PassengersLuggageSelectionVO(widgetInfo.d().hashCode(), state.getTitle(), extractState(state), widgetInfo.c().a()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public PassengersLuggageSelectionVO.State mapAsyncState(@NotNull PassengersLuggageSelectionDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    private final PassengersLuggageSelectionVO.PassengerVO.LuggageVO toVO(PassengersLuggageSelectionDTO.PassengerDTO.LuggageDTO luggageDTO) {
        ?? listOfSkeletons;
        TextDTO title = luggageDTO.getTitle();
        List<PassengersLuggageSelectionDTO.PassengerDTO.LuggageDTO.TariffDTO> tariffs = luggageDTO.getTariffs();
        if (tariffs != null) {
            List<PassengersLuggageSelectionDTO.PassengerDTO.LuggageDTO.TariffDTO> list = tariffs;
            listOfSkeletons = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                listOfSkeletons.add(toVO((PassengersLuggageSelectionDTO.PassengerDTO.LuggageDTO.TariffDTO) obj, i11));
                i11 = i12;
            }
        } else {
            listOfSkeletons = getListOfSkeletons();
        }
        return new PassengersLuggageSelectionVO.PassengerVO.LuggageVO(title, listOfSkeletons);
    }

    private final PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffVO toVO(PassengersLuggageSelectionDTO.PassengerDTO.LuggageDTO.TariffDTO tariffDTO, int i11) {
        return new PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffVO((((Object) tariffDTO.getTitle().getText()) + " " + i11).hashCode(), tariffDTO.getTitle(), tariffDTO.getSubtitle(), tariffDTO.getAspect());
    }
}
