package ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data;

import Tc.b;
import e10.AbstractC6252b;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO;
import ru.ozon.app.android.fresh.common.widgets.header.CommonHeaderDTO;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u001d\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsConfig;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "headerApi", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;)V", "Lj20/b;", "state", "", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DetailedCheckoutProductsConfig extends AbstractC6252b {

    @NotNull
    private final JsonParser deserializer;

    @NotNull
    private final HeaderApi headerApi;
    public static final int $stable = 8;

    public DetailedCheckoutProductsConfig(@NotNull JsonParser deserializer, @NotNull HeaderApi headerApi) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(headerApi, "headerApi");
        this.deserializer = deserializer;
        this.headerApi = headerApi;
    }

    @Override // j20.InterfaceC7243a
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        DetailedCheckoutProductsDTO detailedCheckoutProductsDTO = (DetailedCheckoutProductsDTO) this.deserializer.fromJson(state.b(), DetailedCheckoutProductsDTO.class);
        b builder = C7714v.B();
        DetailedCheckoutProductsDTO.HeaderDTO header = detailedCheckoutProductsDTO.getHeader();
        if (header != null) {
            builder.add(this.headerApi.toHeaderDTO(new CommonHeaderDTO(header.getTitle(), header.getSubtitle(), null, null, null, null, null, new CommonHeaderDTO.MarginsDTO(header.getLeftMargin(), header.getTopMargin(), header.getRightMargin(), header.getBottomMargin()), state.c().c(), 124, null)));
        }
        builder.add(detailedCheckoutProductsDTO);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
