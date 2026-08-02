package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.data.CatalogTabsV2Config;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max.CatalogTabsV2ViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2OverlayViewMapper;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/di/CatalogTabsV2WidgetModule;", "", "<init>", "()V", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2Config;", "catalogTabsV2Config", "Ln20/i;", "catalogTabsV2Widget", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2Config;)Ln20/i;", "", "provideWidget", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2Config;)Ljava/util/Set;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CatalogTabsV2WidgetModule {
    private final i catalogTabsV2Widget(final CatalogTabsV2Config catalogTabsV2Config) {
        final long[] jArr = {2};
        final String str = "express";
        final String str2 = "catalogueTabs";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di.CatalogTabsV2WidgetModule$catalogTabsV2Widget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return catalogTabsV2Config;
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                CatalogTabsV2Component catalogTabsV2Component = (CatalogTabsV2Component) storage.getComponent(CatalogTabsV2Component.class);
                return new InterfaceC8046a[]{new CatalogTabsV2ViewMapper(catalogTabsV2Component), new CatalogTabsV2OverlayViewMapper(catalogTabsV2Component)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{CatalogTabsV2Component.Companion.create(storage)};
            }
        };
    }

    @NotNull
    public final Set<i> provideWidget(@NotNull CatalogTabsV2Config catalogTabsV2Config) {
        Intrinsics.checkNotNullParameter(catalogTabsV2Config, "catalogTabsV2Config");
        return e0.h(catalogTabsV2Widget(catalogTabsV2Config));
    }
}
