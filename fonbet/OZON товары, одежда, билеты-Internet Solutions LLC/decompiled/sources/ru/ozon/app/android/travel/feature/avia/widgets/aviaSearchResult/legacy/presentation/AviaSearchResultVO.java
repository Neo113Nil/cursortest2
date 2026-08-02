package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation;

import A00.a;
import Ak.C2436a;
import B3.p;
import B90.C2616s;
import B90.C2618u;
import B90.C2619v;
import Bi.b;
import Bl.C2639a;
import E0.C2942q;
import El.C2971a;
import G.g;
import Kk.C3532b;
import P4.f;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.FlightV3DTO;
import ru.ozon.app.android.travel.molecules.view.banner.BannerVO;
import ru.ozon.app.android.travel.molecules.view.dropDownBanner.DropDownBannerVO;
import ru.ozon.app.android.travel.molecules.view.errorState.ErrorStateVO;
import ru.ozon.app.android.travel.molecules.view.imageBanner.ImageBannerVO;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeVO;
import ru.ozon.app.android.travel.molecules.view.tripRoute.TripRouteVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u00019Bo\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u008a\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b\u0013\u00107R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b\u0014\u00107R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b8\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LA00/a$J$a;", "", "id", "", "stateId", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "resultItems", "timeoutMs", "Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;", "timeoutMsg", "errorMsg", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "pollingAction", "lazyLoadAction", "", "isAllDone", "isBonusPay", "applyCachedBonusPay", "<init>", "(JLjava/lang/String;Ljava/util/List;Ljava/lang/Long;Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZZ)V", "copy", "(JLjava/lang/String;Ljava/util/List;Ljava/lang/Long;Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZZZ)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getStateId", "Ljava/util/List;", "getResultItems", "()Ljava/util/List;", "Ljava/lang/Long;", "getTimeoutMs", "()Ljava/lang/Long;", "Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;", "getTimeoutMsg", "()Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;", "getErrorMsg", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPollingAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getLazyLoadAction", "Z", "()Z", "getApplyCachedBonusPay", "AviaSearchResultItemVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AviaSearchResultVO implements c, a.J.InterfaceC0007a {
    private final boolean applyCachedBonusPay;
    private final ErrorStateVO errorMsg;
    private final long id;
    private final boolean isAllDone;
    private final boolean isBonusPay;

    @NotNull
    private final AtomActionDTO lazyLoadAction;

    @NotNull
    private final AtomActionDTO pollingAction;

    @NotNull
    private final List<AviaSearchResultItemVO> resultItems;

    @NotNull
    private final String stateId;
    private final Long timeoutMs;
    private final ErrorStateVO timeoutMsg;

    public AviaSearchResultVO(long j11, @NotNull String stateId, @NotNull List<AviaSearchResultItemVO> resultItems, Long l11, ErrorStateVO errorStateVO, ErrorStateVO errorStateVO2, @NotNull AtomActionDTO pollingAction, @NotNull AtomActionDTO lazyLoadAction, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        Intrinsics.checkNotNullParameter(resultItems, "resultItems");
        Intrinsics.checkNotNullParameter(pollingAction, "pollingAction");
        Intrinsics.checkNotNullParameter(lazyLoadAction, "lazyLoadAction");
        this.id = j11;
        this.stateId = stateId;
        this.resultItems = resultItems;
        this.timeoutMs = l11;
        this.timeoutMsg = errorStateVO;
        this.errorMsg = errorStateVO2;
        this.pollingAction = pollingAction;
        this.lazyLoadAction = lazyLoadAction;
        this.isAllDone = z11;
        this.isBonusPay = z12;
        this.applyCachedBonusPay = z13;
    }

    public static /* synthetic */ AviaSearchResultVO copy$default(AviaSearchResultVO aviaSearchResultVO, long j11, String str, List list, Long l11, ErrorStateVO errorStateVO, ErrorStateVO errorStateVO2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aviaSearchResultVO.id;
        }
        return aviaSearchResultVO.copy(j11, (i11 & 2) != 0 ? aviaSearchResultVO.stateId : str, (i11 & 4) != 0 ? aviaSearchResultVO.resultItems : list, (i11 & 8) != 0 ? aviaSearchResultVO.timeoutMs : l11, (i11 & 16) != 0 ? aviaSearchResultVO.timeoutMsg : errorStateVO, (i11 & 32) != 0 ? aviaSearchResultVO.errorMsg : errorStateVO2, (i11 & 64) != 0 ? aviaSearchResultVO.pollingAction : atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? aviaSearchResultVO.lazyLoadAction : atomActionDTO2, (i11 & 256) != 0 ? aviaSearchResultVO.isAllDone : z11, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? aviaSearchResultVO.isBonusPay : z12, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? aviaSearchResultVO.applyCachedBonusPay : z13);
    }

    @NotNull
    public final AviaSearchResultVO copy(long id2, @NotNull String stateId, @NotNull List<AviaSearchResultItemVO> resultItems, Long timeoutMs, ErrorStateVO timeoutMsg, ErrorStateVO errorMsg, @NotNull AtomActionDTO pollingAction, @NotNull AtomActionDTO lazyLoadAction, boolean isAllDone, boolean isBonusPay, boolean applyCachedBonusPay) {
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        Intrinsics.checkNotNullParameter(resultItems, "resultItems");
        Intrinsics.checkNotNullParameter(pollingAction, "pollingAction");
        Intrinsics.checkNotNullParameter(lazyLoadAction, "lazyLoadAction");
        return new AviaSearchResultVO(id2, stateId, resultItems, timeoutMs, timeoutMsg, errorMsg, pollingAction, lazyLoadAction, isAllDone, isBonusPay, applyCachedBonusPay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaSearchResultVO)) {
            return false;
        }
        AviaSearchResultVO aviaSearchResultVO = (AviaSearchResultVO) other;
        return this.id == aviaSearchResultVO.id && Intrinsics.d(this.stateId, aviaSearchResultVO.stateId) && Intrinsics.d(this.resultItems, aviaSearchResultVO.resultItems) && Intrinsics.d(this.timeoutMs, aviaSearchResultVO.timeoutMs) && Intrinsics.d(this.timeoutMsg, aviaSearchResultVO.timeoutMsg) && Intrinsics.d(this.errorMsg, aviaSearchResultVO.errorMsg) && Intrinsics.d(this.pollingAction, aviaSearchResultVO.pollingAction) && Intrinsics.d(this.lazyLoadAction, aviaSearchResultVO.lazyLoadAction) && this.isAllDone == aviaSearchResultVO.isAllDone && this.isBonusPay == aviaSearchResultVO.isBonusPay && this.applyCachedBonusPay == aviaSearchResultVO.applyCachedBonusPay;
    }

    public final boolean getApplyCachedBonusPay() {
        return this.applyCachedBonusPay;
    }

    public final ErrorStateVO getErrorMsg() {
        return this.errorMsg;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final AtomActionDTO getLazyLoadAction() {
        return this.lazyLoadAction;
    }

    @NotNull
    public final AtomActionDTO getPollingAction() {
        return this.pollingAction;
    }

    @NotNull
    public final List<AviaSearchResultItemVO> getResultItems() {
        return this.resultItems;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getStateId() {
        return this.stateId;
    }

    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final ErrorStateVO getTimeoutMsg() {
        return this.timeoutMsg;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(g.a(Long.hashCode(this.id) * 31, 31, this.stateId), 31, this.resultItems);
        Long l11 = this.timeoutMs;
        int hashCode = (b11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        ErrorStateVO errorStateVO = this.timeoutMsg;
        int hashCode2 = (hashCode + (errorStateVO == null ? 0 : errorStateVO.hashCode())) * 31;
        ErrorStateVO errorStateVO2 = this.errorMsg;
        return Boolean.hashCode(this.applyCachedBonusPay) + C3532b.a(C3532b.a(Ih.a.b(this.lazyLoadAction, Ih.a.b(this.pollingAction, (hashCode2 + (errorStateVO2 != null ? errorStateVO2.hashCode() : 0)) * 31, 31), 31), 31, this.isAllDone), 31, this.isBonusPay);
    }

    /* renamed from: isAllDone, reason: from getter */
    public final boolean getIsAllDone() {
        return this.isAllDone;
    }

    /* renamed from: isBonusPay, reason: from getter */
    public final boolean getIsBonusPay() {
        return this.isBonusPay;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.stateId;
        List<AviaSearchResultItemVO> list = this.resultItems;
        Long l11 = this.timeoutMs;
        ErrorStateVO errorStateVO = this.timeoutMsg;
        ErrorStateVO errorStateVO2 = this.errorMsg;
        AtomActionDTO atomActionDTO = this.pollingAction;
        AtomActionDTO atomActionDTO2 = this.lazyLoadAction;
        boolean z11 = this.isAllDone;
        boolean z12 = this.isBonusPay;
        boolean z13 = this.applyCachedBonusPay;
        StringBuilder c11 = C2436a.c(j11, "AviaSearchResultVO(id=", ", stateId=", str);
        c11.append(", resultItems=");
        c11.append(list);
        c11.append(", timeoutMs=");
        c11.append(l11);
        c11.append(", timeoutMsg=");
        c11.append(errorStateVO);
        c11.append(", errorMsg=");
        c11.append(errorStateVO2);
        c11.append(", pollingAction=");
        c11.append(atomActionDTO);
        c11.append(", lazyLoadAction=");
        c11.append(atomActionDTO2);
        C2436a.e(", isAllDone=", ", isBonusPay=", c11, z11, z12);
        return b.f(c11, ", applyCachedBonusPay=", z13, ")");
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0006\u0007\b\t\n\u000b\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "", "id", "", "getId", "()J", "BonusToggleItem", "DropDownBannerItem", "ImageBannerItem", "BannerItem", "FlightItemV3", "Flight", "RouteBlockVO", "LuggageTabVO", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BonusToggleItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$DropDownBannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$Flight;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$ImageBannerItem;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public interface AviaSearchResultItemVO {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "", "id", "Lru/ozon/app/android/travel/molecules/view/banner/BannerVO;", "banner", "<init>", "(JLru/ozon/app/android/travel/molecules/view/banner/BannerVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/banner/BannerVO;", "getBanner", "()Lru/ozon/app/android/travel/molecules/view/banner/BannerVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BannerItem implements AviaSearchResultItemVO {
            public static final int $stable = BannerVO.$stable;

            @NotNull
            private final BannerVO banner;
            private final long id;

            public BannerItem(long j11, @NotNull BannerVO banner) {
                Intrinsics.checkNotNullParameter(banner, "banner");
                this.id = j11;
                this.banner = banner;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BannerItem)) {
                    return false;
                }
                BannerItem bannerItem = (BannerItem) other;
                return this.id == bannerItem.id && Intrinsics.d(this.banner, bannerItem.banner);
            }

            @NotNull
            public final BannerVO getBanner() {
                return this.banner;
            }

            @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO.AviaSearchResultItemVO
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return this.banner.hashCode() + (Long.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "BannerItem(id=" + this.id + ", banner=" + this.banner + ")";
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0084\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b\n\u0010+R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b/\u0010.R\u001f\u0010\u000f\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b0\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BonusToggleItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "", "id", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "isBonusPay", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTrackingInfo", "setTrackingInfo", "unsetTrackingInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLWZ/t;LWZ/t;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "copy", "(JLru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLWZ/t;LWZ/t;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BonusToggleItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Z", "()Z", "LWZ/t;", "getViewTrackingInfo", "()LWZ/t;", "getSetTrackingInfo", "getUnsetTrackingInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BonusToggleItem implements AviaSearchResultItemVO {
            private final AtomAction action;

            @NotNull
            private final Icon icon;
            private final long id;
            private final boolean isBonusPay;
            private final t setTrackingInfo;

            @NotNull
            private final TextAtom subtitle;

            @NotNull
            private final TextAtom title;
            private final t unsetTrackingInfo;
            private final t viewTrackingInfo;

            public BonusToggleItem(long j11, @NotNull Icon icon, @NotNull TextAtom title, @NotNull TextAtom subtitle, boolean z11, t tVar, t tVar2, t tVar3, AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.id = j11;
                this.icon = icon;
                this.title = title;
                this.subtitle = subtitle;
                this.isBonusPay = z11;
                this.viewTrackingInfo = tVar;
                this.setTrackingInfo = tVar2;
                this.unsetTrackingInfo = tVar3;
                this.action = atomAction;
            }

            public static /* synthetic */ BonusToggleItem copy$default(BonusToggleItem bonusToggleItem, long j11, Icon icon, TextAtom textAtom, TextAtom textAtom2, boolean z11, t tVar, t tVar2, t tVar3, AtomAction atomAction, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    j11 = bonusToggleItem.id;
                }
                long j12 = j11;
                if ((i11 & 2) != 0) {
                    icon = bonusToggleItem.icon;
                }
                Icon icon2 = icon;
                if ((i11 & 4) != 0) {
                    textAtom = bonusToggleItem.title;
                }
                return bonusToggleItem.copy(j12, icon2, textAtom, (i11 & 8) != 0 ? bonusToggleItem.subtitle : textAtom2, (i11 & 16) != 0 ? bonusToggleItem.isBonusPay : z11, (i11 & 32) != 0 ? bonusToggleItem.viewTrackingInfo : tVar, (i11 & 64) != 0 ? bonusToggleItem.setTrackingInfo : tVar2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? bonusToggleItem.unsetTrackingInfo : tVar3, (i11 & 256) != 0 ? bonusToggleItem.action : atomAction);
            }

            @NotNull
            public final BonusToggleItem copy(long id2, @NotNull Icon icon, @NotNull TextAtom title, @NotNull TextAtom subtitle, boolean isBonusPay, t viewTrackingInfo, t setTrackingInfo, t unsetTrackingInfo, AtomAction action) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new BonusToggleItem(id2, icon, title, subtitle, isBonusPay, viewTrackingInfo, setTrackingInfo, unsetTrackingInfo, action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BonusToggleItem)) {
                    return false;
                }
                BonusToggleItem bonusToggleItem = (BonusToggleItem) other;
                return this.id == bonusToggleItem.id && Intrinsics.d(this.icon, bonusToggleItem.icon) && Intrinsics.d(this.title, bonusToggleItem.title) && Intrinsics.d(this.subtitle, bonusToggleItem.subtitle) && this.isBonusPay == bonusToggleItem.isBonusPay && Intrinsics.d(this.viewTrackingInfo, bonusToggleItem.viewTrackingInfo) && Intrinsics.d(this.setTrackingInfo, bonusToggleItem.setTrackingInfo) && Intrinsics.d(this.unsetTrackingInfo, bonusToggleItem.unsetTrackingInfo) && Intrinsics.d(this.action, bonusToggleItem.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final Icon getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO.AviaSearchResultItemVO
            public long getId() {
                return this.id;
            }

            public final t getSetTrackingInfo() {
                return this.setTrackingInfo;
            }

            @NotNull
            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public final t getUnsetTrackingInfo() {
                return this.unsetTrackingInfo;
            }

            public final t getViewTrackingInfo() {
                return this.viewTrackingInfo;
            }

            public int hashCode() {
                int a11 = C3532b.a(C2619v.b(C2619v.b(Lc.a.a(this.icon, Long.hashCode(this.id) * 31, 31), 31, this.title), 31, this.subtitle), 31, this.isBonusPay);
                t tVar = this.viewTrackingInfo;
                int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                t tVar2 = this.setTrackingInfo;
                int hashCode2 = (hashCode + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
                t tVar3 = this.unsetTrackingInfo;
                int hashCode3 = (hashCode2 + (tVar3 == null ? 0 : tVar3.hashCode())) * 31;
                AtomAction atomAction = this.action;
                return hashCode3 + (atomAction != null ? atomAction.hashCode() : 0);
            }

            /* renamed from: isBonusPay, reason: from getter */
            public final boolean getIsBonusPay() {
                return this.isBonusPay;
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                Icon icon = this.icon;
                TextAtom textAtom = this.title;
                TextAtom textAtom2 = this.subtitle;
                boolean z11 = this.isBonusPay;
                t tVar = this.viewTrackingInfo;
                t tVar2 = this.setTrackingInfo;
                t tVar3 = this.unsetTrackingInfo;
                AtomAction atomAction = this.action;
                StringBuilder sb2 = new StringBuilder("BonusToggleItem(id=");
                sb2.append(j11);
                sb2.append(", icon=");
                sb2.append(icon);
                C2639a.e(", title=", ", subtitle=", sb2, textAtom, textAtom2);
                C2971a.d(sb2, ", isBonusPay=", z11, ", viewTrackingInfo=", tVar);
                p.d(sb2, ", setTrackingInfo=", tVar2, ", unsetTrackingInfo=", tVar3);
                sb2.append(", action=");
                sb2.append(atomAction);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$DropDownBannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "", "id", "Lru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerVO;", "banner", "<init>", "(JLru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerVO;)V", "copy", "(JLru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerVO;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$DropDownBannerItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerVO;", "getBanner", "()Lru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DropDownBannerItem implements AviaSearchResultItemVO {
            public static final int $stable = DropDownBannerVO.$stable;

            @NotNull
            private final DropDownBannerVO banner;
            private final long id;

            public DropDownBannerItem(long j11, @NotNull DropDownBannerVO banner) {
                Intrinsics.checkNotNullParameter(banner, "banner");
                this.id = j11;
                this.banner = banner;
            }

            public static /* synthetic */ DropDownBannerItem copy$default(DropDownBannerItem dropDownBannerItem, long j11, DropDownBannerVO dropDownBannerVO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    j11 = dropDownBannerItem.id;
                }
                if ((i11 & 2) != 0) {
                    dropDownBannerVO = dropDownBannerItem.banner;
                }
                return dropDownBannerItem.copy(j11, dropDownBannerVO);
            }

            @NotNull
            public final DropDownBannerItem copy(long id2, @NotNull DropDownBannerVO banner) {
                Intrinsics.checkNotNullParameter(banner, "banner");
                return new DropDownBannerItem(id2, banner);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DropDownBannerItem)) {
                    return false;
                }
                DropDownBannerItem dropDownBannerItem = (DropDownBannerItem) other;
                return this.id == dropDownBannerItem.id && Intrinsics.d(this.banner, dropDownBannerItem.banner);
            }

            @NotNull
            public final DropDownBannerVO getBanner() {
                return this.banner;
            }

            @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO.AviaSearchResultItemVO
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return this.banner.hashCode() + (Long.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "DropDownBannerItem(id=" + this.id + ", banner=" + this.banner + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$Flight;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "", "isProgressVisible", "()Z", "setProgressVisible", "(Z)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$FlightItemV3;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Flight extends AviaSearchResultItemVO {
            void setProgressVisible(boolean z11);
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$ImageBannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "", "id", "Lru/ozon/app/android/travel/molecules/view/imageBanner/ImageBannerVO;", "banner", "<init>", "(JLru/ozon/app/android/travel/molecules/view/imageBanner/ImageBannerVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/imageBanner/ImageBannerVO;", "getBanner", "()Lru/ozon/app/android/travel/molecules/view/imageBanner/ImageBannerVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageBannerItem implements AviaSearchResultItemVO {
            public static final int $stable = ImageBannerVO.$stable;

            @NotNull
            private final ImageBannerVO banner;
            private final long id;

            public ImageBannerItem(long j11, @NotNull ImageBannerVO banner) {
                Intrinsics.checkNotNullParameter(banner, "banner");
                this.id = j11;
                this.banner = banner;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ImageBannerItem)) {
                    return false;
                }
                ImageBannerItem imageBannerItem = (ImageBannerItem) other;
                return this.id == imageBannerItem.id && Intrinsics.d(this.banner, imageBannerItem.banner);
            }

            @NotNull
            public final ImageBannerVO getBanner() {
                return this.banner;
            }

            @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO.AviaSearchResultItemVO
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return this.banner.hashCode() + (Long.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "ImageBannerItem(id=" + this.id + ", banner=" + this.banner + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$RouteBlockVO;", "", "Lru/ozon/app/android/travel/molecules/view/tripRoute/TripRouteVO;", "route", "", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "badges", "<init>", "(Lru/ozon/app/android/travel/molecules/view/tripRoute/TripRouteVO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/view/tripRoute/TripRouteVO;", "getRoute", "()Lru/ozon/app/android/travel/molecules/view/tripRoute/TripRouteVO;", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RouteBlockVO {
            private final List<InfoBadgeVO> badges;

            @NotNull
            private final TripRouteVO route;

            public RouteBlockVO(@NotNull TripRouteVO route, List<InfoBadgeVO> list) {
                Intrinsics.checkNotNullParameter(route, "route");
                this.route = route;
                this.badges = list;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RouteBlockVO)) {
                    return false;
                }
                RouteBlockVO routeBlockVO = (RouteBlockVO) other;
                return Intrinsics.d(this.route, routeBlockVO.route) && Intrinsics.d(this.badges, routeBlockVO.badges);
            }

            public final List<InfoBadgeVO> getBadges() {
                return this.badges;
            }

            @NotNull
            public final TripRouteVO getRoute() {
                return this.route;
            }

            public int hashCode() {
                int hashCode = this.route.hashCode() * 31;
                List<InfoBadgeVO> list = this.badges;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            @NotNull
            public String toString() {
                return "RouteBlockVO(route=" + this.route + ", badges=" + this.badges + ")";
            }
        }

        long getId();

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u000e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJØ\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\f2\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b/\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b1\u0010!R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b2\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b6\u0010!R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b8\u0010!R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b\u0015\u00105R\u001f\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\bB\u0010!R\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001a\u00103\u001a\u0004\b\u001a\u00105R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\bC\u0010)¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$LuggageTabVO;", "", "", "id", "", "handCarryIcon", "", "handCarryIconTintColor", "luggageIcon", "luggageIconTintColor", "handCarryWeight", "luggageWeight", "", "hasHandCarryCount", "handCarryCount", "hasLuggageCount", "luggageCount", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "isSelected", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "totalPrice", "isShowingProgress", "flightId", "<init>", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLWZ/t;Ljava/lang/String;ZJ)V", "copy", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLWZ/t;Ljava/lang/String;ZJ)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$LuggageTabVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getHandCarryIcon", "Ljava/lang/Integer;", "getHandCarryIconTintColor", "()Ljava/lang/Integer;", "getLuggageIcon", "getLuggageIconTintColor", "getHandCarryWeight", "getLuggageWeight", "Z", "getHasHandCarryCount", "()Z", "getHandCarryCount", "getHasLuggageCount", "getLuggageCount", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "getTotalPrice", "getFlightId", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LuggageTabVO {
            private final AtomActionDTO action;
            private final long flightId;
            private final String handCarryCount;

            @NotNull
            private final String handCarryIcon;
            private final Integer handCarryIconTintColor;

            @NotNull
            private final String handCarryWeight;
            private final boolean hasHandCarryCount;
            private final boolean hasLuggageCount;
            private final long id;
            private final boolean isSelected;
            private final boolean isShowingProgress;
            private final String luggageCount;

            @NotNull
            private final String luggageIcon;
            private final Integer luggageIconTintColor;

            @NotNull
            private final String luggageWeight;

            @NotNull
            private final TextAtom price;
            private final String totalPrice;
            private final t trackingInfo;

            public LuggageTabVO(long j11, @NotNull String handCarryIcon, Integer num, @NotNull String luggageIcon, Integer num2, @NotNull String handCarryWeight, @NotNull String luggageWeight, boolean z11, String str, boolean z12, String str2, @NotNull TextAtom price, AtomActionDTO atomActionDTO, boolean z13, t tVar, String str3, boolean z14, long j12) {
                Intrinsics.checkNotNullParameter(handCarryIcon, "handCarryIcon");
                Intrinsics.checkNotNullParameter(luggageIcon, "luggageIcon");
                Intrinsics.checkNotNullParameter(handCarryWeight, "handCarryWeight");
                Intrinsics.checkNotNullParameter(luggageWeight, "luggageWeight");
                Intrinsics.checkNotNullParameter(price, "price");
                this.id = j11;
                this.handCarryIcon = handCarryIcon;
                this.handCarryIconTintColor = num;
                this.luggageIcon = luggageIcon;
                this.luggageIconTintColor = num2;
                this.handCarryWeight = handCarryWeight;
                this.luggageWeight = luggageWeight;
                this.hasHandCarryCount = z11;
                this.handCarryCount = str;
                this.hasLuggageCount = z12;
                this.luggageCount = str2;
                this.price = price;
                this.action = atomActionDTO;
                this.isSelected = z13;
                this.trackingInfo = tVar;
                this.totalPrice = str3;
                this.isShowingProgress = z14;
                this.flightId = j12;
            }

            public static /* synthetic */ LuggageTabVO copy$default(LuggageTabVO luggageTabVO, long j11, String str, Integer num, String str2, Integer num2, String str3, String str4, boolean z11, String str5, boolean z12, String str6, TextAtom textAtom, AtomActionDTO atomActionDTO, boolean z13, t tVar, String str7, boolean z14, long j12, int i11, Object obj) {
                long j13;
                boolean z15;
                boolean z16;
                long j14 = (i11 & 1) != 0 ? luggageTabVO.id : j11;
                String str8 = (i11 & 2) != 0 ? luggageTabVO.handCarryIcon : str;
                Integer num3 = (i11 & 4) != 0 ? luggageTabVO.handCarryIconTintColor : num;
                String str9 = (i11 & 8) != 0 ? luggageTabVO.luggageIcon : str2;
                Integer num4 = (i11 & 16) != 0 ? luggageTabVO.luggageIconTintColor : num2;
                String str10 = (i11 & 32) != 0 ? luggageTabVO.handCarryWeight : str3;
                String str11 = (i11 & 64) != 0 ? luggageTabVO.luggageWeight : str4;
                boolean z17 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? luggageTabVO.hasHandCarryCount : z11;
                String str12 = (i11 & 256) != 0 ? luggageTabVO.handCarryCount : str5;
                boolean z18 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? luggageTabVO.hasLuggageCount : z12;
                String str13 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? luggageTabVO.luggageCount : str6;
                TextAtom textAtom2 = (i11 & 2048) != 0 ? luggageTabVO.price : textAtom;
                AtomActionDTO atomActionDTO2 = (i11 & 4096) != 0 ? luggageTabVO.action : atomActionDTO;
                long j15 = j14;
                boolean z19 = (i11 & 8192) != 0 ? luggageTabVO.isSelected : z13;
                t tVar2 = (i11 & 16384) != 0 ? luggageTabVO.trackingInfo : tVar;
                String str14 = (i11 & 32768) != 0 ? luggageTabVO.totalPrice : str7;
                boolean z21 = (i11 & 65536) != 0 ? luggageTabVO.isShowingProgress : z14;
                if ((i11 & 131072) != 0) {
                    z16 = z19;
                    z15 = z21;
                    j13 = luggageTabVO.flightId;
                } else {
                    j13 = j12;
                    z15 = z21;
                    z16 = z19;
                }
                return luggageTabVO.copy(j15, str8, num3, str9, num4, str10, str11, z17, str12, z18, str13, textAtom2, atomActionDTO2, z16, tVar2, str14, z15, j13);
            }

            @NotNull
            public final LuggageTabVO copy(long id2, @NotNull String handCarryIcon, Integer handCarryIconTintColor, @NotNull String luggageIcon, Integer luggageIconTintColor, @NotNull String handCarryWeight, @NotNull String luggageWeight, boolean hasHandCarryCount, String handCarryCount, boolean hasLuggageCount, String luggageCount, @NotNull TextAtom price, AtomActionDTO action, boolean isSelected, t trackingInfo, String totalPrice, boolean isShowingProgress, long flightId) {
                Intrinsics.checkNotNullParameter(handCarryIcon, "handCarryIcon");
                Intrinsics.checkNotNullParameter(luggageIcon, "luggageIcon");
                Intrinsics.checkNotNullParameter(handCarryWeight, "handCarryWeight");
                Intrinsics.checkNotNullParameter(luggageWeight, "luggageWeight");
                Intrinsics.checkNotNullParameter(price, "price");
                return new LuggageTabVO(id2, handCarryIcon, handCarryIconTintColor, luggageIcon, luggageIconTintColor, handCarryWeight, luggageWeight, hasHandCarryCount, handCarryCount, hasLuggageCount, luggageCount, price, action, isSelected, trackingInfo, totalPrice, isShowingProgress, flightId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LuggageTabVO)) {
                    return false;
                }
                LuggageTabVO luggageTabVO = (LuggageTabVO) other;
                return this.id == luggageTabVO.id && Intrinsics.d(this.handCarryIcon, luggageTabVO.handCarryIcon) && Intrinsics.d(this.handCarryIconTintColor, luggageTabVO.handCarryIconTintColor) && Intrinsics.d(this.luggageIcon, luggageTabVO.luggageIcon) && Intrinsics.d(this.luggageIconTintColor, luggageTabVO.luggageIconTintColor) && Intrinsics.d(this.handCarryWeight, luggageTabVO.handCarryWeight) && Intrinsics.d(this.luggageWeight, luggageTabVO.luggageWeight) && this.hasHandCarryCount == luggageTabVO.hasHandCarryCount && Intrinsics.d(this.handCarryCount, luggageTabVO.handCarryCount) && this.hasLuggageCount == luggageTabVO.hasLuggageCount && Intrinsics.d(this.luggageCount, luggageTabVO.luggageCount) && Intrinsics.d(this.price, luggageTabVO.price) && Intrinsics.d(this.action, luggageTabVO.action) && this.isSelected == luggageTabVO.isSelected && Intrinsics.d(this.trackingInfo, luggageTabVO.trackingInfo) && Intrinsics.d(this.totalPrice, luggageTabVO.totalPrice) && this.isShowingProgress == luggageTabVO.isShowingProgress && this.flightId == luggageTabVO.flightId;
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final long getFlightId() {
                return this.flightId;
            }

            public final String getHandCarryCount() {
                return this.handCarryCount;
            }

            @NotNull
            public final String getHandCarryIcon() {
                return this.handCarryIcon;
            }

            public final Integer getHandCarryIconTintColor() {
                return this.handCarryIconTintColor;
            }

            @NotNull
            public final String getHandCarryWeight() {
                return this.handCarryWeight;
            }

            public final boolean getHasHandCarryCount() {
                return this.hasHandCarryCount;
            }

            public final boolean getHasLuggageCount() {
                return this.hasLuggageCount;
            }

            public final long getId() {
                return this.id;
            }

            public final String getLuggageCount() {
                return this.luggageCount;
            }

            @NotNull
            public final String getLuggageIcon() {
                return this.luggageIcon;
            }

            public final Integer getLuggageIconTintColor() {
                return this.luggageIconTintColor;
            }

            @NotNull
            public final String getLuggageWeight() {
                return this.luggageWeight;
            }

            @NotNull
            public final TextAtom getPrice() {
                return this.price;
            }

            public final String getTotalPrice() {
                return this.totalPrice;
            }

            public final t getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.handCarryIcon);
                Integer num = this.handCarryIconTintColor;
                int a12 = g.a((a11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.luggageIcon);
                Integer num2 = this.luggageIconTintColor;
                int a13 = C3532b.a(g.a(g.a((a12 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.handCarryWeight), 31, this.luggageWeight), 31, this.hasHandCarryCount);
                String str = this.handCarryCount;
                int a14 = C3532b.a((a13 + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasLuggageCount);
                String str2 = this.luggageCount;
                int b11 = C2619v.b((a14 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.price);
                AtomActionDTO atomActionDTO = this.action;
                int a15 = C3532b.a((b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.isSelected);
                t tVar = this.trackingInfo;
                int hashCode = (a15 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                String str3 = this.totalPrice;
                return Long.hashCode(this.flightId) + C3532b.a((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.isShowingProgress);
            }

            /* renamed from: isSelected, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: isShowingProgress, reason: from getter */
            public final boolean getIsShowingProgress() {
                return this.isShowingProgress;
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                String str = this.handCarryIcon;
                Integer num = this.handCarryIconTintColor;
                String str2 = this.luggageIcon;
                Integer num2 = this.luggageIconTintColor;
                String str3 = this.handCarryWeight;
                String str4 = this.luggageWeight;
                boolean z11 = this.hasHandCarryCount;
                String str5 = this.handCarryCount;
                boolean z12 = this.hasLuggageCount;
                String str6 = this.luggageCount;
                TextAtom textAtom = this.price;
                AtomActionDTO atomActionDTO = this.action;
                boolean z13 = this.isSelected;
                t tVar = this.trackingInfo;
                String str7 = this.totalPrice;
                boolean z14 = this.isShowingProgress;
                long j12 = this.flightId;
                StringBuilder c11 = C2436a.c(j11, "LuggageTabVO(id=", ", handCarryIcon=", str);
                c11.append(", handCarryIconTintColor=");
                c11.append(num);
                c11.append(", luggageIcon=");
                c11.append(str2);
                c11.append(", luggageIconTintColor=");
                c11.append(num2);
                c11.append(", handCarryWeight=");
                c11.append(str3);
                D40.a.g(", luggageWeight=", str4, ", hasHandCarryCount=", c11, z11);
                D40.a.g(", handCarryCount=", str5, ", hasLuggageCount=", c11, z12);
                c11.append(", luggageCount=");
                c11.append(str6);
                c11.append(", price=");
                c11.append(textAtom);
                c11.append(", action=");
                c11.append(atomActionDTO);
                c11.append(", isSelected=");
                c11.append(z13);
                c11.append(", trackingInfo=");
                c11.append(tVar);
                c11.append(", totalPrice=");
                c11.append(str7);
                c11.append(", isShowingProgress=");
                c11.append(z14);
                c11.append(", flightId=");
                return f.a(j12, ")", c11);
            }

            public /* synthetic */ LuggageTabVO(long j11, String str, Integer num, String str2, Integer num2, String str3, String str4, boolean z11, String str5, boolean z12, String str6, TextAtom textAtom, AtomActionDTO atomActionDTO, boolean z13, t tVar, String str7, boolean z14, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, str, num, str2, num2, str3, str4, z11, str5, z12, str6, textAtom, atomActionDTO, z13, tVar, str7, (i11 & 65536) != 0 ? false : z14, j12);
            }
        }

        @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\u000e\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#\u0012\b\b\u0002\u0010%\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u0098\u0002\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00042\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f2\u0010\b\u0002\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#2\b\b\u0002\u0010%\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u00106\u001a\u0004\b\u0005\u00107\"\u0004\b8\u00109R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b:\u00105R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b\f\u00107R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bK\u0010JR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\bL\u00107R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\bM\u0010=R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010N\u001a\u0004\bO\u0010+R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010N\u001a\u0004\bP\u0010+R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001d\u0010Q\u001a\u0004\bT\u0010SR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u00106\u001a\u0004\b\u001e\u00107R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010U\u001a\u0004\bV\u0010WR\u0019\u0010!\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010U\u001a\u0004\bX\u0010WR\u001f\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#8\u0006¢\u0006\f\n\u0004\b$\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u00106\u001a\u0004\b%\u00107¨\u0006\\"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$FlightItemV3;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$Flight;", "", "id", "", "isProgressVisible", "widgetId", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$RouteBlockVO;", "routeBlocks", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$LuggageTabVO;", "luggage", "isLuggageVisible", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;", "simplePrice", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;", "bonusPrice", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "remainingTickets", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "smallButton", "bonusSmallButton", "areRouteBadgesVisible", "Lru/ozon/uni/atoms/data/badge/Badge;", "routeBadges", "", "borderColor", "bonusBackgroundColor", "premiumBadge", "bonusPremiumBadge", "isPremiumBadgeVisible", "Lru/ozon/uni/atoms/af/AtomAction;", "cardClickAction", "bonusCardClickAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTrackingInfo", "isBonusPay", "<init>", "(JZJLjava/util/List;Ljava/util/List;ZLru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/badge/Badge;ZLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Z)V", "copy", "(JZJLjava/util/List;Ljava/util/List;ZLru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/badge/Badge;ZLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Z)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$FlightItemV3;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "setProgressVisible", "(Z)V", "getWidgetId", "Ljava/util/List;", "getRouteBlocks", "()Ljava/util/List;", "getLuggage", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;", "getSimplePrice", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;", "getBonusPrice", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRemainingTickets", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getSmallButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getBonusSmallButton", "getAreRouteBadgesVisible", "getRouteBadges", "Ljava/lang/String;", "getBorderColor", "getBonusBackgroundColor", "Lru/ozon/uni/atoms/data/badge/Badge;", "getPremiumBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getBonusPremiumBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "getCardClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getBonusCardClickAction", "LWZ/t;", "getViewTrackingInfo", "()LWZ/t;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FlightItemV3 implements Flight {
            private final boolean areRouteBadgesVisible;
            private final String bonusBackgroundColor;
            private final AtomAction bonusCardClickAction;
            private final Badge bonusPremiumBadge;
            private final FlightV3DTO.BonusPrice bonusPrice;
            private final ButtonV3Atom.SmallButton bonusSmallButton;
            private final String borderColor;
            private final AtomAction cardClickAction;
            private final long id;
            private final boolean isBonusPay;
            private final boolean isLuggageVisible;
            private final boolean isPremiumBadgeVisible;
            private boolean isProgressVisible;

            @NotNull
            private final List<LuggageTabVO> luggage;
            private final Badge premiumBadge;
            private final TextAtom remainingTickets;

            @NotNull
            private final List<Badge> routeBadges;

            @NotNull
            private final List<RouteBlockVO> routeBlocks;

            @NotNull
            private final FlightV3DTO.SimplePrice simplePrice;

            @NotNull
            private final ButtonV3Atom.SmallButton smallButton;
            private final t viewTrackingInfo;
            private final long widgetId;

            public FlightItemV3(long j11, boolean z11, long j12, @NotNull List<RouteBlockVO> routeBlocks, @NotNull List<LuggageTabVO> luggage, boolean z12, @NotNull FlightV3DTO.SimplePrice simplePrice, FlightV3DTO.BonusPrice bonusPrice, TextAtom textAtom, @NotNull ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton smallButton2, boolean z13, @NotNull List<Badge> routeBadges, String str, String str2, Badge badge, Badge badge2, boolean z14, AtomAction atomAction, AtomAction atomAction2, t tVar, boolean z15) {
                Intrinsics.checkNotNullParameter(routeBlocks, "routeBlocks");
                Intrinsics.checkNotNullParameter(luggage, "luggage");
                Intrinsics.checkNotNullParameter(simplePrice, "simplePrice");
                Intrinsics.checkNotNullParameter(smallButton, "smallButton");
                Intrinsics.checkNotNullParameter(routeBadges, "routeBadges");
                this.id = j11;
                this.isProgressVisible = z11;
                this.widgetId = j12;
                this.routeBlocks = routeBlocks;
                this.luggage = luggage;
                this.isLuggageVisible = z12;
                this.simplePrice = simplePrice;
                this.bonusPrice = bonusPrice;
                this.remainingTickets = textAtom;
                this.smallButton = smallButton;
                this.bonusSmallButton = smallButton2;
                this.areRouteBadgesVisible = z13;
                this.routeBadges = routeBadges;
                this.borderColor = str;
                this.bonusBackgroundColor = str2;
                this.premiumBadge = badge;
                this.bonusPremiumBadge = badge2;
                this.isPremiumBadgeVisible = z14;
                this.cardClickAction = atomAction;
                this.bonusCardClickAction = atomAction2;
                this.viewTrackingInfo = tVar;
                this.isBonusPay = z15;
            }

            public static /* synthetic */ FlightItemV3 copy$default(FlightItemV3 flightItemV3, long j11, boolean z11, long j12, List list, List list2, boolean z12, FlightV3DTO.SimplePrice simplePrice, FlightV3DTO.BonusPrice bonusPrice, TextAtom textAtom, ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton smallButton2, boolean z13, List list3, String str, String str2, Badge badge, Badge badge2, boolean z14, AtomAction atomAction, AtomAction atomAction2, t tVar, boolean z15, int i11, Object obj) {
                boolean z16;
                t tVar2;
                long j13 = (i11 & 1) != 0 ? flightItemV3.id : j11;
                boolean z17 = (i11 & 2) != 0 ? flightItemV3.isProgressVisible : z11;
                long j14 = (i11 & 4) != 0 ? flightItemV3.widgetId : j12;
                List list4 = (i11 & 8) != 0 ? flightItemV3.routeBlocks : list;
                List list5 = (i11 & 16) != 0 ? flightItemV3.luggage : list2;
                boolean z18 = (i11 & 32) != 0 ? flightItemV3.isLuggageVisible : z12;
                FlightV3DTO.SimplePrice simplePrice2 = (i11 & 64) != 0 ? flightItemV3.simplePrice : simplePrice;
                FlightV3DTO.BonusPrice bonusPrice2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? flightItemV3.bonusPrice : bonusPrice;
                TextAtom textAtom2 = (i11 & 256) != 0 ? flightItemV3.remainingTickets : textAtom;
                ButtonV3Atom.SmallButton smallButton3 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? flightItemV3.smallButton : smallButton;
                ButtonV3Atom.SmallButton smallButton4 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? flightItemV3.bonusSmallButton : smallButton2;
                boolean z19 = (i11 & 2048) != 0 ? flightItemV3.areRouteBadgesVisible : z13;
                long j15 = j13;
                List list6 = (i11 & 4096) != 0 ? flightItemV3.routeBadges : list3;
                String str3 = (i11 & 8192) != 0 ? flightItemV3.borderColor : str;
                List list7 = list6;
                String str4 = (i11 & 16384) != 0 ? flightItemV3.bonusBackgroundColor : str2;
                Badge badge3 = (i11 & 32768) != 0 ? flightItemV3.premiumBadge : badge;
                Badge badge4 = (i11 & 65536) != 0 ? flightItemV3.bonusPremiumBadge : badge2;
                boolean z21 = (i11 & 131072) != 0 ? flightItemV3.isPremiumBadgeVisible : z14;
                AtomAction atomAction3 = (i11 & 262144) != 0 ? flightItemV3.cardClickAction : atomAction;
                AtomAction atomAction4 = (i11 & 524288) != 0 ? flightItemV3.bonusCardClickAction : atomAction2;
                t tVar3 = (i11 & 1048576) != 0 ? flightItemV3.viewTrackingInfo : tVar;
                if ((i11 & 2097152) != 0) {
                    tVar2 = tVar3;
                    z16 = flightItemV3.isBonusPay;
                } else {
                    z16 = z15;
                    tVar2 = tVar3;
                }
                return flightItemV3.copy(j15, z17, j14, list4, list5, z18, simplePrice2, bonusPrice2, textAtom2, smallButton3, smallButton4, z19, list7, str3, str4, badge3, badge4, z21, atomAction3, atomAction4, tVar2, z16);
            }

            @NotNull
            public final FlightItemV3 copy(long id2, boolean isProgressVisible, long widgetId, @NotNull List<RouteBlockVO> routeBlocks, @NotNull List<LuggageTabVO> luggage, boolean isLuggageVisible, @NotNull FlightV3DTO.SimplePrice simplePrice, FlightV3DTO.BonusPrice bonusPrice, TextAtom remainingTickets, @NotNull ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton bonusSmallButton, boolean areRouteBadgesVisible, @NotNull List<Badge> routeBadges, String borderColor, String bonusBackgroundColor, Badge premiumBadge, Badge bonusPremiumBadge, boolean isPremiumBadgeVisible, AtomAction cardClickAction, AtomAction bonusCardClickAction, t viewTrackingInfo, boolean isBonusPay) {
                Intrinsics.checkNotNullParameter(routeBlocks, "routeBlocks");
                Intrinsics.checkNotNullParameter(luggage, "luggage");
                Intrinsics.checkNotNullParameter(simplePrice, "simplePrice");
                Intrinsics.checkNotNullParameter(smallButton, "smallButton");
                Intrinsics.checkNotNullParameter(routeBadges, "routeBadges");
                return new FlightItemV3(id2, isProgressVisible, widgetId, routeBlocks, luggage, isLuggageVisible, simplePrice, bonusPrice, remainingTickets, smallButton, bonusSmallButton, areRouteBadgesVisible, routeBadges, borderColor, bonusBackgroundColor, premiumBadge, bonusPremiumBadge, isPremiumBadgeVisible, cardClickAction, bonusCardClickAction, viewTrackingInfo, isBonusPay);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FlightItemV3)) {
                    return false;
                }
                FlightItemV3 flightItemV3 = (FlightItemV3) other;
                return this.id == flightItemV3.id && this.isProgressVisible == flightItemV3.isProgressVisible && this.widgetId == flightItemV3.widgetId && Intrinsics.d(this.routeBlocks, flightItemV3.routeBlocks) && Intrinsics.d(this.luggage, flightItemV3.luggage) && this.isLuggageVisible == flightItemV3.isLuggageVisible && Intrinsics.d(this.simplePrice, flightItemV3.simplePrice) && Intrinsics.d(this.bonusPrice, flightItemV3.bonusPrice) && Intrinsics.d(this.remainingTickets, flightItemV3.remainingTickets) && Intrinsics.d(this.smallButton, flightItemV3.smallButton) && Intrinsics.d(this.bonusSmallButton, flightItemV3.bonusSmallButton) && this.areRouteBadgesVisible == flightItemV3.areRouteBadgesVisible && Intrinsics.d(this.routeBadges, flightItemV3.routeBadges) && Intrinsics.d(this.borderColor, flightItemV3.borderColor) && Intrinsics.d(this.bonusBackgroundColor, flightItemV3.bonusBackgroundColor) && Intrinsics.d(this.premiumBadge, flightItemV3.premiumBadge) && Intrinsics.d(this.bonusPremiumBadge, flightItemV3.bonusPremiumBadge) && this.isPremiumBadgeVisible == flightItemV3.isPremiumBadgeVisible && Intrinsics.d(this.cardClickAction, flightItemV3.cardClickAction) && Intrinsics.d(this.bonusCardClickAction, flightItemV3.bonusCardClickAction) && Intrinsics.d(this.viewTrackingInfo, flightItemV3.viewTrackingInfo) && this.isBonusPay == flightItemV3.isBonusPay;
            }

            public final boolean getAreRouteBadgesVisible() {
                return this.areRouteBadgesVisible;
            }

            public final String getBonusBackgroundColor() {
                return this.bonusBackgroundColor;
            }

            public final AtomAction getBonusCardClickAction() {
                return this.bonusCardClickAction;
            }

            public final Badge getBonusPremiumBadge() {
                return this.bonusPremiumBadge;
            }

            public final FlightV3DTO.BonusPrice getBonusPrice() {
                return this.bonusPrice;
            }

            public final ButtonV3Atom.SmallButton getBonusSmallButton() {
                return this.bonusSmallButton;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            public final AtomAction getCardClickAction() {
                return this.cardClickAction;
            }

            @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO.AviaSearchResultItemVO
            public long getId() {
                return this.id;
            }

            @NotNull
            public final List<LuggageTabVO> getLuggage() {
                return this.luggage;
            }

            public final Badge getPremiumBadge() {
                return this.premiumBadge;
            }

            public final TextAtom getRemainingTickets() {
                return this.remainingTickets;
            }

            @NotNull
            public final List<Badge> getRouteBadges() {
                return this.routeBadges;
            }

            @NotNull
            public final List<RouteBlockVO> getRouteBlocks() {
                return this.routeBlocks;
            }

            @NotNull
            public final FlightV3DTO.SimplePrice getSimplePrice() {
                return this.simplePrice;
            }

            @NotNull
            public final ButtonV3Atom.SmallButton getSmallButton() {
                return this.smallButton;
            }

            public final t getViewTrackingInfo() {
                return this.viewTrackingInfo;
            }

            public long getWidgetId() {
                return this.widgetId;
            }

            public int hashCode() {
                int hashCode = (this.simplePrice.hashCode() + C3532b.a(g.b(g.b(Pk0.c.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.isProgressVisible), 31, this.widgetId), 31, this.routeBlocks), 31, this.luggage), 31, this.isLuggageVisible)) * 31;
                FlightV3DTO.BonusPrice bonusPrice = this.bonusPrice;
                int hashCode2 = (hashCode + (bonusPrice == null ? 0 : bonusPrice.hashCode())) * 31;
                TextAtom textAtom = this.remainingTickets;
                int c11 = C2618u.c(this.smallButton, (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31);
                ButtonV3Atom.SmallButton smallButton = this.bonusSmallButton;
                int b11 = g.b(C3532b.a((c11 + (smallButton == null ? 0 : smallButton.hashCode())) * 31, 31, this.areRouteBadgesVisible), 31, this.routeBadges);
                String str = this.borderColor;
                int hashCode3 = (b11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.bonusBackgroundColor;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Badge badge = this.premiumBadge;
                int hashCode5 = (hashCode4 + (badge == null ? 0 : badge.hashCode())) * 31;
                Badge badge2 = this.bonusPremiumBadge;
                int a11 = C3532b.a((hashCode5 + (badge2 == null ? 0 : badge2.hashCode())) * 31, 31, this.isPremiumBadgeVisible);
                AtomAction atomAction = this.cardClickAction;
                int hashCode6 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                AtomAction atomAction2 = this.bonusCardClickAction;
                int hashCode7 = (hashCode6 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
                t tVar = this.viewTrackingInfo;
                return Boolean.hashCode(this.isBonusPay) + ((hashCode7 + (tVar != null ? tVar.hashCode() : 0)) * 31);
            }

            /* renamed from: isBonusPay, reason: from getter */
            public final boolean getIsBonusPay() {
                return this.isBonusPay;
            }

            /* renamed from: isPremiumBadgeVisible, reason: from getter */
            public final boolean getIsPremiumBadgeVisible() {
                return this.isPremiumBadgeVisible;
            }

            /* renamed from: isProgressVisible, reason: from getter */
            public boolean getIsProgressVisible() {
                return this.isProgressVisible;
            }

            @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO.AviaSearchResultItemVO.Flight
            public void setProgressVisible(boolean z11) {
                this.isProgressVisible = z11;
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                boolean z11 = this.isProgressVisible;
                long j12 = this.widgetId;
                List<RouteBlockVO> list = this.routeBlocks;
                List<LuggageTabVO> list2 = this.luggage;
                boolean z12 = this.isLuggageVisible;
                FlightV3DTO.SimplePrice simplePrice = this.simplePrice;
                FlightV3DTO.BonusPrice bonusPrice = this.bonusPrice;
                TextAtom textAtom = this.remainingTickets;
                ButtonV3Atom.SmallButton smallButton = this.smallButton;
                ButtonV3Atom.SmallButton smallButton2 = this.bonusSmallButton;
                boolean z13 = this.areRouteBadgesVisible;
                List<Badge> list3 = this.routeBadges;
                String str = this.borderColor;
                String str2 = this.bonusBackgroundColor;
                Badge badge = this.premiumBadge;
                Badge badge2 = this.bonusPremiumBadge;
                boolean z14 = this.isPremiumBadgeVisible;
                AtomAction atomAction = this.cardClickAction;
                AtomAction atomAction2 = this.bonusCardClickAction;
                t tVar = this.viewTrackingInfo;
                boolean z15 = this.isBonusPay;
                StringBuilder c11 = Bl.b.c(j11, "FlightItemV3(id=", ", isProgressVisible=", z11);
                C2942q.f(c11, ", widgetId=", j12, ", routeBlocks=");
                C2616s.g(", luggage=", ", isLuggageVisible=", c11, list, list2);
                c11.append(z12);
                c11.append(", simplePrice=");
                c11.append(simplePrice);
                c11.append(", bonusPrice=");
                c11.append(bonusPrice);
                c11.append(", remainingTickets=");
                c11.append(textAtom);
                c11.append(", smallButton=");
                c11.append(smallButton);
                c11.append(", bonusSmallButton=");
                c11.append(smallButton2);
                c11.append(", areRouteBadgesVisible=");
                c11.append(z13);
                c11.append(", routeBadges=");
                c11.append(list3);
                c11.append(", borderColor=");
                Nh.a.h(c11, str, ", bonusBackgroundColor=", str2, ", premiumBadge=");
                c11.append(badge);
                c11.append(", bonusPremiumBadge=");
                c11.append(badge2);
                c11.append(", isPremiumBadgeVisible=");
                c11.append(z14);
                c11.append(", cardClickAction=");
                c11.append(atomAction);
                c11.append(", bonusCardClickAction=");
                c11.append(atomAction2);
                c11.append(", viewTrackingInfo=");
                c11.append(tVar);
                c11.append(", isBonusPay=");
                return Pk0.a.a(")", c11, z15);
            }

            public /* synthetic */ FlightItemV3(long j11, boolean z11, long j12, List list, List list2, boolean z12, FlightV3DTO.SimplePrice simplePrice, FlightV3DTO.BonusPrice bonusPrice, TextAtom textAtom, ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton smallButton2, boolean z13, List list3, String str, String str2, Badge badge, Badge badge2, boolean z14, AtomAction atomAction, AtomAction atomAction2, t tVar, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, (i11 & 2) != 0 ? false : z11, j12, list, list2, z12, simplePrice, bonusPrice, textAtom, smallButton, smallButton2, z13, list3, str, str2, badge, badge2, z14, atomAction, atomAction2, tVar, (i11 & 2097152) != 0 ? false : z15);
            }
        }
    }
}
