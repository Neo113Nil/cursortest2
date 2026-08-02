package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2Config;", "Lj20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "parse", "(Lj20/b;)Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmptyStateV2Config implements InterfaceC7243a<EmptyStateV2WidgetDTO> {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public EmptyStateV2Config(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.supportedVersions = new long[]{2};
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
        return this.supportedVersions;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public EmptyStateV2WidgetDTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        final JsonParser jsonParser = this.jsonDeserializer;
        return new Function2<String, String, EmptyStateV2WidgetDTO>() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2Config$parse$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2WidgetDTO] */
            @Override // kotlin.jvm.functions.Function2
            public EmptyStateV2WidgetDTO invoke(String params, String state2) {
                JsonParser jsonParser2 = JsonParser.this;
                if (state2 != null) {
                    return jsonParser2.fromJson(state2, EmptyStateV2WidgetDTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }.invoke(null, state.b());
    }
}
