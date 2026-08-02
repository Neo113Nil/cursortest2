package ru.ozon.android.messenger.framework.composer.screen;

import B0.A0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c extends z0.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f86773a;

    public c(d dVar) {
        this.f86773a = dVar;
    }

    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
    public final <T extends w0> T create(Class<T> modelClass) {
        Set set;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        d dVar = this.f86773a;
        boolean m11 = dVar.f().d() != null ? false : dVar.f().m();
        ru.ozon.android.messenger.framework.core.initialization.di.c d11 = ru.ozon.android.messenger.utils.g.d(dVar.h());
        C6740b dependencyStorage = ru.ozon.android.messenger.utils.g.a(dVar.h()).getDependencyStorage();
        if (ru.ozon.android.messenger.framework.composer.di.a.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException(A0.b("Requested component ", ru.ozon.android.messenger.framework.composer.di.a.class.getSimpleName(), " is not DiComponent"));
        }
        ru.ozon.android.messenger.framework.composer.di.a aVar = (ru.ozon.android.messenger.framework.composer.di.a) dependencyStorage.b(ru.ozon.android.messenger.framework.composer.di.a.class);
        set = dVar.f86778e;
        return new ru.ozon.android.messenger.framework.composer.viewmodel.c(set, aVar, d11, m11);
    }
}
