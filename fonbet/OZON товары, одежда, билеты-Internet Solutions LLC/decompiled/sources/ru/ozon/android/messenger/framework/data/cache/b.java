package ru.ozon.android.messenger.framework.data.cache;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.SocketEventDTO;
import ru.ozon.android.messenger.framework.data.requests.GetChatsRequest;
import ru.ozon.android.messenger.framework.data.requests.GetChatsResponseDTO;

/* loaded from: classes6.dex */
public interface b {
    Object a(@NotNull SocketEventDTO socketEventDTO, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object b(@NotNull GetChatsRequest getChatsRequest, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<GetChatsResponseDTO>> dVar);

    Object c(@NotNull GetChatsRequest getChatsRequest, @NotNull GetChatsResponseDTO getChatsResponseDTO, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    void clearCache();

    boolean d();
}
