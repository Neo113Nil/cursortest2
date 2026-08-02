package ru.ozon.android.messenger.framework.composer.navigation;

import android.os.Bundle;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.screen.b;
import ru.ozon.app.android.messenger.R$id;

/* loaded from: classes10.dex */
public final class g implements h {
    @Override // ru.ozon.android.messenger.framework.composer.navigation.h
    public final void a(@NotNull e destination, @NotNull G fragmentManager) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (destination instanceof f) {
            f fVar = (f) destination;
            ru.ozon.android.messenger.framework.composer.navigation.config.a composerPage = fVar.a();
            b.a b11 = fVar.b();
            Intrinsics.checkNotNullParameter(composerPage, "composerPage");
            ru.ozon.android.messenger.framework.composer.screen.b bVar = new ru.ozon.android.messenger.framework.composer.screen.b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("COMPOSER_PAGE", composerPage);
            bundle.putSerializable("ARG_DISPLAY_MODE", b11);
            bVar.setArguments(bundle);
            String c11 = fVar.c();
            Q p11 = fragmentManager.p();
            p11.r(R$id.fragmentChatContainer, bVar, c11);
            p11.g(c11);
            p11.i();
        }
    }
}
