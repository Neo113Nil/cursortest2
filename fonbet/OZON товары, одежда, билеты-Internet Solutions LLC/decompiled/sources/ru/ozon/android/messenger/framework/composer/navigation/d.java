package ru.ozon.android.messenger.framework.composer.navigation;

import android.os.Bundle;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d implements h {
    @Override // ru.ozon.android.messenger.framework.composer.navigation.h
    public final void a(@NotNull e destination, @NotNull G fragmentManager) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (destination instanceof c) {
            c cVar = (c) destination;
            ru.ozon.android.messenger.framework.composer.navigation.config.a composerPage = cVar.a();
            String displayMode = cVar.b().name();
            Intrinsics.checkNotNullParameter(composerPage, "composerPage");
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            ru.ozon.android.messenger.framework.composer.screen.bottomsheet.a aVar = new ru.ozon.android.messenger.framework.composer.screen.bottomsheet.a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("COMPOSER_PAGE", composerPage);
            bundle.putString("ARG_DISPLAY_MODE", displayMode);
            aVar.setArguments(bundle);
            Q p11 = fragmentManager.p();
            Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction(...)");
            aVar.show(p11, cVar.c());
            p11.g(cVar.a().b());
            fragmentManager.c0();
        }
    }
}
