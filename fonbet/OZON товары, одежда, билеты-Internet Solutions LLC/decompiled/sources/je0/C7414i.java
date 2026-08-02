package je0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.SimpleAnalyticModuleState;
import ru.ozon.mapsdk.common.geoproxy.model.PreferredProvider;

/* renamed from: je0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7414i extends AbstractC7409d {

    /* renamed from: je0.i$a */
    public static final class a {
        @NotNull
        public static C7414i a(@NotNull SimpleAnalyticModuleState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            C7414i c7414i = new C7414i();
            c7414i.h(state.getActualBXTab());
            c7414i.j(state.getPriorityProviderConfig());
            c7414i.i(state.getDefaultProviderConfig());
            c7414i.g();
            return c7414i;
        }
    }

    @Override // je0.AbstractC7409d
    public final List<String> d(@NotNull PreferredProvider.Type providerType) {
        Intrinsics.checkNotNullParameter(providerType, "providerType");
        return e(providerType);
    }
}
