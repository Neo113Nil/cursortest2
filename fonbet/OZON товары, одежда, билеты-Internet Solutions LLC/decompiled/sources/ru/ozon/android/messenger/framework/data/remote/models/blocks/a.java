package ru.ozon.android.messenger.framework.data.remote.models.blocks;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.b;

/* loaded from: classes10.dex */
public final class a {
    @NotNull
    public static final String a(@NotNull BlockDTO blockDTO) {
        Intrinsics.checkNotNullParameter(blockDTO, "<this>");
        String vertical = blockDTO.getVertical();
        if (vertical == null) {
            vertical = "messenger";
        }
        return b.a.a(vertical, blockDTO.getName());
    }
}
