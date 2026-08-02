package ru.ozon.app.android.returns.list.data;

import j20.C7244b;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.Config;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/returns/list/data/ReturnListConfig;", "Lru/ozon/app/android/composer/widgets/base/Config;", "", "", "parser", "Lru/ozon/app/android/returns/list/data/ReturnListParser;", "<init>", "(Lru/ozon/app/android/returns/list/data/ReturnListParser;)V", "getParser", "()Lru/ozon/app/android/returns/list/data/ReturnListParser;", "supportedVersions", "", "getSupportedVersions", "()[J", "Companion", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnListConfig implements Config<List<? extends Object>> {

    @NotNull
    private final ReturnListParser parser;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public ReturnListConfig(@NotNull ReturnListParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
        this.supportedVersions = new long[]{2};
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
    public Function2<String, String, List<? extends Object>> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    public List<Object> parse(@NotNull C7244b c7244b) {
        return (List) Config.DefaultImpls.parse(this, c7244b);
    }
}
