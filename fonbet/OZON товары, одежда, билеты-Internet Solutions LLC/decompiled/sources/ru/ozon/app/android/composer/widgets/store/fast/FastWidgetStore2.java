package ru.ozon.app.android.composer.widgets.store.fast;

import ed.C6345a;
import hi.InterfaceC6958a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import k20.C7471c;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.C8425e;
import n20.C8426f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0015\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u0010\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/composer/widgets/store/fast/FastWidgetStore2;", "Ln20/e;", "Lm20/a;", "Ll20/c;", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "widgets", "Lk20/g;", "storage", "<init>", "(Ljava/util/Set;Lk20/g;)V", "viewMapper", "", "linkComponent", "(Lm20/a;)V", "", "key", "", "version", "", "Ln20/f;", "getViewMappers", "(Ljava/lang/String;J)Ljava/util/Collection;", "", "getViewMapper", "(I)Lm20/a;", "Lk20/g;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FastWidgetStore2 extends C8425e<InterfaceC8046a<?, ? extends c>> {

    @NotNull
    private final C7475g storage;

    public FastWidgetStore2(@NotNull Set<Widget2> widgets, @NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
        for (Widget2 widget2 : widgets) {
            for (ViewMapper2<? extends InterfaceC6958a, ? extends Object, ? extends c> viewMapper2 : widget2.getViewMappers$composer_prodGoogleAllVendorsRelease()) {
                C7475g c7475g = this.storage;
                c7475g.a(viewMapper2.widgetComponentProvider(c7475g));
            }
            insert(widget2);
        }
    }

    private final void linkComponent(InterfaceC8046a<?, ? extends c> viewMapper) {
        ViewMapper2 viewMapper2;
        C7473e<? extends InterfaceC6958a> widgetComponentProvider;
        if ((viewMapper instanceof ViewMapper2) && (widgetComponentProvider = (viewMapper2 = (ViewMapper2) viewMapper).widgetComponentProvider(this.storage)) != C7471c.f70357c) {
            this.storage.a(widgetComponentProvider);
            viewMapper2.linkComponent(this.storage.getComponent(C6345a.b(widgetComponentProvider.a())));
        }
    }

    @Override // n20.C8425e, n20.k
    public InterfaceC8046a<?, ? extends c> getViewMapper(int key) {
        InterfaceC8046a<?, ? extends c> viewMapper = super.getViewMapper(key);
        if (viewMapper == null) {
            return null;
        }
        linkComponent(viewMapper);
        return viewMapper;
    }

    @Override // n20.C8425e, n20.k
    public Collection<C8426f<InterfaceC8046a<?, ? extends c>>> getViewMappers(@NotNull String key, long version) {
        Intrinsics.checkNotNullParameter(key, "key");
        Collection<C8426f<InterfaceC8046a<?, ? extends c>>> viewMappers = super.getViewMappers(key, version);
        if (viewMappers == null) {
            return null;
        }
        Collection<C8426f<InterfaceC8046a<?, ? extends c>>> collection = viewMappers;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkComponent(((C8426f) it.next()).b());
        }
        return collection;
    }
}
