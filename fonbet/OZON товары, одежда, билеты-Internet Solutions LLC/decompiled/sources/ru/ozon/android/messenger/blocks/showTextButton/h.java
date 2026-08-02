package ru.ozon.android.messenger.blocks.showTextButton;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class h implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86402a;

    h(ru.ozon.android.messenger.framework.core.d dVar) {
        this.f86402a = dVar;
    }

    @Override // androidx.lifecycle.z0.b
    public final <T extends w0> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        ru.ozon.android.messenger.framework.core.d dVar = this.f86402a;
        ru.ozon.android.messenger.framework.core.initialization.di.c component = dVar != null ? ru.ozon.android.messenger.utils.g.d(dVar.d()) : null;
        if (component == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Intrinsics.checkNotNullParameter(component, "component");
        c cVar = new c(new k(0));
        component.B(cVar);
        return cVar;
    }
}
