package ru.ozon.android.messenger.framework.composer.commonwidgets.di;

import B0.A0;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.commonwidgets.di.b;
import ru.ozon.android.messenger.framework.composer.commonwidgets.di.e;
import ru.ozon.android.messenger.framework.di.C;

/* loaded from: classes6.dex */
public final class c implements InterfaceC7081a<b> {
    @Override // ii.InterfaceC7081a
    public final b create(C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        b.a a11 = e.a();
        if (ru.ozon.android.messenger.framework.composer.di.dependencies.a.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", ru.ozon.android.messenger.framework.composer.di.dependencies.a.class.getSimpleName(), " is not DiComponent"));
        }
        ru.ozon.android.messenger.framework.composer.di.dependencies.a aVar = (ru.ozon.android.messenger.framework.composer.di.dependencies.a) componentStorage.b(ru.ozon.android.messenger.framework.composer.di.dependencies.a.class);
        if (C.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", C.class.getSimpleName(), " is not DiComponent"));
        }
        return ((e.b) a11).a(aVar, (C) componentStorage.b(C.class));
    }
}
