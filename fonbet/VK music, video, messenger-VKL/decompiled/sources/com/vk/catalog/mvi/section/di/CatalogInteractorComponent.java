package com.vk.catalog.mvi.section.di;

import com.vk.di.component.DiScopedComponent;
import xsna.m7a;
import xsna.pwj0;

/* compiled from: CatalogInteractorComponent.kt */
/* loaded from: classes.dex */
public interface CatalogInteractorComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: CatalogInteractorComponent.kt */
    /* loaded from: classes16.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final CatalogInteractorComponent getSTUB() {
            return new CatalogInteractorComponent() { // from class: com.vk.catalog.mvi.section.di.CatalogInteractorComponent$Companion$STUB$1
                @Override // com.vk.catalog.mvi.section.di.CatalogInteractorComponent
                public final m7a z0() {
                    return m7a.a.a.getSTUB();
                }
            };
        }
    }

    m7a z0();
}
