package com.vk.catalog.info.popup.api.di;

import com.vk.catalog.info.popup.api.di.a;
import com.vk.di.component.DiUnscopedComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.l7a;

/* compiled from: CatalogInfoPopupComponent.kt */
/* loaded from: classes16.dex */
public interface CatalogInfoPopupComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: CatalogInfoPopupComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final CatalogInfoPopupComponent STUB = new CatalogInfoPopupComponent() { // from class: com.vk.catalog.info.popup.api.di.CatalogInfoPopupComponent$Companion$STUB$1
            public final a a = a.C0445a.a.getSTUB();
            public final l7a b = l7a.a.a.getSTUB();

            @Override // com.vk.catalog.info.popup.api.di.CatalogInfoPopupComponent
            public final a M5() {
                return this.a;
            }

            @Override // com.vk.catalog.info.popup.api.di.CatalogInfoPopupComponent
            public final l7a vf() {
                return this.b;
            }
        };
        public static final a b = new a();

        /* compiled from: CatalogInfoPopupComponent.kt */
        public static final class a implements b7m<CatalogInfoPopupComponent> {
            @Override // xsna.b7m
            public final DiUnscopedComponent a(e7m e7mVar) {
                return Companion.a.getSTUB();
            }
        }

        public static a a() {
            return b;
        }

        public final CatalogInfoPopupComponent getSTUB() {
            return STUB;
        }
    }

    a M5();

    l7a vf();
}
