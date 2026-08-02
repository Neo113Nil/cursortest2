package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton;

import A00.a;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4LoadingVO;

@InterfaceC6346b
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/AviaSearchResultV4LoadingUpdate;", "LA00/a$J$a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "newState", "constructor-impl", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "", "toString-impl", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;Ljava/lang/Object;)Z", "equals", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "getNewState", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4LoadingUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final AviaSearchResultV4LoadingVO.State newState;

    private /* synthetic */ AviaSearchResultV4LoadingUpdate(AviaSearchResultV4LoadingVO.State state) {
        this.newState = state;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AviaSearchResultV4LoadingUpdate m1076boximpl(AviaSearchResultV4LoadingVO.State state) {
        return new AviaSearchResultV4LoadingUpdate(state);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static AviaSearchResultV4LoadingVO.State m1077constructorimpl(@NotNull AviaSearchResultV4LoadingVO.State newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        return newState;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1078equalsimpl(AviaSearchResultV4LoadingVO.State state, Object obj) {
        return (obj instanceof AviaSearchResultV4LoadingUpdate) && Intrinsics.d(state, ((AviaSearchResultV4LoadingUpdate) obj).getNewState());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1079hashCodeimpl(AviaSearchResultV4LoadingVO.State state) {
        return state.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1080toStringimpl(AviaSearchResultV4LoadingVO.State state) {
        return "AviaSearchResultV4LoadingUpdate(newState=" + state + ")";
    }

    public boolean equals(Object obj) {
        return m1078equalsimpl(this.newState, obj);
    }

    public int hashCode() {
        return m1079hashCodeimpl(this.newState);
    }

    public String toString() {
        return m1080toStringimpl(this.newState);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ AviaSearchResultV4LoadingVO.State getNewState() {
        return this.newState;
    }
}
