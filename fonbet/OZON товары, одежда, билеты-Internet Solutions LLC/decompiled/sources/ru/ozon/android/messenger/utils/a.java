package ru.ozon.android.messenger.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
public final class a {
    @NotNull
    public static final AtomActionDTO a(@NotNull ru.ozon.android.messenger.framework.navigation.action.g action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, action.a(), null, 10, null);
    }
}
