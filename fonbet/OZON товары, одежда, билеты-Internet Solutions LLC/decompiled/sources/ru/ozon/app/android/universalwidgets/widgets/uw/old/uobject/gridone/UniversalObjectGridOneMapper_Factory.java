package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone;

import Jb.e;
import Pc.a;
import android.content.Context;

/* loaded from: classes2.dex */
public final class UniversalObjectGridOneMapper_Factory implements e<UniversalObjectGridOneMapper> {
    private final a<Context> contextProvider;

    public UniversalObjectGridOneMapper_Factory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static UniversalObjectGridOneMapper_Factory create(a<Context> aVar) {
        return new UniversalObjectGridOneMapper_Factory(aVar);
    }

    public static UniversalObjectGridOneMapper newInstance(Context context) {
        return new UniversalObjectGridOneMapper(context);
    }

    @Override // Pc.a
    public UniversalObjectGridOneMapper get() {
        return newInstance(this.contextProvider.get());
    }
}
