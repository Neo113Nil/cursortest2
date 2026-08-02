package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation;

import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0003J\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "isAnimateItem", "getIsDemoAnimationRequired", "(Z)Z", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormViewModel$UpdateRouteData;", "updateRoutesLiveData", "()Landroidx/lifecycle/P;", "", "resetSwipedPosition", "onAddRouteButtonClicked", "isSwiped", "", "position", "onItemSwiped", "(ZI)V", "swipedPosition", "I", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "isAnimationNotShown", "Z", "isAddRouteButtonClicked", "UpdateRouteData", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaComplexSearchFormViewModel extends w0 {
    private boolean isAddRouteButtonClicked;
    private int swipedPosition = -1;

    @NotNull
    private final SingleLiveEvent<UpdateRouteData> updateRoutesLiveData = new SingleLiveEvent<>();
    private boolean isAnimationNotShown = true;

    public final boolean getIsDemoAnimationRequired(boolean isAnimateItem) {
        if (!isAnimateItem) {
            return false;
        }
        boolean z11 = this.isAnimationNotShown && this.isAddRouteButtonClicked;
        if (z11) {
            this.isAnimationNotShown = false;
        }
        return z11;
    }

    public final void onAddRouteButtonClicked() {
        this.isAddRouteButtonClicked = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onItemSwiped(boolean isSwiped, int position) {
        int i11 = this.swipedPosition;
        int i12 = 2;
        Pair pair = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (i11 == -1) {
            if (isSwiped) {
                this.swipedPosition = position;
                this.updateRoutesLiveData.setValue(new UpdateRouteData(new Pair(Integer.valueOf(position), Boolean.TRUE), pair, i12, objArr3 == true ? 1 : 0));
                return;
            }
            return;
        }
        if (position == i11) {
            if (isSwiped) {
                return;
            }
            this.swipedPosition = -1;
            this.updateRoutesLiveData.setValue(new UpdateRouteData(new Pair(Integer.valueOf(position), Boolean.FALSE), objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0));
            return;
        }
        if (isSwiped) {
            this.swipedPosition = position;
            this.updateRoutesLiveData.setValue(new UpdateRouteData(new Pair(Integer.valueOf(position), Boolean.TRUE), new Pair(Integer.valueOf(i11), Boolean.FALSE)));
        }
    }

    public final void resetSwipedPosition() {
        this.swipedPosition = -1;
    }

    @NotNull
    public final P<UpdateRouteData> updateRoutesLiveData() {
        return this.updateRoutesLiveData;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormViewModel$UpdateRouteData;", "", "Lkotlin/Pair;", "", "", "currentPosition", "previousPosition", "<init>", "(Lkotlin/Pair;Lkotlin/Pair;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Pair;", "getCurrentPosition", "()Lkotlin/Pair;", "getPreviousPosition", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateRouteData {

        @NotNull
        private final Pair<Integer, Boolean> currentPosition;
        private final Pair<Integer, Boolean> previousPosition;

        public UpdateRouteData(@NotNull Pair<Integer, Boolean> currentPosition, Pair<Integer, Boolean> pair) {
            Intrinsics.checkNotNullParameter(currentPosition, "currentPosition");
            this.currentPosition = currentPosition;
            this.previousPosition = pair;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateRouteData)) {
                return false;
            }
            UpdateRouteData updateRouteData = (UpdateRouteData) other;
            return Intrinsics.d(this.currentPosition, updateRouteData.currentPosition) && Intrinsics.d(this.previousPosition, updateRouteData.previousPosition);
        }

        @NotNull
        public final Pair<Integer, Boolean> getCurrentPosition() {
            return this.currentPosition;
        }

        public final Pair<Integer, Boolean> getPreviousPosition() {
            return this.previousPosition;
        }

        public int hashCode() {
            int hashCode = this.currentPosition.hashCode() * 31;
            Pair<Integer, Boolean> pair = this.previousPosition;
            return hashCode + (pair == null ? 0 : pair.hashCode());
        }

        @NotNull
        public String toString() {
            return "UpdateRouteData(currentPosition=" + this.currentPosition + ", previousPosition=" + this.previousPosition + ")";
        }

        public /* synthetic */ UpdateRouteData(Pair pair, Pair pair2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(pair, (i11 & 2) != 0 ? null : pair2);
        }
    }
}
