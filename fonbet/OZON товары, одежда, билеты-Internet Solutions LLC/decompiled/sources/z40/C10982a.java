package z40;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.action.Cbottom2Action;
import ru.ozon.fintech.features.cbottombase.models.action.adapter.Cbottom2ActionAdapter;

/* renamed from: z40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10982a implements JsonAdapter.a {
    @Override // com.squareup.moshi.JsonAdapter.a
    public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.d(Ep.a.b(set, "annotations", moshi, "moshi", type), Cbottom2Action.class)) {
            return new Cbottom2ActionAdapter(moshi);
        }
        return null;
    }
}
