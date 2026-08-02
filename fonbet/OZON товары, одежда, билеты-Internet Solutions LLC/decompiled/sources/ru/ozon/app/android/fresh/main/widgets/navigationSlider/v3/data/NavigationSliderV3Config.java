package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data;

import j20.C7244b;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.utils.FreshConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR6\u0010\u0010\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3Config;", "Lru/ozon/app/android/fresh/main/utils/FreshConfig;", "", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavSliderV3Parser;", "jsonParser", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavSliderV3Parser;)V", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavSliderV3Parser;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Lkotlin/Function2;", "", "parser", "Lkotlin/jvm/functions/Function2;", "getParser", "()Lkotlin/jvm/functions/Function2;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigationSliderV3Config implements FreshConfig<List<? extends Object>> {

    @NotNull
    private final NavSliderV3Parser jsonParser;

    @NotNull
    private final Function2<String, String, List<Object>> parser;

    @NotNull
    private final long[] supportedVersions;

    public NavigationSliderV3Config(@NotNull NavSliderV3Parser jsonParser) {
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.jsonParser = jsonParser;
        this.supportedVersions = new long[]{3};
        this.parser = new NavigationSliderV3Config$parser$1(this);
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return FreshConfig.DefaultImpls.canParse(this, c7244b);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, List<Object>> getParser() {
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
        return this.supportedVersions;
    }

    @NotNull
    public String getVertical() {
        return FreshConfig.DefaultImpls.getVertical(this);
    }

    @Override // j20.InterfaceC7243a
    public List<Object> parse(@NotNull C7244b c7244b) {
        return (List) FreshConfig.DefaultImpls.parse(this, c7244b);
    }
}
