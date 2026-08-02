package ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.data;

import B90.C2619v;
import HY.a;
import J0.C3349u1;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003Jc\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/WannaDiscountDecisionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "infoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "price", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/PriceBlock;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/TimerBlock;", "sellerMessage", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/SellerMessage;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/PriceBlock;Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/TimerBlock;Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/SellerMessage;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getPrice", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/PriceBlock;", "getTimer", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/TimerBlock;", "getSellerMessage", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/SellerMessage;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WannaDiscountDecisionDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.SmallIconButton infoButton;
    private final PriceBlock price;
    private final SellerMessage sellerMessage;

    @NotNull
    private final TextAtom subtitle;
    private final TimerBlock timer;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public WannaDiscountDecisionDTO(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.SmallIconButton infoButton, PriceBlock priceBlock, TimerBlock timerBlock, SellerMessage sellerMessage, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        this.title = title;
        this.subtitle = subtitle;
        this.infoButton = infoButton;
        this.price = priceBlock;
        this.timer = timerBlock;
        this.sellerMessage = sellerMessage;
        this.trackingInfo = map;
    }

    public static /* synthetic */ WannaDiscountDecisionDTO copy$default(WannaDiscountDecisionDTO wannaDiscountDecisionDTO, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallIconButton smallIconButton, PriceBlock priceBlock, TimerBlock timerBlock, SellerMessage sellerMessage, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = wannaDiscountDecisionDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = wannaDiscountDecisionDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            smallIconButton = wannaDiscountDecisionDTO.infoButton;
        }
        if ((i11 & 8) != 0) {
            priceBlock = wannaDiscountDecisionDTO.price;
        }
        if ((i11 & 16) != 0) {
            timerBlock = wannaDiscountDecisionDTO.timer;
        }
        if ((i11 & 32) != 0) {
            sellerMessage = wannaDiscountDecisionDTO.sellerMessage;
        }
        if ((i11 & 64) != 0) {
            map = wannaDiscountDecisionDTO.trackingInfo;
        }
        SellerMessage sellerMessage2 = sellerMessage;
        Map map2 = map;
        TimerBlock timerBlock2 = timerBlock;
        ButtonV3Atom.SmallIconButton smallIconButton2 = smallIconButton;
        return wannaDiscountDecisionDTO.copy(textAtom, textAtom2, smallIconButton2, priceBlock, timerBlock2, sellerMessage2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    /* renamed from: component4, reason: from getter */
    public final PriceBlock getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final TimerBlock getTimer() {
        return this.timer;
    }

    /* renamed from: component6, reason: from getter */
    public final SellerMessage getSellerMessage() {
        return this.sellerMessage;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final WannaDiscountDecisionDTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.SmallIconButton infoButton, PriceBlock price, TimerBlock timer, SellerMessage sellerMessage, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        return new WannaDiscountDecisionDTO(title, subtitle, infoButton, price, timer, sellerMessage, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WannaDiscountDecisionDTO)) {
            return false;
        }
        WannaDiscountDecisionDTO wannaDiscountDecisionDTO = (WannaDiscountDecisionDTO) other;
        return Intrinsics.d(this.title, wannaDiscountDecisionDTO.title) && Intrinsics.d(this.subtitle, wannaDiscountDecisionDTO.subtitle) && Intrinsics.d(this.infoButton, wannaDiscountDecisionDTO.infoButton) && Intrinsics.d(this.price, wannaDiscountDecisionDTO.price) && Intrinsics.d(this.timer, wannaDiscountDecisionDTO.timer) && Intrinsics.d(this.sellerMessage, wannaDiscountDecisionDTO.sellerMessage) && Intrinsics.d(this.trackingInfo, wannaDiscountDecisionDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    public final PriceBlock getPrice() {
        return this.price;
    }

    public final SellerMessage getSellerMessage() {
        return this.sellerMessage;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TimerBlock getTimer() {
        return this.timer;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int d11 = C3349u1.d(this.infoButton, C2619v.b(this.title.hashCode() * 31, 31, this.subtitle), 31);
        PriceBlock priceBlock = this.price;
        int hashCode = (d11 + (priceBlock == null ? 0 : priceBlock.hashCode())) * 31;
        TimerBlock timerBlock = this.timer;
        int hashCode2 = (hashCode + (timerBlock == null ? 0 : timerBlock.hashCode())) * 31;
        SellerMessage sellerMessage = this.sellerMessage;
        int hashCode3 = (hashCode2 + (sellerMessage == null ? 0 : sellerMessage.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        PriceBlock priceBlock = this.price;
        TimerBlock timerBlock = this.timer;
        SellerMessage sellerMessage = this.sellerMessage;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("WannaDiscountDecisionDTO(title=", textAtom, ", subtitle=", textAtom2, ", infoButton=");
        a11.append(smallIconButton);
        a11.append(", price=");
        a11.append(priceBlock);
        a11.append(", timer=");
        a11.append(timerBlock);
        a11.append(", sellerMessage=");
        a11.append(sellerMessage);
        a11.append(", trackingInfo=");
        return P.f(a11, map, ")");
    }
}
