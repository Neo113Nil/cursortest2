package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.polling;

import E0.C2942q;
import Kk.C3532b;
import Ve.C4598rp;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJB\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "lazyRefreshAction", "firstSkeletonId", "", "isRoomsListEmpty", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO$BehaviorType;", "behaviorType", "<init>", "(JLru/ozon/uni/atoms/af/AtomAction;JZLru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO$BehaviorType;)V", "copy", "(JLru/ozon/uni/atoms/af/AtomAction;JZLru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO$BehaviorType;)Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getLazyRefreshAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getFirstSkeletonId", "Z", "()Z", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO$BehaviorType;", "getBehaviorType", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO$BehaviorType;", "BehaviorType", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursRoomsListV2PollingVO implements c {
    public static final int $stable = AtomAction.$stable;

    @NotNull
    private final BehaviorType behaviorType;
    private final long firstSkeletonId;
    private final long id;
    private final boolean isRoomsListEmpty;

    @NotNull
    private final AtomAction lazyRefreshAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO$BehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "FETCH_STATE", "SHOW_EMPTY_STATE", "REMOVE_SKELETON", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class BehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BehaviorType[] $VALUES;
        public static final BehaviorType FETCH_STATE = new BehaviorType("FETCH_STATE", 0);
        public static final BehaviorType SHOW_EMPTY_STATE = new BehaviorType("SHOW_EMPTY_STATE", 1);
        public static final BehaviorType REMOVE_SKELETON = new BehaviorType("REMOVE_SKELETON", 2);

        private static final /* synthetic */ BehaviorType[] $values() {
            return new BehaviorType[]{FETCH_STATE, SHOW_EMPTY_STATE, REMOVE_SKELETON};
        }

        static {
            BehaviorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BehaviorType(String str, int i11) {
        }

        public static BehaviorType valueOf(String str) {
            return (BehaviorType) Enum.valueOf(BehaviorType.class, str);
        }

        public static BehaviorType[] values() {
            return (BehaviorType[]) $VALUES.clone();
        }
    }

    public ToursRoomsListV2PollingVO(long j11, @NotNull AtomAction lazyRefreshAction, long j12, boolean z11, @NotNull BehaviorType behaviorType) {
        Intrinsics.checkNotNullParameter(lazyRefreshAction, "lazyRefreshAction");
        Intrinsics.checkNotNullParameter(behaviorType, "behaviorType");
        this.id = j11;
        this.lazyRefreshAction = lazyRefreshAction;
        this.firstSkeletonId = j12;
        this.isRoomsListEmpty = z11;
        this.behaviorType = behaviorType;
    }

    public static /* synthetic */ ToursRoomsListV2PollingVO copy$default(ToursRoomsListV2PollingVO toursRoomsListV2PollingVO, long j11, AtomAction atomAction, long j12, boolean z11, BehaviorType behaviorType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = toursRoomsListV2PollingVO.id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            atomAction = toursRoomsListV2PollingVO.lazyRefreshAction;
        }
        AtomAction atomAction2 = atomAction;
        if ((i11 & 4) != 0) {
            j12 = toursRoomsListV2PollingVO.firstSkeletonId;
        }
        long j14 = j12;
        if ((i11 & 8) != 0) {
            z11 = toursRoomsListV2PollingVO.isRoomsListEmpty;
        }
        boolean z12 = z11;
        if ((i11 & 16) != 0) {
            behaviorType = toursRoomsListV2PollingVO.behaviorType;
        }
        return toursRoomsListV2PollingVO.copy(j13, atomAction2, j14, z12, behaviorType);
    }

    @NotNull
    public final ToursRoomsListV2PollingVO copy(long id2, @NotNull AtomAction lazyRefreshAction, long firstSkeletonId, boolean isRoomsListEmpty, @NotNull BehaviorType behaviorType) {
        Intrinsics.checkNotNullParameter(lazyRefreshAction, "lazyRefreshAction");
        Intrinsics.checkNotNullParameter(behaviorType, "behaviorType");
        return new ToursRoomsListV2PollingVO(id2, lazyRefreshAction, firstSkeletonId, isRoomsListEmpty, behaviorType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursRoomsListV2PollingVO)) {
            return false;
        }
        ToursRoomsListV2PollingVO toursRoomsListV2PollingVO = (ToursRoomsListV2PollingVO) other;
        return this.id == toursRoomsListV2PollingVO.id && Intrinsics.d(this.lazyRefreshAction, toursRoomsListV2PollingVO.lazyRefreshAction) && this.firstSkeletonId == toursRoomsListV2PollingVO.firstSkeletonId && this.isRoomsListEmpty == toursRoomsListV2PollingVO.isRoomsListEmpty && this.behaviorType == toursRoomsListV2PollingVO.behaviorType;
    }

    @NotNull
    public final BehaviorType getBehaviorType() {
        return this.behaviorType;
    }

    public final long getFirstSkeletonId() {
        return this.firstSkeletonId;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final AtomAction getLazyRefreshAction() {
        return this.lazyRefreshAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.behaviorType.hashCode() + C3532b.a(Pk0.c.a(C4598rp.a(this.lazyRefreshAction, Long.hashCode(this.id) * 31, 31), 31, this.firstSkeletonId), 31, this.isRoomsListEmpty);
    }

    /* renamed from: isRoomsListEmpty, reason: from getter */
    public final boolean getIsRoomsListEmpty() {
        return this.isRoomsListEmpty;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        AtomAction atomAction = this.lazyRefreshAction;
        long j12 = this.firstSkeletonId;
        boolean z11 = this.isRoomsListEmpty;
        BehaviorType behaviorType = this.behaviorType;
        StringBuilder sb2 = new StringBuilder("ToursRoomsListV2PollingVO(id=");
        sb2.append(j11);
        sb2.append(", lazyRefreshAction=");
        sb2.append(atomAction);
        C2942q.f(sb2, ", firstSkeletonId=", j12, ", isRoomsListEmpty=");
        sb2.append(z11);
        sb2.append(", behaviorType=");
        sb2.append(behaviorType);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ToursRoomsListV2PollingVO(long j11, AtomAction atomAction, long j12, boolean z11, BehaviorType behaviorType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, atomAction, j12, z11, (i11 & 16) != 0 ? BehaviorType.FETCH_STATE : behaviorType);
    }
}
