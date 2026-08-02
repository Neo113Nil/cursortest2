package ej;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.inAppUpdate.internal.network.CheckUpdateResponseDTO;
import ru.ozon.android.inAppUpdate.internal.ui.e;

/* renamed from: ej.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6373b {
    @NotNull
    public static e.C1451e a(@NotNull CheckUpdateResponseDTO response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new e.C1451e(response);
    }
}
