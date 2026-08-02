package ru.ozon.app.android.pdp.widgets.navTitle.core;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.widgets.navTitle.data.PdpNavTitleDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00132\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u0013B\u0015\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\f\u0010\rR4\u0010\u0011\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navTitle/core/PdpNavTitleConfig;", "Lj20/a;", "Lru/ozon/app/android/pdp/widgets/navTitle/data/PdpNavTitleDTO;", "Lru/ozon/composer/network/widget/config/StateConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "Lru/ozon/composer/network/widget/config/WidgetParsedState;", "state", "parse", "(Lj20/b;)Lru/ozon/app/android/pdp/widgets/navTitle/data/PdpNavTitleDTO;", "Lkotlin/Function2;", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "parser", "Lkotlin/jvm/functions/Function2;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PdpNavTitleConfig implements InterfaceC7243a<PdpNavTitleDTO> {

    @NotNull
    private final Function2<String, String, PdpNavTitleDTO> parser;

    public PdpNavTitleConfig(@NotNull final JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.parser = new Function2<String, String, PdpNavTitleDTO>() { // from class: ru.ozon.app.android.pdp.widgets.navTitle.core.PdpNavTitleConfig$special$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.pdp.widgets.navTitle.data.PdpNavTitleDTO] */
            @Override // kotlin.jvm.functions.Function2
            public PdpNavTitleDTO invoke(String params, String state) {
                JsonParser jsonParser = JsonParser.this;
                if (state != null) {
                    return jsonParser.fromJson(state, PdpNavTitleDTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        };
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
    public PdpNavTitleDTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return this.parser.invoke(null, state.b());
    }
}
