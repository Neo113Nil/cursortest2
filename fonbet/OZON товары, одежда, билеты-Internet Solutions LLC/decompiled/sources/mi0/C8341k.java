package mi0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.model.TraceEntity;

/* renamed from: mi0.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8341k implements InterfaceC8339i {
    @Override // mi0.InterfaceC8339i
    public final void a(@NotNull List<TraceEntity> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
    }

    @Override // mi0.InterfaceC8339i
    public final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
