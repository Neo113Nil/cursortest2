package ru.ozon.app.android.storefront.stories.setContainer;

import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.base.Config;
import ru.ozon.app.android.storefront.stories.setContainer.data.SetContainerDTO;
import ru.ozon.app.android.storefront.stories.setContainer.parser.SetContainerParser;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0015\b\u0007\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/SetContainerConfig;", "Lru/ozon/app/android/composer/widgets/base/Config;", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerDTO;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "parser", "Lru/ozon/app/android/storefront/stories/setContainer/parser/SetContainerParser;", "getParser", "()Lru/ozon/app/android/storefront/stories/setContainer/parser/SetContainerParser;", "supportedPlaceholders", "", "", "getSupportedPlaceholders", "()Ljava/util/Set;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetContainerConfig implements Config<SetContainerDTO> {

    @NotNull
    private final SetContainerParser parser;

    @NotNull
    private final Set<String> supportedPlaceholders;
    public static final int $stable = 8;

    public SetContainerConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.parser = new SetContainerParser();
        this.supportedPlaceholders = e0.h("default");
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return Config.DefaultImpls.canParse(this, c7244b);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return this.supportedPlaceholders;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return Config.DefaultImpls.getSupportedVersions(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, SetContainerDTO> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    public SetContainerDTO parse(@NotNull C7244b c7244b) {
        return (SetContainerDTO) Config.DefaultImpls.parse(this, c7244b);
    }
}
