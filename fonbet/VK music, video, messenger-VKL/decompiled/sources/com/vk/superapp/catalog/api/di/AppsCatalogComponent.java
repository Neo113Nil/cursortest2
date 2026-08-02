package com.vk.superapp.catalog.api.di;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.superapp.miniapps.impl.AppsCatalogCategoriesFragment;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.superapp.miniapps.impl.AppsCatalogSectionDetailsFragment;
import xsna.a9r0;
import xsna.f8r0;
import xsna.l8r0;

/* compiled from: AppsCatalogComponent.kt */
/* loaded from: classes11.dex */
public interface AppsCatalogComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: AppsCatalogComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AppsCatalogComponent$Companion$STUB$1 STUB = new AppsCatalogComponent() { // from class: com.vk.superapp.catalog.api.di.AppsCatalogComponent$Companion$STUB$1
            @Override // com.vk.superapp.catalog.api.di.AppsCatalogComponent
            public final f8r0 U9(AppsCatalogCategoriesFragment appsCatalogCategoriesFragment) {
                return null;
            }

            @Override // com.vk.superapp.catalog.api.di.AppsCatalogComponent
            public final a9r0 c3(AppsCatalogSectionDetailsFragment appsCatalogSectionDetailsFragment) {
                return null;
            }

            @Override // com.vk.superapp.catalog.api.di.AppsCatalogComponent
            public final l8r0 qa(AppsCatalogFragment appsCatalogFragment) {
                return null;
            }

            @Override // com.vk.superapp.catalog.api.di.AppsCatalogComponent
            public final void We() {
            }

            @Override // com.vk.superapp.catalog.api.di.AppsCatalogComponent
            public final void r5(Context context) {
            }
        };
    }

    f8r0 U9(AppsCatalogCategoriesFragment appsCatalogCategoriesFragment);

    void We();

    a9r0 c3(AppsCatalogSectionDetailsFragment appsCatalogSectionDetailsFragment);

    l8r0 qa(AppsCatalogFragment appsCatalogFragment);

    void r5(Context context);
}
