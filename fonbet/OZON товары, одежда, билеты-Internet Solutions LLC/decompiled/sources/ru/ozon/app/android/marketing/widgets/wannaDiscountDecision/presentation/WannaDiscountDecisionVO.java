package ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.presentation;

import B90.C2619v;
import Bl.C2639a;
import J0.C3349u1;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.badge.TimerBadge;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.data.PriceBlock;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.data.SellerMessage;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00016BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "infoButton", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/PriceBlock;", "priceBlock", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/SellerMessage;", "sellerMessage", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO$TimerBlockVO;", DynamicElementDTO.TIMER, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/PriceBlock;Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/SellerMessage;Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO$TimerBlockVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/PriceBlock;", "getPriceBlock", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/PriceBlock;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/SellerMessage;", "getSellerMessage", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/SellerMessage;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO$TimerBlockVO;", "getTimer", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO$TimerBlockVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "TimerBlockVO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WannaDiscountDecisionVO implements c {
    private final long id;

    @NotNull
    private final ButtonV3Atom.SmallIconButton infoButton;
    private final PriceBlock priceBlock;
    private final SellerMessage sellerMessage;

    @NotNull
    private final TextAtom subtitle;
    private final TimerBlockVO timer;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO$TimerBlockVO;", "", "Lru/ozon/app/android/atoms/data/badge/TimerBadge;", "timerBadge", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Lru/ozon/app/android/atoms/data/badge/TimerBadge;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/badge/TimerBadge;", "getTimerBadge", "()Lru/ozon/app/android/atoms/data/badge/TimerBadge;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimerBlockVO {

        @NotNull
        private final TimerBadge timerBadge;

        @NotNull
        private final TextAtom title;

        public TimerBlockVO(@NotNull TimerBadge timerBadge, @NotNull TextAtom title) {
            Intrinsics.checkNotNullParameter(timerBadge, "timerBadge");
            Intrinsics.checkNotNullParameter(title, "title");
            this.timerBadge = timerBadge;
            this.title = title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerBlockVO)) {
                return false;
            }
            TimerBlockVO timerBlockVO = (TimerBlockVO) other;
            return Intrinsics.d(this.timerBadge, timerBlockVO.timerBadge) && Intrinsics.d(this.title, timerBlockVO.title);
        }

        @NotNull
        public final TimerBadge getTimerBadge() {
            return this.timerBadge;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.timerBadge.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TimerBlockVO(timerBadge=" + this.timerBadge + ", title=" + this.title + ")";
        }
    }

    public WannaDiscountDecisionVO(long j11, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.SmallIconButton infoButton, PriceBlock priceBlock, SellerMessage sellerMessage, TimerBlockVO timerBlockVO, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.infoButton = infoButton;
        this.priceBlock = priceBlock;
        this.sellerMessage = sellerMessage;
        this.timer = timerBlockVO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WannaDiscountDecisionVO)) {
            return false;
        }
        WannaDiscountDecisionVO wannaDiscountDecisionVO = (WannaDiscountDecisionVO) other;
        return this.id == wannaDiscountDecisionVO.id && Intrinsics.d(this.title, wannaDiscountDecisionVO.title) && Intrinsics.d(this.subtitle, wannaDiscountDecisionVO.subtitle) && Intrinsics.d(this.infoButton, wannaDiscountDecisionVO.infoButton) && Intrinsics.d(this.priceBlock, wannaDiscountDecisionVO.priceBlock) && Intrinsics.d(this.sellerMessage, wannaDiscountDecisionVO.sellerMessage) && Intrinsics.d(this.timer, wannaDiscountDecisionVO.timer) && Intrinsics.d(this.tokenizedEvent, wannaDiscountDecisionVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    public final PriceBlock getPriceBlock() {
        return this.priceBlock;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SellerMessage getSellerMessage() {
        return this.sellerMessage;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TimerBlockVO getTimer() {
        return this.timer;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int d11 = C3349u1.d(this.infoButton, C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle), 31);
        PriceBlock priceBlock = this.priceBlock;
        int hashCode = (d11 + (priceBlock == null ? 0 : priceBlock.hashCode())) * 31;
        SellerMessage sellerMessage = this.sellerMessage;
        int hashCode2 = (hashCode + (sellerMessage == null ? 0 : sellerMessage.hashCode())) * 31;
        TimerBlockVO timerBlockVO = this.timer;
        int hashCode3 = (hashCode2 + (timerBlockVO == null ? 0 : timerBlockVO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        PriceBlock priceBlock = this.priceBlock;
        SellerMessage sellerMessage = this.sellerMessage;
        TimerBlockVO timerBlockVO = this.timer;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2639a.c("WannaDiscountDecisionVO(id=", j11, ", title=", textAtom);
        c11.append(", subtitle=");
        c11.append(textAtom2);
        c11.append(", infoButton=");
        c11.append(smallIconButton);
        c11.append(", priceBlock=");
        c11.append(priceBlock);
        c11.append(", sellerMessage=");
        c11.append(sellerMessage);
        c11.append(", timer=");
        c11.append(timerBlockVO);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }
}
