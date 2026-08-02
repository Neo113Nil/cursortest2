package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation;

import android.os.Parcelable;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.PassengersDirectoryV2VO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010\"R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2ViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "", "splitValueToFrames", "(Ljava/lang/CharSequence;)Ljava/util/List;", "frames", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerListItem;", "getFoundPassengers", "(Ljava/util/List;)Ljava/util/List;", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2ViewModel$Result;", "submitPassengersLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerV2VO;", "passengers", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$StubV2VO;", "stub", "", "bindPassengers", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$StubV2VO;)V", "processInputValue", "(Ljava/lang/CharSequence;)V", "Landroid/os/Parcelable;", "state", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "layoutManagerState", "Landroid/os/Parcelable;", "cachedPassengers", "Ljava/util/List;", "stubList", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "Companion", "Result", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV2ViewModel extends w0 {
    private List<PassengersDirectoryV2VO.PassengerV2VO> cachedPassengers;
    private Parcelable layoutManagerState;
    private List<PassengersDirectoryV2VO.StubV2VO> stubList;

    @NotNull
    private final V<Result> submitPassengersLiveData = new V<>();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2ViewModel$Result;", "", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerListItem;", "passengerList", "Landroid/os/Parcelable;", "layoutManagerState", "<init>", "(Ljava/util/List;Landroid/os/Parcelable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPassengerList", "()Ljava/util/List;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {
        private final Parcelable layoutManagerState;

        @NotNull
        private final List<PassengersDirectoryV2VO.PassengerListItem> passengerList;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(@NotNull List<? extends PassengersDirectoryV2VO.PassengerListItem> passengerList, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(passengerList, "passengerList");
            this.passengerList = passengerList;
            this.layoutManagerState = parcelable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.d(this.passengerList, result.passengerList) && Intrinsics.d(this.layoutManagerState, result.layoutManagerState);
        }

        public final Parcelable getLayoutManagerState() {
            return this.layoutManagerState;
        }

        @NotNull
        public final List<PassengersDirectoryV2VO.PassengerListItem> getPassengerList() {
            return this.passengerList;
        }

        public int hashCode() {
            int hashCode = this.passengerList.hashCode() * 31;
            Parcelable parcelable = this.layoutManagerState;
            return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @NotNull
        public String toString() {
            return "Result(passengerList=" + this.passengerList + ", layoutManagerState=" + this.layoutManagerState + ")";
        }
    }

    private final List<PassengersDirectoryV2VO.PassengerListItem> getFoundPassengers(List<String> frames) {
        List<PassengersDirectoryV2VO.PassengerV2VO> list = this.cachedPassengers;
        if (list == null) {
            Intrinsics.n("cachedPassengers");
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            PassengersDirectoryV2VO.PassengerV2VO passengerV2VO = (PassengersDirectoryV2VO.PassengerV2VO) obj;
            List<String> list2 = frames;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (!h.t(passengerV2VO.getSearchInKeys(), (String) it.next(), true)) {
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            return arrayList;
        }
        List<PassengersDirectoryV2VO.StubV2VO> list3 = this.stubList;
        if (list3 != null) {
            return list3;
        }
        Intrinsics.n("stubList");
        throw null;
    }

    private final List<String> splitValueToFrames(CharSequence value) {
        List m11;
        if (value == null || (m11 = h.m(value, new String[]{" "}, 0, 6)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : m11) {
            if (!h.K((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final void bindPassengers(@NotNull List<PassengersDirectoryV2VO.PassengerV2VO> passengers, @NotNull PassengersDirectoryV2VO.StubV2VO stub) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(stub, "stub");
        this.cachedPassengers = passengers;
        this.stubList = C7714v.a0(stub);
        List<PassengersDirectoryV2VO.PassengerV2VO> list = passengers;
        if (list.isEmpty() && (list = this.stubList) == null) {
            Intrinsics.n("stubList");
            throw null;
        }
        this.submitPassengersLiveData.setValue(new Result(list, this.layoutManagerState));
    }

    public final void processInputValue(CharSequence value) {
        List<PassengersDirectoryV2VO.PassengerListItem> foundPassengers;
        List<String> splitValueToFrames = splitValueToFrames(value);
        V<Result> v11 = this.submitPassengersLiveData;
        if (splitValueToFrames == null) {
            foundPassengers = this.cachedPassengers;
            if (foundPassengers == null) {
                Intrinsics.n("cachedPassengers");
                throw null;
            }
        } else {
            foundPassengers = getFoundPassengers(splitValueToFrames);
        }
        v11.setValue(new Result(foundPassengers, null));
    }

    public final void setLayoutManagerState(Parcelable state) {
        this.layoutManagerState = state;
    }

    @NotNull
    public final P<Result> submitPassengersLiveData() {
        return this.submitPassengersLiveData;
    }
}
