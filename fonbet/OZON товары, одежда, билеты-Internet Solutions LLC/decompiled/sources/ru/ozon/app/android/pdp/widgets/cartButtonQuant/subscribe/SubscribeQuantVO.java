package ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe;

import C.C2702w;
import Kk.C3532b;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J|\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b\u0007\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b/\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "sku", "", "isSubscribed", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "subscribe", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "subscribeText", TokenizedTrackingInfo.ACTION_UNSUBSCRIBE, "unsubscribeText", "hasShadow", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "style", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$ButtonColors;", "priorityColor", "<init>", "(JJZLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;ZLru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$ButtonColors;)V", "copy", "(JJZLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;ZLru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$ButtonColors;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getSku", "Z", "()Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSubscribe", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getSubscribeText", "()Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getUnsubscribe", "getUnsubscribeText", "getHasShadow", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "getStyle", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$ButtonColors;", "getPriorityColor", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$ButtonColors;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SubscribeQuantVO implements c {
    private final boolean hasShadow;
    private final long id;
    private final boolean isSubscribed;
    private final CartButtonQuantDto.ButtonColors priorityColor;
    private final long sku;
    private final CartButtonQuantDto.CartButtonStyle style;

    @NotNull
    private final ButtonV3Atom.LargeButton subscribe;
    private final TextAtomWithIcon subscribeText;

    @NotNull
    private final ButtonV3Atom.LargeButton unsubscribe;
    private final TextAtomWithIcon unsubscribeText;

    public SubscribeQuantVO(long j11, long j12, boolean z11, @NotNull ButtonV3Atom.LargeButton subscribe, TextAtomWithIcon textAtomWithIcon, @NotNull ButtonV3Atom.LargeButton unsubscribe, TextAtomWithIcon textAtomWithIcon2, boolean z12, CartButtonQuantDto.CartButtonStyle cartButtonStyle, CartButtonQuantDto.ButtonColors buttonColors) {
        Intrinsics.checkNotNullParameter(subscribe, "subscribe");
        Intrinsics.checkNotNullParameter(unsubscribe, "unsubscribe");
        this.id = j11;
        this.sku = j12;
        this.isSubscribed = z11;
        this.subscribe = subscribe;
        this.subscribeText = textAtomWithIcon;
        this.unsubscribe = unsubscribe;
        this.unsubscribeText = textAtomWithIcon2;
        this.hasShadow = z12;
        this.style = cartButtonStyle;
        this.priorityColor = buttonColors;
    }

    public static /* synthetic */ SubscribeQuantVO copy$default(SubscribeQuantVO subscribeQuantVO, long j11, long j12, boolean z11, ButtonV3Atom.LargeButton largeButton, TextAtomWithIcon textAtomWithIcon, ButtonV3Atom.LargeButton largeButton2, TextAtomWithIcon textAtomWithIcon2, boolean z12, CartButtonQuantDto.CartButtonStyle cartButtonStyle, CartButtonQuantDto.ButtonColors buttonColors, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = subscribeQuantVO.id;
        }
        return subscribeQuantVO.copy(j11, (i11 & 2) != 0 ? subscribeQuantVO.sku : j12, (i11 & 4) != 0 ? subscribeQuantVO.isSubscribed : z11, (i11 & 8) != 0 ? subscribeQuantVO.subscribe : largeButton, (i11 & 16) != 0 ? subscribeQuantVO.subscribeText : textAtomWithIcon, (i11 & 32) != 0 ? subscribeQuantVO.unsubscribe : largeButton2, (i11 & 64) != 0 ? subscribeQuantVO.unsubscribeText : textAtomWithIcon2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? subscribeQuantVO.hasShadow : z12, (i11 & 256) != 0 ? subscribeQuantVO.style : cartButtonStyle, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? subscribeQuantVO.priorityColor : buttonColors);
    }

    @NotNull
    public final SubscribeQuantVO copy(long id2, long sku, boolean isSubscribed, @NotNull ButtonV3Atom.LargeButton subscribe, TextAtomWithIcon subscribeText, @NotNull ButtonV3Atom.LargeButton unsubscribe, TextAtomWithIcon unsubscribeText, boolean hasShadow, CartButtonQuantDto.CartButtonStyle style, CartButtonQuantDto.ButtonColors priorityColor) {
        Intrinsics.checkNotNullParameter(subscribe, "subscribe");
        Intrinsics.checkNotNullParameter(unsubscribe, "unsubscribe");
        return new SubscribeQuantVO(id2, sku, isSubscribed, subscribe, subscribeText, unsubscribe, unsubscribeText, hasShadow, style, priorityColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeQuantVO)) {
            return false;
        }
        SubscribeQuantVO subscribeQuantVO = (SubscribeQuantVO) other;
        return this.id == subscribeQuantVO.id && this.sku == subscribeQuantVO.sku && this.isSubscribed == subscribeQuantVO.isSubscribed && Intrinsics.d(this.subscribe, subscribeQuantVO.subscribe) && Intrinsics.d(this.subscribeText, subscribeQuantVO.subscribeText) && Intrinsics.d(this.unsubscribe, subscribeQuantVO.unsubscribe) && Intrinsics.d(this.unsubscribeText, subscribeQuantVO.unsubscribeText) && this.hasShadow == subscribeQuantVO.hasShadow && this.style == subscribeQuantVO.style && Intrinsics.d(this.priorityColor, subscribeQuantVO.priorityColor);
    }

    public final boolean getHasShadow() {
        return this.hasShadow;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final CartButtonQuantDto.ButtonColors getPriorityColor() {
        return this.priorityColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final CartButtonQuantDto.CartButtonStyle getStyle() {
        return this.style;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSubscribe() {
        return this.subscribe;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getUnsubscribe() {
        return this.unsubscribe;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.subscribe, C3532b.a(Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.sku), 31, this.isSubscribed), 31);
        TextAtomWithIcon textAtomWithIcon = this.subscribeText;
        int a12 = b.a(this.unsubscribe, (a11 + (textAtomWithIcon == null ? 0 : textAtomWithIcon.hashCode())) * 31, 31);
        TextAtomWithIcon textAtomWithIcon2 = this.unsubscribeText;
        int a13 = C3532b.a((a12 + (textAtomWithIcon2 == null ? 0 : textAtomWithIcon2.hashCode())) * 31, 31, this.hasShadow);
        CartButtonQuantDto.CartButtonStyle cartButtonStyle = this.style;
        int hashCode = (a13 + (cartButtonStyle == null ? 0 : cartButtonStyle.hashCode())) * 31;
        CartButtonQuantDto.ButtonColors buttonColors = this.priorityColor;
        return hashCode + (buttonColors != null ? buttonColors.hashCode() : 0);
    }

    /* renamed from: isSubscribed, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.sku;
        boolean z11 = this.isSubscribed;
        ButtonV3Atom.LargeButton largeButton = this.subscribe;
        TextAtomWithIcon textAtomWithIcon = this.subscribeText;
        ButtonV3Atom.LargeButton largeButton2 = this.unsubscribe;
        TextAtomWithIcon textAtomWithIcon2 = this.unsubscribeText;
        boolean z12 = this.hasShadow;
        CartButtonQuantDto.CartButtonStyle cartButtonStyle = this.style;
        CartButtonQuantDto.ButtonColors buttonColors = this.priorityColor;
        StringBuilder d11 = C2702w.d(j11, "SubscribeQuantVO(id=", ", sku=");
        d11.append(j12);
        d11.append(", isSubscribed=");
        d11.append(z11);
        d11.append(", subscribe=");
        d11.append(largeButton);
        d11.append(", subscribeText=");
        d11.append(textAtomWithIcon);
        d11.append(", unsubscribe=");
        d11.append(largeButton2);
        d11.append(", unsubscribeText=");
        d11.append(textAtomWithIcon2);
        d11.append(", hasShadow=");
        d11.append(z12);
        d11.append(", style=");
        d11.append(cartButtonStyle);
        d11.append(", priorityColor=");
        d11.append(buttonColors);
        d11.append(")");
        return d11.toString();
    }
}
