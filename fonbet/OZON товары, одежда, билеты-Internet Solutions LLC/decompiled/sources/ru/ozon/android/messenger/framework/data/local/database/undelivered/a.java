package ru.ozon.android.messenger.framework.data.local.database.undelivered;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;

/* loaded from: classes6.dex */
public interface a {
    Object a(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object b(@NotNull String str, @NotNull kotlin.coroutines.d<? super UndeliveredMessageEntity> dVar);

    Object c(@NotNull String str, @NotNull kotlin.coroutines.d<? super List<UndeliveredMessageEntity>> dVar);

    Object d(@NotNull kotlin.coroutines.d<? super Map<String, UndeliveredMessageEntity>> dVar);

    Object e(@NotNull UndeliveredMessageEntity undeliveredMessageEntity, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object f(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
