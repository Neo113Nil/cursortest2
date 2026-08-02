package ru.ozon.app.android.fresh.main.widgets.catalogShelf.data;

import j20.C7244b;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.utils.FreshConfig;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000b2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfConfig;", "Lru/ozon/app/android/fresh/main/utils/FreshConfig;", "", "", "catalogShelfParser", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfParser;", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfParser;)V", "parser", "getParser", "()Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfParser;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CatalogShelfConfig implements FreshConfig<List<? extends Object>> {

    @NotNull
    private final CatalogShelfParser parser;

    public CatalogShelfConfig(@NotNull CatalogShelfParser catalogShelfParser) {
        Intrinsics.checkNotNullParameter(catalogShelfParser, "catalogShelfParser");
        this.parser = catalogShelfParser;
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return FreshConfig.DefaultImpls.canParse(this, c7244b);
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

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public CatalogShelfParser getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    public List<Object> parse(@NotNull C7244b c7244b) {
        return (List) FreshConfig.DefaultImpls.parse(this, c7244b);
    }
}
