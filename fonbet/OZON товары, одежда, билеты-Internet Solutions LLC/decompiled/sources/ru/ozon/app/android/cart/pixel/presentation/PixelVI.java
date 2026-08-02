package ru.ozon.app.android.cart.pixel.presentation;

import Ak.C2436a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncUpdateTag;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/pixel/presentation/PixelVI;", "Ll20/c;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncUpdateTag;", "", "id", "", "anchor", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAnchor", "getTag", "tag", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PixelVI implements c, AsyncUpdateTag {

    @NotNull
    private final String anchor;
    private final long id;

    public PixelVI(long j11, @NotNull String anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.id = j11;
        this.anchor = anchor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PixelVI)) {
            return false;
        }
        PixelVI pixelVI = (PixelVI) other;
        return this.id == pixelVI.id && Intrinsics.d(this.anchor, pixelVI.anchor);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncUpdateTag
    @NotNull
    /* renamed from: getTag, reason: from getter */
    public String getAnchor() {
        return this.anchor;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.anchor.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder c11 = C2436a.c(this.id, "PixelVI(id=", ", anchor=", this.anchor);
        c11.append(")");
        return c11.toString();
    }
}
