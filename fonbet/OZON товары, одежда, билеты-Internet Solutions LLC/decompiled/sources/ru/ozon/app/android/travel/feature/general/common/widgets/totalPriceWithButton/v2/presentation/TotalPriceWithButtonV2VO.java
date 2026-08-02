package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation;

import D3.g;
import De.C2859b;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001?Bw\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b6\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b7\u00102R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b;\u0010,R\u001f\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO$TimerVO;", DynamicElementDTO.TIMER, "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "titleIcon", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "titlePrice", "Lru/ozon/uni/atoms/af/AtomAction;", "titleAction", "subtitle", "subtitlePrice", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nextButton", "agreement", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO$TimerVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO$TimerVO;", "getTimer", "()Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO$TimerVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitleIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getTitlePrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getTitleAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getSubtitle", "getSubtitlePrice", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNextButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAgreement", "LWZ/t;", "getViewEvent", "()LWZ/t;", "TimerVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TotalPriceWithButtonV2VO implements c {
    private final TextDTO agreement;
    private final long id;

    @NotNull
    private final ButtonV3DTO nextButton;
    private final TextDTO subtitle;
    private final PriceDTO subtitlePrice;
    private final TimerVO timer;
    private final TextDTO title;
    private final AtomAction titleAction;
    private final IconDTO titleIcon;
    private final PriceDTO titlePrice;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO$TimerVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "countdownTitle", "countdownTimer", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "countdownIcon", "", "countdownColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCountdownTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCountdownTimer", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCountdownIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/lang/String;", "getCountdownColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerVO {
        public static final int $stable = IconDTO.$stable;
        private final String countdownColor;
        private final IconDTO countdownIcon;
        private final TextDTO countdownTimer;
        private final TextDTO countdownTitle;

        public TimerVO(TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, String str) {
            this.countdownTitle = textDTO;
            this.countdownTimer = textDTO2;
            this.countdownIcon = iconDTO;
            this.countdownColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerVO)) {
                return false;
            }
            TimerVO timerVO = (TimerVO) other;
            return Intrinsics.d(this.countdownTitle, timerVO.countdownTitle) && Intrinsics.d(this.countdownTimer, timerVO.countdownTimer) && Intrinsics.d(this.countdownIcon, timerVO.countdownIcon) && Intrinsics.d(this.countdownColor, timerVO.countdownColor);
        }

        public final String getCountdownColor() {
            return this.countdownColor;
        }

        public final IconDTO getCountdownIcon() {
            return this.countdownIcon;
        }

        public final TextDTO getCountdownTimer() {
            return this.countdownTimer;
        }

        public final TextDTO getCountdownTitle() {
            return this.countdownTitle;
        }

        public int hashCode() {
            TextDTO textDTO = this.countdownTitle;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.countdownTimer;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            IconDTO iconDTO = this.countdownIcon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            String str = this.countdownColor;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.countdownTitle;
            TextDTO textDTO2 = this.countdownTimer;
            IconDTO iconDTO = this.countdownIcon;
            String str = this.countdownColor;
            StringBuilder g10 = g.g("TimerVO(countdownTitle=", textDTO, ", countdownTimer=", textDTO2, ", countdownIcon=");
            g10.append(iconDTO);
            g10.append(", countdownColor=");
            g10.append(str);
            g10.append(")");
            return g10.toString();
        }
    }

    public TotalPriceWithButtonV2VO(long j11, TimerVO timerVO, TextDTO textDTO, IconDTO iconDTO, PriceDTO priceDTO, AtomAction atomAction, TextDTO textDTO2, PriceDTO priceDTO2, @NotNull ButtonV3DTO nextButton, TextDTO textDTO3, t tVar) {
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        this.id = j11;
        this.timer = timerVO;
        this.title = textDTO;
        this.titleIcon = iconDTO;
        this.titlePrice = priceDTO;
        this.titleAction = atomAction;
        this.subtitle = textDTO2;
        this.subtitlePrice = priceDTO2;
        this.nextButton = nextButton;
        this.agreement = textDTO3;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalPriceWithButtonV2VO)) {
            return false;
        }
        TotalPriceWithButtonV2VO totalPriceWithButtonV2VO = (TotalPriceWithButtonV2VO) other;
        return this.id == totalPriceWithButtonV2VO.id && Intrinsics.d(this.timer, totalPriceWithButtonV2VO.timer) && Intrinsics.d(this.title, totalPriceWithButtonV2VO.title) && Intrinsics.d(this.titleIcon, totalPriceWithButtonV2VO.titleIcon) && Intrinsics.d(this.titlePrice, totalPriceWithButtonV2VO.titlePrice) && Intrinsics.d(this.titleAction, totalPriceWithButtonV2VO.titleAction) && Intrinsics.d(this.subtitle, totalPriceWithButtonV2VO.subtitle) && Intrinsics.d(this.subtitlePrice, totalPriceWithButtonV2VO.subtitlePrice) && Intrinsics.d(this.nextButton, totalPriceWithButtonV2VO.nextButton) && Intrinsics.d(this.agreement, totalPriceWithButtonV2VO.agreement) && Intrinsics.d(this.viewEvent, totalPriceWithButtonV2VO.viewEvent);
    }

    public final TextDTO getAgreement() {
        return this.agreement;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3DTO getNextButton() {
        return this.nextButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final PriceDTO getSubtitlePrice() {
        return this.subtitlePrice;
    }

    public final TimerVO getTimer() {
        return this.timer;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final AtomAction getTitleAction() {
        return this.titleAction;
    }

    public final IconDTO getTitleIcon() {
        return this.titleIcon;
    }

    public final PriceDTO getTitlePrice() {
        return this.titlePrice;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TimerVO timerVO = this.timer;
        int hashCode2 = (hashCode + (timerVO == null ? 0 : timerVO.hashCode())) * 31;
        TextDTO textDTO = this.title;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        IconDTO iconDTO = this.titleIcon;
        int hashCode4 = (hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        PriceDTO priceDTO = this.titlePrice;
        int hashCode5 = (hashCode4 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
        AtomAction atomAction = this.titleAction;
        int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode7 = (hashCode6 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        PriceDTO priceDTO2 = this.subtitlePrice;
        int c11 = C2859b.c(this.nextButton, (hashCode7 + (priceDTO2 == null ? 0 : priceDTO2.hashCode())) * 31, 31);
        TextDTO textDTO3 = this.agreement;
        int hashCode8 = (c11 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode8 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TimerVO timerVO = this.timer;
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.titleIcon;
        PriceDTO priceDTO = this.titlePrice;
        AtomAction atomAction = this.titleAction;
        TextDTO textDTO2 = this.subtitle;
        PriceDTO priceDTO2 = this.subtitlePrice;
        ButtonV3DTO buttonV3DTO = this.nextButton;
        TextDTO textDTO3 = this.agreement;
        t tVar = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("TotalPriceWithButtonV2VO(id=");
        sb2.append(j11);
        sb2.append(", timer=");
        sb2.append(timerVO);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", titleIcon=");
        sb2.append(iconDTO);
        sb2.append(", titlePrice=");
        sb2.append(priceDTO);
        sb2.append(", titleAction=");
        sb2.append(atomAction);
        sb2.append(", subtitle=");
        sb2.append(textDTO2);
        sb2.append(", subtitlePrice=");
        sb2.append(priceDTO2);
        sb2.append(", nextButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", agreement=");
        sb2.append(textDTO3);
        return a.b(sb2, ", viewEvent=", tVar, ")");
    }
}
