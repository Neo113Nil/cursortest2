package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo;

import Ak.C2436a;
import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001fB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "asyncData", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "state", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;)V", "copy", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "getState", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "State", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaSearchResultV4LoadingVO implements c {
    private final String asyncData;
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "", "FetchState", "Refresh", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State$FetchState;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State$Refresh;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State$FetchState;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;", "flights", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "asyncErrorMessage", "", "", "asyncParams", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFlights", "()Ljava/util/List;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "getAsyncErrorMessage", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "Ljava/util/Map;", "getAsyncParams", "()Ljava/util/Map;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FetchState implements State {
            private final EmptyStateVO asyncErrorMessage;
            private final Map<String, String> asyncParams;

            @NotNull
            private final List<AviaSearchResultV4ListItemVO> flights;

            /* JADX WARN: Multi-variable type inference failed */
            public FetchState(@NotNull List<? extends AviaSearchResultV4ListItemVO> flights, EmptyStateVO emptyStateVO, Map<String, String> map) {
                Intrinsics.checkNotNullParameter(flights, "flights");
                this.flights = flights;
                this.asyncErrorMessage = emptyStateVO;
                this.asyncParams = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FetchState)) {
                    return false;
                }
                FetchState fetchState = (FetchState) other;
                return Intrinsics.d(this.flights, fetchState.flights) && Intrinsics.d(this.asyncErrorMessage, fetchState.asyncErrorMessage) && Intrinsics.d(this.asyncParams, fetchState.asyncParams);
            }

            public final EmptyStateVO getAsyncErrorMessage() {
                return this.asyncErrorMessage;
            }

            public final Map<String, String> getAsyncParams() {
                return this.asyncParams;
            }

            @NotNull
            public final List<AviaSearchResultV4ListItemVO> getFlights() {
                return this.flights;
            }

            public int hashCode() {
                int hashCode = this.flights.hashCode() * 31;
                EmptyStateVO emptyStateVO = this.asyncErrorMessage;
                int hashCode2 = (hashCode + (emptyStateVO == null ? 0 : emptyStateVO.hashCode())) * 31;
                Map<String, String> map = this.asyncParams;
                return hashCode2 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                List<AviaSearchResultV4ListItemVO> list = this.flights;
                EmptyStateVO emptyStateVO = this.asyncErrorMessage;
                Map<String, String> map = this.asyncParams;
                StringBuilder sb2 = new StringBuilder("FetchState(flights=");
                sb2.append(list);
                sb2.append(", asyncErrorMessage=");
                sb2.append(emptyStateVO);
                sb2.append(", asyncParams=");
                return P.f(sb2, map, ")");
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State$Refresh;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;", "flights", "Lru/ozon/uni/atoms/af/AtomAction;", "refreshAction", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFlights", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getRefreshAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Refresh implements State {

            @NotNull
            private final List<AviaSearchResultV4ListItemVO> flights;
            private final AtomAction refreshAction;

            /* JADX WARN: Multi-variable type inference failed */
            public Refresh(@NotNull List<? extends AviaSearchResultV4ListItemVO> flights, AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(flights, "flights");
                this.flights = flights;
                this.refreshAction = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Refresh)) {
                    return false;
                }
                Refresh refresh = (Refresh) other;
                return Intrinsics.d(this.flights, refresh.flights) && Intrinsics.d(this.refreshAction, refresh.refreshAction);
            }

            public final AtomAction getRefreshAction() {
                return this.refreshAction;
            }

            public int hashCode() {
                int hashCode = this.flights.hashCode() * 31;
                AtomAction atomAction = this.refreshAction;
                return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
            }

            @NotNull
            public String toString() {
                return "Refresh(flights=" + this.flights + ", refreshAction=" + this.refreshAction + ")";
            }
        }
    }

    public AviaSearchResultV4LoadingVO(long j11, String str, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.asyncData = str;
        this.state = state;
    }

    public static /* synthetic */ AviaSearchResultV4LoadingVO copy$default(AviaSearchResultV4LoadingVO aviaSearchResultV4LoadingVO, long j11, String str, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aviaSearchResultV4LoadingVO.id;
        }
        if ((i11 & 2) != 0) {
            str = aviaSearchResultV4LoadingVO.asyncData;
        }
        if ((i11 & 4) != 0) {
            state = aviaSearchResultV4LoadingVO.state;
        }
        return aviaSearchResultV4LoadingVO.copy(j11, str, state);
    }

    @NotNull
    public final AviaSearchResultV4LoadingVO copy(long id2, String asyncData, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new AviaSearchResultV4LoadingVO(id2, asyncData, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaSearchResultV4LoadingVO)) {
            return false;
        }
        AviaSearchResultV4LoadingVO aviaSearchResultV4LoadingVO = (AviaSearchResultV4LoadingVO) other;
        return this.id == aviaSearchResultV4LoadingVO.id && Intrinsics.d(this.asyncData, aviaSearchResultV4LoadingVO.asyncData) && Intrinsics.d(this.state, aviaSearchResultV4LoadingVO.state);
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
        StringBuilder c11 = C2436a.c(j11, "AviaSearchResultV4LoadingVO(id=", ", asyncData=", str);
        c11.append(", state=");
        c11.append(state);
        c11.append(")");
        return c11.toString();
    }
}
