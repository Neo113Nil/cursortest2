package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation;

import A00.a;
import Bi.b;
import G.g;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeBlockVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012JX\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b\u0010\u0010)¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LA00/a$J$a;", "", "id", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;", "schemeBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;", "passengersBlock", "", "shouldFetchState", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "emptyState", "", "asyncData", "isUpdatedFromRemote", "<init>", "(JLru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;ZLru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;Ljava/lang/String;Z)V", "copy", "(JLru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;ZLru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;Ljava/lang/String;Z)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;", "getSchemeBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;", "getPassengersBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;", "Z", "getShouldFetchState", "()Z", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "Ljava/lang/String;", "getAsyncData", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FlightSeatsSchemeVO implements c, a.J.InterfaceC0007a {

    @NotNull
    private final String asyncData;
    private final EmptyStateVO emptyState;
    private final long id;
    private final boolean isUpdatedFromRemote;

    @NotNull
    private final FlightSeatsSchemePassengersBlockVO passengersBlock;

    @NotNull
    private final FlightSeatsSchemeBlockVO schemeBlock;
    private final boolean shouldFetchState;

    public FlightSeatsSchemeVO(long j11, @NotNull FlightSeatsSchemeBlockVO schemeBlock, @NotNull FlightSeatsSchemePassengersBlockVO passengersBlock, boolean z11, EmptyStateVO emptyStateVO, @NotNull String asyncData, boolean z12) {
        Intrinsics.checkNotNullParameter(schemeBlock, "schemeBlock");
        Intrinsics.checkNotNullParameter(passengersBlock, "passengersBlock");
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        this.id = j11;
        this.schemeBlock = schemeBlock;
        this.passengersBlock = passengersBlock;
        this.shouldFetchState = z11;
        this.emptyState = emptyStateVO;
        this.asyncData = asyncData;
        this.isUpdatedFromRemote = z12;
    }

    public static /* synthetic */ FlightSeatsSchemeVO copy$default(FlightSeatsSchemeVO flightSeatsSchemeVO, long j11, FlightSeatsSchemeBlockVO flightSeatsSchemeBlockVO, FlightSeatsSchemePassengersBlockVO flightSeatsSchemePassengersBlockVO, boolean z11, EmptyStateVO emptyStateVO, String str, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = flightSeatsSchemeVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            flightSeatsSchemeBlockVO = flightSeatsSchemeVO.schemeBlock;
        }
        FlightSeatsSchemeBlockVO flightSeatsSchemeBlockVO2 = flightSeatsSchemeBlockVO;
        if ((i11 & 4) != 0) {
            flightSeatsSchemePassengersBlockVO = flightSeatsSchemeVO.passengersBlock;
        }
        FlightSeatsSchemePassengersBlockVO flightSeatsSchemePassengersBlockVO2 = flightSeatsSchemePassengersBlockVO;
        if ((i11 & 8) != 0) {
            z11 = flightSeatsSchemeVO.shouldFetchState;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            emptyStateVO = flightSeatsSchemeVO.emptyState;
        }
        return flightSeatsSchemeVO.copy(j12, flightSeatsSchemeBlockVO2, flightSeatsSchemePassengersBlockVO2, z13, emptyStateVO, (i11 & 32) != 0 ? flightSeatsSchemeVO.asyncData : str, (i11 & 64) != 0 ? flightSeatsSchemeVO.isUpdatedFromRemote : z12);
    }

    @NotNull
    public final FlightSeatsSchemeVO copy(long id2, @NotNull FlightSeatsSchemeBlockVO schemeBlock, @NotNull FlightSeatsSchemePassengersBlockVO passengersBlock, boolean shouldFetchState, EmptyStateVO emptyState, @NotNull String asyncData, boolean isUpdatedFromRemote) {
        Intrinsics.checkNotNullParameter(schemeBlock, "schemeBlock");
        Intrinsics.checkNotNullParameter(passengersBlock, "passengersBlock");
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        return new FlightSeatsSchemeVO(id2, schemeBlock, passengersBlock, shouldFetchState, emptyState, asyncData, isUpdatedFromRemote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeVO)) {
            return false;
        }
        FlightSeatsSchemeVO flightSeatsSchemeVO = (FlightSeatsSchemeVO) other;
        return this.id == flightSeatsSchemeVO.id && Intrinsics.d(this.schemeBlock, flightSeatsSchemeVO.schemeBlock) && Intrinsics.d(this.passengersBlock, flightSeatsSchemeVO.passengersBlock) && this.shouldFetchState == flightSeatsSchemeVO.shouldFetchState && Intrinsics.d(this.emptyState, flightSeatsSchemeVO.emptyState) && Intrinsics.d(this.asyncData, flightSeatsSchemeVO.asyncData) && this.isUpdatedFromRemote == flightSeatsSchemeVO.isUpdatedFromRemote;
    }

    @NotNull
    public final String getAsyncData() {
        return this.asyncData;
    }

    public final EmptyStateVO getEmptyState() {
        return this.emptyState;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final FlightSeatsSchemePassengersBlockVO getPassengersBlock() {
        return this.passengersBlock;
    }

    @NotNull
    public final FlightSeatsSchemeBlockVO getSchemeBlock() {
        return this.schemeBlock;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a((this.passengersBlock.hashCode() + ((this.schemeBlock.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31, 31, this.shouldFetchState);
        EmptyStateVO emptyStateVO = this.emptyState;
        return Boolean.hashCode(this.isUpdatedFromRemote) + g.a((a11 + (emptyStateVO == null ? 0 : emptyStateVO.hashCode())) * 31, 31, this.asyncData);
    }

    /* renamed from: isUpdatedFromRemote, reason: from getter */
    public final boolean getIsUpdatedFromRemote() {
        return this.isUpdatedFromRemote;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        FlightSeatsSchemeBlockVO flightSeatsSchemeBlockVO = this.schemeBlock;
        FlightSeatsSchemePassengersBlockVO flightSeatsSchemePassengersBlockVO = this.passengersBlock;
        boolean z11 = this.shouldFetchState;
        EmptyStateVO emptyStateVO = this.emptyState;
        String str = this.asyncData;
        boolean z12 = this.isUpdatedFromRemote;
        StringBuilder sb2 = new StringBuilder("FlightSeatsSchemeVO(id=");
        sb2.append(j11);
        sb2.append(", schemeBlock=");
        sb2.append(flightSeatsSchemeBlockVO);
        sb2.append(", passengersBlock=");
        sb2.append(flightSeatsSchemePassengersBlockVO);
        sb2.append(", shouldFetchState=");
        sb2.append(z11);
        sb2.append(", emptyState=");
        sb2.append(emptyStateVO);
        sb2.append(", asyncData=");
        sb2.append(str);
        return b.f(sb2, ", isUpdatedFromRemote=", z12, ")");
    }

    public /* synthetic */ FlightSeatsSchemeVO(long j11, FlightSeatsSchemeBlockVO flightSeatsSchemeBlockVO, FlightSeatsSchemePassengersBlockVO flightSeatsSchemePassengersBlockVO, boolean z11, EmptyStateVO emptyStateVO, String str, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, flightSeatsSchemeBlockVO, flightSeatsSchemePassengersBlockVO, z11, emptyStateVO, str, (i11 & 64) != 0 ? true : z12);
    }
}
