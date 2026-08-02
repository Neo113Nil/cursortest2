package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import Sc.InterfaceC4008j;
import Sc.k;
import e10.AbstractC6252b;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.serialize.JsonSerializer;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u00060\u0001j\u0002`\u0002:\u0001\u001dB\u001d\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u00020\u00168\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2SubWidgetsConfig;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "serializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/network/serialize/JsonSerializer;)V", "Lj20/b;", "state", "", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2Parser;", "cartSplitV2Parser$delegate", "LSc/j;", "getCartSplitV2Parser", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2Parser;", "cartSplitV2Parser", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "getSupportedVersions$annotations", "()V", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSplitV2SubWidgetsConfig extends AbstractC6252b {

    /* renamed from: cartSplitV2Parser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cartSplitV2Parser;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public CartSplitV2SubWidgetsConfig(@NotNull JsonParser deserializer, @NotNull JsonSerializer serializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.cartSplitV2Parser = k.b(new CartSplitV2SubWidgetsConfig$cartSplitV2Parser$2(deserializer, serializer));
        this.supportedVersions = new long[]{2};
    }

    private final CartSplitV2Parser getCartSplitV2Parser() {
        return (CartSplitV2Parser) this.cartSplitV2Parser.getValue();
    }

    @Override // e10.AbstractC6252b, j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return this.supportedVersions;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return getCartSplitV2Parser().invoke((String) null, state.b());
    }
}
