package ru.ozon.app.android.composer.widgets.v2.overlay;

import c20.r;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b'\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u0002*\n\b\u0001\u0010\u0005*\u0004\u0018\u00010\u0004*\b\b\u0002\u0010\u0007*\u00020\u00062\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tB\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0016R$\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0019\u0010\u0015R6\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "C", "", "S", "Ll20/c;", "I", "Lc20/r;", "Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponentProvider", "(Lk20/g;)Lk20/e;", "component", "", "linkComponent", "(Lhi/a;)V", "()Lhi/a;", "Lhi/a;", "getComponent", "setComponent", "Lk20/e;", "getWidgetComponentProvider", "()Lk20/e;", "setWidgetComponentProvider", "(Lk20/e;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class OverlayWidgetScreenViewItemMapper2<C extends InterfaceC6958a, S, I extends c> extends r<S, I> implements ViewMapper2<C, S, I> {
    private C component;
    private C7473e<C> widgetComponentProvider;

    @NotNull
    public final C component() {
        return (C) ViewMapper2.DefaultImpls.component(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    public final C getComponent() {
        return this.component;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    public final C7473e<C> getWidgetComponentProvider() {
        return this.widgetComponentProvider;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    public final void linkComponent(@NotNull InterfaceC6958a component) {
        Intrinsics.checkNotNullParameter(component, "component");
        ViewMapper2.DefaultImpls.linkComponent(this, component);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    public void onComponentInitialized(@NotNull C c11) {
        ViewMapper2.DefaultImpls.onComponentInitialized(this, c11);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    public final void setComponent(C c11) {
        this.component = c11;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    public final void setWidgetComponentProvider(C7473e<C> c7473e) {
        this.widgetComponentProvider = c7473e;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public final C7473e<C> widgetComponentProvider(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ViewMapper2.DefaultImpls.widgetComponentProvider(this, storage);
    }
}
