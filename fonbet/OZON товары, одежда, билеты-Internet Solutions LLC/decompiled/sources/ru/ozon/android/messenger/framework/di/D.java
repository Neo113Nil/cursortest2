package ru.ozon.android.messenger.framework.di;

import android.content.Context;
import ei0.InterfaceC6369b;
import gi.C6740b;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.d;

/* loaded from: classes6.dex */
public interface D {

    public interface a {
        @NotNull
        D a(@NotNull Context context, @NotNull d.f fVar, @NotNull We.E e11, @NotNull ru.ozon.android.messenger.framework.core.initialization.d dVar, @NotNull ru.ozon.android.messenger.framework.core.c cVar, ru.ozon.android.messenger.framework.logger.b bVar, @NotNull d.e eVar, @NotNull Set<ru.ozon.android.messenger.framework.core.a> set, @NotNull d.g gVar, d.InterfaceC1560d interfaceC1560d, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull ru.ozon.android.messenger.framework.navigation.action.f fVar2, @NotNull d.b bVar2, @NotNull ru.ozon.android.messenger.framework.core.initialization.a aVar, InterfaceC6369b interfaceC6369b);
    }

    @NotNull
    C6740b getComponentStorage();
}
