package ru.ozon.android.messenger.framework.data.cache;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.SocketEventDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.data.requests.GetMessagesResponseDTO;

/* loaded from: classes6.dex */
public interface f {
    Object a(@NotNull SocketEventDTO socketEventDTO, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object b(@NotNull ru.ozon.android.messenger.framework.data.requests.b bVar, @NotNull GetMessagesResponseDTO getMessagesResponseDTO, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    void c(@NotNull String str);

    void clearCache();

    void d(@NotNull String str, @NotNull ItemDTO itemDTO);

    Object e(@NotNull ru.ozon.android.messenger.framework.data.requests.b bVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<GetMessagesResponseDTO>> dVar);

    Unit f(@NotNull String str, @NotNull String str2);

    boolean g(@NotNull String str);
}
