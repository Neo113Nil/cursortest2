package k30;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.analytic.domain.health.HealthDataJsonAdapter;
import ru.ozon.fintech.analytic.models.HealthData;

/* loaded from: classes3.dex */
public final class d implements JsonAdapter.a {
    @Override // com.squareup.moshi.JsonAdapter.a
    public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.d(Ep.a.b(set, "annotations", moshi, "moshi", type), HealthData.class)) {
            return new HealthDataJsonAdapter(moshi);
        }
        return null;
    }
}
