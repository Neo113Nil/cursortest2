package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.data;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2Config;", "Lj20/a;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "parse", "(Lj20/b;)Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "", "", "supportedPlaceholders", "Ljava/util/Set;", "getSupportedPlaceholders", "()Ljava/util/Set;", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TransparentNavBarV2Config implements InterfaceC7243a<TransparentNavBarV2DTO> {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final Set<String> supportedPlaceholders;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public TransparentNavBarV2Config(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.supportedVersions = new long[]{2};
        this.supportedPlaceholders = e0.h("content");
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return this.supportedPlaceholders;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return this.supportedVersions;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public TransparentNavBarV2DTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        final JsonParser jsonParser = this.jsonDeserializer;
        return new Function2<String, String, TransparentNavBarV2DTO>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.data.TransparentNavBarV2Config$parse$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.data.TransparentNavBarV2DTO] */
            @Override // kotlin.jvm.functions.Function2
            public TransparentNavBarV2DTO invoke(String params, String state2) {
                JsonParser jsonParser2 = JsonParser.this;
                if (state2 != null) {
                    return jsonParser2.fromJson(state2, TransparentNavBarV2DTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }.invoke(null, state.b());
    }
}
