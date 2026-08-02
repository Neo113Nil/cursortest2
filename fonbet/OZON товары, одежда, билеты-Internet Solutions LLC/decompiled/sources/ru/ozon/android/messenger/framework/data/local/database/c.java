package ru.ozon.android.messenger.framework.data.local.database;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;

/* loaded from: classes10.dex */
public interface c {
    Object a(@NotNull String str, @NotNull d<? super Unit> dVar);

    Object b(@NotNull String str, @NotNull d<? super UndeliveredMessageEntity> dVar);

    Object c(@NotNull String str, @NotNull d<? super Unit> dVar);

    Object d(@NotNull String str, @NotNull d<? super List<UndeliveredMessageEntity>> dVar);

    Object e(@NotNull d<? super Map<String, UndeliveredMessageEntity>> dVar);

    Object f(UndeliveredMessageEntity undeliveredMessageEntity, @NotNull d<? super Unit> dVar);
}
