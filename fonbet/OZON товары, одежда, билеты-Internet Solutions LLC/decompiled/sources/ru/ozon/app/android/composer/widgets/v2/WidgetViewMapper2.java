package ru.ozon.app.android.composer.widgets.v2;

import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b'\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u0002*\b\b\u0001\u0010\u0005*\u00020\u0004*\f\b\u0002\u0010\b*\u00060\u0006j\u0002`\u00072\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t2\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0010j\b\u0012\u0004\u0012\u00028\u0000`\u00112\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0018R$\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u0017R6\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "C", "", "State", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "VO", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponentProvider", "(Lk20/g;)Lk20/e;", "component", "", "linkComponent", "(Lhi/a;)V", "()Lhi/a;", "Lhi/a;", "getComponent", "setComponent", "Lk20/e;", "getWidgetComponentProvider", "()Lk20/e;", "setWidgetComponentProvider", "(Lk20/e;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class WidgetViewMapper2<C extends InterfaceC6958a, State, VO extends c> extends WidgetViewMapper<State, VO> implements ViewMapper2<C, State, VO> {
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
