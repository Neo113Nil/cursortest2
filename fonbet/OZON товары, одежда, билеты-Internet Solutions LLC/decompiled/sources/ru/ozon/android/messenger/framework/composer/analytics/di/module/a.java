package ru.ozon.android.messenger.framework.composer.analytics.di.module;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.sendEvent.Page;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements ZZ.a {
    @Override // ZZ.a
    public final Page convert(Rg.a screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return ru.ozon.android.messenger.framework.composer.analytics.a.a(screen);
    }
}
