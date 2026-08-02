package ru.ozon.app.android.composer.widgets.base.config;

import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.Config;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\t\u0010\nR)\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/composer/widgets/base/config/UndisplayedWidgetConfig;", "Lru/ozon/app/android/composer/widgets/base/Config;", "", "<init>", "()V", "", "params", "state", "Lru/ozon/app/android/composer/widgets/base/config/ParseResult;", "parseResult", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/composer/widgets/base/config/ParseResult;", "Lkotlin/Function2;", "getParser", "()Lkotlin/jvm/functions/Function2;", "parser", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class UndisplayedWidgetConfig implements Config<Unit> {
    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return Config.DefaultImpls.canParse(this, c7244b);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public final Function2<String, String, Unit> getParser() {
        return new UndisplayedWidgetConfig$parser$1(this);
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

    @NotNull
    public abstract ParseResult parseResult(String params, String state);

    @Override // j20.InterfaceC7243a
    public Unit parse(@NotNull C7244b c7244b) {
        return (Unit) Config.DefaultImpls.parse(this, c7244b);
    }
}
