package ru.ozon.app.android.cart.checkoutPrefetch.presentation.vo;

import Ih.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lru/ozon/app/android/cart/checkoutPrefetch/presentation/vo/CheckoutPrefetchVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "referer", "asyncData", "<init>", "(JLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/cart/checkoutPrefetch/presentation/vo/CheckoutPrefetchVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/lang/String;", "getReferer", "getAsyncData", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CheckoutPrefetchVO implements c {

    @NotNull
    private final AtomActionDTO action;
    private final String asyncData;
    private final long id;
    private final String referer;

    public CheckoutPrefetchVO(long j11, @NotNull AtomActionDTO action, String str, String str2) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.action = action;
        this.referer = str;
        this.asyncData = str2;
    }

    public static /* synthetic */ CheckoutPrefetchVO copy$default(CheckoutPrefetchVO checkoutPrefetchVO, long j11, AtomActionDTO atomActionDTO, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = checkoutPrefetchVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            atomActionDTO = checkoutPrefetchVO.action;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        if ((i11 & 4) != 0) {
            str = checkoutPrefetchVO.referer;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            str2 = checkoutPrefetchVO.asyncData;
        }
        return checkoutPrefetchVO.copy(j12, atomActionDTO2, str3, str2);
    }

    @NotNull
    public final CheckoutPrefetchVO copy(long id2, @NotNull AtomActionDTO action, String referer, String asyncData) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new CheckoutPrefetchVO(id2, action, referer, asyncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutPrefetchVO)) {
            return false;
        }
        CheckoutPrefetchVO checkoutPrefetchVO = (CheckoutPrefetchVO) other;
        return this.id == checkoutPrefetchVO.id && Intrinsics.d(this.action, checkoutPrefetchVO.action) && Intrinsics.d(this.referer, checkoutPrefetchVO.referer) && Intrinsics.d(this.asyncData, checkoutPrefetchVO.asyncData);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getReferer() {
        return this.referer;
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
        int b11 = a.b(this.action, Long.hashCode(this.id) * 31, 31);
        String str = this.referer;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.asyncData;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.referer;
        String str2 = this.asyncData;
        StringBuilder sb2 = new StringBuilder("CheckoutPrefetchVO(id=");
        sb2.append(j11);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        Nh.a.h(sb2, ", referer=", str, ", asyncData=", str2);
        sb2.append(")");
        return sb2.toString();
    }
}
