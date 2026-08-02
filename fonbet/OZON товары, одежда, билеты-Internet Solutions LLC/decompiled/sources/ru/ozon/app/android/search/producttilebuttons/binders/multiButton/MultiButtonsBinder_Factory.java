package ru.ozon.app.android.search.producttilebuttons.binders.multiButton;

import Jb.e;
import Pc.a;

/* loaded from: classes13.dex */
public final class MultiButtonsBinder_Factory implements e<MultiButtonsBinder> {
    private final a<MultiButtonItemBinder> pMultiButtonItemBinderProvider;

    public MultiButtonsBinder_Factory(a<MultiButtonItemBinder> aVar) {
        this.pMultiButtonItemBinderProvider = aVar;
    }

    public static MultiButtonsBinder_Factory create(a<MultiButtonItemBinder> aVar) {
        return new MultiButtonsBinder_Factory(aVar);
    }

    public static MultiButtonsBinder newInstance(a<MultiButtonItemBinder> aVar) {
        return new MultiButtonsBinder(aVar);
    }

    @Override // Pc.a
    public MultiButtonsBinder get() {
        return newInstance(this.pMultiButtonItemBinderProvider);
    }
}
