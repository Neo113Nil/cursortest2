package ru.ozon.app.android.fresh.main.widgets.promoCarousel.data;

import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.utils.FreshConfig;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R0\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselConfig;", "Lru/ozon/app/android/fresh/main/utils/FreshConfig;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselWidgetParser;", "jsonParser", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselWidgetParser;)V", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselWidgetParser;", "Lkotlin/Function2;", "", "parser", "Lkotlin/jvm/functions/Function2;", "getParser", "()Lkotlin/jvm/functions/Function2;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromoCarouselConfig implements FreshConfig<PromoCarouselDTO> {

    @NotNull
    private final PromoCarouselWidgetParser jsonParser;

    @NotNull
    private final Function2<String, String, PromoCarouselDTO> parser;

    public PromoCarouselConfig(@NotNull PromoCarouselWidgetParser jsonParser) {
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.jsonParser = jsonParser;
        this.parser = new PromoCarouselConfig$parser$1(this);
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return FreshConfig.DefaultImpls.canParse(this, c7244b);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, PromoCarouselDTO> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return FreshConfig.DefaultImpls.getSupportedPlaceholders(this);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return FreshConfig.DefaultImpls.getSupportedVersions(this);
    }

    @NotNull
    public String getVertical() {
        return FreshConfig.DefaultImpls.getVertical(this);
    }

    @Override // j20.InterfaceC7243a
    public PromoCarouselDTO parse(@NotNull C7244b c7244b) {
        return (PromoCarouselDTO) FreshConfig.DefaultImpls.parse(this, c7244b);
    }
}
