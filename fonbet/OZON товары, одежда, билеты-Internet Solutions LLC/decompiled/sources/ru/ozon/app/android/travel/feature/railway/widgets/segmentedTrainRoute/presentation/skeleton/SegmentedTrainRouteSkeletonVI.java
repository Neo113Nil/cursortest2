package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.skeleton;

import Ak.C2436a;
import B6.b;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.data.SegmentedTrainRouteDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI;", "Ll20/c;", "", "id", "", "asyncData", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI$State;", "state", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI$State;)V", "copy", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI$State;)Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI$State;", "getState", "()Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI$State;", "State", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SegmentedTrainRouteSkeletonVI implements c {
    public static final int $stable = AtomAction.$stable;
    private final String asyncData;
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI$State;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$AsyncBehaviorType;", "asyncBehaviorType", "", "hasTransfer", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$AsyncBehaviorType;ZLru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$AsyncBehaviorType;", "getAsyncBehaviorType", "()Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$AsyncBehaviorType;", "Z", "getHasTransfer", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction action;

        @NotNull
        private final SegmentedTrainRouteDTO.AsyncBehaviorType asyncBehaviorType;
        private final boolean hasTransfer;

        public State(@NotNull SegmentedTrainRouteDTO.AsyncBehaviorType asyncBehaviorType, boolean z11, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
            this.asyncBehaviorType = asyncBehaviorType;
            this.hasTransfer = z11;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.asyncBehaviorType == state.asyncBehaviorType && this.hasTransfer == state.hasTransfer && Intrinsics.d(this.action, state.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final SegmentedTrainRouteDTO.AsyncBehaviorType getAsyncBehaviorType() {
            return this.asyncBehaviorType;
        }

        public final boolean getHasTransfer() {
            return this.hasTransfer;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.asyncBehaviorType.hashCode() * 31, 31, this.hasTransfer);
            AtomAction atomAction = this.action;
            return a11 + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            SegmentedTrainRouteDTO.AsyncBehaviorType asyncBehaviorType = this.asyncBehaviorType;
            boolean z11 = this.hasTransfer;
            AtomAction atomAction = this.action;
            StringBuilder sb2 = new StringBuilder("State(asyncBehaviorType=");
            sb2.append(asyncBehaviorType);
            sb2.append(", hasTransfer=");
            sb2.append(z11);
            sb2.append(", action=");
            return b.b(sb2, atomAction, ")");
        }
    }

    public SegmentedTrainRouteSkeletonVI(long j11, String str, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.asyncData = str;
        this.state = state;
    }

    public static /* synthetic */ SegmentedTrainRouteSkeletonVI copy$default(SegmentedTrainRouteSkeletonVI segmentedTrainRouteSkeletonVI, long j11, String str, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = segmentedTrainRouteSkeletonVI.id;
        }
        if ((i11 & 2) != 0) {
            str = segmentedTrainRouteSkeletonVI.asyncData;
        }
        if ((i11 & 4) != 0) {
            state = segmentedTrainRouteSkeletonVI.state;
        }
        return segmentedTrainRouteSkeletonVI.copy(j11, str, state);
    }

    @NotNull
    public final SegmentedTrainRouteSkeletonVI copy(long id2, String asyncData, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new SegmentedTrainRouteSkeletonVI(id2, asyncData, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentedTrainRouteSkeletonVI)) {
            return false;
        }
        SegmentedTrainRouteSkeletonVI segmentedTrainRouteSkeletonVI = (SegmentedTrainRouteSkeletonVI) other;
        return this.id == segmentedTrainRouteSkeletonVI.id && Intrinsics.d(this.asyncData, segmentedTrainRouteSkeletonVI.asyncData) && Intrinsics.d(this.state, segmentedTrainRouteSkeletonVI.state);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.asyncData;
        return this.state.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.asyncData;
        State state = this.state;
        StringBuilder c11 = C2436a.c(j11, "SegmentedTrainRouteSkeletonVI(id=", ", asyncData=", str);
        c11.append(", state=");
        c11.append(state);
        c11.append(")");
        return c11.toString();
    }
}
