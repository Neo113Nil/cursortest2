package com.vk.superapp.catalog.impl.di;

import android.content.Context;
import android.content.Intent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.superapp.catalog.api.di.AppsCatalogComponent;
import com.vk.superapp.catalog.impl.v1.SuperappCatalogActivity;
import com.vk.superapp.miniapps.impl.AppsCatalogCategoriesFragment;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.superapp.miniapps.impl.AppsCatalogSectionDetailsFragment;
import xsna.a9r0;
import xsna.b7m;
import xsna.b9r0;
import xsna.e7m;
import xsna.f8r0;
import xsna.g8r0;
import xsna.l8r0;
import xsna.p8r0;
import xsna.v2a;
import xsna.wmi0;

/* compiled from: AppsCatalogComponentImpl.kt */
/* loaded from: classes6.dex */
public final class AppsCatalogComponentImpl implements AppsCatalogComponent {

    /* compiled from: AppsCatalogComponentImpl.kt */
    public static final class a implements b7m<AppsCatalogComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new AppsCatalogComponentImpl();
        }
    }

    @Override // com.vk.superapp.catalog.api.di.AppsCatalogComponent
    public final f8r0 U9(AppsCatalogCategoriesFragment appsCatalogCategoriesFragment) {
        return new g8r0(appsCatalogCategoriesFragment);
    }

    @Override // com.vk.superapp.catalog.api.di.AppsCatalogComponent
    public final void We() {
        v2a.a.getClass();
        wmi0.a.c("key_mini_apps_catalog_first_page_cache_serialization");
        v2a.b = null;
    }

    @Override // com.vk.superapp.catalog.api.di.AppsCatalogComponent
    public final a9r0 c3(AppsCatalogSectionDetailsFragment appsCatalogSectionDetailsFragment) {
        return new b9r0(appsCatalogSectionDetailsFragment);
    }

    @Override // com.vk.superapp.catalog.api.di.AppsCatalogComponent
    public final l8r0 qa(AppsCatalogFragment appsCatalogFragment) {
        return new p8r0(appsCatalogFragment);
    }

    @Override // com.vk.superapp.catalog.api.di.AppsCatalogComponent
    public final void r5(Context context) {
        int i = SuperappCatalogActivity.f;
        Intent intent = new Intent(context, (Class<?>) SuperappCatalogActivity.class);
        intent.putExtra("sectionId", (String) null);
        context.startActivity(intent);
    }
}
