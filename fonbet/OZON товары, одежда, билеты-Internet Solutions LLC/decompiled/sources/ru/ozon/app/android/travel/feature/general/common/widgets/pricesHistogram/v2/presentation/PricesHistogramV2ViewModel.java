package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation;

import Ae.C2399j;
import G.g;
import Kk.c;
import Nh.a;
import Sc.InterfaceC4008j;
import Sc.o;
import V.e;
import WZ.t;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2VO;
import ru.ozon.app.android.travel.utils.FlowUtilsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0002mnB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000e\u0010\fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\t¢\u0006\u0004\b\u0013\u0010\fJ\u0015\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\r¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b*\u0010)J\u0015\u0010,\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0018¢\u0006\u0004\b,\u0010\u001cJ\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020-¢\u0006\u0004\b0\u0010/J+\u00104\u001a\u00020\u001a2\u0006\u00101\u001a\u00020-2\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-\u0018\u000102¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\r¢\u0006\u0004\b7\u0010'J\u000f\u00108\u001a\u00020\rH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b:\u0010)J%\u0010?\u001a\u00020\n2\u0006\u0010;\u001a\u00020\r2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001aH\u0002¢\u0006\u0004\bA\u0010BJ-\u0010E\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\r2\u0006\u0010C\u001a\u00020\r2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0DH\u0002¢\u0006\u0004\bE\u0010FJ\u001b\u0010G\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-02H\u0002¢\u0006\u0004\bG\u0010HJ%\u0010K\u001a\u00020\u001a2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010J\u001a\u00020\u001dH\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010NR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010PR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010PR\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010PR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020=0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020=0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010WR\u001e\u0010Y\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010[\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u0016\u0010\\\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0016\u0010e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010]R\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010]R\u001b\u0010l\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010/¨\u0006o"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Ll10/b;)V", "LAe/B0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$NewPosition;", "daysLiveData", "()LAe/B0;", "", "scrollLiveData", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$Action;", "actionLiveData", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingLiveData", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO;", "item", "setup", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO;", "", "isScrollInProgress", "", "setIsScrollInProgress", "(Z)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/FlightDirection;", "getSelectedDirection", "()Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/FlightDirection;", "direction", "getSelectedTokenizedEvent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/FlightDirection;)LWZ/t;", "getSelectedPosition", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/FlightDirection;)I", "newPosition", "changePosition", "(I)V", "changeDirection", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/FlightDirection;)V", "scrollFinished", "isChecked", "onToggleStateChanges", "", "getTotalPrice", "()Ljava/lang/String;", "getFormatDates", "actionName", "", "params", "onFindTicketsClicked", "(Ljava/lang/String;Ljava/util/Map;)V", "tappedPosition", "scrollToPosition", "getCountOfEmptyDays", "()I", "changeChipsState", "position", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$DayVO;", "days", "getNewPosition", "(ILjava/util/List;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$NewPosition;", "sendEventByDirection", "()V", "oldPosition", "", "changeIsSelected", "(IILjava/util/List;)V", "provideRequestBody", "()Ljava/util/Map;", "listOfDays", "flightDirection", "updateVo", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/FlightDirection;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Ll10/b;", "LAe/w0;", "LAe/w0;", "listOfDaysThere", "Ljava/util/List;", "listOfDaysBack", "vo", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO;", "positionThere", "I", "positionBack", "tokenizedEventThere", "LWZ/t;", "tokenizedEventBack", "haveDirectionBack", "Z", "lastTrackedDate", "Ljava/lang/Integer;", "selectedDirection", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/FlightDirection;", "selectedDateThere", "Ljava/lang/String;", "selectedDateBack", "isDirect", "Lxe/B0;", "actionJob", "Lxe/B0;", "datesFormat$delegate", "LSc/j;", "getDatesFormat", "datesFormat", "NewPosition", "Action", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramV2ViewModel extends w0 {
    private B0 actionJob;

    @NotNull
    private final Ae.w0<Action> actionLiveData;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final InterfaceC7851b controller;

    /* renamed from: datesFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j datesFormat;

    @NotNull
    private final Ae.w0<NewPosition> daysLiveData;
    private boolean haveDirectionBack;
    private boolean isDirect;
    private boolean isScrollInProgress;
    private Integer lastTrackedDate;

    @NotNull
    private List<PricesHistogramV2VO.DayVO> listOfDaysBack;

    @NotNull
    private List<PricesHistogramV2VO.DayVO> listOfDaysThere;
    private int positionBack;
    private int positionThere;

    @NotNull
    private final Ae.w0<Integer> scrollLiveData;
    private String selectedDateBack;
    private String selectedDateThere;

    @NotNull
    private FlightDirection selectedDirection;
    private t tokenizedEventBack;
    private t tokenizedEventThere;

    @NotNull
    private final Ae.w0<t> trackingLiveData;
    private PricesHistogramV2VO vo;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$Action;", "", "<init>", "()V", "Error", "Success", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$Action$Success;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 775319205;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$Action$Success;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction atomAction;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull AtomAction atomAction) {
                super(null);
                Intrinsics.checkNotNullParameter(atomAction, "atomAction");
                this.atomAction = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.atomAction, ((Success) other).atomAction);
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
                return c.e("Success(atomAction=", ")", this.atomAction);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u000b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel$NewPosition;", "", "", "position", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$DayVO;", "days", "", "totalPrice", "selectedDates", "", "isDirect", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPosition", "Ljava/util/List;", "getDays", "()Ljava/util/List;", "Ljava/lang/String;", "getTotalPrice", "getSelectedDates", "Z", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewPosition {

        @NotNull
        private final List<PricesHistogramV2VO.DayVO> days;
        private final boolean isDirect;
        private final int position;

        @NotNull
        private final String selectedDates;

        @NotNull
        private final String totalPrice;

        public NewPosition(int i11, @NotNull List<PricesHistogramV2VO.DayVO> days, @NotNull String totalPrice, @NotNull String selectedDates, boolean z11) {
            Intrinsics.checkNotNullParameter(days, "days");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            Intrinsics.checkNotNullParameter(selectedDates, "selectedDates");
            this.position = i11;
            this.days = days;
            this.totalPrice = totalPrice;
            this.selectedDates = selectedDates;
            this.isDirect = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewPosition)) {
                return false;
            }
            NewPosition newPosition = (NewPosition) other;
            return this.position == newPosition.position && Intrinsics.d(this.days, newPosition.days) && Intrinsics.d(this.totalPrice, newPosition.totalPrice) && Intrinsics.d(this.selectedDates, newPosition.selectedDates) && this.isDirect == newPosition.isDirect;
        }

        @NotNull
        public final List<PricesHistogramV2VO.DayVO> getDays() {
            return this.days;
        }

        public final int getPosition() {
            return this.position;
        }

        @NotNull
        public final String getSelectedDates() {
            return this.selectedDates;
        }

        @NotNull
        public final String getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isDirect) + g.a(g.a(g.b(Integer.hashCode(this.position) * 31, 31, this.days), 31, this.totalPrice), 31, this.selectedDates);
        }

        /* renamed from: isDirect, reason: from getter */
        public final boolean getIsDirect() {
            return this.isDirect;
        }

        @NotNull
        public String toString() {
            int i11 = this.position;
            List<PricesHistogramV2VO.DayVO> list = this.days;
            String str = this.totalPrice;
            String str2 = this.selectedDates;
            boolean z11 = this.isDirect;
            StringBuilder sb2 = new StringBuilder("NewPosition(position=");
            sb2.append(i11);
            sb2.append(", days=");
            sb2.append(list);
            sb2.append(", totalPrice=");
            a.h(sb2, str, ", selectedDates=", str2, ", isDirect=");
            return Pk0.a.a(")", sb2, z11);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlightDirection.values().length];
            try {
                iArr[FlightDirection.THERE_FLIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlightDirection.BACK_FLIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PricesHistogramV2ViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull InterfaceC7851b controller) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.actionV2Repository = actionV2Repository;
        this.controller = controller;
        this.daysLiveData = FlowUtilsKt.SingleEventsFlow();
        this.scrollLiveData = FlowUtilsKt.SingleEventsFlow();
        this.actionLiveData = FlowUtilsKt.SingleEventsFlow();
        this.trackingLiveData = FlowUtilsKt.SingleEventsFlow();
        this.listOfDaysThere = new ArrayList();
        this.listOfDaysBack = new ArrayList();
        this.positionThere = -1;
        this.positionBack = -1;
        this.selectedDirection = FlightDirection.THERE_FLIGHT;
        this.datesFormat = LazyUtilsKt.unsafeLazy(PricesHistogramV2ViewModel$datesFormat$2.INSTANCE);
    }

    private final void changeChipsState(FlightDirection direction) {
        ChipDTO tabBack;
        ChipDTO tabThere;
        ChipDTO tabBack2;
        ChipDTO tabThere2;
        int i11 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i11 == 1) {
            PricesHistogramV2VO pricesHistogramV2VO = this.vo;
            ChipDTO copy$default = (pricesHistogramV2VO == null || (tabThere = pricesHistogramV2VO.getTabThere()) == null) ? null : ChipDTO.copy$default(tabThere, null, null, ChipState.SELECTED, null, null, null, null, 123, null);
            PricesHistogramV2VO pricesHistogramV2VO2 = this.vo;
            ChipDTO copy$default2 = (pricesHistogramV2VO2 == null || (tabBack = pricesHistogramV2VO2.getTabBack()) == null) ? null : ChipDTO.copy$default(tabBack, null, null, ChipState.ENABLED, null, null, null, null, 123, null);
            PricesHistogramV2VO pricesHistogramV2VO3 = this.vo;
            this.vo = pricesHistogramV2VO3 != null ? PricesHistogramV2VO.copy$default(pricesHistogramV2VO3, 0L, null, null, copy$default, copy$default2, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, false, null, null, 8388583, null) : null;
            return;
        }
        if (i11 != 2) {
            throw new o();
        }
        PricesHistogramV2VO pricesHistogramV2VO4 = this.vo;
        ChipDTO copy$default3 = (pricesHistogramV2VO4 == null || (tabThere2 = pricesHistogramV2VO4.getTabThere()) == null) ? null : ChipDTO.copy$default(tabThere2, null, null, ChipState.ENABLED, null, null, null, null, 123, null);
        PricesHistogramV2VO pricesHistogramV2VO5 = this.vo;
        ChipDTO copy$default4 = (pricesHistogramV2VO5 == null || (tabBack2 = pricesHistogramV2VO5.getTabBack()) == null) ? null : ChipDTO.copy$default(tabBack2, null, null, ChipState.SELECTED, null, null, null, null, 123, null);
        PricesHistogramV2VO pricesHistogramV2VO6 = this.vo;
        this.vo = pricesHistogramV2VO6 != null ? PricesHistogramV2VO.copy$default(pricesHistogramV2VO6, 0L, null, null, copy$default3, copy$default4, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, false, null, null, 8388583, null) : null;
    }

    private final void changeIsSelected(int newPosition, int oldPosition, List<PricesHistogramV2VO.DayVO> days) {
        PricesHistogramV2VO.DayVO copy;
        PricesHistogramV2VO.DayVO copy2;
        copy = r4.copy((r29 & 1) != 0 ? r4.dayHeight : 0, (r29 & 2) != 0 ? r4.dayHeightDirect : 0, (r29 & 4) != 0 ? r4.number : null, (r29 & 8) != 0 ? r4.date : null, (r29 & 16) != 0 ? r4.title : null, (r29 & 32) != 0 ? r4.isSelected : false, (r29 & 64) != 0 ? r4.priceOrMessage : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r4.priceOrMessageDirect : null, (r29 & 256) != 0 ? r4.price : 0, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r4.priceDirect : 0, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r4.isLowest : false, (r29 & 2048) != 0 ? r4.monthLeft : null, (r29 & 4096) != 0 ? r4.monthRight : null, (r29 & 8192) != 0 ? days.get(oldPosition).daySelectionTracking : null);
        days.set(oldPosition, copy);
        copy2 = r3.copy((r29 & 1) != 0 ? r3.dayHeight : 0, (r29 & 2) != 0 ? r3.dayHeightDirect : 0, (r29 & 4) != 0 ? r3.number : null, (r29 & 8) != 0 ? r3.date : null, (r29 & 16) != 0 ? r3.title : null, (r29 & 32) != 0 ? r3.isSelected : true, (r29 & 64) != 0 ? r3.priceOrMessage : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r3.priceOrMessageDirect : null, (r29 & 256) != 0 ? r3.price : 0, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r3.priceDirect : 0, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r3.isLowest : false, (r29 & 2048) != 0 ? r3.monthLeft : null, (r29 & 4096) != 0 ? r3.monthRight : null, (r29 & 8192) != 0 ? days.get(newPosition).daySelectionTracking : null);
        days.set(newPosition, copy2);
    }

    private final int getCountOfEmptyDays() {
        PricesHistogramV2VO pricesHistogramV2VO = this.vo;
        if (pricesHistogramV2VO != null) {
            return pricesHistogramV2VO.getCountOfEmptyDays();
        }
        return 0;
    }

    private final String getDatesFormat() {
        return (String) this.datesFormat.getValue();
    }

    private final NewPosition getNewPosition(int position, List<PricesHistogramV2VO.DayVO> days) {
        return new NewPosition(position, days, getTotalPrice(), getFormatDates(), this.isDirect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> provideRequestBody() {
        String date = this.listOfDaysThere.get(this.positionThere).getDate();
        if (!this.haveDirectionBack) {
            return U.j(new Pair("there", date), new Pair("isDirect", String.valueOf(this.isDirect)));
        }
        return U.j(new Pair("there", date), new Pair("back", this.listOfDaysBack.get(this.positionBack).getDate()), new Pair("isDirect", String.valueOf(this.isDirect)));
    }

    private final void sendEventByDirection() {
        t daySelectionTracking;
        t daySelectionTracking2;
        Integer num = this.lastTrackedDate;
        int i11 = this.positionThere;
        if (num == null || num.intValue() != i11) {
            Integer num2 = this.lastTrackedDate;
            int i12 = this.positionBack;
            if (num2 == null || num2.intValue() != i12) {
                int i13 = WhenMappings.$EnumSwitchMapping$0[this.selectedDirection.ordinal()];
                if (i13 == 1) {
                    PricesHistogramV2VO.DayVO dayVO = (PricesHistogramV2VO.DayVO) C7714v.Q(this.positionThere, this.listOfDaysThere);
                    if (dayVO != null && (daySelectionTracking = dayVO.getDaySelectionTracking()) != null) {
                        this.trackingLiveData.tryEmit(daySelectionTracking);
                    }
                    this.lastTrackedDate = Integer.valueOf(this.positionThere);
                    return;
                }
                if (i13 != 2) {
                    throw new o();
                }
                PricesHistogramV2VO.DayVO dayVO2 = (PricesHistogramV2VO.DayVO) C7714v.Q(this.positionBack, this.listOfDaysBack);
                if (dayVO2 != null && (daySelectionTracking2 = dayVO2.getDaySelectionTracking()) != null) {
                    this.trackingLiveData.tryEmit(daySelectionTracking2);
                }
                this.lastTrackedDate = Integer.valueOf(this.positionBack);
                return;
            }
        }
        this.lastTrackedDate = null;
    }

    private final void updateVo(List<PricesHistogramV2VO.DayVO> listOfDays, FlightDirection flightDirection) {
        PricesHistogramV2VO pricesHistogramV2VO = null;
        if (flightDirection == FlightDirection.THERE_FLIGHT) {
            PricesHistogramV2VO pricesHistogramV2VO2 = this.vo;
            if (pricesHistogramV2VO2 != null) {
                pricesHistogramV2VO = PricesHistogramV2VO.copy$default(pricesHistogramV2VO2, 0L, null, null, null, null, null, null, null, null, false, null, null, null, listOfDays, null, null, null, null, null, 0, false, null, null, 8380415, null);
            }
        } else {
            PricesHistogramV2VO pricesHistogramV2VO3 = this.vo;
            if (pricesHistogramV2VO3 != null) {
                pricesHistogramV2VO = PricesHistogramV2VO.copy$default(pricesHistogramV2VO3, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, listOfDays, null, null, null, null, 0, false, null, null, 8372223, null);
            }
        }
        this.vo = pricesHistogramV2VO;
    }

    @NotNull
    public final Ae.B0<Action> actionLiveData() {
        return C2399j.a(this.actionLiveData);
    }

    public final void changeDirection(@NotNull FlightDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (direction == this.selectedDirection) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i11 == 1) {
            this.selectedDirection = FlightDirection.THERE_FLIGHT;
            this.scrollLiveData.tryEmit(Integer.valueOf(this.positionThere));
            this.daysLiveData.tryEmit(getNewPosition(this.positionThere, this.listOfDaysThere));
            changeChipsState(direction);
            return;
        }
        if (i11 != 2) {
            throw new o();
        }
        this.selectedDirection = FlightDirection.BACK_FLIGHT;
        this.scrollLiveData.tryEmit(Integer.valueOf(this.positionBack));
        this.daysLiveData.tryEmit(getNewPosition(this.positionBack, this.listOfDaysBack));
        changeChipsState(direction);
    }

    public final void changePosition(int newPosition) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        FlightDirection flightDirection = this.selectedDirection;
        if (flightDirection == FlightDirection.THERE_FLIGHT && (i14 = this.positionThere) != -1 && newPosition != i14) {
            int e11 = h.e(newPosition, getCountOfEmptyDays(), C7714v.P(this.listOfDaysThere) - getCountOfEmptyDays());
            changeIsSelected(e11, this.positionThere, this.listOfDaysThere);
            this.positionThere = e11;
            this.selectedDateThere = this.listOfDaysThere.get(e11).getTitle().getText().toString();
            updateVo(this.listOfDaysThere, this.selectedDirection);
            if (this.haveDirectionBack && (i15 = this.positionThere) > (i16 = this.positionBack)) {
                changeIsSelected(i15, i16, this.listOfDaysBack);
                int i17 = this.positionThere;
                this.positionBack = i17;
                this.selectedDateBack = this.listOfDaysBack.get(i17).getTitle().getText().toString();
                updateVo(this.listOfDaysBack, this.selectedDirection);
            }
            this.daysLiveData.tryEmit(getNewPosition(this.positionThere, this.listOfDaysThere));
            return;
        }
        if (flightDirection != FlightDirection.BACK_FLIGHT || this.positionThere == -1 || (i11 = this.positionBack) == -1 || newPosition == i11) {
            return;
        }
        int e12 = h.e(newPosition, getCountOfEmptyDays(), C7714v.P(this.listOfDaysBack) - getCountOfEmptyDays());
        changeIsSelected(e12, this.positionBack, this.listOfDaysBack);
        this.positionBack = e12;
        this.selectedDateBack = this.listOfDaysBack.get(e12).getTitle().getText().toString();
        updateVo(this.listOfDaysBack, this.selectedDirection);
        if (this.haveDirectionBack && (i12 = this.positionThere) > (i13 = this.positionBack)) {
            changeIsSelected(i13, i12, this.listOfDaysThere);
            int i18 = this.positionBack;
            this.positionThere = i18;
            this.selectedDateThere = this.listOfDaysThere.get(i18).getTitle().getText().toString();
            updateVo(this.listOfDaysThere, this.selectedDirection);
        }
        this.daysLiveData.tryEmit(getNewPosition(this.positionBack, this.listOfDaysBack));
    }

    @NotNull
    public final Ae.B0<NewPosition> daysLiveData() {
        return C2399j.a(this.daysLiveData);
    }

    @NotNull
    public final String getFormatDates() {
        if (this.selectedDateBack != null) {
            return e.b(new Object[]{this.selectedDateThere, this.selectedDateBack}, 2, getDatesFormat(), "format(...)");
        }
        String str = this.selectedDateThere;
        return str == null ? "" : str;
    }

    @NotNull
    public final FlightDirection getSelectedDirection() {
        return this.selectedDirection;
    }

    public final int getSelectedPosition(@NotNull FlightDirection direction) {
        int i11;
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i12 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i12 == 1) {
            i11 = this.positionThere;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            i11 = this.positionBack;
        }
        if (i11 == -1) {
            Lm0.a.f17149a.e("Неправильная позиция в списке дней виджета PricesHistogram для направления " + direction, new Object[0]);
        }
        return i11;
    }

    public final t getSelectedTokenizedEvent(@NotNull FlightDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i11 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i11 == 1) {
            return this.tokenizedEventThere;
        }
        if (i11 == 2) {
            return this.tokenizedEventBack;
        }
        throw new o();
    }

    @NotNull
    public final String getTotalPrice() {
        int i11 = this.positionThere;
        if (i11 != -1 && this.positionBack != -1) {
            PricesHistogramV2VO.DayVO dayVO = this.listOfDaysThere.get(i11);
            PricesHistogramV2VO.DayVO dayVO2 = this.listOfDaysBack.get(this.positionBack);
            int priceDirect = this.isDirect ? dayVO.getPriceDirect() : dayVO.getPrice();
            int priceDirect2 = this.isDirect ? dayVO2.getPriceDirect() : dayVO2.getPrice();
            return (priceDirect == 0 || priceDirect2 == 0) ? "" : String.valueOf(priceDirect + priceDirect2);
        }
        if (i11 == -1 || this.positionBack != -1) {
            return "";
        }
        PricesHistogramV2VO.DayVO dayVO3 = this.listOfDaysThere.get(i11);
        int priceDirect3 = this.isDirect ? dayVO3.getPriceDirect() : dayVO3.getPrice();
        return priceDirect3 == 0 ? "" : String.valueOf(priceDirect3);
    }

    public final void onFindTicketsClicked(@NotNull String actionName, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        if (this.isScrollInProgress) {
            return;
        }
        if (!this.haveDirectionBack || this.positionThere <= this.positionBack) {
            B0 b02 = this.actionJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.actionJob = C10727i.c(x0.a(this), null, null, new PricesHistogramV2ViewModel$onFindTicketsClicked$1(this, params, actionName, null), 3);
        }
    }

    public final void onToggleStateChanges(boolean isChecked) {
        this.isDirect = isChecked;
        this.daysLiveData.tryEmit(this.selectedDirection == FlightDirection.THERE_FLIGHT ? getNewPosition(this.positionThere, this.listOfDaysThere) : getNewPosition(this.positionBack, this.listOfDaysBack));
        PricesHistogramV2VO pricesHistogramV2VO = this.vo;
        this.vo = pricesHistogramV2VO != null ? PricesHistogramV2VO.copy$default(pricesHistogramV2VO, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, isChecked, null, null, 7340031, null) : null;
    }

    public final void scrollFinished(@NotNull FlightDirection direction) {
        int i11;
        Intrinsics.checkNotNullParameter(direction, "direction");
        sendEventByDirection();
        Ae.w0<Integer> w0Var = this.scrollLiveData;
        int i12 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i12 == 1) {
            i11 = this.positionThere;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            i11 = this.positionBack;
        }
        w0Var.tryEmit(Integer.valueOf(i11));
    }

    @NotNull
    public final Ae.B0<Integer> scrollLiveData() {
        return C2399j.a(this.scrollLiveData);
    }

    public final void scrollToPosition(int tappedPosition) {
        int countOfEmptyDays = getCountOfEmptyDays();
        if (tappedPosition > C7714v.P(this.listOfDaysThere) - getCountOfEmptyDays() || countOfEmptyDays > tappedPosition) {
            return;
        }
        this.scrollLiveData.tryEmit(Integer.valueOf(tappedPosition));
    }

    public final void setIsScrollInProgress(boolean isScrollInProgress) {
        this.isScrollInProgress = isScrollInProgress;
    }

    @NotNull
    public final PricesHistogramV2VO setup(@NotNull PricesHistogramV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.vo == null) {
            this.vo = item;
            this.selectedDateThere = item.getSelectedDateThere();
            this.selectedDateBack = item.getSelectedDateBack();
            this.isDirect = item.getIsDirect();
            this.listOfDaysThere.addAll(item.getListDaysThere());
            Iterator<PricesHistogramV2VO.DayVO> it = this.listOfDaysThere.iterator();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (it.next().getIsSelected()) {
                    break;
                }
                i12++;
            }
            this.positionThere = i12;
            this.tokenizedEventThere = item.getTokenizedEventThere();
            if (this.positionThere == -1) {
                LoggerExtKt.sendNonFatal$default(new IndexOutOfBoundsException("Stub!"), "PricesHistogramV2ViewModel positionThere is -1, because don't have isSelected in monthsThere.days. Search settings: " + ((Object) item.getDirection().getText()) + " - " + ((Object) item.getDatesInfo().getText()), null, null, 12, null);
            }
            if (item.getListDaysBack() != null) {
                this.haveDirectionBack = true;
                this.listOfDaysBack.addAll(item.getListDaysBack());
                Iterator<PricesHistogramV2VO.DayVO> it2 = this.listOfDaysBack.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (it2.next().getIsSelected()) {
                        break;
                    }
                    i11++;
                }
                this.positionBack = i11;
                this.tokenizedEventBack = item.getTokenizedEventBack();
                if (this.positionBack == -1) {
                    LoggerExtKt.sendNonFatal$default(new IndexOutOfBoundsException("Stub!"), "PricesHistogramV2ViewModel positionBack is -1, because don't have isSelected in monthsBack.days. Search settings: " + ((Object) item.getDirection().getText()) + " - " + ((Object) item.getDatesInfo().getText()), null, null, 12, null);
                }
            }
        }
        PricesHistogramV2VO pricesHistogramV2VO = this.vo;
        return pricesHistogramV2VO == null ? item : pricesHistogramV2VO;
    }

    @NotNull
    public final Ae.B0<t> trackingLiveData() {
        return C2399j.a(this.trackingLiveData);
    }
}
