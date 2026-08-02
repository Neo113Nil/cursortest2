package ru.ozon.android.messenger.framework.composer.navigation;

import androidx.fragment.app.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b implements h {
    @Override // ru.ozon.android.messenger.framework.composer.navigation.h
    public final void a(@NotNull e destination, @NotNull G fragmentManager) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (!(destination instanceof a) || fragmentManager.C0() || fragmentManager.H0()) {
            return;
        }
        fragmentManager.S0();
    }
}
