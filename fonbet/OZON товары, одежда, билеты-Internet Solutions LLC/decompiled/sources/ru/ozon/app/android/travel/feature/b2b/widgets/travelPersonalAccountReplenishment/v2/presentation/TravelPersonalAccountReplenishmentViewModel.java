package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import B0.A0;
import He.b;
import Kk.c;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentApi;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentSumDTO;
import ru.ozon.app.android.travel.utils.extensions.StringExtensionsKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001OB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001d¢\u0006\u0004\b\"\u0010 J\u001f\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0#0\u001d¢\u0006\u0004\b$\u0010 J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001d¢\u0006\u0004\b&\u0010 J\u001f\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0#0\u001d¢\u0006\u0004\b'\u0010 J\u0015\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u0010.J+\u00101\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\u0004\b1\u00102JG\u00103\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\u0004\b3\u00104J%\u00108\u001a\u00020\u00142\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\b¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010=R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010?R&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0#0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010?R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010?R&\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0#0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010D\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR0\u0010M\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0Kj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b`L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentApi;", "api", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentMapper;", "mapper", "<init>", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentApi;Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentMapper;)V", "", "position", "upperBound", "validatePosition", "(II)I", "Lxe/M;", "scope", "", "link", "", "", "params", "", "helperPerformAction", "(Lxe/M;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "inputKey", "validateOnlyKey", "amount", "oldParams", "prepareValidationParams", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "Landroidx/lifecycle/P;", "", "progressLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result;", "resultLiveData", "Lkotlin/Pair;", "restoreInputLiveData", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/AccountReplenishmentState;", "inputStateLiveData", "cursorPositionLiveData", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;", "item", "setUp", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;)V", "newInput", "onTagClicked", "(Ljava/lang/String;I)V", "cursorPosition", "onNewInput", "performAction", "(Ljava/lang/String;Ljava/util/Map;)V", "validate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "letterCount", "start", "stop", "fitSelectionExcludingSuffix", "(III)V", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentApi;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentMapper;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lxe/B0;", "actionJob", "Lxe/B0;", "validateJob", "currentInput", "Ljava/lang/String;", "currentCursorPosition", "I", "inputDigitsLimit", "Ljava/lang/Integer;", "currentSelectedPosition", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "tagPositions", "Ljava/util/HashMap;", "Result", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelPersonalAccountReplenishmentViewModel extends w0 {
    private B0 actionJob;

    @NotNull
    private final TravelPersonalAccountReplenishmentApi api;
    private int currentCursorPosition;

    @NotNull
    private String currentInput;
    private Integer currentSelectedPosition;

    @NotNull
    private final SingleLiveEvent<Pair<Integer, Integer>> cursorPositionLiveData;
    private Integer inputDigitsLimit;

    @NotNull
    private final SingleLiveEvent<AccountReplenishmentState> inputStateLiveData;

    @NotNull
    private final TravelPersonalAccountReplenishmentMapper mapper;

    @NotNull
    private final V<Boolean> progressLiveData;

    @NotNull
    private final SingleLiveEvent<Pair<String, Integer>> restoreInputLiveData;

    @NotNull
    private final SingleLiveEvent<Result> resultLiveData;

    @NotNull
    private final HashMap<String, Integer> tagPositions;
    private B0 validateJob;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result;", "", "Error", "InputError", "Success", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result$Error;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result$InputError;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result$Success;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Result {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result$Error;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Result {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return -945858385;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result$InputError;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result;", "", "errors", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrors", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InputError implements Result {

            @NotNull
            private final String errors;

            public InputError(@NotNull String errors) {
                Intrinsics.checkNotNullParameter(errors, "errors");
                this.errors = errors;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InputError) && Intrinsics.d(this.errors, ((InputError) other).errors);
            }

            @NotNull
            public final String getErrors() {
                return this.errors;
            }

            public int hashCode() {
                return this.errors.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("InputError(errors=", this.errors, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result$Success;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements Result {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction action;

            public Success(@NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.action, ((Success) other).action);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("Success(action=", ")", this.action);
            }
        }
    }

    public TravelPersonalAccountReplenishmentViewModel(@NotNull TravelPersonalAccountReplenishmentApi api, @NotNull TravelPersonalAccountReplenishmentMapper mapper) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.api = api;
        this.mapper = mapper;
        this.progressLiveData = new V<>();
        this.resultLiveData = new SingleLiveEvent<>();
        this.restoreInputLiveData = new SingleLiveEvent<>();
        this.inputStateLiveData = new SingleLiveEvent<>();
        this.cursorPositionLiveData = new SingleLiveEvent<>();
        this.currentInput = "";
        this.tagPositions = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[Catch: all -> 0x002f, CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:12:0x002b, B:13:0x0060, B:15:0x0068, B:16:0x0074, B:32:0x003f, B:34:0x0048, B:35:0x004c), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object helperPerformAction(M m11, String str, Map<String, ? extends Object> map, d<? super Unit> dVar) {
        TravelPersonalAccountReplenishmentViewModel$helperPerformAction$1 travelPersonalAccountReplenishmentViewModel$helperPerformAction$1;
        int i11;
        TravelPersonalAccountReplenishmentViewModel travelPersonalAccountReplenishmentViewModel;
        Object a11;
        Throwable b11;
        try {
            if (dVar instanceof TravelPersonalAccountReplenishmentViewModel$helperPerformAction$1) {
                travelPersonalAccountReplenishmentViewModel$helperPerformAction$1 = (TravelPersonalAccountReplenishmentViewModel$helperPerformAction$1) dVar;
                int i12 = travelPersonalAccountReplenishmentViewModel$helperPerformAction$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    travelPersonalAccountReplenishmentViewModel$helperPerformAction$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = travelPersonalAccountReplenishmentViewModel$helperPerformAction$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = travelPersonalAccountReplenishmentViewModel$helperPerformAction$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        try {
                            r.Companion companion = r.INSTANCE;
                            this.progressLiveData.setValue(Boolean.TRUE);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            C10720e0 c10720e0 = C10720e0.f105451a;
                            b bVar = b.f10879b;
                            TravelPersonalAccountReplenishmentViewModel$helperPerformAction$2$result$1 travelPersonalAccountReplenishmentViewModel$helperPerformAction$2$result$1 = new TravelPersonalAccountReplenishmentViewModel$helperPerformAction$2$result$1(this, str, map, null);
                            travelPersonalAccountReplenishmentViewModel$helperPerformAction$1.L$0 = this;
                            travelPersonalAccountReplenishmentViewModel$helperPerformAction$1.L$1 = m11;
                            travelPersonalAccountReplenishmentViewModel$helperPerformAction$1.label = 1;
                            obj = C10727i.f(bVar, travelPersonalAccountReplenishmentViewModel$helperPerformAction$2$result$1, travelPersonalAccountReplenishmentViewModel$helperPerformAction$1);
                            if (obj == aVar) {
                                return aVar;
                            }
                            travelPersonalAccountReplenishmentViewModel = this;
                        } catch (Throwable th3) {
                            th = th3;
                            travelPersonalAccountReplenishmentViewModel = this;
                            r.Companion companion2 = r.INSTANCE;
                            a11 = s.a(th);
                            b11 = r.b(a11);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m11 = (M) travelPersonalAccountReplenishmentViewModel$helperPerformAction$1.L$1;
                        travelPersonalAccountReplenishmentViewModel = (TravelPersonalAccountReplenishmentViewModel) travelPersonalAccountReplenishmentViewModel$helperPerformAction$1.L$0;
                        try {
                            s.b(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            r.Companion companion22 = r.INSTANCE;
                            a11 = s.a(th);
                            b11 = r.b(a11);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                    }
                    Result result = (Result) obj;
                    if (N.f(m11)) {
                        travelPersonalAccountReplenishmentViewModel.progressLiveData.setValue(Boolean.FALSE);
                        travelPersonalAccountReplenishmentViewModel.resultLiveData.setValue(result);
                    }
                    a11 = Unit.f71690a;
                    r.Companion companion3 = r.INSTANCE;
                    b11 = r.b(a11);
                    if (b11 != null) {
                        Lm0.a.f17149a.e(b11);
                        if (N.f(m11)) {
                            travelPersonalAccountReplenishmentViewModel.progressLiveData.setValue(Boolean.FALSE);
                            travelPersonalAccountReplenishmentViewModel.resultLiveData.setValue(Result.Error.INSTANCE);
                        }
                    }
                    return Unit.f71690a;
                }
            }
            if (i11 != 0) {
            }
            Result result2 = (Result) obj;
            if (N.f(m11)) {
            }
            a11 = Unit.f71690a;
            r.Companion companion32 = r.INSTANCE;
            b11 = r.b(a11);
            if (b11 != null) {
            }
            return Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        }
        travelPersonalAccountReplenishmentViewModel$helperPerformAction$1 = new TravelPersonalAccountReplenishmentViewModel$helperPerformAction$1(this, dVar);
        Object obj2 = travelPersonalAccountReplenishmentViewModel$helperPerformAction$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = travelPersonalAccountReplenishmentViewModel$helperPerformAction$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> prepareValidationParams(String inputKey, String validateOnlyKey, String amount, Map<String, String> oldParams) {
        if (oldParams == null) {
            oldParams = U.c();
        }
        HashMap hashMap = new HashMap(oldParams);
        hashMap.put(inputKey, new TravelPersonalAccountReplenishmentSumDTO(amount, false, 2, null));
        hashMap.put(validateOnlyKey, Boolean.FALSE);
        return hashMap;
    }

    private final int validatePosition(int position, int upperBound) {
        if (position < 0) {
            return 0;
        }
        return position > upperBound ? upperBound : position;
    }

    @NotNull
    public final P<Pair<Integer, Integer>> cursorPositionLiveData() {
        return this.cursorPositionLiveData;
    }

    public final void fitSelectionExcludingSuffix(int letterCount, int start, int stop) {
        int max = Math.max(0, letterCount - this.mapper.getCurrencyWithPrefixLength());
        int validatePosition = validatePosition(start, max);
        int validatePosition2 = validatePosition(stop, max);
        this.currentCursorPosition = validatePosition;
        this.cursorPositionLiveData.setValue(new Pair<>(Integer.valueOf(validatePosition), Integer.valueOf(validatePosition2)));
    }

    @NotNull
    public final P<AccountReplenishmentState> inputStateLiveData() {
        return this.inputStateLiveData;
    }

    public final void onNewInput(@NotNull String newInput, int cursorPosition) {
        int i11;
        Intrinsics.checkNotNullParameter(newInput, "newInput");
        if (Intrinsics.d(newInput, this.currentInput)) {
            return;
        }
        String removeNonDigitSymbols = StringExtensionsKt.removeNonDigitSymbols(newInput);
        if (newInput.length() >= this.currentInput.length() || !Intrinsics.d(removeNonDigitSymbols, StringExtensionsKt.removeNonDigitSymbols(this.currentInput))) {
            i11 = 0;
        } else {
            removeNonDigitSymbols = StringExtensionsKt.removeNonDigitSymbols(h.T(cursorPosition - 1, cursorPosition, newInput).toString());
            i11 = 1;
        }
        String removeLeadingZeroes = StringExtensionsKt.removeLeadingZeroes(removeNonDigitSymbols);
        String mapPrice = this.mapper.mapPrice(removeLeadingZeroes, this.inputDigitsLimit);
        if (mapPrice == null || mapPrice.equals(this.currentInput)) {
            this.restoreInputLiveData.setValue(new Pair<>(this.currentInput, Integer.valueOf(this.currentCursorPosition)));
            return;
        }
        String str = this.currentInput;
        this.currentInput = mapPrice;
        Integer num = this.tagPositions.get(removeLeadingZeroes);
        Integer num2 = this.currentSelectedPosition;
        this.currentSelectedPosition = num;
        this.inputStateLiveData.setValue(new AccountReplenishmentState(mapPrice, num2, this.currentSelectedPosition, Math.max(0, ((cursorPosition - (removeNonDigitSymbols.length() == removeLeadingZeroes.length() ? 0 : StringExtensionsKt.countLeadingZeroes(removeNonDigitSymbols))) - i11) + (StringExtensionsKt.countSpaces(mapPrice, 0, Math.max(0, mapPrice.length() - this.mapper.getCurrencyWithPrefixLength())) - StringExtensionsKt.countSpaces(str, 0, Math.max(0, str.length() - this.mapper.getCurrencyWithPrefixLength()))))));
    }

    public final void onTagClicked(@NotNull String newInput, int position) {
        Intrinsics.checkNotNullParameter(newInput, "newInput");
        Integer num = this.currentSelectedPosition;
        if (num != null && position == num.intValue()) {
            return;
        }
        Integer num2 = this.currentSelectedPosition;
        this.currentInput = newInput;
        Integer valueOf = Integer.valueOf(position);
        this.currentSelectedPosition = valueOf;
        this.inputStateLiveData.setValue(new AccountReplenishmentState(newInput, num2, valueOf, Math.max(0, newInput.length() - this.mapper.getCurrencyWithPrefixLength())));
    }

    public final void performAction(@NotNull String link, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(link, "link");
        B0 b02 = this.actionJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.actionJob = C10727i.c(x0.a(this), null, null, new TravelPersonalAccountReplenishmentViewModel$performAction$1(this, link, params, null), 3);
    }

    @NotNull
    public final P<Boolean> progressLiveData() {
        return this.progressLiveData;
    }

    @NotNull
    public final P<Pair<String, Integer>> restoreInputLiveData() {
        return this.restoreInputLiveData;
    }

    @NotNull
    public final P<Result> resultLiveData() {
        return this.resultLiveData;
    }

    public final void setUp(@NotNull TravelPersonalAccountReplenishmentVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentInput = item.getInput().getValue();
        this.currentCursorPosition = item.getInput().getCursorPosition();
        this.inputDigitsLimit = item.getInput().getDigitsLimit();
        this.currentSelectedPosition = item.getSelectedTagPosition();
        this.tagPositions.clear();
        int i11 = 0;
        for (Object obj : item.getInputVariants()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            String text = ((TagV3Atom.TagAtom) obj).getText();
            if (text != null) {
                this.tagPositions.put(StringExtensionsKt.removeNonDigitSymbols(text), Integer.valueOf(i11));
            }
            i11 = i12;
        }
    }

    public final void validate(@NotNull String inputKey, @NotNull String validateOnlyKey, String amount, String link, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(inputKey, "inputKey");
        Intrinsics.checkNotNullParameter(validateOnlyKey, "validateOnlyKey");
        if (amount == null || link == null) {
            return;
        }
        Integer w02 = h.w0(StringExtensionsKt.removeNonDigitSymbols(h.z0(amount).toString()));
        int intValue = w02 != null ? w02.intValue() : 0;
        B0 b02 = this.validateJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.validateJob = C10727i.c(x0.a(this), null, null, new TravelPersonalAccountReplenishmentViewModel$validate$1(this, inputKey, validateOnlyKey, intValue, params, link, null), 3);
    }
}
