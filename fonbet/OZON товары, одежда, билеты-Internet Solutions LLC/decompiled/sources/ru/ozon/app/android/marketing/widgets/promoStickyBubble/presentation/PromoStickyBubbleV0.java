package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import Ak.C2436a;
import G.g;
import GR.b;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b(\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u009f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJÀ\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b2\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b<\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\bC\u0010;R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\b\u0018\u0010\u001fR$\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010=\u001a\u0004\bE\u0010?\"\u0004\bF\u0010GR\"\u0010\u001a\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010D\u001a\u0004\bH\u0010\u001f\"\u0004\bI\u0010JR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001b\u0010K\u001a\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleV0;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "imageUrl", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "productImage", "logoImageUrl", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "anchorKey", "", "autoHideTimer", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "viewAction", "", "isVisible", "remainingTimerSeconds", "wasShown", "rateItemsIsVisible", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/lang/Integer;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;ZLjava/lang/Integer;ZLjava/lang/Boolean;)V", "shouldTrackAfterShow", "()Z", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/lang/Integer;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;ZLjava/lang/Integer;ZLjava/lang/Boolean;)Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleV0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImageUrl", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getProductImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getLogoImageUrl", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getAnchorKey", "Ljava/lang/Integer;", "getAutoHideTimer", "()Ljava/lang/Integer;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getViewAction", "Z", "getRemainingTimerSeconds", "setRemainingTimerSeconds", "(Ljava/lang/Integer;)V", "getWasShown", "setWasShown", "(Z)V", "Ljava/lang/Boolean;", "getRateItemsIsVisible", "()Ljava/lang/Boolean;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PromoStickyBubbleV0 implements c {
    private final AtomAction action;
    private final String anchorKey;
    private final Integer autoHideTimer;
    private final BadgeDTO badge;

    @NotNull
    private final IconButtonV3DTO closeButton;
    private final long id;

    @NotNull
    private final String imageUrl;
    private final boolean isVisible;
    private final String logoImageUrl;
    private final ImageDTO productImage;
    private final Boolean rateItemsIsVisible;
    private Integer remainingTimerSeconds;
    private final t tokenizedEvent;
    private final AtomAction viewAction;
    private boolean wasShown;

    public PromoStickyBubbleV0(long j11, @NotNull String imageUrl, ImageDTO imageDTO, String str, @NotNull IconButtonV3DTO closeButton, BadgeDTO badgeDTO, AtomAction atomAction, String str2, Integer num, t tVar, AtomAction atomAction2, boolean z11, Integer num2, boolean z12, Boolean bool) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.id = j11;
        this.imageUrl = imageUrl;
        this.productImage = imageDTO;
        this.logoImageUrl = str;
        this.closeButton = closeButton;
        this.badge = badgeDTO;
        this.action = atomAction;
        this.anchorKey = str2;
        this.autoHideTimer = num;
        this.tokenizedEvent = tVar;
        this.viewAction = atomAction2;
        this.isVisible = z11;
        this.remainingTimerSeconds = num2;
        this.wasShown = z12;
        this.rateItemsIsVisible = bool;
    }

    @NotNull
    public final PromoStickyBubbleV0 copy(long id2, @NotNull String imageUrl, ImageDTO productImage, String logoImageUrl, @NotNull IconButtonV3DTO closeButton, BadgeDTO badge, AtomAction action, String anchorKey, Integer autoHideTimer, t tokenizedEvent, AtomAction viewAction, boolean isVisible, Integer remainingTimerSeconds, boolean wasShown, Boolean rateItemsIsVisible) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        return new PromoStickyBubbleV0(id2, imageUrl, productImage, logoImageUrl, closeButton, badge, action, anchorKey, autoHideTimer, tokenizedEvent, viewAction, isVisible, remainingTimerSeconds, wasShown, rateItemsIsVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoStickyBubbleV0)) {
            return false;
        }
        PromoStickyBubbleV0 promoStickyBubbleV0 = (PromoStickyBubbleV0) other;
        return this.id == promoStickyBubbleV0.id && Intrinsics.d(this.imageUrl, promoStickyBubbleV0.imageUrl) && Intrinsics.d(this.productImage, promoStickyBubbleV0.productImage) && Intrinsics.d(this.logoImageUrl, promoStickyBubbleV0.logoImageUrl) && Intrinsics.d(this.closeButton, promoStickyBubbleV0.closeButton) && Intrinsics.d(this.badge, promoStickyBubbleV0.badge) && Intrinsics.d(this.action, promoStickyBubbleV0.action) && Intrinsics.d(this.anchorKey, promoStickyBubbleV0.anchorKey) && Intrinsics.d(this.autoHideTimer, promoStickyBubbleV0.autoHideTimer) && Intrinsics.d(this.tokenizedEvent, promoStickyBubbleV0.tokenizedEvent) && Intrinsics.d(this.viewAction, promoStickyBubbleV0.viewAction) && this.isVisible == promoStickyBubbleV0.isVisible && Intrinsics.d(this.remainingTimerSeconds, promoStickyBubbleV0.remainingTimerSeconds) && this.wasShown == promoStickyBubbleV0.wasShown && Intrinsics.d(this.rateItemsIsVisible, promoStickyBubbleV0.rateItemsIsVisible);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getAnchorKey() {
        return this.anchorKey;
    }

    public final Integer getAutoHideTimer() {
        return this.autoHideTimer;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLogoImageUrl() {
        return this.logoImageUrl;
    }

    public final ImageDTO getProductImage() {
        return this.productImage;
    }

    public final Boolean getRateItemsIsVisible() {
        return this.rateItemsIsVisible;
    }

    public final Integer getRemainingTimerSeconds() {
        return this.remainingTimerSeconds;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final AtomAction getViewAction() {
        return this.viewAction;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final boolean getWasShown() {
        return this.wasShown;
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.imageUrl);
        ImageDTO imageDTO = this.productImage;
        int hashCode = (a11 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        String str = this.logoImageUrl;
        int c11 = b.c(this.closeButton, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (c11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str2 = this.anchorKey;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.autoHideTimer;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode6 = (hashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        AtomAction atomAction2 = this.viewAction;
        int a12 = C3532b.a((hashCode6 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31, 31, this.isVisible);
        Integer num2 = this.remainingTimerSeconds;
        int a13 = C3532b.a((a12 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.wasShown);
        Boolean bool = this.rateItemsIsVisible;
        return a13 + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void setRemainingTimerSeconds(Integer num) {
        this.remainingTimerSeconds = num;
    }

    public final void setWasShown(boolean z11) {
        this.wasShown = z11;
    }

    public final boolean shouldTrackAfterShow() {
        return (this.wasShown || !this.isVisible || Intrinsics.d(this.rateItemsIsVisible, Boolean.TRUE)) ? false : true;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.imageUrl;
        ImageDTO imageDTO = this.productImage;
        String str2 = this.logoImageUrl;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        BadgeDTO badgeDTO = this.badge;
        AtomAction atomAction = this.action;
        String str3 = this.anchorKey;
        Integer num = this.autoHideTimer;
        t tVar = this.tokenizedEvent;
        AtomAction atomAction2 = this.viewAction;
        boolean z11 = this.isVisible;
        Integer num2 = this.remainingTimerSeconds;
        boolean z12 = this.wasShown;
        Boolean bool = this.rateItemsIsVisible;
        StringBuilder c11 = C2436a.c(j11, "PromoStickyBubbleV0(id=", ", imageUrl=", str);
        c11.append(", productImage=");
        c11.append(imageDTO);
        c11.append(", logoImageUrl=");
        c11.append(str2);
        c11.append(", closeButton=");
        c11.append(iconButtonV3DTO);
        c11.append(", badge=");
        c11.append(badgeDTO);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", anchorKey=");
        c11.append(str3);
        c11.append(", autoHideTimer=");
        c11.append(num);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", viewAction=");
        c11.append(atomAction2);
        c11.append(", isVisible=");
        c11.append(z11);
        c11.append(", remainingTimerSeconds=");
        c11.append(num2);
        c11.append(", wasShown=");
        c11.append(z12);
        c11.append(", rateItemsIsVisible=");
        c11.append(bool);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ PromoStickyBubbleV0(long j11, String str, ImageDTO imageDTO, String str2, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO, AtomAction atomAction, String str3, Integer num, t tVar, AtomAction atomAction2, boolean z11, Integer num2, boolean z12, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, imageDTO, str2, iconButtonV3DTO, badgeDTO, atomAction, str3, num, tVar, atomAction2, z11, (i11 & 4096) != 0 ? null : num2, (i11 & 8192) != 0 ? false : z12, (i11 & 16384) != 0 ? null : bool);
    }
}
