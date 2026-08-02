package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core;

import Jb.e;
import Pc.a;
import android.content.Context;

/* loaded from: classes2.dex */
public final class UniversalObjectGrid3Mapper_Factory implements e<UniversalObjectGrid3Mapper> {
    private final a<Context> contextProvider;

    public UniversalObjectGrid3Mapper_Factory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static UniversalObjectGrid3Mapper_Factory create(a<Context> aVar) {
        return new UniversalObjectGrid3Mapper_Factory(aVar);
    }

    public static UniversalObjectGrid3Mapper newInstance(Context context) {
        return new UniversalObjectGrid3Mapper(context);
    }

    @Override // Pc.a
    public UniversalObjectGrid3Mapper get() {
        return newInstance(this.contextProvider.get());
    }
}
