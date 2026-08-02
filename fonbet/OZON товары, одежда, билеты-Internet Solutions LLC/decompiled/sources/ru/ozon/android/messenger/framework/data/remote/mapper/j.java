package ru.ozon.android.messenger.framework.data.remote.mapper;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.messagefile.FileDTO;
import ru.ozon.android.messenger.blocks.messageimage.ImageDTO;
import ru.ozon.android.messenger.framework.data.remote.models.ComposedMessageInfo;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.u0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.y0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0;

/* loaded from: classes10.dex */
public final class j {
    @NotNull
    public static final ru.ozon.android.messenger.framework.data.remote.models.c a(@NotNull Object mapObject, @NotNull String localId, @NotNull String chatId, @NotNull u0 composedMessage) {
        y0 aVar;
        Intrinsics.checkNotNullParameter(mapObject, "mapObject");
        Intrinsics.checkNotNullParameter(localId, "localId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(composedMessage, "composedMessage");
        if (mapObject instanceof ImageDTO) {
            aVar = new y0.c((ImageDTO) mapObject);
        } else if (mapObject instanceof z0.e) {
            z0.e eVar = (z0.e) mapObject;
            aVar = new y0.d(eVar.d(), eVar.c());
        } else if (mapObject instanceof FileDTO) {
            aVar = new y0.b((FileDTO) mapObject);
        } else if (mapObject instanceof z0.a) {
            aVar = new y0.a(((z0.a) mapObject).c(), null, null);
        } else {
            if (!(mapObject instanceof z0.b)) {
                throw new IllegalArgumentException("unknown mapObject");
            }
            z0.b bVar = (z0.b) mapObject;
            aVar = new y0.a(bVar.d(), null, bVar.c());
        }
        return new ru.ozon.android.messenger.framework.data.remote.models.c(chatId, localId, aVar, b(composedMessage), null, null, 224);
    }

    @NotNull
    public static final ComposedMessageInfo b(@NotNull u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        return new ComposedMessageInfo(u0Var.a(), u0Var.b(), u0Var.c());
    }
}
