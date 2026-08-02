package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation;

import A00.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0011\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/UpdateSeatSelect;", "LA00/a$J$a;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;", "newFooter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "newButton", "", "isSeatsLeftVisible", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatVO;", "newSeats", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/Boolean;Ljava/util/List;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;", "getNewFooter", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getNewButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getNewSeats", "()Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class UpdateSeatSelect implements a.J.InterfaceC0007a {
    private final Boolean isSeatsLeftVisible;
    private final ButtonV3Atom.LargeButton newButton;
    private final TravelRailwaySeatSelectFooterVO newFooter;
    private final List<TravelRailwaySeatSelectWithSchemeVO.SeatVO> newSeats;

    public UpdateSeatSelect() {
        this(null, null, null, null, 15, null);
    }

    public final ButtonV3Atom.LargeButton getNewButton() {
        return this.newButton;
    }

    public final TravelRailwaySeatSelectFooterVO getNewFooter() {
        return this.newFooter;
    }

    public final List<TravelRailwaySeatSelectWithSchemeVO.SeatVO> getNewSeats() {
        return this.newSeats;
    }

    /* renamed from: isSeatsLeftVisible, reason: from getter */
    public final Boolean getIsSeatsLeftVisible() {
        return this.isSeatsLeftVisible;
    }

    public UpdateSeatSelect(TravelRailwaySeatSelectFooterVO travelRailwaySeatSelectFooterVO, ButtonV3Atom.LargeButton largeButton, Boolean bool, List<TravelRailwaySeatSelectWithSchemeVO.SeatVO> list) {
        this.newFooter = travelRailwaySeatSelectFooterVO;
        this.newButton = largeButton;
        this.isSeatsLeftVisible = bool;
        this.newSeats = list;
    }

    public /* synthetic */ UpdateSeatSelect(TravelRailwaySeatSelectFooterVO travelRailwaySeatSelectFooterVO, ButtonV3Atom.LargeButton largeButton, Boolean bool, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : travelRailwaySeatSelectFooterVO, (i11 & 2) != 0 ? null : largeButton, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : list);
    }
}
