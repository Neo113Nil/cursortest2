package ru.ozon.android.messenger.framework.data.remote.parser;

import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.RpcResponseDTO;
import ru.ozon.android.messenger.framework.data.remote.models.WebSocketMessageDTO;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public interface e {
    @NotNull
    <R> i<R> a(@NotNull RpcResponseDTO rpcResponseDTO, @NotNull Class<R> cls);

    WebSocketMessageDTO b(@NotNull String str);
}
