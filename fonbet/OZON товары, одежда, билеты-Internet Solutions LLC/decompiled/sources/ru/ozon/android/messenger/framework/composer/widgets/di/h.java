package ru.ozon.android.messenger.framework.composer.widgets.di;

import B0.A0;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.di.a;
import ru.ozon.android.messenger.framework.di.C;
import ru.ozon.android.messenger.framework.di.F;
import ru.ozon.android.messenger.framework.di.x;

/* loaded from: classes6.dex */
public final class h implements InterfaceC7081a<g> {
    @Override // ii.InterfaceC7081a
    public final g create(C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        if (x.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", x.class.getSimpleName(), " is not DiComponent"));
        }
        x xVar = (x) componentStorage.b(x.class);
        if (ru.ozon.android.messenger.framework.composer.network.di.b.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", ru.ozon.android.messenger.framework.composer.network.di.b.class.getSimpleName(), " is not DiComponent"));
        }
        ru.ozon.android.messenger.framework.composer.network.di.b bVar = (ru.ozon.android.messenger.framework.composer.network.di.b) componentStorage.b(ru.ozon.android.messenger.framework.composer.network.di.b.class);
        if (ru.ozon.android.messenger.framework.composer.di.dependencies.a.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", ru.ozon.android.messenger.framework.composer.di.dependencies.a.class.getSimpleName(), " is not DiComponent"));
        }
        ru.ozon.android.messenger.framework.composer.di.dependencies.a aVar = (ru.ozon.android.messenger.framework.composer.di.dependencies.a) componentStorage.b(ru.ozon.android.messenger.framework.composer.di.dependencies.a.class);
        if (F.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", F.class.getSimpleName(), " is not DiComponent"));
        }
        F f7 = (F) componentStorage.b(F.class);
        if (ru.ozon.android.messenger.framework.composer.commonwidgets.di.a.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", ru.ozon.android.messenger.framework.composer.commonwidgets.di.a.class.getSimpleName(), " is not DiComponent"));
        }
        ru.ozon.android.messenger.framework.composer.commonwidgets.di.a aVar2 = (ru.ozon.android.messenger.framework.composer.commonwidgets.di.a) componentStorage.b(ru.ozon.android.messenger.framework.composer.commonwidgets.di.a.class);
        if (C.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", C.class.getSimpleName(), " is not DiComponent"));
        }
        C c11 = (C) componentStorage.b(C.class);
        return ((a.C1552a) a.a()).a(xVar.h(), bVar.w(), bVar.k(), bVar.e(), aVar, f7, aVar2, c11);
    }
}
