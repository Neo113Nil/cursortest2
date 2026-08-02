package ru.ozon.android.messenger.framework.composer.di;

import B0.A0;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.di.a;
import ru.ozon.android.messenger.framework.composer.di.d;

/* loaded from: classes6.dex */
public final class b implements InterfaceC7081a<a> {
    @Override // ii.InterfaceC7081a
    public final a create(C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        a.InterfaceC1540a a11 = d.a();
        if (ru.ozon.android.messenger.framework.core.initialization.di.c.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", ru.ozon.android.messenger.framework.core.initialization.di.c.class.getSimpleName(), " is not DiComponent"));
        }
        ru.ozon.android.messenger.framework.core.initialization.di.c cVar = (ru.ozon.android.messenger.framework.core.initialization.di.c) componentStorage.b(ru.ozon.android.messenger.framework.core.initialization.di.c.class);
        if (ru.ozon.android.messenger.framework.composer.commonwidgets.di.a.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", ru.ozon.android.messenger.framework.composer.commonwidgets.di.a.class.getSimpleName(), " is not DiComponent"));
        }
        return ((d.b) a11).a(cVar, (ru.ozon.android.messenger.framework.composer.commonwidgets.di.a) componentStorage.b(ru.ozon.android.messenger.framework.composer.commonwidgets.di.a.class));
    }
}
