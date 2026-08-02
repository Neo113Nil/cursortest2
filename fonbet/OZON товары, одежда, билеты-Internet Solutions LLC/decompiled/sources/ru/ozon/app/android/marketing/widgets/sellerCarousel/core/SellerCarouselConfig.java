package ru.ozon.app.android.marketing.widgets.sellerCarousel.core;

import com.squareup.moshi.Moshi;
import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.Config;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.data.SellerCarouselDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselConfig;", "Lru/ozon/app/android/composer/widgets/base/Config;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerCarouselDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselParser;", "parser", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselParser;", "getParser", "()Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselParser;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerCarouselConfig implements Config<SellerCarouselDTO> {

    @NotNull
    private final Moshi moshi;

    @NotNull
    private final SellerCarouselParser parser;
    public static final int $stable = 8;

    public SellerCarouselConfig(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
        this.parser = new SellerCarouselParser(moshi);
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return Config.DefaultImpls.canParse(this, c7244b);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return Config.DefaultImpls.getSupportedPlaceholders(this);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return Config.DefaultImpls.getSupportedVersions(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, SellerCarouselDTO> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    public SellerCarouselDTO parse(@NotNull C7244b c7244b) {
        return (SellerCarouselDTO) Config.DefaultImpls.parse(this, c7244b);
    }
}
