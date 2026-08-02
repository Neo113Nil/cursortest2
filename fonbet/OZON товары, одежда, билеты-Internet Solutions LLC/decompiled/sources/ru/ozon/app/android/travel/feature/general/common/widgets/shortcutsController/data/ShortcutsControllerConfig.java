package ru.ozon.app.android.travel.feature.general.common.widgets.shortcutsController.data;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u000f2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u000fB\u0015\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/shortcutsController/data/ShortcutsControllerConfig;", "Lj20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/shortcutsController/data/ShortcutsControllerDTO;", "Lru/ozon/composer/network/widget/config/StateConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "Lru/ozon/composer/network/widget/config/WidgetParsedState;", "state", "parse", "(Lj20/b;)Lru/ozon/app/android/travel/feature/general/common/widgets/shortcutsController/data/ShortcutsControllerDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShortcutsControllerConfig implements InterfaceC7243a<ShortcutsControllerDTO> {

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public ShortcutsControllerConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return j.b();
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public ShortcutsControllerDTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        JsonParser jsonParser = this.jsonDeserializer;
        String b11 = state.b();
        if (b11 != null) {
            return (ShortcutsControllerDTO) jsonParser.fromJson(b11, ShortcutsControllerDTO.class);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
