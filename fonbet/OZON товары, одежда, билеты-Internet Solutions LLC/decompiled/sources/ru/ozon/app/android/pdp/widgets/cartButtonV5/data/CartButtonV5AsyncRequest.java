package ru.ozon.app.android.pdp.widgets.cartButtonV5.data;

import HY.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5AsyncRequest;", "", "params", "", "", "<init>", "(Ljava/util/Map;)V", "getParams", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CartButtonV5AsyncRequest {
    public static final int $stable = 8;
    private final Map<String, String> params;

    public CartButtonV5AsyncRequest(Map<String, String> map) {
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartButtonV5AsyncRequest copy$default(CartButtonV5AsyncRequest cartButtonV5AsyncRequest, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = cartButtonV5AsyncRequest.params;
        }
        return cartButtonV5AsyncRequest.copy(map);
    }

    public final Map<String, String> component1() {
        return this.params;
    }

    @NotNull
    public final CartButtonV5AsyncRequest copy(Map<String, String> params) {
        return new CartButtonV5AsyncRequest(params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CartButtonV5AsyncRequest) && Intrinsics.d(this.params, ((CartButtonV5AsyncRequest) other).params);
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public int hashCode() {
        Map<String, String> map = this.params;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @NotNull
    public String toString() {
        return b.b("CartButtonV5AsyncRequest(params=", ")", this.params);
    }
}
