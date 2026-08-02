package com.vk.catalog.mvi.legacy.api;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;

/* compiled from: CatalogLegacyComponent.kt */
/* loaded from: classes.dex */
public interface CatalogLegacyComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: CatalogLegacyComponent.kt */
    /* loaded from: classes16.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final CatalogLegacyComponent getSTUB() {
            return new CatalogLegacyComponent() { // from class: com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent$Companion$STUB$1
                @Override // com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent
                public final a qf() {
                    return a.a.getSTUB();
                }
            };
        }
    }

    a qf();
}
