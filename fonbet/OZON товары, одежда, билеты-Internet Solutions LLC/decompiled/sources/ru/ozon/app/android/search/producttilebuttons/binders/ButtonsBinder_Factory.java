package ru.ozon.app.android.search.producttilebuttons.binders;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.search.producttilebuttons.binders.multiButton.MultiButtonsBinder;

/* loaded from: classes13.dex */
public final class ButtonsBinder_Factory implements e<ButtonsBinder> {
    private final a<MultiButtonsBinder> multiButtonsBinderProvider;

    public ButtonsBinder_Factory(a<MultiButtonsBinder> aVar) {
        this.multiButtonsBinderProvider = aVar;
    }

    public static ButtonsBinder_Factory create(a<MultiButtonsBinder> aVar) {
        return new ButtonsBinder_Factory(aVar);
    }

    public static ButtonsBinder newInstance(MultiButtonsBinder multiButtonsBinder) {
        return new ButtonsBinder(multiButtonsBinder);
    }

    @Override // Pc.a
    public ButtonsBinder get() {
        return newInstance(this.multiButtonsBinderProvider.get());
    }
}
