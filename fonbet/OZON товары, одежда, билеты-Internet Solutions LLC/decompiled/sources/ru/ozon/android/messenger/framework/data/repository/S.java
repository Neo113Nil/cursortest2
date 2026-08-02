package ru.ozon.android.messenger.framework.data.repository;

import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;

/* loaded from: classes10.dex */
public interface S {
    Object a(@NotNull String str, @NotNull String str2, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object b(@NotNull String str, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<ru.ozon.android.messenger.blocks.input.b>> dVar);

    Object c(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object d(@NotNull String str, @NotNull CustomBlockDTO customBlockDTO, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object e(@NotNull String str, @NotNull List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object f(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object g(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
