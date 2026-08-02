package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data;

import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.utils.FreshConfig;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB/\u0012&\u0010\u0006\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR:\u0010\u0006\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsConfig;", "Lru/ozon/app/android/fresh/main/utils/FreshConfig;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO;", "Lkotlin/Function2;", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "parser", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "getParser", "()Lkotlin/jvm/functions/Function2;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CatalogueTabsConfig implements FreshConfig<CatalogueTabsDTO> {

    @NotNull
    private final Function2<String, String, CatalogueTabsDTO> parser;

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogueTabsConfig(@NotNull Function2<? super String, ? super String, CatalogueTabsDTO> parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return FreshConfig.DefaultImpls.canParse(this, c7244b);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, CatalogueTabsDTO> getParser() {
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
    public CatalogueTabsDTO parse(@NotNull C7244b c7244b) {
        return (CatalogueTabsDTO) FreshConfig.DefaultImpls.parse(this, c7244b);
    }
}
