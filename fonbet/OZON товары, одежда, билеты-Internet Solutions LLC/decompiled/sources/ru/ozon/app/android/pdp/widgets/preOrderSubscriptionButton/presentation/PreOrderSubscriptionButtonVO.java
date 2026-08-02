package ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.presentation;

import E0.C2942q;
import Kk.C3532b;
import Tl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/presentation/PreOrderSubscriptionButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isSubscribed", "productId", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "subscribeButton", "unsubscribeButton", "<init>", "(JZJLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "copy", "(JZJLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/presentation/PreOrderSubscriptionButtonVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "getProductId", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSubscribeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getUnsubscribeButton", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PreOrderSubscriptionButtonVO implements c {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;
    private final long id;
    private final boolean isSubscribed;
    private final long productId;

    @NotNull
    private final ButtonV3Atom.LargeButton subscribeButton;

    @NotNull
    private final ButtonV3Atom.LargeButton unsubscribeButton;

    public PreOrderSubscriptionButtonVO(long j11, boolean z11, long j12, @NotNull ButtonV3Atom.LargeButton subscribeButton, @NotNull ButtonV3Atom.LargeButton unsubscribeButton) {
        Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
        Intrinsics.checkNotNullParameter(unsubscribeButton, "unsubscribeButton");
        this.id = j11;
        this.isSubscribed = z11;
        this.productId = j12;
        this.subscribeButton = subscribeButton;
        this.unsubscribeButton = unsubscribeButton;
    }

    public static /* synthetic */ PreOrderSubscriptionButtonVO copy$default(PreOrderSubscriptionButtonVO preOrderSubscriptionButtonVO, long j11, boolean z11, long j12, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = preOrderSubscriptionButtonVO.id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            z11 = preOrderSubscriptionButtonVO.isSubscribed;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            j12 = preOrderSubscriptionButtonVO.productId;
        }
        long j14 = j12;
        if ((i11 & 8) != 0) {
            largeButton = preOrderSubscriptionButtonVO.subscribeButton;
        }
        ButtonV3Atom.LargeButton largeButton3 = largeButton;
        if ((i11 & 16) != 0) {
            largeButton2 = preOrderSubscriptionButtonVO.unsubscribeButton;
        }
        return preOrderSubscriptionButtonVO.copy(j13, z12, j14, largeButton3, largeButton2);
    }

    @NotNull
    public final PreOrderSubscriptionButtonVO copy(long id2, boolean isSubscribed, long productId, @NotNull ButtonV3Atom.LargeButton subscribeButton, @NotNull ButtonV3Atom.LargeButton unsubscribeButton) {
        Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
        Intrinsics.checkNotNullParameter(unsubscribeButton, "unsubscribeButton");
        return new PreOrderSubscriptionButtonVO(id2, isSubscribed, productId, subscribeButton, unsubscribeButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreOrderSubscriptionButtonVO)) {
            return false;
        }
        PreOrderSubscriptionButtonVO preOrderSubscriptionButtonVO = (PreOrderSubscriptionButtonVO) other;
        return this.id == preOrderSubscriptionButtonVO.id && this.isSubscribed == preOrderSubscriptionButtonVO.isSubscribed && this.productId == preOrderSubscriptionButtonVO.productId && Intrinsics.d(this.subscribeButton, preOrderSubscriptionButtonVO.subscribeButton) && Intrinsics.d(this.unsubscribeButton, preOrderSubscriptionButtonVO.unsubscribeButton);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final long getProductId() {
        return this.productId;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSubscribeButton() {
        return this.subscribeButton;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getUnsubscribeButton() {
        return this.unsubscribeButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.unsubscribeButton.hashCode() + b.a(this.subscribeButton, Pk0.c.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.isSubscribed), 31, this.productId), 31);
    }

    /* renamed from: isSubscribed, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isSubscribed;
        long j12 = this.productId;
        ButtonV3Atom.LargeButton largeButton = this.subscribeButton;
        ButtonV3Atom.LargeButton largeButton2 = this.unsubscribeButton;
        StringBuilder c11 = Bl.b.c(j11, "PreOrderSubscriptionButtonVO(id=", ", isSubscribed=", z11);
        C2942q.f(c11, ", productId=", j12, ", subscribeButton=");
        c11.append(largeButton);
        c11.append(", unsubscribeButton=");
        c11.append(largeButton2);
        c11.append(")");
        return c11.toString();
    }
}
