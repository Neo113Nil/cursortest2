package ru.ozon.app.android.storefront.navBar;

import j20.C7244b;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.base.Config;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R:\u0010\u000b\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000fj\b\u0012\u0004\u0012\u00020\t`\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarConfig;", "Lru/ozon/app/android/composer/widgets/base/Config;", "Lru/ozon/app/android/storefront/navBar/NavBarDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lkotlin/Function2;", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "parser", "Lkotlin/jvm/functions/Function2;", "getParser", "()Lkotlin/jvm/functions/Function2;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "supportedPlaceholders$1", "Ljava/util/HashSet;", "getSupportedPlaceholders", "()Ljava/util/HashSet;", "supportedPlaceholders", "Companion", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavBarConfig implements Config<NavBarDTO> {

    @NotNull
    private static final HashSet<String> supportedPlaceholders = e0.a("left", "default", "right", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED);

    @NotNull
    private final Function2<String, String, NavBarDTO> parser;

    /* renamed from: supportedPlaceholders$1, reason: from kotlin metadata */
    @NotNull
    private final HashSet<String> supportedPlaceholders;

    public NavBarConfig(@NotNull final JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.parser = new Function2<String, String, NavBarDTO>() { // from class: ru.ozon.app.android.storefront.navBar.NavBarConfig$special$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.storefront.navBar.NavBarDTO] */
            @Override // kotlin.jvm.functions.Function2
            public NavBarDTO invoke(String params, String state) {
                JsonParser jsonParser = JsonParser.this;
                if (state != null) {
                    return jsonParser.fromJson(state, NavBarDTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        };
        this.supportedPlaceholders = supportedPlaceholders;
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return Config.DefaultImpls.canParse(this, c7244b);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, NavBarDTO> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return Config.DefaultImpls.getSupportedVersions(this);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public HashSet<String> getSupportedPlaceholders() {
        return this.supportedPlaceholders;
    }

    @Override // j20.InterfaceC7243a
    public NavBarDTO parse(@NotNull C7244b c7244b) {
        return (NavBarDTO) Config.DefaultImpls.parse(this, c7244b);
    }
}
