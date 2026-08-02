package ru.ozon.app.android.pdp.widgets.installmentPurchase.core;

import j20.C7244b;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.Config;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00102\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/InstallmentPurchaseConfig;", "Lru/ozon/app/android/composer/widgets/base/Config;", "", "", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/InstallmentPurchaseParser;", "parser", "<init>", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/InstallmentPurchaseParser;)V", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/InstallmentPurchaseParser;", "getParser", "()Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/InstallmentPurchaseParser;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstallmentPurchaseConfig implements Config<List<Object>> {

    @NotNull
    private final InstallmentPurchaseParser parser;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public InstallmentPurchaseConfig(@NotNull InstallmentPurchaseParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
        this.supportedVersions = new long[]{3};
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
        return this.supportedVersions;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, List<Object>> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    public List<Object> parse(@NotNull C7244b c7244b) {
        return (List) Config.DefaultImpls.parse(this, c7244b);
    }
}
