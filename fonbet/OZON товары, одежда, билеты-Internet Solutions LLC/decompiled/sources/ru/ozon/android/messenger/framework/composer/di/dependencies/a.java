package ru.ozon.android.messenger.framework.composer.di.dependencies;

import ei0.InterfaceC6369b;
import hi.InterfaceC6958a;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.android.messenger.framework.composer.navigation.router.c;

/* loaded from: classes6.dex */
public interface a extends InterfaceC6958a {
    @NotNull
    c C();

    @NotNull
    ru.ozon.android.messenger.framework.core.initialization.a n();

    i o();

    @NotNull
    Set<ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a> provideDeeplinkHandlers();

    InterfaceC6369b s();

    @NotNull
    ru.ozon.android.messenger.framework.composer.network.serialization.a v();
}
