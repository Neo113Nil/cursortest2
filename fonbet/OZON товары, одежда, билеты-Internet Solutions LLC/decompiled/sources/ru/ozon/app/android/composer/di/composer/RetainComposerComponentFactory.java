package ru.ozon.app.android.composer.di.composer;

import K00.i;
import QZ.a;
import j10.InterfaceC7238a;
import j10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.C7854a;
import l20.c;
import m20.InterfaceC8046a;
import n20.k;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.WidgetTokenizedAnalytics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.references.ComposerReferencesFactory;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.composer.ui.widget.o;
import s10.InterfaceC9582a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/composer/di/composer/RetainComposerComponentFactory;", "", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;", "origin", "<init>", "(Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;)V", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "create", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Ls10/a;", "screen", "LQZ/a;", "Lru/ozon/composer/ui/widget/l;", "composer", "(Ls10/a;LQZ/a;)Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponent;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RetainComposerComponentFactory {

    @NotNull
    private final RetainComposerComponent origin;

    public RetainComposerComponentFactory(@NotNull RetainComposerComponent origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    @NotNull
    public final RetainComposerComponentApi create() {
        return new RetainComposerComponentApi() { // from class: ru.ozon.app.android.composer.di.composer.RetainComposerComponentFactory$create$1
            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public a<? extends C7854a> getComposer() {
                throw new IllegalStateException("dependency is not exists for this type of component parent");
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public InterfaceC7851b getComposerController() {
                throw new IllegalStateException("dependency is not exists for this type of component parent");
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public ComposerNavigator getComposerNavigator() {
                RetainComposerComponent retainComposerComponent;
                retainComposerComponent = RetainComposerComponentFactory.this.origin;
                return retainComposerComponent.getComposerNavigator();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public h.a<l> getComposerOverlayItemsHelper() {
                throw new IllegalStateException("dependency is not exists for this type of component parent");
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public ComposerReferencesFactory getComposerReferencesFactory() {
                RetainComposerComponent retainComposerComponent;
                retainComposerComponent = RetainComposerComponentFactory.this.origin;
                return retainComposerComponent.getComposerReferencesFactory();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public i<l> getComposerRepository() {
                RetainComposerComponent retainComposerComponent;
                RetainComposerComponent retainComposerComponent2;
                retainComposerComponent = RetainComposerComponentFactory.this.origin;
                k<InterfaceC8046a<?, ? extends c>> widgetStore = retainComposerComponent.getWidgetStore();
                retainComposerComponent2 = RetainComposerComponentFactory.this.origin;
                return K00.a.d(retainComposerComponent2.getNetwork(), widgetStore, new o(widgetStore));
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public InterfaceC7238a<l> getComposerStore() {
                throw new IllegalStateException("dependency is not exists for this type of component parent");
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public I00.a<l> getComposerUpdateMapper() {
                throw new IllegalStateException("dependency is not exists for this type of component parent");
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public ru.ozon.composer.ui.widget.a getComposerWidgetFactory() {
                throw new IllegalStateException("dependency is not exists for this type of component parent");
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public WZ.l getTokenizedAnalytics() {
                RetainComposerComponent retainComposerComponent;
                retainComposerComponent = RetainComposerComponentFactory.this.origin;
                return retainComposerComponent.getTokenizedAnalytics();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public f getViewedPond() {
                throw new IllegalStateException("dependency is not exists for this type of component parent");
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public WidgetTokenizedAnalytics getWidgetTokenizedAnalytics() {
                RetainComposerComponent retainComposerComponent;
                retainComposerComponent = RetainComposerComponentFactory.this.origin;
                return retainComposerComponent.getWidgetTokenizedAnalytics();
            }
        };
    }

    @NotNull
    public final RetainComposerComponentApi create(@NotNull final InterfaceC9582a screen, @NotNull final a<l> composer) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(composer, "composer");
        return new RetainComposerComponentApi() { // from class: ru.ozon.app.android.composer.di.composer.RetainComposerComponentFactory$create$2
            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public a<? extends C7854a> getComposer() {
                return composer;
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public InterfaceC7851b getComposerController() {
                return screen.getComposerController();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public ComposerNavigator getComposerNavigator() {
                RetainComposerComponent retainComposerComponent;
                retainComposerComponent = RetainComposerComponentFactory.this.origin;
                return retainComposerComponent.getComposerNavigator();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public h.a<l> getComposerOverlayItemsHelper() {
                return composer.q();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public ComposerReferencesFactory getComposerReferencesFactory() {
                RetainComposerComponent retainComposerComponent;
                retainComposerComponent = RetainComposerComponentFactory.this.origin;
                return retainComposerComponent.getComposerReferencesFactory();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public i<l> getComposerRepository() {
                RetainComposerComponent retainComposerComponent;
                RetainComposerComponent retainComposerComponent2;
                retainComposerComponent = RetainComposerComponentFactory.this.origin;
                k<InterfaceC8046a<?, ? extends c>> widgetStore = retainComposerComponent.getWidgetStore();
                retainComposerComponent2 = RetainComposerComponentFactory.this.origin;
                return K00.a.d(retainComposerComponent2.getNetwork(), widgetStore, new o(widgetStore));
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public InterfaceC7238a<l> getComposerStore() {
                return composer.r();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public I00.a<l> getComposerUpdateMapper() {
                return composer.s();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public ru.ozon.composer.ui.widget.a getComposerWidgetFactory() {
                return screen.g();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public WZ.l getTokenizedAnalytics() {
                RetainComposerComponent retainComposerComponent;
                retainComposerComponent = RetainComposerComponentFactory.this.origin;
                return retainComposerComponent.getTokenizedAnalytics();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public f getViewedPond() {
                return screen.getViewedPond();
            }

            @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi
            public WidgetTokenizedAnalytics getWidgetTokenizedAnalytics() {
                RetainComposerComponent retainComposerComponent;
                retainComposerComponent = RetainComposerComponentFactory.this.origin;
                return retainComposerComponent.getWidgetTokenizedAnalytics();
            }
        };
    }
}
