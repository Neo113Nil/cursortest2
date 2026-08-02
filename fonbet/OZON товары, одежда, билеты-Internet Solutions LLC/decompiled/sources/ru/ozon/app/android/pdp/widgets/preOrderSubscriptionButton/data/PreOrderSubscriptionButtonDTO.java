package ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.data;

import G.g;
import K1.G;
import Tl.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/data/PreOrderSubscriptionButtonDTO;", "", "isSubscribed", "", "productId", "", "subscribeButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "unsubscribeButton", "<init>", "(ZLjava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "()Z", "getProductId", "()Ljava/lang/String;", "getSubscribeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getUnsubscribeButton", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PreOrderSubscriptionButtonDTO {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;
    private final boolean isSubscribed;

    @NotNull
    private final String productId;

    @NotNull
    private final ButtonV3Atom.LargeButton subscribeButton;

    @NotNull
    private final ButtonV3Atom.LargeButton unsubscribeButton;

    public PreOrderSubscriptionButtonDTO(boolean z11, @NotNull String productId, @NotNull ButtonV3Atom.LargeButton subscribeButton, @NotNull ButtonV3Atom.LargeButton unsubscribeButton) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
        Intrinsics.checkNotNullParameter(unsubscribeButton, "unsubscribeButton");
        this.isSubscribed = z11;
        this.productId = productId;
        this.subscribeButton = subscribeButton;
        this.unsubscribeButton = unsubscribeButton;
    }

    public static /* synthetic */ PreOrderSubscriptionButtonDTO copy$default(PreOrderSubscriptionButtonDTO preOrderSubscriptionButtonDTO, boolean z11, String str, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = preOrderSubscriptionButtonDTO.isSubscribed;
        }
        if ((i11 & 2) != 0) {
            str = preOrderSubscriptionButtonDTO.productId;
        }
        if ((i11 & 4) != 0) {
            largeButton = preOrderSubscriptionButtonDTO.subscribeButton;
        }
        if ((i11 & 8) != 0) {
            largeButton2 = preOrderSubscriptionButtonDTO.unsubscribeButton;
        }
        return preOrderSubscriptionButtonDTO.copy(z11, str, largeButton, largeButton2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getSubscribeButton() {
        return this.subscribeButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getUnsubscribeButton() {
        return this.unsubscribeButton;
    }

    @NotNull
    public final PreOrderSubscriptionButtonDTO copy(boolean isSubscribed, @NotNull String productId, @NotNull ButtonV3Atom.LargeButton subscribeButton, @NotNull ButtonV3Atom.LargeButton unsubscribeButton) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
        Intrinsics.checkNotNullParameter(unsubscribeButton, "unsubscribeButton");
        return new PreOrderSubscriptionButtonDTO(isSubscribed, productId, subscribeButton, unsubscribeButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreOrderSubscriptionButtonDTO)) {
            return false;
        }
        PreOrderSubscriptionButtonDTO preOrderSubscriptionButtonDTO = (PreOrderSubscriptionButtonDTO) other;
        return this.isSubscribed == preOrderSubscriptionButtonDTO.isSubscribed && Intrinsics.d(this.productId, preOrderSubscriptionButtonDTO.productId) && Intrinsics.d(this.subscribeButton, preOrderSubscriptionButtonDTO.subscribeButton) && Intrinsics.d(this.unsubscribeButton, preOrderSubscriptionButtonDTO.unsubscribeButton);
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSubscribeButton() {
        return this.subscribeButton;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getUnsubscribeButton() {
        return this.unsubscribeButton;
    }

    public int hashCode() {
        return this.unsubscribeButton.hashCode() + b.a(this.subscribeButton, g.a(Boolean.hashCode(this.isSubscribed) * 31, 31, this.productId), 31);
    }

    public final boolean isSubscribed() {
        return this.isSubscribed;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isSubscribed;
        String str = this.productId;
        ButtonV3Atom.LargeButton largeButton = this.subscribeButton;
        ButtonV3Atom.LargeButton largeButton2 = this.unsubscribeButton;
        StringBuilder d11 = G.d("PreOrderSubscriptionButtonDTO(isSubscribed=", ", productId=", str, ", subscribeButton=", z11);
        d11.append(largeButton);
        d11.append(", unsubscribeButton=");
        d11.append(largeButton2);
        d11.append(")");
        return d11.toString();
    }
}
