package ru.ozon.app.android.composer.di.modules;

import Tc.j;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.internal.loading.LoadingViewMapper;
import ru.ozon.app.android.composer.widgets.internal.loading.di.LoadingComponent;
import ru.ozon.app.android.composer.widgets.internal.pageBottomError.PageBottomErrorViewMapper;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/di/modules/DefaultWidgetsModule;", "", "<init>", "()V", "Lru/ozon/app/android/utils/AppType;", "appType", "", "Ln20/i;", "defaultWidgets$composer_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/utils/AppType;)Ljava/util/Set;", "defaultWidgets", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultWidgetsModule {
    @NotNull
    public final Set<i> defaultWidgets$composer_prodGoogleAllVendorsRelease(@NotNull final AppType appType) {
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        Intrinsics.checkNotNullParameter(appType, "appType");
        j builder = new j();
        iVar = DefaultWidgetsModuleKt.loadingWidget;
        final String vertical = iVar.getVertical();
        iVar2 = DefaultWidgetsModuleKt.loadingWidget;
        final String component = iVar2.getComponent();
        final long[] b11 = n20.j.b();
        builder.add(new i(vertical, component, b11) { // from class: ru.ozon.app.android.composer.di.modules.DefaultWidgetsModule$defaultWidgets$lambda$5$$inlined$WidgetFactory$default$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                i iVar5;
                Intrinsics.checkNotNullParameter(storage, "storage");
                iVar5 = DefaultWidgetsModuleKt.loadingWidget;
                return iVar5.config(storage);
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new LoadingViewMapper[]{new LoadingViewMapper((LoadingComponent) storage.getComponent(LoadingComponent.class), appType)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{LoadingComponent.Companion.invoke(storage)};
            }
        });
        if (appType == AppType.SELECT) {
            iVar3 = DefaultWidgetsModuleKt.pageBottomErrorWidget;
            final String vertical2 = iVar3.getVertical();
            iVar4 = DefaultWidgetsModuleKt.pageBottomErrorWidget;
            final String component2 = iVar4.getComponent();
            final long[] b12 = n20.j.b();
            builder.add(new i(vertical2, component2, b12) { // from class: ru.ozon.app.android.composer.di.modules.DefaultWidgetsModule$defaultWidgets$lambda$5$$inlined$WidgetFactory$default$2
                @Override // n20.i
                public InterfaceC7243a<? extends Object> config(C7475g storage) {
                    i iVar5;
                    Intrinsics.checkNotNullParameter(storage, "storage");
                    iVar5 = DefaultWidgetsModuleKt.pageBottomErrorWidget;
                    return iVar5.config(storage);
                }

                @Override // n20.i
                public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                    Intrinsics.checkNotNullParameter(storage, "storage");
                    return new PageBottomErrorViewMapper[]{new PageBottomErrorViewMapper()};
                }

                @Override // n20.i
                public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                    Intrinsics.checkNotNullParameter(storage, "storage");
                    return n20.j.a();
                }
            });
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }
}
