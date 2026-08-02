package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation;

import A00.a;
import Ak.C2436a;
import G.g;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header.FlightSeatsSchemeV2HeaderBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2BlockVI;
import ru.ozon.app.android.travel.molecules.view.emptyState.v2.EmptyStateV2VO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJD\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\n\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;", "Ll20/c;", "LA00/a$J$a;", "", "id", "", "asyncData", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "emptyState", "", "isEmptyState", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State;", "state", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;ZLru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State;)V", "copy", "(JLjava/lang/String;Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;ZLru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "Z", "()Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State;", "getState", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State;", "State", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeV2VI implements c, a.J.InterfaceC0007a {
    public static final int $stable = EmptyStateV2VO.$stable;

    @NotNull
    private final String asyncData;
    private final EmptyStateV2VO emptyState;
    private final long id;
    private final boolean isEmptyState;

    @NotNull
    private final State state;

    public FlightSeatsSchemeV2VI(long j11, @NotNull String asyncData, EmptyStateV2VO emptyStateV2VO, boolean z11, @NotNull State state) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.asyncData = asyncData;
        this.emptyState = emptyStateV2VO;
        this.isEmptyState = z11;
        this.state = state;
    }

    public static /* synthetic */ FlightSeatsSchemeV2VI copy$default(FlightSeatsSchemeV2VI flightSeatsSchemeV2VI, long j11, String str, EmptyStateV2VO emptyStateV2VO, boolean z11, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = flightSeatsSchemeV2VI.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = flightSeatsSchemeV2VI.asyncData;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            emptyStateV2VO = flightSeatsSchemeV2VI.emptyState;
        }
        EmptyStateV2VO emptyStateV2VO2 = emptyStateV2VO;
        if ((i11 & 8) != 0) {
            z11 = flightSeatsSchemeV2VI.isEmptyState;
        }
        boolean z12 = z11;
        if ((i11 & 16) != 0) {
            state = flightSeatsSchemeV2VI.state;
        }
        return flightSeatsSchemeV2VI.copy(j12, str2, emptyStateV2VO2, z12, state);
    }

    @NotNull
    public final FlightSeatsSchemeV2VI copy(long id2, @NotNull String asyncData, EmptyStateV2VO emptyState, boolean isEmptyState, @NotNull State state) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        Intrinsics.checkNotNullParameter(state, "state");
        return new FlightSeatsSchemeV2VI(id2, asyncData, emptyState, isEmptyState, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeV2VI)) {
            return false;
        }
        FlightSeatsSchemeV2VI flightSeatsSchemeV2VI = (FlightSeatsSchemeV2VI) other;
        return this.id == flightSeatsSchemeV2VI.id && Intrinsics.d(this.asyncData, flightSeatsSchemeV2VI.asyncData) && Intrinsics.d(this.emptyState, flightSeatsSchemeV2VI.emptyState) && this.isEmptyState == flightSeatsSchemeV2VI.isEmptyState && Intrinsics.d(this.state, flightSeatsSchemeV2VI.state);
    }

    @NotNull
    public final String getAsyncData() {
        return this.asyncData;
    }

    public final EmptyStateV2VO getEmptyState() {
        return this.emptyState;
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
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.asyncData);
        EmptyStateV2VO emptyStateV2VO = this.emptyState;
        return this.state.hashCode() + C3532b.a((a11 + (emptyStateV2VO == null ? 0 : emptyStateV2VO.hashCode())) * 31, 31, this.isEmptyState);
    }

    /* renamed from: isEmptyState, reason: from getter */
    public final boolean getIsEmptyState() {
        return this.isEmptyState;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.asyncData;
        EmptyStateV2VO emptyStateV2VO = this.emptyState;
        boolean z11 = this.isEmptyState;
        State state = this.state;
        StringBuilder c11 = C2436a.c(j11, "FlightSeatsSchemeV2VI(id=", ", asyncData=", str);
        c11.append(", emptyState=");
        c11.append(emptyStateV2VO);
        c11.append(", isEmptyState=");
        c11.append(z11);
        c11.append(", state=");
        c11.append(state);
        c11.append(")");
        return c11.toString();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State;", "", "Loading", "Content", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State$Content;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State$Loading;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State$Loading;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;", "footerBlock", "Lru/ozon/uni/atoms/data/text/TextDTO;", "headerTitle", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;", "getFooterBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getHeaderTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading implements State {

            @NotNull
            private final FlightSeatsSchemeV2FooterBlockVI footerBlock;
            private final TextDTO headerTitle;

            public Loading(@NotNull FlightSeatsSchemeV2FooterBlockVI footerBlock, TextDTO textDTO) {
                Intrinsics.checkNotNullParameter(footerBlock, "footerBlock");
                this.footerBlock = footerBlock;
                this.headerTitle = textDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loading)) {
                    return false;
                }
                Loading loading = (Loading) other;
                return Intrinsics.d(this.footerBlock, loading.footerBlock) && Intrinsics.d(this.headerTitle, loading.headerTitle);
            }

            @NotNull
            public final FlightSeatsSchemeV2FooterBlockVI getFooterBlock() {
                return this.footerBlock;
            }

            public final TextDTO getHeaderTitle() {
                return this.headerTitle;
            }

            public int hashCode() {
                int hashCode = this.footerBlock.hashCode() * 31;
                TextDTO textDTO = this.headerTitle;
                return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "Loading(footerBlock=" + this.footerBlock + ", headerTitle=" + this.headerTitle + ")";
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJF\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b\u000b\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State$Content;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2BlockVI;", "schemeBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/FlightSeatsSchemeV2HeaderBlockVI;", "headerBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;", "footerBlock", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "emptyState", "", "isUpdatedFromRemote", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2BlockVI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/FlightSeatsSchemeV2HeaderBlockVI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;Z)V", "copy", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2BlockVI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/FlightSeatsSchemeV2HeaderBlockVI;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;Z)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI$State$Content;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2BlockVI;", "getSchemeBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2BlockVI;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/FlightSeatsSchemeV2HeaderBlockVI;", "getHeaderBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/FlightSeatsSchemeV2HeaderBlockVI;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;", "getFooterBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Content implements State {
            private final EmptyStateV2VO emptyState;

            @NotNull
            private final FlightSeatsSchemeV2FooterBlockVI footerBlock;
            private final FlightSeatsSchemeV2HeaderBlockVI headerBlock;
            private final boolean isUpdatedFromRemote;

            @NotNull
            private final FlightSeatsSchemeV2BlockVI schemeBlock;

            public Content(@NotNull FlightSeatsSchemeV2BlockVI schemeBlock, FlightSeatsSchemeV2HeaderBlockVI flightSeatsSchemeV2HeaderBlockVI, @NotNull FlightSeatsSchemeV2FooterBlockVI footerBlock, EmptyStateV2VO emptyStateV2VO, boolean z11) {
                Intrinsics.checkNotNullParameter(schemeBlock, "schemeBlock");
                Intrinsics.checkNotNullParameter(footerBlock, "footerBlock");
                this.schemeBlock = schemeBlock;
                this.headerBlock = flightSeatsSchemeV2HeaderBlockVI;
                this.footerBlock = footerBlock;
                this.emptyState = emptyStateV2VO;
                this.isUpdatedFromRemote = z11;
            }

            public static /* synthetic */ Content copy$default(Content content, FlightSeatsSchemeV2BlockVI flightSeatsSchemeV2BlockVI, FlightSeatsSchemeV2HeaderBlockVI flightSeatsSchemeV2HeaderBlockVI, FlightSeatsSchemeV2FooterBlockVI flightSeatsSchemeV2FooterBlockVI, EmptyStateV2VO emptyStateV2VO, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    flightSeatsSchemeV2BlockVI = content.schemeBlock;
                }
                if ((i11 & 2) != 0) {
                    flightSeatsSchemeV2HeaderBlockVI = content.headerBlock;
                }
                if ((i11 & 4) != 0) {
                    flightSeatsSchemeV2FooterBlockVI = content.footerBlock;
                }
                if ((i11 & 8) != 0) {
                    emptyStateV2VO = content.emptyState;
                }
                if ((i11 & 16) != 0) {
                    z11 = content.isUpdatedFromRemote;
                }
                boolean z12 = z11;
                FlightSeatsSchemeV2FooterBlockVI flightSeatsSchemeV2FooterBlockVI2 = flightSeatsSchemeV2FooterBlockVI;
                return content.copy(flightSeatsSchemeV2BlockVI, flightSeatsSchemeV2HeaderBlockVI, flightSeatsSchemeV2FooterBlockVI2, emptyStateV2VO, z12);
            }

            @NotNull
            public final Content copy(@NotNull FlightSeatsSchemeV2BlockVI schemeBlock, FlightSeatsSchemeV2HeaderBlockVI headerBlock, @NotNull FlightSeatsSchemeV2FooterBlockVI footerBlock, EmptyStateV2VO emptyState, boolean isUpdatedFromRemote) {
                Intrinsics.checkNotNullParameter(schemeBlock, "schemeBlock");
                Intrinsics.checkNotNullParameter(footerBlock, "footerBlock");
                return new Content(schemeBlock, headerBlock, footerBlock, emptyState, isUpdatedFromRemote);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return Intrinsics.d(this.schemeBlock, content.schemeBlock) && Intrinsics.d(this.headerBlock, content.headerBlock) && Intrinsics.d(this.footerBlock, content.footerBlock) && Intrinsics.d(this.emptyState, content.emptyState) && this.isUpdatedFromRemote == content.isUpdatedFromRemote;
            }

            public final EmptyStateV2VO getEmptyState() {
                return this.emptyState;
            }

            @NotNull
            public final FlightSeatsSchemeV2FooterBlockVI getFooterBlock() {
                return this.footerBlock;
            }

            public final FlightSeatsSchemeV2HeaderBlockVI getHeaderBlock() {
                return this.headerBlock;
            }

            @NotNull
            public final FlightSeatsSchemeV2BlockVI getSchemeBlock() {
                return this.schemeBlock;
            }

            public int hashCode() {
                int hashCode = this.schemeBlock.hashCode() * 31;
                FlightSeatsSchemeV2HeaderBlockVI flightSeatsSchemeV2HeaderBlockVI = this.headerBlock;
                int hashCode2 = (this.footerBlock.hashCode() + ((hashCode + (flightSeatsSchemeV2HeaderBlockVI == null ? 0 : flightSeatsSchemeV2HeaderBlockVI.hashCode())) * 31)) * 31;
                EmptyStateV2VO emptyStateV2VO = this.emptyState;
                return Boolean.hashCode(this.isUpdatedFromRemote) + ((hashCode2 + (emptyStateV2VO != null ? emptyStateV2VO.hashCode() : 0)) * 31);
            }

            /* renamed from: isUpdatedFromRemote, reason: from getter */
            public final boolean getIsUpdatedFromRemote() {
                return this.isUpdatedFromRemote;
            }

            @NotNull
            public String toString() {
                FlightSeatsSchemeV2BlockVI flightSeatsSchemeV2BlockVI = this.schemeBlock;
                FlightSeatsSchemeV2HeaderBlockVI flightSeatsSchemeV2HeaderBlockVI = this.headerBlock;
                FlightSeatsSchemeV2FooterBlockVI flightSeatsSchemeV2FooterBlockVI = this.footerBlock;
                EmptyStateV2VO emptyStateV2VO = this.emptyState;
                boolean z11 = this.isUpdatedFromRemote;
                StringBuilder sb2 = new StringBuilder("Content(schemeBlock=");
                sb2.append(flightSeatsSchemeV2BlockVI);
                sb2.append(", headerBlock=");
                sb2.append(flightSeatsSchemeV2HeaderBlockVI);
                sb2.append(", footerBlock=");
                sb2.append(flightSeatsSchemeV2FooterBlockVI);
                sb2.append(", emptyState=");
                sb2.append(emptyStateV2VO);
                sb2.append(", isUpdatedFromRemote=");
                return Pk0.a.a(")", sb2, z11);
            }

            public /* synthetic */ Content(FlightSeatsSchemeV2BlockVI flightSeatsSchemeV2BlockVI, FlightSeatsSchemeV2HeaderBlockVI flightSeatsSchemeV2HeaderBlockVI, FlightSeatsSchemeV2FooterBlockVI flightSeatsSchemeV2FooterBlockVI, EmptyStateV2VO emptyStateV2VO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(flightSeatsSchemeV2BlockVI, flightSeatsSchemeV2HeaderBlockVI, flightSeatsSchemeV2FooterBlockVI, emptyStateV2VO, (i11 & 16) != 0 ? true : z11);
            }
        }
    }
}
