package ru.ozon.app.android.storefront.widgets.navbarv2.di;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.storefront.widgets.navbarv2.core.ShellNavBarConfig;
import ru.ozon.app.android.storefront.widgets.navbarv2.core.ShellNavBarViewMapper;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/di/ShellNavBarDiModule;", "", "<init>", "()V", "Ln20/i;", "provideShellNavbar$storefront_prodGoogleAllVendorsRelease", "()Ln20/i;", "provideShellNavbar", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarDiModule {

    @NotNull
    public static final ShellNavBarDiModule INSTANCE = new ShellNavBarDiModule();

    private ShellNavBarDiModule() {
    }

    @NotNull
    public final i provideShellNavbar$storefront_prodGoogleAllVendorsRelease() {
        final long[] b11 = j.b();
        final String str = "shell";
        final String str2 = "navBar";
        return new i(str, str2, b11) { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.di.ShellNavBarDiModule$provideShellNavbar$$inlined$WidgetFactory$default$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ShellNavBarConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ShellNavBarViewMapper[]{new ShellNavBarViewMapper((ShellNavBarComponent) storage.getComponent(ShellNavBarComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{ShellNavBarComponent.INSTANCE.create(storage)};
            }
        };
    }
}
