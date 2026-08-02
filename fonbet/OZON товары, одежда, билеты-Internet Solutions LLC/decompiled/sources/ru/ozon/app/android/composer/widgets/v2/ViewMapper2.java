package ru.ozon.app.android.composer.widgets.v2;

import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\bf\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u0002*\n\b\u0001\u0010\u0005*\u0004\u0018\u00010\u0004*\b\b\u0002\u0010\u0007*\u00020\u00062\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bJ'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000bj\b\u0012\u0004\u0012\u00028\u0000`\f2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000bj\b\u0012\u0004\u0012\u00028\u0000`\f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u001e\u0010\u0010\u001a\u0004\u0018\u00018\u00008&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0013R0\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "C", "", "S", "Ll20/c;", "I", "Lm20/a;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "widgetComponentProvider", "component", "", "linkComponent", "(Lhi/a;)V", "onComponentInitialized", "getComponent", "()Lhi/a;", "setComponent", "getWidgetComponentProvider", "()Lk20/e;", "setWidgetComponentProvider", "(Lk20/e;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ViewMapper2<C extends InterfaceC6958a, S, I extends c> extends InterfaceC8046a<S, I> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static <C extends InterfaceC6958a, S, I extends c> C component(@NotNull ViewMapper2<C, S, I> viewMapper2) {
            C component = viewMapper2.getComponent();
            if (component != null) {
                return component;
            }
            throw new IllegalStateException("Component must not be null");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <C extends InterfaceC6958a, S, I extends c> void linkComponent(@NotNull ViewMapper2<C, S, I> viewMapper2, @NotNull InterfaceC6958a component) {
            Intrinsics.checkNotNullParameter(component, "component");
            boolean d11 = Intrinsics.d(viewMapper2.getComponent(), component);
            viewMapper2.setComponent(component);
            if (d11) {
                return;
            }
            viewMapper2.onComponentInitialized(component);
        }

        public static <C extends InterfaceC6958a, S, I extends c> void onComponentInitialized(@NotNull ViewMapper2<C, S, I> viewMapper2, @NotNull C component) {
            Intrinsics.checkNotNullParameter(component, "component");
        }

        @NotNull
        public static <C extends InterfaceC6958a, S, I extends c> C7473e<C> widgetComponentProvider(@NotNull ViewMapper2<C, S, I> viewMapper2, @NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            C7473e<C> widgetComponentProvider = viewMapper2.getWidgetComponentProvider();
            if (widgetComponentProvider != null) {
                return widgetComponentProvider;
            }
            C7473e<C> widgetComponent = viewMapper2.widgetComponent(storage);
            viewMapper2.setWidgetComponentProvider(widgetComponent);
            return widgetComponent;
        }
    }

    C getComponent();

    C7473e<C> getWidgetComponentProvider();

    void linkComponent(@NotNull InterfaceC6958a component);

    void onComponentInitialized(@NotNull C component);

    void setComponent(C c11);

    void setWidgetComponentProvider(C7473e<C> c7473e);

    @NotNull
    C7473e<C> widgetComponent(@NotNull C7475g storage);

    @NotNull
    C7473e<C> widgetComponentProvider(@NotNull C7475g storage);
}
