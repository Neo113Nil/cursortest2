package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo;

import De.C2859b;
import F3.G;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\n\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3StickyVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/af/AtomAction;", "buttonAction", "", "isLoading", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;Z)V", "copy", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;Z)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3StickyVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getButtonAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HotelsBookTotalV3StickyVO implements c {

    @NotNull
    private final ButtonV3DTO button;
    private final AtomAction buttonAction;
    private final long id;
    private final boolean isLoading;

    public HotelsBookTotalV3StickyVO(long j11, @NotNull ButtonV3DTO button, AtomAction atomAction, boolean z11) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.button = button;
        this.buttonAction = atomAction;
        this.isLoading = z11;
    }

    public static /* synthetic */ HotelsBookTotalV3StickyVO copy$default(HotelsBookTotalV3StickyVO hotelsBookTotalV3StickyVO, long j11, ButtonV3DTO buttonV3DTO, AtomAction atomAction, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = hotelsBookTotalV3StickyVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            buttonV3DTO = hotelsBookTotalV3StickyVO.button;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        if ((i11 & 4) != 0) {
            atomAction = hotelsBookTotalV3StickyVO.buttonAction;
        }
        AtomAction atomAction2 = atomAction;
        if ((i11 & 8) != 0) {
            z11 = hotelsBookTotalV3StickyVO.isLoading;
        }
        return hotelsBookTotalV3StickyVO.copy(j12, buttonV3DTO2, atomAction2, z11);
    }

    @NotNull
    public final HotelsBookTotalV3StickyVO copy(long id2, @NotNull ButtonV3DTO button, AtomAction buttonAction, boolean isLoading) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new HotelsBookTotalV3StickyVO(id2, button, buttonAction, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsBookTotalV3StickyVO)) {
            return false;
        }
        HotelsBookTotalV3StickyVO hotelsBookTotalV3StickyVO = (HotelsBookTotalV3StickyVO) other;
        return this.id == hotelsBookTotalV3StickyVO.id && Intrinsics.d(this.button, hotelsBookTotalV3StickyVO.button) && Intrinsics.d(this.buttonAction, hotelsBookTotalV3StickyVO.buttonAction) && this.isLoading == hotelsBookTotalV3StickyVO.isLoading;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final AtomAction getButtonAction() {
        return this.buttonAction;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int c11 = C2859b.c(this.button, Long.hashCode(this.id) * 31, 31);
        AtomAction atomAction = this.buttonAction;
        return Boolean.hashCode(this.isLoading) + ((c11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31);
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.button;
        AtomAction atomAction = this.buttonAction;
        boolean z11 = this.isLoading;
        StringBuilder c11 = G.c("HotelsBookTotalV3StickyVO(id=", j11, ", button=", buttonV3DTO);
        c11.append(", buttonAction=");
        c11.append(atomAction);
        c11.append(", isLoading=");
        c11.append(z11);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ HotelsBookTotalV3StickyVO(long j11, ButtonV3DTO buttonV3DTO, AtomAction atomAction, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, buttonV3DTO, atomAction, (i11 & 8) != 0 ? false : z11);
    }
}
