package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core;

import e10.AbstractC6252b;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0017B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/core/PromoReviewProductsV3Config;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/core/PromoReviewProductsV3Parser;", "promoReviewProductsV3Parser", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/core/PromoReviewProductsV3Parser;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PromoReviewProductsV3Config extends AbstractC6252b {

    @NotNull
    private final JsonParser deserializer;
    private PromoReviewProductsV3Parser promoReviewProductsV3Parser;

    @NotNull
    private final long[] supportedVersions;

    public PromoReviewProductsV3Config(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
        this.supportedVersions = new long[]{3};
    }

    @Override // e10.AbstractC6252b, j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return this.supportedVersions;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        List<? extends Object> invoke;
        Intrinsics.checkNotNullParameter(state, "state");
        PromoReviewProductsV3Parser promoReviewProductsV3Parser = this.promoReviewProductsV3Parser;
        if (promoReviewProductsV3Parser != null && (invoke = promoReviewProductsV3Parser.invoke((String) null, state.b())) != null) {
            return invoke;
        }
        PromoReviewProductsV3Parser promoReviewProductsV3Parser2 = new PromoReviewProductsV3Parser(this.deserializer);
        this.promoReviewProductsV3Parser = promoReviewProductsV3Parser2;
        return promoReviewProductsV3Parser2.invoke((String) null, state.b());
    }
}
