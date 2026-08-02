package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.core;

import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "mercuryCertificatesAddressWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "", "searchState", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState;", "addressesState", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MercuryCertificatesAddressComposeWidgetKt {
    @NotNull
    public static final i mercuryCertificatesAddressWidget(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("checkoutFacade", "mercuryCertificatesAddress", null, new MercuryCertificatesAddressComposeWidgetKt$mercuryCertificatesAddressWidget$1(jsonDeserializer), 4, null);
    }
}
