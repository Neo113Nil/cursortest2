package ru.ozon.android.messenger.framework.composer.di.component;

import WZ.l;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.screen.g;

/* loaded from: classes10.dex */
public interface e extends ru.ozon.android.messenger.framework.composer.analytics.di.a {

    public interface a {
        @NotNull
        e a(@NotNull Set set, @NotNull ru.ozon.android.messenger.framework.composer.di.a aVar, @NotNull ru.ozon.android.messenger.framework.core.initialization.di.c cVar, boolean z11);
    }

    @NotNull
    g getComposerScreenFactory();

    @NotNull
    l getTokenizedAnalytics();
}
