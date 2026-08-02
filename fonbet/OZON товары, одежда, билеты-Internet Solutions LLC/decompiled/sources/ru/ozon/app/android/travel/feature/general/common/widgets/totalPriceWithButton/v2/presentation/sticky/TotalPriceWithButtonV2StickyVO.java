package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.sticky;

import De.C2859b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2VO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/sticky/TotalPriceWithButtonV2StickyVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO$TimerVO;", DynamicElementDTO.TIMER, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nextStickyButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", "agreement", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO$TimerVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO$TimerVO;", "getTimer", "()Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO$TimerVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNextStickyButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getAgreement", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TotalPriceWithButtonV2StickyVO implements c {
    public static final int $stable = IconDTO.$stable;
    private final TextDTO agreement;
    private final long id;

    @NotNull
    private final ButtonV3DTO nextStickyButton;
    private final TotalPriceWithButtonV2VO.TimerVO timer;

    public TotalPriceWithButtonV2StickyVO(long j11, TotalPriceWithButtonV2VO.TimerVO timerVO, @NotNull ButtonV3DTO nextStickyButton, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(nextStickyButton, "nextStickyButton");
        this.id = j11;
        this.timer = timerVO;
        this.nextStickyButton = nextStickyButton;
        this.agreement = textDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalPriceWithButtonV2StickyVO)) {
            return false;
        }
        TotalPriceWithButtonV2StickyVO totalPriceWithButtonV2StickyVO = (TotalPriceWithButtonV2StickyVO) other;
        return this.id == totalPriceWithButtonV2StickyVO.id && Intrinsics.d(this.timer, totalPriceWithButtonV2StickyVO.timer) && Intrinsics.d(this.nextStickyButton, totalPriceWithButtonV2StickyVO.nextStickyButton) && Intrinsics.d(this.agreement, totalPriceWithButtonV2StickyVO.agreement);
    }

    public final TextDTO getAgreement() {
        return this.agreement;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3DTO getNextStickyButton() {
        return this.nextStickyButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TotalPriceWithButtonV2VO.TimerVO getTimer() {
        return this.timer;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TotalPriceWithButtonV2VO.TimerVO timerVO = this.timer;
        int c11 = C2859b.c(this.nextStickyButton, (hashCode + (timerVO == null ? 0 : timerVO.hashCode())) * 31, 31);
        TextDTO textDTO = this.agreement;
        return c11 + (textDTO != null ? textDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TotalPriceWithButtonV2StickyVO(id=" + this.id + ", timer=" + this.timer + ", nextStickyButton=" + this.nextStickyButton + ", agreement=" + this.agreement + ")";
    }
}
